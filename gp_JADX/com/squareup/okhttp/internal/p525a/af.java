package com.squareup.okhttp.internal.p525a;

import com.squareup.haha.perflib.HprofParser;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import p526e.C7725i;
import p526e.C7728j;

final class af implements C7610b {
    public final C7725i f39408a;
    public final ad f39409b = new ad(this.f39408a);
    public final boolean f39410c;
    public final aa f39411d = new aa(this.f39409b);

    af(C7725i c7725i, boolean z) {
        this.f39408a = c7725i;
        this.f39410c = z;
    }

    public final void mo6426a() {
        if (!this.f39410c) {
            C7728j c = this.f39408a.mo6490c((long) ac.f39398b.mo6522e());
            if (ac.f39397a.isLoggable(Level.FINE)) {
                ac.f39397a.fine(String.format("<< CONNECTION %s", new Object[]{c.mo6520c()}));
            }
            if (!ac.f39398b.equals(c)) {
                throw ac.m36701b("Expected a connection header but was %s", c.mo6515a());
            }
        }
    }

    public final boolean mo6427a(C7613c c7613c) {
        boolean z = false;
        try {
            this.f39408a.mo6485a(9);
            int a = ac.m36698a(this.f39408a);
            if (a < 0 || a > 16384) {
                throw ac.m36701b("FRAME_SIZE_ERROR: %s", Integer.valueOf(a));
            }
            byte f = (byte) (this.f39408a.mo6496f() & HprofParser.ROOT_UNKNOWN);
            byte f2 = (byte) (this.f39408a.mo6496f() & HprofParser.ROOT_UNKNOWN);
            int h = this.f39408a.mo6500h() & Integer.MAX_VALUE;
            if (ac.f39397a.isLoggable(Level.FINE)) {
                ac.f39397a.fine(ae.m36708a(true, h, a, f, f2));
            }
            boolean z2;
            short f3;
            int g;
            switch (f) {
                case (byte) 0:
                    boolean z3 = (f2 & 1) != 0;
                    if ((f2 & 32) != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        throw ac.m36701b("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
                    }
                    if ((f2 & 8) != 0) {
                        f3 = (short) (this.f39408a.mo6496f() & HprofParser.ROOT_UNKNOWN);
                    }
                    c7613c.mo6450a(z3, h, this.f39408a, ac.m36697a(a, f2, f3));
                    this.f39408a.mo6497f((long) f3);
                    return true;
                case (byte) 1:
                    if (h == 0) {
                        throw ac.m36701b("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
                    }
                    short f4;
                    z2 = (f2 & 1) != 0;
                    if ((f2 & 8) != 0) {
                        f4 = (short) (this.f39408a.mo6496f() & HprofParser.ROOT_UNKNOWN);
                    } else {
                        f4 = (short) 0;
                    }
                    if ((f2 & 32) != 0) {
                        m36712b(c7613c);
                        a -= 5;
                    }
                    c7613c.mo6452a(false, z2, h, m36711a(ac.m36697a(a, f2, f4), f4, f2, h), C7637y.HTTP_20_HEADERS);
                    return true;
                case (byte) 2:
                    if (a != 5) {
                        throw ac.m36701b("TYPE_PRIORITY length: %d != 5", Integer.valueOf(a));
                    } else if (h == 0) {
                        throw ac.m36701b("TYPE_PRIORITY streamId == 0", new Object[0]);
                    } else {
                        m36712b(c7613c);
                        return true;
                    }
                case (byte) 3:
                    if (a != 4) {
                        throw ac.m36701b("TYPE_RST_STREAM length: %d != 4", Integer.valueOf(a));
                    } else if (h == 0) {
                        throw ac.m36701b("TYPE_RST_STREAM streamId == 0", new Object[0]);
                    } else {
                        C7609a b = C7609a.m36680b(this.f39408a.mo6500h());
                        if (b == null) {
                            throw ac.m36701b("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(a));
                        }
                        c7613c.mo6447a(h, b);
                        return true;
                    }
                case (byte) 4:
                    if (h != 0) {
                        throw ac.m36701b("TYPE_SETTINGS streamId != 0", new Object[0]);
                    } else if ((f2 & 1) != 0) {
                        if (a == 0) {
                            return true;
                        }
                        throw ac.m36701b("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
                    } else if (a % 6 != 0) {
                        throw ac.m36701b("TYPE_SETTINGS length %% 6 != 0: %s", Integer.valueOf(a));
                    } else {
                        ap apVar = new ap();
                        for (h = 0; h < a; h += 6) {
                            g = this.f39408a.mo6499g();
                            int h2 = this.f39408a.mo6500h();
                            switch (g) {
                                case 1:
                                case 6:
                                    break;
                                case 2:
                                    if (!(h2 == 0 || h2 == 1)) {
                                        throw ac.m36701b("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                                    }
                                case 3:
                                    g = 4;
                                    break;
                                case 4:
                                    g = 7;
                                    if (h2 >= 0) {
                                        break;
                                    }
                                    throw ac.m36701b("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                                case 5:
                                    if (h2 >= 16384 && h2 <= 16777215) {
                                        break;
                                    }
                                    throw ac.m36701b("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", Integer.valueOf(h2));
                                default:
                                    throw ac.m36701b("PROTOCOL_ERROR invalid settings id: %s", Short.valueOf(g));
                            }
                            apVar.m36754a(g, 0, h2);
                        }
                        c7613c.mo6451a(false, apVar);
                        if (apVar.m36753a() < 0) {
                            return true;
                        }
                        aa aaVar = this.f39411d;
                        int a2 = apVar.m36753a();
                        aaVar.f39390c = a2;
                        aaVar.f39391d = a2;
                        aaVar.m36688a();
                        return true;
                    }
                case (byte) 5:
                    if (h == 0) {
                        throw ac.m36701b("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
                    }
                    if ((f2 & 8) != 0) {
                        f3 = (short) (this.f39408a.mo6496f() & HprofParser.ROOT_UNKNOWN);
                    }
                    g = this.f39408a.mo6500h() & Integer.MAX_VALUE;
                    m36711a(ac.m36697a(a - 4, f2, f3), f3, f2, h);
                    c7613c.mo6445a(g);
                    return true;
                case (byte) 6:
                    if (a != 8) {
                        throw ac.m36701b("TYPE_PING length != 8: %s", Integer.valueOf(a));
                    } else if (h != 0) {
                        throw ac.m36701b("TYPE_PING streamId != 0", new Object[0]);
                    } else {
                        a = this.f39408a.mo6500h();
                        g = this.f39408a.mo6500h();
                        if ((f2 & 1) != 0) {
                            z = true;
                        }
                        c7613c.mo6449a(z, a, g);
                        return true;
                    }
                case (byte) 7:
                    if (a < 8) {
                        throw ac.m36701b("TYPE_GOAWAY length < 8: %s", Integer.valueOf(a));
                    } else if (h != 0) {
                        throw ac.m36701b("TYPE_GOAWAY streamId != 0", new Object[0]);
                    } else {
                        g = this.f39408a.mo6500h();
                        int i = a - 8;
                        if (C7609a.m36680b(this.f39408a.mo6500h()) == null) {
                            throw ac.m36701b("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(this.f39408a.mo6500h()));
                        }
                        C7728j c7728j = C7728j.f40191b;
                        if (i > 0) {
                            c7728j = this.f39408a.mo6490c((long) i);
                        }
                        c7613c.mo6448a(g, c7728j);
                        return true;
                    }
                case (byte) 8:
                    if (a != 4) {
                        throw ac.m36701b("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(a));
                    }
                    long h3 = ((long) this.f39408a.mo6500h()) & 2147483647L;
                    if (h3 == 0) {
                        throw ac.m36701b("windowSizeIncrement was 0", Long.valueOf(h3));
                    }
                    c7613c.mo6446a(h, h3);
                    return true;
                default:
                    this.f39408a.mo6497f((long) a);
                    return true;
            }
        } catch (IOException e) {
            return false;
        }
    }

    private final List m36711a(int i, short s, byte b, int i2) {
        ad adVar = this.f39409b;
        this.f39409b.f39403e = i;
        adVar.f39400b = i;
        this.f39409b.f39404f = s;
        this.f39409b.f39401c = b;
        this.f39409b.f39402d = i2;
        aa aaVar = this.f39411d;
        while (!aaVar.f39389b.mo6492d()) {
            int f = aaVar.f39389b.mo6496f() & HprofParser.ROOT_UNKNOWN;
            if (f == 128) {
                throw new IOException("index == 0");
            } else if ((f & 128) == 128) {
                f = aaVar.m36687a(f, 127) - 1;
                if (aa.m36683c(f)) {
                    aaVar.f39388a.add(C7638z.f39553a[f]);
                } else {
                    int a = aaVar.m36686a(f - C7638z.f39553a.length);
                    if (a < 0 || a > aaVar.f39392e.length - 1) {
                        throw new IOException("Header index too large " + (f + 1));
                    }
                    aaVar.f39388a.add(aaVar.f39392e[a]);
                }
            } else if (f == 64) {
                aaVar.m36689a(new C7636x(C7638z.m36855a(aaVar.m36690b()), aaVar.m36690b()));
            } else if ((f & 64) == 64) {
                aaVar.m36689a(new C7636x(aaVar.m36691b(aaVar.m36687a(f, 63) - 1), aaVar.m36690b()));
            } else if ((f & 32) == 32) {
                aaVar.f39391d = aaVar.m36687a(f, 31);
                if (aaVar.f39391d < 0 || aaVar.f39391d > aaVar.f39390c) {
                    throw new IOException("Invalid dynamic table size update " + aaVar.f39391d);
                }
                aaVar.m36688a();
            } else if (f == 16 || f == 0) {
                aaVar.f39388a.add(new C7636x(C7638z.m36855a(aaVar.m36690b()), aaVar.m36690b()));
            } else {
                aaVar.f39388a.add(new C7636x(aaVar.m36691b(aaVar.m36687a(f, 15) - 1), aaVar.m36690b()));
            }
        }
        aaVar = this.f39411d;
        List arrayList = new ArrayList(aaVar.f39388a);
        aaVar.f39388a.clear();
        return arrayList;
    }

    private final void m36712b(C7613c c7613c) {
        this.f39408a.mo6500h();
        this.f39408a.mo6496f();
        c7613c.mo6453b();
    }

    public final void close() {
        this.f39408a.close();
    }
}
