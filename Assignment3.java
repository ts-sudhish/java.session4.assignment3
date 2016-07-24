/**
 * 
 */
package sdh.java.session4;

/**
 * @author Sudhish
 *
 */
public class Assignment3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Assignment3Encapsulation employee1 = new Assignment3Encapsulation();
		Assignment3Encapsulation employee2 = new Assignment3Encapsulation();
		Assignment3Encapsulation employee3 = new Assignment3Encapsulation();
		employee1.setId(333);
		employee1.setName("Sumesh");
		employee1.setAge(28);
		employee1.setAddress("HighTech City, Hyderabad, India");
		employee1.setContactNo("+918960098111");
		employee2.setId(111);
		employee2.setName("Sudhish");
		employee2.setAge(23);
		employee2.setAddress("Bhandup West, Mumbai, Maharashtra, India");
		employee2.setContactNo("+919800098222");
		employee3.setId(222);
		employee3.setName("Jeff");
		employee3.setAge(23);
		employee3.setAddress("Peru, South America");
		employee3.setContactNo("+0004123654");
		
		System.out.println("Details of Employees");
		System.out.println("\nEmployee 1");
		System.out.print("Name: "+employee1.getName()+"\t|\tID: "+employee1.getId()+"\t|\tAddress: "+employee1.getAddress()+"\t|\tAge: "+employee1.getAge()+"\t|\tContact No: "+employee1.getContactNo());
		System.out.println("\nEmployee 2");
		System.out.print("Name: "+employee2.getName()+"\t|\tID: "+employee2.getId()+"\t|\tAddress: "+employee2.getAddress()+"\t|\tAge: "+employee2.getAge()+"\t|\tContact No: "+employee2.getContactNo());
		System.out.println("\nEmployee 3");
		System.out.print("Name: "+employee3.getName()+"\t|\tID: "+employee3.getId()+"\t|\tAddress: "+employee3.getAddress()+"\t|\tAge: "+employee3.getAge()+"\t|\tContact No: "+employee3.getContactNo());
	}
}
