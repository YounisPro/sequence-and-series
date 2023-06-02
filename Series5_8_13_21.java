class Series5_8_13_21{
	public static void main(String[] args){
		int size=10;
		int v1=2;
		int v2=3;
		int sum=v1+v2;
		for(int i=0;i<size;i++){
			System.out.print(sum+", ");
			v1=v2;
			v2=sum;
			sum=v1+v2;
		}
	}
}
