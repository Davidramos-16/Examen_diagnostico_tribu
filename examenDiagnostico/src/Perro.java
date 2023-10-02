public class Perro extends Canino{


    private Integer fuerzaMordida;

    public Perro(String habitat, Float altura, Float largo, Float peso, String nombreCientifico, String color, Float tamanoColmillos, Integer fuerzaMordida) {
        super(habitat, altura, largo, peso, nombreCientifico, color, tamanoColmillos);
        this.fuerzaMordida = fuerzaMordida;
    }


    public Integer getFuerzaMordida() {
        return fuerzaMordida;
    }

    public void setFuerzaMordida(Integer fuerzaMordida) {
        this.fuerzaMordida = fuerzaMordida;
    }

    public String comer()
    {

        return "omnivoro";
    }

    public String dormir()
    {
        return "mucho";
    }
    public String correr()
    {
        return "poco";
    }
    public String comunicarse()
    {
        return "bastante entre perros";
    }
}
