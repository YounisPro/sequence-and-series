public class AnyTableRecEx1 {
    public static void main(String[] args) {
        int table=Integer.parseInt(args[0]);
        int size=Integer.parseInt(args[1]);

        System.out.println(printTable(table,size));
    }

    static String printTable(int table,int size){
        if(size>0)
            return printTable(table,size-1)+(size==1?"":"\n")+(table+"X"+size+"="+(table*size));
        return "";
    }
}
