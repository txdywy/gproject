package com.google.android.finsky.download;

import android.net.Uri;

final class C2862y extends C2842e {
    public C2862y(String str, String str2, String str3, Uri uri, long j, long j2, boolean z, boolean z2) {
        super(str, str2, str3, null, 2, uri, j, j2, z, z2, a);
    }

    public final String mo3168r() {
        String str = "obb-for-";
        String valueOf = String.valueOf(this.f15263e);
        return valueOf.length() != 0 ? str.concat(valueOf) : new String(str);
    }
}
