package com.chandra.springboot.restful.auth;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.*;


@RestController
@RequestMapping("/auth")
@Slf4j
@RequiredArgsConstructor
public class AuthAPI
{
    private final AuthService authService;


    @PostMapping("/signup")
    public ResponseEntity create(@Valid @RequestBody Auth auth ) {
        return ResponseEntity.ok(authService.save(auth));
    }

    @PostMapping("login")
    public ResponseEntity<String> findById( @PathVariable Auth auth) {
        List<Auth> user = authService.findAll();
        final Iterator<Auth> userIterator = user.iterator();
        while(userIterator.hasNext()) {
            Auth userA = userIterator.next();
            if(auth.getUsername().equals(userA.getUsername()) && auth.getPassword().equals(userA.getPassword())) {
                return ResponseEntity.ok("login success");
            }
        }

        return ResponseEntity.ok("User not found or Invalid user credential");
    }

}
