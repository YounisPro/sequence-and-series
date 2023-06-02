public class OddSeriesRecEx1 {
    public static void main(String[] args) {
        int size=Integer.parseInt(args[0]);
        System.out.println(oddSeries(size));
    }

    static int oddSeries(int size){
        size=size%2==0?size-1:size;

        if(size>1)
            System.out.println(oddSeries(size-2));
        return size;
    }
}