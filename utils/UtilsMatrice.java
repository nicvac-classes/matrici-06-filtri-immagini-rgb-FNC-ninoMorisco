package utils;
public class UtilsMatrice {
    
    // Per matrici int
    public static void visualizza(int[][] matrice) {
        if (matrice == null || matrice.length == 0) {
            System.out.println("Matrice vuota");
            return;
        }
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                System.out.printf("%4d ", matrice[i][j]);
            }
            System.out.println();
        }
    }
    
    // Per matrici double
    public static void visualizza(double[][] matrice) {
        if (matrice == null || matrice.length == 0) {
            System.out.println("Matrice vuota");
            return;
        }
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                System.out.printf("%7.2f ", matrice[i][j]);
            }
            System.out.println();
        }
    }
    
    // Per matrici di oggetti (Integer, Double, String, ecc.)
    public static <T> void visualizza(T[][] matrice) {
        if (matrice == null || matrice.length == 0) {
            System.out.println("Matrice vuota");
            return;
        }
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                System.out.printf("%10s ", matrice[i][j]);
            }
            System.out.println();
        }
    }

    /* Es. come Ritornare più variabili in output
    public static record Max(int max, int rIdx, int cIdx) { }
    public static Max cercaMax(int[][] matrice) {
        // ... ecc... 
        return new Max(5, 2, 3);
    }
    */

}
