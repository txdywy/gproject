package com.google.android.play.search;

import android.content.Context;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.eo;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.Animation;
import android.view.inputmethod.InputMethodManager;
import android.widget.LinearLayout;
import com.google.android.play.e;
import com.google.android.play.g;
import com.google.android.play.image.w;
import java.util.Collections;
import java.util.List;

public class PlaySearchSuggestionsList extends LinearLayout implements C6407o {
    public final int f32317a;
    public final float f32318b;
    public int f32319c;
    public RecyclerView f32320d;
    public C6419l f32321e;
    public C6420m f32322f;
    public eo f32323g;
    public Animation f32324h;
    public int f32325i;
    public boolean f32326j;

    public PlaySearchSuggestionsList(Context context) {
        this(context, null);
    }

    public PlaySearchSuggestionsList(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f32317a = context.getResources().getDimensionPixelOffset(e.play_search_suggestions_list_bottom_margin);
        this.f32318b = getResources().getDisplayMetrics().density;
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.f32320d = (RecyclerView) findViewById(g.suggestion_list_recycler_view);
        RecyclerView recyclerView = this.f32320d;
        getContext();
        recyclerView.setLayoutManager(new C6430x(this));
        setAdapter(new C6425s());
        this.f32320d.setOnTouchListener(new C6431y((InputMethodManager) getContext().getSystemService("input_method")));
        this.f32325i = getContext().getResources().getDisplayMetrics().heightPixels;
    }

    public void setAdapter(C6419l c6419l) {
        if (this.f32323g == null) {
            this.f32323g = new C6432z(this);
        }
        if (this.f32321e != null) {
            this.f32321e.mo5436b().b(this.f32323g);
            this.f32321e.mo5434a(null);
        }
        this.f32321e = c6419l;
        if (this.f32321e != null) {
            this.f32321e.mo5436b().a(this.f32323g);
            this.f32320d.setAdapter(this.f32321e.mo5436b());
            this.f32321e.mo5434a(this.f32322f);
        }
    }

    public void setBitmapLoader(w wVar) {
        this.f32321e.mo5433a(wVar);
    }

    public void setPlaySearchController(C6420m c6420m) {
        if (this.f32322f != null) {
            this.f32322f.m29447b(this);
        }
        this.f32322f = c6420m;
        this.f32322f.m29442a((C6407o) this);
        if (this.f32321e != null) {
            this.f32321e.mo5434a(this.f32322f);
        }
    }

    public void setSuggestions(List list) {
        this.f32321e.mo5435a(list);
    }

    public int getFocusViewId() {
        return this.f32320d.getId();
    }

    final void m29391a() {
        if (this.f32322f != null) {
            int i = this.f32322f.f32362b;
            if (this.f32321e.mo5436b().a() <= 0 || i == 1 || i == 2) {
                m29389a(false);
            } else {
                m29389a(true);
            }
        }
    }

    public final void mo5425a(int i) {
        if (i == 1) {
            m29390b();
        } else {
            m29391a();
        }
    }

    public final void mo5428a(String str, boolean z) {
    }

    public final void mo5427a(String str) {
        m29390b();
    }

    public final void mo5426a(C6429w c6429w) {
        m29390b();
    }

    public final boolean mo5429b(C6429w c6429w) {
        return false;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f32324h != null) {
            this.f32324h.cancel();
            LayoutParams layoutParams = this.f32320d.getLayoutParams();
            layoutParams.height = 0;
            this.f32320d.setLayoutParams(layoutParams);
            this.f32326j = false;
            this.f32320d.setVisibility(8);
            setVisibility(8);
            this.f32320d.layout(0, 0, 0, 0);
        }
    }

    private final void m29390b() {
        if (this.f32321e != null) {
            this.f32321e.mo5435a(Collections.emptyList());
        }
    }

    private final void m29389a(boolean z) {
        int i = 0;
        this.f32326j = z;
        if (this.f32324h != null) {
            this.f32324h.cancel();
        }
        if (z) {
            setVisibility(0);
            this.f32320d.setVisibility(0);
            if (this.f32319c == 0) {
                return;
            }
        }
        int height = this.f32320d.getHeight();
        if (z) {
            this.f32320d.measure(0, MeasureSpec.makeMeasureSpec(this.f32319c, Integer.MIN_VALUE));
            i = this.f32320d.getMeasuredHeight();
        }
        if (height != i) {
            i -= height;
            Animation aaVar = new aa(this, height, i);
            aaVar.setAnimationListener(new ab(this));
            aaVar.setDuration((long) Math.max(50, Math.min(200, (int) (((float) i) / this.f32318b))));
            this.f32324h = aaVar;
            this.f32320d.startAnimation(aaVar);
        }
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f32319c == 0) {
            Rect rect = new Rect();
            getGlobalVisibleRect(rect);
            if (rect.top > 0) {
                this.f32319c = ((this.f32325i - rect.top) - this.f32320d.getTop()) + this.f32317a;
            }
            m29391a();
        }
    }
}
