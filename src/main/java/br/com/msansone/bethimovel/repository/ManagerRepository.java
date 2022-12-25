package br.com.msansone.bethimovel.repository;

import br.com.msansone.bethimovel.model.Manager;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ManagerRepository extends JpaRepository<Manager, Long> {
}
