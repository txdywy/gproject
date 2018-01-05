package com.google.android.finsky.detailspage;

import android.os.AsyncTask;

final class ec extends AsyncTask {
    public final int f14467a;
    public final int f14468b;
    public final /* synthetic */ dz f14469c;

    public ec(dz dzVar, int i, int i2) {
        this.f14469c = dzVar;
        this.f14467a = i;
        this.f14468b = i2;
    }

    private final Void m14224a() {
        int i = this.f14467a;
        while (!isCancelled()) {
            publishProgress(new Integer[]{Integer.valueOf(i)});
            i++;
            if (i > this.f14468b) {
                break;
            }
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
            }
        }
        return null;
    }

    protected final /* synthetic */ void onCancelled(Object obj) {
        super.onCancelled((Void) obj);
        this.f14469c.m14208a();
    }

    protected final /* synthetic */ void onProgressUpdate(Object[] objArr) {
        Integer[] numArr = (Integer[]) objArr;
        if (!isCancelled() && this.f14469c.f14450d != 2) {
            this.f14469c.m14214b(numArr[0].intValue());
        }
    }

    protected final /* synthetic */ void onPostExecute(Object obj) {
        super.onPostExecute((Void) obj);
        this.f14469c.m14208a();
    }

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        return m14224a();
    }
}
