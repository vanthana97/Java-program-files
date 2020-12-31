package com.basics;

public class SpeedDista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int gndistm=2500;
       int gnhr=5;
       int gnmin=56;
       int gnsec=23;
       double time=gnhr*3600+gnmin*60+gnsec;
       double speed1=gndistm/time;
       double speed2=speed1*(18/5);
       double speed3=speed1*(2.237);
       System.out.println("speed in metre/sec "+speed1+"Speed in km/hr "+speed2+" speed in miles/hr"+speed3);
     
	}

}
