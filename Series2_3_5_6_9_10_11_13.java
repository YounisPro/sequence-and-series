class Series2_3_5_6_9_10_11_13{
	public static void main(String[] args){
		int s1=-1;
		int s2=-5;
		int s3=0;
		for(int i=3;i<20;i++){
			System.out.print((s1+=i)+", "+(s2+=(10-(2*(i-2))))+", "+(s3+=5)+", ");
		}
	}
}
