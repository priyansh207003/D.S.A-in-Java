public class Tower_Of_Henoi {
  public static void tower(int n,String scr,String helper,String dest){
    if(n==1){
      System.out.println("Transfer disk "+n+" from "+scr+" to "+dest);
      return;
    }
    tower(n-1, scr, dest, helper);
    System.out.println("Transfer disk "+n+" from "+scr+" to "+dest);
    tower(n-1, helper, scr, dest);
  }
  public static void main(String agc[]){
    int n = 3;
    tower(n, "S", "H", "P");
  }
}
