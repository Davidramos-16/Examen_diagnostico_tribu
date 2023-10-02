public class Guepardo extends Felino{


    public Guepardo(String habitat, Float altura, Float largo, Float peso, String nombreCientifico, Float tamañoGarras, Integer velocidad) {
        super(habitat, altura, largo, peso, nombreCientifico, tamañoGarras, velocidad);
    }

    public String comer()
    {

        return "carne roja, conejos";
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
        return "bastante";
    }
}
