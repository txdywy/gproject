package com.google.android.gms.internal;

import java.io.IOException;

public class zzfxb extends IOException {
    public zzfxb(String str) {
        super(str);
    }

    static zzfxb m26055a() {
        return new zzfxb("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static zzfxb m26056b() {
        return new zzfxb("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static zzfxb m26057c() {
        return new zzfxb("CodedInputStream encountered a malformed varint.");
    }
}
