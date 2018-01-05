package com.google.protobuf;

public enum ek {
    DOUBLE(ep.DOUBLE, 1),
    FLOAT(ep.FLOAT, 5),
    INT64(ep.LONG, 0),
    UINT64(ep.LONG, 0),
    INT32(ep.INT, 0),
    FIXED64(ep.LONG, 1),
    FIXED32(ep.INT, 5),
    BOOL(ep.BOOLEAN, 0),
    STRING,
    GROUP,
    MESSAGE,
    BYTES,
    UINT32(ep.INT, 0),
    ENUM(ep.ENUM, 0),
    SFIXED32(ep.INT, 5),
    SFIXED64(ep.LONG, 1),
    SINT32(ep.INT, 0),
    SINT64(ep.LONG, 0);
    
    public final ep f35411s;
    public final int f35412t;

    private ek(ep epVar, int i) {
        this.f35411s = epVar;
        this.f35412t = i;
    }
}
