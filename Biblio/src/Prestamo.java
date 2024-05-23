import java.time.LocalDate;

public class Prestamo {
    private Libro libro;
    private Miembro miembro;
    private LocalDate fechaPrestamo;
    private LocalDate fechaDevolucion;

    public Prestamo(Libro libro, Miembro miembro) {
        this.libro = libro;
        this.miembro = miembro;
        this.fechaPrestamo = LocalDate.now();
        this.fechaDevolucion = fechaPrestamo.plusWeeks(2); // Por ejemplo, 2 semanas de préstamo.
    }

    public Libro getLibro() {
        return libro;
    }

    public Miembro getMiembro() {
        return miembro;
    }

    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void registrarDevolucion() {
        this.fechaDevolucion = LocalDate.now();
    }
}
