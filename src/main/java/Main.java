import java.util.Random;

public class Main {
  public static void main(String[] args) {
    TestTime(20);
    TestTime(100);
    TestTime(500);
  }

  private static void TestTime(int size) {
    Integer[][] a = new Integer[size][size];
    Integer[][] b = new Integer[size][size];
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
    System.out.print("size = ");
    System.out.println(size);
    long t = System.currentTimeMillis();
    MultiMatrix.multi(a, b, result);
    System.out.print("time without threads = ");
    System.out.println(System.currentTimeMillis() - t);
    t = System.currentTimeMillis();
    try {
      MultiMatrix.multiThread(a, b, result);
    } catch (InterruptedException e) {
      return;
    }
    System.out.print("time with threads = ");
    System.out.println(System.currentTimeMillis() - t);
    t = System.currentTimeMillis();
    try {
      MultiMatrix.multiThreadPool(a, b, result);
    } catch (InterruptedException e) {
      return;
    }
    System.out.print("time with thread pool = ");
    System.out.println(System.currentTimeMillis() - t);
  }
}
