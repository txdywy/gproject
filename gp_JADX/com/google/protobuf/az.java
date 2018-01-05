package com.google.protobuf;

final class az {
    public static final Object f35197a = new Object();
    public static final az f35198b = new az('\u0000');
    public int f35199c;
    public final float f35200d;
    public int[] f35201e;
    public Object[] f35202f;
    public int f35203g;
    public int f35204h;

    public az() {
        this((byte) 0);
    }

    private az(byte b) {
        this.f35200d = 0.5f;
        int numberOfLeadingZeros = 1 << (32 - Integer.numberOfLeadingZeros(7));
        this.f35204h = numberOfLeadingZeros - 1;
        this.f35201e = new int[numberOfLeadingZeros];
        this.f35202f = new Object[numberOfLeadingZeros];
        this.f35199c = m32976c(numberOfLeadingZeros);
    }

    private az(char c) {
        this.f35200d = 0.5f;
        this.f35201e = null;
        this.f35202f = null;
    }

    private static Object m32973a(Object obj) {
        return obj == f35197a ? null : obj;
    }

    private static Object m32975b(Object obj) {
        return obj == null ? f35197a : obj;
    }

    public final Object m32978a(int i) {
        if (this.f35201e == null) {
            return null;
        }
        int i2 = i & this.f35204h;
        int i3 = i2;
        while (this.f35202f[i3] != null) {
            if (i == this.f35201e[i3]) {
                break;
            }
            i3 = m32974b(i3);
            if (i3 == i2) {
                i3 = -1;
                break;
            }
        }
        i3 = -1;
        if (i3 == -1) {
            return null;
        }
        return m32973a(this.f35202f[i3]);
    }

    public final Object m32979a(int i, Object obj) {
        if (this.f35201e == null) {
            throw new IllegalStateException("Trying to modify an immutable map.");
        }
        int i2 = i & this.f35204h;
        int i3 = i2;
        while (this.f35202f[i3] != null) {
            if (this.f35201e[i3] == i) {
                Object obj2 = this.f35202f[i3];
                this.f35202f[i3] = m32975b(obj);
                return m32973a(obj2);
            }
            i3 = m32974b(i3);
            if (i3 == i2) {
                throw new IllegalStateException("Unable to insert");
            }
        }
        this.f35201e[i3] = i;
        this.f35202f[i3] = m32975b(obj);
        this.f35203g++;
        if (this.f35203g > this.f35199c) {
            if (this.f35201e.length == Integer.MAX_VALUE) {
                throw new IllegalStateException("Max capacity reached at size=" + this.f35203g);
            }
            m32977d(this.f35201e.length << 1);
        }
        return null;
    }

    private final int m32974b(int i) {
        return (i + 1) & this.f35204h;
    }

    private final int m32976c(int i) {
        return Math.min(i - 1, (int) (((float) i) * this.f35200d));
    }

    private final void m32977d(int i) {
        int[] iArr = this.f35201e;
        Object[] objArr = this.f35202f;
        this.f35201e = new int[i];
        this.f35202f = new Object[i];
        this.f35199c = m32976c(i);
        this.f35204h = i - 1;
        for (int i2 = 0; i2 < objArr.length; i2++) {
            Object obj = objArr[i2];
            if (obj != null) {
                int i3 = iArr[i2];
                int i4 = this.f35204h & i3;
                while (this.f35202f[i4] != null) {
                    i4 = m32974b(i4);
                }
                this.f35201e[i4] = i3;
                this.f35202f[i4] = obj;
            }
        }
    }

    public final String toString() {
        if ((this.f35203g == 0 ? 1 : null) != null) {
            return "{}";
        }
        StringBuilder stringBuilder = new StringBuilder(this.f35203g * 4);
        stringBuilder.append('{');
        Object obj = 1;
        for (int i = 0; i < this.f35202f.length; i++) {
            Object obj2 = this.f35202f[i];
            if (obj2 != null) {
                if (obj == null) {
                    stringBuilder.append(", ");
                }
                stringBuilder.append(Integer.toString(this.f35201e[i])).append('=').append(obj2 == this ? "(this Map)" : m32973a(obj2));
                obj = null;
            }
        }
        return stringBuilder.append('}').toString();
    }
}
