class Series2_5_12_23_38_57{
	public static void main(String[] args){
		int size=10;
		int start=3;
		int add=-5;
		for(int i=0;i<size;i++)
			System.out.print((start+=(add+=4))+", ");
	}
}
