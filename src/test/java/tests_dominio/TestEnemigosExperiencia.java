package tests_dominio;

import dominio.Guerrero;
import dominio.Humano;
import dominio.MyRandomStub;
import dominio.NonPlayableCharacter;
import dominio.Personaje;

import org.junit.Assert;
import org.junit.Test;

public class TestEnemigosExperiencia {

  @Test
  public void testPjvsNpc() {
    Humano h = new Humano("Nicolas", new Guerrero(), 1);
    Personaje.cargarTablaNivel();
    Assert.assertTrue(h.getExperiencia() == 0);
    h.setRandom(new MyRandomStub(0.49,3));
    NonPlayableCharacter npc = new NonPlayableCharacter("Gigante", 1, 0);
    npc.setRandom(new MyRandomStub(0.49,3));
    while (npc.estaVivo()) {
      h.atacar(npc);
    }
    h.ganarExperiencia(npc.otorgarExp());
    Assert.assertTrue(h.getExperiencia() == 30);
  }

  @Test
  public void testMasFuerteMasExperiencia() {
    NonPlayableCharacter npc = new NonPlayableCharacter("Gigante", 1, 0);
    NonPlayableCharacter npc2 = new NonPlayableCharacter("Gigante", 2, 0);

    Assert.assertTrue(npc.otorgarExp() < npc2.otorgarExp());
  }

  @Test
  public void testPjvsPj() {
    Humano h = new Humano("Nicolas", new Guerrero(), 1);
    Humano h2 = new Humano("Lautaro", new Guerrero(), 2);
    Personaje.cargarTablaNivel();
    h.setRandom(new MyRandomStub(0.49,3));
    h2.setRandom(new MyRandomStub(0.49,3));
    Assert.assertTrue(h.getExperiencia() == 0);
    Assert.assertTrue(h2.getExperiencia() == 0);
        
    while (h2.estaVivo()) {
      h.atacar(h2);
    }
        
    h.ganarExperiencia(h2.otorgarExp());
    Assert.assertTrue(h.getExperiencia() == 40);
    Assert.assertTrue(h2.getExperiencia() == 0);

  }
}
