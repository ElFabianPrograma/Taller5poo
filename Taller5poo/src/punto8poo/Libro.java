
package punto8poo;


public class Libro {
    
 private String Nom_libro;
 private String Autor;
 private int Año_publi;
 private String Genero;
 private Capitulo[] indice;   

    public Capitulo getIndice() {
        return indice;
    }

    public void setIndice(Capitulo indice) {
        this.indice = indice;
    }

    public String getNom_libro() {
        return Nom_libro;
    }

    public void setNom_libro(String Nom_libro) {
        this.Nom_libro = Nom_libro;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public int getAño_publi() {
        return Año_publi;
    }

    public void setAño_publi(int Año_publi) {
        this.Año_publi = Año_publi;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

   

    public Libro() {
        
    this.Nom_libro= "Royalman";  
    this.Autor= "Smilto Rozz";
    this.Genero= "Misterio";
    this.Año_publi= 1970;
        
    }
    
public void TablaContenido(){
    System.out.println("Nombre: "+Nom_libro);
    System.out.println("Autor: "+Autor);
    System.out.println("Genero: "+Genero);
    System.out.println("Año de publicacion: "+Año_publi);
    System.out.println("Tabla de contenido");
    System.out.println("Capitulo 1:"+indice.getNom_capi()
            + "\nInicia en la pag: "+indice.getNum_pag_inicio_()
            +"\nNumero de pag: "+indice.getT_Pag_cap());
    
    System.out.println("Capitulo 2:"+indice.getNom_capi()
            + "\nInicia en la pag: "+indice.getNum_pag_inicio_()
            +"\nNumero de pag: "+indice.getT_Pag_cap());
    
    System.out.println("Capitulo 3:"+indice.getNom_capi()
            + "\nInicia en la pag: "+indice.getNum_pag_inicio_()
            +"\nNumero de pag: "+indice.getT_Pag_cap());
    
    System.out.println("Capitulo 4:"+indice.getNom_capi()
            + "\nInicia en la pag: "+indice.getNum_pag_inicio_()
            +"\nNumero de pag: "+indice.getT_Pag_cap());
    
    System.out.println("Capitulo 5:"+indice.getNom_capi()
            + "\nInicia en la pag: "+indice.getNum_pag_inicio_()
            +"\nNumero de pag: "+indice.getT_Pag_cap());
}

    }
           
  
    

