package p526e;

import com.squareup.haha.perflib.HprofParser;
import java.nio.charset.Charset;

final class ad {
    public static final Charset f40180a = Charset.forName("UTF-8");

    public static void m37329a(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException(String.format("size=%s offset=%s byteCount=%s", new Object[]{Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3)}));
        }
    }

    public static short m37328a(short s) {
        int i = 65535 & s;
        return (short) (((i & HprofParser.ROOT_UNKNOWN) << 8) | ((65280 & i) >>> 8));
    }

    public static int m37327a(int i) {
        return ((((-16777216 & i) >>> 24) | ((16711680 & i) >>> 8)) | ((65280 & i) << 8)) | ((i & HprofParser.ROOT_UNKNOWN) << 24);
    }

    public static void m37330a(Throwable th) {
        throw th;
    }

    public static boolean m37331a(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            if (bArr[i4 + i] != bArr2[i4 + i2]) {
                return false;
            }
        }
        return true;
    }
}
