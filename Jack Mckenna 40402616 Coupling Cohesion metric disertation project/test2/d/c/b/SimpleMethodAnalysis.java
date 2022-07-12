package d.c.b;

public class SimpleMethodAnalysis {
	double a= 0 ;
	double b = 0;
	double c = 0;
	double d = 0;

	double calc() {
		double x = a+b;
		double y = c+d;
		double result = x + y;
		return result;
	}

}
