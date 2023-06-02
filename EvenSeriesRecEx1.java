class EvenSeriesRecEx1{
    public static void main(String[] args){
        int size=Integer.parseInt(args[0]);
        System.out.println(evenSeries(size));
    }

    static int evenSeries(int size){
        size=size%2==0?size-2:size-1;
        if(size>0)
            System.out.println(evenSeries(size));
        
        return size>0?size:0;
    }
}