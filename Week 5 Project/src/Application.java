
public class Application {



  public static void main(String[] args) {
    Logger logger = new AsteriskLogger();
    
    String logInfo = "Hello";
    
    

    logger.log(logInfo);
  
    logger.error("ERROR:" + logInfo);

    System.out.println();
    //
    Logger spacedLogger = new SpacedLogger();
    spacedLogger.log(logInfo);

    System.out.println();

    spacedLogger.error(logInfo);


  }


}


