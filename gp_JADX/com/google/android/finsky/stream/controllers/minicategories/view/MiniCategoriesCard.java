package com.google.android.finsky.stream.controllers.minicategories.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.finsky.bg.C1612l;
import com.google.android.finsky.frameworkviews.C2625e;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.providers.C3947d;
import com.google.android.play.image.FifeImageView;
import com.google.wireless.android.a.a.a.a.ce;
import com.squareup.leakcanary.C7582R;

public class MiniCategoriesCard extends LinearLayout implements OnClickListener, ad, C2625e {
    public TextView f22585a;
    public FifeImageView f22586b;
    public ce f22587c;
    public C4444a f22588d;
    public ad f22589e;
    public C1612l f22590f;

    public MiniCategoriesCard(Context context) {
        this(context, null);
    }

    public MiniCategoriesCard(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22587c = C2482j.m13283a(145);
    }

    protected void onFinishInflate() {
        ((C1436e) C3947d.m18649a(C1436e.class)).mo1939a(this);
        super.onFinishInflate();
        this.f22585a = (TextView) findViewById(C7582R.id.mini_categories_item_title);
        this.f22586b = (FifeImageView) findViewById(C7582R.id.mini_categories_item_image);
    }

    public void onClick(View view) {
        if (this.f22588d != null) {
            this.f22588d.mo4211a(this);
        }
    }

    public ce getPlayStoreUiElement() {
        return this.f22587c;
    }

    public ad getParentNode() {
        return this.f22589e;
    }

    public final void mo1219a(ad adVar) {
        throw new IllegalStateException("unwanted children");
    }
}
