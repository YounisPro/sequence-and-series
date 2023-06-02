class Series5_14_27_44_65{
	public static void main(String[] args){
		int v1=10;
		int v2=5;
		int diff=(v1-v2);
		for(int i=0;i<10;i++){
			System.out.print(v2+", ");
			v1=v2;
			v2=v2+diff+4;
			diff=v2-v1;
		}		
	}
}
