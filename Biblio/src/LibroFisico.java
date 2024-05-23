public class LibroFisico extends Libro {
    private String ubicacion;

    public LibroFisico(String titulo, String autor, String isbn, String ubicacion) {
        super(titulo, autor, isbn);
        this.ubicacion = ubicacion;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Ubicación: " + ubicacion);
    }
}
