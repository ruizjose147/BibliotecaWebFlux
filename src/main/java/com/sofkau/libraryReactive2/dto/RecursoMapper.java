package com.sofkau.libraryReactive2.dto;

import com.sofkau.libraryReactive2.collections.Recurso;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;

@Component
public class RecursoMapper {

    public Recurso fromDTO(RecursoDTO dto) {
        Recurso recurso = new Recurso();
        recurso.setIdRecurso(dto.getIdRecurso());
        recurso.setTituloRecurso(dto.getTituloRecurso());
        recurso.setClasificacionRecurso(dto.getClasificacionRecurso());
        recurso.setAreaRecurso(dto.getAreaRecurso());
        recurso.setRecursoPrestado(dto.isRecursoPrestado());
        recurso.setFechaPrestado(dto.getFechaPrestado());
        return recurso;
    }

    public RecursoDTO fromCollection(Recurso collection) {
        RecursoDTO recursoDTO = new RecursoDTO();
        recursoDTO.setIdRecurso(collection.getIdRecurso());
        recursoDTO.setTituloRecurso(collection.getTituloRecurso());
        recursoDTO.setClasificacionRecurso(collection.getClasificacionRecurso());
        recursoDTO.setAreaRecurso(collection.getAreaRecurso());
        recursoDTO.setRecursoPrestado(collection.isRecursoPrestado());
        recursoDTO.setFechaPrestado(collection.getFechaPrestado());
        return recursoDTO;
    }

    public List<RecursoDTO> fromCollectionList(List<Recurso> collection) {
        if (collection == null) {
            return null;
        }
        List<RecursoDTO> list = new ArrayList(collection.size());
        Iterator listTracks = collection.iterator();

        while(listTracks.hasNext()) {
            Recurso recurso = (Recurso) listTracks.next();
            list.add(fromCollection(recurso));
        }

        return list;
    }

    public Function<RecursoDTO, Recurso> mapperToDato(String id) {
        return updateDato -> {
            var recurso = new Recurso();
            recurso.setIdRecurso(id);
            recurso.setTituloRecurso(updateDato.getTituloRecurso());
            recurso.setClasificacionRecurso(updateDato.getClasificacionRecurso());
            recurso.setAreaRecurso(updateDato.getAreaRecurso());
            recurso.setRecursoPrestado(updateDato.isRecursoPrestado());
            recurso.setFechaPrestado(updateDato.getFechaPrestado());
            return recurso;
        };
    }

    public Function<Recurso, RecursoDTO> mapDatoToDTO() {
        return entity -> new RecursoDTO(entity.getIdRecurso(), entity.getTituloRecurso(), entity.getClasificacionRecurso(), entity.getAreaRecurso(), entity.isRecursoPrestado());
    }
}
