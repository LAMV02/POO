public class Asteroid {
    private String name;
    private String composition;
    private double distance_of_earth;
    public double speed;

    public Asteroid (String nombre,String composition,double distance_of_earth,double speed){
        this.name=nombre;
        this.composition=composition;
        this.distance_of_earth=distance_of_earth;
        this.speed=speed;
    }
        public void setname(String nuevoNombre){
            this.name=nuevoNombre;
        }
        public String getName(){
        return  this.name;
        }

    public void setDistance_of_earth(double distance_of_earth) {
        this.distance_of_earth = distance_of_earth;
    }

    public double getDistance_of_earth(){
        return this.distance_of_earth;
    }
}
