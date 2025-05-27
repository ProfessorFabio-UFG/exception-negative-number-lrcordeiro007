public class Calculadora {
    private int numero1;
    private int numero2;

    public Calculadora(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public int somar() {
        return numero1 + numero2;
    }

    public int subtrair() {
        return numero1 - numero2;
    }

    public int multiplicar() {
        return numero1 * numero2;
    }

    public int dividir() {
        if (numero2 == 0) {
            throw new ArithmeticException("Erro: Divisão por zero.");
        }
        return numero1 / numero2;
    }
}
