package br.com.menu.handle.exception.dto;

import java.io.Serializable;
import java.util.Date;

public class ExceptionResponse implements Serializable {

  private static final long serialVersionUID = 1L;

  private Date timesTamp;
  private String message;
  private String details;

  public Date getTimesTamp() {
    return timesTamp;
  }

  public void setTimesTamp(Date timesTamp) {
    this.timesTamp = timesTamp;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public String getDetails() {
    return details;
  }

  public void setDetails(String details) {
    this.details = details;
  }

  public static class ExceptionResponseBuilder {

    private Date timesTamp;
    private String message;
    private String details;

    public ExceptionResponseBuilder timesTamp(Date timesTamp) {
      this.timesTamp = timesTamp;
      return this;
    }

    public ExceptionResponseBuilder message(String message) {
      this.message = message;
      return this;
    }

    public ExceptionResponseBuilder details(String details) {
      this.message = message;
      return this;
    }

    public ExceptionResponse builder() {
      ExceptionResponse exceptionResponse = new ExceptionResponse();
      exceptionResponse.setTimesTamp(this.timesTamp);
      exceptionResponse.setMessage(this.message);
      exceptionResponse.setDetails(this.details);
      return exceptionResponse;
    }
  }
}
