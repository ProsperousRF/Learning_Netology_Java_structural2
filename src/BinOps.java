/**
 * @author Stanislav Rakitov
 */
public class BinOps {
  public String sum(String a, String b) {
    /*Переведите числа из двоичной записи в
      строках в int, сложите и переведите
      обратно в двоичную запись*/
    // convert numbers from binary string to int then sum them and convert back to binary string
    return Integer.toBinaryString(Integer.parseInt(a, 2) + Integer.parseInt(b, 2));

  }

  public String mult(String a, String b) {
    /*Переведите числа из двоичной записи в
      строках в int, перемножьте и переведите
      обратно в двоичную запись*/
    return Integer.toBinaryString(Integer.parseInt(a, 2) * Integer.parseInt(b, 2));
  }


}