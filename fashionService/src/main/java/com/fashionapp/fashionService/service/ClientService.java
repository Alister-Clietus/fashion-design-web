package com.fashionapp.fashionService.service;

import org.json.simple.JSONObject;
import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

import com.fashionapp.fashionService.dto.ClientDto;
import com.fashionapp.fashionService.dto.ClientIddto;

public interface ClientService 
{
	ResponseEntity<?> addClientDetails(ClientDto clientdto);
	ResponseEntity<?> updateClientDetails(ClientDto clientdto);
	ResponseEntity<?> deleteClientDetails(ClientIddto clientdto);
	JSONObject getAllClientDetails();
	JSONObject getClientDetails(ClientIddto clientdto);
	JSONObject getClientPhotos(ClientIddto clientdto);
	ResponseEntity<?> uploadImage(MultipartFile file,String email);
	ResponseEntity<?> uploadFlagImage(MultipartFile file,String email,String rgb);

}
