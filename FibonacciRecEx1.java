public class FibonacciRecEx1 {
    public static void main(String[] args) {
        int size=Integer.parseInt(args[0]);

        fibonacciSeries(size,0,1);
        System.out.println();
    }

    static void fibonacciSeries(int size, int val1,int val2){
        if(val2<size){
            System.out.print(val1==0?val2:" "+val2);
            fibonacciSeries(size,val2,val1+val2);
        }
    }
}
