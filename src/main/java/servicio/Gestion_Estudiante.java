package servicio;

import java.util.ArrayList;

public class Gestion_Estudiante {
    private ArrayList<Estudiante> estudiantes = new ArrayList<>();

    public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void agregarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    public Estudiante buscarEstudiante(int id) {
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getId() == id) {
                return estudiante;
            }
        }
        return null;
    }

    public void eliminarEstudiante(int id) {
        Estudiante estudiante = buscarEstudiante(id);
        if (estudiante != null) {
            estudiantes.remove(estudiante);
        }
    }

    public void actualizarEstudiante(Estudiante estudiante) {
        Estudiante estudianteExistente = buscarEstudiante(estudiante.getId());
        if (estudianteExistente != null) {
            int indice = estudiantes.indexOf(estudianteExistente);
            estudiantes.set(indice, estudiante);
        }
    }
}
