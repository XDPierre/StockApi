package com.api.stock;

import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler {
    @ExceptionHandler(value = {StockNotFoundException.class})
    protected ResponseEntity<Object> handleStockNotFound(RuntimeException ex, WebRequest request) {
        StockNotFoundException snfe = (StockNotFoundException) ex;
        ErrorResponse error = new ErrorResponse(snfe.getStatus().value(), snfe.getMessage());
        return handleExceptionInternal(ex, error, new HttpHeaders(), snfe.getStatus(), request);
    }
}
