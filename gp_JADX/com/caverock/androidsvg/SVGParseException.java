package com.caverock.androidsvg;

public class SVGParseException extends RuntimeException {
    public SVGParseException(String str, Throwable th) {
        super(str, th);
    }
}
