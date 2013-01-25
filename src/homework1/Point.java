package homework1;

public class Point {
	public double x;
	public double y;
	public Point(double $x, double $y) {
		x = $x;
		y = $y;
	}
	public String toString() {
		return "(" + x + ", " + y + ")";
	}
	
	public Point mult(double d) {
		return new Point(x*d, y*d);
	}
	
	public static Point add (Point a, Point b) {
		return new Point(a.x + b.x, a.y + b.y);
	}
	
	@Override
	public boolean equals(Object other) {
		
		Point o = (Point) other;
		
		double eps = 0.01;
		if (Math.abs(o.x - this.x) < eps && Math.abs(o.y - this.y) < eps) {
			return true;
		}
		return false;
	}
}
