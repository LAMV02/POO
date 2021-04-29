package Animales;

import java.awt.*;

public class Principal {
    public static void main(String[] args){

        Animal animalGenerico=new Animal(Color.BLACK, 20);
        Ave piolin = new Ave(Color.YELLOW, 10,"canario");
        Perro Gwen = new Perro(Color.BLACK, 45,"Pastor belga");
        //(Gwen el es nombre de mi perra)

        animalGenerico.comer();
        piolin.volar();
        Gwen.ladrar();


    }
}
