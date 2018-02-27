package co.edu.unal.poo.conjuntolibros.data;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class Libro {
    private String titulo;
    private int numeroPaginas;
    private double calificacion;
    //Asociacion : Cardinalidad 0..1 o 1
    private Autor autor;    
    //Si fuera arreglo es 
    //private Autor[] autor;
    
    public Libro(String titulo, int numeroPaginas){
        this.titulo=titulo;
        this.numeroPaginas=numeroPaginas;
    };
    
    public String getTitulo(){
        return this.titulo;
    };
    
    public void setTitulo(String titulo){
        this.titulo=titulo;
    };
    
    public int getNumeroPaginas(){
        return this.numeroPaginas;
    };
    
    public void setNumeroPaginas(int numeroPaginas){
        this.numeroPaginas=numeroPaginas;
    };
    
    public double getCalificacion(){
        return this.calificacion;
    };
    
    public void setCalificacion(double calificacion){
        this.calificacion=calificacion;
    };
    
    public Autor getAutor(){
        return autor;
    }
    
    public void setAutor(Autor autor){
        this.autor=autor;
    }
    
    
    
    
}
