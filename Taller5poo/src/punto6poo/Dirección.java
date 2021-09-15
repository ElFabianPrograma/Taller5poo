
package punto6poo;

/**
 *
 * @author Luis Fabian
 */
public class Dirección {
    
    private String barriodomi;
    private String nomenclaturadomi;
    private String barriotra;
    private String nomenclaturatra;

    public Dirección() { 
        this.barriodomi="Cuba";
        this.nomenclaturadomi="Cra 7 B # 8 A 65";
        this.barriotra="Don roley";
        this.nomenclaturatra="Cra 15 # 91B";
    }
    
    public Dirección(String barriodomi){
        
        this.barriodomi=barriodomi;
        this.nomenclaturadomi="Cra 6 B # 43 B 21";
        this.barriotra="El Stech";
        this.nomenclaturatra="Diag 21 Bis # 44-33";
    }
    
    public Dirección(String barriodomi, String barriotra){
        
        this.barriodomi=barriodomi;
        this.nomenclaturadomi="Casa12 Esquina 10";
        this.barriotra=barriotra;
        this.nomenclaturatra="Cra 5 # 27-55";
    }

    public String getBarriodomi() {
        return barriodomi;
    }

    public void setBarriodomi(String barriodomi) {
        this.barriodomi = barriodomi;
    }

    public String getNomenclaturadomi() {
        return nomenclaturadomi;
    }

    public void setNomenclaturadomi(String nomenclaturadomi) {
        this.nomenclaturadomi = nomenclaturadomi;
    }


    public String getBarriotra() {
        return barriotra;
    }

    public void setBarriotra(String barriotra) {
        this.barriotra = barriotra;
    }

    public String getNomenclaturatra() {
        return nomenclaturatra;
    }

    public void setNomenclaturatra(String nomenclaturatra) {
        this.nomenclaturatra = nomenclaturatra;
    }
    
    
}