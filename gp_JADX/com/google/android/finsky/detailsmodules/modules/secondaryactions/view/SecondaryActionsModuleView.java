package com.google.android.finsky.detailsmodules.modules.secondaryactions.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.caverock.androidsvg.C0722q;
import com.caverock.androidsvg.as;
import com.google.android.finsky.frameworkviews.AccessibleLinearLayout;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.ad;
import com.google.wireless.android.a.a.a.a.ce;
import com.squareup.leakcanary.C7582R;

public class SecondaryActionsModuleView extends LinearLayout implements OnClickListener, ad {
    public AccessibleLinearLayout f13848a;
    public ImageView f13849b;
    public AccessibleLinearLayout f13850c;
    public ImageView f13851d;
    public AccessibleLinearLayout f13852e;
    public ImageView f13853f;
    public ad f13854g;
    public ad f13855h;
    public ad f13856i;
    public ad f13857j;
    public ad f13858k;
    public ce f13859l;
    public C2606b f13860m;

    public SecondaryActionsModuleView(Context context) {
        this(context, null);
    }

    public SecondaryActionsModuleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f13848a = (AccessibleLinearLayout) findViewById(C7582R.id.wishlist_button);
        this.f13849b = (ImageView) findViewById(C7582R.id.wishlist_button_icon);
        this.f13850c = (AccessibleLinearLayout) findViewById(C7582R.id.share_button);
        this.f13851d = (ImageView) findViewById(C7582R.id.share_button_icon);
        this.f13852e = (AccessibleLinearLayout) findViewById(C7582R.id.gift_button);
        this.f13853f = (ImageView) findViewById(C7582R.id.gift_button_icon);
        this.f13848a.setOnClickListener(this);
        this.f13850c.setOnClickListener(this);
        this.f13852e.setOnClickListener(this);
    }

    public final void m13707a(boolean z, View view, int i, ImageView imageView, int i2) {
        if (z) {
            view.setVisibility(0);
            view.setContentDescription(getResources().getString(i));
            imageView.setImageDrawable(C0722q.m4782a(getResources(), i2, new as()));
            return;
        }
        view.setVisibility(8);
    }

    public void onClick(View view) {
        if (this.f13860m != null) {
            if (view == this.f13848a) {
                this.f13860m.mo2971a(view);
            }
            if (view == this.f13850c) {
                this.f13860m.mo2970a();
            }
            if (view == this.f13852e) {
                this.f13860m.mo2975b();
            }
        }
    }

    public ce getPlayStoreUiElement() {
        if (this.f13859l == null) {
            this.f13859l = C2482j.m13283a(1820);
        }
        return this.f13859l;
    }

    public ad getParentNode() {
        return this.f13858k;
    }

    public final void mo1219a(ad adVar) {
        C2482j.m13291a((ad) this, adVar);
    }
}
