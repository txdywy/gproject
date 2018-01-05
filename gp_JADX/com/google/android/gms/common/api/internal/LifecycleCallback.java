package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.C0254u;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class LifecycleCallback {
    public final bg f25639a;

    protected LifecycleCallback(bg bgVar) {
        this.f25639a = bgVar;
    }

    public static bg m23277a(Activity activity) {
        return m23278a(new bf(activity));
    }

    public final Activity m23279a() {
        return this.f25639a.cv_();
    }

    public void mo4594a(int i, int i2, Intent intent) {
    }

    public void mo4595a(Bundle bundle) {
    }

    public void mo4600a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public void mo4596b() {
    }

    public void mo4597b(Bundle bundle) {
    }

    public void mo4605c() {
    }

    public void mo4598d() {
    }

    public static bg m23278a(bf bfVar) {
        if (bfVar.f25749a instanceof C0254u) {
            return bu.m23495a((C0254u) bfVar.f25749a);
        }
        if (bfVar.f25749a instanceof Activity) {
            return bh.m23480a((Activity) bfVar.f25749a);
        }
        throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
    }
}
