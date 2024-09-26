package com.abhi.sbean;

import java.util.Objects;

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
	public int hashCode() {
		return Objects.hash(address, empNo, mid, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeBean other = (EmployeeBean) obj;
		return Objects.equals(address, other.address) && Objects.equals(empNo, other.empNo)
				&& Objects.equals(mid, other.mid) && Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "EmployeeBean [empNo=" + empNo + ", name=" + name + ", address=" + address + ", mid=" + mid + "]";
	}

}
