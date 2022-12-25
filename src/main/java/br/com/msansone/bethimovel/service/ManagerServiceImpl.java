package br.com.msansone.bethimovel.service;

import br.com.msansone.bethimovel.model.Manager;
import br.com.msansone.bethimovel.repository.ManagerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ManagerServiceImpl implements ManagerService{

    @Autowired
    ManagerRepository repository;

    @Override
    public List<Manager> getAll() {
        return repository.findAll();
    }

    @Override
    public Manager insert(Manager manager) {
        return repository.save(manager);
    }

    @Override
    public Optional<Manager> getById(Long id) {
        return repository.findById(id);
    }

    @Override
    public Manager update(Long id, Manager manager) {
        Optional<Manager> current = repository.findById(id);
        if (current.isPresent()){
            Manager theCurrrent = current.get();
            theCurrrent.setEmail(manager.getEmail());
            theCurrrent.setName(manager.getName());
            theCurrrent.setFone(manager.getFone());
            theCurrrent.setPassword(manager.getPassword());
            repository.save(theCurrrent);
            return current.get();
        } else {
            return null;
        }
    }
}
