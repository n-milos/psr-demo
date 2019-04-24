package psr.test.PSRDemo;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import psr.test.PSRDemo.model.Post;
import psr.test.PSRDemo.repository.PostRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRepositoryTest {

	@Autowired
	private PostRepository repository;

	@Test
	public void simpleTest() {

		List<Post> posts = repository.findAll();
		assertTrue(posts.size() > 0);

	}

}
