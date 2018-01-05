package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.C5087l;
import com.google.android.gms.common.api.Status;

public final class bi {
    public static Status m26760a(int i) {
        String str;
        switch (i) {
            case 4000:
                str = "TARGET_NODE_NOT_CONNECTED";
                break;
            case 4001:
                str = "DUPLICATE_LISTENER";
                break;
            case 4002:
                str = "UNKNOWN_LISTENER";
                break;
            case 4003:
                str = "DATA_ITEM_TOO_LARGE";
                break;
            case 4004:
                str = "INVALID_TARGET_NODE";
                break;
            case 4005:
                str = "ASSET_UNAVAILABLE";
                break;
            default:
                str = C5087l.m23645a(i);
                break;
        }
        return new Status(i, str);
    }
}
