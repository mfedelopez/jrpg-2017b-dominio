package testsdominio;

import dominio.NonPlayableCharacter;
import org.junit.Assert;
import org.junit.Test;

public class TestNpc {

  @Test
  public void testOtorgarExp() {
    NonPlayableCharacter npc = new NonPlayableCharacter("Gigante", 1, -1);
    Assert.assertTrue(30 == npc.otorgarExp());
  }
}
