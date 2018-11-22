package br.com.menu.standard.logging;

public interface MenuLogger {

  void info(String msg);

  void warn(String msg);

  void trace(String msg);

  void error(String msg);

}
