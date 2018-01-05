package com.google.android.wallet.nfc;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.SystemClock;
import com.google.android.wallet.nfc.exceptions.TagReadException;
import com.google.android.wallet.nfc.exceptions.TagReadTimeoutException;
import com.google.android.wallet.nfc.exceptions.UnsupportedTagException;
import com.google.android.wallet.nfc.p398a.C6684e;
import java.io.IOException;
import java.lang.ref.WeakReference;

public final class C6691d extends AsyncTask {
    public final WeakReference f33026a;
    public int f33027b = 2;
    public long f33028c;

    public C6691d(C6646c c6646c) {
        this.f33026a = new WeakReference(c6646c);
    }

    protected final void onPreExecute() {
        this.f33028c = SystemClock.elapsedRealtime();
        super.onPreExecute();
    }

    private final C6690a m30329a(Intent... intentArr) {
        if (intentArr == null || intentArr.length == 0 || !"android.nfc.action.TAG_DISCOVERED".equals(intentArr[0].getAction())) {
            this.f33027b = 3;
            return null;
        }
        this.f33027b = 2;
        try {
            C6690a a = C6684e.m30312a(intentArr[0]);
            if (a.m30326a() || a.m30327b() || a.m30328c()) {
                this.f33027b = 1;
                return new C6690a(a.f33022a, a.f33023b, a.f33024c, "");
            }
            this.f33027b = 3;
            return null;
        } catch (TagReadTimeoutException e) {
            this.f33027b = 6;
            return null;
        } catch (IOException e2) {
            this.f33027b = 5;
            return null;
        } catch (UnsupportedTagException e3) {
            this.f33027b = 4;
            return null;
        } catch (TagReadException e4) {
            this.f33027b = 3;
            return null;
        }
    }

    private final void m30330a(C6690a c6690a) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f33028c;
        C6646c c6646c = (C6646c) this.f33026a.get();
        if (c6646c != null) {
            c6646c.mo5551a(this.f33027b, c6690a, elapsedRealtime);
        }
    }

    protected final void onCancelled() {
        super.onCancelled();
        m30330a(null);
    }

    protected final /* synthetic */ void onCancelled(Object obj) {
        C6690a c6690a = (C6690a) obj;
        super.onCancelled(c6690a);
        m30330a(c6690a);
    }

    protected final /* synthetic */ void onPostExecute(Object obj) {
        C6690a c6690a = (C6690a) obj;
        super.onPostExecute(c6690a);
        m30330a(c6690a);
    }

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        return m30329a((Intent[]) objArr);
    }
}
