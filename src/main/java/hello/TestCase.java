package hello;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TestCase {

	@Id
	private String id;

	private String someStuff;
	
	public TestCase() {
		// default
	}
	
	public TestCase(String id, String someStuff) {
		this.id = id;
		this.someStuff = someStuff;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSomeStuff() {
		return someStuff;
	}

	public void setSomeStuff(String someStuff) {
		this.someStuff = someStuff;
	}
	
	
}