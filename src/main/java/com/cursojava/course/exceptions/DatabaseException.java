package com.cursojava.course.exceptions;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.CONFLICT)
public class DatabaseException extends DataIntegrityViolationException {

    public DatabaseException(String message) {
        super(message);
    }

}
