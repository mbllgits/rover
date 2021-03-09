package com.nasa.mars;

public class Plateau {

	private int xaxis;
	private int yaxis;
	

	public int getXaxis() {
		return xaxis;
	}
	public void setXaxis(int xaxis) {
		this.xaxis = xaxis;
	}
	public int getYaxis() {
		return yaxis;
	}
	public void setYaxis(int yaxis) {
		this.yaxis = yaxis;
	}
	 public void setPlateau(String input)
	 {
		 String[] coordinates = input.split(" ");
		 xaxis = Integer.parseInt(coordinates[0]);
		 yaxis = Integer.parseInt(coordinates[1]);
			
	 }
	
	
}
