package spring.core.Entity;

public class Employee {
	
	private int id;
	private String Fname;
	private String Lname;
	private String Gender;
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int id, String fname, String lname, String gender) {
		super();
		this.id = id;
		Fname = fname;
		Lname = lname;
		Gender = gender;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFname() {
		return Fname;
	}
	public void setFname(String fname) {
		Fname = fname;
	}
	public String getLname() {
		return Lname;
	}
	public void setLname(String lname) {
		Lname = lname;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", Fname=" + Fname + ", Lname=" + Lname + ", Gender=" + Gender + "]";
	}
	
	
	

}
