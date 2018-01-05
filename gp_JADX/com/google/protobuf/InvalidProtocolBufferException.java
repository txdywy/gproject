package com.google.protobuf;

import java.io.IOException;

public class InvalidProtocolBufferException extends IOException {

    public class InvalidWireTypeException extends InvalidProtocolBufferException {
        public InvalidWireTypeException(String str) {
            super(str);
        }
    }

    public InvalidProtocolBufferException(String str) {
        super(str);
    }

    public InvalidProtocolBufferException(IOException iOException) {
        super(iOException.getMessage(), iOException);
    }

    static InvalidProtocolBufferException m32664a() {
        return new InvalidProtocolBufferException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static InvalidProtocolBufferException m32665b() {
        return new InvalidProtocolBufferException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static InvalidProtocolBufferException m32666c() {
        return new InvalidProtocolBufferException("CodedInputStream encountered a malformed varint.");
    }

    static InvalidProtocolBufferException m32667d() {
        return new InvalidProtocolBufferException("Protocol message contained an invalid tag (zero).");
    }

    static InvalidProtocolBufferException m32668e() {
        return new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
    }

    static InvalidWireTypeException m32669f() {
        return new InvalidWireTypeException("Protocol message tag had invalid wire type.");
    }

    static InvalidProtocolBufferException m32670g() {
        return new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    static InvalidProtocolBufferException m32671h() {
        return new InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    static InvalidProtocolBufferException m32672i() {
        return new InvalidProtocolBufferException("Failed to parse the message.");
    }

    static InvalidProtocolBufferException m32673j() {
        return new InvalidProtocolBufferException("Protocol message had invalid UTF-8.");
    }
}
