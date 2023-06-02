class Series3_5_9_17{
	public static void main(String[] args){
		int size=10;
		int start=2;
		int ans=start;
		for(int i=start;i<size;i++){
			ans=ans*2-1;
			System.out.print(ans+", ");
		}
	}
}
