package com.imooc.io;

class Car {
	private String carName;

	public Car(String carName) {
		this.carName = carName;
	}

	public void show() {
		System.out.println("具备基本功能：" + "");
	}
}


class RadarCar {
	public Car myCar;

	public RadarCar(Car myCar) {
		this.myCar = myCar;
	}

	public void show() {
		myCar.show();
		System.out.println("具备倒车雷达功能");
	}
}

/**
 * @author Administrator
 *
 */
public class Exmple01 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car benze = new Car("Benze");
		System.out.println("-----fdafda------");
		benze.show();

		RadarCar newRadarCar = new RadarCar(benze);
		System.out.println("--jdj---");
		newRadarCar.show();
	}

}
