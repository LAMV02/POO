package Paises;
import java.awt.*;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        String[] Name = new String[0];
        double[] Zsup = new double[0];
        String[] Idio = new String[0];
        String[] Pres = new String[0];
        String[] Coin = new String[0];

        int op=0;
        Scanner Option=new Scanner(System.in);
        while(op!=4){
            System.out.println("¿Qué desea hacer? \n1) Crear zona geográfica \n2) Crear Provincias \n3) Mostrar Datos \n4)Salir");
            op=Option.nextInt();

            switch (op) {
                case 1:{
                    Scanner scanner=new Scanner(System.in);
                    System.out.println("Ha seleccionado la opción 1: ¿Cuántas zonas desea crear? ");
                    int c=scanner.nextInt();
                    Name =new String[c];
                    Zsup=new double[c];
                    for (int x=0;x<c;x++){
                        System.out.println("Inserta el nombre de la zona "+(x+1));
                        String n= scanner.next();
                        Name[x]=n;
                        System.out.println("Inserta la superficie de la zona "+(x+1));
                        double m= scanner.nextDouble();
                        Zsup[x]=m;
                    }
                    break;}

                case 2:{
                    Scanner scanner=new Scanner(System.in);
                    System.out.println("Ha seleccionado la opción 2: ¿Cuántos paises desea crear? ");
                    int c=scanner.nextInt();
                    Idio=new String[c];
                    Pres =new String[c];
                    Coin =new String[c];
                    for (int x=0;x<c;x++){
                        System.out.println("Inserta el idioma del pais "+(x+1));
                        String n= scanner.next();
                        Idio[x]=n;
                        System.out.println("cual es el nombre del presidente "+(x+1));
                        String m= scanner.next();
                        Pres[x]=m;
                        System.out.println("cual es la moneda de lugar "+(x+1));
                        String q= scanner.next();
                        Coin[x]=q;
                        }
                break;}

                case 3: {
                    System.out.println("zonas");
                    imprimirzona(Name,Zsup);
                    System.out.println("Paises");
                    imprimirpais(Pres,Idio,Coin);

                    break;}

                case 4:{
                    System.out.println("Gracias por usar este programa");
                    break;}
                default:{ System.out.println("Opcion no valida");}
            }

    }
    }

    public static void imprimirzona(String[] Name, double[] Zsup){
        for(int x=0;x<Name.length;x++){
            System.out.println("zona "+(x+1)+": "+Name[x]+" con: "+Zsup[x]);

        } }
        public static void imprimirpais(String[] Idio,String[] Pres, String[] Coin){
            for(int x=0;x<Idio.length;x++){
                System.out.println("idioma: "+(x+1)+" "+Idio[x]+" presidente: "+Pres[x]+" Moneda: "+ Coin[x]);

            } }

}
