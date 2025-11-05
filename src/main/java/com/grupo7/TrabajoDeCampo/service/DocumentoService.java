package com.grupo7.TrabajoDeCampo.service;

import com.grupo7.TrabajoDeCampo.model.Documento;
import com.grupo7.TrabajoDeCampo.model.Grupo;
import com.grupo7.TrabajoDeCampo.repository.DocumentoRepository;
import com.grupo7.TrabajoDeCampo.repository.GrupoRepository;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class DocumentoService {


    private final DocumentoRepository documentoRepository;
    private final GrupoRepository grupoRepository;

    public DocumentoService(DocumentoRepository documentoRepository,
                            GrupoRepository grupoRepository){
        this.documentoRepository = documentoRepository;
        this.grupoRepository = grupoRepository;
    }

    public List<Documento> listarDocumento(){
        return documentoRepository.findAll();
    }

    public Optional<Documento> obtenerDocumentoPorId(Long id){
        return documentoRepository.findById(id);
    }

    public Documento crearDocumento(Documento documento, Long idGrupo){
        Grupo grupo = grupoRepository.findById(idGrupo)
        .orElseThrow(() -> new RuntimeException("Grupo no encontrado con id: " + idGrupo));
        documento.setGrupo(grupo);
        return documentoRepository.save(documento);
    }


    //public Documento actualizarDocumento(Long id, Documento documentoActualizado){}


    public void eliminarDocumento(Long id){
        documentoRepository.deleteById(id);
    }


}
