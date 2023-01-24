package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.DefaultCountOutRhymer;

	public interface Rhymersfactory {
	
		public DefaultCountOutRhymer GetStandardRhymer();
		
		public DefaultCountOutRhymer GetFalseRhymer();
		
		public DefaultCountOutRhymer GetFIFORhymer();
		
		public DefaultCountOutRhymer GetHanoiRhymer();
		
	}
