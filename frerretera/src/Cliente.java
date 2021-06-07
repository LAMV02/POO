public class Cliente extends Persona {
private  double credito;
private double creditomaximo;
    public Cliente(String Nombre, String direccion, String telefono, double credito,double creditomaximo) {
        super(Nombre, direccion, telefono);
        this.credito=credito;
        this.creditomaximo=creditomaximo;

    }

}
