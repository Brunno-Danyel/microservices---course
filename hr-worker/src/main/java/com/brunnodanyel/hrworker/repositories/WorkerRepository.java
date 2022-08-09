package com.brunnodanyel.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brunnodanyel.hrworker.entities.Worker;


public interface WorkerRepository extends JpaRepository<Worker, Long> {
	
}
