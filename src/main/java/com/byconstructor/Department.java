package com.byconstructor;

public class Department {
	private int DeptId;
	private String DeptName;
	private String College;
	
	public Department(int deptId, String deptName, String college) {
		super();
		DeptId = deptId;
		DeptName = deptName;
		College = college;
	}
	@Override
	public String toString() {
		return "Department [DeptId=" + DeptId + ", DeptName=" + DeptName + ", College=" + College + "]";
	}

}
