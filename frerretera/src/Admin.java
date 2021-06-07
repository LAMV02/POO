public class Admin extends Usuario {

    public Admin(String Nombre, String direccion, String telefono, String usernome, String password) {
        super(Nombre, direccion, telefono, usernome, password);
    }
    public  void  changepassword(String nuevo){
        super.setPassword(nuevo);

    }
}
