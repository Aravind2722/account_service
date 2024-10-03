package org.example.account_service.security.models;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.example.account_service.models.Role;
import org.example.account_service.models.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
@JsonDeserialize
public class CustomUserDetails implements UserDetails {
    private Long userId;
    private String username;
    private String password;
    private List<CustomGrantedAuthority> authorities;
    private Boolean accountNonExpired;
    private Boolean accountNonLocked;
    private Boolean credentialsNonExpired;
    private Boolean enabled;
    public CustomUserDetails() {
    }
    public CustomUserDetails (User user) {
        this.userId = user.getId();
        this.username = user.getEmail();
        this.password = user.getHashedPassword();
        this.accountNonLocked = true;
        this.accountNonExpired = true;
        this.credentialsNonExpired = true;
        this.enabled = true;
        List<CustomGrantedAuthority> grantedAuthorities = new ArrayList<>();
        for (Role role : user.getRoles()) {
            grantedAuthorities.add(new CustomGrantedAuthority(role));
        }
        this.authorities = grantedAuthorities;

    }

    public Long getUserId() { return this.userId; }
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public String getPassword() {
        return this.password;
    }

    @Override
    public String getUsername() {
        return this.username;
    }

    @Override
    public boolean isAccountNonExpired() {
//        return UserDetails.super.isAccountNonExpired();
        return this.accountNonExpired;
    }

    @Override
    public boolean isAccountNonLocked() {

//        return UserDetails.super.isAccountNonLocked();
        return this.accountNonLocked;
    }

    @Override
    public boolean isCredentialsNonExpired() {
//        return UserDetails.super.isCredentialsNonExpired();
        return this.credentialsNonExpired;
    }

    @Override
    public boolean isEnabled() {

//        return UserDetails.super.isEnabled();
        return this.enabled;
    }
}
