public class MultiMatrix {
  static void multi(Integer[][] a, Integer[][] b, Integer[][] result) throws InterruptedException {
    MultiMatrixThread[][] threads = new MultiMatrixThread[a.length][b.length];
    for (int i = 0; i < a.length; ++i) {
      for (int j = 0; j < b.length; ++j) {
        threads[i][j] = new MultiMatrixThread(a, b, result, i, j);
        threads[i][j].run();
      }
    }
    for (int i = 0; i < a.length; ++i) {
      for (int j = 0; j < b.length; ++j) {
        threads[i][j].join();
      }
    }
  }
}
