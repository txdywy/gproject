package com.google.android.finsky.scheduler.p238b;

import com.google.android.finsky.scheduler.p236a.p237a.C4014c;
import com.google.android.finsky.scheduler.p236a.p237a.C4015d;
import com.google.android.finsky.scheduler.p236a.p237a.C4016e;
import com.google.android.finsky.scheduler.p236a.p237a.C4017f;
import com.google.android.finsky.scheduler.p236a.p237a.C4018g;
import com.google.protobuf.nano.C0757i;

public final class C4027e {
    public final C4017f f20250a;

    public C4027e() {
        this.f20250a = new C4017f();
    }

    public C4027e(byte[] bArr) {
        this((C4017f) C0757i.m4905a(new C4017f(), bArr));
    }

    C4027e(C4017f c4017f) {
        int i = 0;
        this();
        m18864a(c4017f.f20174b);
        m18869a(c4017f.f20175c);
        m18871b(c4017f.f20176d);
        m18872b(c4017f.f20177e);
        m18865a(c4017f.f20178f);
        this.f20250a.f20179g = c4017f.f20179g;
        m18862a(c4017f.f20182j);
        m18870a(c4017f.f20183k);
        Object obj = c4017f.f20180h;
        int length = this.f20250a.f20180h.length;
        Object obj2 = new int[(obj.length + length)];
        System.arraycopy(this.f20250a.f20180h, 0, obj2, 0, length);
        System.arraycopy(obj, 0, obj2, length, obj.length);
        this.f20250a.f20180h = obj2;
        C4018g[] c4018gArr = c4017f.f20181i;
        length = this.f20250a.f20181i.length;
        obj2 = new C4018g[(c4018gArr.length + length)];
        System.arraycopy(this.f20250a.f20181i, 0, obj2, 0, length);
        while (i < c4018gArr.length) {
            obj2[i + length] = new C4029g(c4018gArr[i]).f20252a;
            i++;
        }
        this.f20250a.f20181i = obj2;
    }

    public final C4027e m18864a(int i) {
        C4017f c4017f = this.f20250a;
        c4017f.f20173a |= 1;
        c4017f.f20174b = i;
        return this;
    }

    public final C4027e m18869a(String str) {
        C4017f c4017f = this.f20250a;
        if (str == null) {
            throw new NullPointerException();
        }
        c4017f.f20173a |= 2;
        c4017f.f20175c = str;
        return this;
    }

    public final C4027e m18871b(int i) {
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                C4017f c4017f = this.f20250a;
                c4017f.f20176d = i;
                c4017f.f20173a |= 4;
                return this;
            default:
                throw new IllegalArgumentException("Not a valid consumer: " + i);
        }
    }

    public final C4027e m18872b(String str) {
        C4017f c4017f = this.f20250a;
        if (str == null) {
            throw new NullPointerException();
        }
        c4017f.f20173a |= 8;
        c4017f.f20177e = str;
        return this;
    }

    public final C4027e m18865a(long j) {
        C4017f c4017f = this.f20250a;
        c4017f.f20173a |= 16;
        c4017f.f20178f = j;
        return this;
    }

    public final C4027e m18866a(C4023a c4023a) {
        this.f20250a.f20179g = c4023a.f20246a;
        return this;
    }

    public final C4027e m18868a(C4028f c4028f) {
        int length = this.f20250a.f20181i.length;
        Object obj = new C4018g[(length + 1)];
        System.arraycopy(this.f20250a.f20181i, 0, obj, 0, length);
        obj[length] = c4028f.f20251a;
        this.f20250a.f20181i = obj;
        return this;
    }

    public final C4027e m18867a(C4025c c4025c) {
        if (c4025c == null) {
            return this;
        }
        C4014c c4014c;
        if (c4025c.f20248a.isEmpty()) {
            c4014c = null;
        } else {
            C4014c c4014c2 = new C4014c();
            c4014c2.f20162a = new C4015d[c4025c.f20248a.size()];
            for (int i = 0; i < c4014c2.f20162a.length; i++) {
                c4014c2.f20162a[i] = new C4015d();
                C4015d c4015d = c4014c2.f20162a[i];
                String str = (String) c4025c.f20248a.m1629b(i);
                if (str == null) {
                    throw new NullPointerException();
                }
                c4015d.f20164b |= 1;
                c4015d.f20165c = str;
                c4014c2.f20162a[i].f20166d = (C4016e) c4025c.f20248a.m1630c(i);
            }
            c4014c = c4014c2;
        }
        return m18862a(c4014c);
    }

    private final C4027e m18862a(C4014c c4014c) {
        if (c4014c != null) {
            this.f20250a.f20182j = c4014c;
        }
        return this;
    }

    public final C4027e m18870a(boolean z) {
        C4017f c4017f = this.f20250a;
        c4017f.f20173a |= 32;
        c4017f.f20183k = z;
        return this;
    }

    public final C4026d m18863a() {
        return new C4026d(new C4027e(this.f20250a).f20250a);
    }
}
