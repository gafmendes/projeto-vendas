package com.vendas.dsvendas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vendas.dsvendas.dto.SaleDTO;
import com.vendas.dsvendas.dto.SaleSucessDTO;
import com.vendas.dsvendas.dto.SaleSumDTO;
import com.vendas.dsvendas.service.SaleService;

@RestController
@RequestMapping(value = "/sales")
public class SaleControler {

	@Autowired
	private SaleService service;
	
	@GetMapping
	public ResponseEntity<Page<SaleDTO>> findAll(Pageable pageable){
		Page<SaleDTO> list = service.findAll(pageable);
		return ResponseEntity.ok(list);
	}
	
	@GetMapping(value ="/amount-by-seller")
	public ResponseEntity<List<SaleSumDTO>> amountGroupBySeller(){
		List<SaleSumDTO> list = service.amountGroupBySeller();
		return ResponseEntity.ok(list);
	}
	
	@GetMapping(value ="/sucess-by-seller")
	public ResponseEntity<List<SaleSucessDTO>> sucessGroupBySeller(){
		List<SaleSucessDTO> list = service.sucessGroupBySeller();
		return ResponseEntity.ok(list);
	}
}
