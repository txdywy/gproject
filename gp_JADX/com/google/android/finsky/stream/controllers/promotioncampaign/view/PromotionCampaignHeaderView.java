package com.google.android.finsky.stream.controllers.promotioncampaign.view;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import com.google.android.finsky.frameworkviews.PlayActionButtonV2;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.ad;
import com.google.android.play.C6315f;
import com.google.android.play.layout.PlayTextView;
import com.google.android.play.p203b.C3918i;
import com.google.android.play.p203b.C6270j;
import com.google.android.play.utils.C6325i;
import com.google.wireless.android.a.a.a.a.ce;
import com.squareup.leakcanary.C7582R;
import java.util.Arrays;
import java.util.List;

public class PromotionCampaignHeaderView extends FrameLayout implements OnClickListener, ad {
    public PlayTextView f22740a;
    public PlayTextView f22741b;
    public PlayTextView f22742c;
    public PlayTextView f22743d;
    public ImageView f22744e;
    public PlayActionButtonV2 f22745f;
    public PlayActionButtonV2 f22746g;
    public PlayActionButtonV2 f22747h;
    public List f22748i;
    public PlayActionButtonV2 f22749j;
    public PlayActionButtonV2 f22750k;
    public PlayActionButtonV2 f22751l;
    public List f22752m;
    public ViewGroup f22753n;
    public ViewGroup f22754o;
    public ViewGroup f22755p;
    public C4475a f22756q;
    public ce f22757r;
    public ad f22758s;

    public PromotionCampaignHeaderView(Context context) {
        this(context, null);
    }

    public PromotionCampaignHeaderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22757r = C2482j.m13283a(459);
        getCardViewGroupDelegate().mo3865a(this, context, attributeSet, 0);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f22740a = (PlayTextView) findViewById(C7582R.id.title);
        this.f22744e = (ImageView) findViewById(C7582R.id.info_icon);
        this.f22741b = (PlayTextView) findViewById(C7582R.id.subtitle);
        this.f22742c = (PlayTextView) findViewById(C7582R.id.paragraph);
        this.f22743d = (PlayTextView) findViewById(C7582R.id.terms_link);
        this.f22745f = (PlayActionButtonV2) findViewById(C7582R.id.primary_button);
        this.f22746g = (PlayActionButtonV2) findViewById(C7582R.id.primary_button_wide);
        this.f22747h = (PlayActionButtonV2) findViewById(C7582R.id.primary_button_hidden);
        this.f22748i = Arrays.asList(new PlayActionButtonV2[]{this.f22745f, this.f22746g, this.f22747h});
        this.f22749j = (PlayActionButtonV2) findViewById(C7582R.id.secondary_button);
        this.f22750k = (PlayActionButtonV2) findViewById(C7582R.id.secondary_button_wide);
        this.f22751l = (PlayActionButtonV2) findViewById(C7582R.id.secondary_button_hidden);
        this.f22752m = Arrays.asList(new PlayActionButtonV2[]{this.f22749j, this.f22750k, this.f22751l});
        this.f22753n = (ViewGroup) findViewById(C7582R.id.button_frame);
        this.f22754o = (ViewGroup) findViewById(C7582R.id.button_frame_wide);
        this.f22755p = (ViewGroup) findViewById(C7582R.id.button_frame_hidden);
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.f22755p.getVisibility() != 8) {
            int max = Math.max(this.f22747h.getMeasuredWidth(), this.f22751l.getMeasuredWidth());
            int i5 = max > getResources().getDimensionPixelSize(C7582R.dimen.promotion_campaign_description_max_button_width) ? 1 : 0;
            this.f22755p.setVisibility(8);
            if (m20918a()) {
                m20913a(this.f22745f, max, 0.0f);
                m20913a(this.f22749j, max, 0.0f);
                i5 = 0;
            }
            if (i5 != 0) {
                this.f22753n.setVisibility(8);
                this.f22754o.setVisibility(0);
            } else {
                this.f22753n.setVisibility(0);
                this.f22754o.setVisibility(8);
            }
        }
        super.onLayout(z, i, i2, i3, i4);
    }

    public static void m20914a(CharSequence charSequence, PlayTextView playTextView) {
        if (TextUtils.isEmpty(charSequence)) {
            playTextView.setVisibility(8);
            return;
        }
        playTextView.setText(charSequence);
        playTextView.setVisibility(0);
    }

    private final GradientDrawable m20912a(int i) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(i);
        gradientDrawable.setCornerRadius(getResources().getDimension(C7582R.dimen.play_action_button_corner));
        return gradientDrawable;
    }

    public final boolean m20918a() {
        return getContext().getResources().getBoolean(C7582R.bool.use_wide_layout);
    }

    public final void m20919b() {
        m20916a(this.f22752m);
    }

    public final void m20917a(Iterable iterable, C4478c c4478c, int i, boolean z) {
        for (PlayActionButtonV2 playActionButtonV2 : iterable) {
            playActionButtonV2.mo2588a(i, c4478c.f22767a, (OnClickListener) this);
            if (TextUtils.isEmpty(c4478c.f22768b)) {
                int i2;
                if (!z) {
                    getContext();
                    switch (i) {
                        case 1:
                            i2 = C6315f.play_action_button_books;
                            break;
                        case 2:
                            i2 = C6315f.play_action_button_music;
                            break;
                        case 3:
                            if (!C6325i.f31615a) {
                                i2 = C6315f.play_action_button_apps;
                                break;
                            } else {
                                i2 = C6315f.play_action_button_apps_ent_base;
                                break;
                            }
                        case 4:
                            i2 = C6315f.play_action_button_movies;
                            break;
                        case 6:
                            i2 = C6315f.play_action_button_newsstand;
                            break;
                        case 10:
                            i2 = C6315f.play_action_button_commerce;
                            break;
                        default:
                            if (!C6325i.f31615a) {
                                i2 = C6315f.play_action_button_multi;
                                break;
                            } else {
                                i2 = C6315f.play_action_button_apps_ent_base;
                                break;
                            }
                    }
                }
                getContext();
                switch (i) {
                    case 1:
                        i2 = C6315f.play_action_button_books_secondary;
                        break;
                    case 2:
                        i2 = C6315f.play_action_button_music_secondary;
                        break;
                    case 3:
                        if (!C6325i.f31615a) {
                            i2 = C6315f.play_action_button_apps_secondary;
                            break;
                        } else {
                            i2 = C6315f.play_action_button_apps_ent_secondary;
                            break;
                        }
                    case 4:
                        i2 = C6315f.play_action_button_movies_secondary;
                        break;
                    case 6:
                        i2 = C6315f.play_action_button_newsstand_secondary;
                        break;
                    default:
                        if (!C6325i.f31615a) {
                            i2 = C6315f.play_action_button_multi_secondary;
                            break;
                        } else {
                            i2 = C6315f.play_action_button_apps_ent_secondary;
                            break;
                        }
                }
                playActionButtonV2.setBackgroundResource(i2);
                if (z) {
                    playActionButtonV2.setTextColor(C6325i.m28969a(getContext(), i));
                }
            } else {
                playActionButtonV2.setBackgroundDrawable(m20912a(Color.parseColor(c4478c.f22768b)));
            }
            playActionButtonV2.setVisibility(0);
        }
    }

    public final void m20916a(Iterable iterable) {
        for (PlayActionButtonV2 playActionButtonV2 : iterable) {
            playActionButtonV2.mo2588a(-1, "", null);
            playActionButtonV2.setBackgroundDrawable(m20912a(0));
            playActionButtonV2.setTextColor(getResources().getColorStateList(C7582R.color.play_action_button_text));
            playActionButtonV2.setVisibility(8);
        }
    }

    public static void m20913a(PlayActionButtonV2 playActionButtonV2, int i, float f) {
        LayoutParams layoutParams = (LayoutParams) playActionButtonV2.getLayoutParams();
        layoutParams.width = i;
        layoutParams.weight = f;
        playActionButtonV2.setLayoutParams(layoutParams);
    }

    public ce getPlayStoreUiElement() {
        return this.f22757r;
    }

    public ad getParentNode() {
        return this.f22758s;
    }

    public final void mo1219a(ad adVar) {
        C2482j.m13291a((ad) this, adVar);
    }

    public C3918i getCardViewGroupDelegate() {
        return C6270j.f31324a;
    }

    public void onClick(View view) {
        if (this.f22748i.contains(view)) {
            this.f22756q.mo4220a(this);
        }
        if (this.f22752m.contains(view)) {
            this.f22756q.mo4221b(this);
        }
        if (view == this.f22744e) {
            this.f22756q.mo4222c(this);
        }
        if (view == this.f22743d) {
            this.f22756q.mo4223d(this);
        }
    }
}
