
import java.util.ArrayList;
import java.util.List;
import junit.framework.Assert;
import modelos.Articulo;
import modelos.Tienda;
import modelos.Venta;
import org.junit.Before;
import org.junit.Test;

 /*
 * @author Erika
 */
public class test1 {
 
       
    @Test
    public void testAddArticulo() {
        List<Articulo> listaArticulos = new ArrayList<>();

        Tienda tienda = new Tienda(listaArticulos, null);

        Articulo art = new Articulo("nombre", 12);

        boolean respuesta = tienda.addArticulo(art);

        Assert.assertTrue(respuesta);

    }

    @Test
    public void testAddVenta() {

        List<Venta> lista = new ArrayList<>();
        Tienda tienda = new Tienda(null, lista);
        Venta venta = new Venta("1", 1, null);

        boolean respuesta = tienda.addVenta(venta);

        Assert.assertTrue(respuesta);

    }

    @Test
    public void buscarArticulo() {
        List<Articulo> listaArticulos = new ArrayList<>();

        Tienda tienda = new Tienda(listaArticulos, null);

        Articulo articulo = new Articulo("Camisa", 12);

        listaArticulos.add(articulo);
        
        List<Articulo> listaencontradros = tienda.busqueda("Camisa");
        
        
        
        Assert.assertTrue(listaencontradros.contains(articulo));

       

    }

}
