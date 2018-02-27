
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unal.poo.conjuntolibros.data;

import java.util.Scanner;
/**
 *
 * @author Estudiante
 */
public class ConjuntoLibros {
    
    //Asociacion
    private Libro[] libros;
    
    Scanner sc = new Scanner(System.in);   

    
    
    public ConjuntoLibros(int tam){
        this.libros = new Libro[tam];
    };
    
    
    
    
public boolean anadirLibro (Libro libro){
    int posVacio = -1;
    for (int i = 0; i < this.libros.length ; i++) {
        if (this.libros[i]==null){
            posVacio = i;
            break;
        }
    }
        if (posVacio!=-1){
            this.libros[posVacio] = libro;
                return true;
        } else {
                return false;
        }
 };

public Libro[] eliminarLibroxTitulo(Libro libro, String titulo){  
    for (int i = 0; i < this.libros.length; i++) {
        if (this.libros[i].getTitulo().equals(titulo) ){
            this.libros[i]= null;
        }
    }
    return this.libros;
};

public Libro[] eliminarLibroxAutor(Libro libro, String autor){   
    for (int i = 0; i < this.libros.length; i++) {
        if (this.libros[i].getAutor().equals(autor) ){
            this.libros[i]= null;
        }
    }    
    return this.libros;
}
public double mostrarLibroMayorCalificacion(Libro libro){
    double mayor = 0;
    for (int i = 0; i < this.libros.length; i++) {
        if (mayor<this.libros[i].getCalificacion()){
            mayor=this.libros[i].getCalificacion();
        } else {
            mayor = mayor; //No se si en esta linea sea convenienete simplemente eliminar el else, ya que si el valor de la posicion no es mayor que el comodin
            // El valor de "mayor" deberia permanecer igual
        }
    }
    return mayor;
};

public double mostrarLibroMenorCalificacion(Libro libro){
    double menor = this.libros[0].getCalificacion();
    for (int i = 0; i < this.libros.length; i++) {
        if (menor>this.libros[i].getCalificacion()){
            menor=this.libros[i].getCalificacion();
        } else {
            menor = menor; //No se si en esta linea sea convenienete simplemente eliminar el else, ya que si el valor de la posicion no es mayor que el comodin
            // El valor de "mayor" deberia permanecer igual
        }
    }
    return menor;
};

public Libro[] mostrarLibros(){
    return this.libros;
};

public void calificarLibroxTitulo(Libro libro, double valor, String titulo){
    for (int i = 0; i < this.libros.length; i++) {
        if(this.libros[i].getTitulo().equals(titulo)){
            this.libros[i].setCalificacion(valor);
        } else {
            System.out.println("El titulo solicitado no ha sido registrado");
        }
    }
    
};

public void calificarLibroxPosicion(Libro libro, double valor, int pos){
    this.libros[pos].setCalificacion(valor);
}; 
    
        
}
