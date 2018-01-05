package org.chromium.net;

public class NetworkException extends CronetException {
    public NetworkException(String str) {
        super(str, null);
    }
}
