package rocketBase;

import static org.junit.Assert.*;

import org.junit.Test;

import exceptions.RateException;

import rocketDomain.RateDomainModel;

public class rate_test {


	@Test
	public void rate_test(){
		ArrayList<RateDomainModel> rates = RateDAL.getAllRates();
	}
	
		@Test
		public void exception_test(){
			ArrayList<RateDomainModel> rates = RateDAL.getAllRates();
		}
	@Test
	public void test() {
		assert(1==1);
	}
}
