public class Sintezoide {

    private String modelo;
    private int nivelPoder;
    private int energia;

    // Constructor principal
    public Sintezoide(String modelo, int nivelPoder, int energia) {
        this.modelo = modelo;
        setNivelPoder(nivelPoder);
        setEnergia(energia);
    }

    // Constructor por defecto
    public Sintezoide() {
        this("Prototipo", 1, 100);
    }

    // Constructor sobrecargado
    public Sintezoide(String modelo) {
        this(modelo, 10, 100);
    }
    //getters
    public String getModelo() {
        return modelo;
    }

    public int getNivelPoder() {
        return nivelPoder;
    }

    public int getEnergia() {
        return energia;
    }
    //setters
    public void setNivelPoder(int nivelPoder) {
        if (nivelPoder < 1) {
            this.nivelPoder = 1;
        } else if (nivelPoder > 100) {
            this.nivelPoder = 100;
        } else {
            this.nivelPoder = nivelPoder;
        }
    }

    public void setEnergia(int energia) {
        if (energia < 0) {
            this.energia = 0;
        } else if (energia > 100) {
            this.energia = 100;
        } else {
            this.energia = energia;
        }
    }

    public void mostrar() {
        System.out.println(
                modelo + " | poder " + nivelPoder + " | energia " + energia
        );
    }
}
