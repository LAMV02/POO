public class Principal {
    public static void main(String[] args) {
        Admin admin=new Admin("Luis","centro","123454","admin","1234");
        Cashier cashier= new Cashier("cajero1","mayo","12342","cajero","1234");
        cashier.mekepayment();
        Usuario cashier1= new Cashier("cajero1","mayo","12342","cajero","1234");
        Cliente cliente= new Cliente("Mauricio","enrique segobiano","636 124",0,2000);
        Order order=new Order(cliente,cashier);
        System.out.println( order.getTotal());

    }
}
