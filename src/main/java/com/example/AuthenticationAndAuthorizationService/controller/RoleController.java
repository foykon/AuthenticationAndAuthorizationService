package com.example.AuthenticationAndAuthorizationService.controller;

import com.example.AuthenticationAndAuthorizationService.entity.Role;
import com.example.AuthenticationAndAuthorizationService.service.RoleService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/role")
public class RoleController {
    private final RoleService roleService;

    public RoleController(RoleService roleService) {
        this.roleService = roleService;
    }

    @GetMapping
    public List<Role> findAllRole(){
        return roleService.findAllRole();
    }

    @GetMapping("/{id}")
    public Optional<Role> findRoleById(@PathVariable("id") Long id){
        return roleService.findById(id);
    }

    @PostMapping
    public Role saveRole(@RequestBody Role role){
        return roleService.saveRole(role);
    }


}
