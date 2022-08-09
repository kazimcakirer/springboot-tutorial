package com.kazim.datajpa.dto;

import java.util.List;

import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode(of= {"id"})
public class UserDto {

	private Long id;
	@NotNull
	private String firstName;
	private String lastName;
	private List<String> address;
}
