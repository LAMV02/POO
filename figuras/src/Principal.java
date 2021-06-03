import java.awt.*;
public class Principal {
    public static void main(String[] args) {

        Circulo Cir =new Circulo(Color.BLACK, 20);
        System.out.println(Cir.CalcularArea());

        Cuadrado Cua =new Cuadrado(Color.blue, 20,20);
        System.out.println(Cua.CalcularArea());

    }   }
