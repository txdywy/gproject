package com.google.android.finsky.wear;

import android.os.Handler;
import android.os.Looper;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.gms.common.api.C5058o;
import com.google.android.gms.wearable.C5617e;
import com.google.android.gms.wearable.C5619g;
import com.google.android.gms.wearable.C5620h;
import com.google.android.gms.wearable.C5652n;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class C4784e {
    public static final byte[] f24968a = new byte[0];
    public boolean f24969b;
    public ArrayList f24970c;
    public Handler f24971d;
    public List f24972e;
    public Map f24973f;

    public final synchronized String[] m22521a() {
        if (!this.f24969b) {
            FinskyLog.m21669e("Should not be called before nodes are loaded", new Object[0]);
        }
        return (String[]) this.f24972e.toArray(new String[this.f24972e.size()]);
    }

    public final synchronized boolean m22520a(String str) {
        boolean z;
        if (!this.f24969b) {
            FinskyLog.m21669e("Should not be called before nodes are loaded", new Object[0]);
        }
        for (String equals : this.f24972e) {
            if (equals.equals(str)) {
                z = true;
                break;
            }
        }
        z = false;
        return z;
    }

    public final synchronized C4788i m22522b(String str) {
        if (!this.f24969b) {
            FinskyLog.m21669e("Should not be called before nodes are loaded", new Object[0]);
        }
        return (C4788i) this.f24973f.get(str);
    }

    public final synchronized boolean m22523b() {
        return this.f24969b;
    }

    public final synchronized void m22519a(C5058o c5058o, boolean z, Runnable runnable) {
        if (this.f24971d == null) {
            this.f24971d = new Handler(Looper.getMainLooper());
        }
        if (!this.f24969b || z) {
            if (this.f24970c == null) {
                this.f24970c = new ArrayList();
            }
            this.f24970c.add(runnable);
            if (this.f24970c.size() == 1) {
                C5652n.f28708a.mo5118b(c5058o, cl.f24958b).mo4490a(new C4785f(this, new ArrayList(), c5058o));
            }
        } else {
            this.f24971d.post(runnable);
        }
    }

    final synchronized void m22518a(C5058o c5058o, C5619g c5619g, List list) {
        this.f24972e = Collections.emptyList();
        this.f24973f = Collections.emptyMap();
        if (c5619g.f28574d.m23271a()) {
            int c = c5619g.mo4501c();
            for (int i = 0; i < c; i++) {
                C5617e c5617e = (C5617e) c5619g.mo4502a(i);
                String b = cl.m22517b(c5617e.mo5123b());
                C4788i c4788i = new C4788i(b, C5620h.m26634a(c5617e.mo5124c()));
                if (c4788i.f24980k < 80400050) {
                    FinskyLog.m21659a("Discard wear node %s because v=%d", b, Integer.valueOf(c4788i.f24980k));
                } else if (list.contains(b)) {
                    FinskyLog.m21659a("Discard wear node %s because inactive", b);
                } else if ("0".equals(c4788i.f24982m)) {
                    FinskyLog.m21659a("Discard wear node %s because androidId is 0", b);
                    C5652n.f28709b.mo5110a(c5058o, b, "get_device_configuration", f24968a).mo4490a(new C4787h());
                } else {
                    Object obj;
                    for (Object equals : c4788i.f24979j.f31740n) {
                        if ("android.hardware.type.watch".equals(equals)) {
                            obj = 1;
                            break;
                        }
                    }
                    obj = null;
                    if (obj == null) {
                        FinskyLog.m21659a("Discard wear node %s because not watch", b);
                    } else {
                        FinskyLog.m21659a("Found wear node %s", b);
                        if (this.f24972e.size() == 0) {
                            this.f24972e = new ArrayList();
                        }
                        this.f24972e.add(b);
                        if (this.f24973f.size() == 0) {
                            this.f24973f = new HashMap();
                        }
                        this.f24973f.put(b, c4788i);
                    }
                }
            }
        } else {
            FinskyLog.m21665c("Error %d getting data items. (%s)", Integer.valueOf(c5619g.f28574d.f25631g), c5619g.f28574d.f25632h);
        }
    }
}
