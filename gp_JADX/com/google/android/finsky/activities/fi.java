package com.google.android.finsky.activities;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;
import com.squareup.leakcanary.C7582R;
import java.util.Arrays;

final class fi implements OnClickListener {
    public final /* synthetic */ ff f6801a;

    fi(ff ffVar) {
        this.f6801a = ffVar;
    }

    public final void onClick(View view) {
        int i;
        int i2 = 0;
        for (i = 0; i < this.f6801a.f6796f; i++) {
            this.f6801a.f6797g[i] = ((CheckBox) ((TextView) this.f6801a.f6786j.getChildAt(i))).isChecked();
        }
        long[] jArr = new long[this.f6801a.f6796f];
        int i3 = 0;
        while (i2 < this.f6801a.f6796f) {
            if (this.f6801a.f6797g[i2]) {
                long a = this.f6801a.f6792b.m1683a(this.f6801a.f6792b.m1682a(this.f6801a.n[i2]));
                i = i3 + 1;
                jArr[i3] = a;
                i3 = i;
            }
            i2++;
        }
        this.f6801a.f6791a.mo2293a(Arrays.copyOf(jArr, i3));
        Toast.makeText(this.f6801a.f6795e, C7582R.string.debug_targets_override_set_notification, 1).show();
        new Handler(Looper.getMainLooper()).postDelayed(this.f6801a.f6798h, 3000);
    }
}
