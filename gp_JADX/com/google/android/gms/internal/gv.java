package com.google.android.gms.internal;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.p270c.C4909c;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.LinkedList;

public abstract class gv implements ge {
    public MotionEvent f26811a;
    public LinkedList f26812b = new LinkedList();
    public long f26813c = 0;
    public long f26814d = 0;
    public long f26815e = 0;
    public long f26816f = 0;
    public long f26817g = 0;
    public long f26818h = 0;
    public long f26819i = 0;
    public double f26820j;
    public double f26821k;
    public double f26822l;
    public float f26823m;
    public float f26824n;
    public float f26825o;
    public float f26826p;
    public boolean f26827q = false;
    public boolean f26828r = false;
    public DisplayMetrics f26829s;

    protected gv(Context context) {
        try {
            if (((Boolean) C4909c.m22927a().f25267g.m26014a(yu.f27762r)).booleanValue()) {
                ed.m24322a();
            } else {
                ef.m24330a();
            }
            this.f26829s = context.getResources().getDisplayMetrics();
        } catch (Throwable th) {
        }
    }

    protected abstract long mo4757a(StackTraceElement[] stackTraceElementArr);

    protected abstract ci mo4758a(Context context, View view);

    protected abstract ci mo4759a(Context context, br brVar);

    public final String mo4747a(Context context, String str) {
        return m24537a(context, str, true, null);
    }

    protected abstract jt mo4760b(MotionEvent motionEvent);

    public final String mo4746a(Context context) {
        if (ju.m24989b()) {
            if (((Boolean) C4909c.m22927a().f25267g.m26014a(yu.f27764t)).booleanValue()) {
                throw new IllegalStateException("The caller must not be called from the UI thread.");
            }
        }
        return m24537a(context, null, false, null);
    }

    public final String m24543a(Context context, byte[] bArr) {
        if (ju.m24989b()) {
            if (((Boolean) C4909c.m22927a().f25267g.m26014a(yu.f27764t)).booleanValue()) {
                throw new IllegalStateException("The caller must not be called from the UI thread.");
            }
        }
        return m24537a(context, null, false, bArr);
    }

    public final void mo4748a(MotionEvent motionEvent) {
        if (this.f26827q) {
            this.f26816f = 0;
            this.f26815e = 0;
            this.f26814d = 0;
            this.f26813c = 0;
            this.f26817g = 0;
            this.f26819i = 0;
            this.f26818h = 0;
            Iterator it = this.f26812b.iterator();
            while (it.hasNext()) {
                ((MotionEvent) it.next()).recycle();
            }
            this.f26812b.clear();
            this.f26811a = null;
            this.f26827q = false;
        }
        if (((Boolean) C4909c.m22927a().f25267g.m26014a(yu.f27756l)).booleanValue()) {
            switch (motionEvent.getAction()) {
                case 0:
                    this.f26820j = 0.0d;
                    this.f26821k = (double) motionEvent.getRawX();
                    this.f26822l = (double) motionEvent.getRawY();
                    break;
                case 1:
                case 2:
                    double rawX = (double) motionEvent.getRawX();
                    double rawY = (double) motionEvent.getRawY();
                    double d = rawX - this.f26821k;
                    double d2 = rawY - this.f26822l;
                    this.f26820j = Math.sqrt((d * d) + (d2 * d2)) + this.f26820j;
                    this.f26821k = rawX;
                    this.f26822l = rawY;
                    break;
            }
        }
        switch (motionEvent.getAction()) {
            case 0:
                if (((Boolean) C4909c.m22927a().f25267g.m26014a(yu.f27757m)).booleanValue()) {
                    this.f26823m = motionEvent.getX();
                    this.f26824n = motionEvent.getY();
                    this.f26825o = motionEvent.getRawX();
                    this.f26826p = motionEvent.getRawY();
                }
                this.f26813c++;
                break;
            case 1:
                this.f26811a = MotionEvent.obtain(motionEvent);
                this.f26812b.add(this.f26811a);
                if (this.f26812b.size() > 6) {
                    ((MotionEvent) this.f26812b.remove()).recycle();
                }
                this.f26815e++;
                try {
                    this.f26817g = mo4757a(new Throwable().getStackTrace());
                    break;
                } catch (zzcz e) {
                    break;
                }
            case 2:
                this.f26814d += (long) (motionEvent.getHistorySize() + 1);
                try {
                    jt b = mo4760b(motionEvent);
                    Object obj = (b == null || b.f27096e == null || b.f27099h == null) ? null : 1;
                    if (obj != null) {
                        this.f26818h += b.f27096e.longValue() + b.f27099h.longValue();
                    }
                    obj = (this.f26829s == null || b == null || b.f27097f == null || b.f27100i == null) ? null : 1;
                    if (obj != null) {
                        this.f26819i = (b.f27100i.longValue() + b.f27097f.longValue()) + this.f26819i;
                        break;
                    }
                } catch (zzcz e2) {
                    break;
                }
                break;
            case 3:
                this.f26816f++;
                break;
        }
        this.f26828r = true;
    }

    private final String m24537a(Context context, String str, boolean z, byte[] bArr) {
        br brVar;
        ci ciVar;
        if (bArr != null && bArr.length > 0) {
            try {
                brVar = (br) wz.m24211a(new br(), bArr, bArr.length);
            } catch (zzfyy e) {
            }
            if (z) {
                wz a = mo4759a(context, brVar);
            } else {
                try {
                    wz a2 = mo4758a(context, null);
                    this.f26827q = true;
                    ciVar = a2;
                } catch (GeneralSecurityException e2) {
                    return Integer.toString(7);
                } catch (UnsupportedEncodingException e3) {
                    return Integer.toString(7);
                } catch (Throwable th) {
                    return Integer.toString(3);
                }
            }
            if (ciVar != null || ciVar.m24217e() == 0) {
                return Integer.toString(5);
            }
            Object obj = (!((Boolean) C4909c.m22927a().f25267g.m26014a(yu.f27752h)).booleanValue() || z) ? 1 : null;
            return ed.m24319a(ciVar, str, obj == null);
        }
        brVar = null;
        if (z) {
            wz a3 = mo4759a(context, brVar);
        } else {
            wz a22 = mo4758a(context, null);
            this.f26827q = true;
            ciVar = a22;
        }
        if (ciVar != null) {
        }
        return Integer.toString(5);
    }
}
