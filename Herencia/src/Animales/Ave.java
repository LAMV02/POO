package Animales;

import java.awt.*;

public class Ave extends Animal{

    private String tipo;

    public Ave(Color color, double peso, String tipo){
        super(color,peso);
        this.tipo=tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void volar(){
        System.out.println("I BELIBE I CAN FLY, I BELIBE I CAN TOUCH THE SKY");
    }
}


