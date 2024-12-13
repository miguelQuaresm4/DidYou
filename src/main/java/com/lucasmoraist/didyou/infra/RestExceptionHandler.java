package com.lucasmoraist.didyou.infra;

import com.lucasmoraist.didyou.exceptions.ExceptionDTO;
import com.lucasmoraist.didyou.exceptions.RecursoNaoEncontrado;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class RestExceptionHandler {

    @ExceptionHandler(RecursoNaoEncontrado.class)
    protected ResponseEntity<ExceptionDTO> resourceNotFound(RecursoNaoEncontrado ex) {
        return ResponseEntity.status(404).body(
                new ExceptionDTO(ex.getMessage(), HttpStatus.NOT_FOUND)
        );
    }

    @ExceptionHandler(Exception.class)
    protected ResponseEntity<ExceptionDTO> genericException(Exception ex) {
        return ResponseEntity.status(500).body(
                new ExceptionDTO(ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR)
        );
    }
}
