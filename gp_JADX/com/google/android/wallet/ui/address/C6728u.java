package com.google.android.wallet.ui.address;

import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;
import com.google.android.wallet.a.a;
import com.google.android.wallet.common.p376a.C6548a;
import com.google.android.wallet.common.p376a.C6551d;
import com.google.android.wallet.p383e.C6622f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class C6728u extends BaseAdapter implements Filterable {
    public static final int f33180a = ((Integer) a.h.a()).intValue();
    public final int f33181b;
    public final int f33182c;
    public final String f33183d;
    public final char f33184e;
    public final char[] f33185f;
    public final char[] f33186g;
    public final List f33187h;
    public final LayoutInflater f33188i;
    public C6729v f33189j;
    public ArrayList f33190k;
    public ArrayList f33191l;
    public CharSequence f33192m;

    private static char[] m30463a(char[] cArr) {
        int i = 0;
        while (i < cArr.length && !C6548a.m29720a(cArr[i])) {
            i++;
        }
        if (i < cArr.length) {
            return Arrays.copyOfRange(cArr, i, cArr.length);
        }
        throw new IllegalArgumentException("fields must contain at least one valid field");
    }

    public C6728u(ContextThemeWrapper contextThemeWrapper, int i, int i2, String str, char c, char[] cArr, String str2, List list) {
        if (cArr == null || cArr.length == 0) {
            throw new IllegalArgumentException("remainingFields are required");
        } else if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("addressSources are required");
        } else {
            this.f33181b = i;
            this.f33182c = i2;
            this.f33183d = str;
            this.f33184e = c;
            this.f33185f = C6728u.m30463a(cArr);
            this.f33186g = str2 != null ? str2.toCharArray() : null;
            this.f33187h = new ArrayList(list);
            this.f33188i = LayoutInflater.from(contextThemeWrapper);
            this.f33190k = new ArrayList();
            ArrayList arrayList = new ArrayList();
        }
    }

    public final int getCount() {
        return this.f33190k.size();
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final Filter getFilter() {
        if (this.f33189j == null) {
            this.f33189j = new C6729v(this);
        }
        return this.f33189j;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        return m30462a(i, view, viewGroup);
    }

    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        return m30462a(i, view, viewGroup);
    }

    private final View m30462a(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f33188i.inflate(this.f33181b, viewGroup, false);
        }
        ((TextView) view.findViewById(C6622f.description)).setText(((C6551d) getItem(i)).f32649f);
        return view;
    }

    public final /* synthetic */ Object getItem(int i) {
        return (C6551d) this.f33190k.get(i);
    }
}
