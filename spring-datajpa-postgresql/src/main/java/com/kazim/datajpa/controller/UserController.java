package com.kazim.datajpa.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kazim.datajpa.dto.UserDto;
import com.kazim.datajpa.service.UserService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

	
	private final UserService userService;
	
	@PostMapping
	public ResponseEntity<UserDto> kaydet(UserDto userDto){
		return ResponseEntity.ok(userService.save(userDto));
	}
	
	@GetMapping
	public ResponseEntity<List<UserDto>> liste(){
		return ResponseEntity.ok(userService.getAll());
	}
}
