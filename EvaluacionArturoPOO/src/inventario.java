import java.util.ArrayList;
import java.util.List;

public class inventario <T> {
    private List<T> inventario= new ArrayList<T>();

    public void add(T producto){
        inventario.add(producto);
    }

    public List<T> getInventario(){
        return inventario;
    }


}
