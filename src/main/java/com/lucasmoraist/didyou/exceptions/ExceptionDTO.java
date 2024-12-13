package com.lucasmoraist.didyou.exceptions;

import org.springframework.http.HttpStatus;

public record ExceptionDTO(String msg, HttpStatus status) {
}
