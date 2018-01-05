package com.google.android.wallet.nfc.p398a;

import com.google.android.wallet.common.util.C6593e;

public final class C6681b {
    public static final String[] f32977a = new String[]{"A0000000041010", "A00000000401", "A0000000042010", "A0000000042203", "A0000000043010", "A0000000044010", "A0000000045010", "A0000000043060", "A0000000050001", "A0000000101030", "A0000000031010", "A0000000032020", "A0000000032010", "A0000000033010", "A0000000034010", "A0000000035010", "A0000000038010", "A0000000039010", "A0000", "A000000025", "A00000006510"};
    public static final String[] f32978b = new String[]{"315041592E5359532E4444463031", "325041592E5359532E4444463031"};

    public static C6682c m30306a(String str) {
        C6683d c6683d = new C6683d((byte) -92);
        c6683d.f32982c = (byte) 4;
        return c6683d.m30311a(C6593e.m29919a(str)).m30310a((byte) 0).m30309a();
    }

    public static C6682c m30307a(byte[] bArr, boolean z) {
        if (bArr == null || bArr.length == 0) {
            bArr = C6593e.m29919a(z ? "830B0000000000000000000000" : "8300");
        }
        C6683d c6683d = new C6683d((byte) -88);
        c6683d.f32980a = Byte.MIN_VALUE;
        return c6683d.m30311a(bArr).m30310a((byte) 0).m30309a();
    }

    public static C6682c m30304a(byte b, byte b2) {
        return C6681b.m30305a(b, b2, (byte) 0);
    }

    public static C6682c m30305a(byte b, byte b2, byte b3) {
        C6683d c6683d = new C6683d((byte) -78);
        c6683d.f32982c = b;
        c6683d.f32983d = (byte) ((b2 << 3) | 4);
        return c6683d.m30310a(b3).m30309a();
    }

    public static boolean m30308a(C6685f c6685f, byte[] bArr) {
        if (((c6685f.f32992d >>> 4) & 15) != bArr[0]) {
            return false;
        }
        if (bArr.length >= 2 && (c6685f.f32992d & 15) != bArr[1]) {
            return false;
        }
        if (bArr.length >= 3 && ((c6685f.f32993e >>> 4) & 15) != bArr[2]) {
            return false;
        }
        if (bArr.length != 4 || (c6685f.f32993e & 15) == bArr[3]) {
            return true;
        }
        return false;
    }
}
