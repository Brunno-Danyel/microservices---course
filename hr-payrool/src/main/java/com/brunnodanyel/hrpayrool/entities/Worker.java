package com.brunnodanyel.hrpayrool.entities;

import java.io.Serializable;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(of = { "id" })
public class Worker implements Serializable {
	private static final long serialVersionUID = 1L;

	
	private Long id;
	private String name;
	private Double dailyIncome;

}
