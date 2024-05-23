public class LibroDigital extends Libro {
    private String enlaceDescarga;

    public LibroDigital(String titulo, String autor, String isbn, String enlaceDescarga) {
        super(titulo, autor, isbn);
        this.enlaceDescarga = enlaceDescarga;
    }

    public String getEnlaceDescarga() {
        return enlaceDescarga;
    }

    public void setEnlaceDescarga(String enlaceDescarga) {
        this.enlaceDescarga = enlaceDescarga;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Enlace de descarga: " + enlaceDescarga);
    }
}
