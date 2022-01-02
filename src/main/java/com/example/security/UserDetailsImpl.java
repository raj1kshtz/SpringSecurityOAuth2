package com.example.security;

import java.util.Collection;
import java.util.Collections;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class UserDetailsImpl implements UserDetails {

	private Userdata Userdata;
	
	
	public UserDetailsImpl(Userdata Userdata) {
		super();
		this.Userdata = Userdata;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
			return Collections.singleton(new SimpleGrantedAuthority("UserData"));
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return Userdata.getPassword();
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return Userdata.getUsername();
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

}
