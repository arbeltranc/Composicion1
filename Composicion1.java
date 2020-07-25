/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composicion1;

/**
 *
 * @author ALEX BELTRAN
 */
import java.util.*;
class Pagina{
    private String contenido;
    private int numero;

public Pagina(String contenido,int numero){
this.contenido=new String(contenido);
this.numero=numero;
}
public String getContenido(){
return this.contenido;
}
public void setContenido(String nuevo_contenido){
this.contenido=nuevo_contenido;
}
public int getNumero(){
return this.numero;
}
public void setNumero(int nuevo_numero){
this.numero=nuevo_numero;
}

}
class Libro {
    private String titulo;
    private long isbn;
    private String autor;
    private int aniopublicacion;
    
    private Pagina[]paginas;
    private int numeroPaginas;
    
    
    public Libro(String titulo,long isbn,String autor,int aniopublicacion){
        this.titulo=titulo;
        this.isbn=isbn;
        this.autor=autor;
        this.aniopublicacion=aniopublicacion;
        
        
        
        this.paginas=new Pagina[999];
        for(int i=0;i<999;i++){
            this.paginas[i]=new Pagina(" ",0);
          
        }
        this.numeroPaginas=0;
                
    }
    public String getTitulo(){
        return this.titulo;
    }
    public void setTitulo(String titulo){
        this.titulo=titulo;
    }
    public long getIsbn(){
        return this.isbn;
    }
    public void setIsbn(long nuevo_Isbn){
        this.isbn=nuevo_Isbn;
    }
    public String getAutor(){
        return this.autor;
    }
    public void setAutor(String nuevo_autor){
        this.autor=nuevo_autor;
    }
    public int getAnioPublicacion(){
        return this.aniopublicacion;
    }
    public void setAnioPublicacion(int nuevo_aniopublicacion){
        this.aniopublicacion=nuevo_aniopublicacion;
    }
    public int getNumeroPagina(){
        return this.numeroPaginas;
    }
    public void AnadirPagina(Pagina nueva_Pagina){
        if (this.numeroPaginas<999){
            this.paginas[this.numeroPaginas]=nueva_Pagina;
            this.numeroPaginas++;
        }
    }
    public Pagina getPaginaNumero(int numero_Pagina){
  
        for(int i=1;i<this.numeroPaginas;i++){
            if (this.paginas[i].getNumero()==numero_Pagina){
                   return this.paginas[1];
            }
        }
         return null;
    }
    public void Compilacion(){
        for (int i=0;i<this.numeroPaginas;i++){
        System.out.println(paginas[i].getContenido());
    }
    }
    @Override
public String toString(){
    return "\n\nEl título del libro es "+titulo+", su isbn es "+isbn+" del autor "+autor+" publicado en "+aniopublicacion+".";
}
}
public class Composicion1 {


    public static void main(String[] args) {
        System.out.println("\t\tUniversidad de las Fuerzas Armadas ESPE-L");
        System.out.println("\n\t\t\t   Ingeniería Automotriz");
        System.out.println("\t\t\t\tProgramación");
        System.out.println("\n\t\t\t Docente: Ing. Luis Guerra");
        System.out.println("\t\t\t Estudiante: Alex Beltran");
        
        Libro Controles_Instrumentos=new Libro("Arranque y apagado del motor",1234345296,"Chevrolet",2020);
        Pagina pagina1=new Pagina("Asegurese de que todos los instrumentos esten en la posicion desactivada",4);
        Pagina pagina2=new Pagina("Gire interruptor de arranque a posicion ON verifique luces y combustible normal",5);
        
        System.out.println(Controles_Instrumentos);
        
        Controles_Instrumentos.AnadirPagina(pagina1);
        Controles_Instrumentos.AnadirPagina(pagina2);
        Controles_Instrumentos.Compilacion();
            
        
        }
}
