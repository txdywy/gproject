package android.support.constraint.p015a.p016a;

import android.support.constraint.p015a.C0081h;
import android.support.constraint.p015a.C0082i;
import java.util.HashSet;

public final class C0062a {
    public final C0066e f163a;
    public final C0065d f164b;
    public C0062a f165c;
    public int f166d = 0;
    public int f167e = -1;
    public C0064c f168f = C0064c.NONE;
    public C0063b f169g = C0063b.RELAXED;
    public int f170h = 0;
    public C0081h f171i;

    public C0062a(C0066e c0066e, C0065d c0065d) {
        this.f163a = c0066e;
        this.f164b = c0065d;
    }

    public final void m79a() {
        if (this.f171i == null) {
            this.f171i = new C0081h(C0082i.UNRESTRICTED);
        } else {
            this.f171i.m178b();
        }
    }

    public final int m81b() {
        if (this.f163a.f204P == 8) {
            return 0;
        }
        if (this.f167e < 0 || this.f165c == null || this.f165c.f163a.f204P != 8) {
            return this.f166d;
        }
        return this.f167e;
    }

    public final void m82c() {
        this.f165c = null;
        this.f166d = 0;
        this.f167e = -1;
        this.f168f = C0064c.STRONG;
        this.f170h = 0;
        this.f169g = C0063b.RELAXED;
    }

    public final boolean m80a(C0062a c0062a, int i, int i2, C0064c c0064c, int i3, boolean z) {
        if (c0062a == null) {
            this.f165c = null;
            this.f166d = 0;
            this.f167e = -1;
            this.f168f = C0064c.NONE;
            this.f170h = 2;
            return true;
        }
        if (!z) {
            int i4;
            if (c0062a != null) {
                C0065d c0065d = c0062a.f164b;
                boolean z2;
                if (c0065d != this.f164b) {
                    switch (this.f164b.ordinal()) {
                        case 1:
                        case 3:
                            if (c0065d == C0065d.LEFT || c0065d == C0065d.RIGHT) {
                                i4 = true;
                            } else {
                                i4 = 0;
                            }
                            if (c0062a.f163a instanceof C0070h) {
                                if (i4 == 0 && c0065d != C0065d.CENTER_X) {
                                    i4 = 0;
                                    break;
                                }
                                z2 = true;
                                break;
                            }
                            break;
                        case 2:
                        case 4:
                            if (c0065d == C0065d.TOP || c0065d == C0065d.BOTTOM) {
                                i4 = true;
                            } else {
                                i4 = 0;
                            }
                            if (c0062a.f163a instanceof C0070h) {
                                if (i4 == 0 && c0065d != C0065d.CENTER_Y) {
                                    i4 = 0;
                                    break;
                                }
                                z2 = true;
                                break;
                            }
                            break;
                        case 6:
                            if (c0065d != C0065d.BASELINE && c0065d != C0065d.CENTER_X && c0065d != C0065d.CENTER_Y) {
                                z2 = true;
                                break;
                            }
                            i4 = 0;
                            break;
                    }
                } else if (this.f164b != C0065d.CENTER) {
                    if (this.f164b != C0065d.BASELINE || (c0062a.f163a.m108k() && this.f163a.m108k())) {
                        z2 = true;
                    } else {
                        i4 = 0;
                    }
                    if (i4 == 0) {
                        return false;
                    }
                }
            }
            i4 = 0;
            if (i4 == 0) {
                return false;
            }
        }
        this.f165c = c0062a;
        if (i > 0) {
            this.f166d = i;
        } else {
            this.f166d = 0;
        }
        this.f167e = i2;
        this.f168f = c0064c;
        this.f170h = i3;
        return true;
    }

    public final boolean m83d() {
        return this.f165c != null;
    }

    public final String toString() {
        return this.f163a.f205Q + ":" + this.f164b.toString() + (this.f165c != null ? " connected to " + this.f165c.m78a(new HashSet()) : "");
    }

    private final String m78a(HashSet hashSet) {
        if (!hashSet.add(this)) {
            return "<-";
        }
        return this.f163a.f205Q + ":" + this.f164b.toString() + (this.f165c != null ? " connected to " + this.f165c.m78a(hashSet) : "");
    }
}
