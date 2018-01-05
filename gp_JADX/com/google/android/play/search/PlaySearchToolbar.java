package com.google.android.play.search;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.view.ai;
import android.support.v4.view.g;
import android.support.v4.view.x;
import android.support.v7.widget.Toolbar;
import android.support.v7.widget.hh;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import com.google.android.play.e;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class PlaySearchToolbar extends Toolbar implements x {
    public final Map ac = new HashMap();
    public PlaySearch ad;
    public PlaySearch ae;
    public boolean af;
    public View ag;
    public Drawable ah;
    public g ai;
    public C6407o aj;
    public MenuItem ak;
    public int al;
    public int am;
    public hh an;
    public aj ao;
    public int ap;
    public int aq;
    public int ar;
    public int as;

    public static int m29397a(Context context) {
        return context.getResources().getDimensionPixelSize(e.play_search_toolbar_height);
    }

    public PlaySearchToolbar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Resources resources = getContext().getResources();
        this.al = resources.getDimensionPixelSize(e.play_card_default_inset) + resources.getDimensionPixelSize(e.play_search_toolbar_padding_top);
    }

    public final void m29399a(ai aiVar) {
        int c = aiVar.m29427c();
        this.ad = (PlaySearch) LayoutInflater.from(getContext()).inflate(aiVar.m29426b(), this, false);
        this.an = new hh((byte) 0);
        this.ad.m29356a(c, this.al, c, 0, true);
        PlaySearch playSearch = this.ad;
        if (aiVar.f32342b == null) {
            aiVar.f32342b = new C6425s();
        }
        playSearch.setAdapter(aiVar.f32342b);
        this.ad.m29357a(aiVar.m29424a());
        this.ad.setUseHintOnIdle(false);
        this.ad.setSteadyStateMode(1);
        this.ad.f32280s.m29446b();
        this.ad.setListener(new ad(this));
        this.ah = getBackground();
        this.ae = aiVar.m29425a(this);
        playSearch = this.ae;
        if (aiVar.f32343c == null) {
            aiVar.f32343c = new C6425s();
        }
        playSearch.setAdapter(aiVar.f32343c);
        this.ae.m29357a(aiVar.m29424a());
        this.ae.setUseHintOnIdle(false);
        this.ae.setSteadyStateMode(2);
        this.ae.f32280s.m29446b();
        this.ae.setListener(new ae(this));
    }

    public void setIdleModeDrawerIconState(int i) {
        this.ad.setIdleModeDrawerIconState(i);
    }

    public boolean m29403h() {
        return false;
    }

    public void m29400a(boolean z, int i) {
        if (z != this.af || i != this.ad.getSteadyStateMode()) {
            if (z) {
                if (d()) {
                    e();
                }
                this.ad.setSteadyStateMode(i);
                this.ad.f32280s.m29446b();
                if (this.ad.getParent() == null) {
                    addView(this.ad, this.an);
                }
            } else if (this.ad.getParent() == this) {
                this.ad.f32280s.m29446b();
                removeView(this.ad);
            }
            if (this.af != z) {
                this.af = z;
                super.setBackgroundDrawable(this.af ? null : this.ah);
            }
            m29407m();
        }
    }

    public void setPlaySearchListener(C6407o c6407o) {
        this.aj = c6407o;
    }

    public void setPlaySearchToolbarActionListener(aj ajVar) {
        this.ao = ajVar;
    }

    public void setQuery(String str) {
        this.ad.setQuery(str);
    }

    public String getQuery() {
        PlaySearch activeSearchView = getActiveSearchView();
        if (activeSearchView != null) {
            return activeSearchView.getQuery();
        }
        return null;
    }

    protected PlaySearch getActiveSearchView() {
        return d() ? this.ae : this.ad;
    }

    public void setSuggestions(List list) {
        getActiveSearchView().setSuggestions(list);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        this.ah = drawable;
        if (this.af) {
            drawable = null;
        }
        super.setBackgroundDrawable(drawable);
    }

    public void setNavigationOnClickListener(OnClickListener onClickListener) {
        super.setNavigationOnClickListener(onClickListener);
        this.ad.setOnNavButtonClickListener(new ag(this, onClickListener));
    }

    public final boolean m29406l() {
        return this.af || d();
    }

    public PlaySearch getSearchView() {
        return this.ad;
    }

    public PlaySearch getActionView() {
        return this.ae;
    }

    public void m29404i() {
        if (this.ao != null) {
            this.ao.m29428c();
        }
    }

    public void m29405j() {
        if (this.ao != null) {
            this.ao.m29429d();
        }
    }

    protected Parcelable onSaveInstanceState() {
        Parcelable bundle = new Bundle();
        bundle.putParcelable("play_search_toolbar.parent_instance_state", super.onSaveInstanceState());
        bundle.putInt("play_search_toolbar.expanded_menu_item_id", this.am);
        bundle.putParcelable("play_search_toolbar.search_view_state", this.ad.onSaveInstanceState());
        return bundle;
    }

    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            this.am = bundle.getInt("play_search_toolbar.expanded_menu_item_id");
            this.ad.onRestoreInstanceState(bundle.getParcelable("play_search_toolbar.search_view_state"));
            super.onRestoreInstanceState(bundle.getParcelable("play_search_toolbar.parent_instance_state"));
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    public void onMeasure(int i, int i2) {
        int i3 = 0;
        if (m29406l()) {
            if (d()) {
                hh hhVar = (hh) this.ae.getLayoutParams();
                if (hhVar.width != -1) {
                    hhVar.width = -1;
                    this.ae.setLayoutParams(hhVar);
                }
            }
            View activeSearchView = getActiveSearchView();
            for (int i4 = 0; i4 < getChildCount(); i4++) {
                View childAt = getChildAt(i4);
                if (!(childAt == null || childAt == activeSearchView || childAt.getVisibility() == 8)) {
                    this.ac.put(childAt, Integer.valueOf(childAt.getVisibility()));
                    childAt.setVisibility(8);
                }
            }
        } else if (this.ac.size() != 0) {
            for (Entry entry : this.ac.entrySet()) {
                if (entry.getKey() != null) {
                    ((View) entry.getKey()).setVisibility(((Integer) entry.getValue()).intValue());
                }
            }
            this.ac.clear();
        }
        PlaySearch playSearch = this.ad;
        if (!this.af) {
            i3 = 8;
        }
        playSearch.setVisibility(i3);
        super.onMeasure(i, i2);
    }

    final void m29407m() {
        m29398a(m29406l());
    }

    private final void m29398a(boolean z) {
        LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            int i;
            int i2;
            if (z) {
                i = -2;
            } else {
                i = m29397a(getContext());
            }
            if (z) {
                i2 = 0;
            } else {
                i2 = m29397a(getContext());
            }
            if (!(layoutParams.height == i && ai.a.g(this) == i2)) {
                layoutParams.height = i;
                setMinimumHeight(i2);
            }
            if (z) {
                i2 = ai.a.l(this);
                i = ai.a.m(this);
                if (i2 != 0) {
                    this.ap = i2;
                }
                if (i != 0) {
                    this.aq = i;
                }
                if (getPaddingTop() != 0) {
                    this.ar = getPaddingTop();
                }
                if (getPaddingBottom() != 0) {
                    this.as = getPaddingBottom();
                }
                setPadding(0, 0, 0, 0);
                return;
            }
            ai.a(this, this.ap, this.ar, this.aq, this.as);
        }
    }

    public final boolean m29402a(MenuItem menuItem) {
        if (VERSION.SDK_INT >= 21) {
            View findViewById = findViewById(menuItem.getItemId());
            if (findViewById != null) {
                Rect rect = new Rect();
                findViewById.getGlobalVisibleRect(rect);
                this.ae.setRevealCenter(new Point(rect.centerX(), rect.centerY()));
            }
        }
        this.am = menuItem.getItemId();
        m29398a(true);
        m29404i();
        return true;
    }

    public final boolean m29401a() {
        this.am = -1;
        return true;
    }
}
