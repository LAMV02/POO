public class Asteroid {
    private String name;
    private String composition;
    private double distance_of_earth;
    public double speed;

    public Asteroid (String name,String composition,double distance_of_earth,double speed){
        this.name=name;
        this.composition=composition;
        this.distance_of_earth=distance_of_earth;
        this.speed=speed;

    }

    public void setDistance_of_earth(double distance_of_earth) {
        this.distance_of_earth = distance_of_earth;
    }

    public double getDistance_of_earth() {
        return distance_of_earth;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setComposition(String composition) {
        this.composition = composition;
    }

    public String getComposition() {
        return composition;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

        public double getSpeed() {
        return speed;
    }
}