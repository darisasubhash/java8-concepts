package mathoperation;
@FunctionalInterface
public interface MathOperation {
    int operate(int a,int b);
    static void result(int a, int b, String function, MathOperation mobj){
        System.out.println("Result of "+ function +"is "+mobj.operate(a,b));
    }
}
