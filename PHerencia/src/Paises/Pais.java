package Paises;


public class Pais {

    private String idioma;
    private String presidente;
    public String moneda;

    public Pais(String idioma, String presidente, String moneda){
        this.idioma=idioma;
        this.presidente=presidente;
        this.moneda=moneda;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setPresidente(String presidente) {
        this.presidente = presidente;
    }

    public String getPresidente() {
        return presidente;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public String getMoneda() {
        return moneda;
    }
}
