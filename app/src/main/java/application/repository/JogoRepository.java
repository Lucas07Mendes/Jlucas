package application.repository;

import application.model.Jogo;
import org.springframework.data.jpa.repository.JpaRepository;


public interface JogoRepository extends JpaRepository<Jogo, Long> {
}