package com.kazim.datajpa.service.impl;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.kazim.datajpa.dto.UserDto;
import com.kazim.datajpa.entity.User;
import com.kazim.datajpa.repo.AddressRepository;
import com.kazim.datajpa.repo.UserRepository;
import com.kazim.datajpa.service.IUserService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService  implements IUserService{

	private final UserRepository userRepository;
	private final AddressRepository addressRepository;
	
	@Override
	public UserDto save(UserDto user) {
		User user = new User();
		user.setFirstName()
		
		return null;
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public UserDto getAll(UserDto user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<UserDto> getAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

}
