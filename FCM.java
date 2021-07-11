import java.util.Scanner;
class FCM {
	final static Scanner sc = new Scanner(System.in);
	static int water = 400, milk = 540, cBeans  = 120, cups = 9, money = 550;
	public static void main(String[] args) {
		writeAction();		
	}
	public static void writeAction() {
		System.out.println("Write action (buy, fill, take, remaining, exit):");
		String action = sc.next();
		if (action.equals("buy")) { buy(); }
		else if (action.equals("remaining")) { printMachine(water, milk, cBeans, cups, money); }
		else if (action.equals("exit")) { System.exit(0); }
		else if (action.equals("fill")) { fill(); }
		else if (action.equals("take")) { take(); }
		System.out.println();
	}
	public static void printMachine(int w, int m, int c, int cu, int mo) {
		System.out.println("\nThe coffee machine has:\n" +(w)+" ml of water \n" +(m)+" ml of milk \n" +(c)+" g of coffee beans ");
		System.out.println((cu)+" disposable cups \n$" + (mo) + " of money");
		System.out.println();
		writeAction();
	}
	public static void take() {
		System.out.println("\nI gave you $" + (money));
		System.out.println();
		money = 0;
		writeAction();
	}
	public static void fill() {
		System.out.println("\nWrite how many ml of water you want to add: ");
		int addWater = sc.nextInt();
		water = water + addWater;
		System.out.println("Write how many ml of milk you want to add: ");
		int addMilk = sc.nextInt();
		milk = milk + addMilk;
		System.out.println("Write how many grams of coffee beans you want to add: ");
		int addBeans = sc.nextInt();
		cBeans = cBeans + addBeans;
		System.out.println("Write how many disposable cups of coffee you want to add:");
		int addDisposable = sc.nextInt();
		cups = cups + addDisposable;
		int money = 0;
		System.out.println();
		writeAction();
	}
	public static void buy() {
		System.out.println("\nWhat do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ");
		String buyOption = sc.next();
		if (buyOption.equals("1")) { 
			getEspresso();
		} else if (buyOption.equals("2")) {
			getLatte();
		 } else if (buyOption.equals("3")) { 
			getCappuccino();
		} else if (buyOption.equals("back")) { 
			writeAction(); 
		}		
	}
	public static void getEspresso() {
		if (water >= 250 && cBeans >= 16 && money >= 4) {
			System.out.println("I have enough resources, making you a coffee!");
			water -= 250;
			cBeans -= 16;
			money += 4;
			cups--;
			System.out.println();
			writeAction();
		} else {
			if (water < 250) { System.out.println("Sorry, not enough water!"); }
			else if (cBeans < 16) { System.out.println("Sorry, not enough coffee beans!"); }
			System.out.println();
			writeAction();
		}
	}
	public static void getLatte() {
		if (water >= 350 && milk >= 75 && cBeans >= 20 && money >= 7) {
			System.out.println("I have enough resources, making you a coffee!");
			water -= 350;
			milk -= 75; 
			cBeans -= 20; 
			money += 7;
			cups--;
			System.out.println();
			writeAction();
		} else {
			if (water < 350) { System.out.println("Sorry, not enough water!"); }
			else if (milk < 75) { System.out.println("Sorry, not enough milk!"); }
			else if (cBeans < 20) { System.out.println("Sorry, not enough coffee beans!"); }
			System.out.println();
			writeAction();
		}
	}
	public static void getCappuccino() {
		if (water >= 200 && milk >= 100 && cBeans >= 12 && money >= 6) {
			System.out.println("I have enough resources, making you a coffee!");
			water -= 200;
			milk -= 100; 
			cBeans -= 12; 
			money += 6;
			cups--;
			System.out.println();
			writeAction();
		} else {
			if (water < 200) { System.out.println("Sorry, not enough water!"); }
			else if (milk < 100) { System.out.println("Sorry, not enough milk!"); }
			else if (cBeans < 12) { System.out.println("Sorry, not enough coffee beans!"); } 
			System.out.println();
			writeAction();
		}
	}
}
