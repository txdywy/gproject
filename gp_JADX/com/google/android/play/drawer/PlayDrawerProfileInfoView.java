package com.google.android.play.drawer;

import android.accounts.Account;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.ColorDrawable;
import android.support.v4.view.ai;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.finsky.cv.p177a.bd;
import com.google.android.finsky.cv.p177a.cv;
import com.google.android.play.C6282d;
import com.google.android.play.C6315f;
import com.google.android.play.C6316g;
import com.google.android.play.i;
import com.google.android.play.image.C1294w;
import com.google.android.play.image.FifeImageView;
import com.google.android.play.image.be;
import com.google.android.play.utils.c;
import java.util.Map;

class PlayDrawerProfileInfoView extends FrameLayout implements OnClickListener, be {
    public FifeImageView f31390a;
    public FifeImageView f31391b;
    public View f31392c;
    public FifeImageView f31393d;
    public View f31394e;
    public FifeImageView f31395f;
    public TextView f31396g;
    public TextView f31397h;
    public ImageView f31398i;
    public View f31399j;
    public boolean f31400k;
    public boolean f31401l;
    public Account f31402m;
    public Account f31403n;
    public Account f31404o;
    public ai f31405p;

    public PlayDrawerProfileInfoView(Context context) {
        this(context, null);
    }

    public PlayDrawerProfileInfoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f31390a = (FifeImageView) findViewById(C6316g.cover_photo);
        this.f31391b = (FifeImageView) findViewById(C6316g.avatar);
        this.f31392c = findViewById(C6316g.secondary_avatar_frame_left);
        this.f31393d = (FifeImageView) findViewById(C6316g.secondary_avatar_left);
        this.f31394e = findViewById(C6316g.secondary_avatar_frame_right);
        this.f31395f = (FifeImageView) findViewById(C6316g.secondary_avatar_right);
        this.f31396g = (TextView) findViewById(C6316g.display_name);
        this.f31397h = (TextView) findViewById(C6316g.account_name);
        this.f31398i = (ImageView) findViewById(C6316g.toggle_account_list_button);
        this.f31399j = findViewById(C6316g.account_info_container);
        this.f31391b.setOnClickListener(this);
        this.f31392c.setOnClickListener(this);
        this.f31393d.setDuplicateParentStateEnabled(true);
        this.f31394e.setOnClickListener(this);
        this.f31395f.setDuplicateParentStateEnabled(true);
    }

    public final void m28870a(boolean z) {
        if (this.f31400k != z) {
            this.f31400k = z;
            m28864a();
            if (!z) {
                m28871b(false);
            }
        }
    }

    public final void m28871b(boolean z) {
        if (this.f31401l != z) {
            this.f31401l = z;
            m28864a();
        }
    }

    public final void m28866a(Account account, Account[] accountArr, Map map, C1294w c1294w, C3714i c3714i) {
        Account account2;
        cv cvVar;
        cv cvVar2;
        this.f31402m = account;
        this.f31404o = accountArr.length > 0 ? accountArr[0] : null;
        if (accountArr.length > 1) {
            account2 = accountArr[1];
        } else {
            account2 = null;
        }
        this.f31403n = account2;
        cv cvVar3 = (cv) map.get(this.f31402m.name);
        if (this.f31404o != null) {
            cvVar = (cv) map.get(this.f31404o.name);
        } else {
            cvVar = null;
        }
        if (this.f31403n != null) {
            cvVar2 = (cv) map.get(this.f31403n.name);
        } else {
            cvVar2 = null;
        }
        setBackgroundDrawable(new ColorDrawable(getResources().getColor(C6282d.play_main_background)));
        if (cvVar3 == null) {
            this.f31390a.setImageResource(C6315f.bg_default_profile_art);
            this.f31396g.setText(c3714i.mo3617a(account));
            this.f31397h.setVisibility(8);
        } else {
            this.f31390a.setTag(null);
            bd a = c.a(cvVar3, 15);
            CharSequence charSequence = cvVar3.f12100g;
            this.f31390a.setOnLoadedListener(this);
            this.f31390a.a(a.f11860f, a.f11863i, c1294w);
            if (!TextUtils.isEmpty(charSequence)) {
                this.f31396g.setText(charSequence);
            }
            this.f31397h.setText(c3714i.mo3617a(account));
            this.f31397h.setVisibility(0);
        }
        CharSequence text = this.f31396g.getText();
        if (TextUtils.isEmpty(text)) {
            text = account.name;
        }
        m28865a(this.f31391b, true, text, cvVar3, c1294w);
        if (this.f31403n != null) {
            this.f31392c.setVisibility(0);
            m28865a(this.f31393d, false, this.f31403n.name, cvVar2, c1294w);
        } else {
            this.f31392c.setVisibility(8);
        }
        if (this.f31404o != null) {
            this.f31394e.setVisibility(0);
            m28865a(this.f31395f, false, this.f31404o.name, cvVar, c1294w);
            return;
        }
        this.f31394e.setVisibility(8);
    }

    private final void m28865a(FifeImageView fifeImageView, boolean z, CharSequence charSequence, cv cvVar, C1294w c1294w) {
        CharSequence charSequence2;
        if (z) {
            charSequence2 = charSequence.toString();
        } else {
            charSequence2 = getResources().getString(i.play_drawer_content_description_switch_account, new Object[]{charSequence.toString()});
        }
        fifeImageView.setContentDescription(charSequence2);
        if (cvVar != null) {
            bd a = c.a(cvVar, 4);
            fifeImageView.setTag(null);
            fifeImageView.a(a.f11860f, a.f11863i, c1294w);
            return;
        }
        fifeImageView.setLocalImageBitmap(BitmapFactory.decodeResource(getResources(), C6315f.ic_profile_none));
    }

    public final void m28872c(boolean z) {
        this.f31391b.setEnabled(z);
        ai.m1838b(this.f31391b, z ? 1 : 2);
    }

    public void onClick(View view) {
        if (this.f31405p != null) {
            if (view == this.f31391b) {
                this.f31405p.mo5379a(this.f31402m);
            } else if (view == this.f31392c) {
                this.f31405p.mo5379a(this.f31403n);
            } else if (view == this.f31394e) {
                this.f31405p.mo5379a(this.f31404o);
            }
        }
    }

    private final void m28864a() {
        Resources resources = getResources();
        if (this.f31401l) {
            this.f31398i.setVisibility(0);
            this.f31398i.setImageResource(C6315f.ic_up_white_16);
            this.f31398i.setContentDescription(resources.getString(i.play_drawer_content_description_hide_account_list_button));
        } else if (this.f31400k) {
            this.f31398i.setVisibility(0);
            this.f31398i.setImageResource(C6315f.ic_down_white_16);
            this.f31398i.setContentDescription(resources.getString(i.play_drawer_content_description_show_account_list_button));
        } else {
            this.f31398i.setVisibility(8);
        }
    }

    public final void m28867a(OnClickListener onClickListener) {
        int l = ai.f1848a.mo401l(this.f31399j);
        int m = ai.f1848a.mo402m(this.f31399j);
        int paddingTop = this.f31399j.getPaddingTop();
        int paddingBottom = this.f31399j.getPaddingBottom();
        if (onClickListener != null) {
            this.f31399j.setBackgroundResource(C6315f.play_highlight_overlay_dark);
        } else {
            this.f31399j.setBackgroundResource(0);
        }
        ai.m1823a(this.f31399j, l, paddingTop, m, paddingBottom);
        this.f31399j.setOnClickListener(onClickListener);
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        invalidate();
    }

    public final void m28869a(FifeImageView fifeImageView, Bitmap bitmap) {
    }

    public final void m28868a(FifeImageView fifeImageView) {
        setBackgroundDrawable(null);
    }
}
