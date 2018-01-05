package com.google.android.finsky.dialogbuilder.p154b;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

public final class C2786a {
    public final List f15078a = new ArrayList();

    private static String m14862a(int i) {
        return "DialogActionContextModel..index." + i;
    }

    public C2786a(Bundle bundle) {
        int i = 0;
        if (bundle != null) {
            int i2 = bundle.getInt("DialogActionContextModel.count", 0);
            if (i2 >= 0) {
                while (i < i2) {
                    Object byteArray = bundle.getByteArray(C2786a.m14862a(i));
                    if (byteArray != null && byteArray.length > 0) {
                        this.f15078a.add(byteArray);
                    }
                    i++;
                }
            }
        }
    }

    public final void m14863a(Bundle bundle) {
        if (this.f15078a.size() > 0) {
            int size = this.f15078a.size();
            bundle.putInt("DialogActionContextModel.count", size);
            for (int i = 0; i < size; i++) {
                bundle.putByteArray(C2786a.m14862a(i), (byte[]) this.f15078a.get(i));
            }
        }
    }

    public final void m14864a(byte[] bArr) {
        if (bArr != null && bArr.length > 0) {
            this.f15078a.add(bArr);
        }
    }

    public final byte[][] m14865a() {
        if (this.f15078a.size() <= 0) {
            return null;
        }
        byte[][] bArr = new byte[this.f15078a.size()][];
        for (int i = 0; i < this.f15078a.size(); i++) {
            bArr[i] = (byte[]) this.f15078a.get(i);
        }
        return bArr;
    }
}
