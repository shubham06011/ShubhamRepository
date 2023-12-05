package com.byconstructor;

public class Students {
  private int StuNum;
  private String StuName;
  private String StuSurname;
  private Department department;

public Students(int stuNum, String stuName, String stuSurname, Department department) {
	super();
	StuNum = stuNum;
	StuName = stuName;
	StuSurname = stuSurname;
	this.department = department;
}

@Override
public String toString() {
	return "Students [StuNum=" + StuNum + ", StuName=" + StuName + ", StuSurname=" + StuSurname + ", department="
			+ department + "]";
}

}
