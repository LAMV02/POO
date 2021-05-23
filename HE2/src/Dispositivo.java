public class Dispositivo {

    private String nombre;
    private int memoriaRam;
    public  String procesador;

    public Dispositivo(String nombre,int memoriaRam,String procesador){
        this.nombre=nombre;
        this.memoriaRam=memoriaRam;
        this.procesador=procesador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(int memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public void encender(){
        System.out.println("Dispositivo encendido");
    }
    public void apagar(){
        System.out.println("Dispositivo apagado");
    }

}
