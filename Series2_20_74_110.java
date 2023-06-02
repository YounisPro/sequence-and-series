class Series2_20_74_110{
	public static void main(String[] args){
		int size=10;
		int start=-34;
		int val1=1;
		int val2=2;
		for(int i=0;i<size;i++){
			start=i%2==0?((val2++)*18+start):((val1++)*18+start);
			System.out.print(start+", ");
			
		}
	}
}
