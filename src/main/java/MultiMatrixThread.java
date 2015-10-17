import java.util.Arrays;

public class MultiMatrixThread extends Thread {
  private Integer[][] a;
  private Integer[][] b;
  private Integer[][] result;
  private int i, j;

  public MultiMatrixThread(Integer[][] a, Integer[][] b, Integer[][] result, int i, int j) {
    this.a = a;
    this.b = b;
    this.result = result;
    this.i = i;
    this.j = j;
  }

  public void run() {
    result[i][j] = 0;
    for (int k = 0; k < a[i].length; ++k) {
      result[i][j] = result[i][j] + a[i][k] * b[k][j];
    }
  }
}