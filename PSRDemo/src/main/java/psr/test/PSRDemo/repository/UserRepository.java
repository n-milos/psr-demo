package psr.test.PSRDemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import psr.test.PSRDemo.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
