package edu.kis.vh.nursery;


public class DefaultCountOutRhymer {
	private int[] numbers = new int[12];

	public int total = -1;
	public void countIn(int i) {
		if (!isFull()) numbers[++total] = i;
	}
	public boolean callCheck() {
			return total == -1;
		}
		public boolean isFull() {
				return total == 11;
			}
			protected int peekaboo() {
				if (callCheck()) return -1;
				return numbers[total];
				}
				public int countOut() {
					if (callCheck()) return -1;
					return numbers[total--];
					}

}
