package com.example.AuthenticationAndAuthorizationService.service.impl;

import com.example.AuthenticationAndAuthorizationService.entity.Role;
import com.example.AuthenticationAndAuthorizationService.repository.RoleRepository;
import com.example.AuthenticationAndAuthorizationService.service.RoleService;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;

@Service

public class RoleServiceImpl implements RoleService {

    private final RoleRepository roleRepository;
    private static final Logger logger = LogManager.getLogger(RoleServiceImpl.class);
    public RoleServiceImpl(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Override
    public List<Role> findAllRole() {
        return roleRepository.findAll();
    }

    @Override
    public Optional<Role> findById(Long id) {
        return roleRepository.findById(id);
    }

    @Override
    public Role saveRole(Role role) {
        logger.info("rol eklendi"+role.getRoleName());
        return roleRepository.save(role);
    }

    @Override
    public Role updateRole(Role role) {
        return roleRepository.save(role);
    }

    @Override
    public void deleteRole(Long id) {
        roleRepository.deleteById(id);
    }
}
