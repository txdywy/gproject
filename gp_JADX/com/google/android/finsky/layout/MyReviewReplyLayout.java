package com.google.android.finsky.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.bg.C1608h;
import com.google.android.finsky.cv.p177a.iu;
import com.google.android.finsky.dfemodel.Document;
import com.squareup.leakcanary.C7582R;

public class MyReviewReplyLayout extends LinearLayout {
    public TextView f18262a;
    public TextView f18263b;
    public TextView f18264c;
    public TextView f18265d;

    public MyReviewReplyLayout(Context context) {
        this(context, null);
    }

    public MyReviewReplyLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f18262a = (TextView) findViewById(C7582R.id.review_reply_developer_name);
        this.f18263b = (TextView) findViewById(C7582R.id.review_reply_subtitle);
        this.f18264c = (TextView) findViewById(C7582R.id.review_reply_text);
        this.f18265d = (TextView) findViewById(C7582R.id.read_more_label);
        this.f18265d.setText(getContext().getString(C7582R.string.read_more).toUpperCase());
    }

    public final void m17326a(Document document, iu iuVar) {
        if (!iuVar.m12828d()) {
            setVisibility(8);
        }
        Context context = getContext();
        this.f18262a.setText(document.f14885a.f12102i);
        if (iuVar.m12829e()) {
            long j = iuVar.f12727o;
            String a = C1473m.f7980a.bb().m21826a(j);
            this.f18263b.setVisibility(0);
            if (!iuVar.bs_() || iuVar.f12724l <= j) {
                this.f18263b.setText(context.getString(C7582R.string.review_reply_date, new Object[]{a}));
            } else {
                this.f18263b.setText(context.getString(C7582R.string.review_reply_after_edit_subtitle, new Object[]{a}));
            }
        } else {
            this.f18263b.setVisibility(8);
        }
        this.f18264c.setText(iuVar.f12726n);
        this.f18264c.setVisibility(8);
        this.f18265d.setTextColor(getResources().getColor(C1608h.m9241a(document.f14885a.f12099f)));
        this.f18265d.setOnClickListener(new as(this));
        this.f18265d.setVisibility(0);
        setVisibility(0);
    }
}
