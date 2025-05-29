package com.example.api_servicos.repository;

import com.example.api_servicos.model.Servico;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

public interface ServicoRepository extends MongoRepository<Servico, String> {
    List<Servico> findByIdAnimal(String idAnimal);
}
