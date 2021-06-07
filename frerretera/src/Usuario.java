public  class Usuario extends Persona {
    private  String usernome;
    private  String password;
    public Usuario(String Nombre, String direccion, String telefono, String usernome, String password) {
        super(Nombre, direccion, telefono);
        this.password=password;
        this.usernome=usernome;

    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
