package application;

import java.util.Date;

import entities.order;
import entities.enuns.orderStatus;

public class Program {

	public static void main(String[] args) {
		
		order Order = new order(1080, new Date(), orderStatus.SHIPPED);
		
		System.out.println(Order);
		
		orderStatus os1 = orderStatus.DELIVERED;
		orderStatus os2 = orderStatus.valueOf("DELIVERED");
		
		System.out.println(os1);
		System.out.println(os2);

	}

}
