package com.redhat.aml.model.service;

import com.redhat.aml.model.*;

import javax.inject.Singleton;
import javax.persistence.*;

import java.util.List;

@Singleton
public class AccountService {
	
	@PersistenceContext
    protected EntityManager em;
    
    public AccountDB createAccount (int accountNo, String firstname, String lastname,
			String street, String city, String state, long zipcode,
			String occupation, int age, String sex, String marritialstatus,
			String accounttype){
    	AccountDB acc = new AccountDB( accountNo,  firstname,  lastname,
    			 street,  city,  state,  zipcode,
    			 occupation,  age,  sex,  marritialstatus,
    			 accounttype);
    	
    	// persist the new object
    	em.persist(acc);
    	return acc;
    	
    	
    }

    public void removeAccount(int id) {
    	AccountDB acc = findAccount(id);
        if (acc != null) {
            em.remove(acc);
        }
    }


    public AccountDB findAccount(int id) {
        return em.find(AccountDB.class, id);
    }

    public List<AccountDB> findAllAccounts() {
        TypedQuery<AccountDB> query = em.createQuery(
                  "FROM Accountdetails", AccountDB.class);
        return query.getResultList();
    }
}