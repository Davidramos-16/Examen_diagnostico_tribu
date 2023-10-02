public class Lobo extends Canino{


    private Integer numCamada;
    private  String especieLobo;


    public Lobo(String habitat, Float altura, Float largo, Float peso, String nombreCientifico, String color, Float tamanoColmillos, Integer numCamada,String especieLobo) {
        super(habitat, altura, largo, peso, nombreCientifico, color, tamanoColmillos);
        this.numCamada = numCamada;
        this.especieLobo = especieLobo;
    }

    public Integer getNumCamada() {
        return numCamada;
    }

    public void setNumCamada(Integer numCamada) {
        this.numCamada = numCamada;
    }

    public String getEspecieLobo() {
        return especieLobo;
    }

    public void setEspecieLobo(String especieLobo) {
        this.especieLobo = especieLobo;
    }

    public String comer()
    {

        return "carne roja, todo tipo de carne";
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
