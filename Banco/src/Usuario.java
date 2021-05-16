public class Usuario {
    
    private String nombre;
    private String ap;
    private String usuario;
    private String password;

    public  Usuario(String nombre, String ap, String usuario, String password ){
        this.nombre=nombre;
        this.ap=ap;
        this.usuario=usuario;
        this.password=password;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAp() {
        return ap;
    }

    public void setAp(String ap) {
        this.ap = ap;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public boolean IniciarSesion(String usuario,String password) {
        if(usuario.equals(this.usuario) && password.equals(this.password)){
            return true;
        }else{
            return false;
        }

    }

    public void decirHola(){
        System.out.println("decir hola desde la clase usuario");
    }
    private int cobrarCheke(){
        return 500*15;
    }
    public void salir(){
        System.out.println("bye bye");
    }

}
