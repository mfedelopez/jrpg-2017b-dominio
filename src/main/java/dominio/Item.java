package dominio;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Item {
	private int idItem;
	private BufferedImage foto;
	private String nombre;
	private int wearLocation;
	public Item(int idItem, String nombre, int wearLocation, String path) throws IOException {
		foto = ImageIO.read(new File(path));
		this.idItem = idItem;
		this.nombre = nombre;
		this.wearLocation = wearLocation;
	}

	public BufferedImage getFoto() {
		// TODO Auto-generated method stub
		return foto;
	}
	
	
	
}
