package com.google.android.finsky.layout;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.view.ai;
import android.text.TextUtils;
import android.text.method.ArrowKeyMovementMethod;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.finsky.detailscomponents.DetailsTextBlock;
import com.google.android.finsky.p106a.C0952e;
import com.squareup.leakcanary.C7582R;

public class DetailsExpandedContainer extends LinearLayout implements C0952e {
    public TextView f18104a;
    public DetailsTextBlock f18105b;
    public DetailsTextBlock f18106c;
    public ViewGroup f18107d;
    public DetailsTextBlock f18108e;
    public CharSequence f18109f;
    public CharSequence f18110g;
    public boolean f18111h;

    public DetailsExpandedContainer(Context context) {
        this(context, null);
    }

    public DetailsExpandedContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f18104a = (TextView) findViewById(C7582R.id.details_expanded_callout);
        this.f18104a.setMovementMethod(LinkMovementMethod.getInstance());
        this.f18105b = (DetailsTextBlock) findViewById(C7582R.id.body_container1);
        this.f18106c = (DetailsTextBlock) findViewById(C7582R.id.body_container2);
        this.f18107d = (ViewGroup) findViewById(C7582R.id.details_expanded_extras);
        this.f18104a.setTextIsSelectable(true);
        this.f18104a.setAutoLinkMask(15);
        this.f18104a.setMovementMethod(ArrowKeyMovementMethod.getInstance());
        this.f18105b.setBodyTextIsSelectable(true);
        this.f18106c.setBodyTextIsSelectable(true);
    }

    public void setTopPaddingOnTopView(int i) {
        View view = (!TextUtils.isEmpty(this.f18104a.getText()) ? 1 : 0) != 0 ? this.f18104a : this.f18105b.m13582b() ? this.f18105b : this.f18106c;
        ai.m1823a(view, ai.f1848a.mo401l(view), i, ai.f1848a.mo402m(view), 0);
    }

    protected Parcelable onSaveInstanceState() {
        Parcelable bundle = new Bundle();
        bundle.putParcelable("expanded_container.parent_instance_state", super.onSaveInstanceState());
        bundle.putBoolean("expanded_container.translation_state", this.f18111h);
        return bundle;
    }

    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            this.f18111h = bundle.getBoolean("expanded_container.translation_state");
            super.onRestoreInstanceState(bundle.getParcelable("expanded_container.parent_instance_state"));
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    public final boolean mo3553a() {
        return !TextUtils.isEmpty(this.f18110g);
    }

    public final boolean mo3554b() {
        return this.f18111h;
    }

    public final void mo3555c() {
        this.f18111h = !this.f18111h;
        this.f18108e.setBody(this.f18111h ? this.f18110g : this.f18109f);
    }
}
