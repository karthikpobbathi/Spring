package com.capgemini.SpringBootWithJpa.repository;

import org.springframework.data.repository.CrudRepository;

import com.capgemini.SpringBootWithJpa.model.UserRecord;  
public interface UserRepository extends CrudRepository<UserRecord, String> {  
}  
