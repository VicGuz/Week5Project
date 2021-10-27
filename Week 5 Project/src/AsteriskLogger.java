
public class AsteriskLogger implements Logger {

  @Override
  public void log(String log) {

    System.out.println("***" + log + "***\r\n");



  }



  public void error(String error) {
    
    int n = error.length();
    for (int i = 0; i < n + 6; i++) {
      System.out.print("*");
    }
    System.out.println();
    System.out.println("***" + error + "***");
    for (int i = 0; i < n + 6; i++) {
      System.out.print("*");
    }



  }
}
