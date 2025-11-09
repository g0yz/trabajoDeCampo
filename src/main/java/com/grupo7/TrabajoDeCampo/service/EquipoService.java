package com.grupo7.TrabajoDeCampo.service;


import com.grupo7.TrabajoDeCampo.model.Equipo;
import com.grupo7.TrabajoDeCampo.model.Grupo;
import com.grupo7.TrabajoDeCampo.repository.EquipoRepository;
import com.grupo7.TrabajoDeCampo.repository.GrupoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EquipoService {

    private final EquipoRepository equipoRepository;
    private final GrupoRepository grupoRepository;

    public EquipoService (EquipoRepository equipoRepository, GrupoRepository grupoRepository){
        this.equipoRepository = equipoRepository;
        this.grupoRepository = grupoRepository;
    }

    public List<Equipo> listarEquipos(){
        return equipoRepository.findAll();
    }

    public Optional<Equipo> obtenerEquipoPorId(Long id){
        return equipoRepository.findById(id);
    }

    public Equipo crearEquipo(Equipo equipo, Long idGrupo){
        Grupo grupo = grupoRepository.findById(idGrupo)
                .orElseThrow(() -> new RuntimeException("Grupo no encontrado con id: " + idGrupo));
        equipo.setGrupo(grupo);
        return equipoRepository.save(equipo);
    }

    public Equipo actualizarEquipo(Long id, Equipo equipoActualizado){
        Equipo equipo = equipoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Equipo no encontrado con id: " + id));
        equipo.setDenominacion(equipoActualizado.getDenominacion());
        equipo.setFechaIncorporacion(equipoActualizado.getFechaIncorporacion());
        equipo.setMontoInvertido(equipoActualizado.getMontoInvertido());
        equipo.setDescripcion(equipoActualizado.getDescripcion());
        if (equipoActualizado.getGrupo() != null) {
            equipo.setGrupo(equipoActualizado.getGrupo());
        }
        return equipoRepository.save(equipo);
    }

    public void eliminarEquipo(Long id){
        equipoRepository.deleteById(id);
    }

}

