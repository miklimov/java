package array;

public class Array{
	public static void main(String[] args){
		int[] array = {1,2,3,4,5};
		array[2]=10;
		for(int i=0;i<array.length;i++)
		System.out.println("Array size: "+array[i]);
	}
}