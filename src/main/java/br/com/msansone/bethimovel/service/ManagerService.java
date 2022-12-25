package br.com.msansone.bethimovel.service;


import br.com.msansone.bethimovel.model.Manager;

import java.util.List;
import java.util.Optional;

public interface ManagerService {
    List<Manager> getAll();

    Manager insert(Manager manager);

    Optional<Manager> getById(Long id);

    Manager update(Long id, Manager manager);
}
