public class Principal {
    public static void main(String[] args){
        Usuario usario1=new Usuario("Luis","Mendoza","admin","123");
        Boolean respuesta=usario1.IniciarSesion("admin","asdasda");

        Cliente c1=new Cliente("cliente","tal","c1","111",100);
        c1.cargarsaldo(100);
        System.out.println("saldo: "+c1.getSaldo());

        boolean res2=c1.IniciarSesion("c1","111");
        System.out.println(res2);

        c1.decirHola();

    }
}
