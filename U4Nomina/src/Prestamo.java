import java.util.Scanner;

public class Prestamo implements NuevoPrestamo {
              double total;
        private int interes;
        private  Prest[] Pezta;
        private  double prestamo;

        public Prestamo(Empleados empleados){
            this.prestamo=prestamo;
            this.interes=interes;
        }
        @Override
        public void Prestamoy() {

             prestamo=500;
             interes=15;
            Pezta[0]=new Prest(prestamo,interes);
            this.total();
        }

        @Override
            public void total() {
                total=1000.00;
            }

        public double getTotal() {
            return total;

        }
}
