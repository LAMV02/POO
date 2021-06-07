import java.util.Scanner;

public class Order implements  Neworder{
    private  double total;
    private  Part[] partes;
    private  Cliente cliente ;
    private Cashier cashier;
public  Order(Cliente cliente,Cashier cashier){
    this.cashier=cashier;
    this.cliente=cliente;
    this.setparts();
}

    @Override
    public void setparts() {
        System.out.println("Cuantas partes se necesita?");
        Scanner scanner=new Scanner(System.in);
        int cuantas=scanner.nextInt();
        partes=new  Part[cuantas];
        for (int x=0;x<cuantas;x++) {
        //System.out.println("nombre de la piesa");
            partes [x]=new Part("parte"+x,200*x,"patito" +
                    "");

        }
        this.settotal();
    }

    @Override
    public void setcliente() {

    }

    @Override
    public void settotal() {
    for (int x=0;x<partes.length;x++){
        total=total+partes[x].getPercio();
    }

    }

    public double getTotal() {
        return total;
    }
}
