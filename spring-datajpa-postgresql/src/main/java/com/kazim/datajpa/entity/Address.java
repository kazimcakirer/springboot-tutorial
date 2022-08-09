package com.kazim.datajpa.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="user_address")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of= {"id"})
@ToString
public class Address {

	@jakarta.persistence.Id
	@SequenceGenerator(name="seq_user_address", allocationSize = 1)
	@GeneratedValue(generator="seq_user_address", strategy = GenerationType.SEQUENCE)
	private Long id;
	private String address;
	@Enumerated
	AddressType addressType;
	Boolean isActive;
	
	@ManyToOne
	@JoinColumn(name="user_addres_id")
	private User user;
	
	enum AddressType{
		HOME,
		BUSINESS,
		OTHER
	}
}
