package com.example.security;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Userdata, String> {

	Userdata findByUsername(String username);
}
