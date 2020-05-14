package com.cubas.genericcontroller.models;

import com.cubas.genericcontroller.enuns.ErrorsEnum;
import org.springframework.http.HttpStatus;


public class Response<T> {

    private HttpStatus status;

    private String message;

    private ErrorsEnum error;

    private T content;

    public HttpStatus getStatus() {
        return status;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ErrorsEnum getError() {
        return error;
    }

    public void setError(ErrorsEnum error) {
        this.error = error;
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Response [status=" + status + ", message=" + message + ", error=" + error + ", content=" + content
                + "]";
    }
}
