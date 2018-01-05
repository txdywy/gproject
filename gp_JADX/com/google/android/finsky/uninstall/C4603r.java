package com.google.android.finsky.uninstall;

import android.os.AsyncTask;
import android.text.TextUtils;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.by.C2206c;
import com.google.android.finsky.cn.C2322b;
import com.google.android.finsky.p107l.C3646a;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

final class C4603r extends AsyncTask {
    public C3646a f23650a = C1473m.f7980a.mo2029I();
    public C2206c f23651b = C1473m.f7980a.ah();
    public final /* synthetic */ C4597k f23652c;

    C4603r(C4597k c4597k) {
        this.f23652c = c4597k;
    }

    protected final /* synthetic */ void onPostExecute(Object obj) {
        Map map = (Map) obj;
        if (this.f23652c.f23635k == null) {
            this.f23652c.f23635k = new HashMap();
        }
        Set hashSet = new HashSet();
        CharSequence charSequence = this.f23652c.f23633i.m14625N().f13171k;
        for (Set<String> it : map.values()) {
            for (String str : it) {
                C2322b a = this.f23650a.f18023c.mo2854a(str);
                if (!(a == null || a.f11424i || a.f11422g || TextUtils.equals(str, "com.google.android.instantapps.supervisor") || TextUtils.equals(str, charSequence) || hashSet.contains(str))) {
                    hashSet.add(str);
                    this.f23652c.f23635k.put(str, new C4604s(str));
                }
            }
        }
        C4597k c4597k = this.f23652c;
        Iterator it2 = hashSet.iterator();
        c4597k.m21404a(it2, new C4600n(c4597k, it2));
        this.f23652c.m21405a(hashSet);
    }

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        Map a = this.f23650a.m17246a(this.f23651b, false);
        for (Set remove : a.values()) {
            remove.remove("com.google.android.gms");
        }
        return a;
    }
}
