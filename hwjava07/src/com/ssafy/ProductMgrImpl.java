package com.ssafy;

import java.util.ArrayList;

public class ProductMgrImpl implements IProductMgr {
	private ArrayList<Product> products = new ArrayList<>();
	
	//싱글톤
	private static ProductMgrImpl mgr = new ProductMgrImpl();
	private ProductMgrImpl() {	}
	public static ProductMgrImpl getInstance() {
		return mgr;
	}
	
	@Override
	public void add(Product p) {
		products.add(p);
	}

	@Override
	public ArrayList<Product> search() {
		return products;
	}

	@Override
	public Product search(int num) {
		Product product = null;
		
		for(Product p : products) {
			if(p.getNum() == num)
				product = p;
		}
		return product;
	}

	@Override
	public Product searchByName(String name) {
		Product product = null;
		
		for(Product p : products) {
			if(p.getName().contains(name))
				product = p;
		}
		return product;
	}

	@Override
	public ArrayList<Product> getOnlyTV() {
		ArrayList<Product> temp = new ArrayList<>();
		
		for(Product p : products) {
			if(p instanceof TV) {
				temp.add(p);
			}
		}
		return temp;
	}

	@Override
	public ArrayList<Product> getOnlyRefrigerator() {
		ArrayList<Product> temp = new ArrayList<>();

		for(Product p : products) {
			if(p instanceof Refrigerator) {
				temp.add(p);
			}
		}
		return temp;
	}

	@Override
	public ArrayList<Product> searchByVolume(int volume) {
		ArrayList<Product> temp = new ArrayList<>();
		
		//Product타입인 것을 Refrigerator로 타입캐스팅해야 됨
		for(Product p : products) {
			if( ((Refrigerator) p).getVolume() >= volume) {
				temp.add(p);
			}
		}
		return temp;
	}

	@Override
	public ArrayList<Product> searchByInch(int inch) {
		ArrayList<Product> temp = new ArrayList<>();

		//Product타입인 것을 Refrigerator로 타입캐스팅해야 됨
		for(Product p : products) {
			if( ((TV) p).getInch() >= inch) {
				temp.add(p);
			}
		}
		return temp;
	}

	@Override
	public void updatePrice(int num, int price) {
		Product product = null;
		
		for(Product p : products) {
			if(p.getNum() == num)
				p.setPrice(price);
		}
	}

	@Override
	public void delete(int num) {
		for(Product p : products) {
			if(p.getNum() == num) {
				products.remove(p);
				break;
			}
		}
	}

	@Override
	public int getAllPrice() {
		int result = 0;
		
		for(Product p : products) {
			result += p.getPrice() * p.getStock();
		}
		return result;
	}
}
