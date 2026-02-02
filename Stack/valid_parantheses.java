import java.util.Stack;
public class valid_para {
  public static boolean valid(String s){
    Stack <Character> st = new Stack<>();
    for(char ch : s.toCharArray()){
      if(ch=='('){
        st.push(')');
      }
      else if(ch=='['){
        st.push(']');
      }
      else if(ch=='{'){
        st.push('}');
      }
      else if(st.isEmpty() || st.pop()!=ch){
        return false;
      }
    }
    return st.isEmpty();
  }
  public static void main(String[] args) {
    String st = "{}()[]";
    boolean res = valid(st);
    System.out.println(res);

  }
}
