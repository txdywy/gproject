package com.google.android.finsky.detailspage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.support.v4.p013b.p014a.C0259a;
import android.support.v7.widget.SwitchCompat;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewStub;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.caverock.androidsvg.C0722q;
import com.caverock.androidsvg.as;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.bb.C1557b;
import com.google.android.finsky.bb.C1565a;
import com.google.android.finsky.bg.C1608h;
import com.google.android.finsky.familycommon.FamilyEducationCard;
import com.google.android.finsky.frameworkviews.CardBubbleLinearLayout;
import com.squareup.leakcanary.C7582R;

public class FamilyShareLayout extends LinearLayout implements OnClickListener, OnCheckedChangeListener {
    public final C1557b f14009a = C1473m.f7980a.aY();
    public C1565a f14010b;
    public ch f14011c;
    public boolean f14012d;
    public boolean f14013e;
    public SwitchCompat f14014f;
    public TextView f14015g;
    public ImageView f14016h;
    public ViewStub f14017i;
    public CardBubbleLinearLayout f14018j;
    public FamilyEducationCard f14019k;
    public TextView f14020l;

    public FamilyShareLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f14014f = (SwitchCompat) findViewById(C7582R.id.switch_button);
        this.f14015g = (TextView) findViewById(C7582R.id.family_library_text);
        this.f14016h = (ImageView) findViewById(C7582R.id.family_icon);
        this.f14017i = (ViewStub) findViewById(C7582R.id.family_share_education_card_stub);
    }

    public final void m13769a(ch chVar, C1565a c1565a) {
        int i = C7582R.color.play_apps_ent_light;
        if (this.f14012d) {
            this.f14014f.setOnCheckedChangeListener(null);
        }
        this.f14012d = true;
        this.f14011c = chVar;
        this.f14010b = c1565a;
        if (c1565a.f8373d == 2) {
            findViewById(C7582R.id.share_controls).setVisibility(8);
            if (this.f14019k == null) {
                this.f14019k = (FamilyEducationCard) ((ViewStub) findViewById(C7582R.id.family_share_paused_education_card_stub)).inflate();
            }
            int i2 = this.f14010b.f8370a.f14885a.f12099f;
            this.f14013e = this.f14009a.mo2313c().mo2327h();
            this.f14019k.m15887a(i2, null, getResources().getString(this.f14013e ? C7582R.string.family_paused_card_hoh_body : C7582R.string.family_paused_card_member_body), getResources().getString(this.f14013e ? C7582R.string.family_paused_card_update_payment_method : C7582R.string.got_it_button), this);
            return;
        }
        this.f14015g.setText(this.f14010b.f8372c);
        this.f14016h.setImageDrawable(C0722q.m4782a(getResources(), (int) C7582R.raw.ic_family_24px, new as()));
        i2 = this.f14010b.f8370a.f14885a.f12099f;
        if (this.f14010b.f8373d == 1 || this.f14010b.f8373d == 3) {
            this.f14014f.setChecked(this.f14010b.f8374e);
            this.f14014f.setVisibility(0);
            this.f14014f.setOnCheckedChangeListener(this);
            SwitchCompat switchCompat = this.f14014f;
            r4 = new int[2][];
            r4[0] = new int[]{16842912};
            r4[1] = new int[]{-16842912};
            int[] iArr = new int[]{C1608h.m9253b(switchCompat.getContext(), i2), switchCompat.getResources().getColor(C7582R.color.family_sharing_switch_thumb_disabled)};
            int[] iArr2 = new int[2];
            Resources resources = switchCompat.getContext().getResources();
            switch (i2) {
                case 1:
                    i = C7582R.color.play_books_light;
                    break;
                case 2:
                    i = C7582R.color.play_music_light;
                    break;
                case 3:
                    if (!C1608h.f8520b) {
                        i = C7582R.color.play_apps_light;
                        break;
                    }
                    break;
                case 4:
                    i = C7582R.color.play_movies_light;
                    break;
                case 6:
                    i = C7582R.color.play_newsstand_light;
                    break;
                default:
                    if (!C1608h.f8520b) {
                        i = C7582R.color.play_multi_light;
                        break;
                    }
                    break;
            }
            iArr2[0] = resources.getColor(i);
            iArr2[1] = switchCompat.getResources().getColor(C7582R.color.family_sharing_switch_track_disabled);
            C0259a.m1516a(C0259a.m1526e(switchCompat.getThumbDrawable()), new ColorStateList(r4, iArr));
            C0259a.m1516a(C0259a.m1526e(switchCompat.getTrackDrawable()), new ColorStateList(r4, iArr2));
        }
        if (this.f14010b.f8375f && this.f14018j == null) {
            this.f14018j = (CardBubbleLinearLayout) this.f14017i.inflate();
            this.f14020l = (TextView) findViewById(C7582R.id.got_it_label);
            this.f14020l.setText(getResources().getString(C7582R.string.got_it_button).toUpperCase(getResources().getConfiguration().locale));
            this.f14020l.setOnClickListener(this);
            this.f14018j.getCardViewGroupDelegate().mo3864a(this.f14018j, C1608h.m9253b(getContext(), i2));
        }
    }

    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.f14011c.mo3056a(this.f14010b, z);
    }

    public void onClick(View view) {
        if (view == this.f14020l) {
            this.f14020l.setOnClickListener(null);
            this.f14018j.setVisibility(8);
            this.f14011c.mo3055a(this.f14010b);
        } else if (this.f14013e) {
            this.f14011c.mo3061d();
        } else {
            this.f14019k.setVisibility(8);
            this.f14011c.mo3062i();
        }
    }
}
