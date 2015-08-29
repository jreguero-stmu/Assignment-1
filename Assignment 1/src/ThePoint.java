public class ThePoint {
	
	private int x;
	private int y;
	
	public ThePoint(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public ThePoint(){
		this (0,0);
	}
	
	public int getX(){
		return x;
	}
	
	public int getY(){
		return y;
	}
	
	public ThePoint distance(ThePoint firstp, ThePoint secondp){
		int distx = firstp.getX() - secondp.getX();
		int disty = firstp.getY() - secondp.getY();
		ThePoint result = new ThePoint(distx, disty);
		return result;
	}

}
