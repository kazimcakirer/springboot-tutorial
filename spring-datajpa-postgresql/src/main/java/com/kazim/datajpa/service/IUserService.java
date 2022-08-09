package com.kazim.datajpa.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.kazim.datajpa.dto.UserDto;

public interface IUserService {

	UserDto save(UserDto user);

	void delete(Long id);

	UserDto getAll(UserDto user);

	Page<UserDto> getAll(Pageable pageable);
}
