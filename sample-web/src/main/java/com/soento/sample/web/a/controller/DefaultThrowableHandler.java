package com.soento.sample.web.a.controller;

import com.soento.framework.core.exception.ClientException;
import com.soento.framework.core.exception.ServiceException;
import com.soento.framework.core.lang.Resp;
import com.soento.framework.core.support.ThrowableHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.BindException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@ControllerAdvice
public class DefaultThrowableHandler extends ThrowableHandler {

    private Logger logger = LoggerFactory.getLogger(DefaultThrowableHandler.class);

    @ExceptionHandler({Throwable.class})
    @ResponseBody
    public Resp handlerException(HttpServletRequest request, HttpServletResponse response, Throwable cause) {
        Resp resp = null;
        if (cause instanceof BindException) {
            resp = super.handlerBindException(request, response, (BindException) cause);
        } else if (cause instanceof ClientException) {
            resp = super.handlerClientException(request, (ClientException) cause);
        } else if (cause instanceof ServiceException) {
            resp = super.handlerServiceException(request, (ServiceException) cause);
        } else {
            resp = super.handlerOthers(request, cause);
        }
        return resp;
    }

}