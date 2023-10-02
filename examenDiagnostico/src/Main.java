// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int op;

        Mamifero[] mf = new Mamifero[5];

        //Mamifero fn = new Felino();
        Mamifero tg = new Tigre("Africa", 12.5f,30f,50f,"tigrepicus",12.5f,90,"main");
        Mamifero ln = new Leon("Africa central",12f,20f,100f,"leonius",25f,50,12,360f);
        Mamifero gp = new Guepardo("Africa occidental",10f,12f,90f,"Guepardoux",12f,75);
        Mamifero lb = new Lobo("Todo el mundo",5f,30f,35f,"loboux","gris",5f,20,"king");
        Mamifero pr = new Perro("Mundial",4f,4f,25f,"perroux","naranja",3f,180);

        mf[0] = tg;
        mf[1] = ln;
        mf[2] = gp;
        mf[3] = lb;
        mf[4] = pr;

       for(Mamifero  mn : mf)
       {
           System.out.println("");
           System.out.println("nombre cientifico: " + mn.getNombreCientifico().toString());
           System.out.println("Habitat: " + mn.getHabitat().toString());
           System.out.println("Altura(mts): " + mn.getAltura());
           System.out.println("Largo(): " + mn.getLargo());
           System.out.println("peso: " + mn.getPeso());
           System.out.println("Comida preferida: " + mn.comer());
           System.out.println("Actividad fisica: " + mn.correr());
           System.out.println("Descanso promedio: " + mn.dormir());
           System.out.println("Frecuencia de comunicación:" +mn.comunicarse());
       }






    }
}