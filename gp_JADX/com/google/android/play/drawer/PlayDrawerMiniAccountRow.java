package com.google.android.play.drawer;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.play.C6316g;
import com.google.android.play.i;

class PlayDrawerMiniAccountRow extends FrameLayout {
    public TextView f31381a;

    public PlayDrawerMiniAccountRow(Context context) {
        super(context);
    }

    public PlayDrawerMiniAccountRow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f31381a = (TextView) findViewById(C6316g.mini_account_name);
    }

    public final void m28855a(String str) {
        this.f31381a.setText(str);
        setContentDescription(getResources().getString(i.play_drawer_content_description_switch_account, new Object[]{str}));
    }
}
