package br.com.menu.standard.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MenuStandardLogger implements MenuLogger {

  private String clazz = "";
  private MicroserviceLogger microserviceLogger = null;
  private Logger logger = null;

  public MenuStandardLogger(String clazz, MicroserviceLogger microserviceLogger) {
    this.clazz = clazz;
    this.microserviceLogger = microserviceLogger;
    this.logger = LoggerFactory.getLogger(clazz);
  }

  public void info(String msg) {
    logger.info(microserviceLogger.name() + ": " + msg);
  }

  public void warn(String msg) {
    logger.warn(microserviceLogger.name() + ": " + msg);

  }

  public void trace(String msg) {
    logger.trace(microserviceLogger.name() + ": " + msg);

  }

  public void error(String msg) {
    logger.error(microserviceLogger.name() + ": " + msg);

  }

}
