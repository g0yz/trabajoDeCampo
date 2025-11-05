package com.grupo7.TrabajoDeCampo.service;


import com.grupo7.TrabajoDeCampo.model.Equipo;
import com.grupo7.TrabajoDeCampo.repository.EquipoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EquipoService {

    private final EquipoRepository equipoRepository;

    public EquipoService (EquipoRepository equipoRepository){
        this.equipoRepository = equipoRepository;
    }

    public List<Equipo> listarEquipos(){
        return equipoRepository.findAll();
    }

    public Equipo crearEquipo(Equipo equipo){
        return equipoRepository.save(equipo);
    }

    //public Equipo actualizarEquipo(Long id, Equipo equipoActualizado){}

    public void eliminarEquipo(Long id){
        equipoRepository.deleteById(id);
    }

}

