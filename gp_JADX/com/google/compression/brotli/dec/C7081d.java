package com.google.compression.brotli.dec;

import android.support.v7.widget.eq;
import com.squareup.haha.perflib.HprofParser;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;
import java.io.InputStream;

final class C7081d {
    public static final int[] f34601a = new int[]{1, 2, 3, 4, 0, 5, 17, 6, 16, 7, 8, 9, 10, 11, 12, 13, 14, 15};
    public static final int[] f34602b = new int[]{3, 2, 1, 0, 3, 3, 3, 3, 3, 3, 2, 2, 2, 2, 2, 2};
    public static final int[] f34603c = new int[]{0, 0, 0, 0, -1, 1, -2, 2, -3, 3, -1, 1, -2, 2, -3, 3};
    public static final int[] f34604d = new int[]{131072, 131076, 131075, 196610, 131072, 131076, 131075, 262145, 131072, 131076, 131075, 196610, 131072, 131076, 131075, 262149};
    public static final int[] f34605e = new int[]{0, 0, 0, 0, 0, eq.FLAG_APPEARED_IN_PRE_LAYOUT, 9216, 21504, 35840, 44032, 53248, 63488, 74752, 87040, 93696, 100864, 104704, 106752, 108928, 113536, 115968, 118528, 119872, 121280, 122016};
    public static final int[] f34606f = new int[]{0, 0, 0, 0, 10, 10, 11, 11, 10, 10, 10, 10, 10, 9, 9, 8, 7, 7, 8, 7, 7, 6, 6, 5, 5};
    public static final int[] f34607g = new int[]{1, 5, 9, 13, 17, 25, 33, 41, 49, 65, 81, 97, 113, 145, 177, 209, 241, 305, 369, 497, 753, 1265, 2289, 4337, 8433, 16625};
    public static final int[] f34608h = new int[]{2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 6, 6, 7, 8, 9, 10, 11, 12, 13, 24};
    public static final int[] f34609i = new int[]{0, 1, 2, 3, 4, 5, 6, 8, 10, 14, 18, 26, 34, 50, 66, 98, 130, 194, 322, 578, 1090, 2114, 6210, 22594};
    public static final int[] f34610j = new int[]{0, 0, 0, 0, 0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 7, 8, 9, 10, 12, 14, 24};
    public static final int[] f34611k = new int[]{2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 14, 18, 22, 30, 38, 54, 70, 102, 134, 198, 326, 582, 1094, 2118};
    public static final int[] f34612l = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 7, 8, 9, 10, 24};
    public static final int[] f34613m = new int[]{0, 0, 8, 8, 0, 16, 8, 16, 16};
    public static final int[] f34614n = new int[]{0, 8, 0, 8, 16, 0, 16, 8, 16};

    static void m32194a(C7084g c7084g, InputStream inputStream) {
        if (c7084g.f34655n != 0) {
            throw new IllegalStateException("State MUST be uninitialized");
        }
        int i;
        c7084g.f34650i = new int[6480];
        c7084g.ag = inputStream;
        c7084g.f34647f = new byte[4160];
        c7084g.f34654m = 0;
        c7084g.f34648g = new int[1040];
        c7084g.f34657p = 64;
        c7084g.f34658q = MemoryMappedFileBuffer.DEFAULT_PADDING;
        c7084g.f34660s = 0;
        C7078a.m32184d(c7084g);
        C7078a.m32182b(c7084g);
        if (C7078a.m32181b(c7084g, 1) == 0) {
            i = 16;
        } else {
            i = C7078a.m32181b(c7084g, 3);
            if (i != 0) {
                i += 17;
            } else {
                i = C7078a.m32181b(c7084g, 3);
                if (i != 0) {
                    i += 8;
                } else {
                    i = 17;
                }
            }
        }
        if (i == 9) {
            throw new BrotliRuntimeException("Invalid 'windowBits' code");
        }
        c7084g.f34640Y = 1 << i;
        c7084g.f34639X = c7084g.f34640Y - 16;
        c7084g.f34655n = 1;
    }

    static void m32193a(C7084g c7084g) {
        if (c7084g.f34655n == 0) {
            throw new IllegalStateException("State MUST be initialized");
        } else if (c7084g.f34655n != 11) {
            c7084g.f34655n = 11;
            if (c7084g.ag != null) {
                c7084g.ag.close();
                c7084g.ag = null;
            }
        }
    }

    private static int m32199c(C7084g c7084g) {
        C7078a.m32182b(c7084g);
        if (C7078a.m32181b(c7084g, 1) == 0) {
            return 0;
        }
        int b = C7078a.m32181b(c7084g, 3);
        if (b == 0) {
            return 1;
        }
        return (1 << b) + C7078a.m32181b(c7084g, b);
    }

    private static int m32191a(int[] iArr, int i, C7084g c7084g) {
        int c = C7078a.m32183c(c7084g);
        int i2 = i + (c & HprofParser.ROOT_UNKNOWN);
        int i3 = iArr[i2] >> 16;
        int i4 = iArr[i2] & 65535;
        if (i3 <= 8) {
            c7084g.f34657p += i3;
            return i4;
        }
        i4 = (i4 + i2) + ((c & ((1 << i3) - 1)) >>> 8);
        c7084g.f34657p += (iArr[i4] >> 16) + 8;
        return iArr[i4] & 65535;
    }

    private static int m32197b(int[] iArr, int i, C7084g c7084g) {
        C7078a.m32182b(c7084g);
        int a = C7081d.m32191a(iArr, i, c7084g);
        int i2 = f34608h[a];
        C7078a.m32182b(c7084g);
        return f34607g[a] + C7078a.m32181b(c7084g, i2);
    }

    private static void m32192a(int i, int[] iArr, int i2, C7084g c7084g) {
        Object obj;
        C7078a.m32179a(c7084g);
        int[] iArr2 = new int[i];
        C7078a.m32182b(c7084g);
        int b = C7078a.m32181b(c7084g, 2);
        int b2;
        int i3;
        if (b == 1) {
            int[] iArr3 = new int[4];
            b2 = C7078a.m32181b(c7084g, 2) + 1;
            i3 = 0;
            for (b = i - 1; b != 0; b >>= 1) {
                i3++;
            }
            for (b = 0; b < b2; b++) {
                C7078a.m32182b(c7084g);
                iArr3[b] = C7078a.m32181b(c7084g, i3) % i;
                iArr2[iArr3[b]] = 2;
            }
            iArr2[iArr3[0]] = 1;
            switch (b2) {
                case 2:
                    iArr2[iArr3[1]] = 1;
                    break;
                case 4:
                    if (C7078a.m32181b(c7084g, 1) != 1) {
                        iArr2[iArr3[0]] = 2;
                        break;
                    }
                    iArr2[iArr3[2]] = 3;
                    iArr2[iArr3[3]] = 3;
                    break;
            }
            for (i3 = 0; i3 < b2 - 1; i3++) {
                b = i3 + 1;
                while (b < b2) {
                    if (iArr3[i3] == iArr3[b]) {
                        obj = null;
                    } else {
                        b++;
                    }
                }
            }
            obj = 1;
        } else {
            int i4;
            int c;
            int[] iArr4 = new int[18];
            int i5 = b;
            b = 0;
            i3 = 32;
            for (i4 = i5; i4 < 18 && i3 > 0; i4++) {
                b2 = f34601a[i4];
                C7078a.m32182b(c7084g);
                c = C7078a.m32183c(c7084g) & 15;
                c7084g.f34657p += f34604d[c] >> 16;
                c = f34604d[c] & 65535;
                iArr4[b2] = c;
                if (c != 0) {
                    i3 -= 32 >> c;
                    b++;
                }
            }
            if (i3 == 0 || b == 1) {
                b = 1;
            } else {
                obj = null;
            }
            int i6 = 8;
            int i7 = 0;
            i3 = 0;
            i4 = 32768;
            int[] iArr5 = new int[32];
            C7083f.m32206a(iArr5, 0, 5, iArr4, 18);
            c = 0;
            while (c < i && i4 > 0) {
                C7078a.m32179a(c7084g);
                C7078a.m32182b(c7084g);
                b2 = C7078a.m32183c(c7084g) & 31;
                c7084g.f34657p += iArr5[b2] >> 16;
                int i8 = 65535 & iArr5[b2];
                if (i8 < 16) {
                    i7 = 0;
                    b2 = c + 1;
                    iArr2[c] = i8;
                    if (i8 != 0) {
                        i4 -= 32768 >> i8;
                        i6 = i8;
                        c = b2;
                    } else {
                        i5 = i4;
                        i4 = 0;
                        i7 = i3;
                        i3 = i5;
                    }
                } else {
                    int i9 = i8 - 14;
                    b2 = 0;
                    if (i8 == 16) {
                        b2 = i6;
                    }
                    if (i3 != b2) {
                        i7 = 0;
                    } else {
                        b2 = i3;
                    }
                    if (i7 > 0) {
                        i3 = (i7 - 2) << i9;
                    } else {
                        i3 = i7;
                    }
                    C7078a.m32182b(c7084g);
                    i8 = (C7078a.m32181b(c7084g, i9) + 3) + i3;
                    i9 = i8 - i7;
                    if (c + i9 > i) {
                        throw new BrotliRuntimeException("symbol + repeatDelta > numSymbols");
                    }
                    i3 = 0;
                    i7 = c;
                    while (i3 < i9) {
                        c = i7 + 1;
                        iArr2[i7] = b2;
                        i3++;
                        i7 = c;
                    }
                    if (b2 != 0) {
                        i3 = i4 - (i9 << (15 - b2));
                        i4 = i8;
                        i5 = b2;
                        b2 = i7;
                        i7 = i5;
                    } else {
                        i3 = i4;
                        i4 = i8;
                        i5 = b2;
                        b2 = i7;
                        i7 = i5;
                    }
                }
                c = b2;
                i5 = i7;
                i7 = i4;
                i4 = i3;
                i3 = i5;
            }
            if (i4 != 0) {
                throw new BrotliRuntimeException("Unused space");
            }
            i3 = c;
            while (i3 < i) {
                i7 = Math.min(i3 + MemoryMappedFileBuffer.DEFAULT_PADDING, i) - i3;
                System.arraycopy(C7086i.f34672b, 0, iArr2, i3, i7);
                i3 += i7;
            }
        }
        if (obj == null) {
            throw new BrotliRuntimeException("Can't readHuffmanCode");
        }
        C7083f.m32206a(iArr, i2, 8, iArr2, i);
    }

    private static int m32189a(int i, byte[] bArr, C7084g c7084g) {
        C7078a.m32179a(c7084g);
        int c = C7081d.m32199c(c7084g) + 1;
        int i2;
        if (c == 1) {
            i2 = 0;
            while (i2 < i) {
                int min = Math.min(i2 + MemoryMappedFileBuffer.DEFAULT_PADDING, i) - i2;
                System.arraycopy(C7086i.f34671a, 0, bArr, i2, min);
                i2 += min;
            }
            return c;
        }
        C7078a.m32182b(c7084g);
        if (C7078a.m32181b(c7084g, 1) != 0) {
            i2 = C7078a.m32181b(c7084g, 4) + 1;
        } else {
            i2 = 0;
        }
        int[] iArr = new int[1080];
        C7081d.m32192a(c + i2, iArr, 0, c7084g);
        int i3 = 0;
        while (i3 < i) {
            C7078a.m32179a(c7084g);
            C7078a.m32182b(c7084g);
            min = C7081d.m32191a(iArr, 0, c7084g);
            if (min == 0) {
                bArr[i3] = (byte) 0;
                i3++;
            } else if (min <= i2) {
                C7078a.m32182b(c7084g);
                for (min = C7078a.m32181b(c7084g, min) + (1 << min); min != 0; min--) {
                    if (i3 >= i) {
                        throw new BrotliRuntimeException("Corrupted context map");
                    }
                    bArr[i3] = (byte) 0;
                    i3++;
                }
                continue;
            } else {
                bArr[i3] = (byte) (min - i2);
                i3++;
            }
        }
        C7078a.m32182b(c7084g);
        if (C7078a.m32181b(c7084g, 1) == 1) {
            int[] iArr2 = new int[256];
            for (i2 = 0; i2 < 256; i2++) {
                iArr2[i2] = i2;
            }
            for (min = 0; min < i; min++) {
                i2 = bArr[min] & HprofParser.ROOT_UNKNOWN;
                bArr[min] = (byte) iArr2[i2];
                if (i2 != 0) {
                    int i4 = iArr2[i2];
                    while (i2 > 0) {
                        iArr2[i2] = iArr2[i2 - 1];
                        i2--;
                    }
                    iArr2[0] = i4;
                }
            }
        }
        return c;
    }

    private static int m32190a(C7084g c7084g, int i, int i2) {
        int[] iArr = c7084g.f34649h;
        int i3 = (i * 2) + 4;
        C7078a.m32182b(c7084g);
        int a = C7081d.m32191a(c7084g.f34650i, i * 1080, c7084g);
        int b = C7081d.m32197b(c7084g.f34650i, (i + 3) * 1080, c7084g);
        if (a == 1) {
            a = iArr[i3 + 1] + 1;
        } else if (a == 0) {
            a = iArr[i3];
        } else {
            a -= 2;
        }
        if (a >= i2) {
            a -= i2;
        }
        iArr[i3] = iArr[i3 + 1];
        iArr[i3 + 1] = a;
        return b;
    }

    private static void m32200d(C7084g c7084g) {
        c7084g.f34665x = C7081d.m32190a(c7084g, 0, c7084g.f34666y);
        int i = c7084g.f34649h[5];
        c7084g.f34627L = i << 6;
        c7084g.f34623H = c7084g.f34644c[c7084g.f34627L] & HprofParser.ROOT_UNKNOWN;
        c7084g.f34624I = c7084g.f34651j[c7084g.f34623H];
        c7084g.f34629N = c7084g.f34643b[i] << 9;
        c7084g.f34630O = c7084g.f34629N + 256;
    }

    private static void m32201e(C7084g c7084g) {
        int i = 4;
        if (c7084g.f34662u != 0) {
            c7084g.f34656o = 10;
            c7084g.af = c7084g.f34619D;
            c7084g.ae = 0;
            c7084g.f34655n = 12;
            return;
        }
        c7084g.f34651j = new int[0];
        c7084g.f34652k = new int[0];
        c7084g.f34653l = new int[0];
        C7078a.m32179a(c7084g);
        C7078a.m32182b(c7084g);
        c7084g.f34662u = C7078a.m32181b(c7084g, 1);
        c7084g.f34661t = 0;
        c7084g.f34663v = 0;
        c7084g.f34664w = 0;
        if (c7084g.f34662u == 0 || C7078a.m32181b(c7084g, 1) == 0) {
            int b = C7078a.m32181b(c7084g, 2) + 4;
            int i2;
            int b2;
            if (b == 7) {
                c7084g.f34664w = 1;
                if (C7078a.m32181b(c7084g, 1) != 0) {
                    throw new BrotliRuntimeException("Corrupted reserved bit");
                }
                b = C7078a.m32181b(c7084g, 2);
                if (b != 0) {
                    i2 = 0;
                    while (i2 < b) {
                        C7078a.m32182b(c7084g);
                        b2 = C7078a.m32181b(c7084g, 8);
                        if (b2 == 0 && i2 + 1 == b && b > 1) {
                            throw new BrotliRuntimeException("Exuberant nibble");
                        }
                        c7084g.f34661t = (b2 << (i2 * 8)) | c7084g.f34661t;
                        i2++;
                    }
                }
            } else {
                i2 = 0;
                while (i2 < b) {
                    C7078a.m32182b(c7084g);
                    b2 = C7078a.m32181b(c7084g, 4);
                    if (b2 == 0 && i2 + 1 == b && b > 4) {
                        throw new BrotliRuntimeException("Exuberant nibble");
                    }
                    c7084g.f34661t = (b2 << (i2 * 4)) | c7084g.f34661t;
                    i2++;
                }
            }
            c7084g.f34661t++;
            if (c7084g.f34662u == 0) {
                c7084g.f34663v = C7078a.m32181b(c7084g, 1);
            }
        }
        if (c7084g.f34661t != 0 || c7084g.f34664w != 0) {
            if (c7084g.f34663v == 0 && c7084g.f34664w == 0) {
                c7084g.f34655n = 2;
            } else {
                C7078a.m32186f(c7084g);
                if (c7084g.f34664w == 0) {
                    i = 5;
                }
                c7084g.f34655n = i;
            }
            if (c7084g.f34664w == 0) {
                c7084g.aa += c7084g.f34661t;
                if (c7084g.aa > MemoryMappedFileBuffer.DEFAULT_SIZE) {
                    c7084g.aa = MemoryMappedFileBuffer.DEFAULT_SIZE;
                }
                if (c7084g.f34641Z < c7084g.f34640Y) {
                    i = c7084g.f34640Y;
                    if (i > c7084g.aa) {
                        while ((i >> 1) > c7084g.aa) {
                            i >>= 1;
                        }
                        if (c7084g.f34662u == 0 && i < 16384 && c7084g.f34640Y >= 16384) {
                            i = 16384;
                        }
                    }
                    if (i > c7084g.f34641Z) {
                        Object obj = new byte[(i + 37)];
                        if (c7084g.f34642a.length != 0) {
                            System.arraycopy(c7084g.f34642a, 0, obj, 0, c7084g.f34641Z);
                        }
                        c7084g.f34642a = obj;
                        c7084g.f34641Z = i;
                    }
                }
            }
        }
    }

    private static int m32196b(C7084g c7084g, int i, int i2) {
        if (i2 <= 1) {
            return 268435456;
        }
        C7081d.m32192a(i2 + 2, c7084g.f34650i, i * 1080, c7084g);
        C7081d.m32192a(26, c7084g.f34650i, (i + 3) * 1080, c7084g);
        return C7081d.m32197b(c7084g.f34650i, (i + 3) * 1080, c7084g);
    }

    private static void m32202f(C7084g c7084g) {
        int min;
        c7084g.f34666y = C7081d.m32199c(c7084g) + 1;
        c7084g.f34665x = C7081d.m32196b(c7084g, 0, c7084g.f34666y);
        c7084g.f34616A = C7081d.m32199c(c7084g) + 1;
        c7084g.f34667z = C7081d.m32196b(c7084g, 1, c7084g.f34616A);
        c7084g.f34618C = C7081d.m32199c(c7084g) + 1;
        c7084g.f34617B = C7081d.m32196b(c7084g, 2, c7084g.f34618C);
        C7078a.m32179a(c7084g);
        C7078a.m32182b(c7084g);
        c7084g.f34635T = C7078a.m32181b(c7084g, 2);
        c7084g.f34633R = (C7078a.m32181b(c7084g, 4) << c7084g.f34635T) + 16;
        c7084g.f34634S = (1 << c7084g.f34635T) - 1;
        int i = (48 << c7084g.f34635T) + c7084g.f34633R;
        c7084g.f34643b = new byte[c7084g.f34666y];
        int i2 = 0;
        while (i2 < c7084g.f34666y) {
            min = Math.min(i2 + 96, c7084g.f34666y);
            while (i2 < min) {
                C7078a.m32182b(c7084g);
                c7084g.f34643b[i2] = (byte) C7078a.m32181b(c7084g, 2);
                i2++;
            }
            C7078a.m32179a(c7084g);
        }
        c7084g.f34644c = new byte[(c7084g.f34666y << 6)];
        min = C7081d.m32189a(c7084g.f34666y << 6, c7084g.f34644c, c7084g);
        c7084g.f34622G = 1;
        for (i2 = 0; i2 < (c7084g.f34666y << 6); i2++) {
            if (c7084g.f34644c[i2] != (i2 >> 6)) {
                c7084g.f34622G = 0;
                break;
            }
        }
        c7084g.f34645d = new byte[(c7084g.f34618C << 2)];
        i2 = C7081d.m32189a(c7084g.f34618C << 2, c7084g.f34645d, c7084g);
        c7084g.f34651j = C7081d.m32195a(256, min, c7084g);
        c7084g.f34652k = C7081d.m32195a(704, c7084g.f34616A, c7084g);
        c7084g.f34653l = C7081d.m32195a(i, i2, c7084g);
        c7084g.f34627L = 0;
        c7084g.f34628M = 0;
        c7084g.f34629N = c7084g.f34643b[0] << 9;
        c7084g.f34630O = c7084g.f34629N + 256;
        c7084g.f34623H = 0;
        c7084g.f34624I = c7084g.f34651j[0];
        c7084g.f34631P = c7084g.f34652k[0];
        c7084g.f34649h[4] = 1;
        c7084g.f34649h[5] = 0;
        c7084g.f34649h[6] = 1;
        c7084g.f34649h[7] = 0;
        c7084g.f34649h[8] = 1;
        c7084g.f34649h[9] = 0;
    }

    private static void m32203g(C7084g c7084g) {
        byte[] bArr = c7084g.f34642a;
        if (c7084g.f34661t <= 0) {
            C7078a.m32185e(c7084g);
            c7084g.f34655n = 1;
            return;
        }
        int min = Math.min(c7084g.f34641Z - c7084g.f34619D, c7084g.f34661t);
        int i = c7084g.f34619D;
        if ((c7084g.f34657p & 7) != 0) {
            throw new BrotliRuntimeException("Unaligned copyBytes");
        }
        int i2 = i;
        i = min;
        while (c7084g.f34657p != 64 && i != 0) {
            int i3 = i2 + 1;
            bArr[i2] = (byte) C7078a.m32183c(c7084g);
            c7084g.f34657p += 8;
            i--;
            i2 = i3;
        }
        if (i != 0) {
            i3 = Math.min(C7078a.m32187g(c7084g), i >> 2);
            if (i3 > 0) {
                int i4 = i3 << 2;
                System.arraycopy(c7084g.f34647f, c7084g.f34658q << 2, bArr, i2, i4);
                i2 += i4;
                i -= i4;
                c7084g.f34658q = i3 + c7084g.f34658q;
            }
            if (i != 0) {
                if (C7078a.m32187g(c7084g) > 0) {
                    C7078a.m32182b(c7084g);
                    while (i != 0) {
                        i3 = i2 + 1;
                        bArr[i2] = (byte) C7078a.m32183c(c7084g);
                        c7084g.f34657p += 8;
                        i--;
                        i2 = i3;
                    }
                    C7078a.m32180a(c7084g, 0);
                } else {
                    while (i > 0) {
                        i3 = C7086i.m32208a(c7084g.ag, bArr, i2, i);
                        if (i3 == -1) {
                            throw new BrotliRuntimeException("Unexpected end of input");
                        }
                        i2 += i3;
                        i -= i3;
                    }
                }
            }
        }
        c7084g.f34661t -= min;
        c7084g.f34619D += min;
        if (c7084g.f34619D == c7084g.f34641Z) {
            c7084g.f34656o = 5;
            c7084g.af = c7084g.f34641Z;
            c7084g.ae = 0;
            c7084g.f34655n = 12;
            return;
        }
        C7078a.m32185e(c7084g);
        c7084g.f34655n = 1;
    }

    private static int[] m32195a(int i, int i2, C7084g c7084g) {
        int[] iArr = new int[((i2 * 1080) + i2)];
        int i3 = i2;
        for (int i4 = 0; i4 < i2; i4++) {
            iArr[i4] = i3;
            C7081d.m32192a(i, iArr, i3, c7084g);
            i3 += 1080;
        }
        return iArr;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void m32198b(com.google.compression.brotli.dec.C7084g r15) {
        /*
        r13 = 6;
        r12 = 12;
        r6 = 3;
        r7 = 1;
        r8 = 0;
        r0 = r15.f34655n;
        if (r0 != 0) goto L_0x0012;
    L_0x000a:
        r0 = new java.lang.IllegalStateException;
        r1 = "Can't decompress until initialized";
        r0.<init>(r1);
        throw r0;
    L_0x0012:
        r0 = r15.f34655n;
        r1 = 11;
        if (r0 != r1) goto L_0x0023;
    L_0x0018:
        r0 = new java.lang.IllegalStateException;
        r1 = "Can't decompress after close";
        r0.<init>(r1);
        throw r0;
    L_0x0020:
        com.google.compression.brotli.dec.C7081d.m32201e(r15);
    L_0x0023:
        r0 = r15.f34641Z;
        r9 = r0 + -1;
        r0 = r15.f34642a;
    L_0x0029:
        r1 = r15.f34655n;
        r2 = 10;
        if (r1 == r2) goto L_0x0402;
    L_0x002f:
        r1 = r15.f34655n;
        switch(r1) {
            case 1: goto L_0x0051;
            case 2: goto L_0x005d;
            case 3: goto L_0x0062;
            case 4: goto L_0x039a;
            case 5: goto L_0x03b4;
            case 6: goto L_0x00d8;
            case 7: goto L_0x0293;
            case 8: goto L_0x038f;
            case 9: goto L_0x030f;
            case 10: goto L_0x0034;
            case 11: goto L_0x0034;
            case 12: goto L_0x03b9;
            default: goto L_0x0034;
        };
    L_0x0034:
        r0 = new com.google.compression.brotli.dec.BrotliRuntimeException;
        r1 = r15.f34655n;
        r2 = 28;
        r3 = new java.lang.StringBuilder;
        r3.<init>(r2);
        r2 = "Unexpected state ";
        r2 = r3.append(r2);
        r1 = r2.append(r1);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x0051:
        r0 = r15.f34661t;
        if (r0 >= 0) goto L_0x0020;
    L_0x0055:
        r0 = new com.google.compression.brotli.dec.BrotliRuntimeException;
        r1 = "Invalid metablock length";
        r0.<init>(r1);
        throw r0;
    L_0x005d:
        com.google.compression.brotli.dec.C7081d.m32202f(r15);
        r15.f34655n = r6;
    L_0x0062:
        r1 = r15.f34661t;
        if (r1 > 0) goto L_0x0069;
    L_0x0066:
        r15.f34655n = r7;
        goto L_0x0029;
    L_0x0069:
        com.google.compression.brotli.dec.C7078a.m32179a(r15);
        r1 = r15.f34667z;
        if (r1 != 0) goto L_0x0083;
    L_0x0070:
        r1 = r15.f34616A;
        r1 = com.google.compression.brotli.dec.C7081d.m32190a(r15, r7, r1);
        r15.f34667z = r1;
        r1 = r15.f34652k;
        r2 = r15.f34649h;
        r3 = 7;
        r2 = r2[r3];
        r1 = r1[r2];
        r15.f34631P = r1;
    L_0x0083:
        r1 = r15.f34667z;
        r1 = r1 + -1;
        r15.f34667z = r1;
        com.google.compression.brotli.dec.C7078a.m32182b(r15);
        r1 = r15.f34652k;
        r2 = r15.f34631P;
        r2 = com.google.compression.brotli.dec.C7081d.m32191a(r1, r2, r15);
        r1 = r2 >>> 6;
        r15.f34632Q = r8;
        r3 = 2;
        if (r1 < r3) goto L_0x00a0;
    L_0x009b:
        r1 = r1 + -2;
        r3 = -1;
        r15.f34632Q = r3;
    L_0x00a0:
        r3 = f34613m;
        r3 = r3[r1];
        r4 = r2 >>> 3;
        r4 = r4 & 7;
        r3 = r3 + r4;
        com.google.compression.brotli.dec.C7078a.m32182b(r15);
        r4 = f34610j;
        r4 = r4[r3];
        r4 = com.google.compression.brotli.dec.C7078a.m32181b(r15, r4);
        r5 = f34609i;
        r3 = r5[r3];
        r3 = r3 + r4;
        r15.f34626K = r3;
        r3 = f34614n;
        r1 = r3[r1];
        r2 = r2 & 7;
        r1 = r1 + r2;
        com.google.compression.brotli.dec.C7078a.m32182b(r15);
        r2 = f34612l;
        r2 = r2[r1];
        r2 = com.google.compression.brotli.dec.C7078a.m32181b(r15, r2);
        r3 = f34611k;
        r1 = r3[r1];
        r1 = r1 + r2;
        r15.f34637V = r1;
        r15.f34625J = r8;
        r15.f34655n = r13;
    L_0x00d8:
        r1 = r15.f34622G;
        if (r1 == 0) goto L_0x012d;
    L_0x00dc:
        r1 = r15.f34625J;
        r2 = r15.f34626K;
        if (r1 >= r2) goto L_0x011a;
    L_0x00e2:
        com.google.compression.brotli.dec.C7078a.m32179a(r15);
        r1 = r15.f34665x;
        if (r1 != 0) goto L_0x00ec;
    L_0x00e9:
        com.google.compression.brotli.dec.C7081d.m32200d(r15);
    L_0x00ec:
        r1 = r15.f34665x;
        r1 = r1 + -1;
        r15.f34665x = r1;
        com.google.compression.brotli.dec.C7078a.m32182b(r15);
        r1 = r15.f34619D;
        r2 = r15.f34651j;
        r3 = r15.f34624I;
        r2 = com.google.compression.brotli.dec.C7081d.m32191a(r2, r3, r15);
        r2 = (byte) r2;
        r0[r1] = r2;
        r1 = r15.f34625J;
        r1 = r1 + 1;
        r15.f34625J = r1;
        r1 = r15.f34619D;
        r2 = r1 + 1;
        r15.f34619D = r2;
        if (r1 != r9) goto L_0x00dc;
    L_0x0110:
        r15.f34656o = r13;
        r1 = r15.f34641Z;
        r15.af = r1;
        r15.ae = r8;
        r15.f34655n = r12;
    L_0x011a:
        r1 = r15.f34655n;
        if (r1 != r13) goto L_0x0029;
    L_0x011e:
        r1 = r15.f34661t;
        r2 = r15.f34626K;
        r1 = r1 - r2;
        r15.f34661t = r1;
        r1 = r15.f34661t;
        if (r1 > 0) goto L_0x019c;
    L_0x0129:
        r15.f34655n = r6;
        goto L_0x0029;
    L_0x012d:
        r1 = r15.f34619D;
        r1 = r1 + -1;
        r1 = r1 & r9;
        r1 = r0[r1];
        r2 = r1 & 255;
        r1 = r15.f34619D;
        r1 = r1 + -2;
        r1 = r1 & r9;
        r1 = r0[r1];
        r1 = r1 & 255;
    L_0x013f:
        r3 = r15.f34625J;
        r4 = r15.f34626K;
        if (r3 >= r4) goto L_0x011a;
    L_0x0145:
        com.google.compression.brotli.dec.C7078a.m32179a(r15);
        r3 = r15.f34665x;
        if (r3 != 0) goto L_0x014f;
    L_0x014c:
        com.google.compression.brotli.dec.C7081d.m32200d(r15);
    L_0x014f:
        r3 = r15.f34644c;
        r4 = r15.f34627L;
        r5 = com.google.compression.brotli.dec.C7080c.f34600a;
        r10 = r15.f34629N;
        r10 = r10 + r2;
        r5 = r5[r10];
        r10 = com.google.compression.brotli.dec.C7080c.f34600a;
        r11 = r15.f34630O;
        r1 = r1 + r11;
        r1 = r10[r1];
        r1 = r1 | r5;
        r1 = r1 + r4;
        r1 = r3[r1];
        r1 = r1 & 255;
        r3 = r15.f34665x;
        r3 = r3 + -1;
        r15.f34665x = r3;
        com.google.compression.brotli.dec.C7078a.m32182b(r15);
        r3 = r15.f34651j;
        r4 = r15.f34651j;
        r1 = r4[r1];
        r1 = com.google.compression.brotli.dec.C7081d.m32191a(r3, r1, r15);
        r3 = r15.f34619D;
        r4 = (byte) r1;
        r0[r3] = r4;
        r3 = r15.f34625J;
        r3 = r3 + 1;
        r15.f34625J = r3;
        r3 = r15.f34619D;
        r4 = r3 + 1;
        r15.f34619D = r4;
        if (r3 != r9) goto L_0x0198;
    L_0x018d:
        r15.f34656o = r13;
        r1 = r15.f34641Z;
        r15.af = r1;
        r15.ae = r8;
        r15.f34655n = r12;
        goto L_0x011a;
    L_0x0198:
        r14 = r2;
        r2 = r1;
        r1 = r14;
        goto L_0x013f;
    L_0x019c:
        r1 = r15.f34632Q;
        if (r1 >= 0) goto L_0x0217;
    L_0x01a0:
        com.google.compression.brotli.dec.C7078a.m32179a(r15);
        r1 = r15.f34617B;
        if (r1 != 0) goto L_0x01ba;
    L_0x01a7:
        r1 = 2;
        r2 = r15.f34618C;
        r1 = com.google.compression.brotli.dec.C7081d.m32190a(r15, r1, r2);
        r15.f34617B = r1;
        r1 = r15.f34649h;
        r2 = 9;
        r1 = r1[r2];
        r1 = r1 << 2;
        r15.f34628M = r1;
    L_0x01ba:
        r1 = r15.f34617B;
        r1 = r1 + -1;
        r15.f34617B = r1;
        com.google.compression.brotli.dec.C7078a.m32182b(r15);
        r2 = r15.f34653l;
        r3 = r15.f34653l;
        r4 = r15.f34645d;
        r5 = r15.f34628M;
        r1 = r15.f34637V;
        r10 = 4;
        if (r1 <= r10) goto L_0x023d;
    L_0x01d0:
        r1 = r6;
    L_0x01d1:
        r1 = r1 + r5;
        r1 = r4[r1];
        r1 = r1 & 255;
        r1 = r3[r1];
        r1 = com.google.compression.brotli.dec.C7081d.m32191a(r2, r1, r15);
        r15.f34632Q = r1;
        r1 = r15.f34632Q;
        r2 = r15.f34633R;
        if (r1 < r2) goto L_0x0217;
    L_0x01e4:
        r1 = r15.f34632Q;
        r2 = r15.f34633R;
        r1 = r1 - r2;
        r15.f34632Q = r1;
        r1 = r15.f34632Q;
        r2 = r15.f34634S;
        r1 = r1 & r2;
        r2 = r15.f34632Q;
        r3 = r15.f34635T;
        r2 = r2 >>> r3;
        r15.f34632Q = r2;
        r2 = r15.f34632Q;
        r2 = r2 >>> 1;
        r2 = r2 + 1;
        r3 = r15.f34632Q;
        r3 = r3 & 1;
        r3 = r3 + 2;
        r3 = r3 << r2;
        r3 = r3 + -4;
        com.google.compression.brotli.dec.C7078a.m32182b(r15);
        r2 = com.google.compression.brotli.dec.C7078a.m32181b(r15, r2);
        r4 = r15.f34633R;
        r1 = r1 + r4;
        r2 = r2 + r3;
        r3 = r15.f34635T;
        r2 = r2 << r3;
        r1 = r1 + r2;
        r15.f34632Q = r1;
    L_0x0217:
        r1 = r15.f34632Q;
        r2 = r15.f34649h;
        r3 = r15.f34621F;
        r4 = 16;
        if (r1 >= r4) goto L_0x0242;
    L_0x0221:
        r4 = f34602b;
        r4 = r4[r1];
        r3 = r3 + r4;
        r3 = r3 & 3;
        r2 = r2[r3];
        r3 = f34603c;
        r1 = r3[r1];
        r1 = r1 + r2;
    L_0x022f:
        r15.f34636U = r1;
        r1 = r15.f34636U;
        if (r1 >= 0) goto L_0x0247;
    L_0x0235:
        r0 = new com.google.compression.brotli.dec.BrotliRuntimeException;
        r1 = "Negative distance";
        r0.<init>(r1);
        throw r0;
    L_0x023d:
        r1 = r15.f34637V;
        r1 = r1 + -2;
        goto L_0x01d1;
    L_0x0242:
        r1 = r1 + -16;
        r1 = r1 + 1;
        goto L_0x022f;
    L_0x0247:
        r1 = r15.f34620E;
        r2 = r15.f34639X;
        if (r1 == r2) goto L_0x0267;
    L_0x024d:
        r1 = r15.f34619D;
        r2 = r15.f34639X;
        if (r1 >= r2) goto L_0x0267;
    L_0x0253:
        r1 = r15.f34619D;
        r15.f34620E = r1;
    L_0x0257:
        r1 = r15.f34619D;
        r15.f34638W = r1;
        r1 = r15.f34636U;
        r2 = r15.f34620E;
        if (r1 <= r2) goto L_0x026c;
    L_0x0261:
        r1 = 9;
        r15.f34655n = r1;
        goto L_0x0029;
    L_0x0267:
        r1 = r15.f34639X;
        r15.f34620E = r1;
        goto L_0x0257;
    L_0x026c:
        r1 = r15.f34632Q;
        if (r1 <= 0) goto L_0x0280;
    L_0x0270:
        r1 = r15.f34649h;
        r2 = r15.f34621F;
        r2 = r2 & 3;
        r3 = r15.f34636U;
        r1[r2] = r3;
        r1 = r15.f34621F;
        r1 = r1 + 1;
        r15.f34621F = r1;
    L_0x0280:
        r1 = r15.f34637V;
        r2 = r15.f34661t;
        if (r1 <= r2) goto L_0x028e;
    L_0x0286:
        r0 = new com.google.compression.brotli.dec.BrotliRuntimeException;
        r1 = "Invalid backward reference";
        r0.<init>(r1);
        throw r0;
    L_0x028e:
        r15.f34625J = r8;
        r1 = 7;
        r15.f34655n = r1;
    L_0x0293:
        r1 = r15.f34619D;
        r2 = r15.f34636U;
        r1 = r1 - r2;
        r2 = r1 & r9;
        r1 = r15.f34619D;
        r3 = r15.f34637V;
        r4 = r15.f34625J;
        r10 = r3 - r4;
        r3 = r2 + r10;
        r4 = r1 + r10;
        if (r3 >= r9) goto L_0x02dd;
    L_0x02a8:
        if (r4 >= r9) goto L_0x02dd;
    L_0x02aa:
        if (r10 < r12) goto L_0x02b0;
    L_0x02ac:
        if (r3 <= r1) goto L_0x02c2;
    L_0x02ae:
        if (r4 <= r2) goto L_0x02c2;
    L_0x02b0:
        r4 = r2;
        r2 = r1;
        r1 = r8;
    L_0x02b3:
        if (r1 >= r10) goto L_0x02c5;
    L_0x02b5:
        r3 = r2 + 1;
        r5 = r4 + 1;
        r4 = r0[r4];
        r0[r2] = r4;
        r1 = r1 + 1;
        r2 = r3;
        r4 = r5;
        goto L_0x02b3;
    L_0x02c2:
        com.google.compression.brotli.dec.C7086i.m32209a(r0, r1, r2, r3);
    L_0x02c5:
        r1 = r15.f34625J;
        r1 = r1 + r10;
        r15.f34625J = r1;
        r1 = r15.f34661t;
        r1 = r1 - r10;
        r15.f34661t = r1;
        r1 = r15.f34619D;
        r1 = r1 + r10;
        r15.f34619D = r1;
    L_0x02d4:
        r1 = r15.f34655n;
        r2 = 7;
        if (r1 != r2) goto L_0x0029;
    L_0x02d9:
        r15.f34655n = r6;
        goto L_0x0029;
    L_0x02dd:
        r1 = r15.f34625J;
        r2 = r15.f34637V;
        if (r1 >= r2) goto L_0x02d4;
    L_0x02e3:
        r1 = r15.f34619D;
        r2 = r15.f34619D;
        r3 = r15.f34636U;
        r2 = r2 - r3;
        r2 = r2 & r9;
        r2 = r0[r2];
        r0[r1] = r2;
        r1 = r15.f34661t;
        r1 = r1 + -1;
        r15.f34661t = r1;
        r1 = r15.f34625J;
        r1 = r1 + 1;
        r15.f34625J = r1;
        r1 = r15.f34619D;
        r2 = r1 + 1;
        r15.f34619D = r2;
        if (r1 != r9) goto L_0x02dd;
    L_0x0303:
        r1 = 7;
        r15.f34656o = r1;
        r1 = r15.f34641Z;
        r15.af = r1;
        r15.ae = r8;
        r15.f34655n = r12;
        goto L_0x02d4;
    L_0x030f:
        r1 = r15.f34637V;
        r2 = 4;
        if (r1 < r2) goto L_0x0383;
    L_0x0314:
        r1 = r15.f34637V;
        r2 = 24;
        if (r1 > r2) goto L_0x0383;
    L_0x031a:
        r1 = f34605e;
        r2 = r15.f34637V;
        r1 = r1[r2];
        r2 = r15.f34636U;
        r3 = r15.f34620E;
        r2 = r2 - r3;
        r2 = r2 + -1;
        r3 = f34606f;
        r4 = r15.f34637V;
        r3 = r3[r4];
        r4 = r7 << r3;
        r4 = r4 + -1;
        r4 = r4 & r2;
        r5 = r2 >>> r3;
        r2 = r15.f34637V;
        r2 = r2 * r4;
        r3 = r1 + r2;
        r1 = 121; // 0x79 float:1.7E-43 double:6.0E-322;
        if (r5 >= r1) goto L_0x037b;
    L_0x033d:
        r1 = r15.f34638W;
        r2 = com.google.compression.brotli.dec.Dictionary.f34595a;
        if (r2 != 0) goto L_0x034f;
    L_0x0343:
        r2 = com.google.compression.brotli.dec.C7082e.f34615a;
        if (r2 != 0) goto L_0x034f;
    L_0x0347:
        r0 = new com.google.compression.brotli.dec.BrotliRuntimeException;
        r1 = "brotli dictionary is not set";
        r0.<init>(r1);
        throw r0;
    L_0x034f:
        r2 = com.google.compression.brotli.dec.Dictionary.f34595a;
        r4 = r15.f34637V;
        r1 = com.google.compression.brotli.dec.C7085h.m32207a(r0, r1, r2, r3, r4, r5);
        r2 = r15.f34638W;
        r2 = r2 + r1;
        r15.f34638W = r2;
        r2 = r15.f34619D;
        r2 = r2 + r1;
        r15.f34619D = r2;
        r2 = r15.f34661t;
        r1 = r2 - r1;
        r15.f34661t = r1;
        r1 = r15.f34638W;
        r2 = r15.f34641Z;
        if (r1 < r2) goto L_0x038b;
    L_0x036d:
        r1 = 8;
        r15.f34656o = r1;
        r1 = r15.f34641Z;
        r15.af = r1;
        r15.ae = r8;
        r15.f34655n = r12;
        goto L_0x0029;
    L_0x037b:
        r0 = new com.google.compression.brotli.dec.BrotliRuntimeException;
        r1 = "Invalid backward reference";
        r0.<init>(r1);
        throw r0;
    L_0x0383:
        r0 = new com.google.compression.brotli.dec.BrotliRuntimeException;
        r1 = "Invalid backward reference";
        r0.<init>(r1);
        throw r0;
    L_0x038b:
        r15.f34655n = r6;
        goto L_0x0029;
    L_0x038f:
        r1 = r15.f34641Z;
        r2 = r15.f34638W;
        com.google.compression.brotli.dec.C7086i.m32209a(r0, r8, r1, r2);
        r15.f34655n = r6;
        goto L_0x0029;
    L_0x039a:
        r1 = r15.f34661t;
        if (r1 <= 0) goto L_0x03b0;
    L_0x039e:
        com.google.compression.brotli.dec.C7078a.m32179a(r15);
        com.google.compression.brotli.dec.C7078a.m32182b(r15);
        r1 = 8;
        com.google.compression.brotli.dec.C7078a.m32181b(r15, r1);
        r1 = r15.f34661t;
        r1 = r1 + -1;
        r15.f34661t = r1;
        goto L_0x039a;
    L_0x03b0:
        r15.f34655n = r7;
        goto L_0x0029;
    L_0x03b4:
        com.google.compression.brotli.dec.C7081d.m32203g(r15);
        goto L_0x0029;
    L_0x03b9:
        r1 = r15.ac;
        r2 = r15.ad;
        r1 = r1 - r2;
        r2 = r15.af;
        r3 = r15.ae;
        r2 = r2 - r3;
        r1 = java.lang.Math.min(r1, r2);
        if (r1 == 0) goto L_0x03e1;
    L_0x03c9:
        r2 = r15.f34642a;
        r3 = r15.ae;
        r4 = r15.f34646e;
        r5 = r15.ab;
        r10 = r15.ad;
        r5 = r5 + r10;
        java.lang.System.arraycopy(r2, r3, r4, r5, r1);
        r2 = r15.ad;
        r2 = r2 + r1;
        r15.ad = r2;
        r2 = r15.ae;
        r1 = r1 + r2;
        r15.ae = r1;
    L_0x03e1:
        r1 = r15.ad;
        r2 = r15.ac;
        if (r1 >= r2) goto L_0x03eb;
    L_0x03e7:
        r1 = r7;
    L_0x03e8:
        if (r1 != 0) goto L_0x03ed;
    L_0x03ea:
        return;
    L_0x03eb:
        r1 = r8;
        goto L_0x03e8;
    L_0x03ed:
        r1 = r15.f34619D;
        r2 = r15.f34639X;
        if (r1 < r2) goto L_0x03f7;
    L_0x03f3:
        r1 = r15.f34639X;
        r15.f34620E = r1;
    L_0x03f7:
        r1 = r15.f34619D;
        r1 = r1 & r9;
        r15.f34619D = r1;
        r1 = r15.f34656o;
        r15.f34655n = r1;
        goto L_0x0029;
    L_0x0402:
        r0 = r15.f34655n;
        r1 = 10;
        if (r0 != r1) goto L_0x03ea;
    L_0x0408:
        r0 = r15.f34661t;
        if (r0 >= 0) goto L_0x0414;
    L_0x040c:
        r0 = new com.google.compression.brotli.dec.BrotliRuntimeException;
        r1 = "Invalid metablock length";
        r0.<init>(r1);
        throw r0;
    L_0x0414:
        com.google.compression.brotli.dec.C7078a.m32186f(r15);
        com.google.compression.brotli.dec.C7078a.m32180a(r15, r7);
        goto L_0x03ea;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.compression.brotli.dec.d.b(com.google.compression.brotli.dec.g):void");
    }
}
