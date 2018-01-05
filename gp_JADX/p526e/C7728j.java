package p526e;

import com.squareup.haha.perflib.HprofParser;
import java.io.Serializable;
import java.util.Arrays;

public class C7728j implements Serializable, Comparable {
    public static final char[] f40190a = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final C7728j f40191b = C7728j.m37413a(new byte[0]);
    public final byte[] f40192c;
    public transient int f40193d;
    public transient String f40194e;

    C7728j(byte[] bArr) {
        this.f40192c = bArr;
    }

    public static C7728j m37413a(byte... bArr) {
        if (bArr != null) {
            return new C7728j((byte[]) bArr.clone());
        }
        throw new IllegalArgumentException("data == null");
    }

    public static C7728j m37412a(String str) {
        if (str == null) {
            throw new IllegalArgumentException("s == null");
        }
        C7728j c7728j = new C7728j(str.getBytes(ad.f40180a));
        c7728j.f40194e = str;
        return c7728j;
    }

    public String mo6515a() {
        String str = this.f40194e;
        if (str != null) {
            return str;
        }
        str = new String(this.f40192c, ad.f40180a);
        this.f40194e = str;
        return str;
    }

    public String mo6519b() {
        return C7723e.m37335a(this.f40192c);
    }

    public String mo6520c() {
        int i = 0;
        char[] cArr = new char[(this.f40192c.length * 2)];
        byte[] bArr = this.f40192c;
        int length = bArr.length;
        int i2 = 0;
        while (i < length) {
            byte b = bArr[i];
            int i3 = i2 + 1;
            cArr[i2] = f40190a[(b >> 4) & 15];
            i2 = i3 + 1;
            cArr[i3] = f40190a[b & 15];
            i++;
        }
        return new String(cArr);
    }

    public C7728j mo6521d() {
        int i = 0;
        while (i < this.f40192c.length) {
            byte b = this.f40192c[i];
            if (b < (byte) 65 || b > (byte) 90) {
                i++;
            } else {
                byte[] bArr = (byte[]) this.f40192c.clone();
                int i2 = i + 1;
                bArr[i] = (byte) (b + 32);
                for (i = i2; i < bArr.length; i++) {
                    byte b2 = bArr[i];
                    if (b2 >= (byte) 65 && b2 <= (byte) 90) {
                        bArr[i] = (byte) (b2 + 32);
                    }
                }
                return new C7728j(bArr);
            }
        }
        return this;
    }

    public C7728j mo6514a(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException("beginIndex < 0");
        } else if (i2 > this.f40192c.length) {
            throw new IllegalArgumentException("endIndex > length(" + this.f40192c.length + ")");
        } else {
            int i3 = i2 - i;
            if (i3 < 0) {
                throw new IllegalArgumentException("endIndex < beginIndex");
            } else if (i == 0 && i2 == this.f40192c.length) {
                return this;
            } else {
                Object obj = new byte[i3];
                System.arraycopy(this.f40192c, i, obj, 0, i3);
                this(obj);
                return this;
            }
        }
    }

    public byte mo6513a(int i) {
        return this.f40192c[i];
    }

    public int mo6522e() {
        return this.f40192c.length;
    }

    public byte[] mo6524f() {
        return (byte[]) this.f40192c.clone();
    }

    public void mo6516a(C7726f c7726f) {
        c7726f.mo6487b(this.f40192c, 0, this.f40192c.length);
    }

    public boolean mo6517a(int i, C7728j c7728j, int i2, int i3) {
        return c7728j.mo6518a(0, this.f40192c, 0, i3);
    }

    public boolean mo6518a(int i, byte[] bArr, int i2, int i3) {
        return i >= 0 && i <= this.f40192c.length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && ad.m37331a(this.f40192c, i, bArr, i2, i3);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof C7728j) && ((C7728j) obj).mo6522e() == this.f40192c.length && ((C7728j) obj).mo6518a(0, this.f40192c, 0, this.f40192c.length);
    }

    public int hashCode() {
        int i = this.f40193d;
        if (i != 0) {
            return i;
        }
        i = Arrays.hashCode(this.f40192c);
        this.f40193d = i;
        return i;
    }

    public String toString() {
        if (this.f40192c.length == 0) {
            return "[size=0]";
        }
        String a = mo6515a();
        int length = a.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length) {
            if (i != 64) {
                int codePointAt = a.codePointAt(i2);
                if ((Character.isISOControl(codePointAt) && codePointAt != 10 && codePointAt != 13) || codePointAt == 65533) {
                    i2 = -1;
                    break;
                }
                i++;
                i2 += Character.charCount(codePointAt);
            } else {
                break;
            }
        }
        i2 = a.length();
        if (i2 != -1) {
            String replace = a.substring(0, i2).replace("\\", "\\\\").replace("\n", "\\n").replace("\r", "\\r");
            if (i2 < a.length()) {
                return "[size=" + this.f40192c.length + " text=" + replace + "…]";
            }
            return "[text=" + replace + "]";
        } else if (this.f40192c.length <= 64) {
            return "[hex=" + mo6520c() + "]";
        } else {
            return "[size=" + this.f40192c.length + " hex=" + mo6514a(0, 64).mo6520c() + "…]";
        }
    }

    public /* synthetic */ int compareTo(Object obj) {
        C7728j c7728j = (C7728j) obj;
        int e = mo6522e();
        int e2 = c7728j.mo6522e();
        int min = Math.min(e, e2);
        int i = 0;
        while (i < min) {
            int a = mo6513a(i) & HprofParser.ROOT_UNKNOWN;
            int a2 = c7728j.mo6513a(i) & HprofParser.ROOT_UNKNOWN;
            if (a == a2) {
                i++;
            } else if (a < a2) {
                return -1;
            } else {
                return 1;
            }
        }
        if (e == e2) {
            return 0;
        }
        if (e >= e2) {
            return 1;
        }
        return -1;
    }
}
