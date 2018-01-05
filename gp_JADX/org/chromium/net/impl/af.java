package org.chromium.net.impl;

import android.annotation.TargetApi;
import android.net.TrafficStats;
import android.util.Log;
import java.net.HttpURLConnection;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.chromium.net.CronetException;
import org.chromium.net.InlineExecutionProhibitedException;
import org.chromium.net.as;
import org.chromium.net.aw;
import org.chromium.net.ay;

@TargetApi(14)
final class af extends bv {
    public static final String f40774a = af.class.getSimpleName();
    public final aw f40775b;
    public final Executor f40776c;
    public final String f40777d;
    public final Map f40778e = new TreeMap(String.CASE_INSENSITIVE_ORDER);
    public final List f40779f = new ArrayList();
    public final AtomicReference f40780g = new AtomicReference(bq.NOT_STARTED);
    public final AtomicBoolean f40781h = new AtomicBoolean(false);
    public final int f40782i;
    public final boolean f40783j;
    public String f40784k;
    public cf f40785l;
    public Executor f40786m;
    public volatile int f40787n = -1;
    public String f40788o;
    public ReadableByteChannel f40789p;
    public bx f40790q;
    public String f40791r;
    public HttpURLConnection f40792s;
    public bg f40793t;

    af(aw awVar, Executor executor, Executor executor2, String str, String str2, boolean z) {
        if (str == null) {
            throw new NullPointerException("URL is required");
        } else if (awVar == null) {
            throw new NullPointerException("Listener is required");
        } else if (executor == null) {
            throw new NullPointerException("Executor is required");
        } else if (executor2 == null) {
            throw new NullPointerException("userExecutor is required");
        } else {
            this.f40783j = z;
            this.f40775b = new aw(this, awVar, executor2);
            this.f40782i = TrafficStats.getThreadStatsTag();
            this.f40776c = new bn(new ag(this, executor));
            this.f40788o = str;
            this.f40777d = str2;
        }
    }

    public final void mo6594a(String str) {
        m38065f();
        if (str == null) {
            throw new NullPointerException("Method is required.");
        } else if ("OPTIONS".equalsIgnoreCase(str) || "GET".equalsIgnoreCase(str) || "HEAD".equalsIgnoreCase(str) || "POST".equalsIgnoreCase(str) || "PUT".equalsIgnoreCase(str) || "DELETE".equalsIgnoreCase(str) || "TRACE".equalsIgnoreCase(str) || "PATCH".equalsIgnoreCase(str)) {
            this.f40784k = str;
        } else {
            throw new IllegalArgumentException("Invalid http method " + str);
        }
    }

    private final void m38065f() {
        bq bqVar = (bq) this.f40780g.get();
        if (bqVar != bq.NOT_STARTED) {
            throw new IllegalStateException("Request is already started. State is: " + bqVar);
        }
    }

    public final void mo6595a(String str, String str2) {
        Object obj = null;
        m38065f();
        int i = 0;
        while (i < str.length()) {
            char charAt = str.charAt(i);
            switch (charAt) {
                case '\'':
                case '(':
                case ')':
                case ',':
                case '/':
                case ':':
                case ';':
                case '<':
                case '=':
                case '>':
                case '?':
                case '@':
                case '[':
                case '\\':
                case ']':
                case '{':
                case '}':
                    break;
                default:
                    if (!(Character.isISOControl(charAt) || Character.isWhitespace(charAt))) {
                        i++;
                    }
            }
            if (obj != null || str2.contains("\r\n")) {
                throw new IllegalArgumentException("Invalid header " + str + "=" + str2);
            }
            if (this.f40778e.containsKey(str)) {
                this.f40778e.remove(str);
            }
            this.f40778e.put(str, str2);
            return;
        }
        obj = 1;
        if (obj != null) {
        }
        throw new IllegalArgumentException("Invalid header " + str + "=" + str2);
    }

    public final void mo6597a(as asVar, Executor executor) {
        if (asVar == null) {
            throw new NullPointerException("Invalid UploadDataProvider.");
        } else if (this.f40778e.containsKey("Content-Type")) {
            m38065f();
            if (this.f40784k == null) {
                this.f40784k = "POST";
            }
            this.f40785l = new cf(asVar);
            if (this.f40783j) {
                this.f40786m = executor;
            } else {
                this.f40786m = new be(executor);
            }
        } else {
            throw new IllegalArgumentException("Requests with upload data must have a Content-Type.");
        }
    }

    public final void mo6593a() {
        this.f40787n = 10;
        m38074a(bq.NOT_STARTED, bq.STARTED, new an(this));
    }

    final void m38072a(CronetException cronetException) {
        Object obj;
        Runnable bcVar;
        bq bqVar = bq.ERROR;
        bq bqVar2;
        do {
            bqVar2 = (bq) this.f40780g.get();
            switch (bqVar2.ordinal()) {
                case 0:
                    throw new IllegalStateException("Can't enter error state before start");
                case 6:
                case 7:
                case 8:
                    obj = null;
                    break;
                default:
                    break;
            }
            aw awVar;
            if (obj != null) {
                m38079e();
                m38078d();
                awVar = this.f40775b;
                ay ayVar = this.f40790q;
                af afVar = awVar.f40820d;
                afVar.f40776c.execute(new am(afVar));
                bcVar = new bc(awVar, ayVar, cronetException);
                try {
                    awVar.f40818b.execute(bcVar);
                } catch (InlineExecutionProhibitedException e) {
                    if (awVar.f40819c != null) {
                        awVar.f40819c.execute(bcVar);
                        return;
                    }
                    return;
                }
            }
        } while (!this.f40780g.compareAndSet(bqVar2, bqVar));
        obj = 1;
        if (obj != null) {
            m38079e();
            m38078d();
            awVar = this.f40775b;
            ay ayVar2 = this.f40790q;
            af afVar2 = awVar.f40820d;
            afVar2.f40776c.execute(new am(afVar2));
            bcVar = new bc(awVar, ayVar2, cronetException);
            awVar.f40818b.execute(bcVar);
        }
    }

    final void m38070a(Throwable th) {
        m38072a(new CallbackExceptionImpl("Exception received from UploadDataProvider", th));
    }

    final void m38074a(bq bqVar, bq bqVar2, Runnable runnable) {
        if (this.f40780g.compareAndSet(bqVar, bqVar2)) {
            runnable.run();
            return;
        }
        bq bqVar3 = (bq) this.f40780g.get();
        if (bqVar3 != bq.CANCELLED && bqVar3 != bq.ERROR) {
            throw new IllegalStateException("Invalid state transition - expected " + bqVar + " but was " + bqVar3);
        }
    }

    public final void mo6598b() {
        m38074a(bq.AWAITING_FOLLOW_REDIRECT, bq.STARTED, new ao(this));
    }

    final void m38078d() {
        if (this.f40785l != null && this.f40781h.compareAndSet(false, true)) {
            try {
                this.f40786m.execute(m38075b(new aq(this)));
            } catch (Throwable e) {
                Log.e(f40774a, "Exception when closing uploadDataProvider", e);
            }
        }
    }

    final Runnable m38066a(bd bdVar) {
        return new au(this, bdVar);
    }

    final Runnable m38075b(bd bdVar) {
        return new ai(this, bdVar);
    }

    public final void mo6596a(ByteBuffer byteBuffer) {
        bt.m38104a(byteBuffer);
        bt.m38105b(byteBuffer);
        m38074a(bq.AWAITING_READ, bq.READING, new aj(this, byteBuffer));
    }

    final void m38079e() {
        this.f40776c.execute(new al(this));
    }

    public final void mo6599c() {
        switch (((bq) this.f40780g.getAndSet(bq.CANCELLED)).ordinal()) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                m38079e();
                m38078d();
                aw awVar = this.f40775b;
                ay ayVar = this.f40790q;
                af afVar = awVar.f40820d;
                afVar.f40776c.execute(new am(afVar));
                awVar.f40818b.execute(new ba(awVar, ayVar));
                return;
            default:
                return;
        }
    }
}
