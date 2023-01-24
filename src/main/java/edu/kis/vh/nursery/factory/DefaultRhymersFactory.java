package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.DefaultCountOutRhymer;
import edu.kis.vh.nursery.FifoRhymer;
import edu.kis.vh.nursery.HanoiRhymer;

public class DefaultRhymersFactory implements Rhymersfactory {
	@Override
	public DefaultCountOutRhymer GetStandardRhymer() {
		return new DefaultCountOutRhymer();
	}
	@Override
	public DefaultCountOutRhymer GetFalseRhymer() {
		return new DefaultCountOutRhymer();
	}
	@Override
	public DefaultCountOutRhymer GetFIFORhymer() {
		return new FifoRhymer();
	}
	@Override
	public DefaultCountOutRhymer GetHanoiRhymer() {
		return new HanoiRhymer();
	}

}
