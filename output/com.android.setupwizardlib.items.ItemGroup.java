package com.android.setupwizardlib.items;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.List;

public final class ItemGroup extends AbstractItemHierarchy implements com.android.setupwizardlib.items.c
{

    public List b;
    public SparseIntArray c;
    public int d;
    public boolean e;

    ItemGroup() {
        AbstractItemHierarchy();
        this.b = new ArrayList();
        this.c = new SparseIntArray();
        this.d = 0;
        this.e = 0;
    }

    ItemGroup(Context p0, AttributeSet p1) {
        AbstractItemHierarchy(p0, p1);
        this.b = new ArrayList();
        this.c = new SparseIntArray();
        this.d = 0;
        this.e = 0;
    }

    private final void b() {
        if (this.e != 0) {
            this.d = 0;
            this.c.clear();
            v1 = 0;
            while (v1 < this.b.size()) {
                v0 = (com.android.setupwizardlib.items.b)this.b.get(v1);
                if (v0.a() > 0)
                    this.c.put(v1, this.d);
                this.d = v0.a() + this.d;
                v1 = v1 + 1;
            }
            this.e = 0;
        }
    }

    public final int a() {
        this.b();
        return this.d;
    }

    public final void a(com.android.setupwizardlib.items.b p0, int p1, int p2) {
  7:    v0 = 0;
  8:    if (v0 >= this.b.size()) goto 47;
 14:    if (this.b.get(v0) != p0) goto 44;
 16:    this.b();
 19:    if (v0 == -1) goto 62;
 27:    v2 = v0;
 28:    v0 = -1;
 29:    while (v0 < 0 && v2 < this.b.size()) {
 35:        v3 = this.c.get(v2, -1);
 41:        v2 = v2 + 1;
 42:        v0 = v3;
        }
 43:    goto 49;
 44:    v0 = v0 + 1;
 46:    goto 8;
 47:    v0 = -1;
 48:    goto 16;
 49:    if (v0 < 0)
 51:        v0 = this.a();
 55:    if (v0 >= 0)
 58:        this.a(v0 + p1, p2);
        else {
 66:        v1 = String.valueOf(p0);
 99:        Log.e("ItemGroup", (String.valueOf(v1).length() + 24) + "Unexpected child change " + v1);
        }
 61:    return;
 62:    v0 = -1;
 63:    goto 55;
    }

}
