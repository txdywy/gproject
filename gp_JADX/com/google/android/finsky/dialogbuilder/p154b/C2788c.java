package com.google.android.finsky.dialogbuilder.p154b;

import android.os.Bundle;
import java.util.Calendar;

public final class C2788c {
    public final C2791f f15081a;
    public final C2792h f15082b;
    public Calendar f15083c;

    public C2788c(C2791f c2791f, C2792h c2792h, Bundle bundle) {
        this.f15081a = c2791f;
        this.f15082b = c2792h;
        if (bundle != null && bundle.containsKey("DialogCalendarDateModel.date")) {
            this.f15083c = (Calendar) bundle.getSerializable("DialogCalendarDateModel.date");
        }
    }
}
