package android.support.v7.widget;

import android.support.v4.p037h.C0321q;
import android.support.v4.p037h.C0322r;
import java.util.ArrayList;
import java.util.List;

final class C0514y implements ec {
    public C0321q f3659a;
    public final ArrayList f3660b;
    public final ArrayList f3661c;
    public final C0496z f3662d;
    public Runnable f3663e;
    public final boolean f3664f;
    public final eb f3665g;
    public int f3666h;

    C0514y(C0496z c0496z) {
        this(c0496z, (byte) 0);
    }

    private C0514y(C0496z c0496z, byte b) {
        this.f3659a = new C0322r(30);
        this.f3660b = new ArrayList();
        this.f3661c = new ArrayList();
        this.f3666h = 0;
        this.f3662d = c0496z;
        this.f3664f = false;
        this.f3665g = new eb(this);
    }

    final void m3911a() {
        m3904a(this.f3660b);
        m3904a(this.f3661c);
        this.f3666h = 0;
    }

    final void m3915b() {
        eb ebVar = this.f3665g;
        List list = this.f3660b;
        while (true) {
            int i;
            Object obj;
            int i2;
            Object obj2 = null;
            int size = list.size() - 1;
            while (size >= 0) {
                Object obj3;
                int i3;
                aa aaVar;
                aa aaVar2;
                aa aaVar3;
                Object obj4;
                int i4;
                int size2;
                int i5;
                int i6;
                int i7;
                if (((aa) list.get(size)).f3074a != 8) {
                    obj3 = 1;
                } else if (obj2 != null) {
                    i = size;
                    if (i != -1) {
                        i3 = i + 1;
                        aaVar = (aa) list.get(i);
                        aaVar2 = (aa) list.get(i3);
                        switch (aaVar2.f3074a) {
                            case 1:
                                size = 0;
                                if (aaVar.f3077d < aaVar2.f3075b) {
                                    size = -1;
                                }
                                if (aaVar.f3075b < aaVar2.f3075b) {
                                    size++;
                                }
                                if (aaVar2.f3075b <= aaVar.f3075b) {
                                    aaVar.f3075b += aaVar2.f3077d;
                                }
                                if (aaVar2.f3075b <= aaVar.f3077d) {
                                    aaVar.f3077d += aaVar2.f3077d;
                                }
                                aaVar2.f3075b = size + aaVar2.f3075b;
                                list.set(i, aaVar2);
                                list.set(i3, aaVar);
                                break;
                            case 2:
                                aaVar3 = null;
                                obj = null;
                                if (aaVar.f3075b < aaVar.f3077d) {
                                    obj4 = null;
                                    if (aaVar2.f3075b == aaVar.f3075b && aaVar2.f3077d == aaVar.f3077d - aaVar.f3075b) {
                                        obj = 1;
                                    }
                                } else {
                                    obj4 = 1;
                                    if (aaVar2.f3075b == aaVar.f3077d + 1 && aaVar2.f3077d == aaVar.f3075b - aaVar.f3077d) {
                                        obj = 1;
                                    }
                                }
                                if (aaVar.f3077d < aaVar2.f3075b) {
                                    if (aaVar.f3077d < aaVar2.f3075b + aaVar2.f3077d) {
                                        aaVar2.f3077d--;
                                        aaVar.f3074a = 2;
                                        aaVar.f3077d = 1;
                                        if (aaVar2.f3077d != 0) {
                                            break;
                                        }
                                        list.remove(i3);
                                        ebVar.f3424a.mo931a(aaVar2);
                                        break;
                                    }
                                }
                                aaVar2.f3075b--;
                                if (aaVar.f3075b <= aaVar2.f3075b) {
                                    aaVar2.f3075b++;
                                } else if (aaVar.f3075b < aaVar2.f3075b + aaVar2.f3077d) {
                                    aaVar3 = ebVar.f3424a.mo930a(2, aaVar.f3075b + 1, (aaVar2.f3075b + aaVar2.f3077d) - aaVar.f3075b, null);
                                    aaVar2.f3077d = aaVar.f3075b - aaVar2.f3075b;
                                }
                                if (obj == null) {
                                    if (obj4 == null) {
                                        if (aaVar3 != null) {
                                            if (aaVar.f3075b > aaVar3.f3075b) {
                                                aaVar.f3075b -= aaVar3.f3077d;
                                            }
                                            if (aaVar.f3077d > aaVar3.f3075b) {
                                                aaVar.f3077d -= aaVar3.f3077d;
                                            }
                                        }
                                        if (aaVar.f3075b > aaVar2.f3075b) {
                                            aaVar.f3075b -= aaVar2.f3077d;
                                        }
                                        if (aaVar.f3077d > aaVar2.f3075b) {
                                            aaVar.f3077d -= aaVar2.f3077d;
                                        }
                                    } else {
                                        if (aaVar3 != null) {
                                            if (aaVar.f3075b >= aaVar3.f3075b) {
                                                aaVar.f3075b -= aaVar3.f3077d;
                                            }
                                            if (aaVar.f3077d >= aaVar3.f3075b) {
                                                aaVar.f3077d -= aaVar3.f3077d;
                                            }
                                        }
                                        if (aaVar.f3075b >= aaVar2.f3075b) {
                                            aaVar.f3075b -= aaVar2.f3077d;
                                        }
                                        if (aaVar.f3077d >= aaVar2.f3075b) {
                                            aaVar.f3077d -= aaVar2.f3077d;
                                        }
                                    }
                                    list.set(i, aaVar2);
                                    if (aaVar.f3075b == aaVar.f3077d) {
                                        list.set(i3, aaVar);
                                    } else {
                                        list.remove(i3);
                                    }
                                    if (aaVar3 == null) {
                                        break;
                                    }
                                    list.add(i, aaVar3);
                                    break;
                                }
                                list.set(i, aaVar2);
                                list.remove(i3);
                                ebVar.f3424a.mo931a(aaVar);
                                break;
                            case 4:
                                obj4 = null;
                                obj = null;
                                if (aaVar.f3077d < aaVar2.f3075b) {
                                    aaVar2.f3075b--;
                                } else if (aaVar.f3077d < aaVar2.f3075b + aaVar2.f3077d) {
                                    aaVar2.f3077d--;
                                    obj4 = ebVar.f3424a.mo930a(4, aaVar.f3075b, 1, aaVar2.f3076c);
                                }
                                if (aaVar.f3075b <= aaVar2.f3075b) {
                                    aaVar2.f3075b++;
                                } else if (aaVar.f3075b < aaVar2.f3075b + aaVar2.f3077d) {
                                    i4 = (aaVar2.f3075b + aaVar2.f3077d) - aaVar.f3075b;
                                    obj = ebVar.f3424a.mo930a(4, aaVar.f3075b + 1, i4, aaVar2.f3076c);
                                    aaVar2.f3077d -= i4;
                                }
                                list.set(i3, aaVar);
                                if (aaVar2.f3077d <= 0) {
                                    list.set(i, aaVar2);
                                } else {
                                    list.remove(i);
                                    ebVar.f3424a.mo931a(aaVar2);
                                }
                                if (obj4 != null) {
                                    list.add(i, obj4);
                                }
                                if (obj == null) {
                                    break;
                                }
                                list.add(i, obj);
                                break;
                            default:
                                break;
                        }
                    }
                    size2 = this.f3660b.size();
                    for (i = 0; i < size2; i++) {
                        aaVar = (aa) this.f3660b.get(i);
                        switch (aaVar.f3074a) {
                            case 1:
                                m3907c(aaVar);
                                break;
                            case 2:
                                i3 = aaVar.f3075b;
                                i2 = aaVar.f3077d + aaVar.f3075b;
                                i4 = -1;
                                size = aaVar.f3075b;
                                i5 = 0;
                                while (size < i2) {
                                    obj2 = null;
                                    if (this.f3662d.mo858a(size) == null || m3908c(size)) {
                                        if (i4 == 0) {
                                            m3906b(mo930a(2, i3, i5, null));
                                            obj2 = 1;
                                        }
                                        i4 = 1;
                                    } else {
                                        if (i4 == 1) {
                                            m3907c(mo930a(2, i3, i5, null));
                                            obj2 = 1;
                                        }
                                        i4 = 0;
                                    }
                                    if (obj2 == null) {
                                        i6 = size - i5;
                                        size = i2 - i5;
                                        i2 = 1;
                                    } else {
                                        i7 = size;
                                        size = i2;
                                        i2 = i5 + 1;
                                        i6 = i7;
                                    }
                                    i5 = i2;
                                    i2 = size;
                                    size = i6 + 1;
                                }
                                if (i5 != aaVar.f3077d) {
                                    mo931a(aaVar);
                                    aaVar = mo930a(2, i3, i5, null);
                                }
                                if (i4 != 0) {
                                    m3907c(aaVar);
                                    break;
                                } else {
                                    m3906b(aaVar);
                                    break;
                                }
                                break;
                            case 4:
                                i4 = aaVar.f3075b;
                                i5 = aaVar.f3075b + aaVar.f3077d;
                                i2 = aaVar.f3075b;
                                i6 = 0;
                                size = i4;
                                i4 = -1;
                                while (i2 < i5) {
                                    if (this.f3662d.mo858a(i2) == null || m3908c(i2)) {
                                        if (i4 == 0) {
                                            m3906b(mo930a(4, size, i6, aaVar.f3076c));
                                            i6 = 0;
                                            size = i2;
                                        }
                                        i4 = size;
                                        size = i6;
                                        i6 = 1;
                                    } else {
                                        if (i4 == 1) {
                                            m3907c(mo930a(4, size, i6, aaVar.f3076c));
                                            i6 = 0;
                                            size = i2;
                                        }
                                        i4 = size;
                                        size = i6;
                                        i6 = 0;
                                    }
                                    i2++;
                                    i7 = i6;
                                    i6 = size + 1;
                                    size = i4;
                                    i4 = i7;
                                }
                                if (i6 != aaVar.f3077d) {
                                    obj = aaVar.f3076c;
                                    mo931a(aaVar);
                                    aaVar = mo930a(4, size, i6, obj);
                                }
                                if (i4 != 0) {
                                    m3907c(aaVar);
                                    break;
                                } else {
                                    m3906b(aaVar);
                                    break;
                                }
                                break;
                            case 8:
                                m3907c(aaVar);
                                break;
                        }
                        if (this.f3663e != null) {
                            this.f3663e.run();
                        }
                    }
                    this.f3660b.clear();
                    return;
                } else {
                    obj3 = obj2;
                }
                size--;
                obj2 = obj3;
            }
            i = -1;
            if (i != -1) {
                i3 = i + 1;
                aaVar = (aa) list.get(i);
                aaVar2 = (aa) list.get(i3);
                switch (aaVar2.f3074a) {
                    case 1:
                        size = 0;
                        if (aaVar.f3077d < aaVar2.f3075b) {
                            size = -1;
                        }
                        if (aaVar.f3075b < aaVar2.f3075b) {
                            size++;
                        }
                        if (aaVar2.f3075b <= aaVar.f3075b) {
                            aaVar.f3075b += aaVar2.f3077d;
                        }
                        if (aaVar2.f3075b <= aaVar.f3077d) {
                            aaVar.f3077d += aaVar2.f3077d;
                        }
                        aaVar2.f3075b = size + aaVar2.f3075b;
                        list.set(i, aaVar2);
                        list.set(i3, aaVar);
                        break;
                    case 2:
                        aaVar3 = null;
                        obj = null;
                        if (aaVar.f3075b < aaVar.f3077d) {
                            obj4 = null;
                            obj = 1;
                            break;
                        }
                        obj4 = 1;
                        obj = 1;
                        break;
                        if (aaVar.f3077d < aaVar2.f3075b) {
                            if (aaVar.f3077d < aaVar2.f3075b + aaVar2.f3077d) {
                                aaVar2.f3077d--;
                                aaVar.f3074a = 2;
                                aaVar.f3077d = 1;
                                if (aaVar2.f3077d != 0) {
                                    list.remove(i3);
                                    ebVar.f3424a.mo931a(aaVar2);
                                    break;
                                }
                                break;
                            }
                        }
                        aaVar2.f3075b--;
                        if (aaVar.f3075b <= aaVar2.f3075b) {
                            aaVar2.f3075b++;
                        } else if (aaVar.f3075b < aaVar2.f3075b + aaVar2.f3077d) {
                            aaVar3 = ebVar.f3424a.mo930a(2, aaVar.f3075b + 1, (aaVar2.f3075b + aaVar2.f3077d) - aaVar.f3075b, null);
                            aaVar2.f3077d = aaVar.f3075b - aaVar2.f3075b;
                        }
                        if (obj == null) {
                            list.set(i, aaVar2);
                            list.remove(i3);
                            ebVar.f3424a.mo931a(aaVar);
                            break;
                        }
                        if (obj4 == null) {
                            if (aaVar3 != null) {
                                if (aaVar.f3075b >= aaVar3.f3075b) {
                                    aaVar.f3075b -= aaVar3.f3077d;
                                }
                                if (aaVar.f3077d >= aaVar3.f3075b) {
                                    aaVar.f3077d -= aaVar3.f3077d;
                                }
                            }
                            if (aaVar.f3075b >= aaVar2.f3075b) {
                                aaVar.f3075b -= aaVar2.f3077d;
                            }
                            if (aaVar.f3077d >= aaVar2.f3075b) {
                                aaVar.f3077d -= aaVar2.f3077d;
                            }
                        } else {
                            if (aaVar3 != null) {
                                if (aaVar.f3075b > aaVar3.f3075b) {
                                    aaVar.f3075b -= aaVar3.f3077d;
                                }
                                if (aaVar.f3077d > aaVar3.f3075b) {
                                    aaVar.f3077d -= aaVar3.f3077d;
                                }
                            }
                            if (aaVar.f3075b > aaVar2.f3075b) {
                                aaVar.f3075b -= aaVar2.f3077d;
                            }
                            if (aaVar.f3077d > aaVar2.f3075b) {
                                aaVar.f3077d -= aaVar2.f3077d;
                            }
                        }
                        list.set(i, aaVar2);
                        if (aaVar.f3075b == aaVar.f3077d) {
                            list.remove(i3);
                        } else {
                            list.set(i3, aaVar);
                        }
                        if (aaVar3 == null) {
                            list.add(i, aaVar3);
                            break;
                        }
                        break;
                    case 4:
                        obj4 = null;
                        obj = null;
                        if (aaVar.f3077d < aaVar2.f3075b) {
                            aaVar2.f3075b--;
                        } else if (aaVar.f3077d < aaVar2.f3075b + aaVar2.f3077d) {
                            aaVar2.f3077d--;
                            obj4 = ebVar.f3424a.mo930a(4, aaVar.f3075b, 1, aaVar2.f3076c);
                        }
                        if (aaVar.f3075b <= aaVar2.f3075b) {
                            aaVar2.f3075b++;
                        } else if (aaVar.f3075b < aaVar2.f3075b + aaVar2.f3077d) {
                            i4 = (aaVar2.f3075b + aaVar2.f3077d) - aaVar.f3075b;
                            obj = ebVar.f3424a.mo930a(4, aaVar.f3075b + 1, i4, aaVar2.f3076c);
                            aaVar2.f3077d -= i4;
                        }
                        list.set(i3, aaVar);
                        if (aaVar2.f3077d <= 0) {
                            list.remove(i);
                            ebVar.f3424a.mo931a(aaVar2);
                        } else {
                            list.set(i, aaVar2);
                        }
                        if (obj4 != null) {
                            list.add(i, obj4);
                        }
                        if (obj == null) {
                            list.add(i, obj);
                            break;
                        }
                        break;
                    default:
                        break;
                }
            }
            size2 = this.f3660b.size();
            for (i = 0; i < size2; i++) {
                aaVar = (aa) this.f3660b.get(i);
                switch (aaVar.f3074a) {
                    case 1:
                        m3907c(aaVar);
                        break;
                    case 2:
                        i3 = aaVar.f3075b;
                        i2 = aaVar.f3077d + aaVar.f3075b;
                        i4 = -1;
                        size = aaVar.f3075b;
                        i5 = 0;
                        while (size < i2) {
                            obj2 = null;
                            if (this.f3662d.mo858a(size) == null) {
                                break;
                            }
                            if (i4 == 0) {
                                m3906b(mo930a(2, i3, i5, null));
                                obj2 = 1;
                            }
                            i4 = 1;
                            if (obj2 == null) {
                                i7 = size;
                                size = i2;
                                i2 = i5 + 1;
                                i6 = i7;
                            } else {
                                i6 = size - i5;
                                size = i2 - i5;
                                i2 = 1;
                            }
                            i5 = i2;
                            i2 = size;
                            size = i6 + 1;
                        }
                        if (i5 != aaVar.f3077d) {
                            mo931a(aaVar);
                            aaVar = mo930a(2, i3, i5, null);
                        }
                        if (i4 != 0) {
                            m3906b(aaVar);
                            break;
                        } else {
                            m3907c(aaVar);
                            break;
                        }
                    case 4:
                        i4 = aaVar.f3075b;
                        i5 = aaVar.f3075b + aaVar.f3077d;
                        i2 = aaVar.f3075b;
                        i6 = 0;
                        size = i4;
                        i4 = -1;
                        while (i2 < i5) {
                            if (this.f3662d.mo858a(i2) == null) {
                                break;
                            }
                            if (i4 == 0) {
                                m3906b(mo930a(4, size, i6, aaVar.f3076c));
                                i6 = 0;
                                size = i2;
                            }
                            i4 = size;
                            size = i6;
                            i6 = 1;
                            i2++;
                            i7 = i6;
                            i6 = size + 1;
                            size = i4;
                            i4 = i7;
                        }
                        if (i6 != aaVar.f3077d) {
                            obj = aaVar.f3076c;
                            mo931a(aaVar);
                            aaVar = mo930a(4, size, i6, obj);
                        }
                        if (i4 != 0) {
                            m3906b(aaVar);
                            break;
                        } else {
                            m3907c(aaVar);
                            break;
                        }
                    case 8:
                        m3907c(aaVar);
                        break;
                }
                if (this.f3663e != null) {
                    this.f3663e.run();
                }
            }
            this.f3660b.clear();
            return;
        }
    }

    final void m3916c() {
        int size = this.f3661c.size();
        for (int i = 0; i < size; i++) {
            this.f3662d.mo863b((aa) this.f3661c.get(i));
        }
        m3904a(this.f3661c);
        this.f3666h = 0;
    }

    private final void m3906b(aa aaVar) {
        if (aaVar.f3074a == 1 || aaVar.f3074a == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int i;
        int b = m3905b(aaVar.f3075b, aaVar.f3074a);
        int i2 = aaVar.f3075b;
        switch (aaVar.f3074a) {
            case 2:
                i = 0;
                break;
            case 4:
                i = 1;
                break;
            default:
                throw new IllegalArgumentException("op should be remove or update." + aaVar);
        }
        int i3 = 1;
        int i4 = b;
        b = i2;
        for (i2 = 1; i2 < aaVar.f3077d; i2++) {
            Object obj;
            int b2 = m3905b(aaVar.f3075b + (i * i2), aaVar.f3074a);
            int i5;
            switch (aaVar.f3074a) {
                case 2:
                    if (b2 != i4) {
                        obj = null;
                        break;
                    } else {
                        i5 = 1;
                        break;
                    }
                case 4:
                    if (b2 != i4 + 1) {
                        obj = null;
                        break;
                    } else {
                        i5 = 1;
                        break;
                    }
                default:
                    obj = null;
                    break;
            }
            if (obj != null) {
                i3++;
            } else {
                aa a = mo930a(aaVar.f3074a, i4, i3, aaVar.f3076c);
                m3903a(a, b);
                mo931a(a);
                if (aaVar.f3074a == 4) {
                    b += i3;
                }
                i3 = 1;
                i4 = b2;
            }
        }
        Object obj2 = aaVar.f3076c;
        mo931a(aaVar);
        if (i3 > 0) {
            aa a2 = mo930a(aaVar.f3074a, i4, i3, obj2);
            m3903a(a2, b);
            mo931a(a2);
        }
    }

    private final void m3903a(aa aaVar, int i) {
        this.f3662d.mo861a(aaVar);
        switch (aaVar.f3074a) {
            case 2:
                this.f3662d.mo859a(i, aaVar.f3077d);
                return;
            case 4:
                this.f3662d.mo860a(i, aaVar.f3077d, aaVar.f3076c);
                return;
            default:
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
    }

    private final int m3905b(int i, int i2) {
        int i3;
        int size = this.f3661c.size() - 1;
        int i4 = i;
        while (size >= 0) {
            int i5;
            aa aaVar = (aa) this.f3661c.get(size);
            if (aaVar.f3074a == 8) {
                int i6;
                if (aaVar.f3075b < aaVar.f3077d) {
                    i6 = aaVar.f3075b;
                    i3 = aaVar.f3077d;
                } else {
                    i6 = aaVar.f3077d;
                    i3 = aaVar.f3075b;
                }
                if (i4 < i6 || i4 > r2) {
                    if (i4 < aaVar.f3075b) {
                        if (i2 == 1) {
                            aaVar.f3075b++;
                            aaVar.f3077d++;
                            i5 = i4;
                        } else if (i2 == 2) {
                            aaVar.f3075b--;
                            aaVar.f3077d--;
                        }
                    }
                    i5 = i4;
                } else if (i6 == aaVar.f3075b) {
                    if (i2 == 1) {
                        aaVar.f3077d++;
                    } else if (i2 == 2) {
                        aaVar.f3077d--;
                    }
                    i5 = i4 + 1;
                } else {
                    if (i2 == 1) {
                        aaVar.f3075b++;
                    } else if (i2 == 2) {
                        aaVar.f3075b--;
                    }
                    i5 = i4 - 1;
                }
            } else {
                if (aaVar.f3075b <= i4) {
                    if (aaVar.f3074a == 1) {
                        i5 = i4 - aaVar.f3077d;
                    } else if (aaVar.f3074a == 2) {
                        i5 = aaVar.f3077d + i4;
                    }
                } else if (i2 == 1) {
                    aaVar.f3075b++;
                    i5 = i4;
                } else if (i2 == 2) {
                    aaVar.f3075b--;
                }
                i5 = i4;
            }
            size--;
            i4 = i5;
        }
        for (i3 = this.f3661c.size() - 1; i3 >= 0; i3--) {
            aaVar = (aa) this.f3661c.get(i3);
            if (aaVar.f3074a == 8) {
                if (aaVar.f3077d == aaVar.f3075b || aaVar.f3077d < 0) {
                    this.f3661c.remove(i3);
                    mo931a(aaVar);
                }
            } else if (aaVar.f3077d <= 0) {
                this.f3661c.remove(i3);
                mo931a(aaVar);
            }
        }
        return i4;
    }

    private final boolean m3908c(int i) {
        int size = this.f3661c.size();
        for (int i2 = 0; i2 < size; i2++) {
            aa aaVar = (aa) this.f3661c.get(i2);
            if (aaVar.f3074a == 8) {
                if (m3909a(aaVar.f3077d, i2 + 1) == i) {
                    return true;
                }
            } else if (aaVar.f3074a == 1) {
                int i3 = aaVar.f3075b + aaVar.f3077d;
                for (int i4 = aaVar.f3075b; i4 < i3; i4++) {
                    if (m3909a(i4, i2 + 1) == i) {
                        return true;
                    }
                }
                continue;
            } else {
                continue;
            }
        }
        return false;
    }

    private final void m3907c(aa aaVar) {
        this.f3661c.add(aaVar);
        switch (aaVar.f3074a) {
            case 1:
                this.f3662d.mo864c(aaVar.f3075b, aaVar.f3077d);
                return;
            case 2:
                this.f3662d.mo862b(aaVar.f3075b, aaVar.f3077d);
                return;
            case 4:
                this.f3662d.mo860a(aaVar.f3075b, aaVar.f3077d, aaVar.f3076c);
                return;
            case 8:
                this.f3662d.mo865d(aaVar.f3075b, aaVar.f3077d);
                return;
            default:
                throw new IllegalArgumentException("Unknown update op type for " + aaVar);
        }
    }

    final boolean m3917d() {
        return this.f3660b.size() > 0;
    }

    final boolean m3913a(int i) {
        return (this.f3666h & i) != 0;
    }

    final int m3914b(int i) {
        return m3909a(i, 0);
    }

    final int m3909a(int i, int i2) {
        int size = this.f3661c.size();
        int i3 = i;
        while (i2 < size) {
            aa aaVar = (aa) this.f3661c.get(i2);
            if (aaVar.f3074a == 8) {
                if (aaVar.f3075b == i3) {
                    i3 = aaVar.f3077d;
                } else {
                    if (aaVar.f3075b < i3) {
                        i3--;
                    }
                    if (aaVar.f3077d <= i3) {
                        i3++;
                    }
                }
            } else if (aaVar.f3075b > i3) {
                continue;
            } else if (aaVar.f3074a == 2) {
                if (i3 < aaVar.f3075b + aaVar.f3077d) {
                    return -1;
                }
                i3 -= aaVar.f3077d;
            } else if (aaVar.f3074a == 1) {
                i3 += aaVar.f3077d;
            }
            i2++;
        }
        return i3;
    }

    final void m3918e() {
        m3916c();
        int size = this.f3660b.size();
        for (int i = 0; i < size; i++) {
            aa aaVar = (aa) this.f3660b.get(i);
            switch (aaVar.f3074a) {
                case 1:
                    this.f3662d.mo863b(aaVar);
                    this.f3662d.mo864c(aaVar.f3075b, aaVar.f3077d);
                    break;
                case 2:
                    this.f3662d.mo863b(aaVar);
                    this.f3662d.mo859a(aaVar.f3075b, aaVar.f3077d);
                    break;
                case 4:
                    this.f3662d.mo863b(aaVar);
                    this.f3662d.mo860a(aaVar.f3075b, aaVar.f3077d, aaVar.f3076c);
                    break;
                case 8:
                    this.f3662d.mo863b(aaVar);
                    this.f3662d.mo865d(aaVar.f3075b, aaVar.f3077d);
                    break;
            }
            if (this.f3663e != null) {
                this.f3663e.run();
            }
        }
        m3904a(this.f3660b);
        this.f3666h = 0;
    }

    public final aa mo930a(int i, int i2, int i3, Object obj) {
        aa aaVar = (aa) this.f3659a.mo381a();
        if (aaVar == null) {
            return new aa(i, i2, i3, obj);
        }
        aaVar.f3074a = i;
        aaVar.f3075b = i2;
        aaVar.f3077d = i3;
        aaVar.f3076c = obj;
        return aaVar;
    }

    public final void mo931a(aa aaVar) {
        if (!this.f3664f) {
            aaVar.f3076c = null;
            this.f3659a.mo382a(aaVar);
        }
    }

    private final void m3904a(List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            mo931a((aa) list.get(i));
        }
        list.clear();
    }
}
