
public class SpacedLogger implements Logger {

  @Override
  public void log(String Log) {
    int n = Log.length();

    for (int i = 0; i < n; i++) {
      System.out.print(Log.charAt(i) + " ");
    }



  }

  @Override
  public void error(String error) {
    // not the right way
    System.out.print("ERROR: ");
    int n = error.length();
    for (int i = 0; i < n; i++) {
      System.out.print(error.charAt(i) + " ");
    }

  }

}
