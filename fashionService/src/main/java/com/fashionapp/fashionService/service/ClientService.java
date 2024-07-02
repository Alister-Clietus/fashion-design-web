package com.fashionapp.fashionService.service;

import org.json.simple.JSONObject;
import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

import com.fashionapp.fashionService.dto.ClientDto;

public interface ClientService 
{
	ResponseEntity<?> addClientDetails(ClientDto clientdto);
	ResponseEntity<?> updateClientDetails(ClientDto clientdto);
	ResponseEntity<?> deleteClientDetails(ClientDto clientdto);
	JSONObject getAllClientDetails();
	JSONObject getClientDetails(ClientDto clientdto);
	ResponseEntity<?> uploadImage(MultipartFile file,String email);

}
