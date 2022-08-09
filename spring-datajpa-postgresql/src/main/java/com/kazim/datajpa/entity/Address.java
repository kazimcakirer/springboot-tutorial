package com.kazim.datajpa.entity;

import javax.persistence.*;

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

	@Id
	@SequenceGenerator(name="seq_user_address", allocationSize = 1)
	@GeneratedValue(generator="seq_user_address", strategy = GenerationType.SEQUENCE)
	private Long id;
	private String address;
	@Enumerated
	AddressType addressType;
	Boolean isActive;
	
	@ManyToOne
	@JoinColumn(name="us_ad_id")
	private User user;
	
	public enum AddressType{
		HOME,
		BUSINESS,
		OTHER
	}
}
