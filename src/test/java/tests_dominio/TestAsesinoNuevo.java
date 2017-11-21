package tests_dominio;

import org.junit.Assert;
import org.junit.Test;

import dominio.Asesino;
import dominio.Humano;
import dominio.MyRandomStub;
import dominio.Personaje;

public class TestAsesinoNuevo {

  @Test
  public void testHabilidad1() {
    Personaje p1 = new Humano("Ben Affleck",new Asesino(),2);
    Personaje p2 = new Humano("Batman",new Asesino(),2);
    p1.setRandom(new MyRandomStub(0.49,3));
    p2.setRandom(new MyRandomStub(0.49,3));
    p1.reducirEnergia(105);
    Assert.assertFalse(p1.habilidadCasta1(p2));
  }
  
  @Test
  public void testHabilidad1S() {
    Personaje p1 = new Humano("Ben Affleck",new Asesino(),2);
    Personaje p2 = new Humano("Batman",new Asesino(),2);
    p1.setRandom(new MyRandomStub(0.49,3));
    p2.setRandom(new MyRandomStub(0.49,3));
    p1.setAtaque(0);
    Assert.assertFalse(p1.habilidadCasta1(p2));
  }
  
    
  @Test
  public void testHabilidad2() {
    Personaje p1 = new Humano("Ben Affleck",new Asesino(),2);
    Personaje p2 = new Humano("Batman",new Asesino(),2);
    p1.setRandom(new MyRandomStub(0.49,3));
    p2.setRandom(new MyRandomStub(0.49,3));
    p1.reducirEnergia(105);
    Assert.assertFalse(p1.habilidadCasta2(p2));
  }
    
  @Test
  public void testHabilidad3() {
    Personaje p1 = new Humano("Ben Affleck",new Asesino(),2);
    p1.setRandom(new MyRandomStub(0.49,3));
    Assert.assertFalse(p1.habilidadCasta3(null));
  }

}
