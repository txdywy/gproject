package com.firebase.jobdispatcher;

import android.content.Context;
import android.content.Intent;
import android.support.v4.h.u;
import android.util.Log;

final class com.firebase.jobdispatcher.d
{

    public static final android.support.v4.h.u a;
    public final com.firebase.jobdispatcher.n b;
    public final Context c;
    public final com.firebase.jobdispatcher.f d;

    static {
        com.firebase.jobdispatcher.d.a = new android.support.v4.h.u();
    }

    d(Context p0, com.firebase.jobdispatcher.f p1) {
        this.b = new com.firebase.jobdispatcher.e(this);
        this.c = p0;
        this.d = p1;
    }

    static void a(com.firebase.jobdispatcher.x p0, boolean p1) {
        enter com.firebase.jobdispatcher.d.a;
        try {
            v0 = com.firebase.jobdispatcher.d.a.get(p0.b);
            if ((com.firebase.jobdispatcher.af)v0 != 0) {
                ((com.firebase.jobdispatcher.af)v0).a(p0, p1);
                if (((com.firebase.jobdispatcher.af)v0).a())
                    com.firebase.jobdispatcher.d.a.remove(p0.b);
            }
            exit com.firebase.jobdispatcher.d.a;
            return;
            exit com.firebase.jobdispatcher.d.a;
        }
        catch (Throwable ex) {
            exit com.firebase.jobdispatcher.d.a;
            throw ex;
        }
    }

    final void a(com.firebase.jobdispatcher.x p0) {
  0:    if (p0 == 0)
  2:        return;
  5:    enter com.firebase.jobdispatcher.d.a;
 10:    v0 = com.firebase.jobdispatcher.d.a.get(p0.b);
 16:    if ((com.firebase.jobdispatcher.af)v0 == 0) {
 47:        v0 = new com.firebase.jobdispatcher.af(this.b, this.c);
 54:        com.firebase.jobdispatcher.d.a.put(p0.b, v0);
 57:        v1 = v0;
 62:        if (!v1.b(p0)) {
 70:            v3 = new Intent("com.firebase.jobdispatcher.ACTION_EXECUTE");
 79:            v3.setClassName(this.c, p0.i());
 87:            if (!this.c.bindService(v3, v1, 1)) {
 95:                v0 = String.valueOf(p0.b);
103:                if (v0.length() != 0)
105:                    v0 = "Unable to bind to ".concat(v0);
                    else
119:                    v0 = new String("Unable to bind to ");
109:                Log.e("FJD.ExternalReceiver", v0);
112:                v1.c();
                }
            }
115:        exit com.firebase.jobdispatcher.d.a;
116:        return;
        }
 22:    if (((com.firebase.jobdispatcher.af)v0).a()) {
 47:        v0 = new com.firebase.jobdispatcher.af(this.b, this.c);
 54:        com.firebase.jobdispatcher.d.a.put(p0.b, v0);
 57:        v1 = v0;
 62:        if (!v1.b(p0)) {
 70:            v3 = new Intent("com.firebase.jobdispatcher.ACTION_EXECUTE");
 79:            v3.setClassName(this.c, p0.i());
 87:            if (!this.c.bindService(v3, v1, 1)) {
 95:                v0 = String.valueOf(p0.b);
103:                if (v0.length() != 0)
105:                    v0 = "Unable to bind to ".concat(v0);
                    else
119:                    v0 = new String("Unable to bind to ");
109:                Log.e("FJD.ExternalReceiver", v0);
112:                v1.c();
                }
            }
115:        exit com.firebase.jobdispatcher.d.a;
116:        return;
        }
 28:    if (((com.firebase.jobdispatcher.af)v0).c(p0) && !((com.firebase.jobdispatcher.af)v0).b()) {
 36:        exit com.firebase.jobdispatcher.d.a;
 37:        return;
        }
 35:    goto 123;
 39:    exit com.firebase.jobdispatcher.d.a;
 40:    throw ex;
 47:    v0 = new com.firebase.jobdispatcher.af(this.b, this.c);
 54:    com.firebase.jobdispatcher.d.a.put(p0.b, v0);
 57:    v1 = v0;
 62:    if (!v1.b(p0)) {
 70:        v3 = new Intent("com.firebase.jobdispatcher.ACTION_EXECUTE");
 79:        v3.setClassName(this.c, p0.i());
 87:        if (!this.c.bindService(v3, v1, 1)) {
 95:            v0 = String.valueOf(p0.b);
103:            if (v0.length() != 0)
105:                v0 = "Unable to bind to ".concat(v0);
                else
119:                v0 = new String("Unable to bind to ");
109:            Log.e("FJD.ExternalReceiver", v0);
112:            v1.c();
            }
        }
115:    exit com.firebase.jobdispatcher.d.a;
116:    return;
123:    v1 = (com.firebase.jobdispatcher.af)v0;
124:    goto 58;
125:    try
            run 41...122
        catch (Throwable ex) {
 41:        goto 38;
        }
126:    try
            run 6...40
        catch (Throwable ex) {
  6:        goto 38;
        }
    }

}
