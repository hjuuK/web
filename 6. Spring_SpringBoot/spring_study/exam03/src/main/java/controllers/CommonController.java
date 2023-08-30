package controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice("controllers")
public class CommonController {
    @ExceptionHandler(Exception.class)
    public String errorHandler(RuntimeException e, Model model) {
        e.printStackTrace();
        model.addAttribute("message", e.getMessage());
        return "error/common";
    }
}
