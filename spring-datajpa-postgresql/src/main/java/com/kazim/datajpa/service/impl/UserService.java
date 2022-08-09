package com.kazim.datajpa.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.kazim.datajpa.dto.UserDto;
import com.kazim.datajpa.entity.Address;
import com.kazim.datajpa.entity.User;
import com.kazim.datajpa.repo.AddressRepository;
import com.kazim.datajpa.repo.UserRepository;
import com.kazim.datajpa.service.IUserService;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService implements IUserService {

	private final UserRepository userRepository;
	private final AddressRepository addressRepository;

	@Override
	@Transactional
	public UserDto save(UserDto userDto) {

		User user = new User();
		user.setFirstName(userDto.getFirstName());
		user.setLastName(userDto.getLastName());
		final User userdb = userRepository.save(user);

		List<Address> list = new ArrayList<>();

		userDto.getAddress().forEach(item -> {
			Address addres = new Address();
			addres.setAddress(item);
			addres.setAddressType(Address.AddressType.OTHER);
			addres.setIsActive(true);
			list.add(address);
		});
		addressRepository.saveAll(list);
		userDto.setId(userdb.getId());

		return userDto;
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<UserDto> getAll() {
		List<User> users = userRepository.findAll();
		List<UserDto> usersDto = new ArrayList<>();
		
		users.forEach(it-> {
			UserDto user = new UserDto();
			user.setId(it.getId());
			user.setFirstName(it.getFirstName());
			user.setLastName(it.getLastName());
			user.setAddress(
					it.getAddress != null ? 
							it.getAddress().steam().map(Address::getAddress).collect(Collecters.toList()
					);
					usersDto.add(user);
		});
		return usersDto;
	}

	@Override
	public Page<UserDto> getAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

}
