package com.google.android.finsky.playcard;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v4.view.C0357n;
import android.support.v4.view.ai;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.view.accessibility.AccessibilityManager;
import android.widget.TextView;
import com.android.vending.C0629a;
import com.google.android.finsky.bg.C1602b;
import com.google.android.finsky.frameworkviews.CardBubbleLinearLayout;
import com.google.android.play.p203b.C6266d;
import com.google.android.play.utils.k;
import com.squareup.leakcanary.C7582R;

public class Tooltip extends CardBubbleLinearLayout implements OnTouchListener, OnScrollChangedListener {
    public final boolean f19536a;
    public View f19537b;
    public int f19538c;
    public boolean f19539d;
    public int f19540e;
    public int f19541f;
    public int[] f19542g;
    public int[] f19543h;
    public ct f19544i;

    public Tooltip(Context context) {
        this(context, null);
    }

    public Tooltip(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f19539d = false;
        this.f19542g = new int[2];
        this.f19543h = new int[2];
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0629a.Tooltip);
        this.f19536a = ((AccessibilityManager) context.getSystemService("accessibility")).isEnabled();
        if (!this.f19536a) {
            this.f19540e = obtainStyledAttributes.getInteger(0, 0);
        }
        obtainStyledAttributes.recycle();
        this.f19541f = getResources().getDimensionPixelOffset(C7582R.dimen.play_card_default_inset);
        if (this.f19536a) {
            this.f19538c = getResources().getDimensionPixelSize(C7582R.dimen.preregistrable_games_rewards_tooltip_close_size) + getResources().getDimensionPixelSize(C7582R.dimen.preregistrable_games_rewards_tooltip_close_margin);
            ai.m1829a((View) this, new C1602b(getResources().getString(C7582R.string.preregistration_rewards_tooltip_accessibility_action)));
        }
    }

    public void setAnchorView(View view) {
        this.f19537b = view;
    }

    public void setTooltipText(CharSequence charSequence) {
        ((TextView) findViewById(C7582R.id.tooltip_text)).setText(charSequence);
    }

    public int getCloseButtonSizeAndMargin() {
        return this.f19538c;
    }

    public void setTooltipDismissListener(ct ctVar) {
        this.f19544i = ctVar;
    }

    public ct getTooltipDismissListener() {
        return this.f19544i;
    }

    final void m18470a() {
        this.f19539d = true;
        ViewParent parent = getParent();
        if (parent instanceof ViewGroup) {
            int width;
            int i;
            int min;
            ViewGroup viewGroup = (ViewGroup) parent;
            this.f19537b.getLocationInWindow(this.f19542g);
            getLocationInWindow(this.f19543h);
            C6266d c6266d = (C6266d) getCardViewGroupDelegate();
            int a = C0357n.m2043a(c6266d.mo5366a(this), k.b(getContext()) ? 0 : 1);
            switch (a) {
                case 3:
                    width = ((this.f19542g[0] + this.f19537b.getWidth()) - this.f19543h[0]) - this.f19541f;
                    i = 0;
                    break;
                case 5:
                    width = this.f19541f + ((this.f19542g[0] - this.f19543h[0]) - getWidth());
                    i = 0;
                    break;
                case 48:
                    i = ((this.f19542g[1] + this.f19537b.getHeight()) - this.f19543h[1]) - this.f19541f;
                    width = 0;
                    break;
                case 80:
                    i = ((this.f19542g[1] - this.f19543h[1]) - getHeight()) + this.f19541f;
                    width = 0;
                    break;
                default:
                    throw new IllegalArgumentException("Invalid gravity, must be TOP, BOTTOM, LEFT or RIGHT.");
            }
            switch (a) {
                case 3:
                case 5:
                    min = Math.min(Math.max((this.f19542g[1] + (this.f19537b.getHeight() / 2)) - (this.f19543h[1] + (getHeight() / 2)), (int) (-getY())), (viewGroup.getHeight() - getHeight()) - ((int) getY()));
                    i = width;
                    break;
                case 48:
                case 80:
                    int i2 = i;
                    i = Math.min(Math.max((this.f19542g[0] + (this.f19537b.getWidth() / 2)) - (this.f19543h[0] + (getWidth() / 2)), (int) (-getX())), (viewGroup.getWidth() - getWidth()) - ((int) getX()));
                    min = i2;
                    break;
                default:
                    min = i;
                    i = width;
                    break;
            }
            setTranslationX((float) i);
            setTranslationY((float) min);
            switch (a) {
                case 3:
                case 5:
                    c6266d.mo5367c(this, (this.f19542g[1] + (this.f19537b.getHeight() / 2)) - ((min + this.f19543h[1]) + (getHeight() / 2)));
                    break;
                case 48:
                case 80:
                    c6266d.mo5367c(this, (this.f19542g[0] + (this.f19537b.getWidth() / 2)) - ((this.f19543h[0] + i) + (getWidth() / 2)));
                    break;
            }
            setAlpha(0.0f);
            setVisibility(0);
            animate().alpha(1.0f).setListener(null);
            if (this.f19540e != 0) {
                postDelayed(new cs(this), (long) this.f19540e);
            }
            setOnTouchListener(this);
            return;
        }
        throw new IllegalStateException("Tooltip requires a parent of ViewGroup type");
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        setOnTouchListener(null);
        view.performClick();
        return true;
    }

    public void onScrollChanged() {
        if (!ai.f1848a.mo409s(this.f19537b)) {
            getViewTreeObserver().removeOnScrollChangedListener(this);
            m18471b();
        } else if (!this.f19539d) {
            m18470a();
        }
    }

    public boolean performClick() {
        super.performClick();
        m18472c();
        return true;
    }

    final void m18471b() {
        setVisibility(8);
        ViewParent parent = getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this);
        }
        if (this.f19544i != null) {
            this.f19544i.mo4219a();
        }
    }

    final void m18472c() {
        animate().alpha(0.0f).setListener(new cr(this));
    }
}
