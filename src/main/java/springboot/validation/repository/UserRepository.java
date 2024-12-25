package springboot.validation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import springboot.validation.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
