package com.abhi.sbean;

public class EmployeeBean {
	private Integer empNo;
	private String name;
	private String address;
	private String mid;

	public EmployeeBean(Integer empNo, String name, String address, String mid) {
		super();
		this.empNo = empNo;
		this.name = name;
		this.address = address;
		this.mid = mid;
	}

	public Integer getEmpNo() {
		return empNo;
	}

	public void setEmpNo(Integer empNo) {
		this.empNo = empNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMid() {
		return mid;
	}

	public void setMid(String mid) {
		this.mid = mid;
	}

	@Override
	public String toString() {
		return "EmployeeBean [empNo=" + empNo + ", name=" + name + ", address=" + address + ", mid=" + mid + "]";
	}

}
