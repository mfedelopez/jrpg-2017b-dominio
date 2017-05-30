package dominio;

import java.awt.image.BufferedImage;
import java.io.IOException;

public class Item {
	private final int idItem;
	private final BufferedImage foto;
	private final String nombre;
	private final int wearLocation;
	private final int bonusSalud;
	private final int bonusEnergia;
	private final int bonusFuerza;
	private final int bonusDestreza;
	private final int bonusInteligencia;
	private final BufferedImage fotoEquipado;
	public Item(int idItem, String nombre, int wearLocation, int bonusSalud, int bonusEnergia, int bonusAtaque, int bonusDefensa, int bonusMagia, BufferedImage foto, BufferedImage fotoEquipado) throws IOException {
		this.foto = foto;
		this.idItem = idItem;
		this.nombre = nombre;
		this.wearLocation = wearLocation;
		this.bonusSalud = bonusSalud;
		this.bonusEnergia = bonusEnergia;
		this.bonusFuerza = bonusAtaque;
		this.bonusDestreza = bonusDefensa;
		this.bonusInteligencia = bonusMagia;
		this.fotoEquipado = fotoEquipado;
	}

	public BufferedImage getFoto() {
		// TODO Auto-generated method stub
		return foto;
	}

	public String getNombre() {
		return nombre;
	}

	public int getBonusSalud() {
		return bonusSalud;
	}

	public int getBonusEnergia() {
		return bonusEnergia;
	}

	public int getBonusFuerza() {
		return bonusFuerza;
	}

	public int getBonusDestreza() {
		return bonusDestreza;
	}

	public int getBonusInteligencia() {
		return bonusInteligencia;
	}


	
	
	
}
