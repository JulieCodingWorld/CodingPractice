class Solution {
    public boolean backspaceCompare(String S, String T) {
	        return build(S).equals(build(T));
	    }
	 
	 public String build(String S) {
		 StringBuilder sb = new StringBuilder();
		 
		 int slow = 0;
		 int fast = 0;
		 
		 for(char c : S.toCharArray()){
			 if(c != '#') {
				 sb.append(c);
			 } else{
				 if(sb.length() != 0){
					 sb.deleteCharAt(sb.length() - 1);					
				 }
			 }
			 slow++;
		 }
		 System.out.println(sb.toString());
		 return sb.toString();
	 }
}