package week1.day1;

public class Bike {
	public void applyBreak() {
		System.out.println("Applied break");
	}
    public void soundHorn() {
		System.out.println("sound horn");

	}

	public static void main(String[] args) {
		Car ca=new Car();
		ca.applyBreak();
		ca.soundHorn();
		Bike bi=new Bike();
		bi.applyBreak();
		bi.soundHorn();
	}

}
