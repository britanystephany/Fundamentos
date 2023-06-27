public class Coche {
    private int numeroPuertas; 

    public Coche () {
        numeroPuertas = 0;
    }

    public int getNueroPuertas (){
        return numeroPuertas;
    }
    public void incremetarPuertas (){
        this.numeroPuertas++;
    }
    public static void main(String[] args) {
        Coche miCoche = new Coche();
        miCoche.incremetarPuertas();
        miCoche.incremetarPuertas();
        System.out.println("El numero de puertas de mi choche es: " + miCoche.getNueroPuertas() + "puerta(s).");
    } 
}
