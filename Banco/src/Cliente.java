public class Cliente extends Usuario{

    private double saldo;
    public Cliente(String nombre, String ap, String usuario, String password,double saldo) {
        super(nombre, ap, usuario, password);
        this.saldo=saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void cargarsaldo(double saldo){
        this.saldo=this.saldo+saldo;
    }

    @Override
    public boolean IniciarSesion(String usuario, String password) {
        System.out.println("accseso denegado");
        return false;

    }

    @Override
    public void decirHola() {
        System.out.println("decir hola desde la sub clase");
        super.decirHola();
    }
}
