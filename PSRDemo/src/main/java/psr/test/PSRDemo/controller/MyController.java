package psr.test.PSRDemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import psr.test.PSRDemo.model.Post;
import psr.test.PSRDemo.repository.PostRepository;

@RestController
@CrossOrigin("*")
@RequestMapping("/rest")
public class MyController {

	@Autowired
	private PostRepository postRepo;

	@GetMapping(value = "/post/all")
	public List<Post> getUplate() {
		return postRepo.findAll();
	}

}
