import java.util.*;
class Solution{

    public boolean ExtraBrackets(String str)
    {
        Stack<Character> st = new Stack<>();
        for(int i=0 ; i<str.length() ; i++)
        {
                char ch = str.charAt(i);
                if(ch!=')')
                {
                    st.push(ch);
                }
                else{
                    if(st.peek()=='(')
                    {
                        return true;
                    }
                    else{
                        while(st.size()>0 && st.peek()!='(')
                        {
                            st.pop();
                        }
                        st.pop();
                    }
                }
        }
        return false;

    }
}

public class ExtraBrackets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        Solution  s = new Solution();
        System.out.println(s.ExtraBrackets(str));

    }
}
