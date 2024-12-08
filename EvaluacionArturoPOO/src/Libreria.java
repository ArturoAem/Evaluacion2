import java.util.ArrayList;
import java.util.List;

public class Libreria {
    private String nombreLibreria;

    private List<Categoria> listaCategoria = new ArrayList<>();

    public Libreria(String nombreLibreria) {
        this.nombreLibreria = nombreLibreria;
        this.listaCategoria = new ArrayList<>();
    }

    public Libreria() {
    }

    public String getNombreLibreria() {
        return nombreLibreria;
    }

    public void setNombreLibreria(String nombreLibreria) {
        this.nombreLibreria = nombreLibreria;
    }

    public void agregarCategoria (Categoria nombreCategoria){
        listaCategoria.add(nombreCategoria);
    }

    public void mostrarInventario (){
        System.out.println("Libreria: " + getNombreLibreria());
        for(Categoria seccion:listaCategoria){
            seccion.mostrarCategoria();
        }
    }
}
