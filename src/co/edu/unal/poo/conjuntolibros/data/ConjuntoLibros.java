
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
        if (this.libros[i].getAutor().getNombre().equals(autor) ){
            this.libros[i]= null;
        }
    }    
    return this.libros;
}

// APRENDIZAJE POO BASADO EN CASOS GITBOOK
// FUNDAMENTOS DE PROGRAMACION APRENDIZAJE ACTIVO BASADO EN POO GITBOOK

public Libro mostrarLibroMayorCalificacion(Libro libro){
    Libro mayorCalificado = null;
    for (int i = 0; i < this.libros.length; i++) {
        
        if (this.libros[i] != null && mayorCalificado == null){
            mayorCalificado=this.libros[i];
        } else {
            if (this.libros[i] != null && this.libros[i].getCalificacion() > mayorCalificado.getCalificacion()){
                mayorCalificado = this.libros[i];
            }
        }
    };
    return mayorCalificado;
};

//Se es experto programador al comprender situacines y poder modelar

public Libro mostrarLibroMenorCalificacion(Libro libro){
    Libro menorCalificado = null;
    
    for (int i = 0; i < this.libros.length; i++) {
        
        if (this.libros[i] != null && menorCalificado == null){
            menorCalificado=this.libros[i];
        } else {
            if (this.libros[i] != null && this.libros[i].getCalificacion() > menorCalificado.getCalificacion()){
                menorCalificado = this.libros[i];
            }
        }
    };
    return menorCalificado;
};

public Libro[] mostrarLibros(){
    return this.libros;
};

public boolean calificarLibroxTitulo(Libro libro, double valor, String titulo){
    for (int i = 0; i < this.libros.length; i++) {
        if(this.libros[i].getTitulo().equals(titulo)){
            
            this.libros[i].setCalificacion(valor);
            return true;
        } else {
            return false;
        }
    }
    return false;
};

//boolean si se desea informar al usuario
public boolean calificarLibroxPosicion(int pos, double valor){
    this.libros[pos].setCalificacion(valor);
    return true;
}; 
    
        
}
