package com.iqicool.repository;

import org.springframework.data.repository.CrudRepository;

import com.iqicool.model.Account;

public interface AccountRepository  extends CrudRepository<Account, Long>{

	Account findByUsername(String username);
}
