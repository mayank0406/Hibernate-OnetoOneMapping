package onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class DeleteData {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		 AdharCard adharCard  = entityManager.find(AdharCard.class ,1);
		if(adharCard!=null)
		{
			entityTransaction.begin();
		    entityManager.remove(adharCard);
		    entityTransaction.commit();
		}
		else
		{
			System.out.println("data already deleted");
		}
		
	}

}
