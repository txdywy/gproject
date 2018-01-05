package com.google.android.finsky.uninstall;

import android.os.AsyncTask;
import android.text.TextUtils;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.by.C2206c;
import com.google.android.finsky.cn.C2322b;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.p107l.C3646a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

final class ad extends AsyncTask {
    public C3646a f23446a = C1473m.f7980a.mo2029I();
    public C2206c f23447b = C1473m.f7980a.ah();
    public final /* synthetic */ C4605t f23448c;

    ad(C4605t c4605t) {
        this.f23448c = c4605t;
    }

    protected final /* synthetic */ void onPostExecute(Object obj) {
        Map map = (Map) obj;
        if (this.f23448c.f23666k == null) {
            this.f23448c.f23666k = new HashMap();
        }
        Set hashSet = new HashSet();
        List arrayList = new ArrayList();
        ArrayList arrayList2 = this.f23448c.f23664i;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList2.get(i);
            i++;
            arrayList.add(((Document) obj2).m14625N().f13171k);
        }
        for (Set<String> it : map.values()) {
            for (String str : it) {
                C2322b a = this.f23446a.f18023c.mo2854a(str);
                if (!(a == null || a.f11424i || a.f11422g || TextUtils.equals(str, "com.google.android.instantapps.supervisor") || arrayList.contains(str) || hashSet.contains(str))) {
                    hashSet.add(str);
                    this.f23448c.f23666k.put(str, new C4604s(str));
                }
            }
        }
        C4605t c4605t = this.f23448c;
        Iterator it2 = hashSet.iterator();
        c4605t.m21417a(it2, new aa(c4605t, it2));
        this.f23448c.m21418a(hashSet);
    }

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        Map a = this.f23446a.m17246a(this.f23447b, false);
        for (Set remove : a.values()) {
            remove.remove("com.google.android.gms");
        }
        return a;
    }
}
