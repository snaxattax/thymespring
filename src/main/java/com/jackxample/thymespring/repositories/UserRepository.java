package com.jackxample.thymespring.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jackxample.thymespring.entities.User;

@Repository
public interface UserRepository extends CrudRepository<User,Long> {
	
}