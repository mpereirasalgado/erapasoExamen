// ramas
//micaelpereirasalgado
package examencod;

public class ExamenCOD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numeroInicial = 11;
        if (compararpares(numeroInicial)) {
            System.out.println("Es numero primo");
        } else {
            System.out.println("NO es numero primo");
        }

        for (int iniciarContador = 2; iniciarContador < 1000; iniciarContador++) {
            if (compararpares(iniciarContador)) {
                System.out.print(iniciarContador + " ");
            }
        }
    }

    public static boolean compararpares(int numero) {
        int ini = 2;
        boolean auxiliar = true;
        while ((auxiliar) && (ini != numero)) {
            if (numero % ini == 0) {
                auxiliar = false;
            }
            ini++;
        }
        return auxiliar;
    }

}

/* Esto es una locura
 *
 */
