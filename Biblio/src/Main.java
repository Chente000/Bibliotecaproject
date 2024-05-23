public class Main {
    public static void main(String[] args) {
        System.out.println("Sistema de Gestión de Biblioteca");

        // Crear una biblioteca
        Biblioteca biblioteca = new Biblioteca();

        // Crear algunos libros
        Libro libro1 = new LibroFisico("El Quijote", "Miguel de Cervantes", "123456789", "A1");
        Libro libro2 = new LibroDigital("Clean Code", "Robert C. Martin", "987654321", "www.example.com/download");

        // Agregar libros a la biblioteca
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);

        // Crear un miembro
        Miembro miembro = new Miembro("Juan Perez", "001", "Calle Falsa 123");

        // Registrar miembro en la biblioteca
        biblioteca.registrarMiembro(miembro);

        // Prestar un libro al miembro
        miembro.prestarLibro(libro1);

        // Mostrar información del libro prestado
        libro1.mostrarInformacion();

        // Devolver el libro
        miembro.devolverLibro(libro1);

        // Mostrar información del libro devuelto
        libro1.mostrarInformacion();
    }
}

