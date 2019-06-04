package vending;

import java.awt.image.RasterFormatException;

public class Main {

	public static void main(String[] args) {

		VendingMachine vm = new VendingMachine();
		
		Drink drink = vm.buy(500, Drink.COKE);
		int charge = vm.refund();
		
		if (drink !=null && drink.getKind() == Drink.COKE) {
			System.out.println("コーラを購入しました。");
			System.out.println("おつりは " + charge + " です。");
		} else {
			throw new RasterFormatException("コーラ買えんかった泣");
		}
	}
}
