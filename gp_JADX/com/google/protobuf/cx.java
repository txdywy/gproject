package com.google.protobuf;

import android.support.v7.widget.eq;
import com.squareup.haha.perflib.HprofParser;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;
import java.lang.reflect.Field;

final class cx {
    public az f35291A = az.f35198b;
    public final cy f35292a;
    public final Object[] f35293b;
    public Class f35294c;
    public final int f35295d;
    public final int f35296e;
    public final int f35297f;
    public final int f35298g;
    public final int f35299h;
    public final int f35300i;
    public final int f35301j;
    public final int f35302k;
    public final int[] f35303l;
    public int f35304m;
    public int f35305n;
    public int f35306o = Integer.MAX_VALUE;
    public int f35307p = Integer.MIN_VALUE;
    public int f35308q = 0;
    public int f35309r = 0;
    public int f35310s;
    public int f35311t;
    public int f35312u;
    public int f35313v;
    public int f35314w;
    public Field f35315x;
    public az f35316y = az.f35198b;
    public az f35317z = az.f35198b;

    cx(Class cls, String str, Object[] objArr) {
        int[] iArr = null;
        this.f35294c = cls;
        this.f35292a = new cy(str);
        this.f35293b = objArr;
        this.f35295d = this.f35292a.m33154b();
        this.f35296e = this.f35292a.m33154b();
        if (this.f35296e == 0) {
            this.f35297f = 0;
            this.f35298g = 0;
            this.f35299h = 0;
            this.f35300i = 0;
            this.f35301j = 0;
            this.f35302k = 0;
            this.f35303l = null;
            return;
        }
        this.f35297f = this.f35292a.m33154b();
        this.f35298g = this.f35292a.m33154b();
        this.f35299h = this.f35292a.m33154b();
        this.f35300i = this.f35292a.m33154b();
        this.f35301j = this.f35292a.m33154b();
        this.f35302k = this.f35292a.m33154b();
        int b = this.f35292a.m33154b();
        if (b != 0) {
            iArr = new int[b];
        }
        this.f35303l = iArr;
        this.f35304m = (this.f35297f * 2) + this.f35298g;
    }

    private final int m33143g() {
        cy cyVar = this.f35292a;
        String str = cyVar.f35318a;
        int i = cyVar.f35319b;
        cyVar.f35319b = i + 1;
        char charAt = str.charAt(i);
        if (charAt < '?') {
            return charAt;
        }
        i = charAt & 8191;
        int i2 = 13;
        while (true) {
            String str2 = cyVar.f35318a;
            int i3 = cyVar.f35319b;
            cyVar.f35319b = i3 + 1;
            char charAt2 = str2.charAt(i3);
            if (charAt2 < '?') {
                return (charAt2 << i2) | i;
            }
            i |= (charAt2 & 8191) << i2;
            i2 += 13;
        }
    }

    private final Object m33144h() {
        Object[] objArr = this.f35293b;
        int i = this.f35304m;
        this.f35304m = i + 1;
        return objArr[i];
    }

    final boolean m33147a() {
        Object obj = null;
        if (!this.f35292a.m33153a()) {
            return false;
        }
        Object obj2;
        this.f35310s = m33143g();
        this.f35311t = m33143g();
        this.f35312u = this.f35311t & HprofParser.ROOT_UNKNOWN;
        if (this.f35310s < this.f35306o) {
            this.f35306o = this.f35310s;
        }
        if (this.f35310s > this.f35307p) {
            this.f35307p = this.f35310s;
        }
        if (this.f35312u == ao.MAP.f35168Z) {
            this.f35308q++;
        } else if (this.f35312u >= ao.DOUBLE_LIST.f35168Z && this.f35312u <= ao.GROUP_LIST.f35168Z) {
            this.f35309r++;
        }
        if ((this.f35311t & MemoryMappedFileBuffer.DEFAULT_PADDING) != 0) {
            obj2 = 1;
        } else {
            obj2 = null;
        }
        if (obj2 != null) {
            int[] iArr = this.f35303l;
            int i = this.f35305n;
            this.f35305n = i + 1;
            iArr[i] = this.f35310s;
        }
        if (m33148b()) {
            this.f35313v = m33143g();
            if (this.f35312u == ao.MESSAGE.f35168Z + 51 || this.f35312u == ao.GROUP.f35168Z + 51) {
                m33142a(this.f35310s, (Class) m33144h());
            } else if (this.f35312u == ao.ENUM.f35168Z + 51 && m33145i()) {
                m33141a(this.f35310s, (bd) m33144h());
            }
        } else {
            this.f35315x = m33140a(this.f35294c, (String) m33144h());
            if (m33149c()) {
                this.f35314w = m33143g();
            }
            if (this.f35312u == ao.MESSAGE.f35168Z || this.f35312u == ao.GROUP.f35168Z) {
                m33142a(this.f35310s, this.f35315x.getType());
            } else if (this.f35312u == ao.MESSAGE_LIST.f35168Z || this.f35312u == ao.GROUP_LIST.f35168Z) {
                m33142a(this.f35310s, (Class) m33144h());
            } else if (this.f35312u == ao.ENUM.f35168Z || this.f35312u == ao.ENUM_LIST.f35168Z || this.f35312u == ao.ENUM_LIST_PACKED.f35168Z) {
                if (m33145i()) {
                    m33141a(this.f35310s, (bd) m33144h());
                }
            } else if (this.f35312u == ao.MAP.f35168Z) {
                int i2 = this.f35310s;
                Object h = m33144h();
                if (this.f35291A == az.f35198b) {
                    this.f35291A = new az();
                }
                this.f35291A.m32979a(i2, h);
                if ((this.f35311t & eq.FLAG_MOVED) != 0) {
                    obj = 1;
                }
                if (obj != null) {
                    m33141a(this.f35310s, (bd) m33144h());
                }
            }
        }
        return true;
    }

    private final boolean m33145i() {
        return (this.f35295d & 1) == 1;
    }

    final boolean m33148b() {
        return this.f35312u > ao.MAP.f35168Z;
    }

    final boolean m33149c() {
        return m33145i() && this.f35312u <= ao.GROUP.f35168Z;
    }

    private final void m33146j() {
        int i;
        if (this.f35292a.m33153a()) {
            i = this.f35292a.f35319b;
            throw new IllegalStateException("decoder position = " + i + " is not at end (length = " + this.f35292a.f35318a.length());
        } else if (this.f35293b != null && this.f35304m != this.f35293b.length) {
            i = this.f35304m;
            throw new IllegalStateException("objectsPosition = " + i + " is not at end (length = " + this.f35293b.length);
        } else if (this.f35303l != null && this.f35305n != this.f35303l.length) {
            i = this.f35305n;
            throw new IllegalStateException("checkInitializedPosition = " + i + " is not at end (length = " + this.f35303l.length);
        } else if (this.f35296e > 0 && this.f35299h != this.f35306o) {
            i = this.f35299h;
            throw new IllegalStateException("minFieldNumber is " + i + " but expected " + this.f35306o);
        } else if (this.f35296e > 0 && this.f35300i != this.f35307p) {
            i = this.f35300i;
            throw new IllegalStateException("maxFieldNumber is " + i + " but expected " + this.f35307p);
        } else if (this.f35301j != this.f35308q) {
            i = this.f35301j;
            throw new IllegalStateException("mapFieldCount is " + i + " but expected " + this.f35308q);
        } else if (this.f35302k != this.f35309r) {
            i = this.f35302k;
            throw new IllegalStateException("repeatedFieldCount is " + i + " but expected " + this.f35309r);
        }
    }

    private final void m33142a(int i, Class cls) {
        if (this.f35316y == az.f35198b) {
            this.f35316y = new az();
        }
        this.f35316y.m32979a(i, cls);
    }

    final az m33150d() {
        m33146j();
        return this.f35316y;
    }

    private final void m33141a(int i, bd bdVar) {
        if (this.f35317z == az.f35198b) {
            this.f35317z = new az();
        }
        this.f35317z.m32979a(i, bdVar);
    }

    final az m33151e() {
        m33146j();
        return this.f35317z;
    }

    final az m33152f() {
        m33146j();
        return this.f35291A;
    }

    static Field m33140a(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
}
