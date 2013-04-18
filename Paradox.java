import java.util.ArrayList;

public class Paradox {
  public static void main(String[] args) {
    ArrayList<ArrayList> a = new ArrayList<ArrayList>();
    a.add(a);
    System.out.println("A: " + a);
    System.out.println("A(0): " + a.get(0));
    System.out.println("A(0)(0): " + a.get(0).get(0));
    System.out.println("#A: " + a.size());
  }
}
