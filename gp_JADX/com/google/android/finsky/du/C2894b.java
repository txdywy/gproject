package com.google.android.finsky.du;

import com.google.android.finsky.p198f.C3026a;
import com.google.android.finsky.p198f.C3027b;

final class C2894b implements Runnable {
    public final /* synthetic */ String f15396a;
    public final /* synthetic */ C2893a f15397b;

    C2894b(C2893a c2893a, String str) {
        this.f15397b = c2893a;
        this.f15396a = str;
    }

    public final void run() {
        C2893a c2893a = this.f15397b;
        String str = this.f15396a;
        C3026a a = ((C3027b) c2893a.f15394c.mo1a()).m15626a(str);
        if (a.f15829q) {
            c2893a.f15393b.m13162a(null, str, a.f15830r, false);
        }
    }
}
