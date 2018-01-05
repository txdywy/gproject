package com.google.android.finsky.detailspage;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.cv.p177a.bd;
import com.google.android.finsky.detailscomponents.DetailsTextBlock;
import com.google.android.finsky.detailspage.TextModule.DetailsIconDescription;
import com.google.android.finsky.frameworkviews.DecoratedTextView;
import com.google.android.play.layout.PlayTextView;
import com.google.android.play.utils.UrlSpanUtils;
import com.google.android.play.utils.m;
import com.squareup.leakcanary.C7582R;
import java.util.ArrayList;
import java.util.List;

public class TextModuleLayout extends LinearLayout {
    public PlayTextView f14156a;
    public View f14157b;
    public DetailsTextBlock f14158c;
    public View f14159d;
    public DecoratedTextView f14160e;
    public TextView f14161f;
    public int f14162g;
    public final int f14163h;
    public final int f14164i;
    public final CharSequence f14165j;
    public final List f14166k;
    public OnClickListener f14167l;
    public m f14168m;
    public boolean f14169n;
    public int f14170o;

    public TextModuleLayout(Context context) {
        this(context, null);
    }

    public TextModuleLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f14166k = new ArrayList();
        Resources resources = context.getResources();
        this.f14162g = resources.getInteger(C7582R.integer.details_text_collapsed_lines);
        this.f14163h = resources.getColor(C7582R.color.top_developer);
        this.f14164i = resources.getDimensionPixelSize(C7582R.dimen.details_whatsnew_vmargin);
        this.f14165j = resources.getString(C7582R.string.details_whats_new).toUpperCase();
        this.f14166k.add(new DetailsIconDescription(new bd(), null));
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f14156a = (PlayTextView) findViewById(C7582R.id.callout);
        this.f14156a.setMovementMethod(LinkMovementMethod.getInstance());
        this.f14157b = findViewById(C7582R.id.spacer);
        this.f14158c = (DetailsTextBlock) findViewById(C7582R.id.body_container);
        this.f14159d = findViewById(C7582R.id.icon_container);
        this.f14160e = (DecoratedTextView) findViewById(C7582R.id.top_developer_label);
        this.f14161f = (TextView) findViewById(C7582R.id.footer_message);
        this.f14161f.setText(getContext().getString(C7582R.string.read_more).toUpperCase());
        if (C1473m.f7980a.dj().mo2294a(12636865)) {
            Resources resources = getResources();
            this.f14156a.setTextSize(0, (float) resources.getDimensionPixelSize(C7582R.dimen.play_description_callout_size_v3));
            int dimensionPixelSize = resources.getDimensionPixelSize(C7582R.dimen.details_text_module_xpadding);
            setPadding(dimensionPixelSize, getPaddingTop(), dimensionPixelSize, getPaddingBottom());
        }
    }

    final CharSequence m13810a(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            return charSequence;
        }
        return UrlSpanUtils.b(charSequence, null, new gl(this));
    }
}
