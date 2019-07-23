class Solution {
     ArrayList<Integer> arr = new ArrayList<Integer>();
	
	 public int oddEvenJumps(int[] A) {
		 	int len = A.length;  
		 	
		 	arr.add(len - 1);
		 	
		 	Count(A, len - 1); 		 			 	
		 	
		 	System.out.println(arr.size());
		 	
		 	for(int i =0; i< arr.size(); i++){
		 		System.out.println("position: " + i + " value: " + arr.get(i));
		 	}
		 	
		 	return arr.size();
	 }
	/**
	 * Input: [10,13,12,14,15]
Output: 2
Explanation: 
From starting index i = 0, we can jump to i = 2 (since A[2] is the smallest among A[1], A[2], A[3], A[4] that is greater or equal to A[0]), then we can't jump any more.
From starting index i = 1 and i = 2, we can jump to i = 3, then we can't jump any more.
From starting index i = 3, we can jump to i = 4, so we've reached the end.
From starting index i = 4, we've reached the end already.
In total, there are 2 different starting indexes (i = 3, i = 4) where we can reach the end with some number of jumps. 
	 * @param array
	 * @param pos
	 * @return
	 */
	 public void Count(int[] array, int i){
		 if(i == 0) {
			 if(!arr.contains(0)){
				 arr.add(0);
			 };
			 return;
		 }
		 if(i == 1) {
			 if(!arr.contains(1)){
				 arr.add(1);
			 };
			 if(array[1] < array[0]){
				Count(array, 0);
			 }
			 return;
		 }
		 
		 if(i-1 >= 0 && array[i] <= array[i-1]) { 
			 if(!arr.contains(i-1)){
				 arr.add(i-1);
				 System.out.println("i: " + i + ". Add i - 1 so the arr has: " + arr.toString() + " and array[i] <= array[i-1]: " + array[i] + "<=" + array[i-1]);
			 };
			 Count(array, i-1);
		 }
		 
		 if(i - 2 >= 0 && array[i] >= array[i-2]){ 
			 if(!arr.contains(i-2)){
				 arr.add(i-2);
				 System.out.println("i: " + i + ". Add i - 2 so the arr has: " + arr.toString()+ " and array[i] >= array[i-2]:  " + array[i] + ">=" + array[i-2]);
			 };
			 Count(array, i-2);
		}
		 
		 
		 return;	 
	 }
}