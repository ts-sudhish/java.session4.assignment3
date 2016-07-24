/**
 * 
 */
package sdh.java.session4;

/**
 * @author Sudhish
 *
 */
public class Assignment3Encapsulation {
	private int id;
	private String name;
	private String Address;
	private String contactNo;
	private int age;
	
	Assignment3Encapsulation() {
		this.id=000;
		this.name="null";
		this.Address="null";
		this.contactNo="null";
		this.age=0;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
