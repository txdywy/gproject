package com.google.android.wallet.nfc.exceptions;

public class TagReadTimeoutException extends Exception {
    public TagReadTimeoutException(Exception exception) {
        super("Timeout when trying to read credit card information from NFC tag.", exception);
    }
}
