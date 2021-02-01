package application;

import java.util.Date;
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
		System.out.println();
		
		System.out.println("=== Find All ===");
		list = sd.findAll();
		for (Seller s : list) {
			System.out.println(s);
		}
		System.out.println();
		
		System.out.println("=== Insertition ===");
		Seller newSeller = new Seller(null, "Stefan", "stefan@hotmail.com", new Date(), 3200.00, list.get(1).getDepartment());
		sd.insert(newSeller);
		System.out.println(newSeller.getId());
		
		
	}

}
