package com.fashionapp.fashionService.service;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.fashionapp.fashionService.dto.ClientDto;
import com.fashionapp.fashionService.repository.ClientRepo;

@Service
public class ClientServiceImp implements ClientService
{
	
	@Autowired
	ClientRepo clientrepo;

	@Override
	public ResponseEntity<?> addClientDetails(ClientDto clientdto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<?> updateClientDetails(ClientDto clientdto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<?> deleteClientDetails(ClientDto clientdto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public JSONObject getAllClientDetails(ClientDto clientdto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public JSONObject getClientDetails(ClientDto clientdto) {
		// TODO Auto-generated method stub
		return null;
	}
}
