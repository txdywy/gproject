package com.google.android.finsky.playcard;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Build.VERSION;
import android.support.v4.view.C0361r;
import android.support.v4.view.ai;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.detailscomponents.DetailsTextBlock;
import com.google.android.finsky.frameworkviews.C3076f;
import com.google.android.finsky.frameworkviews.PlayActionButtonV2;
import com.google.android.finsky.frameworkviews.ae;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.play.layout.d;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;
import com.squareup.leakcanary.C7582R;

public class PlayCardViewMyAppsV2 extends d implements OnClickListener, ae, C3076f, C3897j, C3077k, C3898o {
    public C1461c f19492a;
    public int f19493b;
    public View f19494c;
    public TextView f19495d;
    public TextView f19496e;
    public TextView f19497f;
    public PlayActionButtonV2 f19498g;
    public ViewGroup f19499h;
    public FrameLayout f19500i;
    public DetailsTextBlock f19501j;
    public ImageView f19502k;
    public FrameLayout f19503l;
    public TextView f19504m;
    public TextView f19505n;
    public ProgressBar f19506o;
    public ImageView f19507p;
    public int f19508q;
    public cf f19509r;
    public boolean f19510s;
    public CharSequence f19511t;

    public PlayCardViewMyAppsV2(Context context) {
        this(context, null);
    }

    public PlayCardViewMyAppsV2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f19493b = context.getResources().getDimensionPixelSize(C7582R.dimen.play_card_flat_list_vpadding);
    }

    protected void onFinishInflate() {
        ((ae) C3947d.m18649a(ae.class)).mo1887a(this);
        super.onFinishInflate();
        setTag(C7582R.id.accept_page_margin, "");
        this.f19504m = (TextView) findViewById(C7582R.id.downloading_percentage);
        this.f19505n = (TextView) findViewById(C7582R.id.downloading_bytes);
        this.f19506o = (ProgressBar) findViewById(C7582R.id.progress_ring);
        this.f19494c = findViewById(C7582R.id.li_separator);
        this.f19507p = (ImageView) findViewById(C7582R.id.li_cancel);
        this.f19498g = (PlayActionButtonV2) findViewById(C7582R.id.action_button);
        this.f19495d = (TextView) findViewById(C7582R.id.li_size);
        this.f19496e = (TextView) findViewById(C7582R.id.li_delimiter);
        this.f19497f = (TextView) findViewById(C7582R.id.li_last_use);
        this.f19500i = (FrameLayout) findViewById(C7582R.id.whats_new_frame);
        this.f19503l = (FrameLayout) findViewById(C7582R.id.whats_new_arrow_frame);
        this.f19502k = (ImageView) findViewById(C7582R.id.whats_new_arrow);
        this.f19499h = (ViewGroup) findViewById(C7582R.id.content_container);
        this.ah = null;
    }

    public int getPaddingBottom() {
        return this.f19493b;
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Object obj;
        int i5;
        int a;
        int i6;
        int i7;
        super.onLayout(z, i, i2, i3, i4);
        if (ai.f1848a.mo400k(this) == 0) {
            obj = 1;
        } else {
            obj = null;
        }
        int height = this.f19499h.getHeight() / 2;
        int measuredHeight = height - this.V.getMeasuredHeight();
        int left = this.V.getLeft();
        int right = this.V.getRight();
        int measuredHeight2 = height + this.f19495d.getMeasuredHeight();
        int left2 = this.f19495d.getLeft();
        int right2 = this.f19495d.getRight();
        int measuredHeight3 = height + this.f19496e.getMeasuredHeight();
        int left3 = this.f19496e.getLeft();
        int right3 = this.f19496e.getRight();
        int measuredHeight4 = height + this.f19497f.getMeasuredHeight();
        int left4 = this.f19497f.getLeft();
        int right4 = this.f19497f.getRight();
        int b = C0361r.m2051b((MarginLayoutParams) this.V.getLayoutParams());
        if (this.f19498g.getVisibility() == 8 && this.f19507p.getVisibility() == 8) {
            if (obj == null) {
                i3 = i;
            }
            i5 = i3;
        } else {
            View view = this.f19498g.getVisibility() == 0 ? this.f19498g : this.f19507p;
            a = C0361r.m2049a((MarginLayoutParams) view.getLayoutParams());
            if (obj != null) {
                a = view.getLeft() - a;
            } else {
                a += view.getRight();
            }
            i5 = a;
        }
        if (obj != null) {
            a = i5 - b;
        } else {
            a = i5 + b;
        }
        Object obj2 = obj != null ? this.V.getRight() > a ? 1 : null : this.V.getLeft() < a ? 1 : null;
        if (obj2 != null) {
            if (obj != null) {
                i6 = left;
            } else {
                i6 = a;
                a = right;
            }
            this.V.setHorizontalFadingEdgeEnabled(true);
            right = a;
            left = i6;
        } else if (obj == null) {
            this.V.setHorizontalFadingEdgeEnabled(false);
        }
        if (this.f19503l.getVisibility() == 8 || this.f19502k.getVisibility() == 8) {
            i6 = i5;
        } else {
            if (obj != null) {
                a = this.f19503l.getLeft() + this.f19502k.getLeft();
            } else {
                a = this.f19503l.getRight() - this.f19502k.getRight();
            }
            i6 = a;
        }
        if (obj != null) {
            a = i6 - b;
        } else {
            a = i6 + b;
        }
        Object obj3 = obj != null ? this.f19495d.getRight() > a ? 1 : null : this.f19495d.getLeft() < a ? 1 : null;
        if (obj3 != null) {
            if (obj != null) {
                i7 = left2;
            } else {
                i7 = a;
                a = right2;
            }
            this.f19495d.setHorizontalFadingEdgeEnabled(true);
            right2 = a;
            left2 = i7;
            a = left4;
            i7 = left3;
        } else {
            this.f19495d.setHorizontalFadingEdgeEnabled(false);
            if (this.f19503l.getVisibility() == 8 || this.f19502k.getVisibility() == 8) {
                a = C0361r.m2051b((MarginLayoutParams) this.f19497f.getLayoutParams());
                if (obj != null) {
                    a = i6 - a;
                } else {
                    a += i6;
                }
            } else {
                a = i6;
            }
            obj2 = obj != null ? this.f19497f.getRight() > a ? 1 : null : this.f19497f.getLeft() < a ? 1 : null;
            if (obj2 != null) {
                obj2 = obj != null ? this.f19497f.getLeft() > a ? 1 : null : this.f19497f.getRight() < a ? 1 : null;
                if (obj2 != null) {
                    a = left4;
                    i7 = left3;
                } else if (obj != null) {
                    i7 = right3;
                } else {
                    left4 = a;
                    i7 = right3;
                    a = right4;
                }
                this.f19497f.setHorizontalFadingEdgeEnabled(true);
                int i8 = a;
                a = left4;
                left4 = i8;
            } else {
                this.f19497f.setHorizontalFadingEdgeEnabled(false);
                a = left4;
                i7 = right3;
                left4 = right4;
            }
        }
        if (this.f19504m.getVisibility() != 8) {
            this.f19505n.layout(this.f19505n.getLeft(), height, this.f19505n.getRight(), this.f19505n.getMeasuredHeight() + height);
            this.f19504m.layout(this.f19504m.getLeft(), height, this.f19504m.getRight(), this.f19505n.getMeasuredHeight() + height);
        }
        if (this.V.getVisibility() != 8) {
            this.V.layout(left, measuredHeight, right, height);
        }
        if (this.f19495d.getVisibility() != 8) {
            this.f19495d.layout(left2, height, right2, measuredHeight2);
        }
        if (this.f19496e.getVisibility() != 8) {
            this.f19496e.layout(left3, height, i7, measuredHeight3);
        }
        if (this.f19497f.getVisibility() != 8) {
            this.f19497f.layout(a, height, left4, measuredHeight4);
        }
        if (this.f19503l.getVisibility() != 8) {
            a = (this.f19495d.getMeasuredHeight() / 2) + height;
            i7 = this.f19502k.getMeasuredHeight() / 2;
            this.f19502k.layout(this.f19502k.getLeft(), a - i7, this.f19502k.getRight(), a + i7);
        }
    }

    public final void m18460a(int i, boolean z, String str, String str2, String str3, CharSequence charSequence, boolean z2) {
        boolean z3 = true;
        int i2 = false;
        this.f19508q = i;
        this.f19511t = charSequence;
        this.f19510s = z2;
        m18456a(this.f19511t, this.f19510s, false);
        switch (this.f19508q) {
            case 0:
            case 3:
            case 7:
                m18457a(true, (OnClickListener) this);
                break;
            case 1:
            case 2:
            case 4:
                boolean z4;
                int i3;
                int i4;
                int i5;
                boolean z5 = this.f19508q == 4;
                this.f19504m.setVisibility(8);
                this.f19505n.setVisibility(8);
                this.f19506o.setVisibility(8);
                m18459b(1.0f);
                if (TextUtils.isEmpty(str3)) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                PlayActionButtonV2 playActionButtonV2 = this.f19498g;
                if (z4) {
                    i3 = 0;
                } else {
                    i3 = 8;
                }
                playActionButtonV2.setVisibility(i3);
                if (z4) {
                    this.f19498g.mo2588a(3, str3, (OnClickListener) this);
                    setNextFocusRightId(C7582R.id.action_button);
                    this.f19498g.setNextFocusLeftId(C7582R.id.play_card_flat_list);
                }
                if (z5) {
                    m18458a(true, z4, (OnClickListener) this);
                    this.f19507p.setContentDescription(getContext().getResources().getString(C7582R.string.archive_label));
                } else {
                    this.f19507p.setVisibility(8);
                }
                if (TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                    str = str2;
                    str2 = null;
                }
                if (TextUtils.isEmpty(str)) {
                    z5 = false;
                } else {
                    z5 = true;
                }
                if (TextUtils.isEmpty(str2)) {
                    z3 = false;
                }
                TextView textView = this.f19495d;
                if (z5) {
                    i4 = 0;
                } else {
                    i4 = 8;
                }
                textView.setVisibility(i4);
                if (z5 && z3) {
                    this.f19496e.setVisibility(0);
                } else {
                    this.f19496e.setVisibility(8);
                }
                TextView textView2 = this.f19497f;
                if (z3) {
                    i5 = 0;
                } else {
                    i5 = 8;
                }
                textView2.setVisibility(i5);
                this.f19495d.setText(str);
                this.f19497f.setText(str2);
                if (!TextUtils.isEmpty(this.f19511t) && this.f19492a.dj().mo2294a(12634611)) {
                    this.f19503l.setVisibility(0);
                    this.f19503l.setOnClickListener(this);
                    break;
                }
                this.f19503l.setVisibility(8);
                break;
                break;
            case 5:
                this.f19504m.setVisibility(8);
                this.f19505n.setVisibility(8);
                this.f19506o.setVisibility(8);
                this.f19507p.setVisibility(8);
                this.f19498g.setVisibility(8);
                this.f19495d.setVisibility(8);
                this.f19496e.setVisibility(8);
                this.f19497f.setVisibility(8);
                this.f19503l.setVisibility(8);
                this.ah.setVisibility(0);
                break;
            case 6:
                m18457a(false, null);
                break;
            case 8:
                m18454a((int) C7582R.string.myapps_card_info_download_error, (OnClickListener) this);
                break;
            case 9:
                m18454a((int) C7582R.string.myapps_card_info_install_error, (OnClickListener) this);
                break;
            default:
                FinskyLog.m21669e("Unknown PlayCardViewMyAppsV2 sub type %d", Integer.valueOf(this.f19508q));
                break;
        }
        if (!z) {
            i2 = 8;
        }
        setSeparatorVisibility(i2);
    }

    private final void m18457a(boolean z, OnClickListener onClickListener) {
        this.f19498g.setVisibility(8);
        this.f19495d.setVisibility(8);
        this.f19496e.setVisibility(8);
        this.f19497f.setVisibility(8);
        this.f19503l.setVisibility(8);
        this.f19504m.setVisibility(0);
        this.f19505n.setVisibility(0);
        this.f19506o.setVisibility(0);
        if (z) {
            m18458a(true, false, onClickListener);
        } else {
            this.f19507p.setVisibility(8);
        }
        m18459b(0.5f);
    }

    private final void m18454a(int i, OnClickListener onClickListener) {
        this.f19498g.setVisibility(8);
        this.f19496e.setVisibility(8);
        this.f19497f.setVisibility(8);
        this.f19503l.setVisibility(8);
        this.f19504m.setVisibility(8);
        this.f19505n.setVisibility(8);
        this.f19506o.setVisibility(8);
        m18459b(1.0f);
        this.f19495d.setText(i);
        this.f19495d.setVisibility(0);
        m18458a(false, false, onClickListener);
    }

    public void setActionListener(cf cfVar) {
        this.f19509r = cfVar;
    }

    protected void setSeparatorVisibility(int i) {
        if (this.f19494c != null) {
            this.f19494c.setVisibility(i);
        }
    }

    public int getSubType() {
        return this.f19508q;
    }

    public TextView getDownloadingBytesView() {
        return this.f19505n;
    }

    public TextView getDownloadingPercentageView() {
        return this.f19504m;
    }

    public ProgressBar getDownloadingProgressRing() {
        return this.f19506o;
    }

    public void onClick(View view) {
        if (this.f19509r != null) {
            if (view == this.f19498g) {
                this.f19509r.mo4125a(this);
                return;
            } else if (view == this.f19507p) {
                if (this.f19508q == 8 || this.f19508q == 9) {
                    this.f19509r.mo4128c(this);
                    return;
                } else {
                    this.f19509r.mo4127b(this);
                    return;
                }
            } else if (view == this.f19503l) {
                this.f19509r.mo4126a(this, !this.f19510s);
                return;
            }
        }
        performClick();
    }

    public void setWhatsNewVisibility(boolean z) {
        this.f19510s = z;
        m18456a(this.f19511t, this.f19510s, true);
    }

    private final void m18458a(boolean z, boolean z2, OnClickListener onClickListener) {
        this.f19507p.setVisibility(0);
        setNextFocusRightId(C7582R.id.li_cancel);
        this.f19507p.setNextFocusLeftId(z2 ? C7582R.id.action_button : C7582R.id.play_card_flat_list);
        if (z) {
            this.f19507p.clearColorFilter();
            this.f19507p.setImageResource(C7582R.drawable.play_card_view_action_button_close);
            this.f19507p.setContentDescription(getContext().getResources().getString(C7582R.string.cancel));
        } else {
            this.f19507p.setImageResource(C7582R.drawable.ic_refresh_white_24dp);
            this.f19507p.setColorFilter(C7582R.color.play_fg_secondary);
            this.f19507p.setContentDescription(getContext().getResources().getString(C7582R.string.ic_button_retry));
        }
        if (onClickListener != null) {
            this.f19507p.setOnClickListener(onClickListener);
        }
    }

    private final void m18456a(CharSequence charSequence, boolean z, boolean z2) {
        int measuredHeight;
        float f = 1.0f;
        float f2 = 0.0f;
        if (z) {
            if (this.f19501j == null) {
                this.f19501j = (DetailsTextBlock) LayoutInflater.from(getContext()).inflate(C7582R.layout.details_text_block, this.f19500i, false);
                this.f19501j.m13581a(getResources().getString(C7582R.string.details_whats_new).toUpperCase(), charSequence, 30);
                this.f19501j.m13580a(3, 0, 0);
                this.f19501j.setBodyClickListener(this);
                this.f19500i.addView(this.f19501j, -1, -2);
            } else {
                this.f19501j.setBody(charSequence);
            }
            this.f19500i.measure(MeasureSpec.makeMeasureSpec((getWidth() - getPaddingLeft()) - getPaddingRight(), MemoryMappedFileBuffer.DEFAULT_SIZE), MeasureSpec.makeMeasureSpec(0, 0));
            measuredHeight = this.f19500i.getMeasuredHeight();
        } else {
            measuredHeight = 0;
        }
        if (z2) {
            int i;
            if (z) {
                i = 0;
            } else {
                i = this.f19500i.getHeight();
            }
            ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{i, measuredHeight});
            ofInt.addUpdateListener(new cd(this));
            ofInt.setDuration((long) getResources().getInteger(17694720));
            if (VERSION.SDK_INT <= 19 && (getParent() instanceof View)) {
                ofInt.addUpdateListener(new ce((View) getParent()));
            }
            ofInt.start();
            ImageView imageView = this.f19502k;
            String str = "rotation";
            float[] fArr = new float[1];
            fArr[0] = z ? 180.0f : 0.0f;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(imageView, str, fArr);
            ofFloat.setDuration((long) getResources().getInteger(17694720));
            ofFloat.start();
            FrameLayout frameLayout = this.f19500i;
            String str2 = "alpha";
            float[] fArr2 = new float[1];
            if (z) {
                f2 = 1.0f;
            }
            fArr2[0] = f2;
            ofFloat = ObjectAnimator.ofFloat(frameLayout, str2, fArr2);
            ofFloat.setDuration((long) getResources().getInteger(17694720));
            ofFloat.start();
            return;
        }
        float f3;
        LayoutParams layoutParams = this.f19500i.getLayoutParams();
        if (z && getMeasuredWidth() == 0) {
            layoutParams.height = -2;
        } else {
            layoutParams.height = measuredHeight;
        }
        this.f19500i.setLayoutParams(layoutParams);
        ImageView imageView2 = this.f19502k;
        if (z) {
            f3 = 180.0f;
        } else {
            f3 = 0.0f;
        }
        imageView2.setRotation(f3);
        frameLayout = this.f19500i;
        if (!z) {
            f = 0.0f;
        }
        frameLayout.setAlpha(f);
    }

    public int getCardType() {
        return 28;
    }

    public int getSeparatorMarginLeft() {
        return 0;
    }

    public int getSeparatorMarginRight() {
        return 0;
    }

    private final void m18459b(float f) {
        View imageView = this.U.getImageView();
        if (ai.f1848a.mo409s(imageView)) {
            Animator ofFloat = ObjectAnimator.ofFloat(imageView, View.SCALE_X.getName(), new float[]{f});
            Animator ofFloat2 = ObjectAnimator.ofFloat(imageView, View.SCALE_Y.getName(), new float[]{f});
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.play(ofFloat).with(ofFloat2);
            animatorSet.setInterpolator(new AccelerateInterpolator());
            animatorSet.setDuration((long) getResources().getInteger(17694720)).start();
            return;
        }
        imageView.setScaleX(f);
        imageView.setScaleY(f);
    }

    public final void Z_() {
        View imageView = this.U.getImageView();
        imageView.setScaleX(1.0f);
        imageView.setScaleY(1.0f);
    }
}
