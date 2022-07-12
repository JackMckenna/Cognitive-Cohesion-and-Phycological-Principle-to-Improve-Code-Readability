package d.c.b;

public class TestAnalysis {
	private double s_monthToDate =0;
	private double u_monthDiscount= 0;
	private double v_customerDiscount= 0;
	private double w_taxRate= 0;

	double calc(double lineItemPrice, double quantity) {
		double a_lineCost = lineItemPrice * quantity;
		s_monthToDate += a_lineCost;
		double b_monthPercentSaving =  u_monthDiscount;
		double c_monthMonetarySaving = a_lineCost * b_monthPercentSaving / 100;
		double d_customerMonetarySaving = a_lineCost * v_customerDiscount / 100;
		double f_gross = a_lineCost - d_customerMonetarySaving - c_monthMonetarySaving;
		double e_tax = f_gross * w_taxRate;
		double result = f_gross + e_tax;
		return result;
	}

}
