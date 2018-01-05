package com.google.android.play.search;

import android.animation.Animator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.view.d;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.ViewAnimationUtils;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import com.google.android.play.C6361i;
import com.google.android.play.C6383k;
import com.google.android.play.f;
import com.google.android.play.g;
import com.google.android.play.image.w;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;
import java.util.List;

public class PlaySearch extends FrameLayout implements d, OnFocusChangeListener, C6407o {
    public static final boolean f32272m = (VERSION.SDK_INT >= 21);
    public static final int f32273n = f.ic_searchbox_google;
    public static final int f32274o = C6361i.play_accessibility_search_plate_search_button;
    public int f32275A;
    public int f32276B;
    public C6407o f32277p;
    public PlaySearchPlate f32278q;
    public PlaySearchSuggestionsList f32279r;
    public C6420m f32280s;
    public Point f32281t;
    public View f32282u;
    public View f32283v;
    public CharSequence f32284w;
    public Drawable f32285x;
    public int f32286y;
    public int f32287z;

    public PlaySearch(Context context) {
        this(context, null);
    }

    public PlaySearch(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C6383k.PlaySearch);
        Drawable drawable = obtainStyledAttributes.getDrawable(C6383k.PlaySearch_idleBackgroundSrc);
        if (drawable == null) {
            drawable = getResources().getDrawable(f32273n);
        }
        this.f32285x = drawable;
        CharSequence text = obtainStyledAttributes.getText(C6383k.PlaySearch_idleBackgroundContentDescription);
        obtainStyledAttributes.recycle();
        if (text == null) {
            text = context.getText(f32274o);
        }
        this.f32284w = text;
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.f32278q = (PlaySearchPlate) findViewById(g.play_search_plate);
        this.f32279r = (PlaySearchSuggestionsList) findViewById(g.play_search_suggestions_list);
        this.f32282u = findViewById(g.play_search_overlay);
        this.f32283v = findViewById(g.play_search_container);
        this.f32282u.setOnClickListener(new C6412e(this));
        this.f32280s = new C6420m();
        this.f32280s.m29442a((C6407o) this);
        this.f32278q.setPlaySearchController(this.f32280s);
        this.f32279r.setPlaySearchController(this.f32280s);
        PlaySearchPlate playSearchPlate = this.f32278q;
        int focusViewId = this.f32279r.getFocusViewId();
        PlaySearchPlateTextContainer playSearchPlateTextContainer = playSearchPlate.f32307b;
        playSearchPlateTextContainer.f32314f.setOnFocusChangeListener(this);
        playSearchPlateTextContainer.f32314f.setNextFocusDownId(focusViewId);
        PlaySearchSuggestionsList playSearchSuggestionsList = this.f32279r;
        focusViewId = this.f32278q.getFocusViewId();
        playSearchSuggestionsList.f32320d.setOnFocusChangeListener(this);
        playSearchSuggestionsList.f32320d.setNextFocusUpId(focusViewId);
        m29353b();
    }

    private final void m29353b() {
        this.f32278q.setIdleBackgroundDrawable(this.f32285x);
        this.f32278q.setIdleContentDescription(this.f32284w);
    }

    public void onFocusChange(View view, boolean z) {
        if (!z) {
            post(new C6413f(this));
        }
    }

    public final void m29357a(w wVar) {
        this.f32279r.setBitmapLoader(wVar);
    }

    public void setAdapter(C6419l c6419l) {
        this.f32279r.setAdapter(c6419l);
    }

    public void setHint(CharSequence charSequence) {
        this.f32278q.setHint(charSequence);
    }

    public void setUseHintOnIdle(boolean z) {
        this.f32278q.setUseHintOnIdle(z);
    }

    public void setIdleBackground(Drawable drawable) {
        if (drawable == null) {
            drawable = getResources().getDrawable(f32273n);
        }
        this.f32285x = drawable;
        m29353b();
    }

    public void setIdleContentDescription(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = getContext().getText(f32274o);
        }
        this.f32284w = charSequence;
        m29353b();
    }

    public void setListener(C6407o c6407o) {
        this.f32277p = c6407o;
    }

    public final void m29361b(int i) {
        this.f32280s.m29441a(i);
    }

    public void setSteadyStateMode(int i) {
        if (i == 1 || i == 2) {
            this.f32280s.f32363c = i;
            return;
        }
        throw new UnsupportedOperationException("Unsupported search box steady state mode");
    }

    public int getSteadyStateMode() {
        return this.f32280s.f32363c;
    }

    public void setIdleModeDrawerIconState(int i) {
        this.f32278q.setIdleModeDrawerIconState(i);
    }

    public void setBurgerMenuOpenDescription(int i) {
        this.f32278q.setBurgerMenuOpenDescription(i);
    }

    public void setQuery(String str) {
        this.f32280s.m29443a(str, true);
    }

    public String getQuery() {
        return this.f32280s.f32364d;
    }

    public void setSuggestions(List list) {
        this.f32279r.setSuggestions(list);
    }

    public int getMode() {
        return this.f32280s.f32362b;
    }

    public void setOnNavButtonClickListener(OnClickListener onClickListener) {
        this.f32280s.f32365e = onClickListener;
    }

    public void mo5428a(String str, boolean z) {
        if (this.f32277p != null) {
            this.f32277p.mo5428a(str, z);
        }
    }

    public void mo5425a(int i) {
        boolean z;
        boolean z2 = false;
        if (this.f32277p != null) {
            this.f32277p.mo5425a(i);
        }
        if (i == 3) {
            z = true;
        } else {
            z = false;
        }
        if (z || i == 2) {
            z2 = true;
        }
        m29352a(z, z2);
    }

    public void mo5427a(String str) {
        if (this.f32277p != null) {
            this.f32277p.mo5427a(str);
        }
    }

    public void mo5426a(C6429w c6429w) {
        if (this.f32277p != null) {
            this.f32277p.mo5426a(c6429w);
        }
    }

    public final boolean mo5429b(C6429w c6429w) {
        if (this.f32277p != null) {
            return this.f32277p.mo5429b(c6429w);
        }
        return false;
    }

    public void onActionViewExpanded() {
        setVisibility(0);
        if (f32272m) {
            View view = (View) getParent();
            if (view != null && this.f32283v != null && this.f32283v.isAttachedToWindow()) {
                Point a = m29354a();
                Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(this.f32283v, a.x, a.y, 0.0f, (float) view.getWidth());
                createCircularReveal.setDuration(300);
                this.f32280s.m29446b();
                createCircularReveal.addListener(new C6415h(this));
                createCircularReveal.start();
                return;
            }
            return;
        }
        m29361b(3);
    }

    public void onActionViewCollapsed() {
        this.f32280s.m29446b();
    }

    public void setRevealCenter(Point point) {
        this.f32281t = new Point(point);
    }

    public final void m29356a(int i, int i2, int i3, int i4, boolean z) {
        this.f32286y = i;
        this.f32275A = i2;
        this.f32287z = i3;
        this.f32276B = i4;
        if (z) {
            requestLayout();
        }
    }

    public int getSearchPlateMarginLeft() {
        return this.f32286y;
    }

    public int getSearchPlateMarginRight() {
        return this.f32287z;
    }

    public int getSearchPlateMarginTop() {
        return this.f32275A;
    }

    public int getSearchPlateMarginBottom() {
        return this.f32276B;
    }

    final Point m29354a() {
        if (this.f32281t != null) {
            Point point = new Point(this.f32281t);
            Rect rect = new Rect();
            Point point2 = new Point();
            getGlobalVisibleRect(rect, point2);
            point.offset(-point2.x, -point2.y);
            return point;
        }
        View view = (View) getParent();
        return new Point(view.getRight() - (view.getHeight() / 2), (view.getBottom() + view.getTop()) / 2);
    }

    private final void m29352a(boolean z, boolean z2) {
        float f = 1.0f;
        if (this.f32282u != null) {
            float f2;
            if (z) {
                this.f32282u.setVisibility(0);
            } else if (this.f32282u.getVisibility() == 8) {
                return;
            } else {
                if (!(z || z2)) {
                    this.f32282u.setVisibility(8);
                    return;
                }
            }
            if (z) {
                f2 = 0.0f;
            } else {
                f2 = 1.0f;
            }
            if (!z) {
                f = 0.0f;
            }
            Animation alphaAnimation = new AlphaAnimation(f2, f);
            alphaAnimation.setDuration(300);
            alphaAnimation.setAnimationListener(new C6417j(this, z));
            this.f32282u.startAnimation(alphaAnimation);
        }
    }

    protected void onDetachedFromWindow() {
        m29352a(false, false);
        super.onDetachedFromWindow();
    }

    protected void onMeasure(int i, int i2) {
        int i3 = 0;
        int size = MeasureSpec.getSize(i);
        int size2 = MeasureSpec.getSize(i2);
        if (size2 == 0 && MeasureSpec.getMode(i2) == 0) {
            size2 = getContext().getResources().getDisplayMetrics().heightPixels;
        }
        this.f32283v.measure(MeasureSpec.makeMeasureSpec((size - this.f32286y) - this.f32287z, MemoryMappedFileBuffer.DEFAULT_SIZE), 0);
        if (this.f32282u.getVisibility() == 8) {
            i3 = 1;
        }
        if (i3 == 0) {
            this.f32282u.measure(MeasureSpec.makeMeasureSpec(size, MemoryMappedFileBuffer.DEFAULT_SIZE), MeasureSpec.makeMeasureSpec(size2, MemoryMappedFileBuffer.DEFAULT_SIZE));
        }
        if (i3 != 0) {
            size2 = (this.f32283v.getMeasuredHeight() + this.f32275A) + this.f32276B;
        }
        setMeasuredDimension(size, size2);
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.f32282u.getVisibility() != 8) {
            this.f32282u.layout(0, 0, this.f32282u.getMeasuredWidth(), this.f32282u.getMeasuredHeight());
        }
        this.f32283v.layout(this.f32286y, this.f32275A, this.f32286y + this.f32283v.getMeasuredWidth(), this.f32275A + this.f32283v.getMeasuredHeight());
    }

    protected Parcelable onSaveInstanceState() {
        Parcelable bundle = new Bundle();
        bundle.putParcelable("play_search.parent_instance_state", super.onSaveInstanceState());
        if (this.f32280s != null) {
            bundle.putInt("play_search.mode_state", getMode());
            bundle.putString("play_search.query_state", this.f32280s.f32364d);
        }
        return bundle;
    }

    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            super.onRestoreInstanceState(bundle.getParcelable("play_search.parent_instance_state"));
            int i = bundle.getInt("play_search.mode_state", -1);
            if (i >= 0) {
                m29361b(i);
            }
            String string = bundle.getString("play_search.query_state");
            if (string != null) {
                setQuery(string);
                return;
            }
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }
}
