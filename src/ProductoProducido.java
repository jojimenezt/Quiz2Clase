
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class ProductoProducido extends Producto{
    private String lote;
    private ArrayList materiaPrima;

    public ProductoProducido(String lote, String nombreProducto, String destino, Fecha fechaLlegada, Fecha fechaSalida) {
        super(nombreProducto, destino, fechaLlegada, fechaSalida);
        this.lote = lote;
        this.materiaPrima =new ArrayList();
    }
    
}
