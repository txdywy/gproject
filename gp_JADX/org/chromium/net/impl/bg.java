package org.chromium.net.impl;

import android.annotation.SuppressLint;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.chromium.net.at;

final class bg extends at {
    public final AtomicReference f40840a = new AtomicReference(bp.NOT_STARTED);
    public final Executor f40841b;
    public final Executor f40842c;
    public final HttpURLConnection f40843d;
    public final AtomicBoolean f40844e = new AtomicBoolean(false);
    public WritableByteChannel f40845f;
    public OutputStream f40846g;
    public final cf f40847h;
    public ByteBuffer f40848i;
    public long f40849j;
    public long f40850k = 0;
    public final /* synthetic */ af f40851l;

    bg(af afVar, Executor executor, Executor executor2, HttpURLConnection httpURLConnection, cf cfVar) {
        this.f40851l = afVar;
        this.f40841b = new bh(this, executor);
        this.f40842c = executor2;
        this.f40843d = httpURLConnection;
        this.f40847h = cfVar;
    }

    @SuppressLint({"DefaultLocale"})
    public final void mo6592a(boolean z) {
        if (this.f40840a.compareAndSet(bp.AWAITING_READ_RESULT, bp.UPLOADING)) {
            this.f40842c.execute(this.f40851l.m38066a(new bi(this, z)));
            return;
        }
        throw new IllegalStateException("Not expecting a read result, expecting: " + this.f40840a.get());
    }

    public final void mo6590a() {
        if (this.f40840a.compareAndSet(bp.AWAITING_REWIND_RESULT, bp.UPLOADING)) {
            m38094b();
            return;
        }
        throw new IllegalStateException("Not expecting a read result");
    }

    public final void mo6591a(Exception exception) {
        this.f40851l.m38070a((Throwable) exception);
    }

    final void m38094b() {
        this.f40842c.execute(this.f40851l.m38066a(new bk(this)));
    }

    final void m38092a(bd bdVar) {
        try {
            this.f40841b.execute(this.f40851l.m38075b(bdVar));
        } catch (Throwable e) {
            this.f40851l.m38070a(e);
        }
    }

    final void m38095c() {
        if (this.f40845f != null && this.f40844e.compareAndSet(false, true)) {
            this.f40845f.close();
        }
    }

    final void m38096d() {
        m38095c();
        af afVar = this.f40851l;
        afVar.f40787n = 13;
        afVar.f40776c.execute(afVar.m38066a(new ap(afVar)));
    }
}
