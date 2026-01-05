//LEGGERE LE ISTRUZIONI NEL FILE ESERCIZIO.md

//Import di Classi Java necessarie al funzionamento del programma
import utils.ImageRGB;

// Classe principale, con metodo main
class Esercizio {

    //Elimina le componenti Verde e Blu, lasciando solo il Rosso
    public static void filtroRosso( int[][] R, int[][] G, int[][] B ) {
        // TODO: Implementare il filtro
        // Suggerimento: azzerare i valori di G e B per ogni pixel
    }
    
    //Bianco e nero: R, G, B impostati alla media dei valori
    public static void filtroBW( int[][] R, int[][] G, int[][] B ) {
        // TODO: Implementare il filtro
        // Suggerimento: calcolare la media di R, G, B e assegnarla a tutti e tre i canali
    }

    //I pixel vicino al centro hanno più luminosità
    public static void filtroCentro(int[][] R, int[][] G, int[][] B) {
        // TODO: Implementare il filtro
        // Suggerimento: calcolare la distanza di ogni pixel dal centro
        // e moltiplicare i valori RGB per un fattore proporzionale
    }

    //Effetto glitch (rosso e blu sfasati)
    public static void filtroGlitch(int[][] R, int[][] G, int[][] B) {
        // TODO: Implementare il filtro
        // Suggerimento: creare copie di R e B, poi spostare i pixel
        // rossi in alto a sinistra e i blu in basso a destra
    }

    //Oscura i pixel che non sono Mare (prevalenza blu)
    public static void filtroMare(int[][] R, int[][] G, int[][] B) {
        // TODO: Implementare il filtro
        // Suggerimento: un pixel è "mare" se R<127, G<127, B>=127
        // Oscurare (azzerare) i pixel che non soddisfano la condizione
    }

    //Oscura i pixel che non sono Spiaggia (prevalenza giallo)
    public static void filtroSpiaggia(int[][] R, int[][] G, int[][] B) {
        // TODO: Implementare il filtro
        // Suggerimento: un pixel è "spiaggia" se R>=127, G>=127, B<127
        // Oscurare (azzerare) i pixel che non soddisfano la condizione
    }

    //Oscura i pixel che non sono Vegetazione (prevalenza verde)
    public static void filtroVegetazione(int[][] R, int[][] G, int[][] B) {
        // TODO: Implementare il filtro
        // Suggerimento: un pixel è "vegetazione" se R<100, G>=100, B<100
        // Oscurare (azzerare) i pixel che non soddisfano la condizione
    }

    
    public static void main(String args[]) {

        try {
            //Attiva qui uno dei due file immagine da leggere:
            String nomeFileIn = "faro";
            //String nomeFileIn = "foto_aerea";

            //Conversione dell'immagine in matrici parallele R, G, B
            ImageRGB.RGB rgb = ImageRGB.extractRGB("immagini/" + nomeFileIn + ".png");
            int[][] R = rgb.R();
            int[][] G = rgb.G();
            int[][] B = rgb.B();

            //Qui R, G, B contengono i livelli di rosso, verde, blu per ogni pixel.
            //I valori vanno da 0 a 255, da bassa intensità ad alta intensità.
            //Visualizzo la dimensione dell'immagine considerando il rosso (verde e blu hanno la stessa dimensione).
            System.out.println("Dimensione immagine: " + R.length+ "x" + R[0].length );

            //Chiama qui la funzione filtro, passando come parametri le matrici R,G,B da modificare, ad es.:
            //filtroRosso(R, G, B);
            //___

            //Assegna il nome del file di output (immagine con filtro), ad es. "faro_rosso.png":
            String nomeFileOut = "___";

            ImageRGB.writeRGB(R, G, B, nomeFileOut);
 
        } catch( Exception e) {
            e.printStackTrace();
        }
    }
}

//LEGGERE LE ISTRUZIONI NEL FILE ESERCIZIO.md