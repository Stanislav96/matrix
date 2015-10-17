import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

public class TestMatrix {
  @Test
  public void TestInteger() {
    Integer[][] a = new Integer[10][8];
    Integer[][] b = new Integer[8][11];
    Integer[][] result = new Integer[a.length][b.length];
    Random random = new Random(System.currentTimeMillis());
    for (int ind = 0; ind < 3; ind++) {
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
      try {
        MultiMatrix.multi(a, b, result);
        CheckMulti(a, b, result);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }

  private void CheckMulti(Integer[][] a, Integer[][] b, Integer[][] result) {
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < b.length; j++) {
        Integer t = 0;
        for (int k = 0; k < a[i].length; k++) {
          t += a[i][k] * b[k][j];
        }
        Assert.assertTrue(t.equals(result[i][j]));
      }
    }
  }
}
