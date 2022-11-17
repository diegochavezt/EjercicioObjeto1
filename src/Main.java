public class Main {
    public static void main(String[] args) {
        coche micoche = new coche();
        micoche.maspuertas();

        System.out.println(micoche.puerta);
    }
}
class coche{
    public int puerta = 4;
    public void maspuertas(){
        this.puerta++;

    }

}