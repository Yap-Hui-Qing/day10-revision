public class App{

    public static void main(String[] args){

        recursiveReverseFunction(10);

        recursiveAscendingFunction(0);
    }

    public static void recursiveReverseFunction(int n){
        System.out.println(n);
        if (n > 5){
            recursiveReverseFunction(n-1);
        }
    }

    public static void recursiveAscendingFunction(int n){
        System.out.println(n);
        if (n < 5){
            recursiveReverseFunction(n+1);
        }
    }
}