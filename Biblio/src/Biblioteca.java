import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Libro> libros;
    private List<Miembro> miembros;

    public Biblioteca() {
        libros = new ArrayList<>();
        miembros = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public void eliminarLibro(Libro libro) {
        libros.remove(libro);
    }

    public void registrarMiembro(Miembro miembro) {
        miembros.add(miembro);
    }

    public void eliminarMiembro(Miembro miembro) {
        miembros.remove(miembro);
    }

    public Libro buscarLibro(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equals(titulo)) {
                return libro;
            }
        }
        return null;
    }

    public Miembro buscarMiembro(String id) {
        for (Miembro miembro : miembros) {
            if (miembro.getID().equals(id)) {
                return miembro;
            }
        }
        return null;
    }
}
