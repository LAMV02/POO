package Animales;

import java.awt.*;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args){

        Animal animalGenerico=new Animal(Color.BLACK, 20);
        Ave piolin = new Ave(Color.YELLOW, 10,"canario");
        Perro Gwen = new Perro(Color.BLACK, 45,"Pastor belga");
        //(Gwen el es nombre de mi perra)

       Scanner scanner =new Scanner(System.in);
       System.out.println("Cuantos registros quieres?");
       int c=scanner.nextInt();
       String[] str =new String[c];
       for (int x=0;x<c;x++){
           System.out.println("Inserta un nombre");
           String n= scanner.next();
           str[x]=n;
       }

        Ave[]arrayAves=new Ave[3];
        Animal[]arrayAnimal=new Animal[10];

        Animal animalgenerico=new Animal(Color.BLACK,20);
        piolin= new Ave(Color.YELLOW,10,"canario");

        arrayAves[0] =piolin;
        arrayAnimal[1]=new Ave(Color.black,32,"perro");

        System.out.println(arrayAves[2].getTipo());

       /* animalGenerico.comer();
       piolin.volar();
       Gwen.ladrar();
       */

    }
    public static void imprimirArreglo(String[] arr){
        for(int x=0;x<arr.length;x++){
            System.out.println(arr[x]);
        }
    }
}
