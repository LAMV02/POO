import java.awt.*;
public abstract class Figura {

private Color color;

public Figura(Color color){

    this.color=color;

}
public abstract double CalcularArea();

public void setColor(Color color){
    this.color=color;

}
public Color setcolor(){
    return color;

} }
