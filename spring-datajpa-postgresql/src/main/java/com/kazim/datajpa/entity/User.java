package com.kazim.datajpa.entity;

import java.util.List;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="userA")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of= {"id"})
@ToString
public class User {

	@Id
	@SequenceGenerator(name = "seq_user", allocationSize = 1)
	@GeneratedValue(generator = "seq_user", strategy = GenerationType.SEQUENCE)
	private Long id;
	
	@Column(length=100, name="first_name")
	private String firstName;
	
	@Column(length=100, name="last_name")
	private String lastName;
	
	@OneToMany
	@JoinColumn(name="us_ad_id")
	private List<Address> address;

}
