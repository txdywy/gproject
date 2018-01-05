package com.google.android.flib.log;

public class WhatATerribleException extends RuntimeException {
    public WhatATerribleException(Throwable th) {
        super(th);
    }

    public WhatATerribleException(String str, Throwable th) {
        super(str, th);
    }

    public WhatATerribleException(String str) {
        super(str);
    }
}
