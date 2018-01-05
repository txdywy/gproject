package org.chromium.net.impl;

import org.chromium.net.QuicException;

public class QuicExceptionImpl extends QuicException {
    public final int f40747a;
    public final NetworkExceptionImpl f40748b;

    public QuicExceptionImpl(String str, int i, int i2) {
        super(str);
        this.f40748b = new NetworkExceptionImpl(str, 10, i);
        this.f40747a = i2;
    }

    public String getMessage() {
        StringBuilder stringBuilder = new StringBuilder(this.f40748b.getMessage());
        stringBuilder.append(", QuicDetailedErrorCode=").append(this.f40747a);
        return stringBuilder.toString();
    }
}
