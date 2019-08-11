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
	
	//TV인지 냉장고인지 전달받아 각 항목의 재고금액을 반환
	public int getItemPrice(String category) {
		int sumTVPrice = 0;		//TV 재고금액의 총합
		int sumRefPrice = 0;		//냉장고 재고금액의 총합
		
		if(category.equals("TV")) {
			for(Product p : products) {
				if(p instanceof TV) {
					sumTVPrice += p.getPrice();
				}
			}
			return sumTVPrice;
		}else if(category.equals("Refrigerator")) {
			for(Product p : products) {
				if(p instanceof Refrigerator) {
					sumRefPrice += p.getPrice();
				}
			}
			return sumRefPrice;
		}else {
			System.out.println("입력 오류...(TV | Refrigerator)");
			return 0;
		}
	}
	
	//TV인지 냉장고인지 전달받아 각 항목의 재고수량을 반환
	public int getItemStock(String category) {
		int sumTVStock = 0;		//TV 재고의 총합
		int sumRefStock = 0;	//냉장고 재고의 총합
		if(category.equals("TV")) {
			for(Product p : products) {
				if(p instanceof TV) {
					sumTVStock += p.getStock();
				}
			}
			return sumTVStock;
		}else if(category.equals("Refrigerator")) {
			for(Product p : products) {
				if(p==null)	continue;
				if(p instanceof Refrigerator) {
					sumRefStock += p.getStock();
				}
			}
			return sumRefStock;
		}else {
			System.out.println("TV와 Refrigerator 중 하나만 입력해주세요.");
			return 0;
		}
	}

	//TV재고의 평균인치를 반환
	public double getTVInchAvg() {
		double sum=0;
		int cnt=0;
		for(Product p : products) {
			if(p instanceof TV) {
				sum += ((TV) p).getInch();
				cnt++;
			}
		}
		return sum/cnt;
	}
	
	//냉장고 리터의 합계를 반환
	public int getRefriVolumeSum() {
		int sum=0;
		for(Product p : products) {
			if(p instanceof Refrigerator) {
				sum += ((Refrigerator) p).getVolume();
			}
		}
		return sum;
	}
	
	//전달된 상품명을 포함하는 상품 중에서 파라미터로 전달된 금액보다 적은 금액의 상품을 반환
	public Product[] searchLowPriceByName(String name, int price) {
		Product[] temp = new Product[50];
		Product[] res = new Product[50];
		int i=0,j=0;
		
		//전달된 상품명을 포함하는 상품을 찾음
		for(Product p : products) {
			if(p.getName().contains(name)) {
				temp[i++] = p;
			}
		}
		
		//전달된 상품명을 포함하는 상품이 저장되어있는 temp배열에서 전달되어온 가격보다 적은 상품을 res배열에 저장
		for(Product p : temp) {
			if(p.getPrice() < price) {
				res[j++] = p;
			}
		}
		return res;	
	}

}

