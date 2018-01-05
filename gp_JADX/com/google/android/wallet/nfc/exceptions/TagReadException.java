package com.google.android.wallet.nfc.exceptions;

public class TagReadException extends Exception {
    public TagReadException() {
        super("Failed to read credit card information from tag.");
    }
}
