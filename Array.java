
//Arrays are obj in java

public class Array {

	public static void main(String[] args) {
		
		int nums[]=new int[4]; //1D array
		String name[]={"bakya","Keerthi","Dharsh"};
		
		for(String k : name) { //foreach loop
			System.out.println(k);
		}
		
		int num2d[][]= {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12}
		};
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<4;j++) {
				System.out.print(" "+ num2d[i][j]);
			}
			System.out.println();
		}
		
		for (int k[]: num2d) {
			for(int l:k) {
				System.out.print("In Foreach loop - " + l +"\n");
			}
		}
		
		int jaggedArray[][]= { //jaggedArray- diff no.of elements in a row
				{1,2,3},
				{4,5},
				{6}
		};
		
		for(int i=0;i<jaggedArray.length;i++) {
			for(int j=0;j<jaggedArray[i].length;j++) {
				System.out.print(" "+ jaggedArray[i][j]);
			}
			System.out.println();
		}
	}
}
