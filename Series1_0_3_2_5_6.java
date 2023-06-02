class Series1_0_3_2_5_6{
	public static void main(String[] args){
		int size=10;
		int val1=-2;
		int val2=-1;
		for(int i=0;i<size;i++)
			System.out.print((val2+=2)+", "+(val1+=2)+", ");
	}
}
