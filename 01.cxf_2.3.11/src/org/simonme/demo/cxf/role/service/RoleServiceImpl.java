package org.simonme.demo.cxf.role.service;

import org.simonme.demo.cxf.role.bean.Role;

public class RoleServiceImpl
{
    
    public Role queryRoleById(Role role)
    {
        Role mockRole = new Role();
        mockRole.setId(100);
        mockRole.setName("AdminMock");
        return mockRole;
    }
}
