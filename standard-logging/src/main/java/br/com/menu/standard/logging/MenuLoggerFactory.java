package br.com.menu.standard.logging;

public class MenuLoggerFactory {

  private static final String REGEX = "(.controller.*)|(.dto.*)|(.enums.*)|(.mapper.*)|(.repository.*)|(.service.*)";

  private MenuLogger menuLogger = null;

  public MenuLogger getInstace(Class<?> clazz, MicroserviceLogger microserviceLogger){
    return new MenuStandardLogger(getClassName(clazz.getName()), microserviceLogger);
  }

  private String getClassName(String clazz) {
      return clazz.replaceFirst(REGEX, "");
  }
}
