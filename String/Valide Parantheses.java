 
//Stach data structure
class Solution {
    public boolean isValid(String s) {
        int n = s.length();
        Stack<Pair<Integer,Character>> stack = new Stack<Pair<Integer,Character>>();
        if(s.charAt(0) == ')' || s.charAt(0) == ']' || s.charAt(0) == '}')
            return false;
        
        for(int i=0 ; i<n ; i++){
            switch(s.charAt(i)){
             case '(': 
                stack.push(new Pair(1,'('));
                break;
             case '[' :
                stack.push(new Pair(2,'['));
                break;
             case '{': 
                stack.push(new Pair(3,'{'));
                break;
                    
             case ')' :
                 if(!stack.empty() && stack.peek().equals(new Pair(1,'(')))
                    stack.pop();
                 else
                    return false;
            
                break;
             case ']' :
                 if(!stack.empty() && stack.peek().equals(new Pair(2,'[')))
                    stack.pop();
                 else
                    return false;
                 
                 break;
            
              case '}' :
                 if(!stack.empty() && stack.peek().equals(new Pair(3,'{')))
                    stack.pop();
                 else
                    return false;
            
                break;
                    
             default :
                    return false;
            }
        }
        
        if(stack.empty())
            return true;
        else 
            return false;
    }
}
