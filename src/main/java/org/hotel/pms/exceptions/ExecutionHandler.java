package org.hotel.pms.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ExecutionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler
    public ProblemDetail handleAddressNotFoundException(AddressNotFoundException addressNotFoundException) {
        return ProblemDetail.forStatusAndDetail(HttpStatus.NOT_FOUND, addressNotFoundException.getMessage());
    }
}
