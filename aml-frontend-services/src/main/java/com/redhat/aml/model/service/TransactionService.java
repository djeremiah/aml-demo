package com.redhat.aml.model.service;

import com.redhat.aml.model.*;

import javax.persistence.*;

import java.util.List;

public class TransactionService {
    protected EntityManager em;

    public TransactionService(EntityManager em) {
        this.em = em;
    }


    
    public TransactionDB createTransaction (String firstname, String lastname, long accountNo,
			long amount, String transactiontype, String fromloc, String toloc,
			String ipaddress, String devicelocation, String country,
			String state){
    	TransactionDB acc = new TransactionDB(  firstname,  lastname,  accountNo,
    			 amount,  transactiontype,  fromloc,  toloc,
    			 ipaddress,  devicelocation,  country,
    			 state);
    	
    	// persist the new object
    	em.persist(acc);
    	return acc;
    	
    	
    }

    public void removeTransaction(int id) {
    	TransactionDB acc = findTransaction(id);
        if (acc != null) {
            em.remove(acc);
        }
    }


    public TransactionDB findTransaction(int id) {
        return em.find(TransactionDB.class, id);
    }

    public List<TransactionDB> findAllTransactions() {
        TypedQuery<TransactionDB> query = em.createQuery(
                  "FROM Transaction", TransactionDB.class);
        return query.getResultList();
    }
}