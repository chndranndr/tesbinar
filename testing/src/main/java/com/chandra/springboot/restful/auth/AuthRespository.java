package com.chandra.springboot.restful.auth;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthRespository extends JpaRepository<Auth, Long> {
}
