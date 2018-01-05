package com.google.common.flogger.backend;

import java.math.BigDecimal;

enum C7040h extends C7035c {
    C7040h(String str) {
        super(str, 4, true);
    }

    public final boolean mo5993a(Object obj) {
        return (obj instanceof Double) || (obj instanceof Float) || (obj instanceof BigDecimal);
    }
}
