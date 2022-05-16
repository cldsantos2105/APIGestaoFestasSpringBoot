package com.clsantos.festa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.clsantos.festa.model.Convidado;

public interface Convidados extends JpaRepository<Convidado, Long> {
	
}
