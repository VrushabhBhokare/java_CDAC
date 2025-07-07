
package ass5;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String arr1[]= {"Apple","Mango","Orange"};
			String arr2[]= {"Mango","Banana","Apple"};
			
			for(int i=0;i<3;i++) {
				for(int j=0;j<3;j++)
				if( arr1[i].equals(arr2[j])) {
					System.out.println("common string is "+arr1[i]);
				}
					
			}
			
			

	}

}
