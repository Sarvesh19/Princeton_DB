package com.hashmap;

public class Employee {
	private String emp_name;
	private String emp_number;

	public Employee(String emp_name, String emp_number) {
		super();
		this.emp_name = emp_name;
		this.emp_number = emp_number;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public String getEmp_number() {
		return emp_number;
	}

	public void setEmp_number(String emp_number) {
		this.emp_number = emp_number;
	}

//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + ((emp_name == null) ? 0 : emp_name.hashCode());
//		result = prime * result + emp_number;
//		return result;
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Employee other = (Employee) obj;
//		if (emp_name == null) {
//			if (other.emp_name != null)
//				return false;
//		} else if (!emp_name.equals(other.emp_name))
//			return false;
//		if (emp_number != other.emp_number)
//			return false;
//		return true;
//	}

}
