package org.chromium.net;

import java.io.IOException;

public class CronetException extends IOException {
    public CronetException(String str, Throwable th) {
        super(str, th);
    }
}
