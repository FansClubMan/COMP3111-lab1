package labs.comp3111.ust.hk;

public class Lab1Activity {
	
	public static void main (String[]args) {
		int [] arr = {1,2,3,4,5,6,7,8,9,10};
		int sum = 0;
		
		for(int i=0; i<10; i++){
			sum+=arr[i];
		}
		System.out.println(String.format("Sum of the numbers is %d", sum));
		int max=0;
		for(int i=0; i<10; i++) {
			if(max<arr[i])
				max=arr[i];
		}
		int min=100;
		for(int i=0; i<10; i++) {
			if(max>arr[i])
				max=arr[i];
		}
		System.out.println(String.format("max is %d", max));
		System.out.println(String.format("min is %d", min));
	}
}
