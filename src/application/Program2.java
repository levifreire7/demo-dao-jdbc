package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		DepartmentDao departmentDao = DaoFactory.CreateDepartmentDao();
		
		System.out.println("==== TEST 1: department insert ====");
		Department newDepatment = new Department(null, "Support");
		departmentDao.insert(newDepatment);
		System.out.println("Inserted! New id = " + newDepatment.getId());
		
		System.out.println("==== TEST 2: department update ====");
		Department dep = new Department();
		dep.setId(3);
		dep.setName("Personal");
		departmentDao.update(dep);
		System.out.println("Update completed");

	}

}
