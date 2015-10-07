public boolean isValidParentheses(String s) {
        // Write your code here
        Stack <Character> stack = new Stack<Character>();
        if (s == null) return true;
        int len = s.length();
        stack.push(s.charAt(0));
        for (int i = 1; i < len; i++){
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {stack.push(s.charAt(i));}
            if (s.charAt(i) == ')'){
                if (stack.isEmpty()) return false;
                if(stack.peek() == '(' ) {stack.pop();}
                else stack.push(s.charAt(i));
            }
            if (s.charAt(i) == '}'){
                if (stack.isEmpty()) return false;
                if(stack.peek() == '{') {stack.pop();}
                else stack.push(s.charAt(i));
            }
            if (s.charAt(i) == ']'){
                if (stack.isEmpty()) return false;
                if(stack.peek() == '[') {stack.pop();}
                else stack.push(s.charAt(i));
            }
        }
        return stack.isEmpty();
    }
