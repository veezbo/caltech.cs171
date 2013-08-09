package homework7;

public class Point3 {
	public double x;
	public double y;
	public double z;
	public Point3 (double $x, double $y, double $z) {
		x = $x;
		y = $y;
		z = $z;
	}
	public String toString() {
		return "(" + x + ", " + y + ")";
	}
	
	public Point3 mult(double d) {
		return new Point3(x*d, y*d, z*d);
	}
	
	public static Point3 add (Point3 a, Point3 b) {
		return new Point3(a.x + b.x, a.y + b.y, a.z + b.z);
	}
	
	@Override
	public boolean equals(Object other) {
		
		Point3 o = (Point3) other;
		
		double eps = 0.01;
		if (Math.abs(o.x - this.x) < eps && Math.abs(o.y - this.y) < eps) {
			return true;
		}
		return false;
	}
}
