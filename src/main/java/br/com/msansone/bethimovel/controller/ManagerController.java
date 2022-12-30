package br.com.msansone.bethimovel.controller;

import br.com.msansone.bethimovel.model.Manager;
import br.com.msansone.bethimovel.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/manager")
public class ManagerController {

    @Autowired
    ManagerService managerService;

    @GetMapping("/{id}")
    public ResponseEntity<Manager> getById(@PathVariable Long id) {
        Manager manager = managerService.getById(id).orElse(null);
        if (manager != null) {
            return ResponseEntity.ok(manager);
        } else {
            return ResponseEntity.noContent().build();
        }

    }

    @GetMapping
    public ResponseEntity<List<Manager>> getAll() {
        return ResponseEntity.ok(managerService.getAll());
    }

    @PostMapping
    public ResponseEntity<Manager> insert(@RequestBody Manager manager) {
        return ResponseEntity.ok(managerService.insert(manager));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Manager> update(@PathVariable Long id, @RequestBody Manager manager) {

        Manager current = managerService.update(id, manager);

        if (current != null) {
            return ResponseEntity.ok(current);
        } else {
            return ResponseEntity.noContent().build();
        }

    }

}
