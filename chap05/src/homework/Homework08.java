package homework;

import java.util.Arrays;

public class Homework08 {
	public static void main(String[] args) {
		String[] menu = { "Burger", "Pizza", "Pasta" };
		String[] add = { "Salad", "Soup" };

		int newMenuLen = menu.length + add.length;
		String[] newMenu = Arrays.copyOf(menu, newMenuLen);
		
		int addArrCount = 0;
		for (int i = menu.length; i < newMenu.length; i++) {
			newMenu[i] = add[addArrCount];
			addArrCount++;
		}
		
		System.out.print("어제 메뉴판: ");
		for (String string : menu) System.out.print(" " + string);
		System.out.println();
		System.out.print("오늘 메뉴판: ");
		for (String string : newMenu) System.out.print(" " + string);
		
		
	}
}
