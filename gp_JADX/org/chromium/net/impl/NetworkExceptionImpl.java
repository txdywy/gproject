package org.chromium.net.impl;

import org.chromium.net.NetworkException;

public class NetworkExceptionImpl extends NetworkException {
    public final int f40680a;
    public final int f40681b;

    public NetworkExceptionImpl(String str, int i, int i2) {
        super(str);
        this.f40680a = i;
        this.f40681b = i2;
    }

    public boolean mo6589a() {
        switch (this.f40680a) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 8:
                return true;
            default:
                return false;
        }
    }

    public String getMessage() {
        StringBuilder stringBuilder = new StringBuilder(super.getMessage());
        stringBuilder.append(", ErrorCode=").append(this.f40680a);
        if (this.f40681b != 0) {
            stringBuilder.append(", InternalErrorCode=").append(this.f40681b);
        }
        stringBuilder.append(", Retryable=").append(mo6589a());
        return stringBuilder.toString();
    }
}
