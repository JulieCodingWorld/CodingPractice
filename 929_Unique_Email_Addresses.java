class Solution {
    public int numUniqueEmails(String[] emails) {
        
        Set<String> set = new HashSet<>();
        
        StringBuilder builder = new StringBuilder();
        char[] array = null;
        boolean isLocalName = true;
        boolean isRunning = true;
        
        for(String email:emails){
            
            isLocalName = true;
            isRunning = true;
            array = email.toCharArray();
            for(char c:array){
                
                if(c == '+'){
                    isRunning = false;
                }else if(c == '@'){
                    isLocalName = false;
                    isRunning = true;
                }
                
                if(isRunning){                    
                    if(isLocalName && c !='.'){
                        builder.append(String.valueOf(c));
                    }else if(!isLocalName){
                            builder.append(String.valueOf(c));
                    }
                }
            }
            set.add(builder.toString());
            builder.setLength(0);
        }
        return set.size();        
    }
}