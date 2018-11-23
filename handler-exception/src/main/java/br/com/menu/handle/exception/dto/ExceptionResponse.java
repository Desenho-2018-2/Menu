package br.com.menu.handle.exception.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.io.Serializable;
import java.util.Date;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ExceptionResponse implements Serializable {

  private static final long serialVersionUID = 1L;

  private Date timesTamp;
  private String message;
  private String path;
  private Integer status;
  private String error;

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

  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }

  public static class ExceptionResponseBuilder {

    private Date timesTamp;
    private String message;
    private String path;
    private Integer status;
    private String error;

    public ExceptionResponseBuilder timesTamp(Date timesTamp) {
      this.timesTamp = timesTamp;
      return this;
    }

    public ExceptionResponseBuilder message(String message) {
      this.message = message;
      return this;
    }

    public ExceptionResponseBuilder path(String path) {
      this.path = path;
      return this;
    }

    public ExceptionResponseBuilder status(Integer status) {
      this.status = status;
      return this;
    }

    public ExceptionResponseBuilder error(String error) {
      this.error = error;
      return this;
    }

    public ExceptionResponse builder() {
      ExceptionResponse exceptionResponse = new ExceptionResponse();
      exceptionResponse.setTimesTamp(this.timesTamp);
      exceptionResponse.setMessage(this.message);
      exceptionResponse.setPath(this.path);
      exceptionResponse.setError(this.error);
      exceptionResponse.setStatus(this.status);
      return exceptionResponse;
    }
  }
}
