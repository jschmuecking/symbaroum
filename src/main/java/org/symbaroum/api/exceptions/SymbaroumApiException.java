package org.symbaroum.api.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class SymbaroumApiException extends RuntimeException {

    private SymbaroumApiExceptionType exceptionType;

}
