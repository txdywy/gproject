package com.google.compression.brotli.dec;

import com.squareup.haha.perflib.HprofParser;
import java.nio.ByteBuffer;

final class C7085h {
    public static final int[] f34668a = new int[363];
    public static final byte[] f34669b = new byte[217];
    public static final int[] f34670c = new int[51];

    static int m32207a(byte[] bArr, int i, ByteBuffer byteBuffer, int i2, int i3, int i4) {
        int i5;
        int i6 = i4 * 3;
        int i7 = f34670c[f34668a[i6]];
        int i8 = f34668a[i6 + 1];
        int i9 = f34670c[f34668a[i6 + 2]];
        int i10 = i;
        while (f34669b[i7] != (byte) 0) {
            i5 = i10 + 1;
            i6 = i7 + 1;
            bArr[i10] = f34669b[i7];
            i7 = i6;
            i10 = i5;
        }
        i7 = i8 >= 12 ? i8 - 11 : 0;
        if (i7 > i3) {
            i7 = i3;
        }
        i6 = i2 + i7;
        i5 = i3 - i7;
        if (i8 <= 9) {
            i7 = i8;
        } else {
            i7 = 0;
        }
        i5 -= i7;
        i7 = i10;
        int i11 = i6;
        i6 = i5;
        while (i6 > 0) {
            i10 = i7 + 1;
            int i12 = i11 + 1;
            bArr[i7] = byteBuffer.get(i11);
            i6--;
            i11 = i12;
            i7 = i10;
        }
        if (i8 == 11 || i8 == 10) {
            i6 = i7 - i5;
            if (i8 == 10) {
                i10 = 1;
            } else {
                i10 = i5;
            }
            while (i10 > 0) {
                i5 = bArr[i6] & HprofParser.ROOT_UNKNOWN;
                if (i5 < 192) {
                    if (i5 >= 97 && i5 <= 122) {
                        bArr[i6] = (byte) (bArr[i6] ^ 32);
                    }
                    i6++;
                    i10--;
                } else if (i5 < 224) {
                    i5 = i6 + 1;
                    bArr[i5] = (byte) (bArr[i5] ^ 32);
                    i6 += 2;
                    i10 -= 2;
                } else {
                    i5 = i6 + 2;
                    bArr[i5] = (byte) (bArr[i5] ^ 5);
                    i6 += 3;
                    i10 -= 3;
                }
            }
        }
        i10 = i7;
        i7 = i9;
        while (f34669b[i7] != (byte) 0) {
            i5 = i10 + 1;
            i6 = i7 + 1;
            bArr[i10] = f34669b[i7];
            i7 = i6;
            i10 = i5;
        }
        return i10 - i;
    }

    static {
        byte[] bArr = f34669b;
        int[] iArr = f34670c;
        int[] iArr2 = f34668a;
        String str = "# #s #, #e #.# the #.com/#Â # of # and # in # to #\"#\">#\n#]# for # a # that #. # with #'# from # by #. The # on # as # is #ing #\n\t#:#ed #(# at #ly #=\"# of the #. This #,# not #er #al #='#ful #ive #less #est #ize #ous #";
        String str2 = "     !! ! ,  *!  &!  \" !  ) *   * -  ! # !  #!*!  +  ,$ !  -  %  .  / #   0  1 .  \"   2  3!*   4%  ! # /   5  6  7  8 0  1 &   $   9 +   :  ;  < '  !=  >  ?! 4  @ 4  2  &   A *# (   B  C& ) %  ) !*# *-% A +! *.  D! %'  & E *6  F  G% ! *A *%  H! D  I!+!  J!+   K +- *4! A  L!*4  M  N +6  O!*% +.! K *G  P +%(  ! G *D +D  Q +# *K!*G!+D!+# +G +A +4!+% +K!+4!*D!+K!*K";
        int length = str.length();
        int i = 1;
        int i2 = 0;
        while (i2 < length) {
            int i3;
            char charAt = str.charAt(i2);
            bArr[i2] = (byte) charAt;
            if (charAt == '#') {
                i3 = i + 1;
                iArr[i] = i2 + 1;
                bArr[i2] = (byte) 0;
            } else {
                i3 = i;
            }
            i2++;
            i = i3;
        }
        for (i3 = 0; i3 < 363; i3++) {
            iArr2[i3] = str2.charAt(i3) - 32;
        }
    }
}
