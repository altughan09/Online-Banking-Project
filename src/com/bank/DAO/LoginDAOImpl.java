package com.bank.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bank.entity.PrimaryAccount;
import com.bank.entity.UserAccount;

@Repository
public class LoginDAOImpl implements LoginDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public String loginCheck(String customerID, String password) {
		
		Session currentSession = sessionFactory.getCurrentSession();
				
		Query theQuery = currentSession.createQuery("from UserAccount u where u.customerID=:id AND u.password=:pass");
		theQuery.setParameter("id", customerID);
		theQuery.setParameter("pass", password);

		List results = theQuery.list();
		
		if ((results!=null) && (results.size()>0)){
			return "success";
		}
		else {
		return "failed";
	}
		
}

	@Override
	public List<PrimaryAccount> getAccount(String accountID) {
		
		Session currentSession = sessionFactory.getCurrentSession();
		Query<PrimaryAccount> theQuery = currentSession.createQuery("from PrimaryAccount p where p.accountID=:id", PrimaryAccount.class);
		theQuery.setParameter("id", accountID);
		List<PrimaryAccount> theAccount = theQuery.getResultList();

		return theAccount;
	}
	
}

