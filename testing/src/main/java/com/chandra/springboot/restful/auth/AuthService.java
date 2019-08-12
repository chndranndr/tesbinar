package com.chandra.springboot.restful.auth;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

@RequiredArgsConstructor
public class AuthService
{
    private final AuthRespository authRespository;

    public List<Auth> findAll() {
        return authRespository.findAll();
    }

    public Optional<Auth> findById( Long id) {
        return authRespository.findById(id);
    }

    public Auth save( Auth stock) {
        return authRespository.save(stock);
    }

    public void deleteById(Long id) {
        authRespository.deleteById(id);
    }
}
