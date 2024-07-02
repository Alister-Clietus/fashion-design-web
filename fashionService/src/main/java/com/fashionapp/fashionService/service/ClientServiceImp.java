package com.fashionapp.fashionService.service;

import java.util.List;
import java.util.Optional;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.fashionapp.fashionService.dto.ClientDto;
import com.fashionapp.fashionService.entity.ClientEntity;
import com.fashionapp.fashionService.repository.ClientRepo;

@Service
public class ClientServiceImp implements ClientService
{
	
	@Autowired
	ClientRepo clientrepo;


	public ResponseEntity<?> addClientDetails(ClientDto clientdto) {
	    try {
	        ClientEntity entity = new ClientEntity();
	        entity.setClientAddress(clientdto.getClientAddress());
	        entity.setClientEmail(clientdto.getClientEmail());
	        entity.setClientName(clientdto.getClientName());
	        entity.setClientPhoneNumber(clientdto.getClientPhoneNumber());
	        clientrepo.save(entity);
	        return new ResponseEntity<>("SUCCESS", HttpStatus.OK);
	    } catch (Exception e) {
	        return new ResponseEntity<>("Failed to add client details: " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	}


	public ResponseEntity<?> updateClientDetails(ClientDto clientdto) {
	    try {
	        ClientEntity cliententity = clientrepo.findByClientEmail(clientdto.getClientEmail());
	        
	        if (cliententity == null) {
	            return new ResponseEntity<>("Client not found", HttpStatus.NOT_FOUND);
	        }
	        
	        cliententity.setClientAddress(clientdto.getClientAddress());
	        cliententity.setClientEmail(clientdto.getClientEmail());
	        cliententity.setClientPhoneNumber(clientdto.getClientPhoneNumber());
	        cliententity.setClientName(clientdto.getClientName());
	        clientrepo.save(cliententity);
	        
	        return new ResponseEntity<>("SUCCESS", HttpStatus.OK);
	    } catch (Exception e) {
	        return new ResponseEntity<>("Failed to update client details: " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	}


	public ResponseEntity<?> deleteClientDetails(ClientDto clientdto) {
	    try {
	        ClientEntity cliententity = clientrepo.findByClientEmail(clientdto.getClientEmail());
	        
	        if (cliententity == null) {
	            return new ResponseEntity<>("Client not found", HttpStatus.NOT_FOUND);
	        }
	        
	        clientrepo.deleteById(cliententity.getClientId());
	        return new ResponseEntity<>("DELETED", HttpStatus.OK);
	    } catch (Exception e) {
	        return new ResponseEntity<>("Failed to delete client details: " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	}

	public JSONObject getAllClientDetails() 
	{
		JSONObject result = new JSONObject();
		try {
//			PageRequest pageable = PageRequest.of(start / pageSize, pageSize);
//			Specification<EntityClass> spec = SecurityUserSpec.getUserSpec(searchParam);
//			Page<EntityClass> usersList = repo.findAll(spec,pageable);
			List<ClientEntity> usersList = clientrepo.findAll();

			JSONArray array = new JSONArray();
//			JSONArray countByStatus = countByStatus(spec);
			for (ClientEntity users : usersList) {
				JSONObject obj = new JSONObject();
				obj.put("ID", users.getClientId());
				obj.put("NAME", users.getClientName());
				obj.put("EMAIL", users.getClientEmail());
				obj.put("PHONENUMBER", users.getClientPhoneNumber());
				obj.put("ADDRESS", users.getClientAddress());
				array.add(obj);
			}
			result.put("aaData", array);
			result.put("iTotalDisplayRecords", clientrepo.findAll().size());
//			result.put("iTotalRecords", repo.findAll(spec).size());
//			result.put("countByStatus", countByStatus);
		} catch (Exception e) {
			System.out.println(e);
		}
		return result;
	}

	@Override
	public JSONObject getClientDetails(ClientDto clientdto) {
		
		return null;
	}
	
	public ResponseEntity<?> uploadImage(MultipartFile file,String email)
	{
		try
		{
			Optional<ClientEntity> profile = Optional.ofNullable(clientrepo.findByClientEmail(email));
		    if (profile.isPresent()) {
		    	ClientEntity entity=profile.get();
		    	byte[] imageBytes = file.getBytes();
		    	entity.setClientPhoto(imageBytes);
		    	clientrepo.save(entity);
		        return new ResponseEntity<>("OK", HttpStatus.OK);
		    } else {
		        return new ResponseEntity<>("ERROR: Person not found", HttpStatus.NOT_FOUND);
		    }
		}
		catch(Exception e)
		{
	        return new ResponseEntity<>("ERROR", HttpStatus.NOT_FOUND);
		}
	}
}
