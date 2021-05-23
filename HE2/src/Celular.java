public class Celular extends Dispositivo {

    public double saldo;
    public Celular(String nombre, int memoriaRam, String procesador,double saldo) {
        super(nombre, memoriaRam, procesador);
        this.saldo=saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void enviarSMS(){
        System.out.println("SMS ENVIDAO");
    }

}
