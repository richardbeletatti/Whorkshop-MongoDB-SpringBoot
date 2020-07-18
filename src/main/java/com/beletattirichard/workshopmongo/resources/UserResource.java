package com.beletattirichard.workshopmongo.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.beletattirichard.workshopmongo.domain.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<User>> findAll() {
		User richard = new User(1, "Richard Beletatti", "richard.beletatti@gmail.com");
		User bruno = new User(2, "Bruno Beletatti", "bruno.beletatti@gmail.com");

		List<User> list = new ArrayList<>();

		list.addAll(Arrays.asList(richard, bruno));

		return ResponseEntity.ok().body(list);
	}
}
