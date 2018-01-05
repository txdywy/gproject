package com.google.android.finsky.cl;

import a.a;
import com.google.android.finsky.installqueue.TimeWindow;
import com.google.android.finsky.installqueue.d;
import com.google.android.finsky.installqueue.g;
import com.google.android.finsky.installqueue.j;
import com.google.android.finsky.installqueue.m;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.z.e;
import com.google.wireless.android.finsky.dfe.l.a.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public final class com.google.android.finsky.cl.b implements com.google.android.finsky.z.f
{

    public final com.google.wireless.android.finsky.dfe.l.a.a a;
    public final com.google.android.finsky.cl.a b;

    b(com.google.android.finsky.cl.a p0, com.google.wireless.android.finsky.dfe.l.a.a p1) {
        this.b = p0;
        this.a = p1;
    }

    public final void a(com.google.android.finsky.z.e p0) {
  5:    v0 = (List)p0.get();
 11:    if (v0.isEmpty())
 13:        return;
 54:    v6 = new com.google.android.finsky.installqueue.d().a(3);
 63:    v6.b = new TimeWindow(TimeUnit.SECONDS.toMillis(this.a.e), TimeUnit.SECONDS.toMillis(this.a.f));
 71:    v3 = new ArrayList();
 74:    v4 = v0.iterator();
 78:    while (v4.hasNext()) {
 98:        v0 = new InstallConstraint[2];
101:        v0[0] = new com.google.android.finsky.installqueue.d().a(2).e();
104:        v0[1] = v6.e();
114:        v3.add(new com.google.android.finsky.installqueue.j(((com.google.android.finsky.installqueue.m)v4.next()).d).a(v0).a());
        }
117:    goto 127;
118:    v0 = ex;
123:    FinskyLog.b(v0, "Unexpected exception", new Object[0]);
126:    return;
137:    ((com.google.android.finsky.installqueue.g)this.b.a.a()).a(v3);
140:    return;
141:    v0 = ex;
142:    goto 119;
143:    try
            run 127...140
        catch (InterruptedException ex) {
127:        goto 118;
        }
        catch (ExecutionException ex) {
127:        goto 141;
        }
144:    try
            run 1...117
        catch (InterruptedException ex) {
  1:        goto 118;
        }
        catch (ExecutionException ex) {
  1:        goto 141;
        }
    }

}
