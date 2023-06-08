package com.xworkz.jpaDemo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Data
@AllArgsConstructor
@Table(name = "jpatable")
public class WebSeries {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String hero;
	private String heroin;

}
