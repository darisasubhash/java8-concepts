package mathoperation;

public class MathOperationApp {
    public static void main(String[] args) {
        MathOperation addition=(a,b) -> a + b;
        MathOperation subtraction=(a,b) -> a * b;
        MathOperation division=(a,b) -> {
            if(b==0){
                System.out.println("Division by Zero not Possible ");
                return 0;
            }
            return a / b;
        };
        System.out.println("Addition of 10 and 20 : "+ addition.operate(10,20));
        System.out.println("Subtraction of 20 and 10 : "+subtraction.operate(20,10));
        System.out.println("Division of 20 and 10 : "+division.operate(20,10));
    }
}
