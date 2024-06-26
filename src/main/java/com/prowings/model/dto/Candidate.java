package com.prowings.model.dto;

import java.util.List;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Candidate {

	private int id;
	private String completeName;
	private AddressDTO[] corruspondance;

}
