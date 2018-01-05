package com.google.android.finsky.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.google.android.finsky.dfemodel.C1031w;
import com.google.android.finsky.frameworkviews.C1098i;
import com.google.android.finsky.navigationmanager.C3748a;

public abstract class C1099t extends BaseAdapter implements C1031w, C1098i {
    public final LayoutInflater f6972f;
    public final Context f6973g;
    public final C3748a f6974h;
    public int f6975i = 1;

    public C1099t(Context context, C3748a c3748a) {
        this.f6973g = context;
        this.f6974h = c3748a;
        this.f6972f = LayoutInflater.from(context);
    }

    public abstract void mo1430a();

    public abstract String mo1431b();

    public abstract boolean mo1432c();

    public long getItemId(int i) {
        return (long) i;
    }

    public final View m6775a(int i, ViewGroup viewGroup) {
        return this.f6972f.inflate(i, viewGroup, false);
    }

    private final void mo1429a(int i) {
        this.f6975i = i;
        notifyDataSetChanged();
    }

    public void m_() {
        if (mo1432c()) {
            mo1429a(1);
        } else {
            mo1429a(0);
        }
    }

    public final void Q_() {
        if (this.f6975i == 2) {
            mo1430a();
        }
        mo1429a(1);
    }
}
