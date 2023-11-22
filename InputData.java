import java.util.InputMismatchException;
import java.util.Scanner;

public class InputData {
    
    private final Scanner scanner;

    public InputData() {
        this.scanner = new Scanner(System.in);
    }

    // Devuelve un array de dos enteros [fila, columna] (transforma la letra ingresada en numero).
    public String getChessPosition(String message) {
        while (true) {
            try {
                System.out.println(message);
                String input = scanner.next().toLowerCase(); // Convertimos a minúsculas.
                if (input.length() == 2 && input.matches("^[a-h][1-8]$")) return input; // Validamos que sea una una posicion de ajedrez valida.
                System.out.println("Formato incorrecto. Intente nuevamente (Ejemplo: A1).");

            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Intente nuevamente. (Ejemplo: A1)");
                scanner.next();
            }
        }
    }
    
}
