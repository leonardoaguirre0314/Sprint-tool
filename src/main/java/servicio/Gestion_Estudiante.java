package servicio;

public class Gestion_Estudiante {
    private List<Estudiante> estudiantes = new ArrayList<>();

    public List<Estudiante> obtenerTodos() {
        return estudiantes;
    }

    public Estudiante obtenerPorId(Long id) {
        return estudiantes.stream()
                .filter(estudiante -> estudiante.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public void guardar(Estudiante estudiante) {
        estudiante.setId(generarId());
        estudiantes.add(estudiante);
    }

    private Long generarId() {
        return estudiantes.stream()
                .mapToLong(Estudiante::getId)
                .max()
                .orElse(0L) + 1;
    }
}
