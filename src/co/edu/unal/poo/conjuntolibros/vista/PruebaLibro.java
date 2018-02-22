package co.edu.unal.poo.conjuntolibros.vista;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import co.edu.unal.poo.conjuntolibros.data.*;

import java.util.Scanner;
/**
 *
 * @author Estudiante

*/
// **********************
// **********************
// ****** Revisar bluej.org       *****
// ****** Revisar greenfoot.org   *****
// ****** Revisar jelliot   *****
// **********************
// *********************
public class PruebaLibro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nombre Autor");
        String nombre= sc.next();
        String m= sc.next();
        
        Autor autor = new Autor(nombre, "Marquez", "245712");
        
        Autor autor2 = new Autor(m, "Marquez", "245712");
        
        Libro libro = new Libro("Cien annios soledad", 300);
        Libro libro2 = new Libro("2MIL annios soledad", 300);
        
        //Asociar el libro con el autor
        libro.setAutor(autor);
        
        //
        
        libro2.setAutor(autor2);
        
        String autorLibro = libro.getAutor().getNombre()+ " " +libro.getAutor().getApellido();
        System.out.println(autorLibro);
        System.out.println(libro.getTitulo());
        
        System.out.println("*********");
        String autorLibro2 = libro2.getAutor().getNombre()+ " " +libro2.getAutor().getApellido();
        System.out.println(autorLibro2);
        System.out.println(libro2.getTitulo());
        
        
        
    }
    
}
