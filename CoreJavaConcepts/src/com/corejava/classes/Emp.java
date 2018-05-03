package com.corejava.classes;

class Emp 
{
	private int empNo;
	private String empName;
	
	Emp(){
		System.out.println("Default Constructor");
		empNo = 10;
		empName = "Default Emp Name";
	}
	
	//Emp emp = new Emp(11, "santosh"); //empNo = no, no has 11
	 Emp(int no, String name){
		
		empNo = no;
		empName = name;

		System.out.println("Parameter Constructor");
	}

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	 
}
