package com.google.android.finsky.bi;

import com.google.android.finsky.aa.a;
import com.google.android.finsky.aa.n;
import com.google.android.finsky.d.c;
import com.google.android.finsky.d.j;
import com.google.android.finsky.m;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.gms.c.a.a;
import com.google.android.gms.c.a.b;
import com.google.android.gms.c.a.c;
import com.google.android.gms.c.b;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.o;
import com.google.android.gms.common.api.w;
import com.google.android.gms.common.data.a;
import com.google.wireless.android.a.a.a.a.ah;
import com.google.wireless.android.a.a.a.a.ai;
import com.google.wireless.android.a.a.a.a.bo;
import java.util.ArrayList;
import java.util.List;

public final class com.google.android.finsky.bi.c implements com.google.android.gms.common.api.x
{

    public final com.google.android.finsky.bi.b a;

    c(com.google.android.finsky.bi.b p0) {
        this.a = p0;
    }

    public final void a(com.google.android.gms.common.api.w p0) {
  1:    v2 = 0;
 12:    if (!((com.google.android.gms.c.b)p0).b().a())
159:        return;
 18:    if (this.a.d != 0 && this.a.c != 0)
 30:        this.a.c.a();
 33:    v3 = ((com.google.android.gms.c.b)p0).c();
 43:    if (v3.c() == 0) {
156:        v3.a();
159:        return;
        }
 47:    if (this.a.e == 0) {
156:        v3.a();
159:        return;
        }
 51:    v5 = new ArrayList();
 70:    if (v2 >= v3.c()) {
138:        if (v5.isEmpty())
140:            v0 = 0;
            else {
160:            try {
162:                v0 = new com.google.wireless.android.a.a.a.a.ah();
171:                v0.a = new ai[v5.size()];
175:                v5.toArray(v0.a);
                }
                catch (Throwable ex) {
107:                v3.a();
110:                throw ex;
                }
            }
141:        if (v0 == 0)
153:            com.google.android.finsky.aa.a.k.a(Long.valueOf(System.currentTimeMillis()));
            else {
182:            v2 = new Object[1];
192:            v2[0] = Integer.valueOf(v0.a.length);
194:            FinskyLog.a("Logging %d device features.", v2);
200:            v1 = new com.google.android.finsky.d.c(4);
205:            v1.a.z = v0;
218:            com.google.android.finsky.m.a.a(this.a.e).a(v1.a, 0);
231:            com.google.android.finsky.aa.a.k.a(Long.valueOf(System.currentTimeMillis()));
236:            this.a.b.g();
            }
156:        v3.a();
159:        return;
        }
 76:    v0 = new com.google.android.gms.c.a.c(v3.a, v2);
 81:    v8 = ((com.google.android.gms.c.a.a)v0).b();
 87:    if (v8 < ((Long)com.google.android.finsky.aa.a.k.a()).longValue()) goto 130;
 91:    v10 = new com.google.wireless.android.a.a.a.a.ai();
 94:    v0 = ((com.google.android.gms.c.a.a)v0).a();
 98:    if (v0 == 0)
105:        throw new NullPointerException();
 99:    goto 111;
107:    v3.a();
110:    throw ex;
115:    v10.b = v10.b | 1;
117:    v10.c = v0;
123:    v10.b = v10.b | 2;
125:    v10.d = v8;
127:    v5.add(v10);
132:    v2 = v2 + 1;
133:    goto 66;
241:    try
            run 111...156
        catch (Throwable ex) {
111:        goto 106;
        }
242:    try
            run 37...106
        catch (Throwable ex) {
 37:        goto 106;
        }
    }

}
