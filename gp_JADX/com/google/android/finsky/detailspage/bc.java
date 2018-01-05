package com.google.android.finsky.detailspage;

import android.support.v4.app.cq;
import android.view.View;
import android.view.View.MeasureSpec;
import com.google.android.play.image.FifeImageView;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;
import com.squareup.leakcanary.C7582R;
import java.util.List;

final class bc extends cq {
    public boolean f14269a;
    public final /* synthetic */ aw f14270b;

    bc(aw awVar) {
        this.f14270b = awVar;
    }

    public final void mo3050a(List list, List list2) {
        int i = 0;
        this.f14269a = this.f14270b.f746R == null;
        if (!list2.isEmpty()) {
            if (this.f14269a) {
                for (int i2 = 0; i2 < list.size(); i2++) {
                    View view = (View) list2.get(i2);
                    if (((String) list.get(i2)).startsWith("transition_card_details:cover:")) {
                        this.f14270b.bg = (FifeImageView) view;
                        this.f14270b.bg.setAlpha(0.0f);
                        int[] iArr = new int[2];
                        View view2 = view;
                        int i3 = 0;
                        int i4 = 0;
                        while (view2 != null) {
                            int i5;
                            int id = view2.getId();
                            if (id == C7582R.id.play_card || id == C7582R.id.order_history_row) {
                                view2.getLocationInWindow(iArr);
                                i5 = iArr[0];
                                i4 = iArr[1];
                                this.f14270b.bk = view2.getMeasuredWidth();
                                this.f14270b.bj = view2.getMeasuredHeight();
                            } else {
                                i5 = i4;
                                i4 = i3;
                            }
                            if (id == C7582R.id.drawer_layout) {
                                i3 = i4;
                                i4 = i5;
                                break;
                            }
                            view2 = (View) view2.getParent();
                            i3 = i4;
                            i4 = i5;
                        }
                        view2.getLocationInWindow(iArr);
                        this.f14270b.bi = i4 - iArr[0];
                        this.f14270b.bh = i3 - iArr[1];
                    }
                }
                return;
            }
            FifeImageView fifeImageView;
            while (i < list.size()) {
                if (((String) list.get(i)).startsWith("transition_card_details:cover:")) {
                    fifeImageView = (FifeImageView) list2.get(i);
                    break;
                }
                i++;
            }
            fifeImageView = null;
            if (!(this.f14270b.bf == null || fifeImageView == null)) {
                fifeImageView.I = true;
                fifeImageView.setImageBitmap(this.f14270b.bf);
                fifeImageView.measure(MeasureSpec.makeMeasureSpec(fifeImageView.getMeasuredWidth(), MemoryMappedFileBuffer.DEFAULT_SIZE), MeasureSpec.makeMeasureSpec(fifeImageView.getMeasuredHeight(), MemoryMappedFileBuffer.DEFAULT_SIZE));
                fifeImageView.layout(fifeImageView.getLeft(), fifeImageView.getTop(), fifeImageView.getRight(), fifeImageView.getBottom());
                if (this.f14270b.bg != null) {
                    this.f14270b.bg.setImageBitmap(this.f14270b.bf);
                    this.f14270b.bg.I = true;
                }
            }
            this.f14270b.bf = null;
        }
    }

    public final void mo3049a() {
        this.f14269a = false;
        if (this.f14270b.bg != null && this.f14270b.f746R != null) {
            this.f14270b.bg.a(false);
            this.f14270b.bg = null;
        }
    }
}
