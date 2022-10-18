package com.app.authenticationserver.service;

import com.app.authenticationserver.model.Role;
import com.app.authenticationserver.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class RoleService {
    @Autowired
    RoleRepository roleRepository;

    public ResponseEntity<?> addRole(Role role) {
        try {
            return new ResponseEntity<>(roleRepository.save(role), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
