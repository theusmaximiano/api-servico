package com.example.api_servicos.controller;

import com.example.api_servicos.model.Servico;
import com.example.api_servicos.service.ServicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/servicos")
@CrossOrigin(origins = "*")
public class ServicoController {

    @Autowired
    private ServicoService servicoService;

    @PostMapping
    public Servico cadastrar(@RequestBody Servico servico) {
        return servicoService.salvar(servico);
    }

    @GetMapping
    public List<Servico> listarTodos() {
        return servicoService.listarTodos();
    }

    @GetMapping("/{id}")
    public Optional<Servico> buscarPorId(@PathVariable String id) {
        return servicoService.buscarPorId(id);
    }

    @PutMapping("/{id}")
    public Servico atualizar(@PathVariable String id, @RequestBody Servico servico) {
        return servicoService.atualizar(id, servico);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable String id) {
        servicoService.deletar(id);
    }

    @GetMapping("/animal/{idAnimal}")
    public List<Servico> buscarPorAnimal(@PathVariable String idAnimal) {
        return servicoService.buscarPorAnimal(idAnimal);
    }
}
