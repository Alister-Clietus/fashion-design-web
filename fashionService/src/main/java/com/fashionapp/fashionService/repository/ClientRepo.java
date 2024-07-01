package com.fashionapp.fashionService.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fashionapp.fashionService.entity.ClientEntity;

public interface ClientRepo extends JpaRepository<ClientEntity,Long>
{

}
