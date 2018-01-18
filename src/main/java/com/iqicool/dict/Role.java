package com.iqicool.dict;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;

public class Role {

	private static List<Role> roles;

	public static Role GUEST = new Role(0, "GUEST");
	public static Role USER = new Role(1 << 0, "USER");
	public static Role TECH_OPERATOR = new Role(1 << 24, "TECH_OPERATOR");
	public static Role ADMIN = new Role(1 << 31, "ADMIN");

	static {
		roles = new ArrayList<Role>();
		roles.add(GUEST);
		roles.add(USER);
		roles.add(TECH_OPERATOR);
		roles.add(ADMIN);
	}

	// Super admin has all privileges
	static final long SUPER_ADMIN = 0xffffffff;

	private long value;
	private String name;
	private GrantedAuthority authority;

	private Role(long value, String name) {
		this.value = value;
		this.name = name;
		this.authority = new RoleAuthority("ROLE_" + name);
	}

	public long GetValue() {
		return value;
	}

	/**
	 * Check whether the given role is granted
	 * 
	 * @param role
	 * @return
	 */
	public boolean hasRole(final long role) {
		if ((value & role) != 0) {
			return true;
		}
		return false;
	}

	/**
	 * Get the authority list for spring security based on the given role
	 * 
	 * @param role
	 * @return
	 */
	public static List<GrantedAuthority> getAuthorities(final long role) {
		List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
		for (Role sysRole : roles) {

			if ((role & sysRole.value) != 0) {
				authorities.add(sysRole.authority);
			}
		}
		return authorities;
	}

	private class RoleAuthority implements GrantedAuthority {
		/**
		 * 
		 */
		private static final long serialVersionUID = -7043687815748377847L;
		private String authority;

		public RoleAuthority(String authority) {
			this.authority = authority;
		}

		@Override
		public String getAuthority() {
			return authority;
		}

	}
}
