package com.google.android.finsky.uninstall.v2a;

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
import java.util.Map;
import java.util.Set;

final class C4623p extends AsyncTask {
    public C3646a f23792a = C1473m.f7980a.mo2029I();
    public C2206c f23793b = C1473m.f7980a.ah();
    public final /* synthetic */ C4613f f23794c;

    C4623p(C4613f c4613f) {
        this.f23794c = c4613f;
    }

    protected final /* synthetic */ void onPostExecute(Object obj) {
        Map map = (Map) obj;
        if (this.f23794c.f23768k == null) {
            this.f23794c.f23768k = new HashMap();
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f23794c.f23766i;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList2.get(i);
            i++;
            arrayList.add(((Document) obj2).m14625N().f13171k);
        }
        for (Set<String> it : map.values()) {
            for (String str : it) {
                C2322b a = this.f23792a.f18023c.mo2854a(str);
                if (!(a == null || a.f11424i || a.f11422g || TextUtils.equals(str, "com.google.android.instantapps.supervisor") || arrayList.contains(str) || hashSet.contains(str))) {
                    hashSet.add(str);
                    this.f23794c.f23768k.put(str, new am(str));
                }
            }
        }
        C4613f c4613f = this.f23794c;
        Iterator it2 = hashSet.iterator();
        c4613f.m21541a(it2, new C4620m(c4613f, it2));
        this.f23794c.m21540a(hashSet);
    }

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        Map a = this.f23792a.m17246a(this.f23793b, false);
        for (Set remove : a.values()) {
            remove.remove("com.google.android.gms");
        }
        return a;
    }
}
