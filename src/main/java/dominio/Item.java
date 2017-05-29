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
	private final int bonusAtaque;
	private final int bonusDefensa;
	private final int bonusMagia;
	public Item(int idItem, String nombre, int wearLocation, int bonusSalud, int bonusEnergia, int bonusAtaque, int bonusDefensa, int bonusMagia, BufferedImage foto) throws IOException {
		this.foto = foto;
		this.idItem = idItem;
		this.nombre = nombre;
		this.wearLocation = wearLocation;
		this.bonusAtaque = bonusAtaque;
		this.bonusDefensa = bonusDefensa;
		this.bonusEnergia = bonusEnergia;
		this.bonusSalud = bonusSalud;
		this.bonusMagia = bonusMagia;
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

	public int getBonusAtaque() {
		return bonusAtaque;
	}

	public int getBonusDefensa() {
		return bonusDefensa;
	}

	public int getBonusMagia() {
		return bonusMagia;
	}
	
	
	
}
