package com.grupo7.TrabajoDeCampo.controller;

import com.grupo7.TrabajoDeCampo.model.Equipo;
import com.grupo7.TrabajoDeCampo.service.EquipoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/equipos")
public class EquipoController {

    @Autowired
    private EquipoService equipoService;

    @PostMapping("/agregarEquipo/{idGrupo}")
    public Equipo crearEquipo(@RequestBody Equipo equipo, @PathVariable Long idGrupo){
        return equipoService.crearEquipo(equipo, idGrupo);
    }

    @GetMapping("/listarEquipos")
    public List<Equipo> listarEquipos(){
        return equipoService.listarEquipos();
    }

    @GetMapping("/obtenerEquipo/{idEquipo}")
    public Optional<Equipo> obtenerEquipoPorId(@PathVariable Long idEquipo){
        return equipoService.obtenerEquipoPorId(idEquipo);
    }

    @PutMapping("/actualizarEquipo/{idEquipo}")
    public Equipo actualizarEquipo(@PathVariable Long idEquipo, @RequestBody Equipo equipo){
        return equipoService.actualizarEquipo(idEquipo, equipo);
    }

    @DeleteMapping("/eliminarEquipo/{idEquipo}")
    public void eliminarEquipo(@PathVariable Long idEquipo){
        equipoService.eliminarEquipo(idEquipo);
    }
}
