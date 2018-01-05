package com.google.android.finsky.aj;

import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.bb;
import com.google.android.finsky.z.e;
import java.util.List;
import java.util.concurrent.ExecutionException;

public final class com.google.android.finsky.aj.c implements com.google.android.finsky.z.f
{

    public final String a;
    public final com.google.android.finsky.aj.a b;

    c(com.google.android.finsky.aj.a p0, String p1) {
        this.b = p0;
        this.a = p1;
    }

    public final void a(com.google.android.finsky.z.e p0) {
  0:    v1 = 0;
  1:    com.google.android.finsky.utils.bb.a();
 11:    v2 = (com.google.android.finsky.aj.e)p0.get();
 12:    if (v2 != 0) {
 26:        v0 = this.b.c.toArray(new d[this.b.c.size()]);
 33:        while (v1 < ((d[])v0).length) {
 37:            ((d[])v0)[v1].a(v2);
 40:            v1 = v1 + 1;
            }
        }
 42:    return;
 43:    v0 = ex;
 47:    v4 = new Object[2];
 51:    v4[0] = this.a;
 54:    v4[1] = v0;
 56:    FinskyLog.d("Failed to fetch data usages stats for %s: %s", v4);
 59:    goto 12;
 61:    v0 = ex;
 62:    goto 44;
 63:    try
            run 5...11
        catch (InterruptedException ex) {
  5:        goto 43;
        }
        catch (ExecutionException ex) {
  5:        goto 61;
        }
    }

}
