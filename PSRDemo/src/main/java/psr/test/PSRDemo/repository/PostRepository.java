package psr.test.PSRDemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import psr.test.PSRDemo.model.Post;

public interface PostRepository extends JpaRepository<Post, Long> {

}
