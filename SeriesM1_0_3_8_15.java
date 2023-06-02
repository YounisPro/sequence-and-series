class SeriesM1_0_3_8_15{
	public static void main(String[] args){
		int size=50;
		int start=0;
		for(int i=-1;i<size;i+=2){
			start=i+start; 
			System.out.print(start+", ");
		}
	}
}
