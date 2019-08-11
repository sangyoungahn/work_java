package com.ssafy;

public class ProductMgr {
	//싱글톤
	private static ProductMgr mgr = new ProductMgr();
	private ProductMgr() {	}
	public static ProductMgr getInstance() {
		return mgr;
	}

	Product[] products = new Product[50];
	int idx = 0;

	//상품추가
	public void add(Product p) {
		products[idx++] = p;
	}
	
	//상품데이터 전체검색
	public Product[] search() {
		Product[] temp = new Product[products.length];
		int index = 0;
		
		for(Product p : products) {
			temp[index++] = p;
			if(p==null) {
				index=temp.length;
				break;
			}
		}
		return temp;	//배열의 주소값이 전달됨
	}
	
	//상품번호로 정보 검색
	public Product searchByNum(int num) {
		for(Product p : products) {
			if(p==null)	continue;
			else if(p.getNum()==num) {
				return p;
			}
		}
		return null;
	}
	
	//상품명으로 정보 검색
	public Product searchByName(String name) {
		Product product = null;
		for(Product p : products) {
			if(p==null)	continue;
			if(p.getName().contains(name)) {
				product = p;
			}
		}
		return product;
	}
	
	//TV만 검색
	public Product[] getOnlyTV() {
		Product[] temp = new Product[100];
		int i=0;
		
		for(Product p : products) {
			if(p==null)	continue;
			if(p instanceof TV) {
				temp[i++] = p;
			}
		}
		return temp;
	}
	
	//Refrigerator만 검색
	public Product[] getOnlyRefrigerator() {
		Product[] temp = new Product[100];
		int i=0;
		
		for(Product p : products) {
			if(p==null)	continue;
			if(p instanceof Refrigerator) {
				temp[i++] = p;
			}
		}
		return temp;
	}
	
	//상품번호로 상품을 삭제하는 기능
	public void delete(int num) {
		for(int i=0; i<50; i++) {
			if(products[i] == null)	continue;
			if(products[i].getNum() == num) {
				for(int t=i;t<50;t++) {
					if(products[t]!=null) {
						products[t] = products[t+1];	//실질적인 삭제 기능			
						}
				}
				idx--;
			}
		}
	}
	
	//전체 재고 상품 금액을 구하는 기능
	public int getAllPrice() {
		int sum = 0;
		for(Product p : products) {
			if(p!=null) {
				sum += p.getPrice();
			}
		}
		return sum;
	}

}

