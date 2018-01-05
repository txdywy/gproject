package com.google.android.finsky.notification.impl;

import android.net.Uri;
import android.os.Bundle;
import com.google.android.finsky.cd.C2258a;
import com.google.android.finsky.cd.C2259b;
import com.google.android.finsky.cd.C2260c;
import com.google.android.finsky.cd.C2261d;
import com.google.android.finsky.cd.C2262e;
import com.google.android.finsky.cd.C2264g;
import com.google.android.finsky.cv.p177a.bd;
import com.google.android.finsky.notification.C3778a;
import com.google.android.finsky.notification.C3781e;
import com.google.android.finsky.notification.C3782f;
import com.google.android.finsky.notification.C3816o;
import com.google.android.finsky.notification.C3820u;
import com.google.android.finsky.notification.C3821v;
import com.google.android.finsky.utils.FinskyLog;
import com.google.protobuf.nano.l;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

final class as {
    as() {
    }

    static C3781e m18108a(C2259b c2259b) {
        int i;
        Object obj = 1;
        C3782f a = C3781e.m18030a(c2259b.f11206b, c2259b.f11210f, c2259b.f11211g, c2259b.f11212h);
        C3782f a2 = a.m18033a(c2259b.f11208d);
        if (c2259b.f11209e == 1) {
            i = 0;
        } else {
            i = 1;
        }
        a2.m18032a(i);
        if (c2259b.am_()) {
            a.m18037a(c2259b.f11207c);
        }
        if (c2259b.f11213i != null) {
            Object obj2;
            C3816o a3;
            C2261d c2261d = c2259b.f11213i;
            if (c2261d.f11229a == 0) {
                obj2 = 1;
            } else {
                obj2 = null;
            }
            if (obj2 != null) {
                if (c2261d.f11229a == 0) {
                    i = c2261d.f11230b;
                } else {
                    i = 0;
                }
                a3 = C3816o.m18254a(i);
            } else if (c2261d.f11229a == 1) {
                bd bdVar;
                if (c2261d.f11229a == 1) {
                    bdVar = c2261d.f11231c;
                } else {
                    bdVar = null;
                }
                a3 = C3816o.m18255a(bdVar);
            } else {
                String str;
                if (c2261d.f11229a == 2) {
                    str = c2261d.f11232d;
                } else {
                    str = "";
                }
                a3 = C3816o.m18256a(str);
            }
            a.m18035a(a3);
        }
        if (c2259b.f11214j != null) {
            a.m18036a(m18109a(c2259b.f11214j));
        }
        if (c2259b.f11215k != null) {
            a.m18041b(m18109a(c2259b.f11215k));
        }
        if (c2259b.f11216l != null) {
            a.m18034a(m18107a(c2259b.f11216l));
        }
        if (c2259b.f11217m != null) {
            a.m18040b(m18107a(c2259b.f11217m));
        }
        if (((c2259b.f11205a & 128) != 0 ? 1 : null) != null) {
            a.m18039b(c2259b.f11218n);
        }
        if ((c2259b.f11205a & 256) == 0) {
            obj = null;
        }
        if (obj != null) {
            a.m18038a(c2259b.f11219o);
        }
        return a.m18031a();
    }

    static C2258a m18105a(C3778a c3778a) {
        C2258a c2258a = new C2258a();
        String str = c3778a.f18984a;
        if (str == null) {
            throw new NullPointerException();
        }
        c2258a.f11201a |= 1;
        c2258a.f11202b = str;
        int i = c3778a.f18985b;
        c2258a.f11201a |= 2;
        c2258a.f11203c = i;
        c2258a.f11204d = m18106a(c3778a.f18986c);
        return c2258a;
    }

    private static C3778a m18107a(C2258a c2258a) {
        return new C3778a(c2258a.f11202b, c2258a.f11203c, m18109a(c2258a.f11204d));
    }

    static C2262e m18106a(C3820u c3820u) {
        C2262e c2262e = new C2262e();
        String str = c3820u.f19148a;
        if (str == null) {
            throw new NullPointerException();
        }
        c2262e.f11233a |= 1;
        c2262e.f11234b = str;
        if (c3820u.f19150c != null) {
            str = c3820u.f19150c.toString();
            if (str == null) {
                throw new NullPointerException();
            }
            c2262e.f11233a |= 2;
            c2262e.f11235c = str;
        }
        Bundle bundle = c3820u.f19149b;
        List arrayList = new ArrayList();
        for (String str2 : bundle.keySet()) {
            C2260c c2260c = new C2260c();
            if (str2 != null) {
                c2260c.f11222c |= 1;
                c2260c.f11223d = str2;
                switch (c3820u.m18264a(str2)) {
                    case 0:
                        str2 = bundle.getString(str2);
                        if (str2 != null) {
                            c2260c.f11221a = -1;
                            c2260c.f11221a = 0;
                            c2260c.f11224e = str2;
                            arrayList.add(c2260c);
                            break;
                        }
                        throw new NullPointerException();
                    case 1:
                        byte[] byteArray = bundle.getByteArray(str2);
                        if (byteArray != null) {
                            c2260c.f11221a = -1;
                            c2260c.f11221a = 1;
                            c2260c.f11225f = byteArray;
                            arrayList.add(c2260c);
                            break;
                        }
                        throw new NullPointerException();
                    case 2:
                        long j = bundle.getLong(str2);
                        c2260c.f11221a = -1;
                        c2260c.f11221a = 2;
                        c2260c.f11226g = j;
                        arrayList.add(c2260c);
                        break;
                    case 3:
                        boolean z = bundle.getBoolean(str2);
                        c2260c.f11221a = -1;
                        c2260c.f11221a = 3;
                        c2260c.f11227h = z;
                        arrayList.add(c2260c);
                        break;
                    case 4:
                        C2264g c2264g = new C2264g();
                        c2264g.f11244a = (String[]) bundle.getStringArrayList(str2).toArray(new String[bundle.getStringArrayList(str2).size()]);
                        c2260c.f11221a = -1;
                        c2260c.f11221a = 4;
                        c2260c.f11228i = c2264g;
                        arrayList.add(c2260c);
                        break;
                    default:
                        FinskyLog.m21669e("Unknown ExtraType: " + c3820u.m18264a(str2), new Object[0]);
                        break;
                }
            }
            throw new NullPointerException();
        }
        c2262e.f11236d = (C2260c[]) arrayList.toArray(new C2260c[arrayList.size()]);
        return c2262e;
    }

    private static C3820u m18109a(C2262e c2262e) {
        C3821v b = C3820u.m18263b(c2262e.f11234b);
        if (((c2262e.f11233a & 2) != 0 ? 1 : null) != null) {
            b.f19155d = Uri.parse(c2262e.f11235c);
        }
        for (C2260c c2260c : c2262e.f11236d) {
            String str;
            if (c2260c.f11221a == 3) {
                boolean z;
                str = c2260c.f11223d;
                if (c2260c.f11221a == 3) {
                    z = c2260c.f11227h;
                } else {
                    z = false;
                }
                b.m18269a(str, z);
            } else {
                String str2;
                if ((c2260c.f11221a == 0 ? 1 : null) != null) {
                    str = c2260c.f11223d;
                    if (c2260c.f11221a == 0) {
                        str2 = c2260c.f11224e;
                    } else {
                        str2 = "";
                    }
                    b.m18267a(str, str2);
                } else if (c2260c.f11221a == 1) {
                    byte[] bArr;
                    str = c2260c.f11223d;
                    if (c2260c.f11221a == 1) {
                        bArr = c2260c.f11225f;
                    } else {
                        bArr = l.l;
                    }
                    b.m18270a(str, bArr);
                } else if (c2260c.f11221a == 2) {
                    long j;
                    str2 = c2260c.f11223d;
                    if (c2260c.f11221a == 2) {
                        j = c2260c.f11226g;
                    } else {
                        j = 0;
                    }
                    b.m18266a(str2, j);
                } else if (c2260c.f11221a == 4) {
                    C2264g c2264g;
                    str = c2260c.f11223d;
                    if (c2260c.f11221a == 4) {
                        c2264g = c2260c.f11228i;
                    } else {
                        c2264g = null;
                    }
                    b.m18268a(str, new ArrayList(Arrays.asList(c2264g.f11244a)));
                }
            }
        }
        return b.m18265a();
    }
}
