package com.ssafy;

public class ProductMgr {
	private static ProductMgr mgr = new ProductMgr();

	private ProductMgr() {
	}

	public static ProductMgr getInstance() {
		return mgr;
	}

	///////////////////////// 싱글톤///////////////////////
	Product[] products = new Product[100];
	int idx = 0;

	public void addProduct(Product p) {
		products[idx++] = p;
	}
	public Product[] searchAllProduct() {
		return products;
	}
	public Product searchProductByPnum(int pNum) {
		for(Product p:products) {
			if(p==null)	continue;
			if(p.getpNumber()==pNum) {
				return p;
			}
		}
		return null;
	}
	public Product[] searchProductByPname(String pName) {
		Product[] tmp = new Product[100];
		int i=0;
		for(Product p:products) {
			if(p==null)	continue;
			if(p.getpName().contains(pName)) {
				tmp[i++] = p;
			}
		}
		return tmp;
	}
	public Product[] getTV() {
		Product[] tmp = new Product[100];
		int i=0;
		for(Product p:products) {
			if(p==null)	continue;
			if(p instanceof TV) {
				tmp[i++] = p;
			}
		}
		return tmp;
	}
	public Product[] getRefrigerator() {
		Product[] tmp = new Product[100];
		int i=0;
		for(Product p:products) {
			if(p==null)	continue;
			if(p instanceof Refrigerator) {
				tmp[i++] = p;
			}
		}
		return tmp;
	}
	public void deleteProductByPnum(int pNum) {
		for(int i=0;i<100;i++) {
			if(products[i]==null)	continue;
			if(products[i].getpNumber()==pNum) {
				for(int t=i;t<100;t++) {
					if(products[t]!=null) {
						products[t] = products[t+1];					
						}
				}
				idx--;
			}
		}
	}
	public int getTotalPrice() {
		int sum=0;
		for(Product p:products) {
			if(p!=null) {
				sum += p.getPrice();
			}
		}
		return sum;
	}
	public int getCategoryPrice(String TVRefri) {
		int sum =0;
		if(TVRefri.equals("TV")) {
			for(Product p:products) {
				if(p instanceof TV) {
					sum += p.getPrice();
				}
			}
			return sum;
		}
		else if(TVRefri.equals("Refrigerator")) {
			for(Product p:products) {
				if(p==null)	continue;
				if(p instanceof Refrigerator) {
					sum += p.getPrice();
				}
			}
			return sum;
		}else {
			System.out.println("TV와 Refrigerator 중 하나만 입력해주세요.");
			return 0;
		}
	}
	public int getCategoryNum(String TVRefri) {
		int cnt =0;
		if(TVRefri.equals("TV")) {
			for(Product p:products) {
				if(p instanceof TV) {
					cnt++;
				}
			}
			return cnt;
		}
		else if(TVRefri.equals("Refrigerator")) {
			for(Product p:products) {
				if(p==null)	continue;
				if(p instanceof Refrigerator) {
					cnt++;
				}
			}
			return cnt;
		}else {
			System.out.println("TV와 Refrigerator 중 하나만 입력해주세요.");
			return 0;
		}
	}

	public double getTVInchAve() {
		double sum=0;
		int idx=0;
		for(Product p:products) {
			if(p==null)	continue;
			if(p instanceof TV) {
				sum +=((TV) p).getInch();
				idx++;
			}
		}
		return sum/idx;
	}
	public int getRefriSum() {
		int sum=0;
		for(Product p:products) {
			if(p==null)	continue;
			if(p instanceof Refrigerator) {
				sum +=Integer.parseInt(((Refrigerator) p).getVolume());
			}
		}
		return sum;
	}
	public Product[] searchProductByPriceWithPname(String pName,int price) {
		Product[] tmp = new Product[100];
		Product[] res = new Product[100];
		int i=0,j=0;
		for(Product p:products) {
			if(p==null)	continue;
			if(p.getpName().contains(pName)) {
				tmp[i++] = p;
			}
		}
		for(Product p:tmp) {
			if(p==null)	continue;
			if(p.getPrice()<price) {
				res[j++] = p;
			}
		}
		return res;	
	}

}

