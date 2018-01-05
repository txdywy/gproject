package com.google.android.finsky.contentfilterui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import com.google.android.finsky.bg.af;
import com.google.android.finsky.bg.l;
import com.google.android.finsky.providers.d;
import com.google.android.play.image.FifeImageView;
import com.google.android.play.layout.b;

public class ContentFilterLineView extends com.google.android.play.layout.b
{

    public com.google.android.finsky.bg.l a;
    public com.google.android.finsky.bg.af b;
    public TextView c;
    public FifeImageView d;
    public TextView e;

    ContentFilterLineView(Context p0) {
        ContentFilterLineView(p0, 0);
    }

    ContentFilterLineView(Context p0, AttributeSet p1) {
        ContentFilterLineView(p0, p1, 0);
    }

    ContentFilterLineView(Context p0, AttributeSet p1, int p2) {
        com.google.android.play.layout.b(p0, p1, p2);
        ((com.google.android.finsky.contentfilterui.d)com.google.android.finsky.providers.d.a(com.google.android.finsky.contentfilterui.d)).a(this);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.c = (TextView)this.findViewById(2131755516);
        this.d = (FifeImageView)this.findViewById(2131755515);
        this.e = (TextView)this.findViewById(2131755518);
    }

    public void setEnabled(boolean p0) {
        super.setEnabled(p0);
        this.c.setEnabled(p0);
        this.e.setEnabled(p0);
    }

}
