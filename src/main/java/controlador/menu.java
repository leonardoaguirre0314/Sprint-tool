package controlador;


@RestController
@RequestMapping("/estudiantes")
public class EstudianteController {
    @Autowired
    private EstudianteService estudianteService;

    @GetMapping
    public List<Estudiante> obtenerTodos() {
        return estudianteService.obtenerTodos();
    }

    @GetMapping("/{id}")
    public Estudiante obtenerPorId(@PathVariable Long id) {
        return estudianteService.obtenerPorId(id);
    }

    @PostMapping
    public void guardar(@RequestBody Estudiante estudiante) {
        estudianteService.guardar(estudiante);
    }
}