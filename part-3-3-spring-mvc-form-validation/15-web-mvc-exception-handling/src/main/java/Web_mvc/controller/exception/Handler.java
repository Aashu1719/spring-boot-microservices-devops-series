package Web_mvc.controller.exception;

public class Handler extends RuntimeException
{
    public Handler(String message)
    {
        super(message);
    }
}
