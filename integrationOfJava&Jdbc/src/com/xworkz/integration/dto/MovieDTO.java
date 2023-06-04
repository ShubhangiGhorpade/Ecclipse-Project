package com.xworkz.integration.dto;

import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class MovieDTO implements Serializable {

	private String movieName;
	private String heroName;
	private String heroinName;

}
