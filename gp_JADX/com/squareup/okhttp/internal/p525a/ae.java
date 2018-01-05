package com.squareup.okhttp.internal.p525a;

final class ae {
    public static final String[] f39405a = new String[]{"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
    public static final String[] f39406b = new String[64];
    public static final String[] f39407c = new String[256];

    ae() {
    }

    static String m36708a(boolean z, int i, int i2, byte b, byte b2) {
        Object obj;
        String str;
        String str2;
        if (b < f39405a.length) {
            obj = f39405a[b];
        } else {
            String format = String.format("0x%02x", new Object[]{Byte.valueOf(b)});
        }
        if (b2 != (byte) 0) {
            switch (b) {
                case (byte) 2:
                case (byte) 3:
                case (byte) 7:
                case (byte) 8:
                    str = f39407c[b2];
                    break;
                case (byte) 4:
                case (byte) 6:
                    if (b2 != (byte) 1) {
                        str = f39407c[b2];
                        break;
                    }
                    str = "ACK";
                    break;
                default:
                    str = b2 < f39406b.length ? f39406b[b2] : f39407c[b2];
                    if (b != (byte) 5 || (b2 & 4) == 0) {
                        if (b == (byte) 0 && (b2 & 32) != 0) {
                            str = str.replace("PRIORITY", "COMPRESSED");
                            break;
                        }
                    }
                    str = str.replace("HEADERS", "PUSH_PROMISE");
                    break;
                    break;
            }
        }
        str = "";
        String str3 = "%s 0x%08x %5d %-13s %s";
        Object[] objArr = new Object[5];
        if (z) {
            str2 = "<<";
        } else {
            str2 = ">>";
        }
        objArr[0] = str2;
        objArr[1] = Integer.valueOf(i);
        objArr[2] = Integer.valueOf(i2);
        objArr[3] = obj;
        objArr[4] = str;
        return String.format(str3, objArr);
    }

    static {
        int i;
        int i2 = 0;
        for (i = 0; i < f39407c.length; i++) {
            f39407c[i] = String.format("%8s", new Object[]{Integer.toBinaryString(i)}).replace(' ', '0');
        }
        f39406b[0] = "";
        f39406b[1] = "END_STREAM";
        int[] iArr = new int[]{1};
        f39406b[8] = "PADDED";
        for (i = 0; i <= 0; i++) {
            int i3 = iArr[i];
            f39406b[i3 | 8] = f39406b[i3] + "|PADDED";
        }
        f39406b[4] = "END_HEADERS";
        f39406b[32] = "PRIORITY";
        f39406b[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = new int[]{4, 32, 36};
        for (i3 = 0; i3 < 3; i3++) {
            int i4 = iArr2[i3];
            for (i = 0; i <= 0; i++) {
                int i5 = iArr[i];
                f39406b[i5 | i4] = f39406b[i5] + '|' + f39406b[i4];
                f39406b[(i5 | i4) | 8] = f39406b[i5] + '|' + f39406b[i4] + "|PADDED";
            }
        }
        while (i2 < f39406b.length) {
            if (f39406b[i2] == null) {
                f39406b[i2] = f39407c[i2];
            }
            i2++;
        }
    }
}
