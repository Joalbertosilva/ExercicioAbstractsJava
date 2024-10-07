package entities;

public class Question1 {
    private double numberOne;
    private double numberTwo;

    public Question1(double numberOne, double numberTwo){
        this.numberOne = numberOne;
        this.numberTwo = numberTwo;
    }
    public Question1(){}

    public void division(double numberOne, double numberTwo){
        try {
            this.numberOne = numberOne;
            this.numberTwo = numberTwo;

            if (numberTwo == 0) {
                throw new ArithmeticException("Divisão por zero não permitida.");
            }

            double value = numberOne / numberTwo;
            System.out.println(value);
        } catch (ArithmeticException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    public double getNumberOne() {
        return numberOne;
    }

    public double getNumberTwo() {
        return numberTwo;
    }

    public void setNumberOne(double numberOne) {
        this.numberOne = numberOne;
    }

    public void setNumberTwo(double numberTwo) {
        this.numberTwo = numberTwo;
    }
}
