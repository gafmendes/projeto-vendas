package com.vendas.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vendas.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long>{

	
}
