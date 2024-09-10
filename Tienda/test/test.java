
import java.util.ArrayList;
import java.util.List;
import modelos.Articulo;
import modelos.Tienda;
import modelos.Venta;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author erika
 */
public class test {
     private Tienda Tienda;
     private Articulo Articulo;
     private Venta Venta;
     private List<Articulo>articulo = new ArrayList<>();
     private Tienda tienda = new Tienda();
    @Before
    public void supertest() {
    Tienda = new Tienda(new ArrayList<>(), new ArrayList<>());
    Venta = new Venta("1A", 120) ;
    }
    
    @Test
    public void registrarVenta(){
        assertTrue(Tienda.addVenta(Venta));
    }
    
    @Test
    public void buscarArticulo(){
        articulo.add(new Articulo("Jeans", 1200));
        articulo.add(new Articulo("blusa", 800));
        List<Articulo> resultado = Tienda.busqueda("Jeans");
        assertEquals(1, resultado.size());
        assertEquals("Jeans", resultado.get(0).getNombre());
    }
        
        
        
        
        
        
        
   }
