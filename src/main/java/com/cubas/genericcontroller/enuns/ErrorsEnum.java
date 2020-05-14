package com.cubas.genericcontroller.enuns;

/**
 * @author carlos-silva
 * @version : $<br/>
 * : $
 * @since 5/14/20 9:36 AM
 */
public enum ErrorsEnum {

    USER_NOT_FOUND("USER_NOT_FOUND"),
    USER_LOGIN_INVALID("USER_LOGIN_INVALID"),
    USER_AUTENTICATION_ERROR("USER_AUTENTICATION_ERROR"),
    USER_LOGIN_NOT_GENERATE_TOKEN("USER_AUTENTICATION_ERROR"),
    USER_NOT_FOUND_ERROR("USER_NOT_FOUND_ERROR"),
    USER_BAD_CREDENCIALS_ERROR("USER_BAD_CREDENCIALS_ERROR"),
    USER_UNKNOWN_ERROR("USER_UNKNOWN_ERROR"),
    USER_NOT_INFORMATON_ERROR("USER_NOT_INFORMATON_ERROR"),
    USER_INVALID_TOKEN("USER_INVALID_TOKEN"),
    USER_TOKEN_EXPIRED("USER_TOKEN_EXPIRED"),
    USER_NOT_REGISTRATION_ERROR("USER_NOT_REGISTRATION_ERROR"),
    USER_PASSWORD_REGISTRATION_DIFERENTE_ERROR("USER_PASSWORD_REGISTRATION_DIFERENTE_ERROR"),
    USER_NOT_REGISTRATION_ERRO("USER_NOT_REGISTRATION_ERRO"),
    USER_DATA_VIOLATION_ERROR("USER_DATA_VIOLATION_ERROR"),
    USER_EXIST_ERROR("USER_EXIST_ERROR");

    public String value;

    private ErrorsEnum(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

}