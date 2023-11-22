
public class Main {

    public static void main(String[] args) {
        
        // INGRESO DE DATOS
        InputData input = new InputData();

        String posicionInicial = input.getChessPosition("Ingrese la posición de partida del alfil (Ejemplo: a1): ");
        String posicionFinal = input.getChessPosition("Ingrese la posición final del alfil (Ejemplo: h8): ");

        System.out.println("==================================================");
        System.out.println("- Posicion Inicial: " + posicionInicial);
        System.out.println("- Posicion Final: " + posicionFinal);


        // IMPRESION DEL RESULTADO
        Process proceso = new Process(posicionInicial, posicionFinal);
        System.out.println("- Resultado:");
        proceso.ValidatePosition();
        System.out.println("==================================================");

    }
    
}