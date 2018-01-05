package com.google.android.gms.internal;

import java.io.IOException;

public final class zzfyy extends IOException {
    public zzfyy(String str) {
        super(str);
    }

    static zzfyy m26059a() {
        return new zzfyy("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    }

    static zzfyy m26060b() {
        return new zzfyy("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static zzfyy m26061c() {
        return new zzfyy("CodedInputStream encountered a malformed varint.");
    }
}
