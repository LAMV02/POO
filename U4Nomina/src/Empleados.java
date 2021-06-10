public abstract class Empleados {
    
    private String name;
    private int age;
    private String job;

    public Empleados(String name, int age, String job){
        this.name=name;
        this.age=age;
        this.job=job;
    }

    // GetSettStart
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getJob() {
        return job;
    }
    //GetSettEnd

    public void imprimirSalario(){
        System.out.println("este empleado tiene un salario fijo de $500");
    }

}
