package com.google.compression.brotli.dec;

class BrotliRuntimeException extends RuntimeException {
    BrotliRuntimeException(String str) {
        super(str);
    }

    BrotliRuntimeException(String str, Throwable th) {
        super(str, th);
    }
}
