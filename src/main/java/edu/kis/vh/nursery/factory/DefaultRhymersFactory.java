package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.DefaultCountOutRhymer;
import edu.kis.vh.nursery.FifoRhymer;
import edu.kis.vh.nursery.HanoiRhymer;

public class DefaultRhymersFactory implements Rhymersfactory {
	@Override
	public DefaultCountOutRhymer getStandardRhymer() {
		return new DefaultCountOutRhymer();
	}
	@Override
	public DefaultCountOutRhymer getFalseRhymer() {
		return new DefaultCountOutRhymer();
	}
	@Override
	public DefaultCountOutRhymer getFifoRhymer() {
		return new FifoRhymer();
	}
	@Override
	public DefaultCountOutRhymer getHanoiRhymer() {
		return new HanoiRhymer();
	}

}
