package controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import ch.qos.logback.core.model.Model;
import javassist.NotFoundException;

@ControllerAdvice
public class CustomErrorController {

@ExceptionHandler(value = { NotFoundException.class })
public String handleNotFoundException(Exception ex, Model model) {
// Handle the exception and return a custom error page or view
return "error/not-found";
}
}
