package com.google.android.finsky.stream.controllers.editorschoice.view;

import android.content.Context;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.finsky.cv.p177a.bd;
import com.google.android.finsky.frameworkviews.C2625e;
import com.google.android.finsky.frameworkviews.ae;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.providers.C3947d;
import com.google.android.play.image.C1294w;
import com.google.android.play.image.FifeImageView;
import com.google.android.play.layout.PlayTextView;
import com.google.wireless.android.a.a.a.a.ce;
import com.squareup.leakcanary.C7582R;
import java.util.List;

public class EditorsChoiceV2CardView extends LinearLayout implements OnClickListener, OnGlobalLayoutListener, ad, ae, C2625e {
    public C1294w f22238a;
    public ce f22239b;
    public ad f22240c;
    public PlayTextView f22241d;
    public FifeImageView f22242e;
    public ViewGroup f22243f;
    public PlayTextView f22244g;
    public int f22245h;
    public C4382b f22246i;
    public int f22247j;
    public boolean f22248k;
    public List f22249l;

    public EditorsChoiceV2CardView(Context context) {
        this(context, null);
    }

    public EditorsChoiceV2CardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22239b = C2482j.m13283a(545);
    }

    protected void onFinishInflate() {
        ((C1428a) C3947d.m18649a(C1428a.class)).mo1929a(this);
        super.onFinishInflate();
        this.f22241d = (PlayTextView) findViewById(C7582R.id.editors_choice_v2_card_title);
        this.f22242e = (FifeImageView) findViewById(C7582R.id.banner);
        this.f22243f = (ViewGroup) findViewById(C7582R.id.icon_container);
        this.f22244g = (PlayTextView) findViewById(C7582R.id.last_update_time);
    }

    public final void m20560b() {
        int childCount;
        int i = 1;
        int i2 = 0;
        if (this.f22249l != null) {
            int i3;
            LayoutInflater from = LayoutInflater.from(getContext());
            int size = this.f22249l.size() <= this.f22247j ? this.f22249l.size() : this.f22247j - 1;
            if (size < this.f22249l.size()) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            for (int i4 = 0; i4 < size; i4++) {
                m20558a(from, i4, FifeImageView.class, C7582R.layout.editors_choice_v2_card_icon);
                FifeImageView fifeImageView = (FifeImageView) this.f22243f.getChildAt(i4);
                fifeImageView.setVisibility(0);
                bd bdVar = (bd) this.f22249l.get(i4);
                fifeImageView.a(bdVar.f11860f, bdVar.f11863i, this.f22238a);
            }
            if (i3 != 0) {
                m20558a(from, size, FifeImageView.class, C7582R.layout.editors_choice_v2_more_icons_view);
                TextView textView = (TextView) this.f22243f.getChildAt(size);
                textView.setText("+" + (this.f22249l.size() - size));
                textView.setVisibility(0);
            }
            childCount = this.f22243f.getChildCount() - size;
            if (i3 == 0) {
                i = 0;
            }
            childCount -= i;
        } else {
            childCount = this.f22243f.getChildCount();
        }
        while (i2 < childCount) {
            this.f22243f.getChildAt((this.f22243f.getChildCount() - i2) - 1).setVisibility(8);
            i2++;
        }
    }

    private final void m20558a(LayoutInflater layoutInflater, int i, Class cls, int i2) {
        if (i >= this.f22243f.getChildCount()) {
            layoutInflater.inflate(i2, this.f22243f, true);
        } else if (!cls.isInstance(this.f22243f.getChildAt(i))) {
            this.f22243f.removeViewAt(i);
            this.f22243f.addView(layoutInflater.inflate(i2, this.f22243f, false), i);
        }
    }

    public final void Z_() {
        this.f22242e.a();
        for (int i = 0; i < this.f22243f.getChildCount(); i++) {
            View childAt = this.f22243f.getChildAt(i);
            if (childAt instanceof FifeImageView) {
                ((FifeImageView) childAt).a();
            }
        }
        this.f22246i = null;
        setOnClickListener(null);
    }

    public ce getPlayStoreUiElement() {
        return this.f22239b;
    }

    public ad getParentNode() {
        return this.f22240c;
    }

    public final void mo1219a(ad adVar) {
        throw new IllegalStateException("unwanted children");
    }

    public void onGlobalLayout() {
        if (VERSION.SDK_INT < 16) {
            getViewTreeObserver().removeGlobalOnLayoutListener(this);
        } else {
            getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
        int width = this.f22243f.getWidth();
        int dimensionPixelSize = getResources().getDimensionPixelSize(C7582R.dimen.editors_choice_v2_card_icon_size);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(C7582R.dimen.editors_choice_v2_card_icon_margin_right);
        this.f22247j = (width + dimensionPixelSize2) / (dimensionPixelSize + dimensionPixelSize2);
        if (this.f22248k && this.f22247j > 0) {
            m20560b();
        }
    }

    public void onClick(View view) {
        if (this.f22246i != null) {
            this.f22246i.mo4184a(this, this.f22245h);
        }
    }
}
