package android.support.design.widget.transformation;

import android.content.Context;
import android.support.design.C0106a;
import android.support.design.p018a.C0102h;
import android.support.design.p018a.C0104j;
import android.util.AttributeSet;

public class FabTransformationSheetBehavior extends FabTransformationBehavior {
    public FabTransformationSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected final C0169g mo195a(Context context, boolean z) {
        int i;
        if (z) {
            i = C0106a.mtrl_fab_transformation_sheet_expand_spec;
        } else {
            i = C0106a.mtrl_fab_transformation_sheet_collapse_spec;
        }
        C0169g c0169g = new C0169g();
        c0169g.f1000a = C0102h.m210a(context, i);
        c0169g.f1001b = new C0104j();
        return c0169g;
    }
}
