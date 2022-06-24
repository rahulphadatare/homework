package containment;

import java.util.Arrays;

public class Student {
	int roll;
	String name;
	Student_dept stud[];
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Student_dept[] getStud() {
		return stud;
	}
	public void setStud(Student_dept[] stud) {
		this.stud = stud;
	}
	
	public String toString()
	{
		return roll+" "+name+" "+Arrays.toString(stud);
	}
}
