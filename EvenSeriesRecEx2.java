public class EvenSeriesRecEx2 {
    public static void main(String[] args) {
        int size=Integer.parseInt(args[0]);

        System.out.println(printEvenSeries(size));
    }

    static String printEvenSeries(int size){
        size=size%2==0?size:size-1;

        if(size>0)
            return printEvenSeries(size-2)+", "+size;
        return size+"";
    }
}
