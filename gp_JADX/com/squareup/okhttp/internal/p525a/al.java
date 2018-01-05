package com.squareup.okhttp.internal.p525a;

import java.util.zip.Inflater;

final class al extends Inflater {
    al() {
    }

    public final int inflate(byte[] bArr, int i, int i2) {
        int inflate = super.inflate(bArr, i, i2);
        if (inflate != 0 || !needsDictionary()) {
            return inflate;
        }
        setDictionary(aq.f39438a);
        return super.inflate(bArr, i, i2);
    }
}
