package com.fashionapp.fashionService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fashionapp.fashionService.entity.ClientEntity;

@Repository
public interface ClientRepo extends JpaRepository<ClientEntity,Long>
{
	ClientEntity findByClientEmail(String clientEmail);
}
