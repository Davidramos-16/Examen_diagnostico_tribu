public  class Tigre  extends Felino {

    private String especieTigre;

    public String getEspecieTigre() {
        return especieTigre;
    }

    public void setEspecieTigre(String especieTigre) {
        this.especieTigre = especieTigre;
    }

    public Tigre(String habitat, Float altura, Float largo, Float peso, String nombreCientifico, Float tamañoGarras, Integer velocidad, String especieTigre) {
        super(habitat, altura, largo, peso, nombreCientifico, tamañoGarras, velocidad);
        this.especieTigre = especieTigre;
    }


     public String comer()
    {

        return "carne roja, venados";
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
         return "bastante con otros tigres";
     }
}
