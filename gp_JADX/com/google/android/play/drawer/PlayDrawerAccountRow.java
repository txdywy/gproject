package com.google.android.play.drawer;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.finsky.cv.p177a.bd;
import com.google.android.finsky.cv.p177a.cv;
import com.google.android.play.C6315f;
import com.google.android.play.C6316g;
import com.google.android.play.i;
import com.google.android.play.image.C1294w;
import com.google.android.play.image.FifeImageView;
import com.google.android.play.utils.c;

class PlayDrawerAccountRow extends RelativeLayout {
    public FifeImageView f31370a;
    public TextView f31371b;

    public PlayDrawerAccountRow(Context context) {
        super(context);
    }

    public PlayDrawerAccountRow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f31370a = (FifeImageView) findViewById(C6316g.avatar);
        this.f31371b = (TextView) findViewById(C6316g.account_name);
    }

    public final void m28852a(cv cvVar, String str, C1294w c1294w) {
        this.f31371b.setText(str);
        setContentDescription(getResources().getString(i.play_drawer_content_description_switch_account, new Object[]{str}));
        if (cvVar == null) {
            this.f31370a.setLocalImageBitmap(BitmapFactory.decodeResource(getResources(), C6315f.ic_profile_none));
            return;
        }
        bd a = c.a(cvVar, 4);
        this.f31370a.a(a.f11860f, a.f11863i, c1294w);
    }
}
