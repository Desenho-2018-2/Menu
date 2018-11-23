package br.com.menu.standard.logging;

public class MenuLoggerFactory {

  private static final String REGEX = "(.controller.*)|(.dto.*)|(.enums.*)|(.mapper.*)|(.repository.*)|(.service.*)";

  private MenuLogger menuLogger = null;

  public static MenuLogger getInstace(Class<?> clazz, MicroserviceLogger microserviceLogger){
    return new MenuStandardLogger(getClassName(clazz.getName()), microserviceLogger);
  }

  private static String getClassName(String clazz) {
      return clazz.replaceFirst(REGEX, "");
  }
}
