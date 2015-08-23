import java.util.Scanner;

public class TestPoint {
	
	public static void main(String args[]){
		int p1x;
		int p2x;
		int p1y;
		int p2y;

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first point x");
		p1x = scan.nextInt();
		System.out.println("Enter first point y");
		p1y = scan.nextInt();
		System.out.println("Enter second point x");
		p2x = scan.nextInt();
		System.out.println("Enter second point y");
		p2y = scan.nextInt();
		
		ThePoint point1 = new ThePoint(p1x, p1y);
		ThePoint point2 = new ThePoint(p2x, p2y);
		ThePoint pointR = new ThePoint();
		pointR = pointR.distance(point1, point2);
		
		System.out.println("The two points are (" + point1.getX() + "," + point1.getY() + ") and (" + point2.getX() + "," + point2.getY() + ")");
		System.out.println("The distance between the two points is " + "(" + pointR.getX() + "," + pointR.getY() + ")");
		
	}

}
