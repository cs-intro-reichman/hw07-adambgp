/** Draws ths Sierpinski Triangle fractal. */
public class Sierpinski {
	
	public static void main(String[] args) {
		sierpinski(Integer.parseInt(args[0]));
	}
	
	// Draws a Sierpinski triangle of depth n on the standard canvass.
	public static void sierpinski (int n) {
		//// Replace this comment with your code
		double h = Math.sqrt(3) / 2.0;
    sierpinski(n, 0.0, 1.0, 0.5, 0.0, 0.0, h);
	}
	
	// Does the actual drawing, recursively.
	private static void sierpinski(int n, double x1, double x2, double x3, double y1, double y2, double y3) {
		//// Replace this comment with your code
		if (n == 0) {
        double[] x = {x1, x2, x3};
        double[] y = {y1, y2, y3};
        StdDraw.polygon(x, y);
    } else {
        double midX12 = (x1 + x2) / 2.0;
        double midY12 = (y1 + y2) / 2.0;
        
        double midX23 = (x2 + x3) / 2.0;
        double midY23 = (y2 + y3) / 2.0;
        
        double midX31 = (x3 + x1) / 2.0;
        double midY31 = (y3 + y1) / 2.0;

        sierpinski(n - 1, x1, midX12, midX31, y1, midY12, midY31); 
        sierpinski(n - 1, midX12, x2, midX23, midY12, y2, midY23); 
        sierpinski(n - 1, midX31, midX23, x3, midY31, midY23, y3);
	}
}
}
