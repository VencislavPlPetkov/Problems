package Task1;

public class Task1c_IndexOf {

	public static void main(String[] args) {
		System.out.println(indexOf(2,1,2,3));
	}
	
	public static int indexOf(int a, int... arr){
		int index = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == a) {
				index = i;
			}
		}
		return index;
	}
}