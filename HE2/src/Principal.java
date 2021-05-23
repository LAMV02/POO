import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        int op=0;
        int op2=0;
        Scanner scanner=new Scanner(System.in);
        Celular celular[] = new Celular[0];
        Pc pc[];
        Servidor servidor[]=new Servidor[0];

        while (op!=5) {
            System.out.println("¿Qué desea hacer 1) Crear Celular 2) Crear Pc 3)Crear Servidor 4) Funciones Especiales 5)salir");
            op=scanner.nextInt();

            switch(op){
                case 1:{
                    System.out.println("Cuantos celulares quieres crear?");
                    int celulares=scanner.nextInt();
                    celular=new Celular[celulares];
                    for(int x=0;x<celulares;x++){
                        System.out.println("Introduce en nombre del celular "+(x+1));
                        String n=scanner.next();
                        System.out.println("Introduce la memoria ram del celular "+(x+1));
                        int r=scanner.nextInt();
                        System.out.println("Introduce cual es el procesador del celular "+(x+1));
                        String p=scanner.next();
                        System.out.println("Introduce el saldo del celular "+(x+1));
                        double s=scanner.nextDouble();
                        Celular cl=new Celular(n,r,p,s);
                        celular[x]=cl;

                        System.out.println("nombre "+(x+1)+" "+celular[x].getNombre()+"\n "+
                                "memoria "+(x+1)+" "+celular[x].getMemoriaRam()+"\n "+
                                "procesador "+(x+1)+" "+celular[x].getProcesador()+"\n "+
                                "Saldo "+(x+1)+" "+celular[x].getSaldo()+"\n ");

                    }
                    break;}
                case 2:{
                    System.out.println("Cuantas pc quieres crear?");
                    int cuantas=scanner.nextInt();
                    pc=new Pc[cuantas];
                    for(int x=0;x<cuantas;x++) {
                        System.out.println("Introduce en nombre de la Pc " + (x + 1));
                        String n = scanner.next();
                        System.out.println("Introduce la memoria ram de la Pc " + (x + 1));
                        int r = scanner.nextInt();
                        System.out.println("Introduce cual es el procesador de la pc " + (x + 1));
                        String p = scanner.next();
                        System.out.println("Introduce la marca del teclado de la Pc " + (x + 1));
                        String t = scanner.next();
                        Pc comp = new Pc(n, r, p, t);
                        pc[x] = comp;

                        System.out.println("nombre "+(x+1)+" "+pc[x].getNombre()+"\n "+
                                "memoria "+(x+1)+" "+pc[x].getMemoriaRam()+"\n "+
                                "procesador "+(x+1)+" "+pc[x].getProcesador()+"\n "+
                                "marca de teclado "+(x+1)+" "+pc[x].getMarcaTeclado()+"\n ");

                    }
                break;}
                case 3:{
                    System.out.println("Cuantos servidores quieres crear?");
                    int cuantas=scanner.nextInt();
                    servidor=new Servidor[cuantas];
                    for(int x=0;x<cuantas;x++) {
                        System.out.println("Introduce el nombre del servidor " + (x + 1));
                        String n = scanner.next();
                        System.out.println("Introduce la memoria ram del servidor" + (x + 1));
                        int r = scanner.nextInt();
                        System.out.println("Introduce cual es el procesador del servidor " + (x + 1));
                        String p = scanner.next();
                        System.out.println("Introduce la zona horaria del servidor " + (x + 1));
                        Double z = scanner.nextDouble();
                        Servidor ser = new Servidor(n, r, p, null, z);
                        servidor[x] = ser;

                        System.out.println("nombre "+(x+1)+" "+servidor[x].getNombre()+"\n "+
                                "memoria "+(x+1)+" "+servidor[x].getMemoriaRam()+"\n "+
                                "procesador "+(x+1)+" "+servidor[x].getProcesador()+"\n "+
                                "zona Hooraria "+(x+1)+" "+servidor[x].getZonaHoraria()+"\n ");
                    }
                }break;
                case 4:{
                    while (op!=6) {
                    System.out.println("Funcione especiales 1)Enviar SMS 2)Encender webcam 3)aumentar RAM");
                    op2=scanner.nextInt();
                    switch (op2){
                        case 1:{

                            System.out.println("cual celular necesita");
                            int x =scanner.nextInt();
                            System.out.println("el celular que tomaste es "+celular[x-1].getNombre());
                            System.out.println("Introdusca el mensaje");
                            String msg=scanner.next();
                            double resta= celular[x-1].getSaldo()-2;
                            celular[x-1].setSaldo(resta);
                            System.out.println("su saldo final es "+celular[x-1].getSaldo());

                        }break;
                        case 2:{
                            System.out.println("webcam encendida");
                        }break;
                        case 3: {
                            System.out.println("cual servidor nesesita");
                            int x =scanner.nextInt();
                            System.out.println("el servidor que tomaste es "+servidor[x-1].getNombre());
                            System.out.println("Cuanta ram le descargamos paisen?");
                            int ram=scanner.nextInt();
                            int suma= servidor[x-1].getMemoriaRam()+ram;
                            servidor[x-1].setMemoriaRam(suma);
                            System.out.println("la ram final es "+servidor[x-1].getMemoriaRam());

                        }break;
                        default:{
                            System.out.println("No es valido, saliendo de funciones especiales");
                            op=6;
                        }break;
                    }

                }break;}

                case 5:{
                    System.out.println("Gracias por usar este programa");
                }break;

            }
        }
    }

}
