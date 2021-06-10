import java.util.Scanner;
public class Principal {
    public static void main(String[] args){
        Sueldos Sue[] = new Sueldos[0];
        Empleados Emp[] = new Empleados[0];
        int CEmp=0;
        int op=0;
        Scanner scanner=new Scanner(System.in);
        while (op!=5) {
            System.out.println("- - - - - - - - - - - - - - - - - -\n" +
                    "       =Menu de opciones=     \n" +
                    " 1) Agregar emplead@s           \n" +
                    " 2) Establecer salario         \n" +
                    " 3) Hacer un prestamo \n" +
                    " 4) Salir");
            // Final de menu -------------------------------------------------------


            op=scanner.nextInt();
            switch(op){
                case 1:{
                    System.out.println("Cuantos empleados quieres crear?");
                    int emplo=scanner.nextInt();
                    Emp=new Empleados[emplo];
                    Sue=new Sueldos[emplo];
                    for(int x=0;x<emplo;x++){
                    System.out.println("¿Cual es el nombre del emplead@?");
                    String n=scanner.next();
                    System.out.println("¿Cual es la edad del emplead@?");
                    int e=scanner.nextInt();
                    System.out.println("¿Cual es el cargo que tiene del emplead@?");
                    String j=scanner.next();
                        System.out.println("¿Cual es el salario del emplead@?");
                        double s=scanner.nextDouble();
                    Sueldos cl=new Sueldos(n,e,j,s);
                         Emp[x]=cl;
                    System.out.println("-----Se agrego lo siguiente-----");
                    System.out.println("nombre "+(x+1)+" "+Emp[x].getName()+"\n"+
                                       "edad "+(x+1)+" "+Emp[x].getAge()+"\n"+
                                       "cargo "+(x+1)+" "+Emp[x].getJob()+"\n ");

                }
                }break;
                case 2:{
                    System.out.println("Que empleado quieres eleccionar?");
                    int e=scanner.nextInt();
                    System.out.println("Seleccionaste a "+Emp[e-1].getName());
                    System.out.println("Introduce el salario");
                    int s=scanner.nextInt();
                    Sueldos cl=new Sueldos(Emp[e-1].getName(),Emp[e-1].getAge(),Emp[e-1].getJob(),s);
                    Sue[e-1]=cl;
                    Sue[e-1].imprimirSalario();
                }break;
                case 3:{
                    System.out.println("a quien es el prestamo?");
                    int e=scanner.nextInt();
                    System.out.println("Seleccionaste a "+Emp[e-1].getName());
                    Prestamo Px=new Prestamo(Emp[e-1]);
                    System.out.println("Se le prestaron 500");
                }break;

            }


        }

    }

}
