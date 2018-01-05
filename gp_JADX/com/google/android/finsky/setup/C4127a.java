package com.google.android.finsky.setup;

import android.content.Context;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.CheckedTextView;
import android.widget.ListView;
import com.google.wireless.android.finsky.dfe.nano.fp;

public final class C4127a implements OnItemClickListener {
    public final fp[] f20752a;
    public boolean[] f20753b;
    public ListView f20754c;
    public int f20755d;

    public C4127a(fp[] fpVarArr) {
        this.f20752a = fpVarArr;
    }

    final void m19182a(boolean[] zArr) {
        this.f20753b = zArr;
        m19180a();
    }

    final void m19180a() {
        int i = 0;
        this.f20755d = 0;
        while (i < this.f20753b.length) {
            if (this.f20753b[i]) {
                this.f20755d++;
            }
            i++;
        }
    }

    public final void m19181a(Context context, ListView listView) {
        boolean z;
        this.f20754c = listView;
        listView.setAdapter(new C4135b(context, this.f20752a));
        for (int i = 0; i < this.f20753b.length; i++) {
            this.f20754c.setItemChecked(i + 1, this.f20753b[i]);
        }
        if (this.f20755d == this.f20753b.length) {
            z = true;
        } else {
            z = false;
        }
        listView.setItemChecked(0, z);
        listView.setOnItemClickListener(this);
    }

    public final fp[] m19183b() {
        int i = 0;
        fp[] fpVarArr = new fp[this.f20755d];
        for (int i2 = 0; i2 < this.f20752a.length; i2++) {
            if (this.f20753b[i2]) {
                int i3 = i + 1;
                fpVarArr[i] = this.f20752a[i2];
                i = i3;
            }
        }
        return fpVarArr;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        boolean z = true;
        int i2 = 0;
        boolean isChecked = ((CheckedTextView) view).isChecked();
        if (i <= 0) {
            for (int i3 = 0; i3 < this.f20753b.length; i3++) {
                this.f20754c.setItemChecked(i3 + 1, isChecked);
                this.f20753b[i3] = isChecked;
            }
            if (isChecked) {
                i2 = this.f20753b.length;
            }
            this.f20755d = i2;
            return;
        }
        this.f20753b[i - 1] = isChecked;
        this.f20755d = (isChecked ? 1 : -1) + this.f20755d;
        ListView listView = this.f20754c;
        if (this.f20755d != this.f20753b.length) {
            z = false;
        }
        listView.setItemChecked(0, z);
    }
}
