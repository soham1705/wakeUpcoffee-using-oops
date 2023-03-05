package com.seed.inDemo;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;
public class WakeUpCoffee {
	Coffee c;
	int qty;
	static int WaitingNo=0;
	public WakeUpCoffee()
	{
		WaitingNo++;
	}
	public static void main(String args[])
	{
		LocalDate myObj = LocalDate.now(); 
	    System.out.println(myObj); 
	    LocalTime myObj1 = LocalTime.now();
	    System.out.println(myObj1);
		System.out.println("1.COLDCOFFEE =45/-");
		System.out.println("2.CHESSES PIZZA =350/-");
		System.out.println("3.BURGGER =70/-");
		System.out.println("4.BADAMSHAKES =40/-");
		System.out.println("Enter your Choice");
		Scanner sc = new Scanner(System.in);
		int C=sc.nextInt();
		
		switch (C)
		{
				case 1:
					System.out.println("Enter qty");
					WakeUpCoffee w=new WakeUpCoffee();
					w.qty=sc.nextInt();
					w.c=Coffee.COLDCOFFEE;
					double price=w.c.COFFEEPrice(w.qty);
					System.out.println("Your bill: "+price);
					System.out.println("WaitingNo : "+WaitingNo);
					System.out.println("THANK YOU,VIST AGAIN!!!!");
					break;
				
				case 2:
					System.out.println("Enter qty");
					WakeUpCoffee u=new WakeUpCoffee();
					u.qty=sc.nextInt();
					u.c=Coffee.CHESSEPIZZA;
					double price1=u.c.CHESSEPIZZAPrice(u.qty);
					System.out.println("Your bill:"+price1);
					System.out.println("WaitingNo :"+WaitingNo);
					System.out.println("THANK YOU,VIST AGAIN!!!!");
					break;
					
				case 3:
					System.out.println("Enter qty");
					WakeUpCoffee n=new WakeUpCoffee();
					n.qty=sc.nextInt();
					n.c=Coffee.BURGER;
					double price2=n.c.BURGERPrice(n.qty);
					System.out.println("Your bill:"+price2);
					System.out.println("WaitingNo :"+WaitingNo);
					System.out.println("THANK YOU,VIST AGAIN!!!!");
					break;
					
				case 4:
					System.out.println("Enter qty");
					WakeUpCoffee o=new WakeUpCoffee();
					o.qty=sc.nextInt();
					o.c=Coffee.BADAMSHAKES;
					double price3=o.c.BADAMSHAKESprice(o.qty);
					System.out.println("Your bill:"+price3);
					System.out.println("WaitingNo :"+WaitingNo);
					System.out.println("THANK YOU,VIST AGAIN!!!!");
					break;			
		}
		
	}
	public class StaticBlock
	{
		static String sentence;
	}
	static
	{
		System.out.println("....................WakeUpCoffee Shop.......................");
	}
	

}
