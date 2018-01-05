package com.android.setupwizardlib.items;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.List;

public class ItemGroup extends AbstractItemHierarchy implements C0614c {
    public List f3958b = new ArrayList();
    public SparseIntArray f3959c = new SparseIntArray();
    public int f3960d = 0;
    public boolean f3961e = false;

    public ItemGroup(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final int mo1027a() {
        m4248b();
        return this.f3960d;
    }

    public final void mo1029a(C0613b c0613b, int i, int i2) {
        List list = this.f3958b;
        int size = list.size();
        int i3 = 0;
        while (i3 < size) {
            if (list.get(i3) == c0613b) {
                break;
            }
            i3++;
        }
        i3 = -1;
        m4248b();
        if (i3 != -1) {
            int size2 = this.f3958b.size();
            int i4 = i3;
            i3 = -1;
            while (i3 < 0 && i4 < size2) {
                size = this.f3959c.get(i4, -1);
                i4++;
                i3 = size;
            }
            if (i3 < 0) {
                i3 = mo1027a();
            }
        } else {
            i3 = -1;
        }
        if (i3 >= 0) {
            m4239a(i3 + i, i2);
            return;
        }
        String valueOf = String.valueOf(c0613b);
        Log.e("ItemGroup", new StringBuilder(String.valueOf(valueOf).length() + 24).append("Unexpected child change ").append(valueOf).toString());
    }

    private final void m4248b() {
        if (this.f3961e) {
            this.f3960d = 0;
            this.f3959c.clear();
            for (int i = 0; i < this.f3958b.size(); i++) {
                C0613b c0613b = (C0613b) this.f3958b.get(i);
                if (c0613b.mo1027a() > 0) {
                    this.f3959c.put(i, this.f3960d);
                }
                this.f3960d = c0613b.mo1027a() + this.f3960d;
            }
            this.f3961e = false;
        }
    }
}
