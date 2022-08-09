package com.brunnodanyel.hrpayrool.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.brunnodanyel.hrpayrool.entities.Payment;
import com.brunnodanyel.hrpayrool.services.PaymentService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping(value = "/payments")
public class PaymentResource {

	private PaymentService service;

	@GetMapping(value = "/{workerId}/days/{days}")
	public ResponseEntity<Payment> getPayment(@PathVariable Long workerId, @PathVariable Integer days) {
		Payment payment = service.getPayment(workerId, days);
		return ResponseEntity.ok(payment);
	}

}
