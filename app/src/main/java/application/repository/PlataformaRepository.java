package application.repository;

import application.model.Plataforma;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PlataformaRepository extends JpaRepository<Plataforma, Long> {
}