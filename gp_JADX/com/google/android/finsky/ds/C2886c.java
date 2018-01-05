package com.google.android.finsky.ds;

import android.os.AsyncTask;
import android.os.Bundle;

public final class C2886c extends AsyncTask {
    public final /* synthetic */ C2885b f15385a;

    public C2886c(C2885b c2885b) {
        this.f15385a = c2885b;
    }

    protected final /* synthetic */ void onPostExecute(Object obj) {
        this.f15385a.m15127a((Bundle) obj);
    }

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        return this.f15385a.m15125a();
    }
}
