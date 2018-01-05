package com.google.android.gms.common.api;

public class ApiException extends Exception {
    public ApiException(Status status) {
        String str;
        int i = status.f25631g;
        if (status.f25632h != null) {
            str = status.f25632h;
        } else {
            str = "";
        }
        super(new StringBuilder(String.valueOf(str).length() + 13).append(i).append(": ").append(str).toString());
    }
}
