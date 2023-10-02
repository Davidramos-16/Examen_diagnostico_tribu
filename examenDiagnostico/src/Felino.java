public abstract class Felino  extends Mamifero {

    private Float tamañoGarras;
    private Integer velocidad;

    public Felino(String habitat, Float altura, Float largo, Float peso, String nombreCientifico, Float tamañoGarras, Integer velocidad) {
        super(habitat, altura, largo, peso, nombreCientifico);
        this.tamañoGarras = tamañoGarras;
        this.velocidad = velocidad;
    }
}
