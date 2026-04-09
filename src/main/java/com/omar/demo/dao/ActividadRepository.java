package com.omar.demo.dao;

import com.omar.demo.domain.Sesion;
import com.omar.demo.domain.TutoradoXAsistencia;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ActividadRepository extends JpaRepository<Actividad, Integer> {

    public List<Actividad> findByNombre(String nombre);

    public List<Actividad> findBySesion(Sesion sesion);

}
