package com.squareup.okhttp.internal.http;

import com.squareup.okhttp.C7599a;
import com.squareup.okhttp.C7680m;
import com.squareup.okhttp.an;
import com.squareup.okhttp.internal.C7600b;
import com.squareup.okhttp.internal.C7676j;
import com.squareup.okhttp.internal.k;
import com.squareup.okhttp.internal.p527b.C7641a;
import java.io.IOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Proxy.Type;
import java.util.concurrent.TimeUnit;

public final class ad {
    public final C7599a f39611a;
    public final C7680m f39612b;
    public ab f39613c;
    public C7641a f39614d;
    public boolean f39615e;
    public boolean f39616f;
    public C7654v f39617g;

    public ad(C7680m c7680m, C7599a c7599a) {
        this.f39612b = c7680m;
        this.f39611a = c7599a;
    }

    public final C7654v m36913a(int i, int i2, int i3, boolean z, boolean z2) {
        try {
            C7654v c7662m;
            C7641a b = m36910b(i, i2, i3, z, z2);
            if (b.f39564f != null) {
                c7662m = new C7662m(this, b.f39564f);
            } else {
                b.f39561c.setSoTimeout(i2);
                b.f39566h.mo6424a().mo6479a((long) i2, TimeUnit.MILLISECONDS);
                b.f39567i.mo6454a().mo6479a((long) i3, TimeUnit.MILLISECONDS);
                c7662m = new C7655f(this, b.f39566h, b.f39567i);
            }
            synchronized (this.f39612b) {
                b.f39565g++;
                this.f39617g = c7662m;
            }
            return c7662m;
        } catch (IOException e) {
            throw new RouteException(e);
        }
    }

    private final C7641a m36910b(int i, int i2, int i3, boolean z, boolean z2) {
        C7641a a;
        while (true) {
            a = m36909a(i, i2, i3, z);
            synchronized (this.f39612b) {
                if (a.f39565g != 0) {
                    if (a.m36862a(z2)) {
                        break;
                    }
                    m36917a(true, false, true);
                } else {
                    break;
                }
            }
        }
        return a;
    }

    private final C7641a m36909a(int i, int i2, int i3, boolean z) {
        C7641a c7641a;
        synchronized (this.f39612b) {
            if (this.f39615e) {
                throw new IllegalStateException("released");
            } else if (this.f39617g != null) {
                throw new IllegalStateException("stream != null");
            } else if (this.f39616f) {
                throw new IOException("Canceled");
            } else {
                c7641a = this.f39614d;
                if (c7641a == null || c7641a.f39569k) {
                    c7641a = C7600b.f39287b.mo6409a(this.f39612b, this.f39611a, this);
                    if (c7641a != null) {
                        this.f39614d = c7641a;
                    } else {
                        if (this.f39613c == null) {
                            this.f39613c = new ab(this.f39611a, m36911b());
                        }
                        c7641a = new C7641a(this.f39613c.m36907b());
                        m36914a(c7641a);
                        synchronized (this.f39612b) {
                            C7600b.f39287b.mo6415b(this.f39612b, c7641a);
                            this.f39614d = c7641a;
                            if (this.f39616f) {
                                throw new IOException("Canceled");
                            }
                        }
                        c7641a.m36861a(i, i2, i3, this.f39611a.f39275f, z);
                        m36911b().m36995b(c7641a.f39559a);
                    }
                }
            }
        }
        return c7641a;
    }

    public final void m36915a(C7654v c7654v) {
        synchronized (this.f39612b) {
            if (c7654v != null) {
                if (c7654v == this.f39617g) {
                }
            }
            throw new IllegalStateException("expected " + this.f39617g + " but was " + c7654v);
        }
        m36917a(false, false, true);
    }

    private final C7676j m36911b() {
        return C7600b.f39287b.mo6411a(this.f39612b);
    }

    public final synchronized C7641a m36912a() {
        return this.f39614d;
    }

    public final void m36917a(boolean z, boolean z2, boolean z3) {
        C7641a c7641a;
        synchronized (this.f39612b) {
            if (z3) {
                this.f39617g = null;
            }
            if (z2) {
                this.f39615e = true;
            }
            if (this.f39614d != null) {
                if (z) {
                    this.f39614d.f39569k = true;
                }
                if (this.f39617g == null && (this.f39615e || this.f39614d.f39569k)) {
                    C7641a c7641a2 = this.f39614d;
                    int size = c7641a2.f39568j.size();
                    int i = 0;
                    while (i < size) {
                        if (((Reference) c7641a2.f39568j.get(i)).get() == this) {
                            c7641a2.f39568j.remove(i);
                            if (this.f39614d.f39565g > 0) {
                                this.f39613c = null;
                            }
                            if (this.f39614d.f39568j.isEmpty()) {
                                this.f39614d.f39570l = System.nanoTime();
                                if (C7600b.f39287b.mo6414a(this.f39612b, this.f39614d)) {
                                    c7641a = this.f39614d;
                                    this.f39614d = null;
                                }
                            }
                            c7641a = null;
                            this.f39614d = null;
                        } else {
                            i++;
                        }
                    }
                    throw new IllegalStateException();
                }
            }
            c7641a = null;
        }
        if (c7641a != null) {
            k.a(c7641a.f39561c);
        }
    }

    public final void m36916a(IOException iOException) {
        synchronized (this.f39612b) {
            if (this.f39613c != null) {
                if (this.f39614d.f39565g == 0) {
                    an anVar = this.f39614d.f39559a;
                    ab abVar = this.f39613c;
                    if (!(anVar.f39326b.type() == Type.DIRECT || abVar.f39599a.f39276g == null)) {
                        abVar.f39599a.f39276g.connectFailed(abVar.f39599a.f39270a.m37039b(), anVar.f39326b.address(), iOException);
                    }
                    abVar.f39600b.m36994a(anVar);
                } else {
                    this.f39613c = null;
                }
            }
        }
        m36917a(true, false, true);
    }

    public final void m36914a(C7641a c7641a) {
        c7641a.f39568j.add(new WeakReference(this));
    }

    public final String toString() {
        return this.f39611a.toString();
    }
}
