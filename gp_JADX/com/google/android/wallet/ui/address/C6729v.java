package com.google.android.wallet.ui.address;

import android.text.TextUtils;
import android.util.Log;
import android.widget.Filter;
import android.widget.Filter.FilterResults;
import com.google.android.wallet.common.p376a.C6548a;
import com.google.android.wallet.common.p376a.C6549b;
import com.google.android.wallet.common.p376a.C6550c;
import com.google.android.wallet.common.p376a.C6551d;
import com.google.p440g.p441a.p442a.C7147b;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;

final class C6729v extends Filter {
    public final /* synthetic */ C6728u f33193a;

    C6729v(C6728u c6728u) {
        this.f33193a = c6728u;
    }

    private final ArrayList m30464a(CharSequence charSequence) {
        if (charSequence != null) {
            for (C6550c c6550c : this.f33193a.f33187h) {
                try {
                    ArrayList a = m30465a(c6550c.mo5512a(charSequence, this.f33193a.f33184e, this.f33193a.f33185f, this.f33193a.f33182c, this.f33193a.f33183d), c6550c.mo5511a());
                    if (!(a == null || a.isEmpty())) {
                        return a;
                    }
                } catch (Throwable th) {
                    String str = "AddressSourceResultAdap";
                    String str2 = "Could not fetch addresses from ";
                    String valueOf = String.valueOf(c6550c.mo5511a());
                    Log.e(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), th);
                }
            }
        }
        return new ArrayList();
    }

    private final ArrayList m30465a(List list, String str) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (C6551d c6551d : list) {
            if (c6551d.f32648e != null) {
                if (m30466a(c6551d.f32648e)) {
                    continue;
                } else if (!m30467b(c6551d.f32648e)) {
                    CharSequence charSequence = c6551d.f32647d;
                    if (!(TextUtils.isEmpty(charSequence) || linkedHashMap.containsKey(charSequence))) {
                        linkedHashMap.put(charSequence, Integer.valueOf(arrayList.size()));
                    }
                }
            }
            if (TextUtils.isEmpty(c6551d.f32649f)) {
                continue;
            } else {
                arrayList.add(c6551d);
                if (arrayList.size() >= C6728u.f33180a) {
                    return arrayList;
                }
                if (!TextUtils.isEmpty(c6551d.f32647d)) {
                    linkedHashMap.put(c6551d.f32647d, Integer.valueOf(-1));
                }
            }
        }
        if (!linkedHashMap.isEmpty()) {
            int i = 0;
            for (Entry entry : linkedHashMap.entrySet()) {
                int intValue = ((Integer) entry.getValue()).intValue();
                if (intValue != -1) {
                    arrayList.add(intValue + i, new C6551d((String) entry.getKey(), str));
                    if (arrayList.size() >= C6728u.f33180a) {
                        return arrayList;
                    }
                    i++;
                }
            }
        }
        return arrayList;
    }

    private final boolean m30466a(C7147b c7147b) {
        if (this.f33193a.f33186g == null || c7147b.f34916r.length == 0) {
            return false;
        }
        boolean z = false;
        for (char c : this.f33193a.f33186g) {
            switch (c) {
                case '1':
                case '2':
                case '3':
                case 'A':
                case 'N':
                    break;
                default:
                    if (C6548a.m29720a(c)) {
                        z = true;
                        if (TextUtils.isEmpty(C6549b.m29722a(c7147b, c))) {
                            break;
                        }
                        return false;
                    }
                    continue;
            }
        }
        return z;
    }

    private final boolean m30467b(C7147b c7147b) {
        if (this.f33193a.f33186g == null) {
            return true;
        }
        for (char c : this.f33193a.f33186g) {
            char c2;
            Object obj;
            if (c2 == 'A') {
                c2 = '1';
            }
            char[] cArr = this.f33193a.f33185f;
            if (cArr != null) {
                for (char c3 : cArr) {
                    if (c3 == c2) {
                        obj = 1;
                        break;
                    }
                }
            }
            obj = null;
            if (obj != null && TextUtils.isEmpty(C6549b.m29722a(c7147b, c2))) {
                return false;
            }
        }
        return true;
    }

    protected final FilterResults performFiltering(CharSequence charSequence) {
        ArrayList a = m30464a(charSequence);
        FilterResults filterResults = new FilterResults();
        filterResults.values = a;
        filterResults.count = a.size();
        return filterResults;
    }

    protected final void publishResults(CharSequence charSequence, FilterResults filterResults) {
        ArrayList arrayList = (ArrayList) filterResults.values;
        this.f33193a.f33192m = charSequence;
        this.f33193a.f33191l = this.f33193a.f33190k;
        this.f33193a.f33190k = arrayList;
        if (this.f33193a.f33190k == null || this.f33193a.f33190k.isEmpty()) {
            this.f33193a.notifyDataSetInvalidated();
        } else {
            this.f33193a.notifyDataSetChanged();
        }
    }

    public final CharSequence convertResultToString(Object obj) {
        if (obj instanceof C6551d) {
            return ((C6551d) obj).f32649f;
        }
        return super.convertResultToString(obj);
    }
}
