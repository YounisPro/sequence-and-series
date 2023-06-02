class Series3_5_10_12_24_26{
	public static void main(String[] args){
		double s1=-0.5;
		double s2=1.5;
		for(int i=1;i<10;i++)
			System.out.print(((int)(s1=s1*2+4))+", "+((int)(s2=s2*2+2))+", ");
	}
}

