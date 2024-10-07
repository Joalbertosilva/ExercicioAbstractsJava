package entities;

public class Question2 {
    private String number1;

    public Question2(String number1){
        this.number1 = number1;
    }

    public Question2(){}
    public void reverse(String number1){
        this.number1 = number1;
        try{
            int number = Integer.parseInt(number1);
            System.out.println(number);
        } catch (NumberFormatException e){
            System.out.println("Numero invalido");
        }
    }

    public String getNumber1() {
        return number1;
    }

    public void setNumber1(String number1) {
        this.number1 = number1;
    }
}
