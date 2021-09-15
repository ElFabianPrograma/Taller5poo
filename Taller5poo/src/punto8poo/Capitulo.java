/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto8poo;

/**
 *
 * @author Luis Fabian
 */
public class Capitulo {
    private String Nom_capi;
    private int T_Pag_cap;
    private int Num_pag_inicio_;

    public String getNom_capi() {
        return Nom_capi;
    }

    public void setNom_capi(String Nom_capi) {
        this.Nom_capi = Nom_capi;
    }

    public int getT_Pag_cap() {
        return T_Pag_cap;
    }

    public void setT_Pag_cap(int T_Pag_cap) {
        this.T_Pag_cap = T_Pag_cap;
    }

    public int getNum_pag_inicio_() {
        return Num_pag_inicio_;
    }

    public void setNum_pag_inicio_(int Num_pag_incio_) {
        this.Num_pag_inicio_ = Num_pag_incio_;
    }
   public Capitulo(){
   this.Nom_capi="La rebelion";
   this.Num_pag_inicio_=5;
   this.T_Pag_cap=45;
    
} 
   public Capitulo(String Nomcap, int TpagCap, int Numpaginicio){
      this.Nom_capi=Nomcap;
      this.Num_pag_inicio_=Numpaginicio;//Comienza 51
      this.T_Pag_cap=TpagCap;//30
   
   }
   
   public Capitulo(String Nomcap){
   this.Nom_capi=Nomcap;
   this.Num_pag_inicio_=81;
   this.T_Pag_cap=20;
   
   }
    public Capitulo(int TpagCap){
        this.Nom_capi="Exterminio";
        this.Num_pag_inicio_=101;
   this.T_Pag_cap=TpagCap;//50
   
   
   }
    public Capitulo(String Nomcap, int Numpaginicio){
   this.Nom_capi=Nomcap;
   this.Num_pag_inicio_=Numpaginicio;//151
   this.T_Pag_cap=30;
   
   
   }
   
}
