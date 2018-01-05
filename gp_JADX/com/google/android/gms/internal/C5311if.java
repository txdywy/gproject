package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.am;
import com.google.android.gms.measurement.C5312g;
import com.google.android.gms.measurement.C5342e;
import com.google.android.gms.measurement.C5343f;
import java.util.Iterator;

@TargetApi(14)
final class C5311if implements ActivityLifecycleCallbacks {
    public /* synthetic */ ib f26982a;

    C5311if(ib ibVar) {
        this.f26982a = ibVar;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        int i = 6;
        Object obj = 1;
        try {
            this.f26982a.mo4742p().f26851j.m24652a("onActivityCreated");
            Intent intent = activity.getIntent();
            if (intent != null) {
                Uri data = intent.getData();
                if (data != null && data.isHierarchical()) {
                    String str;
                    if (bundle == null) {
                        Bundle a = this.f26982a.mo4739m().m24926a(data);
                        this.f26982a.mo4739m();
                        if (jl.m24917a(intent)) {
                            str = "gs";
                        } else {
                            str = "auto";
                        }
                        if (a != null) {
                            this.f26982a.m24776a(str, "_cmp", a);
                        }
                    }
                    Object queryParameter = data.getQueryParameter("referrer");
                    if (!TextUtils.isEmpty(queryParameter)) {
                        if (!(queryParameter.contains("gclid") && (queryParameter.contains("utm_campaign") || queryParameter.contains("utm_source") || queryParameter.contains("utm_medium") || queryParameter.contains("utm_term") || queryParameter.contains("utm_content")))) {
                            obj = null;
                        }
                        if (obj == null) {
                            this.f26982a.mo4742p().f26850i.m24652a("Activity created with data 'referrer' param without gclid and at least one utm field");
                            return;
                        }
                        this.f26982a.mo4742p().f26850i.m24653a("Activity created with referrer", queryParameter);
                        if (!TextUtils.isEmpty(queryParameter)) {
                            hy hyVar = this.f26982a;
                            String str2 = "auto";
                            str = "_ldl";
                            am.m23735a(str2);
                            long a2 = hyVar.mo4735i().mo4629a();
                            jl m = hyVar.mo4739m();
                            if (m.m24933a("user property", str)) {
                                if (!m.m24935a("user property", C5342e.f27844a, str)) {
                                    i = 15;
                                } else if (m.m24932a("user property", gj.m24462v(), str)) {
                                    i = 0;
                                }
                            }
                            if (i != 0) {
                                hyVar.mo4739m();
                                hyVar.p.m24764g().m24930a(i, "_ev", jl.m24914a(str, gj.m24462v(), true), str.length());
                            } else if (queryParameter != null) {
                                Object obj2;
                                jl m2 = hyVar.mo4739m();
                                if ("_ldl".equals(str) ? m2.m24934a("user property referrer", str, jl.m24910a(str), queryParameter, false) : m2.m24934a("user property", str, jl.m24910a(str), queryParameter, false)) {
                                    obj2 = null;
                                } else {
                                    i = 7;
                                }
                                if (obj2 != null) {
                                    hyVar.mo4739m();
                                    String a3 = jl.m24914a(str, gj.m24462v(), true);
                                    i = ((queryParameter instanceof String) || (queryParameter instanceof CharSequence)) ? String.valueOf(queryParameter).length() : 0;
                                    hyVar.p.m24764g().m24930a(7, "_ev", a3, i);
                                } else {
                                    hyVar.mo4739m();
                                    Object a4 = jl.m24913a(str, queryParameter);
                                    if (a4 != null) {
                                        hyVar.m24775a(str2, str, a2, a4);
                                    }
                                }
                            } else {
                                hyVar.m24775a(str2, str, a2, null);
                            }
                        }
                    } else {
                        return;
                    }
                }
            }
        } catch (Throwable th) {
            this.f26982a.mo4742p().f26845d.m24653a("Throwable caught in onActivityCreated", th);
        }
        ig h = this.f26982a.mo4734h();
        if (bundle != null) {
            Bundle bundle2 = bundle.getBundle("com.google.firebase.analytics.screen_service");
            if (bundle2 != null) {
                ij a5 = h.m24799a(activity);
                a5.d = bundle2.getLong("id");
                a5.b = bundle2.getString("name");
                a5.c = bundle2.getString("referrer_name");
            }
        }
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }

    public final void onActivityDestroyed(Activity activity) {
        this.f26982a.mo4734h().f26987e.remove(activity);
    }

    public final void onActivityPaused(Activity activity) {
        hy h = this.f26982a.mo4734h();
        ij a = h.m24799a(activity);
        h.f26985c = h.f26984b;
        h.f26986d = h.mo4735i().mo4630b();
        h.f26984b = null;
        h.mo4741o().m24733a(new ii(h, a));
        h = this.f26982a.mo4740n();
        h.mo4741o().m24733a(new jg(h, h.mo4735i().mo4630b()));
    }

    public final void onActivityResumed(Activity activity) {
        C5312g c5312g;
        int i;
        hy h = this.f26982a.mo4734h();
        ij a = h.m24799a(activity);
        C5312g c5312g2 = null;
        if (h.f26984b != null) {
            c5312g2 = h.f26984b;
        } else if (h.f26985c != null && Math.abs(h.mo4735i().mo4630b() - h.f26986d) < 1000) {
            c5312g2 = h.f26985c;
        }
        if (c5312g2 != null) {
            c5312g = new C5312g(c5312g2);
        }
        int i2 = 1;
        try {
            Iterator it = h.f26988f.iterator();
            while (it.hasNext()) {
                try {
                    i2 &= ((C5343f) it.next()).m26065a();
                } catch (Exception e) {
                    h.mo4742p().f26845d.m24653a("onScreenChangeCallback threw exception", e);
                }
            }
            i = i2;
        } catch (Exception e2) {
            Exception exception = e2;
            i = i2;
            h.mo4742p().f26845d.m24653a("onScreenChangeCallback loop threw exception", exception);
        }
        c5312g = h.f26984b == null ? h.f26985c : h.f26984b;
        if (i != 0) {
            if (a.c == null) {
                a.c = ig.m24796a(activity.getClass().getCanonicalName());
            }
            c5312g2 = new ij(a);
            h.f26985c = h.f26984b;
            h.f26986d = h.mo4735i().mo4630b();
            h.f26984b = c5312g2;
            h.mo4741o().m24733a(new ih(h, c5312g, c5312g2));
        }
        hy c = h.mo4729c();
        c.mo4741o().m24733a(new gf(c, c.mo4735i().mo4630b()));
        c = this.f26982a.mo4740n();
        c.mo4741o().m24733a(new jf(c, c.mo4735i().mo4630b()));
        return;
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        ig h = this.f26982a.mo4734h();
        if (bundle != null) {
            ij ijVar = (ij) h.f26987e.get(activity);
            if (ijVar != null) {
                Bundle bundle2 = new Bundle();
                bundle2.putLong("id", ijVar.d);
                bundle2.putString("name", ijVar.b);
                bundle2.putString("referrer_name", ijVar.c);
                bundle.putBundle("com.google.firebase.analytics.screen_service", bundle2);
            }
        }
    }
}
