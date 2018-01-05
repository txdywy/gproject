package com.google.protobuf;

import java.util.List;

public final class C7229w implements cz {
    public final C7225s f35505a;
    public int f35506b;
    public int f35507c;
    public int f35508d = 0;

    public C7229w(C7225s c7225s) {
        this.f35505a = (C7225s) bb.m32995a((Object) c7225s, "input");
        this.f35505a.f35486d = this;
    }

    public final int mo6261a() {
        if (this.f35508d != 0) {
            this.f35506b = this.f35508d;
            this.f35508d = 0;
        } else {
            this.f35506b = this.f35505a.mo6231a();
        }
        if (this.f35506b == 0 || this.f35506b == this.f35507c) {
            return Integer.MAX_VALUE;
        }
        return this.f35506b >>> 3;
    }

    public final int mo6266b() {
        return this.f35506b;
    }

    public final boolean mo6271c() {
        if (this.f35505a.mo6259v() || this.f35506b == this.f35507c) {
            return false;
        }
        return this.f35505a.mo6236b(this.f35506b);
    }

    private final void m33739a(int i) {
        if ((this.f35506b & 7) != i) {
            throw InvalidProtocolBufferException.m32669f();
        }
    }

    public final double mo6272d() {
        m33739a(1);
        return this.f35505a.mo6235b();
    }

    public final float mo6274e() {
        m33739a(5);
        return this.f35505a.mo6237c();
    }

    public final long mo6276f() {
        m33739a(0);
        return this.f35505a.mo6239d();
    }

    public final long mo6278g() {
        m33739a(0);
        return this.f35505a.mo6241e();
    }

    public final int mo6280h() {
        m33739a(0);
        return this.f35505a.mo6243f();
    }

    public final long mo6282i() {
        m33739a(1);
        return this.f35505a.mo6244g();
    }

    public final int mo6284j() {
        m33739a(5);
        return this.f35505a.mo6245h();
    }

    public final boolean mo6287k() {
        m33739a(0);
        return this.f35505a.mo6246i();
    }

    public final String mo6288l() {
        m33739a(2);
        return this.f35505a.mo6247j();
    }

    public final String mo6290m() {
        m33739a(2);
        return this.f35505a.mo6248k();
    }

    public final Object mo6262a(Class cls, ah ahVar) {
        m33739a(2);
        return m33737a(cu.f35284a.m33133a(cls), ahVar);
    }

    public final Object mo6267b(Class cls, ah ahVar) {
        m33739a(3);
        return m33741b(cu.f35284a.m33133a(cls), ahVar);
    }

    private final Object m33737a(de deVar, ah ahVar) {
        int m = this.f35505a.mo6250m();
        if (this.f35505a.f35483a >= this.f35505a.f35484b) {
            throw InvalidProtocolBufferException.m32670g();
        }
        m = this.f35505a.mo6238c(m);
        Object a = deVar.mo6156a();
        C7225s c7225s = this.f35505a;
        c7225s.f35483a++;
        deVar.mo6157a(a, this, ahVar);
        deVar.mo6162c(a);
        this.f35505a.mo6234a(0);
        c7225s = this.f35505a;
        c7225s.f35483a--;
        this.f35505a.mo6240d(m);
        return a;
    }

    private final Object m33741b(de deVar, ah ahVar) {
        int i = this.f35507c;
        this.f35507c = ((this.f35506b >>> 3) << 3) | 4;
        try {
            Object a = deVar.mo6156a();
            deVar.mo6157a(a, this, ahVar);
            deVar.mo6162c(a);
            if (this.f35506b == this.f35507c) {
                return a;
            }
            throw InvalidProtocolBufferException.m32672i();
        } finally {
            this.f35507c = i;
        }
    }

    public final C7203j mo6292n() {
        m33739a(2);
        return this.f35505a.mo6249l();
    }

    public final int mo6294o() {
        m33739a(0);
        return this.f35505a.mo6250m();
    }

    public final int mo6296p() {
        m33739a(0);
        return this.f35505a.mo6251n();
    }

    public final int mo6298q() {
        m33739a(5);
        return this.f35505a.mo6252o();
    }

    public final long mo6300r() {
        m33739a(1);
        return this.f35505a.mo6253p();
    }

    public final int mo6301s() {
        m33739a(0);
        return this.f35505a.mo6254q();
    }

    public final long mo6302t() {
        m33739a(0);
        return this.f35505a.mo6255r();
    }

    public final void mo6263a(List list) {
        int m;
        if (list instanceof ae) {
            ae aeVar = (ae) list;
            switch (this.f35506b & 7) {
                case 1:
                    break;
                case 2:
                    m = this.f35505a.mo6250m();
                    C7229w.m33742b(m);
                    m += this.f35505a.mo6260w();
                    do {
                        aeVar.m32873a(this.f35505a.mo6235b());
                    } while (this.f35505a.mo6260w() < m);
                    return;
                default:
                    throw InvalidProtocolBufferException.m32669f();
            }
            do {
                aeVar.m32873a(this.f35505a.mo6235b());
                if (!this.f35505a.mo6259v()) {
                    m = this.f35505a.mo6231a();
                } else {
                    return;
                }
            } while (m == this.f35506b);
            this.f35508d = m;
            return;
        }
        switch (this.f35506b & 7) {
            case 1:
                break;
            case 2:
                m = this.f35505a.mo6250m();
                C7229w.m33742b(m);
                m += this.f35505a.mo6260w();
                do {
                    list.add(Double.valueOf(this.f35505a.mo6235b()));
                } while (this.f35505a.mo6260w() < m);
                return;
            default:
                throw InvalidProtocolBufferException.m32669f();
        }
        do {
            list.add(Double.valueOf(this.f35505a.mo6235b()));
            if (!this.f35505a.mo6259v()) {
                m = this.f35505a.mo6231a();
            } else {
                return;
            }
        } while (m == this.f35506b);
        this.f35508d = m;
    }

    public final void mo6268b(List list) {
        int m;
        if (list instanceof aq) {
            aq aqVar = (aq) list;
            switch (this.f35506b & 7) {
                case 2:
                    m = this.f35505a.mo6250m();
                    C7229w.m33743c(m);
                    m += this.f35505a.mo6260w();
                    do {
                        aqVar.m32930a(this.f35505a.mo6237c());
                    } while (this.f35505a.mo6260w() < m);
                    return;
                case 5:
                    break;
                default:
                    throw InvalidProtocolBufferException.m32669f();
            }
            do {
                aqVar.m32930a(this.f35505a.mo6237c());
                if (!this.f35505a.mo6259v()) {
                    m = this.f35505a.mo6231a();
                } else {
                    return;
                }
            } while (m == this.f35506b);
            this.f35508d = m;
            return;
        }
        switch (this.f35506b & 7) {
            case 2:
                m = this.f35505a.mo6250m();
                C7229w.m33743c(m);
                m += this.f35505a.mo6260w();
                do {
                    list.add(Float.valueOf(this.f35505a.mo6237c()));
                } while (this.f35505a.mo6260w() < m);
                return;
            case 5:
                break;
            default:
                throw InvalidProtocolBufferException.m32669f();
        }
        do {
            list.add(Float.valueOf(this.f35505a.mo6237c()));
            if (!this.f35505a.mo6259v()) {
                m = this.f35505a.mo6231a();
            } else {
                return;
            }
        } while (m == this.f35506b);
        this.f35508d = m;
    }

    public final void mo6270c(List list) {
        int m;
        if (list instanceof bs) {
            bs bsVar = (bs) list;
            switch (this.f35506b & 7) {
                case 0:
                    break;
                case 2:
                    m = this.f35505a.mo6250m() + this.f35505a.mo6260w();
                    do {
                        bsVar.m33033a(this.f35505a.mo6239d());
                    } while (this.f35505a.mo6260w() < m);
                    return;
                default:
                    throw InvalidProtocolBufferException.m32669f();
            }
            do {
                bsVar.m33033a(this.f35505a.mo6239d());
                if (!this.f35505a.mo6259v()) {
                    m = this.f35505a.mo6231a();
                } else {
                    return;
                }
            } while (m == this.f35506b);
            this.f35508d = m;
            return;
        }
        switch (this.f35506b & 7) {
            case 0:
                break;
            case 2:
                m = this.f35505a.mo6250m() + this.f35505a.mo6260w();
                do {
                    list.add(Long.valueOf(this.f35505a.mo6239d()));
                } while (this.f35505a.mo6260w() < m);
                return;
            default:
                throw InvalidProtocolBufferException.m32669f();
        }
        do {
            list.add(Long.valueOf(this.f35505a.mo6239d()));
            if (!this.f35505a.mo6259v()) {
                m = this.f35505a.mo6231a();
            } else {
                return;
            }
        } while (m == this.f35506b);
        this.f35508d = m;
    }

    public final void mo6273d(List list) {
        int m;
        if (list instanceof bs) {
            bs bsVar = (bs) list;
            switch (this.f35506b & 7) {
                case 0:
                    break;
                case 2:
                    m = this.f35505a.mo6250m() + this.f35505a.mo6260w();
                    do {
                        bsVar.m33033a(this.f35505a.mo6241e());
                    } while (this.f35505a.mo6260w() < m);
                    return;
                default:
                    throw InvalidProtocolBufferException.m32669f();
            }
            do {
                bsVar.m33033a(this.f35505a.mo6241e());
                if (!this.f35505a.mo6259v()) {
                    m = this.f35505a.mo6231a();
                } else {
                    return;
                }
            } while (m == this.f35506b);
            this.f35508d = m;
            return;
        }
        switch (this.f35506b & 7) {
            case 0:
                break;
            case 2:
                m = this.f35505a.mo6250m() + this.f35505a.mo6260w();
                do {
                    list.add(Long.valueOf(this.f35505a.mo6241e()));
                } while (this.f35505a.mo6260w() < m);
                return;
            default:
                throw InvalidProtocolBufferException.m32669f();
        }
        do {
            list.add(Long.valueOf(this.f35505a.mo6241e()));
            if (!this.f35505a.mo6259v()) {
                m = this.f35505a.mo6231a();
            } else {
                return;
            }
        } while (m == this.f35506b);
        this.f35508d = m;
    }

    public final void mo6275e(List list) {
        int m;
        if (list instanceof ba) {
            ba baVar = (ba) list;
            switch (this.f35506b & 7) {
                case 0:
                    break;
                case 2:
                    m = this.f35505a.mo6250m() + this.f35505a.mo6260w();
                    do {
                        baVar.mo6132d(this.f35505a.mo6243f());
                    } while (this.f35505a.mo6260w() < m);
                    return;
                default:
                    throw InvalidProtocolBufferException.m32669f();
            }
            do {
                baVar.mo6132d(this.f35505a.mo6243f());
                if (!this.f35505a.mo6259v()) {
                    m = this.f35505a.mo6231a();
                } else {
                    return;
                }
            } while (m == this.f35506b);
            this.f35508d = m;
            return;
        }
        switch (this.f35506b & 7) {
            case 0:
                break;
            case 2:
                m = this.f35505a.mo6250m() + this.f35505a.mo6260w();
                do {
                    list.add(Integer.valueOf(this.f35505a.mo6243f()));
                } while (this.f35505a.mo6260w() < m);
                return;
            default:
                throw InvalidProtocolBufferException.m32669f();
        }
        do {
            list.add(Integer.valueOf(this.f35505a.mo6243f()));
            if (!this.f35505a.mo6259v()) {
                m = this.f35505a.mo6231a();
            } else {
                return;
            }
        } while (m == this.f35506b);
        this.f35508d = m;
    }

    public final void mo6277f(List list) {
        int m;
        if (list instanceof bs) {
            bs bsVar = (bs) list;
            switch (this.f35506b & 7) {
                case 1:
                    break;
                case 2:
                    m = this.f35505a.mo6250m();
                    C7229w.m33742b(m);
                    m += this.f35505a.mo6260w();
                    do {
                        bsVar.m33033a(this.f35505a.mo6244g());
                    } while (this.f35505a.mo6260w() < m);
                    return;
                default:
                    throw InvalidProtocolBufferException.m32669f();
            }
            do {
                bsVar.m33033a(this.f35505a.mo6244g());
                if (!this.f35505a.mo6259v()) {
                    m = this.f35505a.mo6231a();
                } else {
                    return;
                }
            } while (m == this.f35506b);
            this.f35508d = m;
            return;
        }
        switch (this.f35506b & 7) {
            case 1:
                break;
            case 2:
                m = this.f35505a.mo6250m();
                C7229w.m33742b(m);
                m += this.f35505a.mo6260w();
                do {
                    list.add(Long.valueOf(this.f35505a.mo6244g()));
                } while (this.f35505a.mo6260w() < m);
                return;
            default:
                throw InvalidProtocolBufferException.m32669f();
        }
        do {
            list.add(Long.valueOf(this.f35505a.mo6244g()));
            if (!this.f35505a.mo6259v()) {
                m = this.f35505a.mo6231a();
            } else {
                return;
            }
        } while (m == this.f35506b);
        this.f35508d = m;
    }

    public final void mo6279g(List list) {
        int m;
        if (list instanceof ba) {
            ba baVar = (ba) list;
            switch (this.f35506b & 7) {
                case 2:
                    m = this.f35505a.mo6250m();
                    C7229w.m33743c(m);
                    m += this.f35505a.mo6260w();
                    do {
                        baVar.mo6132d(this.f35505a.mo6245h());
                    } while (this.f35505a.mo6260w() < m);
                    return;
                case 5:
                    break;
                default:
                    throw InvalidProtocolBufferException.m32669f();
            }
            do {
                baVar.mo6132d(this.f35505a.mo6245h());
                if (!this.f35505a.mo6259v()) {
                    m = this.f35505a.mo6231a();
                } else {
                    return;
                }
            } while (m == this.f35506b);
            this.f35508d = m;
            return;
        }
        switch (this.f35506b & 7) {
            case 2:
                m = this.f35505a.mo6250m();
                C7229w.m33743c(m);
                m += this.f35505a.mo6260w();
                do {
                    list.add(Integer.valueOf(this.f35505a.mo6245h()));
                } while (this.f35505a.mo6260w() < m);
                return;
            case 5:
                break;
            default:
                throw InvalidProtocolBufferException.m32669f();
        }
        do {
            list.add(Integer.valueOf(this.f35505a.mo6245h()));
            if (!this.f35505a.mo6259v()) {
                m = this.f35505a.mo6231a();
            } else {
                return;
            }
        } while (m == this.f35506b);
        this.f35508d = m;
    }

    public final void mo6281h(List list) {
        int m;
        if (list instanceof C7206h) {
            C7206h c7206h = (C7206h) list;
            switch (this.f35506b & 7) {
                case 0:
                    break;
                case 2:
                    m = this.f35505a.mo6250m() + this.f35505a.mo6260w();
                    do {
                        c7206h.m33466a(this.f35505a.mo6246i());
                    } while (this.f35505a.mo6260w() < m);
                    return;
                default:
                    throw InvalidProtocolBufferException.m32669f();
            }
            do {
                c7206h.m33466a(this.f35505a.mo6246i());
                if (!this.f35505a.mo6259v()) {
                    m = this.f35505a.mo6231a();
                } else {
                    return;
                }
            } while (m == this.f35506b);
            this.f35508d = m;
            return;
        }
        switch (this.f35506b & 7) {
            case 0:
                break;
            case 2:
                m = this.f35505a.mo6250m() + this.f35505a.mo6260w();
                do {
                    list.add(Boolean.valueOf(this.f35505a.mo6246i()));
                } while (this.f35505a.mo6260w() < m);
                return;
            default:
                throw InvalidProtocolBufferException.m32669f();
        }
        do {
            list.add(Boolean.valueOf(this.f35505a.mo6246i()));
            if (!this.f35505a.mo6259v()) {
                m = this.f35505a.mo6231a();
            } else {
                return;
            }
        } while (m == this.f35506b);
        this.f35508d = m;
    }

    public final void mo6283i(List list) {
        m33740a(list, false);
    }

    public final void mo6285j(List list) {
        m33740a(list, true);
    }

    private final void m33740a(List list, boolean z) {
        if ((this.f35506b & 7) != 2) {
            throw InvalidProtocolBufferException.m32669f();
        } else if (!(list instanceof bo) || z) {
            do {
                list.add(z ? mo6290m() : mo6288l());
                if (!this.f35505a.mo6259v()) {
                    r0 = this.f35505a.mo6231a();
                } else {
                    return;
                }
            } while (r0 == this.f35506b);
            this.f35508d = r0;
        } else {
            bo boVar = (bo) list;
            do {
                boVar.mo6135a(mo6292n());
                if (!this.f35505a.mo6259v()) {
                    r0 = this.f35505a.mo6231a();
                } else {
                    return;
                }
            } while (r0 == this.f35506b);
            this.f35508d = r0;
        }
    }

    public final void mo6264a(List list, Class cls, ah ahVar) {
        if ((this.f35506b & 7) != 2) {
            throw InvalidProtocolBufferException.m32669f();
        }
        int a;
        de a2 = cu.f35284a.m33133a(cls);
        int i = this.f35506b;
        do {
            list.add(m33737a(a2, ahVar));
            if (!this.f35505a.mo6259v() && this.f35508d == 0) {
                a = this.f35505a.mo6231a();
            } else {
                return;
            }
        } while (a == i);
        this.f35508d = a;
    }

    public final void mo6269b(List list, Class cls, ah ahVar) {
        if ((this.f35506b & 7) != 3) {
            throw InvalidProtocolBufferException.m32669f();
        }
        int a;
        de a2 = cu.f35284a.m33133a(cls);
        int i = this.f35506b;
        do {
            list.add(m33741b(a2, ahVar));
            if (!this.f35505a.mo6259v() && this.f35508d == 0) {
                a = this.f35505a.mo6231a();
            } else {
                return;
            }
        } while (a == i);
        this.f35508d = a;
    }

    public final void mo6286k(List list) {
        if ((this.f35506b & 7) != 2) {
            throw InvalidProtocolBufferException.m32669f();
        }
        int a;
        do {
            list.add(mo6292n());
            if (!this.f35505a.mo6259v()) {
                a = this.f35505a.mo6231a();
            } else {
                return;
            }
        } while (a == this.f35506b);
        this.f35508d = a;
    }

    public final void mo6289l(List list) {
        int m;
        if (list instanceof ba) {
            ba baVar = (ba) list;
            switch (this.f35506b & 7) {
                case 0:
                    break;
                case 2:
                    m = this.f35505a.mo6250m() + this.f35505a.mo6260w();
                    do {
                        baVar.mo6132d(this.f35505a.mo6250m());
                    } while (this.f35505a.mo6260w() < m);
                    return;
                default:
                    throw InvalidProtocolBufferException.m32669f();
            }
            do {
                baVar.mo6132d(this.f35505a.mo6250m());
                if (!this.f35505a.mo6259v()) {
                    m = this.f35505a.mo6231a();
                } else {
                    return;
                }
            } while (m == this.f35506b);
            this.f35508d = m;
            return;
        }
        switch (this.f35506b & 7) {
            case 0:
                break;
            case 2:
                m = this.f35505a.mo6250m() + this.f35505a.mo6260w();
                do {
                    list.add(Integer.valueOf(this.f35505a.mo6250m()));
                } while (this.f35505a.mo6260w() < m);
                return;
            default:
                throw InvalidProtocolBufferException.m32669f();
        }
        do {
            list.add(Integer.valueOf(this.f35505a.mo6250m()));
            if (!this.f35505a.mo6259v()) {
                m = this.f35505a.mo6231a();
            } else {
                return;
            }
        } while (m == this.f35506b);
        this.f35508d = m;
    }

    public final void mo6291m(List list) {
        int m;
        if (list instanceof ba) {
            ba baVar = (ba) list;
            switch (this.f35506b & 7) {
                case 0:
                    break;
                case 2:
                    m = this.f35505a.mo6250m() + this.f35505a.mo6260w();
                    do {
                        baVar.mo6132d(this.f35505a.mo6251n());
                    } while (this.f35505a.mo6260w() < m);
                    return;
                default:
                    throw InvalidProtocolBufferException.m32669f();
            }
            do {
                baVar.mo6132d(this.f35505a.mo6251n());
                if (!this.f35505a.mo6259v()) {
                    m = this.f35505a.mo6231a();
                } else {
                    return;
                }
            } while (m == this.f35506b);
            this.f35508d = m;
            return;
        }
        switch (this.f35506b & 7) {
            case 0:
                break;
            case 2:
                m = this.f35505a.mo6250m() + this.f35505a.mo6260w();
                do {
                    list.add(Integer.valueOf(this.f35505a.mo6251n()));
                } while (this.f35505a.mo6260w() < m);
                return;
            default:
                throw InvalidProtocolBufferException.m32669f();
        }
        do {
            list.add(Integer.valueOf(this.f35505a.mo6251n()));
            if (!this.f35505a.mo6259v()) {
                m = this.f35505a.mo6231a();
            } else {
                return;
            }
        } while (m == this.f35506b);
        this.f35508d = m;
    }

    public final void mo6293n(List list) {
        int m;
        if (list instanceof ba) {
            ba baVar = (ba) list;
            switch (this.f35506b & 7) {
                case 2:
                    m = this.f35505a.mo6250m();
                    C7229w.m33743c(m);
                    m += this.f35505a.mo6260w();
                    do {
                        baVar.mo6132d(this.f35505a.mo6252o());
                    } while (this.f35505a.mo6260w() < m);
                    return;
                case 5:
                    break;
                default:
                    throw InvalidProtocolBufferException.m32669f();
            }
            do {
                baVar.mo6132d(this.f35505a.mo6252o());
                if (!this.f35505a.mo6259v()) {
                    m = this.f35505a.mo6231a();
                } else {
                    return;
                }
            } while (m == this.f35506b);
            this.f35508d = m;
            return;
        }
        switch (this.f35506b & 7) {
            case 2:
                m = this.f35505a.mo6250m();
                C7229w.m33743c(m);
                m += this.f35505a.mo6260w();
                do {
                    list.add(Integer.valueOf(this.f35505a.mo6252o()));
                } while (this.f35505a.mo6260w() < m);
                return;
            case 5:
                break;
            default:
                throw InvalidProtocolBufferException.m32669f();
        }
        do {
            list.add(Integer.valueOf(this.f35505a.mo6252o()));
            if (!this.f35505a.mo6259v()) {
                m = this.f35505a.mo6231a();
            } else {
                return;
            }
        } while (m == this.f35506b);
        this.f35508d = m;
    }

    public final void mo6295o(List list) {
        int m;
        if (list instanceof bs) {
            bs bsVar = (bs) list;
            switch (this.f35506b & 7) {
                case 1:
                    break;
                case 2:
                    m = this.f35505a.mo6250m();
                    C7229w.m33742b(m);
                    m += this.f35505a.mo6260w();
                    do {
                        bsVar.m33033a(this.f35505a.mo6253p());
                    } while (this.f35505a.mo6260w() < m);
                    return;
                default:
                    throw InvalidProtocolBufferException.m32669f();
            }
            do {
                bsVar.m33033a(this.f35505a.mo6253p());
                if (!this.f35505a.mo6259v()) {
                    m = this.f35505a.mo6231a();
                } else {
                    return;
                }
            } while (m == this.f35506b);
            this.f35508d = m;
            return;
        }
        switch (this.f35506b & 7) {
            case 1:
                break;
            case 2:
                m = this.f35505a.mo6250m();
                C7229w.m33742b(m);
                m += this.f35505a.mo6260w();
                do {
                    list.add(Long.valueOf(this.f35505a.mo6253p()));
                } while (this.f35505a.mo6260w() < m);
                return;
            default:
                throw InvalidProtocolBufferException.m32669f();
        }
        do {
            list.add(Long.valueOf(this.f35505a.mo6253p()));
            if (!this.f35505a.mo6259v()) {
                m = this.f35505a.mo6231a();
            } else {
                return;
            }
        } while (m == this.f35506b);
        this.f35508d = m;
    }

    public final void mo6297p(List list) {
        int m;
        if (list instanceof ba) {
            ba baVar = (ba) list;
            switch (this.f35506b & 7) {
                case 0:
                    break;
                case 2:
                    m = this.f35505a.mo6250m() + this.f35505a.mo6260w();
                    do {
                        baVar.mo6132d(this.f35505a.mo6254q());
                    } while (this.f35505a.mo6260w() < m);
                    return;
                default:
                    throw InvalidProtocolBufferException.m32669f();
            }
            do {
                baVar.mo6132d(this.f35505a.mo6254q());
                if (!this.f35505a.mo6259v()) {
                    m = this.f35505a.mo6231a();
                } else {
                    return;
                }
            } while (m == this.f35506b);
            this.f35508d = m;
            return;
        }
        switch (this.f35506b & 7) {
            case 0:
                break;
            case 2:
                m = this.f35505a.mo6250m() + this.f35505a.mo6260w();
                do {
                    list.add(Integer.valueOf(this.f35505a.mo6254q()));
                } while (this.f35505a.mo6260w() < m);
                return;
            default:
                throw InvalidProtocolBufferException.m32669f();
        }
        do {
            list.add(Integer.valueOf(this.f35505a.mo6254q()));
            if (!this.f35505a.mo6259v()) {
                m = this.f35505a.mo6231a();
            } else {
                return;
            }
        } while (m == this.f35506b);
        this.f35508d = m;
    }

    public final void mo6299q(List list) {
        int m;
        if (list instanceof bs) {
            bs bsVar = (bs) list;
            switch (this.f35506b & 7) {
                case 0:
                    break;
                case 2:
                    m = this.f35505a.mo6250m() + this.f35505a.mo6260w();
                    do {
                        bsVar.m33033a(this.f35505a.mo6255r());
                    } while (this.f35505a.mo6260w() < m);
                    return;
                default:
                    throw InvalidProtocolBufferException.m32669f();
            }
            do {
                bsVar.m33033a(this.f35505a.mo6255r());
                if (!this.f35505a.mo6259v()) {
                    m = this.f35505a.mo6231a();
                } else {
                    return;
                }
            } while (m == this.f35506b);
            this.f35508d = m;
            return;
        }
        switch (this.f35506b & 7) {
            case 0:
                break;
            case 2:
                m = this.f35505a.mo6250m() + this.f35505a.mo6260w();
                do {
                    list.add(Long.valueOf(this.f35505a.mo6255r()));
                } while (this.f35505a.mo6260w() < m);
                return;
            default:
                throw InvalidProtocolBufferException.m32669f();
        }
        do {
            list.add(Long.valueOf(this.f35505a.mo6255r()));
            if (!this.f35505a.mo6259v()) {
                m = this.f35505a.mo6231a();
            } else {
                return;
            }
        } while (m == this.f35506b);
        this.f35508d = m;
    }

    private static void m33742b(int i) {
        if ((i & 7) != 0) {
            throw InvalidProtocolBufferException.m32672i();
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo6265a(java.util.Map r7, com.google.protobuf.by r8, com.google.protobuf.ah r9) {
        /*
        r6 = this;
        r0 = 2;
        r6.m33739a(r0);
        r0 = r6.f35505a;
        r0 = r0.mo6250m();
        r1 = r6.f35505a;
        r2 = r1.mo6238c(r0);
        r1 = r8.f35245b;
        r0 = r8.f35247d;
    L_0x0014:
        r3 = r6.mo6261a();	 Catch:{ all -> 0x0045 }
        r4 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        if (r3 == r4) goto L_0x0062;
    L_0x001d:
        r4 = r6.f35505a;	 Catch:{ all -> 0x0045 }
        r4 = r4.mo6259v();	 Catch:{ all -> 0x0045 }
        if (r4 != 0) goto L_0x0062;
    L_0x0025:
        switch(r3) {
            case 1: goto L_0x004c;
            case 2: goto L_0x0055;
            default: goto L_0x0028;
        };
    L_0x0028:
        r3 = r6.mo6271c();	 Catch:{ InvalidWireTypeException -> 0x0036 }
        if (r3 != 0) goto L_0x0014;
    L_0x002e:
        r3 = new com.google.protobuf.InvalidProtocolBufferException;	 Catch:{ InvalidWireTypeException -> 0x0036 }
        r4 = "Unable to parse map entry.";
        r3.<init>(r4);	 Catch:{ InvalidWireTypeException -> 0x0036 }
        throw r3;	 Catch:{ InvalidWireTypeException -> 0x0036 }
    L_0x0036:
        r3 = move-exception;
        r3 = r6.mo6271c();	 Catch:{ all -> 0x0045 }
        if (r3 != 0) goto L_0x0014;
    L_0x003d:
        r0 = new com.google.protobuf.InvalidProtocolBufferException;	 Catch:{ all -> 0x0045 }
        r1 = "Unable to parse map entry.";
        r0.<init>(r1);	 Catch:{ all -> 0x0045 }
        throw r0;	 Catch:{ all -> 0x0045 }
    L_0x0045:
        r0 = move-exception;
        r1 = r6.f35505a;
        r1.mo6240d(r2);
        throw r0;
    L_0x004c:
        r3 = r8.f35244a;	 Catch:{ InvalidWireTypeException -> 0x0036 }
        r4 = 0;
        r5 = 0;
        r1 = r6.m33738a(r3, r4, r5);	 Catch:{ InvalidWireTypeException -> 0x0036 }
        goto L_0x0014;
    L_0x0055:
        r3 = r8.f35246c;	 Catch:{ InvalidWireTypeException -> 0x0036 }
        r4 = r8.f35247d;	 Catch:{ InvalidWireTypeException -> 0x0036 }
        r4 = r4.getClass();	 Catch:{ InvalidWireTypeException -> 0x0036 }
        r0 = r6.m33738a(r3, r4, r9);	 Catch:{ InvalidWireTypeException -> 0x0036 }
        goto L_0x0014;
    L_0x0062:
        r7.put(r1, r0);	 Catch:{ all -> 0x0045 }
        r0 = r6.f35505a;
        r0.mo6240d(r2);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.w.a(java.util.Map, com.google.protobuf.by, com.google.protobuf.ah):void");
    }

    private final Object m33738a(ek ekVar, Class cls, ah ahVar) {
        switch (ekVar.ordinal()) {
            case 0:
                return Double.valueOf(mo6272d());
            case 1:
                return Float.valueOf(mo6274e());
            case 2:
                return Long.valueOf(mo6278g());
            case 3:
                return Long.valueOf(mo6276f());
            case 4:
                return Integer.valueOf(mo6280h());
            case 5:
                return Long.valueOf(mo6282i());
            case 6:
                return Integer.valueOf(mo6284j());
            case 7:
                return Boolean.valueOf(mo6287k());
            case 8:
                return mo6290m();
            case 10:
                return mo6262a(cls, ahVar);
            case 11:
                return mo6292n();
            case 12:
                return Integer.valueOf(mo6294o());
            case 13:
                return Integer.valueOf(mo6296p());
            case 14:
                return Integer.valueOf(mo6298q());
            case 15:
                return Long.valueOf(mo6300r());
            case 16:
                return Integer.valueOf(mo6301s());
            case 17:
                return Long.valueOf(mo6302t());
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    private static void m33743c(int i) {
        if ((i & 3) != 0) {
            throw InvalidProtocolBufferException.m32672i();
        }
    }
}
