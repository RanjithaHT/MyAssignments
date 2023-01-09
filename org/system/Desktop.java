package org.system;

public class Desktop extends Computer {
	
	public void desktopSize() {
		System.out.println("The desktop size is 45*78");
	}

	public static void main(String[] args) {
		Desktop D1=new Desktop();
		D1.computerModel();
		D1.desktopSize();
	}
}
