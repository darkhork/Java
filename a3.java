package a;

public class a3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for(int i=0;i<5;i++){
			for(int j=0;j<4-i;j++)
			  	System.out.print(" ");
			for(int k=0;k<i*2+1;k++)
				System.out.print(k+1);
			System.out.println("");
		}

	}

}
