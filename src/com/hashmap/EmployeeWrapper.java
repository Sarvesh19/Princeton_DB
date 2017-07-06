package com.hashmap;

public class EmployeeWrapper {
	public Employee employee;

	public EmployeeWrapper(Employee employee) {
		super();
		this.employee = employee;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((employee.getEmp_name() == null) ? 0 : employee.getEmp_name().hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeWrapper other = (EmployeeWrapper) obj;
		if (employee == null) {
			if (other.employee.getEmp_name() != null)
				return false;
		} else if (!employee.getEmp_name().equals(other.employee.getEmp_name()))
			return false;
		return true;
	}

}
