package br.com.menu.handle.exception;

import br.com.menu.handle.exception.dto.ExceptionResponse;
import br.com.menu.handle.exception.exception.BadRequestException;
import br.com.menu.handle.exception.exception.InternalServerErrorException;
import br.com.menu.handle.exception.exception.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.Date;

@ControllerAdvice
@RestController
public class CustomizedExceptionHandler extends ResponseEntityExceptionHandler {

  @ExceptionHandler(BadRequestException.class)
  public final ResponseEntity<ExceptionResponse> handleBadRequestException(Exception ex, WebRequest request){
    ExceptionResponse exceptionResponse = new ExceptionResponse.ExceptionResponseBuilder()
            .timesTamp(new Date())
            .path(request.getContextPath())
            .message(ex.getMessage())
            .error(ex.getCause().getMessage())
            .status(400)
            .builder();
    return new ResponseEntity<>(exceptionResponse, HttpStatus.BAD_REQUEST);
  }

  @ExceptionHandler(InternalServerErrorException.class)
  public final ResponseEntity<ExceptionResponse> handleInternalServerErrorException(Exception ex, WebRequest request){
    ExceptionResponse exceptionResponse = new ExceptionResponse.ExceptionResponseBuilder()
            .timesTamp(new Date())
            .message(request.getDescription(false))
            .path(request.getContextPath())
            .error(ex.getCause().getMessage())
            .status(500)
            .builder();
    return new ResponseEntity<>(exceptionResponse, HttpStatus.INTERNAL_SERVER_ERROR);
  }

  @ExceptionHandler(NotFoundException.class)
  public final ResponseEntity<ExceptionResponse> handleNotFoundException(Exception ex, WebRequest request){
    ExceptionResponse exceptionResponse = new ExceptionResponse.ExceptionResponseBuilder()
            .timesTamp(new Date())
            .message(request.getDescription(false))
            .path(request.getContextPath())
            .error(ex.getCause().getMessage())
            .status(404)
            .builder();
    return new ResponseEntity<>(exceptionResponse, HttpStatus.NOT_FOUND);
  }

}
