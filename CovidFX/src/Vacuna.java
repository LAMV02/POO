public class Vacuna {
    private String nombre;
    private String MarcaVacuna;
    private int n_dosis;

    public Vacuna(String nombre, String marcaVacuna, int n_dosis) {
        this.nombre = nombre;
        MarcaVacuna = marcaVacuna;
        this.n_dosis = n_dosis;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarcaVacuna() {
        return MarcaVacuna;
    }

    public void setMarcaVacuna(String marcaVacuna) {
        MarcaVacuna = marcaVacuna;
    }

    public int getN_dosis() {
        return n_dosis;
    }

    public void setN_dosis(int n_dosis) {
        this.n_dosis = n_dosis;
    }
}
