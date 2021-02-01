package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		DepartmentDao dp = DaoFactory.createDepartmentDao();
		
		System.out.println("=== Find By Id ===");
		Department dep = dp.findById(1);
		System.out.println(dep);
		System.out.println();
		
		System.out.println("=== Find All ===");
		List<Department> list = dp.findAll();
		for(Department d : list) {
			System.out.println(d);
		}
		System.out.println();
		
		System.out.println("=== Insert ===");
		Department newDepartment = new Department(null, "Music");
		dp.insert(newDepartment);
		System.out.println(newDepartment);
		System.out.println();
		
		System.out.println("=== Update ===");
		Department dep2 = dp.findById(1);
		dep2.setName("Food");
		dp.update(dep2);
		System.out.println(dep2);
		System.out.println();
		
		System.out.println("=== Delete ===");
		System.out.print("Enter id to delete: ");
		int id = sc.nextInt();
		dp.deleteById(id);
		System.out.println("Delete completed!");
		

	}

}
