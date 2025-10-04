package com.grupo7.TrabajoDeCampo.controller;
import com.grupo7.TrabajoDeCampo.model.CreatorGrupo;
import com.grupo7.TrabajoDeCampo.model.CreatorPersonal;
import com.grupo7.TrabajoDeCampo.model.Documentacion;
import com.grupo7.TrabajoDeCampo.model.EquipamientoEInfraestructura;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/AdministracionController")
public class AdministracionController {


    private final EquipamientoEInfraestructura equipamientoEInfraestructa;
    private final Documentacion documentacion;
    private final CreatorPersonal creatorPersonal;
    private final CreatorGrupo creatorGrupo;

    public AdministracionController(EquipamientoEInfraestructura equipamientoEInfraestructura, Documentacion documentacion, CreatorPersonal creatorPersonal, CreatorGrupo creatorGrupo) {
        this.equipamientoEInfraestructa = equipamientoEInfraestructura; // aquí se inicializa modulo Equip.
        this.documentacion = documentacion; // aqui se inicializa modulo Docum.
        this.creatorPersonal = creatorPersonal; //aqui se inicializa modulo CreatorPersonal.
        this.creatorGrupo = creatorGrupo;// aqui se inicializa modulo CreatorGrupo.
    }




}