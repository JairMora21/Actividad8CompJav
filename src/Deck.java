import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Random;

public class Deck {

    LinkedList<String> baraja = new LinkedList<String>();

    public Deck(){

    }

    Card card = new Card();

    public void crearBaraja(){
        String [] palo = card.getPalo();
        String [] color = card.getColor();
        String [] valor = card.getValor();

        String carta = "";
        int iterar = 0;
        int cambiarColor = 0;


        for (int i = 0; i< palo.length;i++){
                for (int j = 0; j< valor.length;j++){

                    iterar++;
                    if (iterar >= 27){
                        cambiarColor = 1;
                    }
                    carta =  "{"+palo[i]+"}" + "," + "{"+ color[cambiarColor] +"}" + "," + "{" + valor[j] + "}";
                    baraja.add(carta);
                }
        }

        /*
        ListIterator iterator = baraja.listIterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        */




    }

    public void shhuffle (){
        System.out.println("Se mezclo el deck");
    }
    public void head(){

        System.out.println("Su carta es");
        System.out.println(baraja.getFirst());
        baraja.removeFirst();
        System.out.println("Quedan " + baraja.size() + " cartas");
    }

    public void pick (){

        int aleatorio  = 0;
        Random random = new Random();

        aleatorio = (int) (random.nextDouble() * baraja.size());

        System.out.println("Su carta es");
        System.out.println(baraja.get(aleatorio));
        baraja.remove(aleatorio);
        System.out.println("Quedan " + baraja.size() + " cartas");

    }

    public void hand (){
        String [] misCartas = new String[5];
        int aleatorio  = 0;
        Random random = new Random();


        for (int i = 0; i< misCartas.length; i++){
            aleatorio = (int) (random.nextDouble() * baraja.size());
            misCartas[i] = baraja.get(aleatorio);
            baraja.remove(aleatorio);
        }

        for (String cartas: misCartas){
            System.out.println(cartas);
        }
        System.out.println("Quedan " + baraja.size() + " cartas");
    }



}
