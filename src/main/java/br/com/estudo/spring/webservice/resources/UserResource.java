package br.com.estudo.spring.webservice.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.estudo.spring.webservice.entities.User;

@RestController
@RequestMapping("/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findAll() {
		
		User u = new User(1L,"Rui Meirelles","rui@gmail.com","21 99876-3452","1234");
		
		return ResponseEntity.ok().body(u);
	}
}
