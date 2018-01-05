package com.firebase.jobdispatcher;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources$Theme;
import android.os.Build$VERSION;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.support.v4.h.u;
import android.util.Log;
import android.util.Pair;
import com.google.b.a.a.a.a.a.c;
import com.google.b.a.a.a.a.a.e;

public class GooglePlayReceiver extends Service implements com.firebase.jobdispatcher.f
{

    public static final com.firebase.jobdispatcher.w a;
    public static final android.support.v4.h.u g;
    public Messenger b;
    public com.firebase.jobdispatcher.c c;
    public ValidationEnforcer d;
    public com.firebase.jobdispatcher.d e;
    public int f;

    static {
        GooglePlayReceiver.a = new com.firebase.jobdispatcher.w("com.firebase.jobdispatcher.");
        GooglePlayReceiver.g = new android.support.v4.h.u(1);
    }

    GooglePlayReceiver() {
        Service();
        new com.firebase.jobdispatcher.h();
    }

    static com.firebase.jobdispatcher.x a(com.firebase.jobdispatcher.v p0, Bundle p1) {
        v0 = 0;
        if (p1 == 0) {
            Log.e("FJD.ExternalReceiver", "Unexpected null Bundle provided");
            v1 = 0;
        }
        else {
            v2 = p1.getBundle("extras");
            if (v2 == 0)
                v1 = 0;
            else {
                v1 = GooglePlayReceiver.a.a(v2);
                if (p1.getParcelableArrayList("triggered_uris") != 0)
                    v1.j = new com.firebase.jobdispatcher.ap();
                v1 = v1.a();
            }
        }
        if (v1 == 0) {
            Log.e("FJD.GooglePlayReceiver", "unable to decode job");
            GooglePlayReceiver.a(p0, 2);
            return v0;
        }
        enter GooglePlayReceiver.g;
        try {
            v0 = (android.support.v4.h.u)GooglePlayReceiver.g.get(v1.b);
            if (v0 == 0) {
                v0 = new android.support.v4.h.u(1);
                GooglePlayReceiver.g.put(v1.b, v0);
            }
            v0.put(v1.a, p0);
            exit GooglePlayReceiver.g;
            v0 = v1;
            return v0;
            exit GooglePlayReceiver.g;
        }
        catch (Throwable ex) {
            exit GooglePlayReceiver.g;
            throw ex;
        }
    }

    private static void a(com.firebase.jobdispatcher.v p0, int p1) {
        try {
            p0.a(p1);
        }
        catch (Throwable ex) {
            Log.e("FJD.GooglePlayReceiver", "Encountered error running callback", ex.getCause());
        }
    }

    private final synchronized Messenger b() {
        enter this;
        try {
            if (this.b == 0)
                this.b = new Messenger(new com.firebase.jobdispatcher.l(Looper.getMainLooper(), this));
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        exit this;
        return this.b;
    }

    private final synchronized com.firebase.jobdispatcher.c c() {
        enter this;
        try {
            if (this.c == 0)
                this.c = new com.firebase.jobdispatcher.i(this.getApplicationContext());
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        exit this;
        return this.c;
    }

    private final synchronized ValidationEnforcer d() {
        enter this;
        try {
            if (this.d == 0)
                this.d = new ValidationEnforcer(this.c().b());
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        exit this;
        return this.d;
    }

    final synchronized com.firebase.jobdispatcher.d a() {
        enter this;
        try {
            if (this.e == 0)
                this.e = new com.firebase.jobdispatcher.d(this, this);
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        exit this;
        return this.e;
    }

    public final void a(com.firebase.jobdispatcher.x p0, int p1) {
  3:    enter GooglePlayReceiver.g;
 12:    v0 = (android.support.v4.h.u)GooglePlayReceiver.g.get(p0.b);
 14:    if (v0 == 0) {
 16:        try {
 22:            if (GooglePlayReceiver.g.isEmpty())
 26:                this.stopSelf(this.f);
 29:            exit GooglePlayReceiver.g;
            }
            catch (Throwable ex) {
 57:            exit GooglePlayReceiver.g;
 58:            throw ex;
            }
 30:        return;
        }
 37:    v1 = (com.firebase.jobdispatcher.v)v0.remove(p0.a);
 39:    if (v1 == 0) {
 41:        try {
 47:            if (GooglePlayReceiver.g.isEmpty())
 51:                this.stopSelf(this.f);
 54:            exit GooglePlayReceiver.g;
 55:            return;
 57:            exit GooglePlayReceiver.g;
            }
            catch (Throwable ex) {
 57:            exit GooglePlayReceiver.g;
 58:            throw ex;
            }
        }
 63:    if (v0.isEmpty())
 69:        GooglePlayReceiver.g.remove(p0.b);
 76:    if (p0.h() && p0.f() instanceof com.firebase.jobdispatcher.ah && p1 != 1)
 88:        v0 = 1;
        else
129:        v0 = 0;
 89:    if (v0 == 0) goto 131;
 97:    v0 = new com.firebase.jobdispatcher.u(this.d(), p0);
101:    v0.i = 1;
111:    this.c().a(v0.j());
114:    try {
120:        if (GooglePlayReceiver.g.isEmpty())
124:            this.stopSelf(this.f);
127:        exit GooglePlayReceiver.g;
        }
        catch (Throwable ex) {
 57:        exit GooglePlayReceiver.g;
 58:        throw ex;
        }
128:    return;
138:    if (Log.isLoggable("FJD.GooglePlayReceiver", 2))
183:        Log.v("FJD.GooglePlayReceiver", (String.valueOf(p0.a).length() + 38) + "sending jobFinished for " + p0.a + " = " + p1);
186:    GooglePlayReceiver.a(v1, p1);
189:    goto 114;
191:    try {
197:        if (GooglePlayReceiver.g.isEmpty())
201:            this.stopSelf(this.f);
204:        throw ex;
        }
        catch (Throwable ex) {
 57:        exit GooglePlayReceiver.g;
 58:        throw ex;
        }
206:    try
            run 131...189
        catch (Throwable ex) {
131:        goto 190;
        }
208:    try
            run 59...114
        catch (Throwable ex) {
 59:        goto 190;
        }
210:    try
            run 31...39
        catch (Throwable ex) {
 31:        goto 190;
        }
212:    try
            run 4...14
        catch (Throwable ex) {
  4:        goto 190;
        }
    }

    public Context createConfigurationContext(Configuration p0) {
        if (Build$VERSION.SDK_INT >= 17)
            v0 = new com.google.b.a.a.a.a.a.e(super.createConfigurationContext(p0));
        else
            v0 = 0;
        return v0;
    }

    public AssetManager getAssets() {
        return com.google.b.a.a.a.a.a.c.b(this);
    }

    public Resources getResources() {
        return com.google.b.a.a.a.a.a.c.a(this);
    }

    public Resources$Theme getTheme() {
        return com.google.b.a.a.a.a.a.c.c(this);
    }

    public IBinder onBind(Intent p0) {
        if (p0 == 0 || Build$VERSION.SDK_INT < 21 || !"com.google.android.gms.gcm.ACTION_TASK_READY".equals(p0.getAction()))
            v0 = 0;
        else
            v0 = this.b().getBinder();
        return v0;
    }

    public final int onStartCommand(Intent p0, int p1, int p2) {
  0:    v0 = 0;
  2:    try {
  2:        super.onStartCommand(p0, p1, p2);
  5:        if (p0 == 0) {
 11:            Log.w("FJD.GooglePlayReceiver", "Null Intent passed, terminating");
 14:            v1 = GooglePlayReceiver.g;
 16:            enter v1;
 17:            try {
 17:                this.f = p2;
 25:                if (GooglePlayReceiver.g.isEmpty())
 29:                    this.stopSelf(this.f);
 32:                exit v1;
 33:                return 2;
 35:                exit v1;
                }
                catch (Throwable ex) {
 35:                exit v1;
 36:                throw ex;
                }
            }
        }
        catch (Throwable ex) {
115:        enter GooglePlayReceiver.g;
116:        try {
116:            this.f = p2;
124:            if (GooglePlayReceiver.g.isEmpty())
128:                this.stopSelf(this.f);
131:            exit GooglePlayReceiver.g;
            }
            catch (Throwable ex) {
215:            try {
215:                exit GooglePlayReceiver.g;
                }
                catch (Throwable ex) {
215:                exit GooglePlayReceiver.g;
216:                throw ex;
                }
216:            throw ex;
            }
132:        throw ex;
        }
 37:    v1 = p0.getAction();
 47:    if (!"com.google.android.gms.gcm.ACTION_TASK_READY".equals(v1)) goto 151;
 53:    v1 = p0.getExtras();
 57:    if (v1 != 0) goto 92;
 63:    Log.e("FJD.GooglePlayReceiver", "No data provided, terminating");
 66:    this.a().a(v0);
 69:    v1 = GooglePlayReceiver.g;
 71:    enter v1;
 72:    try {
 72:        this.f = p2;
 80:        if (GooglePlayReceiver.g.isEmpty())
 84:            this.stopSelf(this.f);
 87:        exit v1;
 88:        return 2;
 90:        exit v1;
        }
        catch (Throwable ex) {
 90:        exit v1;
 91:        throw ex;
        }
 92:    if (v1 != 0) goto 133;
 98:    Log.e("FJD.GooglePlayReceiver", "No callback received, terminating");
101:    v1 = 0;
102:    if (v1 == 0)
108:        Log.i("FJD.GooglePlayReceiver", "no callback found");
        else
146:        v0 = GooglePlayReceiver.a((com.firebase.jobdispatcher.v)v1.first, (Bundle)v1.second);
111:    goto 66;
115:    enter GooglePlayReceiver.g;
116:    try {
116:        this.f = p2;
124:        if (GooglePlayReceiver.g.isEmpty())
128:            this.stopSelf(this.f);
131:        exit GooglePlayReceiver.g;
        }
        catch (Throwable ex) {
215:        try {
215:            exit GooglePlayReceiver.g;
            }
            catch (Throwable ex) {
215:            exit GooglePlayReceiver.g;
216:            throw ex;
            }
216:        throw ex;
        }
132:    throw ex;
133:    v1 = com.firebase.jobdispatcher.h.a(v1);
137:    goto 102;
157:    if ("com.google.android.gms.gcm.SERVICE_ACTION_INITIALIZE".equals(v1)) {
159:        v1 = GooglePlayReceiver.g;
161:        enter v1;
162:        try {
162:            this.f = p2;
170:            if (GooglePlayReceiver.g.isEmpty())
174:                this.stopSelf(this.f);
177:            exit v1;
178:            return 2;
181:            exit v1;
            }
            catch (Throwable ex) {
181:            exit v1;
182:            throw ex;
            }
        }
183:    try {
187:        Log.e("FJD.GooglePlayReceiver", "Unknown action received, terminating");
        }
        catch (Throwable ex) {
115:        enter GooglePlayReceiver.g;
116:        this.f = p2;
124:        if (GooglePlayReceiver.g.isEmpty())
128:            this.stopSelf(this.f);
131:        exit GooglePlayReceiver.g;
132:        throw ex;
        }
190:    v1 = GooglePlayReceiver.g;
192:    enter v1;
193:    try {
193:        this.f = p2;
201:        if (GooglePlayReceiver.g.isEmpty())
205:            this.stopSelf(this.f);
208:        exit v1;
209:        return 2;
212:        exit v1;
        }
        catch (Throwable ex) {
212:        exit v1;
213:        throw ex;
        }
221:    try
            run 133...156
        catch (Throwable ex) {
133:        goto 112;
        }
223:    try
            run 94...111
        catch (Throwable ex) {
 94:        goto 112;
        }
225:    try
            run 37...69
        catch (Throwable ex) {
 37:        goto 112;
        }
    }

    public void setTheme(int p0) {
        super.setTheme(p0);
        com.google.b.a.a.a.a.a.c.a(this, p0);
    }

}
