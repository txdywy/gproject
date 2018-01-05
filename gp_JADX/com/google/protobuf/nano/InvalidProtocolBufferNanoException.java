package com.google.protobuf.nano;

import java.io.IOException;

public class InvalidProtocolBufferNanoException extends IOException {
    public InvalidProtocolBufferNanoException(String str) {
        super(str);
    }

    static InvalidProtocolBufferNanoException m33542a() {
        return new InvalidProtocolBufferNanoException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    }

    static InvalidProtocolBufferNanoException m33543b() {
        return new InvalidProtocolBufferNanoException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static InvalidProtocolBufferNanoException m33544c() {
        return new InvalidProtocolBufferNanoException("CodedInputStream encountered a malformed varint.");
    }

    static InvalidProtocolBufferNanoException m33545d() {
        return new InvalidProtocolBufferNanoException("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }
}
