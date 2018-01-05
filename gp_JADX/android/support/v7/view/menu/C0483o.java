package android.support.v7.view.menu;

import android.support.v7.p040a.C0400g;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

public final class C0483o extends BaseAdapter {
    public static final int f2807a = C0400g.abc_popup_menu_item_layout;
    public C0471p f2808b;
    public int f2809c = -1;
    public boolean f2810d;
    public final boolean f2811e;
    public final LayoutInflater f2812f;

    public C0483o(C0471p c0471p, LayoutInflater layoutInflater, boolean z) {
        this.f2811e = z;
        this.f2812f = layoutInflater;
        this.f2808b = c0471p;
        m2904a();
    }

    public final int getCount() {
        ArrayList j = this.f2811e ? this.f2808b.m2840j() : this.f2808b.m2838h();
        if (this.f2809c < 0) {
            return j.size();
        }
        return j.size() - 1;
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        View inflate;
        if (view == null) {
            inflate = this.f2812f.inflate(f2807a, viewGroup, false);
        } else {
            inflate = view;
        }
        ai aiVar = (ai) inflate;
        if (this.f2810d) {
            ((ListMenuItemView) inflate).setForceShowIcon(true);
        }
        aiVar.mo58a((C0485t) getItem(i));
        return inflate;
    }

    private final void m2904a() {
        C0485t c0485t = this.f2808b.f2738y;
        if (c0485t != null) {
            ArrayList j = this.f2808b.m2840j();
            int size = j.size();
            for (int i = 0; i < size; i++) {
                if (((C0485t) j.get(i)) == c0485t) {
                    this.f2809c = i;
                    return;
                }
            }
        }
        this.f2809c = -1;
    }

    public final void notifyDataSetChanged() {
        m2904a();
        super.notifyDataSetChanged();
    }

    public final /* synthetic */ Object getItem(int i) {
        ArrayList j = this.f2811e ? this.f2808b.m2840j() : this.f2808b.m2838h();
        if (this.f2809c >= 0 && i >= this.f2809c) {
            i++;
        }
        return (C0485t) j.get(i);
    }
}
