package onetoone;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AdharCard {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private long adno;
	private String Address;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getAdno() {
		return adno;
	}
	public void setAdno(long adno) {
		this.adno = adno;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	
	
}
