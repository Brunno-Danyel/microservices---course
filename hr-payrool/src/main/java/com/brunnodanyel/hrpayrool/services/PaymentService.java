package com.brunnodanyel.hrpayrool.services;

import org.springframework.stereotype.Service;

import com.brunnodanyel.hrpayrool.entities.Payment;

@Service
public class PaymentService {

	public Payment getPayment(long workerId, int days) {

		return new Payment("Bob", 200.0, days);

	}

}
