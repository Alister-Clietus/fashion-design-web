package com.fashionapp.fashionService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.fashionapp.fashionService.dto.ClientDto;
import com.fashionapp.fashionService.repository.ClientRepo;
import com.fashionapp.fashionService.service.ClientServiceImp;

public class FashionController 
{
	@Autowired
	ClientRepo clientrepo;
	
	@Autowired
	ClientServiceImp clientservice;
	
	@PostMapping("/addclientdetails")
	ResponseEntity<?> addClientDetails(@RequestBody ClientDto clientdto)
	{
		return new ResponseEntity<>(clientservice.addClientDetails(clientdto),HttpStatus.OK);
	}
	
	@PostMapping("/showclientdetails")
	ResponseEntity<?> showAllClientDetails(@RequestBody ClientDto clientdto)
	{
		return new ResponseEntity<>(clientservice.getAllClientDetails(clientdto),HttpStatus.OK);
	}
	
	@PostMapping("/getclientdetails")
	ResponseEntity<?> showClientDetails(@RequestBody ClientDto clientdto)
	{
		return new ResponseEntity<>(clientservice.getClientDetails(clientdto),HttpStatus.OK);
	}
	
	@DeleteMapping("/deleteclientdetails")
	ResponseEntity<?> deleteClientDetails(@RequestBody ClientDto clientdto)
	{
		return new ResponseEntity<>(clientservice.deleteClientDetails(clientdto),HttpStatus.OK);
	}
	
	@PutMapping("/editclientdetails")
	ResponseEntity<?> updateClientDetails(@RequestBody ClientDto clientdto)
	{
		return new ResponseEntity<>(clientservice.updateClientDetails(clientdto),HttpStatus.OK);
	}

}
