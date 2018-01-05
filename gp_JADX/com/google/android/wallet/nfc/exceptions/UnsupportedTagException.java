package com.google.android.wallet.nfc.exceptions;

public class UnsupportedTagException extends Exception {
    public UnsupportedTagException() {
        super("Tag technology is not supported.");
    }
}
