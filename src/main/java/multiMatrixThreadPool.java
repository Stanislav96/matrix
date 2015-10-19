public class multiMatrixThreadPool implements Runnable {
  private Integer[][] a;
  private Integer[][] b;
  private Integer[][] result;
  private int i;

  public multiMatrixThreadPool(Integer[][] a, Integer[][] b, Integer[][] result, int i) {
    this.a = a;
    this.b = b;
    this.result = result;
    this.i = i;
  }

  public void run() {
    for (int j = 0; j < b[0].length; j++) {
      result[i][j] = 0;
      for (int k = 0; k < b.length; ++k) {
        result[i][j] += a[i][k] * b[k][j];
      }
    }
  }
}
