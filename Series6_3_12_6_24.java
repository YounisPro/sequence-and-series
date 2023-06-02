class Series6_3_12_6_24{
	public static void main(String[] args){
		int size=50;
		int r1=6;
		int r2=3;
		for(int i=6;i<size;i++){
			System.out.print(r1+", "+r2+", ");
			r1=r1*2;
			r2=r2*2;
		}
	}
}
