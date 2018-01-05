package com.google.android.finsky.frameworkviews;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.support.v4.view.ai;
import android.util.AttributeSet;
import android.view.View.OnClickListener;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.TextView;
import com.android.vending.C0629a;
import com.google.android.finsky.as.C1503a;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.bg.C1608h;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.play.utils.h;
import com.squareup.leakcanary.C7582R;

public class PlayActionButtonV2 extends Button {
    public int f6225h;
    public boolean f6226i;
    public boolean f6227j;
    public int f6228k;
    public int f6229l;
    public int f6230m;
    public int f6231n;
    public String f6232o;
    public int f6233p;
    public C1503a f6234q;
    public C1461c f6235r;
    public boolean f6236s;

    public PlayActionButtonV2(Context context) {
        this(context, null);
    }

    public PlayActionButtonV2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0629a.PlayActionButton);
        this.f6226i = obtainStyledAttributes.getBoolean(1, false);
        this.f6227j = obtainStyledAttributes.getBoolean(2, true);
        this.f6225h = obtainStyledAttributes.getInt(0, 0);
        this.f6228k = obtainStyledAttributes.getDimensionPixelSize(3, 0);
        this.f6229l = obtainStyledAttributes.getDimensionPixelSize(4, 0);
        this.f6230m = obtainStyledAttributes.getDimensionPixelSize(5, 0);
        this.f6231n = obtainStyledAttributes.getInt(6, -1);
        obtainStyledAttributes.recycle();
    }

    public void onFinishInflate() {
        ((C1387u) C3947d.m18649a(C1387u.class)).mo1844a(this);
        super.onFinishInflate();
        boolean z = this.f6234q.f8184h && this.f6235r.dj().mo2294a(12638807);
        this.f6236s = z;
    }

    public void setDrawAsLabel(boolean z) {
        if (this.f6226i != z) {
            this.f6226i = z;
            m5998b();
        }
    }

    public void setActionStyle(int i) {
        if (this.f6225h != i) {
            if (VERSION.SDK_INT < 21 && i == 3) {
                FinskyLog.m21669e("Borderless style cannot be used on pre-L devices.", new Object[0]);
            }
            this.f6225h = i;
            m5998b();
        }
    }

    public void setOnClickListener(OnClickListener onClickListener) {
        FinskyLog.m21669e("Don't call PlayActionButtonV2.setOnClickListener() directly, call configure().", new Object[0]);
    }

    public final void m5999a() {
        super.setOnClickListener(null);
        setClickable(false);
        setFocusable(false);
    }

    public final void m6000a(int i, int i2, OnClickListener onClickListener) {
        mo2588a(i, getResources().getString(i2), onClickListener);
    }

    public void mo2588a(int i, String str, OnClickListener onClickListener) {
        this.f6232o = str;
        this.f6233p = i;
        if (onClickListener != null) {
            setFocusable(true);
            super.setOnClickListener(onClickListener);
            setClickable(true);
        } else {
            setFocusable(false);
            super.setOnClickListener(null);
            setClickable(false);
        }
        m5998b();
    }

    private final void m5998b() {
        CharSequence charSequence;
        int i;
        if (this.f6232o == null || (this.f6226i && !this.f6227j)) {
            charSequence = this.f6232o;
        } else {
            charSequence = this.f6232o.toUpperCase();
        }
        setText(charSequence);
        if (this.f6226i) {
            if (isClickable()) {
                i = C7582R.drawable.play_highlight_overlay_light;
            } else {
                i = 0;
            }
            setBackgroundResource(i);
            setTextColor(getResources().getColor(C1608h.m9241a(this.f6225h == 2 ? 0 : this.f6233p)));
        } else {
            switch (this.f6225h) {
                case 0:
                    if (this.f6236s) {
                        switch (this.f6233p) {
                            case 1:
                                i = C7582R.drawable.play_action_button_books_cros;
                                break;
                            case 2:
                                i = C7582R.drawable.play_action_button_music_cros;
                                break;
                            case 3:
                                if (!C1608h.f8520b) {
                                    i = C7582R.drawable.play_action_button_apps_cros;
                                    break;
                                } else {
                                    i = C7582R.drawable.play_action_button_apps_ent_base_cros;
                                    break;
                                }
                            case 4:
                                i = C7582R.drawable.play_action_button_movies_cros;
                                break;
                            case 6:
                                i = C7582R.drawable.play_action_button_newsstand_cros;
                                break;
                            case 10:
                                i = C7582R.drawable.play_action_button_commerce_cros;
                                break;
                            default:
                                if (!C1608h.f8520b) {
                                    i = C7582R.drawable.play_action_button_multi_cros;
                                    break;
                                } else {
                                    i = C7582R.drawable.play_action_button_apps_ent_base_cros;
                                    break;
                                }
                        }
                    }
                    i = C1608h.m9262g(this.f6233p);
                    setBackgroundResource(i);
                    setTextColor(getResources().getColor(C7582R.color.play_action_button_text));
                    break;
                case 1:
                    setBackgroundResource(C1608h.m9260f(this.f6233p));
                    break;
                case 2:
                    if (this.f6236s) {
                        switch (this.f6233p) {
                            case 1:
                                i = C7582R.drawable.play_action_button_books_secondary_cros;
                                break;
                            case 2:
                                i = C7582R.drawable.play_action_button_music_secondary_cros;
                                break;
                            case 3:
                                if (!C1608h.f8520b) {
                                    i = C7582R.drawable.play_action_button_apps_secondary_cros;
                                    break;
                                } else {
                                    i = C7582R.drawable.play_action_button_apps_ent_secondary_cros;
                                    break;
                                }
                            case 4:
                                i = C7582R.drawable.play_action_button_movies_secondary_cros;
                                break;
                            case 6:
                                i = C7582R.drawable.play_action_button_newsstand_secondary_cros;
                                break;
                            default:
                                if (!C1608h.f8520b) {
                                    i = C7582R.drawable.play_action_button_multi_secondary_cros;
                                    break;
                                } else {
                                    i = C7582R.drawable.play_action_button_apps_ent_secondary_cros;
                                    break;
                                }
                        }
                    }
                    i = C1608h.m9260f(this.f6233p);
                    setBackgroundResource(i);
                    if (!this.f6236s) {
                        setTextColor(getResources().getColor(C1608h.m9241a(this.f6233p)));
                        break;
                    }
                    Resources resources = getResources();
                    switch (this.f6233p) {
                        case 1:
                            i = C7582R.color.play_books_primary_stateful;
                            break;
                        case 2:
                            i = C7582R.color.play_music_primary_stateful;
                            break;
                        case 3:
                            if (!C1608h.f8520b) {
                                i = C7582R.color.play_apps_primary_stateful;
                                break;
                            } else {
                                i = C7582R.color.play_apps_ent_primary_stateful;
                                break;
                            }
                        case 4:
                            i = C7582R.color.play_movies_primary_stateful;
                            break;
                        case 6:
                            i = C7582R.color.play_newsstand_primary_stateful;
                            break;
                        default:
                            if (!C1608h.f8520b) {
                                i = C7582R.color.play_multi_primary_stateful;
                                break;
                            } else {
                                i = C7582R.color.play_apps_ent_primary_stateful;
                                break;
                            }
                    }
                    setTextColor(resources.getColorStateList(i));
                    break;
                case 3:
                    setBackgroundResource(C7582R.drawable.borderless_action_button);
                    if (VERSION.SDK_INT >= 21) {
                        setStateListAnimator(null);
                        break;
                    }
                    break;
                default:
                    break;
            }
            setTextColor(getResources().getColor(C1608h.m9241a(this.f6233p)));
        }
        if (!this.f6226i || isClickable()) {
            i = 0;
        } else {
            i = 1;
        }
        if (i == 0) {
            ai.m1823a(this, this.f6228k, this.f6229l, this.f6228k, this.f6230m);
        } else {
            ai.m1823a(this, 0, 0, 0, 0);
        }
    }

    public int getPriority() {
        return this.f6231n;
    }

    public int getActionXPadding() {
        return this.f6228k;
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        Object obj = (!this.f6226i || isClickable()) ? null : 1;
        h.a(accessibilityNodeInfo, obj != null ? TextView.class.getName() : null);
    }
}
