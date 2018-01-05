package com.google.android.finsky.phenotypedebug;

import android.util.Base64;
import java.util.Arrays;

public final class C3882c extends C3880a {
    public C3882c(String str, byte[] bArr) {
        super(str, bArr);
    }

    public final boolean mo3831a() {
        return (this.c == null || Arrays.equals((byte[]) this.c, (byte[]) this.b)) ? false : true;
    }

    public final String mo3832c() {
        return Base64.encodeToString((byte[]) m18373b(), 2);
    }

    protected final /* synthetic */ Object mo3830a(String str) {
        return Base64.decode(str, 2);
    }
}
