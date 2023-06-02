class Series4_11_7_14_10_17{
	public static void main(String[] args){
		int size=5;
		int val1=1;
		int val2=8;

		for(int i=0;i<size;i++)
			System.out.print((val1+=3)+", "+(val2+=3)+", ");
	}
}
