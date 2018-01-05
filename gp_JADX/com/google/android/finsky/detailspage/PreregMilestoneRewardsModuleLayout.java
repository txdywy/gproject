package com.google.android.finsky.detailspage;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.RelativeLayout;
import com.google.android.finsky.cv.p177a.C2441n;
import com.google.android.finsky.cv.p177a.fd;
import com.google.android.finsky.cv.p177a.iw;
import com.google.android.play.image.C1294w;
import com.google.android.play.image.FifeImageView;
import com.google.android.play.layout.PlayTextView;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;
import com.squareup.leakcanary.C7582R;

public class PreregMilestoneRewardsModuleLayout extends dk {
    public View f14036a;
    public float f14037b;
    public ViewGroup f14038c;
    public ViewGroup f14039d;

    public class MilestoneLayout extends RelativeLayout {
        public PlayTextView f14033a;
        public PlayTextView f14034b;
        public FifeImageView f14035c;

        public MilestoneLayout(Context context) {
            this(context, null);
        }

        public MilestoneLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        protected void onFinishInflate() {
            super.onFinishInflate();
            this.f14033a = (PlayTextView) findViewById(C7582R.id.milestone_target);
            this.f14034b = (PlayTextView) findViewById(C7582R.id.milestone_reward);
            this.f14035c = (FifeImageView) findViewById(C7582R.id.milestone_badge);
        }
    }

    public PreregMilestoneRewardsModuleLayout(Context context) {
        this(context, null);
    }

    public PreregMilestoneRewardsModuleLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f14036a = findViewById(C7582R.id.milestone_progress_foreground);
        this.f14038c = (ViewGroup) findViewById(C7582R.id.reward_milestones_container);
        this.f14039d = (ViewGroup) findViewById(C7582R.id.achieved_milestones_container);
    }

    public final void mo3007a(C2441n c2441n, C1294w c1294w, String str, OnClickListener onClickListener, OnClickListener onClickListener2) {
        super.mo3007a(c2441n, c1294w, str, onClickListener, onClickListener2);
        fd fdVar = c2441n.f13158G.f12544a;
        if (fdVar.f12355b.length != 0) {
            int i;
            int i2;
            LayoutInflater from = LayoutInflater.from(getContext());
            for (i = 0; i < fdVar.f12355b.length; i++) {
                Object obj;
                if (i >= this.f14038c.getChildCount()) {
                    from.inflate(C7582R.layout.prereg_rewards_milestone_layout, this.f14038c);
                }
                MilestoneLayout milestoneLayout = (MilestoneLayout) this.f14038c.getChildAt(i);
                milestoneLayout.setVisibility(0);
                for (iw a : fdVar.f12355b) {
                    if (m13773a(a)) {
                        obj = null;
                        break;
                    }
                }
                obj = 1;
                iw iwVar = fdVar.f12355b[i];
                if (m13773a(iwVar)) {
                    milestoneLayout.f14035c.setVisibility(0);
                    milestoneLayout.f14035c.a(iwVar.f12744e.f11860f, iwVar.f12744e.f11863i, c1294w);
                } else {
                    milestoneLayout.f14035c.setVisibility(obj != null ? 8 : 4);
                }
                milestoneLayout.f14033a.setText(milestoneLayout.getContext().getString(C7582R.string.preregistration_reward_milestone_target, new Object[]{Integer.valueOf(i + 1), iwVar.f12742c}));
                milestoneLayout.f14034b.setText(iwVar.f12743d);
            }
            for (i = fdVar.f12355b.length; i < this.f14038c.getChildCount(); i++) {
                ((MilestoneLayout) this.f14038c.getChildAt(i)).setVisibility(8);
            }
            LayoutInflater from2 = LayoutInflater.from(getContext());
            for (i2 = 0; i2 < fdVar.f12356c; i2++) {
                if (i2 >= this.f14039d.getChildCount()) {
                    from2.inflate(C7582R.layout.prereg_milestone_achieved_layout, this.f14039d);
                }
                this.f14039d.getChildAt(i2).setVisibility(0);
            }
            for (i2 = fdVar.f12356c; i2 < this.f14039d.getChildCount(); i2++) {
                this.f14039d.getChildAt(i2).setVisibility(8);
            }
            this.f14037b = Math.max((float) fdVar.f12356c, 0.2f) / ((float) fdVar.f12355b.length);
        }
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.f14036a.getLayoutParams();
        int measuredHeight = (int) (((float) ((((View) this.f14036a.getParent()).getMeasuredHeight() - marginLayoutParams.topMargin) - marginLayoutParams.bottomMargin)) * this.f14037b);
        marginLayoutParams.height = measuredHeight;
        this.f14036a.measure(MeasureSpec.makeMeasureSpec(this.f14036a.getMeasuredWidth(), MemoryMappedFileBuffer.DEFAULT_SIZE), MeasureSpec.makeMeasureSpec(measuredHeight, MemoryMappedFileBuffer.DEFAULT_SIZE));
        for (int i3 = 0; i3 < this.f14039d.getChildCount(); i3++) {
            LayoutParams layoutParams = this.f14039d.getChildAt(i3).getLayoutParams();
            if (i3 >= this.f14038c.getChildCount()) {
                measuredHeight = 0;
            } else {
                measuredHeight = this.f14038c.getChildAt(i3).getMeasuredHeight();
            }
            layoutParams.height = measuredHeight;
        }
    }

    private static boolean m13773a(iw iwVar) {
        return (iwVar.f12744e == null || TextUtils.isEmpty(iwVar.f12744e.f11860f)) ? false : true;
    }
}
