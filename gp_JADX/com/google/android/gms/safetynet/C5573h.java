package com.google.android.gms.safetynet;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.api.C5022m;
import com.google.android.gms.common.api.internal.cg;
import com.google.android.gms.common.internal.af;
import com.google.android.gms.tasks.C5587d;
import com.google.android.gms.tasks.C5591h;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class C5573h extends C5022m {
    protected C5573h(Context context) {
        super(context, C5571a.f28491c, new cg());
    }

    public static String m26563a(Context context) {
        C5587d a = C5571a.m26561a(context).mo5051a();
        try {
            C5591h.m26586a(a, 15000, TimeUnit.MILLISECONDS);
            String a2 = ((C5572f) a.mo5061c()).m26562a();
            return a2 != null ? a2 : "aaaaaaaa-aaaa-aaaa-aaaa-aaaaaaaaaaaa";
        } catch (ExecutionException e) {
            return "aaaaaaaa-aaaa-aaaa-aaaa-aaaaaaaaaaaa";
        } catch (InterruptedException e2) {
            return "aaaaaaaa-aaaa-aaaa-aaaa-aaaaaaaaaaaa";
        } catch (TimeoutException e3) {
            return "aaaaaaaa-aaaa-aaaa-aaaa-aaaaaaaaaaaa";
        }
    }

    public final C5587d mo5051a() {
        return af.m23725a(C5571a.f28493e.mo4819a(this.f25591g), new C5572f());
    }

    public final C5587d m26565a(int i, Bundle bundle) {
        return super.m23220a(new C5580o(i, bundle));
    }
}
