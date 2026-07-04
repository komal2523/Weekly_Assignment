package Assignment2;

public class ArrayFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int arr[] = {4, 2, 4, 6, 2, 2, 7};

	        for (int i = 0; i < arr.length; i++) {

	            int count = 0;
	            boolean repeted = false;

	            for (int j = 0; j < i; j++) {
	                if (arr[i] == arr[j]) {
	                    repeted = true;
	                    break;
	                }
	            }

	            if (!repeted) {
	                for (int j = 0; j < arr.length; j++) {
	                    if (arr[i] == arr[j])
	                        count++;
	                }

	                System.out.println(arr[i] + " occurs " + count + (count == 1 ? " time" : " times"));
	            }
	        }
	  }

}


