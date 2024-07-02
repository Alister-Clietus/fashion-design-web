package com.fashionapp.fashionService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.fashionapp.fashionService.dto.ClientDto;
import com.fashionapp.fashionService.repository.ClientRepo;
import com.fashionapp.fashionService.service.ClientServiceImp;

@RestController
@RequestMapping("/api")
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
	
	@GetMapping("/showclientdetails")
	ResponseEntity<?> showAllClientDetails()
	{
		System.out.println("Hello");
		return new ResponseEntity<>(clientservice.getAllClientDetails(),HttpStatus.OK);
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
	@PostMapping("/upload/{email}")
	ResponseEntity<?> uploadImages(@RequestPart("file") MultipartFile file,@PathVariable("email") String email)
	{
		if(file!=null)
		{
			return new ResponseEntity<>(clientservice.uploadImage(file, email),HttpStatus.OK);
		}
		else
		{
			return new ResponseEntity<>("ERROR",HttpStatus.OK);

		}
		
	}

}
