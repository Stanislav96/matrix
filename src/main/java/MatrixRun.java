public class MatrixRun implements Runnable {
  private Integer[][] a;
  private Integer[][] b;
  private Integer[][] result;
  private int i1;
  private int i2;

  /*private Integer[][] a;
  private Integer[][] b;
  private Integer[][] result;
  private int i;

  public MatrixRun(Integer[][] a, Integer[][] b, Integer[][] result, int i) {
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
  }*/
  public MatrixRun(Integer[][] a, Integer[][] b, Integer[][] result, int i1, int i2) {
    this.a = a;
    this.b = b;
    this.result = result;
    this.i1 = i1;
    this.i2 = i2;
  }

  public void run() {
    for (int i = i1; i < i2; i++) {
      for (int j = 0; j < b[0].length; j++) {
        result[i][j] = 0;
        for (int k = 0; k < b.length; ++k) {
          result[i][j] += a[i][k] * b[k][j];
        }
      }
    }
  }
}
