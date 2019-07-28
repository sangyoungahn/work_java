package com.ssafy;

public class CarTest {
	public static void main(String[] args) {
		CarMgr mgr = new CarMgr();
		
		//차량 정보를 배열에 저장
		mgr.addCar(new Car("12가432", "제네시스", 30000000));
		mgr.addCar(new Car("54허532", "벤츠S클래스", 80000000));
		mgr.addCar(new Car("76구241", "BMW520", 100000000));
		mgr.addCar(new Bus("36두257", "타요버스", 90000000));
		mgr.addCar(new Bus("97바032", "현대버스", 120000000, 15));
		mgr.addCar(new Truck("86사038", "현대포터", 110000000));
		mgr.addCar(new Truck("53자152", "마이티", 65000000, 4));
		
		System.out.println("===============모든 차량 정보 출력=================");
		Car[] allCar = mgr.getAllCar();
		for(Car c : allCar) {
			if(c==null)	break;
			System.out.println(c);
		}
		System.out.println("\n");
		
		System.out.println("============전달된 번호와 같은 차량 정보를 출력===========");
		System.out.println(mgr.searchCarByNum("76구241"));
		System.out.println("\n");
		
		System.out.println("==========전달된 가격보다 적은 차량 정보들을 출력==========");
		System.out.println("100000000원보다 적은 가격의 차량 모두 출력!!");
		Car[] updatePriceCar = mgr.searchCarByPrice(100000000);
		for(Car c : updatePriceCar) {
			if(c==null)	break;
			System.out.println(c);
		}
		System.out.println("\n");
		
		System.out.println("=========전달된 번호의 차량을 검색하여 가격을 수정==========");
		System.out.println("차량번호가 53자152인 차량의 가격을 수정!!");
		mgr.updatePrice("53자152", 123456);
		for(Car c : allCar) {
			if(c==null) break;
			System.out.println(c);
		}
		System.out.println("\n");
		
		System.out.println("==============전달된 번호의 차량을 삭제===============");
		System.out.println("차량번호가 54허532인 차량을 삭제!!");
		mgr.deleteCar("54허532");
		for(Car c : mgr.getAllCar()) {
			if(c==null) break;
			System.out.println(c);
		}
		System.out.println("\n");
		
		System.out.println("==============저장된 차량 대수를 출력================");
		System.out.println(mgr.getSize() + "대");
		System.out.println("\n");
		
		System.out.println("==============저장된 차량의 금액 합계================");
		System.out.println(mgr.sumAllCar() + "원");
		System.out.println("\n");
	}
}
