package oopconcept;

public class Function {

    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 4;

        Function fcn = new Function();

        int add = fcn.addition(num1, num2);
        System.out.println(add);

        int subtract = fcn.subtraction(num1, num2);
        System.out.println(subtract);

        int multiply = fcn.multiplication(num1, num2);
        System.out.println(multiply);
    }
    public int addition(int num1, int num2){
        return (num1 + num2);
    }

    public int subtraction(int num1, int num2){
        return (num1 - num2);
    }

    public int multiplication(int num1, int num2){
        return (num1 * num2);
    }
}
