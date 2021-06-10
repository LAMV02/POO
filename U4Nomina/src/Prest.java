public class Prest {
        private double Cantidad;
        private int intereses ;
        public  Prest(double cantidad, int intereses){
           this.Cantidad=Cantidad;
           this.intereses=intereses;
        }



    public double getCantidad() {
        return Cantidad;
    }

    public void setCantidad(double cantidad) {
        Cantidad = cantidad;
    }

    public int getIntereses() {
        return intereses;
    }

    public void setIntereses(int intereses) {
        this.intereses = intereses;
    }
}

