public class Main {


    public static void main(String[] args) {
        //Primera Parte
        int resultado = suma(14 , 15 , 27);
        System.out.println(resultado);

        //Segunda Parte
        Coche miCoche = new Coche();

        miCoche.incrementaPuertas();

        System.out.println(miCoche.cantidad_puertas);
    }

    public static int suma (int a, int b, int c){
        return a + b + c;
    };
}
class Coche{
    int cantidad_puertas;

    public void incrementaPuertas(){
        cantidad_puertas++;
    }
};
