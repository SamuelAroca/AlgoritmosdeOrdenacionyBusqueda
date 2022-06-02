public class Binaria {
    public static void main(String[] args) {
        int[] a = {-8, 4, 5, 9, 12, 18, 25, 40, 60, 60};
        System.out.println(busquedaBin(a, -8));
    }
    public static int  busquedaBin(int[] a, int clave) {
        int central, bajo, alto;
        int valorCentral;
        bajo = 0;
        alto = a.length - 1;
        while (bajo <= alto) {
            central = (bajo + alto) / 2; // Índice de elemento central
            valorCentral = a[central]; // valor del índice central
            if (clave == valorCentral)
                return central; // encontrado, devuelve posición
            else if (clave < valorCentral)
                alto = central - 1; // ir a sublista inferior
            else
                bajo = central + 1; // ir a sublista superior
        }
        return -1; // elemento no encontrado
    }
}
