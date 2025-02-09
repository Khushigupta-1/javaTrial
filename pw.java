
public class BinarySearch {
 public static int binarySeaarch(int num[],int key) {
	 int start=0;
	 int end=num.length-1;
	 
	 while(start<=end) {
		 int mid=start+end;
		 
		 if(num[mid]==key) {
			return mid; 
		 }
		 if(num[mid]<key) {
			 start= mid+1;
		 }else {
			end=mid-1; 
		 }
	 }
	return end;
	 
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int num[]= {2,1,5,7,8,10,12,};
      int key=12;
      System.out.println("index for key is:"+binarySeaarch(numbers,key));
	}

}