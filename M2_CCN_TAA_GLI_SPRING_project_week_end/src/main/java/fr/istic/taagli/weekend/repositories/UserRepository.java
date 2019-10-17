package fr.istic.taagli.weekend.repositories;

import fr.istic.taagli.weekend.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;



public interface UserRepository extends JpaRepository<User, Integer> {
}
