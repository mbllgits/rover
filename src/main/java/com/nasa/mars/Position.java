package com.nasa.mars;

public class Position {
	private int x ;
	private int y ;
	private char heading ;
	
	public Position(int x, int y, char heading) {
		super();
		this.x = x;
		this.y = y;
		this.heading = heading;
	}
	
	public  Position (Position p)
	{
		this.x= p.x;
		this.y= p.y ;
		this.heading=p.heading;
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public char getHeading() {
		return heading;
	}

	public void setHeading(char heading) {
		this.heading = heading;
	}

	public void moveM() 
	{
		switch (this.heading) {
		
		case 'N' :  this.y+=1; break;
		case 'S' : this.y-=1; break;
		case 'E' : this.x+=1; break;
		case 'O' : this.x-=1;  break;
		//else: throw new Exception ("This direction dont make me turn");
		}
	
	}
	
	public boolean isInPlateau (Plateau p) {
	return 	(!(x<0 || x>p.getXaxis() || y<0 || y>p.getYaxis()));
	}

	@Override
	public String toString() {
		return "Position [x=" + x + ", y=" + y + ", heading=" + heading + "]";
	}

		
 
 
}
