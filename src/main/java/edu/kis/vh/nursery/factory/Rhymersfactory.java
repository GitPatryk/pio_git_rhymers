package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.DefaultCountOutRhymer;

	public interface Rhymersfactory {
	
		public DefaultCountOutRhymer getStandardRhymer();
		
		public DefaultCountOutRhymer getFalseRhymer();
		
		public DefaultCountOutRhymer getFifoRhymer();
		
		public DefaultCountOutRhymer getHanoiRhymer();
		
	}
