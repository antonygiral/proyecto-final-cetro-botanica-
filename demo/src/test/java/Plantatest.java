import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PlantaTest {

   @Test
   public void testAgregarCuidado() {
        Planta planta = new Planta("Rosa", "Arbusto");
        Cuidado cuidado = new Cuidado(/* ... */); 

        planta.agregarCuidado(cuidado);

        assertTrue(planta.getCuidados().contains(cuidado));
   }

    @Test
    public void testGetCuidados() {
        Planta planta = new Planta("Girasol", "Flor");
        Cuidado cuidado1 = new Cuidado(/* ... */); 
        Cuidado cuidado2 = new Cuidado(/* ... */); 

        planta.agregarCuidado(cuidado1);
        planta.agregarCuidado(cuidado2);

        assertEquals(2, planta.getCuidados().size());
    }
}
    

