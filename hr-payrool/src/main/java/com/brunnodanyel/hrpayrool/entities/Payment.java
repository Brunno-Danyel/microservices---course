package com.brunnodanyel.hrpayrool.entities;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Payment implements Serializable {
	private static final long serialVersionUID = 1L;

	private String name;
	private Double dailyIncome;
	private Integer days;

	public double getTotal() {
		return days * dailyIncome;
	}

}
