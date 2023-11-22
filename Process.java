public class Process {

    private String posicionInicial;
    private String posicionFinal;

    public Process(String posicionInicial, String posicionFinal) {
        this.posicionInicial = posicionInicial;
        this.posicionFinal = posicionFinal;
    }

    /**  El algoritmo compara si el valor absoluto de la diferencia entre la fila tanto de la posicion inicial como la final es igual 
        al valor absoluto de la diferencia entre la columna tanto inicial como la final de las posiciones ingresadas.**/
    public void ValidatePosition() {

        int columnInicial = posicionInicial.charAt(0) - 'a';
        int rowInicial = Character.getNumericValue(posicionInicial.charAt(1)) - 1;

        int columnFinal = posicionFinal.charAt(0) - 'a';
        int rowFinal = Character.getNumericValue(posicionFinal.charAt(1)) - 1;
        
        if (Math.abs(columnFinal - columnInicial) == Math.abs(rowFinal - rowInicial)) {
            System.out.println("- El movimiento es correcto");
            return;
        } 

        System.out.println("- El movimiento es incorrecto");

    }
    
}