package com.example.api_servicos.service;

import com.example.api_servicos.model.Servico;
import com.example.api_servicos.repository.ServicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServicoService {

    @Autowired
    private ServicoRepository servicoRepository;

    public Servico salvar(Servico servico) {
        return servicoRepository.save(servico);
    }

    public List<Servico> listarTodos() {
        return servicoRepository.findAll();
    }

    public Optional<Servico> buscarPorId(String id) {
        return servicoRepository.findById(id);
    }

    public void deletar(String id) {
        servicoRepository.deleteById(id);
    }

    public Servico atualizar(String id, Servico servicoAtualizado) {
        Optional<Servico> existente = servicoRepository.findById(id);
        if (existente.isPresent()) {
            Servico servico = existente.get();
            servico.setTipo(servicoAtualizado.getTipo());
            servico.setData(servicoAtualizado.getData());
            servico.setValor(servicoAtualizado.getValor());
            servico.setStatus(servicoAtualizado.getStatus());
            servico.setIdAnimal(servicoAtualizado.getIdAnimal());
            return servicoRepository.save(servico);
        } else {
            throw new RuntimeException("Serviço não encontrado com id: " + id);
        }
    }

    public List<Servico> buscarPorAnimal(String idAnimal) {
        return servicoRepository.findByIdAnimal(idAnimal);
    }
}