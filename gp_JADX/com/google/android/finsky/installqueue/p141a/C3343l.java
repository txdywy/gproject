package com.google.android.finsky.installqueue.p141a;

import com.google.android.finsky.ak.C1215q;
import java.util.List;
import java.util.concurrent.Callable;

final /* synthetic */ class C3343l implements Callable {
    public final C3342k f17230a;
    public final C1215q f17231b;

    C3343l(C3342k c3342k, C1215q c1215q) {
        this.f17230a = c3342k;
        this.f17231b = c1215q;
    }

    public final Object call() {
        C3342k c3342k = this.f17230a;
        return (List) ((C3327a) c3342k.f17212a.mo1a()).f17175f.mo1519a(this.f17231b).get();
    }
}
