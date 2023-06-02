class Series1_2_2_5_3_10{
	public static void main(String[] args){
		int size=10;
		int s1=1;
		for(int i=1;i<size;i++)
		 	System.out.print(i+", "+(s1=s1+(i*2-1))+", ");
		System.out.println();
	}
}
