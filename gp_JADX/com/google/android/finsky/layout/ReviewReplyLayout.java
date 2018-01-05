package com.google.android.finsky.layout;

import android.content.Context;
import android.text.Html;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.cv.p177a.iu;
import com.google.android.finsky.dfemodel.Document;
import com.squareup.leakcanary.C7582R;

public class ReviewReplyLayout extends LinearLayout {
    public TextView f18322a;
    public TextView f18323b;
    public ImageView f18324c;
    public boolean f18325d;

    public ReviewReplyLayout(Context context) {
        this(context, null);
    }

    public ReviewReplyLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f18322a = (TextView) findViewById(C7582R.id.review_reply_header);
        this.f18323b = (TextView) findViewById(C7582R.id.review_reply_text);
        this.f18324c = (ImageView) findViewById(C7582R.id.review_reply_toggle);
    }

    public final void m17341a(Document document, iu iuVar) {
        if (!iuVar.m12828d()) {
            setVisibility(8);
        }
        Context context = getContext();
        String str = document.f14885a.f12102i;
        if (iuVar.m12829e()) {
            long j = iuVar.f12727o;
            String a = C1473m.f7980a.bb().m21826a(j);
            if (!iuVar.bs_() || iuVar.f12724l <= j) {
                m17339b();
                this.f18322a.setText(Html.fromHtml(context.getString(C7582R.string.review_reply_title, new Object[]{str, a})));
            } else {
                this.f18325d = false;
                this.f18324c.setVisibility(0);
                this.f18323b.setVisibility(8);
                setOnClickListener(new bj(this));
                m17340a();
                this.f18322a.setText(Html.fromHtml(context.getString(C7582R.string.review_reply_after_edit_title, new Object[]{str, a})));
            }
        } else {
            m17339b();
            this.f18322a.setText(context.getString(C7582R.string.review_reply_no_date_title, new Object[]{str}));
        }
        this.f18323b.setText(iuVar.f12726n);
        setVisibility(0);
    }

    final void m17340a() {
        this.f18324c.setImageResource(C7582R.drawable.ic_menu_expander_minimized_light);
        this.f18324c.setContentDescription(getContext().getString(C7582R.string.content_description_expand_reply));
    }

    private final void m17339b() {
        this.f18324c.setVisibility(8);
        this.f18323b.setVisibility(0);
        setOnClickListener(null);
    }
}
