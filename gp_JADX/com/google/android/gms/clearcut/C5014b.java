package com.google.android.gms.clearcut;

import android.os.Looper;
import com.google.android.gms.clearcut.internal.PlayLoggerContext;
import com.google.android.gms.common.api.C4954s;
import com.google.android.gms.common.api.C4980w;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.bt;
import com.google.android.gms.common.internal.am;
import com.google.android.gms.internal.xg;
import com.google.android.gms.phenotype.ExperimentTokens;
import java.util.ArrayList;
import java.util.TimeZone;

public final class C5014b {
    public int f25538a;
    public String f25539b;
    public String f25540c;
    public String f25541d;
    public int f25542e;
    public final C5016d f25543f;
    public C5016d f25544g;
    public ArrayList f25545h;
    public ArrayList f25546i;
    public ArrayList f25547j;
    public ArrayList f25548k;
    public ArrayList f25549l;
    public boolean f25550m;
    public final xg f25551n;
    public boolean f25552o;
    public /* synthetic */ C5012a f25553p;

    C5014b(C5012a c5012a, C5016d c5016d) {
        this(c5012a, null, c5016d);
    }

    public C5014b(C5012a c5012a, byte[] bArr) {
        this(c5012a, bArr, null);
    }

    private C5014b(C5012a c5012a, byte[] bArr, C5016d c5016d) {
        this.f25553p = c5012a;
        this.f25538a = this.f25553p.f25529j;
        this.f25539b = this.f25553p.f25528i;
        this.f25540c = this.f25553p.f25530k;
        this.f25541d = this.f25553p.f25531l;
        this.f25542e = this.f25553p.f25533n;
        this.f25545h = null;
        this.f25546i = null;
        this.f25547j = null;
        this.f25548k = null;
        this.f25549l = null;
        this.f25550m = true;
        this.f25551n = new xg();
        this.f25552o = false;
        this.f25540c = c5012a.f25530k;
        this.f25541d = c5012a.f25531l;
        this.f25551n.f27673a = c5012a.f25535p.mo4629a();
        this.f25551n.f27674b = c5012a.f25535p.mo4630b();
        xg xgVar = this.f25551n;
        c5012a.f25536q;
        xgVar.f27688p = (long) (TimeZone.getDefault().getOffset(this.f25551n.f27673a) / 1000);
        if (bArr != null) {
            this.f25551n.f27683k = bArr;
        }
        this.f25543f = c5016d;
    }

    @Deprecated
    public final C4954s m23195a() {
        ExperimentTokens[] experimentTokensArr = null;
        if (this.f25552o) {
            throw new IllegalStateException("do not reuse LogEventBuilder");
        }
        byte[][] bArr;
        this.f25552o = true;
        PlayLoggerContext playLoggerContext = new PlayLoggerContext(this.f25553p.f25526g, this.f25553p.f25527h, this.f25538a, this.f25539b, this.f25540c, this.f25541d, this.f25553p.f25532m, this.f25542e);
        xg xgVar = this.f25551n;
        C5016d c5016d = this.f25543f;
        C5016d c5016d2 = this.f25544g;
        int[] a = C5012a.m23180a(this.f25545h);
        String[] strArr = this.f25546i != null ? (String[]) this.f25546i.toArray(C5012a.f25524e) : null;
        int[] a2 = C5012a.m23180a(this.f25547j);
        if (this.f25549l != null) {
            bArr = (byte[][]) this.f25549l.toArray(C5012a.f25525f);
        } else {
            bArr = null;
        }
        if (this.f25548k != null) {
            experimentTokensArr = (ExperimentTokens[]) this.f25548k.toArray(C5012a.f25523d);
        }
        LogEventParcelable logEventParcelable = new LogEventParcelable(playLoggerContext, xgVar, c5016d, c5016d2, a, strArr, a2, bArr, experimentTokensArr, this.f25550m);
        playLoggerContext = logEventParcelable.f25509a;
        if (this.f25553p.f25537r.mo4530a(playLoggerContext.f25582g, playLoggerContext.f25578c)) {
            return this.f25553p.f25534o.mo4521a(logEventParcelable);
        }
        C4980w c4980w = Status.f25625a;
        am.m23734a((Object) c4980w, (Object) "Result must not be null");
        C4954s btVar = new bt(Looper.getMainLooper());
        btVar.m23071a(c4980w);
        return btVar;
    }
}
