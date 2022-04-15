/**
 * @author Stanislav Rakitov
 */
public class Main {
  public static void main(String[] args) {
    BinOps bins = new BinOps();
    // демонстрация

    System.out.println(bins.sum("100", "100"));
    System.out.println(bins.sum("1", "1"));
    System.out.println(bins.mult("100", "10"));
    System.out.println(bins.mult("10", "10"));
  }
}