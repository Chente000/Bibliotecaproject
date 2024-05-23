public class Empleado extends Persona {
    private String puesto;
    private double salario;

    public Empleado(String nombre, String id, String direccion, String puesto, double salario) {
        super(nombre, id, direccion);
        this.puesto = puesto;
        this.salario = salario;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void registrarLibro(Biblioteca biblioteca, Libro libro) {
        biblioteca.agregarLibro(libro);
        System.out.println("El libro \"" + libro.getTitulo() + "\" ha sido registrado por " + getNombre() + ", " + puesto);
    }

    public void eliminarLibro(Biblioteca biblioteca, Libro libro) {
        biblioteca.eliminarLibro(libro);
        System.out.println("El libro \"" + libro.getTitulo() + "\" ha sido eliminado por " + getNombre() + ", " + puesto);
    }

    public void actualizarLibro(Libro libro, String nuevoTitulo, String nuevoAutor) {
        libro.setTitulo(nuevoTitulo);
        libro.setAutor(nuevoAutor);
        System.out.println("El libro \"" + libro.getTitulo() + "\" ha sido actualizado por " + getNombre() + ", " + puesto);
    }
}
