public class Leon extends Felino{

    private Integer numManada;

    private Float potenciaRugidoDecibel;

    public Leon(String habitat, Float altura, Float largo, Float peso, String nombreCientifico, Float tamañoGarras, Integer velocidad, Integer numManada,Float potenciaRugidoDecibel) {
        super(habitat, altura, largo, peso, nombreCientifico, tamañoGarras, velocidad);
        this.numManada = numManada;
        this.potenciaRugidoDecibel = potenciaRugidoDecibel;

    }

    public Integer getNumManada() {
        return numManada;
    }

    public void setNumManada(Integer numManada) {
        this.numManada = numManada;
    }

    public Float getPotenciaRugidoDecibel() {
        return potenciaRugidoDecibel;
    }

    public void setPotenciaRugidoDecibel(Float potenciaRugidoDecibel) {
        this.potenciaRugidoDecibel = potenciaRugidoDecibel;
    }

    public String comer()
    {

        return "carne roja, zebras";
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
