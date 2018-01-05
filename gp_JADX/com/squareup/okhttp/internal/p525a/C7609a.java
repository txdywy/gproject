package com.squareup.okhttp.internal.p525a;

public enum C7609a {
    NO_ERROR(0, -1, 0),
    PROTOCOL_ERROR(1, 1, 1),
    INVALID_STREAM(1, 2, -1),
    UNSUPPORTED_VERSION(1, 4, -1),
    STREAM_IN_USE(1, 8, -1),
    STREAM_ALREADY_CLOSED(1, 9, -1),
    INTERNAL_ERROR(2, 6, 2),
    FLOW_CONTROL_ERROR(3, 7, -1),
    STREAM_CLOSED(5, -1, -1),
    FRAME_TOO_LARGE(6, 11, -1),
    REFUSED_STREAM(7, 3, -1),
    CANCEL(8, 5, -1),
    COMPRESSION_ERROR(9, -1, -1),
    CONNECT_ERROR(10, -1, -1),
    ENHANCE_YOUR_CALM(11, -1, -1),
    INADEQUATE_SECURITY(12, -1, -1),
    HTTP_1_1_REQUIRED(13, -1, -1),
    INVALID_CREDENTIALS(-1, 10, -1);
    
    public final int f39385s;
    public final int f39386t;
    public final int f39387u;

    private C7609a(int i, int i2, int i3) {
        this.f39385s = i;
        this.f39386t = i2;
        this.f39387u = i3;
    }

    public static C7609a m36679a(int i) {
        for (C7609a c7609a : C7609a.values()) {
            if (c7609a.f39386t == i) {
                return c7609a;
            }
        }
        return null;
    }

    public static C7609a m36680b(int i) {
        for (C7609a c7609a : C7609a.values()) {
            if (c7609a.f39385s == i) {
                return c7609a;
            }
        }
        return null;
    }

    public static C7609a m36681c(int i) {
        for (C7609a c7609a : C7609a.values()) {
            if (c7609a.f39387u == i) {
                return c7609a;
            }
        }
        return null;
    }
}
