package com.google.android.libraries.play.entertainment.story;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable.Orientation;
import android.graphics.drawable.TransitionDrawable;
import android.support.v4.p028a.C0216d;
import android.support.v4.p028a.p029a.C0206f;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout.LayoutParams;
import com.google.android.libraries.play.entertainment.C6071d;
import com.google.android.libraries.play.entertainment.C6089g;
import com.google.android.libraries.play.entertainment.p346h.C6090b;
import com.google.android.libraries.play.entertainment.p351m.C6115a;
import com.google.android.libraries.play.entertainment.p351m.C6116b;
import com.google.android.libraries.play.entertainment.p351m.C6122h;
import com.google.android.play.headerlist.PlayHeaderListLayout;
import com.google.android.play.headerlist.i;
import com.google.android.play.p184e.C6312b;

public class StoryFlowLayout extends PlayHeaderListLayout {
    public static final C6090b f30363a = C6090b.m28050a();
    public static final Drawable f30364b = new ColorDrawable(0);
    public final C6312b f30365c;
    public aj f30366d;
    public View f30367e;
    public int f30368f;
    public Drawable f30369h;
    public boolean f30370i;

    public StoryFlowLayout(Context context) {
        this(context, null);
    }

    public StoryFlowLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public StoryFlowLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f30369h = f30364b;
        this.f30365c = new C6312b(new ak(this), context, C6115a.m28097a(21));
    }

    public final void m28179a(i iVar) {
        C6116b.m28106b(iVar instanceof aj);
        this.f30366d = (aj) iVar;
        super.a(this.f30366d);
        this.f30368f = this.f30366d.t();
        aj ajVar = this.f30366d;
        int b = C0206f.m1066b(ajVar.f.getResources(), C6071d.pe__translucent_status_bar_color, ajVar.f.getTheme());
        this.f30369h = new GradientDrawable(Orientation.TOP_BOTTOM, new int[]{b, 0});
        setFloatingControlsBackground(new ColorDrawable(C0216d.m1116c(this.f30366d.f, C6071d.pe__default_action_bar_color)));
        this.f30370i = false;
        C6122h.m28132a(getToolbar(), this.f30369h);
    }

    final View m28180b() {
        if (this.f30367e == null) {
            this.f30367e = findViewById(C6089g.content_container);
        }
        return this.f30367e;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f30365c.m28933a(motionEvent) || super.onInterceptTouchEvent(motionEvent);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f30365c.m28934b(motionEvent) || super.onTouchEvent(motionEvent);
    }

    @TargetApi(21)
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        WindowInsets onApplyWindowInsets = super.onApplyWindowInsets(windowInsets);
        if (!(this.f30366d == null || !this.f30366d.l() || getStatusBarHeight() == 0)) {
            LayoutParams layoutParams = (LayoutParams) m28180b().getLayoutParams();
            layoutParams.topMargin = 0;
            m28180b().setLayoutParams(layoutParams);
        }
        return onApplyWindowInsets;
    }

    protected final boolean m28181b(ViewGroup viewGroup) {
        if (viewGroup instanceof RecyclerView) {
            return viewGroup.getChildCount() != 0;
        } else {
            return super.b(viewGroup);
        }
    }

    protected final View m28182c(ViewGroup viewGroup) {
        f30363a.m28055a(new Throwable(), "Stray call to tryFindHeaderSpacerView", new Object[0]);
        return null;
    }

    private final int m28177h() {
        if (this.f30366d == null || !this.f30366d.l()) {
            return 0;
        }
        return getStatusBarHeight();
    }

    public final int m28184d(ViewGroup viewGroup) {
        if (!(viewGroup instanceof RecyclerView)) {
            return super.d(viewGroup);
        }
        if (viewGroup.getChildCount() != 0) {
            View childAt = viewGroup.getChildAt(0);
            if (RecyclerView.m262d(childAt) == 0) {
                return (-childAt.getTop()) + m28177h();
            }
        }
        return -1;
    }

    public final int m28178a(ViewGroup viewGroup) {
        if (!(viewGroup instanceof RecyclerView)) {
            return super.a(viewGroup);
        }
        if (viewGroup.getChildCount() != 0) {
            View childAt = viewGroup.getChildAt(0);
            if (RecyclerView.m262d(childAt) == 0) {
                return (childAt.getTop() + this.f30368f) - m28177h();
            }
        }
        return -1;
    }

    protected final void m28183c() {
        super.c();
        if (this.f30370i != e()) {
            this.f30370i = e();
            Drawable drawable = this.f30370i ? this.f30369h : f30364b;
            Drawable drawable2 = this.f30370i ? f30364b : this.f30369h;
            Drawable transitionDrawable = new TransitionDrawable(new Drawable[]{drawable, drawable2});
            transitionDrawable.setCrossFadeEnabled(true);
            transitionDrawable.startTransition(300);
            C6122h.m28132a(getToolbar(), transitionDrawable);
        }
    }
}
