class Series1_2_5_12_27_58{
	public static void main(String[] args){
		int size=10;
		int start=1;
		int add=0;
		for(int i=0;i<size;i++){
			System.out.print(start+", ");
			start=start*2+add++;	
		}
	}
}
