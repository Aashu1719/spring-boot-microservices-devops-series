package Web_mvc.controller.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class AddExceptionHandler
{
  @ExceptionHandler(value = Exception.class)
  public String handleException(Exception e)
  {
    System.out.println(e.getMessage());
    return "ErrorView";
  }
}
