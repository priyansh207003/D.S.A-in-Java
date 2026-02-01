import java.util.Stack;
public class remove_duplicate {
  public static String removrDuplicate(String s){
    Stack <Character> st = new Stack <>();
    for(int i=0;i<s.length();i++){
      char ch = s.charAt(i);
      if(!st.isEmpty() && st.peek()==ch){
        st.pop();
      }
      else{
        st.push(ch);
      }
    }
    StringBuilder sb = new StringBuilder();
    while(!st.isEmpty()){
      sb.append(st.pop());
    }
    return sb.reverse().toString();
  }
  public static void main(String argc[]){
    String s = "abbaca";
   String res = removrDuplicate(s);
    System.out.println(res);

  }
}
