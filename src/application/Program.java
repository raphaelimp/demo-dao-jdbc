package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		SellerDao sd = DaoFactory.createSellerDao();
		
		Seller seller = sd.findById(3);
		List<Seller> list = sd.findByDepartment(seller.getDepartment());
		for(Seller s : list) {
			System.out.println(s);
		}
		
	}

}
