package com.google.android.gms.internal;

public final class zzfxz extends RuntimeException {
    public zzfxz() {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final zzfxb m26058a() {
        return new zzfxb(getMessage());
    }
}
