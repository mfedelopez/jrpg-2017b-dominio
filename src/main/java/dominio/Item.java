package dominio;

import java.awt.image.BufferedImage;
import java.io.IOException;

public class Item {
	private int idItem;
	private BufferedImage foto;
	private String nombre;
	private int wearLocation;
	public Item(int idItem, String nombre, int wearLocation, int bonusSalud, int bonusEnergia, int bonusAtaque, int bonusDefensa, int bonusMagia, BufferedImage foto) throws IOException {
		this.foto = foto;
		this.idItem = idItem;
		this.nombre = nombre;
		this.wearLocation = wearLocation;
	}

	public BufferedImage getFoto() {
		// TODO Auto-generated method stub
		return foto;
	}

	public String getNombre() {
		return nombre;
	}
	
}
