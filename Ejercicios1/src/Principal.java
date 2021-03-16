import java.util.Scanner;

public class Principal {
    // Luis Antonio Mendoza Varela
    static Scanner scanner=new Scanner(System.in);
    static Scanner Tabla=new Scanner(System.in);
    public static void main (String[] Args){
            int HxA=8760;
            System.out.println("Introduce tu edad");
            boolean Mom=true;
            int edad= scanner.nextInt();
            while (Mom) {
                if ((edad <= 0)||(edad>=120)) {
                    System.out.println("Esa edad no es posible");
                    System.out.println("Introduce tu edad");
                    edad = scanner.nextInt();
                } else {
                    Mom = false;
                }}//FinWhile
            if((edad >= 1) &&( edad <= 10)){
             System.out.println("Apenas eres un niño!,"+" Y has vivido "+HxA*edad+ " Horas"); }
            if((edad >= 11) &&( edad <= 18)){
            System.out.println("eres un joven!,"+" Y has vivido "+HxA*edad+ " Horas"); }
            if((edad >= 19) &&( edad <= 100)){
            System.out.println("eres un mayor de edad!,"+" Y has vivido "+HxA*edad+ " Horas"); }

            System.out.println("¿Que tabla de multiplicar quieres que muestre? (1-10)");
            Boolean ST= true;
            int Nt= Tabla.nextInt();
            while (ST){
                if ((Nt <= 0) || (Nt>=11)) {
                    System.out.println("Solo puedes colocar 1-10");
                    Nt = scanner.nextInt();
                } else {
                    ST = false;
                    System.out.println("Tu elegiste "+ Nt);
                }}


            if (Nt==1){
                System.out.println("1x1=1\n" +
                        "1x2=2\n" +
                        "1x3=3\n" +
                        "1x4=4\n" +
                        "1x5=5\n" +
                        "1x6=6\n" +
                        "1x7=7\n" +
                        "1x8=8\n" +
                        "1x9=9\n" +
                        "1x10=10");
            }
            if(Nt==2){
                    System.out.println("2x1=2\n" +
                            "2x2=4\n" +
                            "2x3=6\n" +
                            "2x4=8\n" +
                            "2x5=10\n" +
                            "2x6=12\n" +
                            "2x7=14\n" +
                            "2x8=16\n" +
                            "2x9=18\n" +
                            "2x10=20");
            }
            if(Nt==3){
            System.out.println("3x1=3\n" +
                    "3x2=6\n" +
                    "3x3=9\n" +
                    "3x4=12\n" +
                    "3x5=15\n" +
                    "3x6=18\n" +
                    "3x7=21\n" +
                    "3x8=24\n" +
                    "3x9=27\n" +
                    "3x10=30");
        }
           if(Nt==4){
            System.out.println("2x1=4\n" +
                    "2x2=4\n" +
                    "2x3=6\n" +
                    "2x4=8\n" +
                    "2x5=10\n" +
                    "2x6=12\n" +
                    "2x7=14\n" +
                    "2x8=16\n" +
                    "2x9=18\n" +
                    "2x10=20");
        }
           if(Nt==5){
            System.out.println("5x1=5\n" +
                    "5x2=10\n" +
                    "5x3=15\n" +
                    "5x4=20\n" +
                    "5x5=25\n" +
                    "5x6=30\n" +
                    "5x7=35\n" +
                    "5x8=40\n" +
                    "5x9=45\n" +
                    "5x10=50");
        }
          if(Nt==6){
            System.out.println("6x1=6\n" +
                    "6x2=12\n" +
                    "6x3=18\n" +
                    "6x4=24\n" +
                    "6x5=30\n" +
                    "6x6=36\n" +
                    "6x7=42\n" +
                    "6x8=48\n" +
                    "6x9=54\n" +
                    "6x10=60");
        }
         if(Nt==7){
            System.out.println("7x1=7\n" +
                    "7x2=14\n" +
                    "7x3=21\n" +
                    "7x4=28\n" +
                    "7x5=35\n" +
                    "7x6=42\n" +
                    "7x7=49\n" +
                    "7x8=56\n" +
                    "7x9=63\n" +
                    "7x10=70");
        }
        if(Nt==8){
            System.out.println("8x1=8\n" +
                    "8x2=16\n" +
                    "8x3=24\n" +
                    "8x4=32\n" +
                    "8x5=40\n" +
                    "8x6=48\n" +
                    "8x7=56\n" +
                    "8x8=64\n" +
                    "8x9=72\n" +
                    "8x10=80");
        }
        if(Nt==9){
            System.out.println("9x1=9\n" +
                    "9x2=18\n" +
                    "9x3=27\n" +
                    "9x4=36\n" +
                    "9x5=45\n" +
                    "9x6=54\n" +
                    "9x7=63\n" +
                    "9x8=72\n" +
                    "9x9=81\n" +
                    "9x10=90");
        }
        if(Nt==10){
            System.out.println("10x1=10\n" +
                    "10x2=20\n" +
                    "10x3=30\n" +
                    "10x4=40\n" +
                    "10x5=50\n" +
                    "10x6=60\n" +
                    "10x7=70\n" +
                    "10x8=80\n" +
                    "10x9=90\n" +
                    "10x10=100");
        }
    }
}

    // public  static void pediredad (int edad){
    //   if(edad<=-1){
    //      System.out.println("Esa edad no es posible");
    //     System.out.println("Introduce tu edad");
    //    edad= scanner.nextInt();
    //    pediredad(edad);
    // } else {
    //    System.out.println("PERFECTOCABRON");


