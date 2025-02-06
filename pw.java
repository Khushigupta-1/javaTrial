
public class BinarySearch {
 public static int binarySeaarch(int numbers[],int key) {
	 int start=0;
	 int end=numbers.length-1;
	 
	 while(start<=end) {
		 int mid=start+end;
		 
		 if(numbers[mid]==key) {
			return mid; 
		 }
		 if(numbers[mid]<key) {
			 start= mid+1;
		 }else {
			end=mid-1; 
		 }
	 }
	return end;
	 
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int numbers[]= {2,3,5,7,8,10,12,14};
      int key=12;
      System.out.println("index for key is:"+binarySeaarch(numbers,key));
	}

}