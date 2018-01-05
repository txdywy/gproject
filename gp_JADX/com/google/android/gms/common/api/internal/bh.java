package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.p037h.C0305a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.WeakHashMap;

public final class bh extends Fragment implements bg {
    public static WeakHashMap f25750a = new WeakHashMap();
    public Map f25751b = new C0305a();
    public int f25752c = 0;
    public Bundle f25753d;

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.common.api.internal.bh m23480a(android.app.Activity r3) {
        /*
        r0 = f25750a;
        r0 = r0.get(r3);
        r0 = (java.lang.ref.WeakReference) r0;
        if (r0 == 0) goto L_0x0013;
    L_0x000a:
        r0 = r0.get();
        r0 = (com.google.android.gms.common.api.internal.bh) r0;
        if (r0 == 0) goto L_0x0013;
    L_0x0012:
        return r0;
    L_0x0013:
        r0 = r3.getFragmentManager();	 Catch:{ ClassCastException -> 0x0048 }
        r1 = "LifecycleFragmentImpl";
        r0 = r0.findFragmentByTag(r1);	 Catch:{ ClassCastException -> 0x0048 }
        r0 = (com.google.android.gms.common.api.internal.bh) r0;	 Catch:{ ClassCastException -> 0x0048 }
        if (r0 == 0) goto L_0x0027;
    L_0x0021:
        r1 = r0.isRemoving();
        if (r1 == 0) goto L_0x003d;
    L_0x0027:
        r0 = new com.google.android.gms.common.api.internal.bh;
        r0.<init>();
        r1 = r3.getFragmentManager();
        r1 = r1.beginTransaction();
        r2 = "LifecycleFragmentImpl";
        r1 = r1.add(r0, r2);
        r1.commitAllowingStateLoss();
    L_0x003d:
        r1 = f25750a;
        r2 = new java.lang.ref.WeakReference;
        r2.<init>(r0);
        r1.put(r3, r2);
        goto L_0x0012;
    L_0x0048:
        r0 = move-exception;
        r1 = new java.lang.IllegalStateException;
        r2 = "Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl";
        r1.<init>(r2, r0);
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.bh.a(android.app.Activity):com.google.android.gms.common.api.internal.bh");
    }

    public final LifecycleCallback mo4586a(String str, Class cls) {
        return (LifecycleCallback) cls.cast(this.f25751b.get(str));
    }

    public final void mo4587a(String str, LifecycleCallback lifecycleCallback) {
        if (this.f25751b.containsKey(str)) {
            throw new IllegalArgumentException(new StringBuilder(String.valueOf(str).length() + 59).append("LifecycleCallback with tag ").append(str).append(" already added to this fragment.").toString());
        }
        this.f25751b.put(str, lifecycleCallback);
        if (this.f25752c > 0) {
            new Handler(Looper.getMainLooper()).post(new bi(this, lifecycleCallback, str));
        }
    }

    public final Activity cv_() {
        return getActivity();
    }

    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        for (LifecycleCallback a : this.f25751b.values()) {
            a.mo4600a(str, fileDescriptor, printWriter, strArr);
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        for (LifecycleCallback a : this.f25751b.values()) {
            a.mo4594a(i, i2, intent);
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f25752c = 1;
        this.f25753d = bundle;
        for (Entry entry : this.f25751b.entrySet()) {
            ((LifecycleCallback) entry.getValue()).mo4595a(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        this.f25752c = 5;
        Iterator it = this.f25751b.values().iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final void onResume() {
        super.onResume();
        this.f25752c = 3;
        for (LifecycleCallback c : this.f25751b.values()) {
            c.mo4605c();
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle != null) {
            for (Entry entry : this.f25751b.entrySet()) {
                Bundle bundle2 = new Bundle();
                ((LifecycleCallback) entry.getValue()).mo4597b(bundle2);
                bundle.putBundle((String) entry.getKey(), bundle2);
            }
        }
    }

    public final void onStart() {
        super.onStart();
        this.f25752c = 2;
        for (LifecycleCallback b : this.f25751b.values()) {
            b.mo4596b();
        }
    }

    public final void onStop() {
        super.onStop();
        this.f25752c = 4;
        for (LifecycleCallback d : this.f25751b.values()) {
            d.mo4598d();
        }
    }
}
