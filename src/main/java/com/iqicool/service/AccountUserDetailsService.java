package com.iqicool.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.iqicool.dict.Role;
import com.iqicool.model.Account;
import com.iqicool.repository.AccountRepository;

@Component
public class AccountUserDetailsService implements UserDetailsService {

	@Autowired
	private AccountRepository accountRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Account account = accountRepository.findByUsername(username);
		List<GrantedAuthority> authorities = Role.getAuthorities(account.getRole());
		UserDetails user = User.withUsername(account.getUsername())
				.password(account.getPassword()).authorities(authorities).build();
		return user;
	}

}
