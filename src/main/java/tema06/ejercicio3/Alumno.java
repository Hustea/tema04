package tema06.ejercicio3;

import java.util.*;

class Alumno {
    private int nia;
    private String nombre;
    private String apellidos;
    private String fechaNacimiento;
    private String grupo;
    private String telefono;

    // Constructor
    public Alumno(int nia, String nombre, String apellidos, String fechaNacimiento, String grupo, String telefono) {
        this.nia = nia;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.grupo = grupo;
        this.telefono = telefono;
    }

    // Getters
    public int getNia() {
        return nia;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getGrupo() {
        return grupo;
    }

    public String getTelefono() {
        return telefono;
    }

    // Calcula la edad a partir de la fecha de nacimiento (formato dd-MM-yyyy)
    public int calcularEdad() {
        int añoNacimiento = Integer.parseInt(fechaNacimiento.split("-")[2]);
        int añoActual = Calendar.getInstance().get(Calendar.YEAR);
        return añoActual - añoNacimiento;
    }

    // Representación del alumno como String
    @Override
    public String toString() {
        return String.format("%-10d %-10s %-15s %-12s %-8s %-12s",
                nia, nombre, apellidos, fechaNacimiento, grupo, telefono);
    }
}

class GestionAlumnos {
    private List<Alumno> alumnos = new ArrayList<>();

    // agregar alumnos con validación de NIA único
    public boolean agregarAlumno(Alumno alumno) {
        for (Alumno a : alumnos) {
            if (a.getNia() == alumno.getNia()) {
                return false; // NIA ya existe
            }
        }
        alumnos.add(alumno);
        return true;
    }

    //eliminar alumno por NIA
    public boolean eliminarAlumno(int nia) {
        return alumnos.removeIf(alumno -> alumno.getNia() == nia);
    }

    // Buscar alumnos por grupo
    public List<Alumno> buscarPorGrupo(String grupo) {
        List<Alumno> resultado = new ArrayList<>();
        for (Alumno alumno : alumnos) {
            if (alumno.getGrupo().equalsIgnoreCase(grupo)) {
                resultado.add(alumno);
            }
        }
        return resultado;
    }

    // Buscar alumnos por edad
    public List<Alumno> buscarPorEdad(int edad) {
        List<Alumno> resultado = new ArrayList<>();
        for (Alumno alumno : alumnos) {
            if (alumno.calcularEdad() == edad) {
                resultado.add(alumno);
            }
        }
        return resultado;
    }

    // Buscar alumno por NIA
    public Alumno buscarPorNia(int nia) {
        for (Alumno alumno : alumnos) {
            if (alumno.getNia() == nia) {
                return alumno;
            }
        }
        return null;
    }

    // Buscar alumnos por apellido
    public List<Alumno> buscarPorApellidos(String prefijo) {
        List<Alumno> resultado = new ArrayList<>();
        for (Alumno alumno : alumnos) {
            if (alumno.getApellidos().toLowerCase().startsWith(prefijo.toLowerCase())) {
                resultado.add(alumno);
            }
        }
        return resultado;
    }

    // Registrar alumnos de prueba
    public void registrarAlumnosPrueba() {
        agregarAlumno(new Alumno(1036652, "Juan", "Mengual", "20-02-2002", "1DAM", "965174521"));
        agregarAlumno(new Alumno(1025456, "María", "Piera", "05-03-2004", "1DAM", "965165854"));
        agregarAlumno(new Alumno(1035622, "Vicent", "Tormo", "18-09-1991", "1DAM", "632546598"));
    }

    // Mostrar lista de alumnos en formato tabla
    public void mostrarLista(List<Alumno> lista) {
        if (lista.isEmpty()) {
            System.out.println("No se encontraron resultados.");
            return;
        }
        System.out.printf("%-10s %-10s %-15s %-12s %-8s %-12s%n", "NIA", "Nombre", "Apellidos", "Nacimiento", "Grupo", "Teléfono");
        for (Alumno a : lista) {
            System.out.println(a);
        }
    }
}

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static GestionAlumnos gestion = new GestionAlumnos();

    public static void main(String[] args) {
        gestion.registrarAlumnosPrueba(); // Cargar datos de prueba

        int opcion;
        do {
            System.out.println("\n***************************");
            System.out.println("**  GESTIÓN ALUMNOS  **");
            System.out.println("***************************");
            System.out.println("1. Nuevo alumno");
            System.out.println("2. Baja de alumno");
            System.out.println("3. Consultas");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    agregarAlumno();
                    break;
                case 2:
                    eliminarAlumno();
                    break;
                case 3:
                    menuConsultas();
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 0);
    }

    private static void agregarAlumno() {
        System.out.print("NIA: ");
        int nia = scanner.nextInt();
        scanner.nextLine(); // Limpiar buffer
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Apellidos: ");
        String apellidos = scanner.nextLine();
        System.out.print("Fecha de nacimiento (dd-MM-yyyy): ");
        String fechaNacimiento = scanner.nextLine();
        System.out.print("Grupo: ");
        String grupo = scanner.nextLine();
        System.out.print("Teléfono: ");
        String telefono = scanner.nextLine();

        Alumno nuevoAlumno = new Alumno(nia, nombre, apellidos, fechaNacimiento, grupo, telefono);
        if (gestion.agregarAlumno(nuevoAlumno)) {
            System.out.println("Alumno registrado exitosamente.");
        } else {
            System.out.println("Error: NIA ya registrado.");
        }
    }

    private static void eliminarAlumno() {
        System.out.print("Ingrese el NIA del alumno a eliminar: ");
        int nia = scanner.nextInt();
        scanner.nextLine(); // Limpiar buffer
        System.out.print("¿Está seguro? (s/n): ");
        String confirmacion = scanner.nextLine();
        if (confirmacion.equalsIgnoreCase("s")) {
            if (gestion.eliminarAlumno(nia)) {
                System.out.println("Alumno eliminado.");
            } else {
                System.out.println("Alumno no encontrado.");
            }
        }
    }

    private static void menuConsultas() {
        System.out.println("Submenú de consultas...");
        // Implementar menú de consultas como en el enunciado
    }
}
