
package dominio;

/** Clase abstracta.
 * Que tiene como funcion tener los atributos que
 * comparten las clases NPC y Personaje
 */
public abstract class MadreDeTodo {

	/**
	 * Fuerza que recibira el personaje o npc.
	 */
	private int fuerza;
	/**
	 * Defensa que recibira el personaje o npc.
	 */
	private int defensa;
	/**
	 * Nivel que recibira el personaje o npc.
	 */
	private int nivel;
	/**
	 * Nombre que recibira el personaje o npc.
	 */
	private String nombre;
	/**
	 * Objeto para obtener valores aleatorios.
	 */
	private RandomGenerator random;


	/** Clase abstracta.
	 * Que tiene como
	 * funcion tener los atributos que
	 * comparten las clases NPC y Personaje
	 * @param fuerza valor otorgado por
	 * el constructor de NPC o Personaje.
	 * @param defensa valor otorgado por
	 * el constructor de NPC o Personaje.
	 * @param nivel valor otorgado por
	 * el constructor de NPC o Personaje.
	 * @param nombre valor otorgado por
	 * el constructor de NPC o Personaje.
	 */
	public MadreDeTodo(final int fuerza, final int defensa, final int nivel, final String nombre) {
		this.fuerza = fuerza;
		this.defensa = defensa;
		this.nivel = nivel;
		this.nombre = nombre;
		this.random = new MyRandom();
	}


	/** Método que devuelve la fuerza del personaje o NPC.
	 * @return fuerza del personaje o NPC.
	 */
	public final int getFuerza() {
		return fuerza;
	}
	/** Método void que sobreescribe el atributo fuerza.
	 * Con el valor que se ingresa por parámetro.
	 * @param fuerza valor a sobreescribir
	 */
	public final void setFuerza(final int fuerza) {
		this.fuerza = fuerza;
	}
	/** Método que devuelve la defensa del personaje o NPC.
	 * @return defensa del personaje o NPC.
	 */
	public final int getDefensa() {
		return defensa;
	}
	/** Método void que sobreescribe el atributo fuerza.
	 * Con el valor que se ingresa por parámetro.
	 * @param defensa valor a sobreescribir
	 */
	public final void setDefensa(final int defensa) {
		this.defensa = defensa;
	}
	/** Método que devuelve el nivel del personaje o NPC.
	 * @return nivel del personaje o NPC.
	 */
	public final int getNivel() {
		return nivel;
	}
	/** Método void que sobreescribe el atributo
	 * nivel.
	 * Con el valor que se ingresa por
	 * parámetro.
	 * @param nivel valor a sobreescribir
	 */
	public final void setNivel(final int nivel) {
		this.nivel = nivel;
	}
	/** Método que devuelve el nombre del personaje o NPC.
	 * @return nombre del personaje o NPC.
	 */
	public final String getNombre() {
		return nombre;
	}
	/** Método void que sobreescribe el atributo nombre.
	 * Con el valor que se ingresa por parámetro.
	 * @param nombre valor a sobreescribir
	 */
	public final void setNombre(final String nombre) {
		this.nombre = nombre;
	}
	/** Método void que aumenta la fuerza del personaje o NPC.
	 * Con el valor que se ingresa por parámetro.
	 * @param aumento fuerza a aumentar.
	 */
	public final void aumentarFuerza(final int aumento) {
		fuerza += aumento;
	}
	/** Método void que aumenta el nivel del personaje o NPC.
	 */
	public final void aumentarNivel() {
		nivel++;
	}

	/**
	 * Getter del Randomizador.
	 * @return Retorna el randomizador.
	 */
	public RandomGenerator getRandom() {
		return random;
	}

	/**
	 * Setter del Randomizador.
	 * @param random Randomizador que reemplazará al actual.
	 */
	public void setRandom(RandomGenerator random) {
		this.random = random;
	}
}
