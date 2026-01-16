//Permutation in string
public class permutation {
  static void permutation1(String p, String up){
    if(up.isEmpty()){
      System.out.println(p);
      return;
    }
    char ch = up.charAt(0);

    for(int i = 0; i <= p.length(); i++){
      String f = p.substring(0, i);
      String s = p.substring(i);
      permutation1(f + ch + s, up.substring(1));
    }
  }

  public static void main(String[] args){
    permutation1("", "ABC");
  }
}
