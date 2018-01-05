package com.google.android.wallet.ui.common;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.v7.widget.ad;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.TouchDelegate;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import com.google.android.wallet.common.util.ParcelableProto;
import com.google.android.wallet.p383e.C6617a;
import com.google.android.wallet.p383e.C6623g;
import com.google.p443h.p451c.p457c.p460b.p463b.p464a.C7173a;
import java.util.Locale;

public class LinkView extends ad implements OnClickListener {
    public C7173a f33422d;
    public C6528w f33423e;
    public ViewGroup f33424f;
    public int f33425g = -1;
    public int f33426h = -1;
    public int f33427i;

    public LinkView(Context context) {
        super(context);
        m30651a();
    }

    public LinkView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m30651a();
    }

    public LinkView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m30651a();
    }

    public void setLink(C7173a c7173a) {
        this.f33422d = c7173a;
        setText(c7173a.f35011b.e);
        super.setEnabled(!c7173a.f35015f);
    }

    public void setEventListener(C6528w c6528w) {
        this.f33423e = c6528w;
    }

    public void onClick(View view) {
        if (this.f33422d != null && this.f33423e != null) {
            Bundle bundle = new Bundle();
            bundle.putParcelable("EventListener.EXTRA_LINK_PROTO", ParcelableProto.m29885a(this.f33422d));
            this.f33423e.mo5469a(21, bundle);
        }
    }

    public void setEnabled(boolean z) {
        if (this.f33422d == null || !this.f33422d.f35015f) {
            super.setEnabled(z);
        }
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f33424f != null && m30652a(this.f33422d)) {
            int i5 = i3 - i;
            int i6 = i4 - i2;
            if (i5 != this.f33425g || i6 != this.f33426h) {
                this.f33425g = i5;
                this.f33426h = i6;
                Rect rect = new Rect();
                getDrawingRect(rect);
                this.f33424f.offsetDescendantRectToMyCoords(this, rect);
                rect.top -= this.f33427i;
                rect.bottom += this.f33427i;
                this.f33424f.setTouchDelegate(new TouchDelegate(rect, this));
            }
        }
    }

    private final void m30651a() {
        setOnClickListener(this);
        setGravity(8388627);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{C6617a.internalUicNonFormFieldTextTopBottomMargin});
        this.f33427i = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
    }

    public static LinkView m30650a(C7173a c7173a, Context context, ViewGroup viewGroup, ViewGroup viewGroup2, LayoutInflater layoutInflater, bb bbVar, C6528w c6528w) {
        LinkView linkView;
        switch (c7173a.f35014e) {
            case 1:
                linkView = (LinkView) layoutInflater.inflate(C6623g.view_link_primary, viewGroup, false);
                ci.m30852a(context, (Button) linkView);
                break;
            case 2:
            case 3:
                linkView = (LinkView) layoutInflater.inflate(C6623g.view_link_secondary, viewGroup, false);
                linkView.setTextColor(ci.m30881c(context));
                break;
            case 4:
                linkView = (LinkView) layoutInflater.inflate(C6623g.view_link_text, viewGroup, false);
                linkView.setTextColor(ci.m30881c(context));
                linkView.f33424f = viewGroup2;
                break;
            default:
                throw new IllegalArgumentException(String.format(Locale.US, "Unsupported LinkType=%d", new Object[]{Integer.valueOf(c7173a.f35014e)}));
        }
        linkView.setLink(c7173a);
        linkView.setEventListener(c6528w);
        linkView.setId(bbVar.m30742a());
        return linkView;
    }

    public static boolean m30652a(C7173a c7173a) {
        return c7173a != null && c7173a.f35014e == 4;
    }
}
