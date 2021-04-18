public class Planet {
    private String name;
    private double sun_distance;
    private String composition;
    private int orbit_days;
    public double mass;

    public Planet (String nombre,double d,String C,int D,double m){
        this.name=nombre;
        this.sun_distance=d;
        this.composition=C;
        this.orbit_days=D;
        this.mass=m;
    }
}

