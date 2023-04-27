package com.desai.userrolemgmt.controller;

import com.desai.userrolemgmt.model.Roles;
import com.desai.userrolemgmt.service.RoleService;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/roles")
public class RoleController {
    private final RoleService roleService;

    public RoleController(RoleService roleService) {
        this.roleService = roleService;
    }

    @GetMapping("/{rolename}/")
    public Roles getRolesByName(@PathVariable("rolename") String rolename) {
        return roleService.getRoleByRoleName(rolename);
    }

    @GetMapping("/mappings/{mapping}/")
    public List<Roles> getRolesByRoleMapping(@PathVariable("mapping") String mapping) {
        return roleService.getRoleByRoleMapping(mapping);
    }
}
