public class OddSeriesRecEx2 {
    public static void main(String[] args) {
        int size=Integer.parseInt(args[0]);
        System.out.println(printOddSeries(size));
    }

    static String printOddSeries(int size){
        size=size%2==0?size-1:size;

        if(size>1)
            return printOddSeries(size-2)+", "+size;

        return size+"";
    }
}
