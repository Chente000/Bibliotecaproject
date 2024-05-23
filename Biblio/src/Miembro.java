import java.util.ArrayList;
import java.util.List;

public class Miembro extends Persona {
    private List<Libro> librosPrestados;

    public Miembro(String nombre, String id, String direccion) {
        super(nombre, id, direccion);
        librosPrestados = new ArrayList<>();
    }

    public void prestarLibro(Libro libro) {
        librosPrestados.add(libro);
        libro.setEstado("Prestado");
    }

    public void devolverLibro(Libro libro) {
        librosPrestados.remove(libro);
        libro.setEstado("Disponible");
    }
}
