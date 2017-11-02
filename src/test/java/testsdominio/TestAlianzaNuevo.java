package testsdominio;

import dominio.Alianza;
import org.junit.Assert;
import org.junit.Test;

public class TestAlianzaNuevo {

  @Test
  public void testGetNombre() {
    Alianza ali = new Alianza("Los Isotopos");
    Assert.assertEquals("Los Isotopos", ali.obtenerNombre());
  }
        

}
