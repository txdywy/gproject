package com.squareup.okhttp;

import java.io.IOException;

public enum af {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2");
    
    public final String f31816e;

    private af(String str) {
        this.f31816e = str;
    }

    public static af m29025a(String str) {
        if (str.equals(HTTP_1_0.f31816e)) {
            return HTTP_1_0;
        }
        if (str.equals(HTTP_1_1.f31816e)) {
            return HTTP_1_1;
        }
        if (str.equals(HTTP_2.f31816e)) {
            return HTTP_2;
        }
        if (str.equals(SPDY_3.f31816e)) {
            return SPDY_3;
        }
        throw new IOException("Unexpected protocol: " + str);
    }

    public final String toString() {
        return this.f31816e;
    }
}
