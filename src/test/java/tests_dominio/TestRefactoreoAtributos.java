package tests_dominio;

import dominio.Asesino;
import dominio.Elfo;
import dominio.Guerrero;
import dominio.Hechicero;
import dominio.Humano;
import dominio.Orco;
import dominio.Personaje;
import org.junit.Assert;
import org.junit.Test;

public class TestRefactoreoAtributos {

  @Test
  public void testDestrezaAsesino() {
    Personaje p = new Humano("Ben Affleck", new Asesino(), 1);
    Assert.assertEquals(15, p.getDestreza());
  }
    
  @Test
  public void testFuerzaGuerrero() {
    Personaje p = new Humano("Ben Affleck", new Guerrero(), 1);
    Assert.assertEquals(15, p.getFuerza());
  }
    
  @Test
  public void testInteligenciaHechicero() {
    Personaje p = new Humano("Ben Affleck", new Hechicero(), 1);
    Assert.assertEquals(15, p.getInteligencia());
  }
    
  @Test
  public void testFullHumano(){
    Personaje p = new Humano("Ben Affleck", new Asesino(), 1);
    Personaje p1 = new Humano("Ben Affleck", new Hechicero(), 1);
    Personaje p2 = new Humano("Ben Affleck", new Guerrero(), 1);
    // Testeo que sin importar la casta, sigue teniendo la misma energia y
    // salud porque eso depende de la Raza
    Assert.assertEquals(105, p.getSaludTope());
    Assert.assertEquals(105, p.getEnergiaTope());
    Assert.assertEquals(105, p1.getSaludTope());
    Assert.assertEquals(105, p1.getEnergiaTope());
    String[] castaA = {"Golpe Critico","Aumentar Evasion","Robar"};
    String[] castaH = {"Bola de Fuego","Curar Aliado","Robar Energia y Salud"};
    String[] castaG = {"Ataque Doble","Aumentar Defensa","Ignorar Defensa"};
    String[] raza = {"Incentivar","Golpe Fatal"};
    Assert.assertArrayEquals(castaA, p.getHabilidadesCasta());
    Assert.assertArrayEquals(castaH, p1.getHabilidadesCasta());
    Assert.assertArrayEquals(castaG, p2.getHabilidadesCasta());
    Assert.assertArrayEquals(raza, p.getHabilidadesRaza());
  }
    
  @Test
  public void testFullOrco(){
    Personaje p = new Orco("Ben Affleck", new Asesino(), 1);
    Personaje p1 = new Orco("Ben Affleck", new Hechicero(), 1);
    Personaje p2 = new Orco("Ben Affleck", new Guerrero(), 1);
    // Testeo que sin importar la casta, sigue teniendo la misma energia y 
    // salud porque eso depende de la Raza
    Assert.assertEquals(110, p.getSaludTope());
    Assert.assertEquals(100, p.getEnergiaTope());
    Assert.assertEquals(110, p1.getSaludTope());
    Assert.assertEquals(100, p1.getEnergiaTope());
    String[] castaA = {"Golpe Critico","Aumentar Evasion","Robar"};
    String[] castaH = {"Bola de Fuego","Curar Aliado","Robar Energia y Salud"};
    String[] castaG = {"Ataque Doble","Aumentar Defensa","Ignorar Defensa"};
    String[] raza = {"Golpe Defensa","Mordisco de Vida"};
    Assert.assertArrayEquals(castaA, p.getHabilidadesCasta());
    Assert.assertArrayEquals(castaH, p1.getHabilidadesCasta());
    Assert.assertArrayEquals(castaG, p2.getHabilidadesCasta());
    Assert.assertArrayEquals(raza, p.getHabilidadesRaza());
  }

  @Test
  public void testFullElfo(){
    Personaje p = new Elfo("Ben Affleck", new Asesino(), 1);
    Personaje p1 = new Elfo("Ben Affleck", new Hechicero(), 1);
    Personaje p2 = new Elfo("Ben Affleck", new Guerrero(), 1);
    // Testeo que sin importar la casta, sigue teniendo la misma energia y 
    // salud porque eso depende de la Raza
    Assert.assertEquals(100, p.getSaludTope());
    Assert.assertEquals(110, p.getEnergiaTope());
    Assert.assertEquals(100, p1.getSaludTope());
    Assert.assertEquals(110, p1.getEnergiaTope());
    String[] castaA = {"Golpe Critico","Aumentar Evasion","Robar"};
    String[] castaH = {"Bola de Fuego","Curar Aliado","Robar Energia y Salud"};
    String[] castaG = {"Ataque Doble","Aumentar Defensa","Ignorar Defensa"};
    String[] raza = {"Golpe Level","Ataque Bosque"};
    Assert.assertArrayEquals(castaA, p.getHabilidadesCasta());
    Assert.assertArrayEquals(castaH, p1.getHabilidadesCasta());
    Assert.assertArrayEquals(castaG, p2.getHabilidadesCasta());
    Assert.assertArrayEquals(raza, p.getHabilidadesRaza());
  }
}
