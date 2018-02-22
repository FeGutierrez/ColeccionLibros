/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unal.poo.conjuntolibros.data;

/**
 *
 * @author Estudiante
 */
public class ConjuntoLibros {
    
    //Asociacion
    private Libro[] libros;
    
    
    public ConjuntoLibros(){
        this.libros = new Libro[20];
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

public boolean eliminarLibroxAutor(String nombre){
    return true;
}

public boolean eliminarLibroxTitulo(String titulo){
    return true;
}

public Libro mostrarLibroMayorCalificacion(){
    
};

public Libro mostrarLibroMenorCalificacion(){
    
};

public Libro[] mostrarLibros(){
    
};

public boolean calificarLibro(String titulo, int valor){
    
};
    
    
        
}
