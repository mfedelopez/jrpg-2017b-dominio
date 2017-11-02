package testsdominio;

import dominio.Asesino;
import dominio.Humano;
import dominio.Item;
import dominio.Personaje;

import java.io.IOException;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

import org.junit.Assert;
import org.junit.Test;

public class TestTrueque {

  @Test
  public void testTrueque() {
    Personaje p1 = new Humano("Ben Affleck", new Asesino(), 2);
    ArrayList<Item> aponer = new ArrayList<Item>();
    DefaultListModel<String> asacar = new DefaultListModel<String>();
    asacar.addElement("NombreItem1");
    try {
      Item item5 = new Item(20, "NombreItem5", 0, 10, 0, 0, 0, 0, "foto5", "fotoE5");
      Item item6 = new Item(20, "NombreItem6", 0, 10, 0, 0, 0, 0, "foto6", "fotoE6");

      aponer.add(item5);
      aponer.add(item6);
      p1.anadirItem(new Item(20, "NombreItem1", 0, 10, 0, 0, 0, 0, "foto1", "fotoE1"));
      p1.anadirItem(new Item(20, "NombreItem2", 0, 10, 0, 0, 0, 0, "foto2", "fotoE2"));
      Item item3 = new Item(20, "NombreItem3", 0, 10, 0, 0, 0, 0, "foto3", "fotoE3");
      p1.anadirItem(item3);
      p1.anadirItem(new Item(20, "NombreItem4", 0, 10, 0, 0, 0, 0, "foto4", "fotoE4"));
      p1.trueque(p1.getItems(), aponer, asacar);
      Assert.assertTrue(p1.getItems().contains(item5));
      Assert.assertTrue(p1.getItems().contains(item6));
      Assert.assertTrue(p1.getItems().contains(item3));
      Item item1 = new Item(20, "NombreItem1", 0, 10, 0, 0, 0, 0, "foto1", "fotoE1");
      Assert.assertFalse(p1.getItems().contains(item1));

    } catch (IOException e) {
      JOptionPane.showMessageDialog(null, "Falló");
    }

  }

  @Test
  public void testTrueque2() {
    Personaje p1 = new Humano("Ben Affleck", new Asesino(), 2);

    ArrayList<Item> aponer = new ArrayList<Item>();
    DefaultListModel<String> asacar = new DefaultListModel<String>();
    asacar.addElement("NombreItem1");
    asacar.addElement("NombreItem3");
    try {
      Item item5 = new Item(20, "NombreItem5", 0, 10, 0, 0, 0, 0, "foto5", "fotoE5");

      aponer.add(item5);
      p1.anadirItem(new Item(20, "NombreItem1", 0, 10, 0, 0, 0, 0, "foto1", "fotoE1"));
      p1.anadirItem(new Item(20, "NombreItem2", 0, 10, 0, 0, 0, 0, "foto2", "fotoE2"));
      Item item3 = new Item(20, "NombreItem3", 0, 10, 0, 0, 0, 0, "foto3", "fotoE3");
      p1.anadirItem(item3);
      p1.anadirItem(new Item(20, "NombreItem4", 0, 10, 0, 0, 0, 0, "foto4", "fotoE4"));
      p1.trueque(p1.getItems(), aponer, asacar);
      Assert.assertTrue(p1.getItems().contains(item5));
      Assert.assertFalse(p1.getItems().contains(item3));
      Item item1 = new Item(20, "NombreItem1", 0, 10, 0, 0, 0, 0, "foto1", "fotoE1");
      Assert.assertFalse(p1.getItems().contains(item1));

    } catch (IOException e) {
      JOptionPane.showMessageDialog(null, "Falló");
    }

  }

}
