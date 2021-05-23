public class Pc extends  Dispositivo{

    public String marcaTeclado;
    public Pc(String nombre, int memoriaRam, String procesador,String marcaTeclado) {
        super(nombre, memoriaRam, procesador);
        this.marcaTeclado=marcaTeclado;
    }
    public String getMarcaTeclado() {
        return marcaTeclado;
    }

    public void setMarcaTeclado(String marcaTeclado) {
        this.marcaTeclado = marcaTeclado;
    }

    public static void encenderWebCam(){
        System.out.println("webcam encendida");
    }

}

