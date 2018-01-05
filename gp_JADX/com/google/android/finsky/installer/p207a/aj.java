package com.google.android.finsky.installer.p207a;

import android.os.AsyncTask;
import android.support.v7.widget.eq;
import com.google.android.finsky.bn.C2129c;
import com.google.android.finsky.utils.C4688t;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.finsky.b.d;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;
import java.io.File;
import java.io.FileInputStream;

final class aj extends AsyncTask {
    public final /* synthetic */ C3288f f16921a;
    public final /* synthetic */ File f16922b;
    public final /* synthetic */ d f16923c;
    public final /* synthetic */ C2129c f16924d;
    public final /* synthetic */ ay f16925e;
    public final /* synthetic */ ah f16926f;

    aj(ah ahVar, C3288f c3288f, File file, d dVar, C2129c c2129c, ay ayVar) {
        this.f16926f = ahVar;
        this.f16921a = c3288f;
        this.f16922b = file;
        this.f16923c = dVar;
        this.f16924d = c2129c;
        this.f16925e = ayVar;
    }

    private final Long m16455a() {
        long a = this.f16926f.f16873D.m16531a(this.f16921a);
        if (this.f16926f.f16892W) {
            C3299r c3299r = this.f16926f.f16873D;
            this.f16926f.f16877H.m14975a(C3299r.m16530b(this.f16926f.ah), (this.f16921a.f17023b & eq.FLAG_APPEARED_IN_PRE_LAYOUT) == 0);
        }
        try {
            if (this.f16923c.d.equals(C4688t.m21837a(new FileInputStream(this.f16922b), "SHA-1").f24073c)) {
                return Long.valueOf(a);
            }
            this.f16926f.m16441b(this.f16926f.f16878I, 1023, null);
            FinskyLog.m21659a("Cannot patch %s (adid: %s , isid: %s), bad hash, expect %s actual %s", this.f16926f.f16878I, this.f16926f.ag, this.f16926f.m16445e(), this.f16923c.d, r0.f24073c);
            return Long.valueOf(-1);
        } catch (Exception e) {
            this.f16926f.m16441b(this.f16926f.f16878I, MemoryMappedFileBuffer.DEFAULT_PADDING, e);
            FinskyLog.m21659a("Cannot patch %s (adid: %s , isid: %s), FileNotFoundException, %s", this.f16926f.f16878I, this.f16926f.ag, this.f16926f.m16445e(), this.f16922b);
            return Long.valueOf(-1);
        } catch (Exception e2) {
            this.f16926f.m16441b(this.f16926f.f16878I, 1025, e2);
            FinskyLog.m21659a("Cannot patch %s (adid: %s , isid: %s), unexpected exception %s", this.f16926f.f16878I, this.f16926f.ag, this.f16926f.m16445e(), e2);
            return Long.valueOf(-1);
        }
    }

    protected final /* synthetic */ void onPostExecute(Object obj) {
        Long l = (Long) obj;
        if (l.longValue() <= 0) {
            this.f16926f.m16428a(this.f16924d, this.f16921a, this.f16925e);
            return;
        }
        C3299r c3299r = this.f16926f.f16873D;
        if (l.longValue() < C3299r.m16530b(this.f16926f.ah)) {
            this.f16926f.m16441b(this.f16926f.f16878I, 1026, null);
            FinskyLog.m21659a("Cannot patch %s (adid: %s , isid: %s), need %d, free %d", this.f16926f.f16878I, this.f16926f.ag, this.f16926f.m16445e(), Long.valueOf(r0), l);
            this.f16926f.m16428a(this.f16924d, this.f16921a, this.f16925e);
            return;
        }
        FinskyLog.m21659a("Downloading patch for %s (adid: %s , isid: %s)", this.f16926f.f16878I, this.f16926f.ag, this.f16926f.m16445e());
        C3288f c3288f = this.f16921a;
        c3288f.f17023b |= 4;
        this.f16926f.m16428a(this.f16924d, this.f16921a, this.f16925e);
    }

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        return m16455a();
    }
}
