package br.com.menu.handle.exception.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
public class InternalServerErrorException extends Exception {

  private static final long serialVersionUID = 1L;

  public InternalServerErrorException() {
    super();
  }

  public InternalServerErrorException(String msg) {
    super(msg);
  }

}
