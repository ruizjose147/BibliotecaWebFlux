package com.sofkau.libraryReactive2.dto;

import java.time.LocalDate;

public class RecursoDTO {
    private String idRecurso;
    private String tituloRecurso;
    private String clasificacionRecurso;
    private String areaRecurso;
    private boolean recursoPrestado = false;
    private LocalDate fechaPrestado = null;

    public RecursoDTO(String idRecurso, String tituloRecurso, String clasificacionRecurso, String areaRecurso, boolean recursoPrestado){

    }

    public RecursoDTO(String idRecurso, String tituloRecurso, String clasificacionRecurso, String areaRecurso, boolean recursoPrestado, LocalDate fechaPrestado) {
        this.idRecurso = idRecurso;
        this.tituloRecurso = tituloRecurso;
        this.clasificacionRecurso = clasificacionRecurso;
        this.areaRecurso = areaRecurso;
        this.recursoPrestado = recursoPrestado;
        this.fechaPrestado = fechaPrestado;
    }

    public RecursoDTO() {

    }

    public String getIdRecurso() {
        return idRecurso;
    }

    public void setIdRecurso(String idRecurso) {
        this.idRecurso = idRecurso;
    }

    public String getTituloRecurso() {
        return tituloRecurso;
    }

    public void setTituloRecurso(String tituloRecurso) {
        this.tituloRecurso = tituloRecurso;
    }

    public String getClasificacionRecurso() {
        return clasificacionRecurso;
    }

    public void setClasificacionRecurso(String clasificacionRecurso) {
        this.clasificacionRecurso = clasificacionRecurso;
    }

    public String getAreaRecurso() {
        return areaRecurso;
    }

    public void setAreaRecurso(String areaRecurso) {
        this.areaRecurso = areaRecurso;
    }

    public boolean isRecursoPrestado() {
        return recursoPrestado;
    }

    public void setRecursoPrestado(boolean recursoPrestado) {
        this.recursoPrestado = recursoPrestado;
    }

    public LocalDate getFechaPrestado() {
        return fechaPrestado;
    }

    public void setFechaPrestado(LocalDate fechaPrestado) {
        this.fechaPrestado = fechaPrestado;
    }
}