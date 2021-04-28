public class Planet {
    private String name;
    private double sun_distance;
    private String composition;
    private int orbit_days;
    public double mass;

    public Planet (String name,double sun_distance,String composition,int orbit_days,double mass){
        this.name=name;
        this.sun_distance=sun_distance;
        this.composition=composition;
        this.orbit_days=orbit_days;
        this.mass=mass;
    }

    public void  setName(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setSun_distance(double sun_distance) {
        this.sun_distance = sun_distance;
    }

    public double getSun_distance() {
        return sun_distance;
    }

    public void setComposition(String composition) {
        this.composition = composition;
    }

    public String getComposition() {
        return composition;
    }

    public void setOrbit_days(int orbit_days) {
        this.orbit_days = orbit_days;
    }

    public int getOrbit_days() {
        return orbit_days;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public double getMass() {
        return mass;
    }
}

