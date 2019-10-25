
public class Equestria {

	public static void main(String[] args) {
		 int BaltX = 31;
		 int BaltY = 15;
		 int ManeX = 35;
		 int ManeY = 9;
		 
		 double BalttoManeX = XDistance(BaltX, ManeX);
		 double BalttoManeY = YDistance(BaltY, ManeY);
		 
		 System.out.println(BaltX);
	}
	public static double XDistance ( double X1, double X2) {
		double X = X2 - X1;
		return X;
	}
	public static double YDistance ( double Y1, double Y2) {
		double Y = Y2 - Y1;
		return Y;
	}
	public static double Squared (double X, double Y) {
		Math.class.sqrt (X);
		return X;
	}

}
