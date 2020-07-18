package org.transport;

import org.road.Road;
import org.water.Water;

public class Transport {
	private void transportForm() {
		// TODO Auto-generated method stub
		System.out.println("Forms of Transport");

	}
	public static void main(String[] args) {
		//
		Transport e=new Transport();
		e.transportForm();
		//
		Road c=new Road();
		c.bike();
		c.bus();
		//
		Water d=new Water();
		d.boat();
		d.ship();
		
		
		
		
	}

}
