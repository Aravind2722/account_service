package org.example.account_service.security.models;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.example.account_service.models.Role;
import org.springframework.security.core.GrantedAuthority;
@JsonDeserialize
public class CustomGrantedAuthority implements GrantedAuthority {
    private String authority;
    public CustomGrantedAuthority() {
    }
    public CustomGrantedAuthority (Role role) {
        this.authority = role.getName();
    }
    @Override
    public String getAuthority() {
        return this.authority;
    }
}
