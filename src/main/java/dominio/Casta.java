
package dominio;

import java.io.Serializable;

public abstract class Casta implements Serializable {
	private double probabilidadGolpeCritico;
	private double probabilidadEvitarDaño;
	private double dañoCritico;
	private static final double PROBEVITARGOLPC = 0.2;
	private static final double PROBEVITARDAÑO = 0.2;
	private static final double DAÑOCRITICO = 1.5;
	private String[] habilidadesCasta;

	/** Clase abstracta de la cual heredarán las 
	 * clases Asesion,Guerrero,Hechicero.
	 * Posee dos contructores, el contructor 
	 * por defecto (no recibe argumentos),
	 * pondrá los atributos con sus 
	 * respectivos valores por defecto.
	 */
	public Casta() {
		this.probabilidadGolpeCritico = PROBEVITARGOLPC;
		this.probabilidadEvitarDaño = PROBEVITARDAÑO;
		this.dañoCritico = DAÑOCRITICO;
	}
	 /** El constructor asignará a cada atributo,
	 * el valor correspondiente que será el 
	 * que se reciba por argumento.
	 * @param probabilidadGolpeCritico Probabilidad 
	 * de que el personaje realice un golpe crítico
	 * @param probabilidadEvitarDaño Probabilidad 
	 * de que el personaje evite un golpe crítico
	 * @param dañoCritico Valor por el cual será 
	 * multiplicado el golpe básico
	 */
	public Casta(final double prob_crit, final double evasion, final double daño_crit) {
		this.probabilidadGolpeCritico = prob_crit;
		this.probabilidadEvitarDaño = evasion;
		this.dañoCritico = daño_crit;
	}
	/**
	 * Método abstracto que será implementado 
	 * en Asesino, Guerrero y Hechicero.
	 * @param caster Personaje atacante.
	 * @param atacado Personaje que recibirá el ataque.
	 * @return Retornará true si el ataque fue realizado 
	 * exitosamente, false de lo contrario.
	 */
	public abstract boolean habilidad1(Personaje caster, Peleable atacado);
	/**Método abstracto que será implementado 
	 * en Asesino, Guerrero y Hechicero.
	 * @return Retorna la fuerza extra de la casta.
	 */
	public abstract int recibirFuerzaBonus();
	/**Método abstracto que será implementado 
	 * en Asesino, Guerrero y Hechicero.
	 * @return Retorna la destreza extra de la casta.
	 */
	public abstract int recibirDestrezaBonus();
	/**Método abstracto que será implementado 
	 * en Asesino, Guerrero y Hechicero.
	 * @return Retorna la inteligencia extra de la casta.
	 */
	public abstract int recibirInteligenciaBonus();
	/**
	 * Método abstracto que será implementado 
	 * en Asesino, Guerrero y Hechicero.
	 * @param caster Personaje atacante.
	 * @param atacado Personaje que recibirá el ataque.
	 * @return Retornará true si el ataque fue realizado 
	 * exitosamente, false de lo contrario.
	 */
	public abstract boolean habilidad2(Personaje caster, Peleable atacado);
	/**
	 * Método abstracto que será implementado 
	 * en Asesino, Guerrero y Hechicero.
	 * @param caster Personaje atacante.
	 * @param atacado Personaje que recibirá el ataque.
	 * @return Retornará true si el ataque fue realizado 
	 * exitosamente, false de lo contrario.
	 */
	public abstract boolean habilidad3(Personaje caster, Peleable atacado);
	/**Método abstracto que será implementado 
	 * en Asesino, Guerrero y Hechicero.
	 * @return Retorna el nombre de la casta.
	 */
	public abstract String getNombreCasta();
	/**Método abstracto que será implementado 
	 * en Asesino, Guerrero y Hechicero.
	 * @return Retorna nombres de las 
	 * habilidades propias de la casta.
	 */
	public abstract String[] getHabilidadesCasta();
	/**Método abstracto que será implementado 
	 * en Asesino, Guerrero y Hechicero.
	 * @return Retorna la probabilidad de critico
	 * propias de la casta.
	 */
	public final double getProbabilidadGolpeCritico() {
		return probabilidadGolpeCritico;
	}
	/** Método void que sobreescribe el atributo 
	 * probabilidadGolpeCritico.
	 * con el valor que se ingresa por parámetro.
	 * @param probabilidadGolpeCritico
	 */
	public final void setProbabilidadGolpeCritico(final double probabilidadGolpeCritico) {
		this.probabilidadGolpeCritico = probabilidadGolpeCritico;
	}
	/** Método que devuelve la probabilidadEvitarDaño.
	 * @return probabilidadEvitarDaño
	 */
	public final double getProbabilidadEvitarDaño() {
		return probabilidadEvitarDaño;
	}
	/** Método void que sobreescribe el atributo 
	 * probabilidadEvitarDaño.
	 * con el valor que se ingresa por parámetro.
	 * @param probabilidadEvitarDaño
	 */
	public final void setProbabilidadEvitarDaño(final double probabilidadEvitarDaño) {
		this.probabilidadEvitarDaño = probabilidadEvitarDaño;
	}
	/** Método que devuelve el dañoCritico.
	 * @return dañoCritico
	 */
	public final double getDañoCritico() {
		return dañoCritico;
	}
	/** Método void que sobreescribe el atributo 
	 * dañoCritico.
	 * con el valor que se ingresa por parámetro.
	 * @param dañoCritico
	 */
	public final void setDañoCritico(final double dañoCritico) {
		this.dañoCritico = dañoCritico;
	}
	/** Método void que aumenta el atributo 
	 * probabilidadEvitarDaño.
	 * con el valor que se ingresa por parámetro.
	 * @param bonus bonficador de evitar daño
	 */
	public final void aumentarEvitarDaño(final double bonus) {
		this.probabilidadEvitarDaño += bonus;
	}
}


