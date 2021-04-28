import java.awt.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Principal {
    public static void main(String[]args){
/*
        Planet x=new Planet("tierra", 1500, "solid",360,5454);
         Planet Mercuro=new Planet("Mercurio", 52, "gas",55,525);
        Asteroid asteroidex=new Asteroid("TepitoX", "Rocoso",45678,1000000);
*/
     int op=0;
        Scanner Scanner =new Scanner(System.in);
     while(op!=4){
         System.out.println("Que desea hacer? \n 1)Crear estrella \n 2)Crear Asteroide \n 3)Crear Planeta \n 4)Salir");
            op=Scanner.nextInt();

            switch (op) {
                case 1: {
                    System.out.println("Introduce el diametro");
                    double d = Scanner.nextDouble();
                    System.out.println("El tipo de estrella: \n 1)Enana roja \n 2)Enana Blanca");
                    int t = Scanner.nextInt();
                    String tipo="";
                    if(t==1){
                        tipo="Enama roja";
                    }else if(t ==2){
                        tipo="Enana Blanca";
                    }else{
                        tipo="Estrella Normal";
                    }
                    System.out.println("el color de la estrella es: \n 1)Roja \n 2)Azul");
                    int c=Scanner.nextInt();
                    Color color= Color.BLACK;
                    if(c ==1){color=color.RED; }else if(c==2){color=color.BLUE;}
                    Star estrella=new Star(d,tipo,color);
                    System.out.print("La estrella que creaste es: Diametro: "+estrella.getDiameter()
                            +" de tipo "+estrella.getType()+ "de color: "+estrella.getColor().toString());
                    break;}
                case 2: {
                    System.out.println("Introduce el Nombre del asteroide");
                    String Nombre=Scanner.next();
                    System.out.println("La composision del asteroide es: \n 1)Solido \n 2)Gaseoso");
                    int c=Scanner.nextInt();
                    String Composision="";
                    switch (c){
                        case 1:{ Composision="Solido ";}break;
                        case 2:{ Composision="Gaseoso";}break;
                        default:{Composision="No definido";}break; }
                    System.out.println("Introdusca la distancia de la tierra :");
                    Double Distancia=Scanner.nextDouble();
                    System.out.println("Introdusca la velocidad del asteroide :");
                    Double Velocidad=Scanner.nextDouble();
                    Asteroid asteroide= new Asteroid(Nombre,Composision,Distancia,Velocidad);
                    System.out.println("El nombre des asteroide es: "+asteroide.getName()
                            +" La composision es: "+ asteroide.getComposition()
                            +" La distancia es: "+asteroide.getDistance_of_earth()
                            +" La velocidad es :"+asteroide.getSpeed());
                    break;}
                case 3: {
                    System.out.println("Introduce el Nombre del Planeta");
                    String Nombre=Scanner.next();
                    System.out.println("Introdusca la distancia del sol:");
                    Double distanSol=Scanner.nextDouble();
                    System.out.println("La composision del asteroide es: \n 1)Solido \n 2)Gaseoso");
                    int c=Scanner.nextInt();
                    String Composision="";
                    switch (c){
                        case 1:{ Composision="Solido ";}break;
                        case 2:{ Composision="Gaseoso";}break;
                        default:{Composision="No definido";}break; }
                    System.out.println("Introdusca los dias de orbitas:");
                    int Orbita=Scanner.nextInt();
                    System.out.println("Introdusca la masa:");
                    Double Masa=Scanner.nextDouble();
                    Planet planeta=new Planet(Nombre,distanSol,Composision,Orbita,Masa);
                    System.out.println("El nombre del planeta es: "+planeta.getName()
                            +" y su distancia del sol es: "+planeta.getSun_distance()
                            +" la composisicon de este planeta es: "+planeta.getComposition()
                            +" y los dias que este planeta orbita son : "+planeta.getOrbit_days()
                            +" y su masa es de: "+planeta.getMass());

                    break;}

                case 4: {break;}
                default:{
                    System.out.println("Opcion no valida");
                }

         }
     }
        System.out.println("Gracias por usar este programa");

    }
}
