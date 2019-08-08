package com.ssafy;

import java.util.ArrayList;

public interface IProductMgr {
	public void add(Product p);
	public ArrayList<Product> search(); 	
	public Product search(int num);
	public Product searchByName(String name);
	public ArrayList<Product> getOnlyTV();
	public ArrayList<Product> getOnlyRefrigerator();
	public ArrayList<Product> searchByVolume(int volume);
	public ArrayList <Product> searchByInch(int inch);
	public void updatePrice(int num, int price);
	public void delete(int num);
	public int getAllPrice();
}
