import java.util.Scanner;

public class Sueldos extends  Empleados{

    private double salary;

    public Sueldos(String name, int age, String job,double salary) {
        super(name, age, job);
        this.salary=salary;

    }

    //Get-Set
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    //Get-Set


    @Override
    public void imprimirSalario() {
        System.out.println("El salario final de "+getName()+" es de "+getSalary());
    }
}


