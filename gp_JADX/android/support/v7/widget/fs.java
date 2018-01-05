package android.support.v7.widget;

import android.os.Build.VERSION;
import android.support.v4.view.C0132b;
import android.support.v4.view.p038a.C0333b;
import android.support.v4.view.p038a.C0335d;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo.CollectionInfo;

public final class fs extends C0132b {
    public final RecyclerView f3485a;
    public final C0132b f3486e = new ft(this);

    public fs(RecyclerView recyclerView) {
        this.f3485a = recyclerView;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo131a(android.view.View r8, int r9, android.os.Bundle r10) {
        /*
        r7 = this;
        r5 = -1;
        r2 = 1;
        r1 = 0;
        r0 = super.mo131a(r8, r9, r10);
        if (r0 == 0) goto L_0x000b;
    L_0x0009:
        r1 = r2;
    L_0x000a:
        return r1;
    L_0x000b:
        r0 = r7.f3485a;
        r0 = r0.m317q();
        if (r0 != 0) goto L_0x000a;
    L_0x0013:
        r0 = r7.f3485a;
        r0 = r0.getLayoutManager();
        if (r0 == 0) goto L_0x000a;
    L_0x001b:
        r0 = r7.f3485a;
        r4 = r0.getLayoutManager();
        r0 = r4.f2960y;
        r0 = r0.f517k;
        r0 = r4.f2960y;
        r0 = r0.ao;
        r0 = r4.f2960y;
        if (r0 == 0) goto L_0x000a;
    L_0x002d:
        switch(r9) {
            case 4096: goto L_0x006b;
            case 8192: goto L_0x003d;
            default: goto L_0x0030;
        };
    L_0x0030:
        r0 = r1;
        r3 = r1;
    L_0x0032:
        if (r3 != 0) goto L_0x0036;
    L_0x0034:
        if (r0 == 0) goto L_0x000a;
    L_0x0036:
        r1 = r4.f2960y;
        r1.scrollBy(r0, r3);
        r1 = r2;
        goto L_0x000a;
    L_0x003d:
        r0 = r4.f2960y;
        r0 = r0.canScrollVertically(r5);
        if (r0 == 0) goto L_0x009c;
    L_0x0045:
        r0 = r4.f2958N;
        r3 = r4.getPaddingTop();
        r0 = r0 - r3;
        r3 = r4.getPaddingBottom();
        r0 = r0 - r3;
        r0 = -r0;
    L_0x0052:
        r3 = r4.f2960y;
        r3 = r3.canScrollHorizontally(r5);
        if (r3 == 0) goto L_0x0097;
    L_0x005a:
        r3 = r4.f2957M;
        r5 = r4.getPaddingLeft();
        r3 = r3 - r5;
        r5 = r4.getPaddingRight();
        r3 = r3 - r5;
        r3 = -r3;
        r6 = r3;
        r3 = r0;
        r0 = r6;
        goto L_0x0032;
    L_0x006b:
        r0 = r4.f2960y;
        r0 = r0.canScrollVertically(r2);
        if (r0 == 0) goto L_0x009a;
    L_0x0073:
        r0 = r4.f2958N;
        r3 = r4.getPaddingTop();
        r0 = r0 - r3;
        r3 = r4.getPaddingBottom();
        r0 = r0 - r3;
    L_0x007f:
        r3 = r4.f2960y;
        r3 = r3.canScrollHorizontally(r2);
        if (r3 == 0) goto L_0x0097;
    L_0x0087:
        r3 = r4.f2957M;
        r5 = r4.getPaddingLeft();
        r3 = r3 - r5;
        r5 = r4.getPaddingRight();
        r3 = r3 - r5;
        r6 = r3;
        r3 = r0;
        r0 = r6;
        goto L_0x0032;
    L_0x0097:
        r3 = r0;
        r0 = r1;
        goto L_0x0032;
    L_0x009a:
        r0 = r1;
        goto L_0x007f;
    L_0x009c:
        r0 = r1;
        goto L_0x0052;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.fs.a(android.view.View, int, android.os.Bundle):boolean");
    }

    public final void mo67a(View view, C0333b c0333b) {
        super.mo67a(view, c0333b);
        c0333b.m1773b(RecyclerView.class.getName());
        if (!this.f3485a.m317q() && this.f3485a.getLayoutManager() != null) {
            C0335d c0335d;
            ew layoutManager = this.f3485a.getLayoutManager();
            fh fhVar = layoutManager.f2960y.f517k;
            fo foVar = layoutManager.f2960y.ao;
            if (layoutManager.f2960y.canScrollVertically(-1) || layoutManager.f2960y.canScrollHorizontally(-1)) {
                c0333b.m1765a(8192);
                c0333b.m1784i(true);
            }
            if (layoutManager.f2960y.canScrollVertically(1) || layoutManager.f2960y.canScrollHorizontally(1)) {
                c0333b.m1765a((int) eq.FLAG_APPEARED_IN_PRE_LAYOUT);
                c0333b.m1784i(true);
            }
            int a = layoutManager.mo793a(fhVar, foVar);
            int b = layoutManager.mo806b(fhVar, foVar);
            if (VERSION.SDK_INT >= 21) {
                c0335d = new C0335d(CollectionInfo.obtain(a, b, false, 0));
            } else if (VERSION.SDK_INT >= 19) {
                c0335d = new C0335d(CollectionInfo.obtain(a, b, false));
            } else {
                c0335d = new C0335d(null);
            }
            if (VERSION.SDK_INT >= 19) {
                c0333b.f1829a.setCollectionInfo((CollectionInfo) c0335d.f1834a);
            }
        }
    }

    public final void mo145a(View view, AccessibilityEvent accessibilityEvent) {
        super.mo145a(view, accessibilityEvent);
        accessibilityEvent.setClassName(RecyclerView.class.getName());
        if ((view instanceof RecyclerView) && !this.f3485a.m317q()) {
            RecyclerView recyclerView = (RecyclerView) view;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().mo732a(accessibilityEvent);
            }
        }
    }
}
