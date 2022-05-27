package sample;

import java.io.Serializable;

public class StudentData implements Serializable {// using serializable here for writing an object to file
	String id;
	String sName;
	String lname;
	String location;
	String semester;
	String year;
	String mobileNumber;
	String gmail;
	public StudentData(String id,String sName, String lname, String location, String semester, String year, String mobileNumber,
			String gmail) {
		super();
		this.id=id;
		this.sName = sName;
		this.lname = lname;
		this.location = location;
		this.semester = semester;
		this.year = year;
		this.mobileNumber = mobileNumber;
		this.gmail = gmail;
	}
	public StudentData() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "StudentData [id=" + id + ", sName=" + sName + ", lname=" + lname + ", location=" + location
				+ ", semester=" + semester + ", year=" + year + ", mobileNumber=" + mobileNumber + ", gmail=" + gmail
				+ "]";
	}
	
	
}


	