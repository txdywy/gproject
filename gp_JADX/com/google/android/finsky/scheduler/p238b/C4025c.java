package com.google.android.finsky.scheduler.p238b;

import android.support.v4.p037h.C0305a;
import com.google.android.finsky.p111d.C2471a;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.p178a.C2470a;
import com.google.android.finsky.scheduler.p236a.p237a.C4016e;
import com.google.android.finsky.utils.FinskyLog;
import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.l;

public final class C4025c {
    public final C0305a f20248a;

    public C4025c() {
        this(new C0305a());
    }

    C4025c(C0305a c0305a) {
        this.f20248a = c0305a;
    }

    public final boolean m18852a(String str) {
        C4016e c4016e = (C4016e) this.f20248a.get(str);
        if (c4016e == null) {
            return false;
        }
        int i;
        if (c4016e.f20167a == 0) {
            i = 1;
        } else {
            i = 0;
        }
        if (i != 0) {
            return c4016e.f20167a == 0 ? c4016e.f20168b : false;
        } else {
            FinskyLog.m21669e("Requested boolean value from non-boolean extra", new Object[0]);
            return false;
        }
    }

    public final C4025c m18850a(String str, boolean z) {
        C4016e d = m18845d(str);
        d.f20167a = -1;
        d.f20167a = 0;
        d.f20168b = z;
        this.f20248a.put(str, d);
        return this;
    }

    public final String m18854b(String str) {
        C4016e c4016e = (C4016e) this.f20248a.get(str);
        if (c4016e == null) {
            return null;
        }
        int i;
        if (c4016e.f20167a == 3) {
            i = 1;
        } else {
            i = 0;
        }
        if (i == 0) {
            FinskyLog.m21669e("Requested string value from non-string extra", new Object[0]);
            return null;
        } else if (c4016e.f20167a == 3) {
            return c4016e.f20171e;
        } else {
            return "";
        }
    }

    public final C4025c m18849a(String str, String str2) {
        C4016e d = m18845d(str);
        if (str2 == null) {
            throw new NullPointerException();
        }
        d.f20167a = -1;
        d.f20167a = 3;
        d.f20171e = str2;
        this.f20248a.put(str, d);
        return this;
    }

    public final byte[] m18855c(String str) {
        C4016e c4016e = (C4016e) this.f20248a.get(str);
        if (c4016e == null) {
            return null;
        }
        int i;
        if (c4016e.f20167a == 4) {
            i = 1;
        } else {
            i = 0;
        }
        if (i == 0) {
            FinskyLog.m21669e("Requested byte array value from non-byte array extra", new Object[0]);
            return null;
        } else if (c4016e.f20167a == 4) {
            return c4016e.f20172f;
        } else {
            return l.l;
        }
    }

    public final C4025c m18851a(String str, byte[] bArr) {
        C4016e d = m18845d(str);
        if (bArr == null) {
            throw new NullPointerException();
        }
        d.f20167a = -1;
        d.f20167a = 4;
        d.f20172f = bArr;
        this.f20248a.put(str, d);
        return this;
    }

    public final int m18846a(String str, int i) {
        C4016e c4016e = (C4016e) this.f20248a.get(str);
        if (c4016e == null) {
            return i;
        }
        int i2;
        if (c4016e.f20167a == 1) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        if (i2 != 0) {
            return c4016e.f20167a == 1 ? c4016e.f20169c : 0;
        } else {
            FinskyLog.m21669e("Requested int value from non-int extra", new Object[0]);
            return i;
        }
    }

    public final C4025c m18853b(String str, int i) {
        C4016e d = m18845d(str);
        d.f20167a = -1;
        d.f20167a = 1;
        d.f20169c = i;
        this.f20248a.put(str, d);
        return this;
    }

    public final C2495w m18847a(String str, C2471a c2471a) {
        C2495w c2495w = null;
        byte[] c = m18855c(str);
        if (c != null) {
            try {
                c2495w = c2471a.m13183a(C2470a.m13171a(c));
            } catch (Throwable e) {
                FinskyLog.m21660a(e, "Failed to parse logging context", new Object[0]);
            }
        }
        return c2495w;
    }

    public final C4025c m18848a(String str, C2495w c2495w) {
        return m18851a(str, C0757i.m4909a(c2495w.m13381c()));
    }

    private final C4016e m18845d(String str) {
        C4016e c4016e = (C4016e) this.f20248a.get(str);
        if (c4016e == null) {
            return new C4016e();
        }
        return c4016e;
    }
}
