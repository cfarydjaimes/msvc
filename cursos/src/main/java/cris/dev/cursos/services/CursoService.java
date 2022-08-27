package cris.dev.cursos.services;

import java.util.List;
import java.util.Optional;
import cris.dev.cursos.models.Usuario;
import cris.dev.cursos.models.entity.Curso;

public interface CursoService {
    List<Curso> listar();

    Optional<Curso> porId(Long id);

    Optional<Curso> porIdConUsuarios(Long id);

    Curso guardar(Curso curso);

    void eliminar(Long id);

    void eliminarCursoUsuarioPorId(Long id);

    Optional<Usuario> asignarUsuario(Usuario usuario, Long cursoId);

    Optional<Usuario> crearUsuario(Usuario usuario, Long cursoId);

    Optional<Usuario> eliminarUsuario(Usuario usuario, Long cursoId);
}
