package dominio;
/**
 *
 * Clase que se utiliza para obtener números aleatoreos.
 */
public class MyRandom {
	/**
	 * Número que devuelve nextDouble().
	 */
	private static final double NUMERORARO = 0.49;
	/**
	 * Número que devuelve nextInt()
	 */
	private static final int OTRONUMERORARO = 1;



	/**El método nextDobule() retorna siempre el número 0.49.
	 * @return retorna 0.49
	 */
	public static double nextDouble() {
		return NUMERORARO;
	}
	/** El método nextInt() decrementa en 1 el argumento que se le pasó.
	 * @param val número entero a decrementar
	 * @return número decrementado
	 */
	public static int nextInt(final int val) {
		return val - OTRONUMERORARO;
	}

}
