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
        MathOperation.result(20,10 ,"Addition",addition);
        MathOperation.result(20,10,"Subtraction",subtraction);
        MathOperation.result(20,10,"Division",division);
    }
}
