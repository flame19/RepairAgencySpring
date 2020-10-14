package ua.repair_agency.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import ua.repair_agency.constants.Attributes;
import ua.repair_agency.constants.CRA_JSPFiles;

import javax.servlet.http.HttpServletRequest;

@Log4j2
@ControllerAdvice
public class ApplicationExceptionController {

    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(value = Exception.class)
    public String handleException(HttpServletRequest req, Exception exc) {
        log.error("Internal server error: " + req.getRequestURI(), exc);
        req.setAttribute(Attributes.MAIN_BLOCK, CRA_JSPFiles.PAGE500);
        return CRA_JSPFiles.CORE_PAGE;
    }
}
