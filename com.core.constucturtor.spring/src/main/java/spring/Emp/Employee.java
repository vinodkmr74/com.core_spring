package spring.Emp;

public class Employee {
	
	private int id;
	private String Fname;
	private String Lname;
	private String Gender;
	private int saraly;
	
	
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}




	public Employee(int id, String fname, String lname, String gender, int saraly) {
		super();
		this.id = id;
		Fname = fname;
		Lname = lname;
		Gender = gender;
		this.saraly = saraly;
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




	public int getSaraly() {
		return saraly;
	}




	public void setSaraly(int saraly) {
		this.saraly = saraly;
	}




	@Override
	public String toString() {
		return "Employee [id=" + id + ", Fname=" + Fname + ", Lname=" + Lname + ", Gender=" + Gender + ", saraly="
				+ saraly + "]";
	}
	
	
	
	
	
	
	

}
