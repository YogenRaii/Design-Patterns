package design_patterns.strategy_pattern.strategy_pattern_lab.dao;

import design_patterns.strategy_pattern.strategy_pattern_lab.domain.Account;

import java.util.Collection;

public interface IAccountDAO {
	void saveAccount(Account account);
	void updateAccount(Account account);
	Account loadAccount(long accountnumber);
	Collection<Account> getAccounts();
}
