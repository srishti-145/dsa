class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<tokens.length;i++){
            String s=tokens[i];
            if(!s.equals("+") && !s.equals("-") &&
                !s.equals("*") && !s.equals("/")){
                st.push(Integer.parseInt(s));
            }
            else{
                 int a = st.pop();
                int b = st.pop();

                if (s.equals("+")) {
                    st.push(b + a);
                } else if (s.equals("-")) {
                    st.push(b - a);
                } else if (s.equals("*")) {
                    st.push(b * a);
                } else {
                    st.push(b / a);
                }
            }
        }
        return st.peek();
    }
}