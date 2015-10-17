import java.util.Random;

public class Main {
  public static void main(String[] args) {
    Integer[][] a = new Integer[300][300];
    Integer[][] b = new Integer[300][300];
    Integer[][] result = new Integer[a.length][b[0].length];
    Random random = new Random(System.currentTimeMillis());
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a[i].length; j++) {
        a[i][j] = random.nextInt();
      }
    }
    for (int i = 0; i < b.length; i++) {
      for (int j = 0; j < b[i].length; j++) {
        b[i][j] = random.nextInt();
      }
    }
    long t = System.currentTimeMillis();
    try {
      MultiMatrix.multiThread(a, b, result);
    } catch (InterruptedException e) {
      return;
    }
    System.out.print("time with threads = ");
    System.out.println(System.currentTimeMillis() - t);
    t = System.currentTimeMillis();
    MultiMatrix.multi(a, b, result);
    System.out.print("time without threads = ");
    System.out.println(System.currentTimeMillis() - t);
  }
}
