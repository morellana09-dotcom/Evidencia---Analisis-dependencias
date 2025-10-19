public class Calculadora {
    private int num1;
    private int num2;

    public Calculadora() {
        this.num1 = 0;
        this.num2 = 0;
    }

    public Calculadora(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int sumar() {
        return this.num1 + this.num2;
    }

    public int multiplicar() {
        return this.num1 * this.num2;
    }


    public void setN1(int num1) {
        this.num1 = num1;
    }

    public void setN2(int num2) {
        this.num2 = num2;
    }
}

