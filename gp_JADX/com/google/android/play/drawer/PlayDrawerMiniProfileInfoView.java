package com.google.android.play.drawer;

import android.accounts.Account;
import android.content.Context;
import android.content.res.Resources;
import android.support.v4.view.ai;
import android.util.AttributeSet;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.play.C6282d;
import com.google.android.play.C6315f;
import com.google.android.play.C6316g;
import com.google.android.play.i;

class PlayDrawerMiniProfileInfoView extends RelativeLayout {
    public TextView f31382a;
    public ImageView f31383b;
    public boolean f31384c;
    public boolean f31385d;

    public PlayDrawerMiniProfileInfoView(Context context) {
        this(context, null);
    }

    public PlayDrawerMiniProfileInfoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f31382a = (TextView) findViewById(C6316g.mini_display_name);
        this.f31383b = (ImageView) findViewById(C6316g.mini_toggle_account_list_button);
    }

    public final void m28859a(boolean z) {
        if (this.f31384c != z) {
            this.f31384c = z;
            m28856a();
            if (!z) {
                m28860b(false);
            }
        }
    }

    public final void m28860b(boolean z) {
        if (this.f31385d != z) {
            this.f31385d = z;
            m28856a();
        }
    }

    public final void m28857a(Account account, C3714i c3714i) {
        this.f31382a.setText(c3714i.mo3617a(account));
    }

    private final void m28856a() {
        Resources resources = getResources();
        if (this.f31385d) {
            this.f31383b.setVisibility(0);
            this.f31383b.setImageResource(C6315f.ic_up_white_16);
            setContentDescription(resources.getString(i.play_drawer_content_description_hide_account_list_button));
        } else if (this.f31384c) {
            this.f31383b.setVisibility(0);
            this.f31383b.setImageResource(C6315f.ic_down_white_16);
            setContentDescription(resources.getString(i.play_drawer_content_description_show_account_list_button));
        } else {
            this.f31383b.setVisibility(8);
            setContentDescription(null);
        }
    }

    public final void m28858a(OnClickListener onClickListener) {
        int l = ai.f1848a.mo401l(this);
        int m = ai.f1848a.mo402m(this);
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        if (onClickListener == null) {
            setBackgroundResource(C6282d.play_apps_primary_v2);
        } else {
            setBackgroundResource(C6315f.drawer_mini_profile_background);
        }
        ai.m1823a(this, l, paddingTop, m, paddingBottom);
        setOnClickListener(onClickListener);
        setClickable(onClickListener != null);
    }
}
