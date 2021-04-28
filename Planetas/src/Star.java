import java.awt.*;

public class Star {
    private double diameter;
    private String type;
    private Color color;

    public Star (double diameter, String type, Color color){
        this.diameter=diameter;
        this.type=type;
        this.color=color;
    }
    public void setDiameter(double diameter){
        this.diameter=diameter;
    }
    public double getDiameter(){
        return diameter;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}
