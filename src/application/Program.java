package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		SellerDao sd = DaoFactory.createSellerDao();
		
		System.out.println("/n === Find By Department ===");
		Seller seller = sd.findById(3);
		List<Seller> list = sd.findByDepartment(seller.getDepartment());
		for(Seller s : list) {
			System.out.println(s);
		}
		
		System.out.println("=== Find All ===");
		list = sd.findAll();
		for (Seller s : list) {
			System.out.println(s);
		}
		
	}

}
