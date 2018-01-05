package android.support.v7.view.menu;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

public final class C0482n extends BaseAdapter {
    public int f2805a = -1;
    public final /* synthetic */ C0481m f2806b;

    public C0482n(C0481m c0481m) {
        this.f2806b = c0481m;
        m2903a();
    }

    public final int getCount() {
        int size = this.f2806b.f2798c.m2840j().size() - this.f2806b.f2800e;
        return this.f2805a < 0 ? size : size - 1;
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        View inflate;
        if (view == null) {
            inflate = this.f2806b.f2797b.inflate(this.f2806b.f2802g, viewGroup, false);
        } else {
            inflate = view;
        }
        ((ai) inflate).mo58a((C0485t) getItem(i));
        return inflate;
    }

    private final void m2903a() {
        C0485t c0485t = this.f2806b.f2798c.f2738y;
        if (c0485t != null) {
            ArrayList j = this.f2806b.f2798c.m2840j();
            int size = j.size();
            for (int i = 0; i < size; i++) {
                if (((C0485t) j.get(i)) == c0485t) {
                    this.f2805a = i;
                    return;
                }
            }
        }
        this.f2805a = -1;
    }

    public final void notifyDataSetChanged() {
        m2903a();
        super.notifyDataSetChanged();
    }

    public final /* synthetic */ Object getItem(int i) {
        ArrayList j = this.f2806b.f2798c.m2840j();
        int i2 = this.f2806b.f2800e + i;
        if (this.f2805a >= 0 && i2 >= this.f2805a) {
            i2++;
        }
        return (C0485t) j.get(i2);
    }
}
