package com.google.android.wallet.common.p376a;

import android.content.Context;
import android.support.v4.g.b;
import android.support.v4.h.u;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.google.android.wallet.common.util.C6591c;
import com.google.android.wallet.common.util.C6608t;
import com.google.p440g.p441a.p442a.C7147b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map.Entry;
import java.util.TreeMap;

public abstract class C6558m implements C6550c {
    public final String f32669c;
    public final Context f32670d;
    public ArrayList f32671e;
    public final u f32672f = new u();

    protected C6558m(String str, Context context) {
        this.f32669c = str;
        this.f32670d = context;
    }

    protected abstract int mo5513b();

    protected abstract List mo5514c();

    private final synchronized void m29760e() {
        Collection collection = null;
        synchronized (this) {
            if (this.f32671e == null) {
                try {
                    collection = mo5514c();
                } catch (Throwable th) {
                    Log.e(this.f32669c, "Could not retrieve addresses", th);
                }
                if (collection != null) {
                    this.f32671e = C6553f.m29733a(collection, null);
                } else {
                    this.f32671e = new ArrayList();
                }
            }
        }
    }

    private final ArrayList m29759a(char[] cArr) {
        ArrayList arrayList;
        if (cArr != null) {
            Object str = new String(cArr);
        } else {
            String str2 = "*";
        }
        synchronized (this.f32672f) {
            arrayList = (ArrayList) this.f32672f.get(str);
            if (arrayList == null) {
                ArrayList a = C6553f.m29733a(this.f32671e, cArr);
                int size = a.size();
                for (int i = 0; i < size; i++) {
                    C7147b c7147b = (C7147b) a.get(i);
                    if (c7147b.f34916r.length == 1) {
                        c7147b = (C7147b) C6608t.m29983a(c7147b);
                        c7147b.f34916r = (String[]) C6591c.m29910a(c7147b.f34916r, (Object) "");
                        a.set(i, c7147b);
                    }
                }
                this.f32672f.put(str, a);
                arrayList = a;
            }
        }
        return arrayList;
    }

    public final String mo5511a() {
        return this.f32669c;
    }

    public final List mo5512a(CharSequence charSequence, char c, char[] cArr, int i, String str) {
        if (charSequence == null || charSequence.length() < mo5513b()) {
            return Collections.emptyList();
        }
        if (b.a(this.f32670d.getResources().getConfiguration().locale) == 1) {
            return Collections.emptyList();
        }
        m29760e();
        if (this.f32671e.isEmpty()) {
            return Collections.emptyList();
        }
        List arrayList = new ArrayList();
        String str2 = this.f32669c;
        String a = C6563p.m29793a(i);
        ArrayList a2 = m29759a(cArr);
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        Object obj = c == 'N' ? 1 : null;
        int size = a2.size();
        for (int i2 = 0; i2 < size; i2++) {
            C7147b c7147b = (C7147b) a2.get(i2);
            if (c7147b != null) {
                String a3 = C6549b.m29722a(c7147b, c);
                int a4 = C6564q.m29795a(a3, charSequence);
                if (a4 != -1) {
                    C7147b c7147b2;
                    Object obj2;
                    CharSequence a5;
                    int length = TextUtils.isEmpty(charSequence) ? 0 : charSequence.length();
                    SpannableString a6 = C6564q.m29796a(Collections.singletonList(Pair.create(Integer.valueOf(a4), Integer.valueOf(length))), (CharSequence) a3);
                    if (i != 0) {
                        int i3;
                        if (TextUtils.isEmpty(c7147b.f34899a)) {
                            i3 = 858;
                        } else {
                            i3 = C6563p.m29794b(c7147b.f34899a);
                        }
                        if (i3 == 0 || i3 == 858) {
                            if (i != 858) {
                                c7147b = (C7147b) C6608t.m29983a(c7147b);
                                c7147b.f34899a = a;
                                c7147b2 = c7147b;
                                obj2 = 1;
                                if (!TextUtils.isEmpty(str)) {
                                    if (!TextUtils.isEmpty(c7147b2.f34902d)) {
                                        if (obj2 == null) {
                                            c7147b2 = (C7147b) C6608t.m29983a(c7147b2);
                                        }
                                        c7147b2.f34902d = str;
                                    } else if (!C6553f.m29737a(c7147b2.f34902d, str)) {
                                        if (!(obj == null || treeMap.containsKey(a3))) {
                                            treeMap.put(a3, a6);
                                        }
                                    }
                                }
                                treeMap.put(a3, null);
                                a5 = C6549b.m29724a(c7147b2, C6551d.f32645b, cArr, C6551d.f32644a);
                                arrayList.add(new C6551d(a3, c7147b2, C6564q.m29796a(Collections.singletonList(Pair.create(Integer.valueOf(C6564q.m29795a((String) a5, charSequence)), Integer.valueOf(length))), a5), str2));
                            }
                        } else if (i3 != i) {
                            if (!(obj == null || treeMap.containsKey(a3))) {
                                treeMap.put(a3, a6);
                            }
                        }
                    }
                    c7147b2 = c7147b;
                    obj2 = null;
                    if (TextUtils.isEmpty(str)) {
                        if (!TextUtils.isEmpty(c7147b2.f34902d)) {
                            if (obj2 == null) {
                                c7147b2 = (C7147b) C6608t.m29983a(c7147b2);
                            }
                            c7147b2.f34902d = str;
                        } else if (C6553f.m29737a(c7147b2.f34902d, str)) {
                            treeMap.put(a3, a6);
                        }
                    }
                    treeMap.put(a3, null);
                    a5 = C6549b.m29724a(c7147b2, C6551d.f32645b, cArr, C6551d.f32644a);
                    arrayList.add(new C6551d(a3, c7147b2, C6564q.m29796a(Collections.singletonList(Pair.create(Integer.valueOf(C6564q.m29795a((String) a5, charSequence)), Integer.valueOf(length))), a5), str2));
                }
            }
        }
        for (Entry entry : treeMap.entrySet()) {
            if (entry.getValue() != null) {
                arrayList.add(new C6551d((String) entry.getKey(), (CharSequence) entry.getValue(), str2, null));
            }
        }
        if (mo5515d()) {
            Collections.sort(arrayList, C6551d.f32646c);
        }
        return arrayList;
    }

    protected boolean mo5515d() {
        return true;
    }

    public final C7147b mo5510a(String str, String str2) {
        throw new UnsupportedOperationException(String.valueOf(this.f32669c).concat(" does not use reference identifiers"));
    }
}
