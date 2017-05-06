
package dominio;

/**
 * La clase NonPlayableCharacter (NPC).
 * Representa a los personajes del juego que no son
 * controlados por humanos.
 * Implementa la Interfaz Peleable.
 */

public class NonPlayableCharacter extends MadreDeTodo implements Peleable {
	/**
	 * Numero que sirve de argumento para obtener la dificultad.
	 */
	private static final int ELEGIRDIF = 3;
	/**
	 * Salud del NPC.
	 */
	private int salud;
	/**
	 * Dificultad aleatoria NPC.
	 */
	private static final int DIFICULTADALEATORIA = -1;
	/**
	 * Fuerza del NPC nivel 1.
	 */
	private static final int DIF1F = 10;
	/**
	 * Salud del NPC nivel 1.
	 */
	private static final int DIF1S = 30;
	/**
	 * Defensa del NPC nivel 1.
	 */
	private static final int DIF1D = 2;
	/**
	 * Multiplicador fuerza del NPC nivel 1.
	 */
	private static final int DIF1MF = 3;
	/**
	 * Multiplicador salud del NPC nivel 1.
	 */
	private static final int DIF1MS = 15;
	/**
	 * Multiplicador defensa del NPC nivel 1.
	 */
	private static final int DIF1MD = 1;
	/**
	 * Fuerza del NPC nivel 2.
	 */
	private static final int DIF2F = 20;
	/**
	 * Salud del NPC nivel 2.
	 */
	private static final int DIF2S = 40;
	/**
	 * Defensa del NPC nivel 2.
	 */
	private static final int DIF2D = 5;
	/**
	 * Multiplicador fuerza del NPC nivel 2.
	 */
	private static final int DIF2MF = 6;
	/**
	 * Multiplicador salud del NPC nivel 2.
	 */
	private static final int DIF2MS = 20;
	/**
	 * Multiplicador defensa del NPC nivel 2.
	 */
	private static final int DIF2MD = 2;
	/**
	 * Fuerza del NPC nivel 3.
	 */
	private static final int DIF3F = 30;
	/**
	 * Salud del NPC nivel 3.
	 */
	private static final int DIF3S = 50;
	/**
	 * Defensa del NPC nivel 3.
	 */
	private static final int DIF3D = 4;
	/**
	 * Multiplicador fuerza del NPC nivel 3.
	 */
	private static final int DIF3MF = 10;
	/**
	 * Multiplicador salud del NPC nivel 3.
	 */
	private static final int DIF3MS = 25;
	/**
	 * Multiplicador defensa del NPC nivel 3.
	 */
	private static final int DIF3MD = 4;
	/**
	 * Multiplicador de experiencia otorgada por el npc.
	 */
	private static final int MULTIPLICADOREXPNPC = 30;
	/**
	 * Multiplicador de fuerza para el golpe critico del npc.
	 */
	private static final double MULTIPLICADORFUERZA = 1.5;
	/**
	 * Numero a superar para poder ser atacado.
	 */
	private static final double NUMEROPARASERATACADO = 0.15;
	/**
	 * Numero a superar para poder atacar.
	 */
	private static final double NUMEROPARAATACAR = 0.15;
	/**
	 * Numero por el cual se divide la defensa cuando el npc es atacado.
	 */
	private static final int DIVISORDEDEFENSA = 2;

	/**
	 * Constructor de la Clase.
	 * Dependiendo de la dificultad que se pasa por parámetro al
	 * constructor, aumentará o disminuirá el valor de los
	 * atributos fuerza salud y defensa.
	 * @param nombre Nombre que se le otorga al NPC
	 * @param nivel Nivel que se le otorga al NPC
	 * @param dificultadNPC Valor entero
	 * que produce una variación en los atributos.
	 */
	public NonPlayableCharacter(final String nombre, final int nivel, final int dificultadNPC) {
		super(0, 0, nivel, nombre);

		int dificultad;
		if (dificultadNPC == DIFICULTADALEATORIA) {
			dificultad = MyRandom.nextInt(ELEGIRDIF);
		} else {
			dificultad = dificultadNPC;
		}

		switch (dificultad) {
		case 0:
			this.setFuerza(DIF1F + (nivel - 1) * DIF1MF);
			this.salud = DIF1S + (nivel - 1) * DIF1MS;
			this.setDefensa(DIF1D + (nivel - 1) * DIF1MD);
			break;
		case 1:
			this.setFuerza(DIF2F + (nivel - 1) * DIF2MF);
			this.salud = DIF2S + (nivel - 1) * DIF2MS;
			this.setDefensa(DIF2D + (nivel - 1) * DIF2MD);
			break;
    	case 2:
			this.setFuerza(DIF3F + (nivel - 1) * DIF3MF);
			this.salud = DIF3S + (nivel - 1) * DIF3MS;
			this.setDefensa(DIF3D + (nivel - 1) * DIF3MD);
			break;
		default:
			break;
		}
	}

	/**
	 * Retorna un entero.
	 * Que la cantidad de experiencia que
	 * debe sumarse al Personaje que
	 * produjo la disminución de la salud del
	 * NPC a 0. La misma sera MULTIPLCADOREXPNPC veces
	 * el valor del atributo nivel
	 * @return Cantidad de experiencia a otorgar
	 */
	@Override
	public final int otorgarExp() {
		return this.getNivel() * MULTIPLICADOREXPNPC;
	}


	/**
	 * Retorna un booleano.
	 * Que indica si el NPC esta vivo, evaluando si el mismo tiene
	 * salud mayor a 0.
	 * @return true si el NPC está vivo, false para lo contrario.
	 */
	@Override
	public final boolean estaVivo() {
		return salud > 0;
	}


	/**
	 * Retorna un entero que representa los puntos de salud del NPC.
	 * @return Devuelve la cantidad de vida actual del NPC
	 */
	@Override
	public final int getSalud() {
		return salud;
	}

	/**
	 * Asigna un valor entero que representará la salud del NPC.
	 * @param salud Entero que indica la nueva salud del NPC.
	 */
	public final void setSalud(final int salud) {
		this.salud = salud;
	}

	/**
	 * Método que, dependiendo de MyRandom.nextdouble() y NUMEROPARAATACAR.
	 * Puede ejecutar un ataque
	 * mejorado por el atributo MULTIPLICADORFUERZA
	 * @param atacado Peleable que recibe el ataque
	 * @return Retorna un entero que representa
	 * los puntos de daño realizados
	 */
	@Override
	public final int atacar(final Peleable atacado) {
		if (MyRandom.nextDouble() <= NUMEROPARAATACAR) {
			return atacado.serAtacado((int) (this.getAtaque() * MULTIPLICADORFUERZA));
		} else {
			return atacado.serAtacado(this.getAtaque());
		}
	}

	/**
	 * Dependiendo de MyRandom.nextdouble() y NUMEROPARASERATACADO.
	 * Puede disminuir el daño dependiendo del atributo DIVISORDEDEFENSA.
	 * @param danio valor a ser descontado del atributo salud.
	 * @return Retorna 0 si el ataque no fue realizado con exito
	 */
	@Override
	public final int serAtacado(int danio) {
		if (MyRandom.nextDouble() >= NUMEROPARASERATACADO) {
			danio -= this.getDefensa() / DIVISORDEDEFENSA;
			if (danio > 0) {
				salud -= danio;
				return danio;
			}
			return 0;
		}
		return 0;
	}

	/**
	 * Método sin implementar.
	 */
	@Override
	public void despuesDeTurno() { }
	/**
	 * Método sin implementar.
	 * @param exp Experiencia a aumentar al npc.
	 */
	public void ganarExperiencia(final int exp) {

	}

	/**
	 * Retorna un entero que representa el atributo de Fuerza del NPC.
	 * @return retorna el ataque del NPC.
	 */
	@Override
	public final int getAtaque() {
		return this.getFuerza();
	}

	/**
	 * Asigna un valor entero que representará el ataque del NPC.
	 * @param ataque Entero que indica la nueva fuerza del NPC.
	 */
	@Override
	public final void setAtaque(final int ataque) {
		this.setFuerza(ataque);
	}

	/**
	 * Retorna siempre un entero de valor 0.
	 * @return retorna 0 porque NPC no tiene magia.
	 */
	@Override
	public final int getMagia() {
		return 0;
	}
}


