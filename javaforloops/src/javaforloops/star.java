package javaforloops;

public class star {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("************forward *print*************");
		for(int i=0;i<10;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		} 
		System.out.println("***********0 1 2 3 4 5 6 7 8 9***********");
		for(int m=0; m<10; m++) {
			for (int n=0; n<=m; n++) {
				System.out.print(" "+m);
			}
			System.out.println();
		}
		System.out.println("-----------reverse * print-------------");
		for(int k=10; k>=1; k--) {
			for(int l=1; l<=k; l++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		System.out.println("**********reverese number print------------");
		for(int x=10; x>=0; x--) {
			for(int y=0; y<=x; y++) {
				System.out.print(" "+x);
			}
			System.out.println();
		}
		System.out.println("**************try*******************");
		for(int p=10; p>5; p--) {
			for(int q=0; q<=p; q++) {
				System.out.print("* ");
			}
			System.out.println();
			}
		}
	}

