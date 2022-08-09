package com.kazim.datajpa.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.kazim.datajpa.dto.UserDto;

public interface IUserService {

	UserDto save(UserDto user);

	void delete(Long id);

	List<UserDto> getAll();

	Page<UserDto> getAll(Pageable pageable);
}
