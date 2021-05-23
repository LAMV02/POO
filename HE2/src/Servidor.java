public class Servidor extends Pc{

    public Double zonaHoraria;
    public Servidor(String nombre, int memoriaRam, String procesador,String marcaTeclado,Double zonaHoraria) {
        super(nombre, memoriaRam,marcaTeclado,procesador);
        this.zonaHoraria=zonaHoraria;
    }

    public void setZonaHoraria(Double zonaHoraria) {
        this.zonaHoraria = zonaHoraria;
    }

    public Double getZonaHoraria() {
        return zonaHoraria;
    }

    public void aumentarRam (){

    }
}
