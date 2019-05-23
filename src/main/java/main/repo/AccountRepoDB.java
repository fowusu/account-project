package main.repo;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import main.domain.Account;
import main.utils.JSONUTIL;

@Transactional(value = TxType.SUPPORTS)
public class AccountRepoDB implements AccountRepo {
	@Inject
	private JSONUTIL json;

	@PersistenceContext(unitName = "primary")
	private EntityManager em;

	@Override
	@Transactional(value = TxType.REQUIRED)
	public Account updateAccount(int accountNumber, Account account) {
		if (em.contains(em.find(Account.class, accountNumber))) {
			em.persist(account);
		}
		return account;
	}

	@Override
	@Transactional(value = TxType.REQUIRED)
	public String deleteAccount(int accountNumber) {
		if (em.contains(em.find(Account.class, accountNumber))) {
			em.remove(em.find(Account.class, accountNumber));
		}
		return "{\"message\": \"account sucessfully deleted\"}";
	}

	@Override
	@Transactional(value = TxType.REQUIRED)
	public String addAccount(String newAccount) {
		Account account = this.json.fromJSON(newAccount, Account.class);
		em.persist(account);
		return "{\"message\": \"account sucessfully ADDED\"}";

	}

	@Override
	@Transactional(value = TxType.SUPPORTS)
	public Account getAccount(int id) {
		return this.em.find(Account.class, id);
	}

	@Override
	@Transactional(value = TxType.SUPPORTS)
	public String getAllAccounts() {
		return this.json.toJSON(this.em.createQuery("SELECT a FROM Account a", Account.class).getResultList());
	}

}
