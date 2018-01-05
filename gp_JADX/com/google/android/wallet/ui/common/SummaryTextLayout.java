package com.google.android.wallet.ui.common;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.support.v4.widget.bg;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.TouchDelegate;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.wallet.p383e.C6622f;
import com.google.android.wallet.p383e.C6623g;
import com.google.android.wallet.p383e.C6626j;
import com.squareup.haha.perflib.HprofParser;

public class SummaryTextLayout extends LinearLayout implements OnClickListener {
    public FormEditText f33477a;
    public ImageView f33478b;
    public int f33479c;
    public boolean f33480d;
    public ca f33481e;
    public int f33482f = -1;
    public int f33483g = -1;
    public boolean f33484h;
    public boolean f33485i;
    public int f33486j = -1;
    public int f33487k = -1;

    public SummaryTextLayout(Context context) {
        super(context);
        m30688a(context, null);
    }

    public SummaryTextLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m30688a(context, attributeSet);
    }

    public SummaryTextLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m30688a(context, attributeSet);
    }

    private final void m30688a(Context context, AttributeSet attributeSet) {
        CharSequence charSequence;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C6626j.WalletUicSummaryTextLayout);
            String string = obtainStyledAttributes.getString(C6626j.WalletUicSummaryTextLayout_internalUicSummaryHint);
            this.f33486j = obtainStyledAttributes.getResourceId(C6626j.WalletUicSummaryTextLayout_internalUicDarkerSummaryTextStyle, -1);
            this.f33487k = obtainStyledAttributes.getResourceId(C6626j.WalletUicSummaryTextLayout_internalUicLighterSummaryTextStyle, -1);
            obtainStyledAttributes.recycle();
            charSequence = string;
        } else {
            charSequence = null;
        }
        setOrientation(0);
        View inflate = LayoutInflater.from(context).inflate(C6623g.view_summary_text_layout, this, true);
        this.f33477a = (FormEditText) inflate.findViewById(C6622f.summary_text_view_text);
        this.f33478b = (ImageView) inflate.findViewById(C6622f.summary_text_view_edit);
        if (this.f33477a.getPaddingBottom() < this.f33477a.getPaddingTop()) {
            this.f33478b.setPadding(this.f33478b.getPaddingLeft(), (this.f33478b.getPaddingTop() + this.f33477a.getPaddingTop()) - this.f33477a.getPaddingBottom(), this.f33478b.getPaddingRight(), this.f33478b.getPaddingBottom());
        } else {
            this.f33478b.setPadding(this.f33478b.getPaddingLeft(), this.f33478b.getPaddingTop(), this.f33478b.getPaddingRight(), (this.f33478b.getPaddingBottom() + this.f33477a.getPaddingBottom()) - this.f33477a.getPaddingTop());
        }
        this.f33477a.setInputType(524288);
        this.f33477a.setKeyListener(null);
        this.f33477a.setEllipsize(TruncateAt.END);
        m30689b();
        if (!TextUtils.isEmpty(charSequence)) {
            this.f33477a.setHint(charSequence);
        }
        this.f33477a.addTextChangedListener(new cb(this));
        m30691a();
        this.f33477a.setOnClickListener(this);
        this.f33478b.setOnClickListener(this);
    }

    public void setSummaryOnClickListener(ca caVar) {
        this.f33481e = caVar;
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (this.f33477a != null) {
            this.f33477a.setEnabled(z);
        }
        if (this.f33478b != null) {
            this.f33478b.setEnabled(z);
        }
    }

    public void onClick(View view) {
        if (this.f33481e != null) {
            if (view == this.f33478b && this.f33479c == 2) {
                this.f33481e.mo5666b();
            } else {
                this.f33481e.mo5665a();
            }
        }
    }

    public void setEditMode(int i) {
        this.f33479c = i;
        m30691a();
    }

    public void setHint(CharSequence charSequence) {
        this.f33477a.setHint(charSequence);
    }

    public void setText(CharSequence charSequence) {
        this.f33477a.setText(charSequence);
        m30691a();
    }

    public void setText(int i) {
        setText(getContext().getResources().getText(i));
    }

    public CharSequence getText() {
        return this.f33477a.getText();
    }

    public void setUseLighterStyle(boolean z) {
        this.f33485i = z;
        m30689b();
    }

    public void setMultiLine(boolean z) {
        this.f33484h = z;
        m30689b();
    }

    private final void m30689b() {
        if (this.f33477a != null) {
            this.f33477a.setSingleLine(!this.f33484h);
            if (this.f33485i && this.f33487k != -1) {
                bg.a(this.f33477a, this.f33487k);
            } else if (this.f33486j != -1) {
                bg.a(this.f33477a, this.f33486j);
            }
        }
    }

    public void setShouldHideEditImage(boolean z) {
        this.f33480d = z;
        m30690c();
    }

    final void m30691a() {
        if (TextUtils.isEmpty(this.f33477a.getText())) {
            this.f33477a.getBackground().setAlpha(HprofParser.ROOT_UNKNOWN);
            setFocusableInTouchMode(true);
        } else {
            ci.m30863a(this.f33478b, this.f33479c, getContext(), this.f33477a.getHint());
            this.f33477a.getBackground().setAlpha(0);
            setFocusable(false);
        }
        m30690c();
    }

    private final void m30690c() {
        int i;
        ImageView imageView = this.f33478b;
        if (this.f33480d || TextUtils.isEmpty(getText()) || this.f33479c == 3) {
            i = 8;
        } else {
            i = 0;
        }
        imageView.setVisibility(i);
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int i5 = i3 - i;
        int i6 = i4 - i2;
        if (i5 != this.f33482f || i6 != this.f33483g) {
            this.f33482f = i5;
            this.f33483g = i6;
            Rect rect = new Rect();
            rect.top = 0;
            rect.bottom = getHeight();
            if (this.f33477a.getLeft() < this.f33478b.getLeft()) {
                rect.left = this.f33477a.getRight();
                rect.right = getWidth();
            } else {
                rect.left = 0;
                rect.right = this.f33477a.getLeft();
            }
            setTouchDelegate(new TouchDelegate(rect, this.f33478b));
        }
    }
}
