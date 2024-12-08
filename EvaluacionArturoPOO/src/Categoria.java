import java.util.ArrayList;
import java.util.List;

public class Categoria {
    private String nombreCategoria;

    private List<ProductoAbstracto> listaProductos = new ArrayList<>();

    public Categoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
        this.listaProductos = new ArrayList<>();
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }

    public void addProductos(ProductoAbstracto producto){
        listaProductos.add(producto);
    }


    public void mostrarCategoria(){
        System.out.println(">Categoria: " + getNombreCategoria());
        for(ProductoAbstracto producto:listaProductos){
            producto.mostrarProducto();
        }
    }



}
