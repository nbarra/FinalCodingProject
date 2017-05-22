package rocketBase;

import java.util.ArrayList;

import org.apache.poi.ss.formula.functions.*;

import exceptions.RateException;
import javassist.bytecode.ExceptionsAttribute;
import rocketDomain.RateDomainModel;

public class RateBLL {

	private static RateDAL _RateDAL = new RateDAL();
	
	public static double getRate(int GivenCreditScore) throws RateException
	{
		//TODO - RocketBLL RateBLL.getRate - make sure you throw any exception
		ArrayList<RateDomainModel> List = RateDAL.getAllRates();
		double drte = 0;
		for (RateDomainModel rte : List)
			if (rte.getiMinCreditScore() < GivenCreditScore)
				return drte = rte.getdInterestRate();
		throw new RateException(null);
			}
	
	public static double getPVPayment(double r, double n, double y, double f, boolean t)
	{		
		return FinanceLib.pmt(r, n, y, f, t);
	}
}