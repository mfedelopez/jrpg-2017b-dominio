package tests_dominio;

import dominio.*;
import org.junit.Assert;
import org.junit.Test;

public class TestAtaqueCritico {

  @Test
  public void testgolpeCrit(){
    Humano h = new Humano("Nicolas",new Guerrero(),1);
    Assert.assertEquals(h.getAtaque()*1.5, h.golpe_critico(), 1);
  }
}
