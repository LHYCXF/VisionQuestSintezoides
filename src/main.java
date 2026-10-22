public class main {
    public static void main(String[] args) {

        System.out.println("===== MIND STONE: SINTEZOIDES =====");

        // s1: constructor por defecto
        Sintezoide s1 = new Sintezoide();

        // s2: constructor sobrecargado
        Sintezoide s2 = new Sintezoide("Vision");

        // s3: constructor principal
        Sintezoide s3 = new Sintezoide("Vision Blanco", 150, 60);

        // s4: constructor principal
        Sintezoide s4 = new Sintezoide("Ultron Mk2", 40, -20);

        s1.setNivelPoder(0);
        s2.setEnergia(130);

        // Mostrar sintezoides
        s1.mostrar();
        s2.mostrar();
        s3.mostrar();
        s4.mostrar();

        // Mostrar el modelo
        System.out.println("Modelo de s3: " + s3.getModelo());
    }
}
