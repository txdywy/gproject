package com.google.android.gms.peerdownloadmanager.comms.rpc.p300b;

import com.google.protobuf.bc;

public enum C5457o implements bc {
    UNKNOWN(0),
    REUSE_CONN(1),
    BLUETOOTH(2),
    WIFI_HOTSPOT(3),
    WIFI_DIRECT(4),
    WIFI_AWARE(5),
    NEARBY(6),
    CURATOR(7),
    UNRECOGNIZED(-1);
    
    public final int f28181j;

    public final int m26325a() {
        if (this != UNRECOGNIZED) {
            return this.f28181j;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static C5457o m26324a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return REUSE_CONN;
            case 2:
                return BLUETOOTH;
            case 3:
                return WIFI_HOTSPOT;
            case 4:
                return WIFI_DIRECT;
            case 5:
                return WIFI_AWARE;
            case 6:
                return NEARBY;
            case 7:
                return CURATOR;
            default:
                return null;
        }
    }

    private C5457o(int i) {
        this.f28181j = i;
    }

    static {
        C5458p c5458p = new C5458p();
    }
}
