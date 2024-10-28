public class App{

    public static void main(String[] args){

        recursiveReverseFunction(10);

        recursiveAscendingFunction(0);
    }

    public static void recursiveReverseFunction(int n){
        
        if (n > 5){
            recursiveReverseFunction(n-1);
            System.out.println(n);
        }
    }

    public static void recursiveAscendingFunction(int n){
        
        if (n < 5){
            recursiveAscendingFunction(n+1);
            System.out.println(n);
        }
    }
}