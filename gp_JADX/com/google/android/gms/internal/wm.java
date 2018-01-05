package com.google.android.gms.internal;

public enum wm {
    DOUBLE(wr.DOUBLE),
    FLOAT(wr.FLOAT),
    INT64(wr.LONG),
    UINT64(wr.LONG),
    INT32(wr.INT),
    FIXED64(wr.LONG),
    FIXED32(wr.INT),
    BOOL(wr.BOOLEAN),
    STRING,
    GROUP,
    MESSAGE,
    BYTES,
    UINT32(wr.INT),
    ENUM(wr.ENUM),
    SFIXED32(wr.INT),
    SFIXED64(wr.LONG),
    SINT32(wr.INT),
    SINT64(wr.LONG);
    
    public final wr f27621s;

    wm(wr wrVar) {
        this.f27621s = wrVar;
    }
}
