package com.fashionapp.fashionService.service;

import org.json.simple.JSONObject;
import org.springframework.http.ResponseEntity;

import com.fashionapp.fashionService.dto.ClientDto;

public interface ClientService 
{
	ResponseEntity<?> addClientDetails(ClientDto clientdto);
	ResponseEntity<?> updateClientDetails(ClientDto clientdto);
	ResponseEntity<?> deleteClientDetails(ClientDto clientdto);
	JSONObject getAllClientDetails(ClientDto clientdto);
	JSONObject getClientDetails(ClientDto clientdto);

}
