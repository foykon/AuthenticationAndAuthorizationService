package com.example.AuthenticationAndAuthorizationService.service;

import com.example.AuthenticationAndAuthorizationService.entity.Role;

import java.util.List;
import java.util.Optional;

public interface RoleService {
    List<Role> findAllRole();
    Optional<Role> findById(Long id);
    Role saveRole(Role role);
    Role updateRole(Role role);
    void deleteRole(Long id);

}
