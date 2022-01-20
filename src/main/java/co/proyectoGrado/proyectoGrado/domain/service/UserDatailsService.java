package co.proyectoGrado.proyectoGrado.domain.service;

import co.proyectoGrado.proyectoGrado.domain.model.Docente;
import co.proyectoGrado.proyectoGrado.domain.model.Estudiante;
import co.proyectoGrado.proyectoGrado.domain.repository.DocenteRepository;
import co.proyectoGrado.proyectoGrado.domain.repository.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDatailsService implements UserDetailsService {

    private final EstudianteRepository estudianteRepository;
    private final DocenteRepository docenteRepository;

    @Autowired
    public UserDatailsService(EstudianteRepository estudianteRepository, DocenteRepository docenteRepository) {
        this.estudianteRepository = estudianteRepository;
        this.docenteRepository = docenteRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String email){
        Estudiante estudiante =  estudianteRepository.get(email);
        Docente docente = docenteRepository.get(email);
        if(estudiante==null && docente == null) {
            throw new UsernameNotFoundException(email);
        }
        return getUser(estudiante, docente);
    }

    private UserDetails getUser(Estudiante estudiante, Docente docente){
        if(estudiante!=null){
            return User.withUsername(estudiante.getCorreo()).
                    password(estudiante.getContrasena()).build();
        }else{
            return User.withUsername(docente.getCorreo()).
                    password(docente.getContrasena()).build();
        }
    }
}
