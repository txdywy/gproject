package com.google.protobuf;

public class UninitializedMessageException extends RuntimeException {
    public UninitializedMessageException() {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final InvalidProtocolBufferException m32674a() {
        return new InvalidProtocolBufferException(getMessage());
    }
}
