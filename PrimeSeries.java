class PrimeSeries{
	public static void main(String[] args){
		int size=50;
		int start=3;
		
		for(int i=start;i<size;i++){
			int j=start;
			for(j=2;j<i;j++)
				if(i%j==0) break;
			if(j==i) System.out.print(i+", ");
			
		}
	}
}
