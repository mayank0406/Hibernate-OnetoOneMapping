package onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveData {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		
		Person person = new Person();
		person.setName("madhu");
		person.setAge(22);
		person.setGender("female");
		person.setPhno(7054767298l);
		
		Person person1 = new Person();
		person1.setName("madhusudhan");
		person1.setAge(24);
		person1.setGender("male");
		person1.setPhno(9805767298l);
		
		
		AdharCard adharCard = new AdharCard();
		adharCard.setAdno(1234567891l);
		adharCard.setAddress("banglore");
		
		AdharCard adharCard1 = new AdharCard();
		adharCard1.setAdno(1234567845l);
		adharCard1.setAddress("mysore");
		
		person.setCard(adharCard);
		person.setCard(adharCard1);
		
		entityTransaction.begin();
		entityManager.persist(person);
		entityManager.persist(person1);
		entityManager.persist(adharCard);
		entityManager.persist(adharCard1);
		entityTransaction.commit();
	}

}
