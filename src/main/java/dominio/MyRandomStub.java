package dominio;

public class MyRandomStub extends RandomGenerator {
	/**
	 * Valor que devolverá nextDouble().
	 */
	private final double valDouble;
	/**
	 * Valor que devolverá nextInt();
	 */
	private final int valInt;
	public MyRandomStub(double valDouble, int valInt) {
		this.valDouble = valDouble;
		this.valInt = valInt;
	}
	@Override
	public final int nextInt(final int val) {
		return valInt;
	}

	@Override
	public final double nextDouble() {
		return valDouble;
	}

}
