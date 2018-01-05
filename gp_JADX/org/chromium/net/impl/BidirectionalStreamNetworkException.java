package org.chromium.net.impl;

public class BidirectionalStreamNetworkException extends NetworkExceptionImpl {
    public BidirectionalStreamNetworkException(String str, int i, int i2) {
        super(str, i, i2);
    }

    public final boolean mo6589a() {
        switch (this.b) {
            case -358:
            case -352:
                return true;
            default:
                return super.mo6589a();
        }
    }
}
