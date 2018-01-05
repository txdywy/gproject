package org.keyczar.p572d;

import org.keyczar.exceptions.Base64DecodingException;
import org.keyczar.p570b.C7985a;

public final class C7995a {
    public static final char[] f41006a = new char[]{'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '-', '_'};
    public static final byte[] f41007b = new byte[128];
    public static final char[] f41008c = new char[]{'\t', '\n', '\r', ' ', '\f'};

    public static byte[] m38189a(String str) {
        char[] toCharArray = str.toCharArray();
        int length = toCharArray.length;
        if (toCharArray[length - 1] == '=') {
            length--;
        }
        if (toCharArray[length - 1] == '=') {
            length--;
        }
        int i = 0;
        for (int a : toCharArray) {
            int a2;
            if (C7995a.m38188a(a2)) {
                i++;
            }
        }
        int i2 = length - i;
        length = (i2 / 4) * 3;
        switch (i2 % 4) {
            case 1:
                throw new Base64DecodingException(C7985a.m38177a("Base64Coder.IllegalLength", Integer.valueOf(i2)));
            case 2:
                length++;
                break;
            case 3:
                length += 2;
                break;
        }
        byte[] bArr = new byte[length];
        length = 0;
        int i3 = 0;
        int i4 = 0;
        for (a2 = 0; a2 < i2 + i; a2++) {
            if (!C7995a.m38188a(toCharArray[a2])) {
                i4 <<= 6;
                char c = toCharArray[a2];
                if (c < '\u0000' || c > '' || f41007b[c] == (byte) -1) {
                    throw new Base64DecodingException(C7985a.m38177a("Base64Coder.IllegalCharacter", Integer.valueOf(c)));
                }
                i4 |= f41007b[c];
                i3++;
            }
            if (i3 == 4) {
                i3 = length + 1;
                bArr[length] = (byte) (i4 >> 16);
                int i5 = i3 + 1;
                bArr[i3] = (byte) (i4 >> 8);
                length = i5 + 1;
                bArr[i5] = (byte) i4;
                i3 = 0;
                i4 = 0;
            }
        }
        switch (i3) {
            case 2:
                bArr[length] = (byte) (i4 >> 4);
                break;
            case 3:
                i = length + 1;
                bArr[length] = (byte) (i4 >> 10);
                bArr[i] = (byte) (i4 >> 2);
                break;
        }
        return bArr;
    }

    private static boolean m38188a(int i) {
        return f41007b[i] == (byte) -2;
    }

    static {
        int i = 0;
        for (int i2 = 0; i2 < f41007b.length; i2++) {
            f41007b[i2] = (byte) -1;
        }
        for (char c : f41008c) {
            f41007b[c] = (byte) -2;
        }
        while (i < f41006a.length) {
            f41007b[f41006a[i]] = (byte) i;
            i++;
        }
    }
}
