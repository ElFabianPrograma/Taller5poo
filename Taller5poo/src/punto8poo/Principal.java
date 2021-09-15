
package punto8poo;



/**
 *
 * @author Luis Fabian
 */
public class Principal {
private     
    
   public static void main(String[] args){
               
    Libro libro1=new Libro();
    libro1.Capitulo=new Capitulo[5];
    Capitulo cap1=new Capitulo();
    
    libro1.setIndice(cap1);
    Capitulo cap2=new Capitulo("Justicia",51,30);
    libro1.setIndice(cap2);
    
    Capitulo cap3=new Capitulo("Trueque");
    libro1.setIndice(cap3);
    
    Capitulo cap4=new Capitulo(50);
    libro1.setIndice(cap4);
    
    Capitulo cap5=new Capitulo("Realidad",151);
    libro1.setIndice(cap5);
    
    libro1.TablaContenido();
    
    
   
   } 
}
