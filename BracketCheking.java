  
  import  java.util.Stack;
 
 class BracketCheking 
{
   public static void main (String [] arg)
   {
    String s = "()";
    Checker bobj = new Checker();
    boolean Ans = bobj.isValid(s);
    System.out.println("First String is "+Ans);

    s ="([)]{}";
    Checker bobj1 = new Checker();
    Ans = bobj1.isValid(s);
    System.out.println("Second String is "+Ans);

    
    s =  "([)]";
    Checker bobj2 = new Checker();
    Ans = bobj2.isValid(s);
    System.out.println("third String is "+Ans);
}
}


class Checker {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((c == ')' && top != '(') ||
                    (c == '}' && top != '{') ||
                    (c == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
