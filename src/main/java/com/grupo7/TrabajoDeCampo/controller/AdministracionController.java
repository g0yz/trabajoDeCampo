package com.grupo7.TrabajoDeCampo.controller;
import com.grupo7.TrabajoDeCampo.service.DocumentoService;
import com.grupo7.TrabajoDeCampo.service.GrupoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.grupo7.TrabajoDeCampo.model.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/AdministracionController")
public class AdministracionController {

    @Autowired
    private GrupoService grupoService;
    @Autowired
    private DocumentoService documentoService;

    //crear nuevo grupo
    @PostMapping("/grupos/agregarGrupo")
    public Grupo crearGrupo(@RequestBody Grupo grupo) { return grupoService.crearGrupo(grupo); }

    //listar todos los grupos
    @GetMapping ("/grupos/listarGrupos")
    public List<Grupo> listarGrupos(){ return grupoService.listarGrupos();}

    //obtener un grupo por ID
    @GetMapping("/grupos/obtenerGrupo/{idGrupo}")
    public Optional<Grupo> obtenerGrupoPorId(@PathVariable Long id) {
        return grupoService.obtenerGrupoPorId(id);
    }

    //actualizar grupo
    @PutMapping("/grupos/actualizarGrupo/{idGrupo}")
    public Grupo actualizarGrupo(@PathVariable Long id, @RequestBody Grupo grupo) {
        return grupoService.actualizarGrupo(id, grupo);
    }

    //eliminar grupo
    @DeleteMapping("/grupos/eliminarGrupo/{idGrupo}")
    public void eliminarGrupo(@PathVariable Long id) {
        grupoService.eliminarGrupo(id);
    }

    //crear nuevo Documento
    @PostMapping("/documentos/agregarDocumento/{idGrupo}")
    public Documento crearDocumento(@RequestBody Documento documento, Long idGrupo){
        return documentoService.crearDocumento(documento, idGrupo);
    }

    //listar todos los documentos

    //obtener un documento por ID

    //actualizar un Documento

    //eliminar un Documento



}