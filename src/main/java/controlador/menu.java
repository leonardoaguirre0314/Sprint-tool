package controlador;

<<<<<<< HEAD
import java.util.Scanner;
=======
@RestController
@RequestMapping("/estudiantes")
public class    EstudianteController {
    @Autowired
    private EstudianteService estudianteService;
>>>>>>> 4a437d4924efbdd5efc1e401aa3f074c0f057d91

public class Menu {
    private EstudianteService estudianteService = new EstudianteService();
    private Scanner scanner = new Scanner(System.in);

    public void mostrarMenu() {
        int opcion = 0;
        do {
            System.out.println("\n--- MENU PRINCIPAL ---");
            System.out.println("1. Agregar estudiante");
            System.out.println("2. Buscar estudiante");
            System.out.println("3. Actualizar estudiante");
            System.out.println("4. Eliminar estudiante");
            System.out.println("5. Listar estudiantes");
            System.out.println("6. Salir");
            System.out.print("Ingrese una opción: ");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    agregarEstudiante();
                    break;
                case 2:
                    buscarEstudiante();
                    break;
                case 3:
                    actualizarEstudiante();
                    break;
                case 4:
                    eliminarEstudiante();
                    break;
                case 5:
                    listarEstudiantes();
                    break;
                case 6:
                    System.out.println("¡Hasta luego!");
                   