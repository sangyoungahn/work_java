package com.ssafy;

public class CarMgr {
	Car[] cars = new Car[7];
	int index = 0;
	
	public void addCar(Car c) {
		cars[index++] = c;
	}
	
	public Car[] getAllCar() {
		return cars;
	}
	
	public Car searchCarByNum(String num) {
		Car c = null;
		for(Car car : cars) {
			if(car==null) break;
			else if(car.getNum().equals(num)) {
				c = car;	//객체에 해당하는 car클래스를 넣음
				break;
			}
		}
		return c;
	}
	
	public Car[] searchCarByPrice(int price) {
		Car[] temp = new Car[7];
		int cnt = 0;
		
		for(Car car : cars) {
			if(car==null)	break;
			else if(car.getPrice()<price) {
				temp[cnt++] = car;
			}
		}
		return temp;
	}
	
	public void updatePrice(String num, int price) {
		Car c = null;
		
		for(Car car : cars) {
			if(car==null) break;
			else if(car.getNum().equals(num)) {
				c = car;
				c.setPrice(price);
				break;
			}
		}
	}
	
	public void deleteCar(String num) {
		for(int i=0; i<index; i++) {
			if(cars[i].getNum().equals(num)) {
				for(int j=i; j<index-1; j++) {
					cars[j] = cars[j+1];
				}
				break;
			}
		}
		index--;	//하나가 삭제되었으므로 배열에서 하나가 사라짐
	}
	
	public int getSize() {
		int cnt=0;
		
		for(Car car : cars) {
			if(car==null) break;
			else	cnt++;
		}
		return cnt;
	}
	
	public int sumAllCar() {
		int sum = 0;
		
		for(Car car : cars) {
			if(car==null) break;
			else {
				sum += car.getPrice();
			}
		}
		return sum;
	}
}
