import java.util.ArrayList;
public class Maze2 {
  //In this question we decide maze with arraylist
  static ArrayList<String>pathrel(String p,int r,int c){
    if(r==1&&c==1){
      ArrayList<String>list = new ArrayList<>();
      list.add(p);
      return list;
    }
    ArrayList<String>list = new ArrayList<>();
    if(r>1){
      list.addAll(pathrel(p+"D", r-1, c));
    }
    if(c>1){
      list.addAll(pathrel(p+"R", r, c-1));
    }

    return list;
  }
  public static void main(String argc[]){
    System.out.println(pathrel("", 3, 3));
  }
}
