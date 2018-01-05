package com.google.android.libraries.flowlayoutmanager;

import android.content.Context;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.os.C0330d;
import android.support.v4.view.p038a.C0332a;
import android.support.v4.view.p038a.C0340i;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.em;
import android.support.v7.widget.ew;
import android.support.v7.widget.ez;
import android.support.v7.widget.fa;
import android.support.v7.widget.fh;
import android.support.v7.widget.fl;
import android.support.v7.widget.fo;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.accessibility.AccessibilityEvent;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;
import java.util.ArrayList;
import java.util.List;

public final class FlowLayoutManager extends ew {
    public static final int f29486a = C5918a.m27463a();
    public static final Rect f29487h = new Rect();
    public boolean f29488b;
    public boolean f29489c;
    public int f29490d = f29486a;
    public int f29491e = f29486a;
    public final List f29492f = new ArrayList();
    public boolean f29493g;
    public C5922d f29494i;
    public C5920k f29495j;
    public boolean f29496k;
    public int f29497l = -1;
    public int f29498m = Integer.MIN_VALUE;
    public int f29499n;
    public int f29500o;
    public int f29501p;
    public boolean f29502q;
    public SavedState f29503r = null;

    class SavedState implements Parcelable {
        public static final Creator CREATOR = new C5930m();
        public int f29484a;
        public float f29485b;

        SavedState(Parcel parcel) {
            this.f29484a = parcel.readInt();
            this.f29485b = parcel.readFloat();
        }

        public SavedState(SavedState savedState) {
            this.f29484a = savedState.f29484a;
            this.f29485b = savedState.f29485b;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f29484a);
            parcel.writeFloat(this.f29485b);
        }
    }

    public FlowLayoutManager() {
        m3057m();
    }

    public final boolean mo805a(fa faVar) {
        return faVar instanceof C5927g;
    }

    public final void mo2969a(View view, int i, int i2) {
        if (view.getLayoutParams() instanceof C5927g) {
            throw new UnsupportedOperationException("Views using FlowLayoutManager.LayoutParams should not be measured with measureChildWithMargins()");
        }
        super.mo2969a(view, i, i2);
    }

    private final void m27424a(int i) {
        ((C5929l) this.f29492f.remove(i)).m27524e();
        if (i == 0) {
            this.f29493g = true;
        }
    }

    private final void m27432c() {
        for (int size = this.f29492f.size() - 1; size >= 0; size--) {
            ((C5929l) this.f29492f.get(size)).m27524e();
        }
        this.f29492f.clear();
    }

    public final void mo730a(RecyclerView recyclerView, fh fhVar) {
        m27432c();
        super.mo730a(recyclerView, fhVar);
    }

    public final void mo4460a(em emVar, em emVar2) {
        if (this.f29496k) {
            this.f29495j = null;
            this.f29496k = false;
        }
        if (emVar2 instanceof C5921c) {
            this.f29495j = (C5921c) emVar2;
            this.f29496k = true;
        }
        m27432c();
        super.mo4460a(emVar, emVar2);
    }

    public final void mo798a(RecyclerView recyclerView) {
        m27432c();
        super.mo798a(recyclerView);
    }

    public final void mo799a(RecyclerView recyclerView, int i, int i2) {
        m27428b(i, i, i2);
        super.mo799a(recyclerView, i, i2);
    }

    public final void mo807b(RecyclerView recyclerView, int i, int i2) {
        m27428b(i, i + i2, -i2);
        super.mo807b(recyclerView, i, i2);
    }

    public final void mo800a(RecyclerView recyclerView, int i, int i2, int i3) {
        m27428b(Math.min(i, i2), Math.max(i + i3, i2 + i3), 0);
        super.mo800a(recyclerView, i, i2, i3);
    }

    public final void mo4461d(RecyclerView recyclerView, int i, int i2) {
        if (this.f29488b) {
            m27428b(i, i + i2, 0);
        }
        super.mo4461d(recyclerView, i, i2);
    }

    private final void m27428b(int i, int i2, int i3) {
        if (!this.f29492f.isEmpty()) {
            int i4;
            int size = this.f29492f.size() - 1;
            while (size >= 0) {
                C5929l c5929l = (C5929l) this.f29492f.get(size);
                if (c5929l.f < i2 || (c5929l.f <= 0 && !this.f29493g)) {
                    i4 = size + 1;
                    break;
                } else {
                    c5929l.mo5212e(i3);
                    size--;
                }
            }
            i4 = 0;
            int i5 = i4 - 1;
            while (i5 >= 0 && ((C5929l) this.f29492f.get(i5)).m27476d(i) == 2) {
                m27424a(i5);
                i5--;
            }
        }
    }

    private final void m27433g() {
        int size = this.f29492f.size();
        Log.d("FlowLayoutManager", "Layout in bookkeeping: " + size + " section(s)");
        if (size > 0) {
            StringBuilder stringBuilder = new StringBuilder();
            C5929l c5929l = (C5929l) this.f29492f.get(0);
            stringBuilder.append("  §0@").append(c5929l.f);
            if (c5929l.f == 0) {
                stringBuilder.append(this.f29493g ? "(real)" : "(fake)");
            }
            stringBuilder.append(':');
            c5929l.m27519a(stringBuilder);
            Log.d("FlowLayoutManager", stringBuilder.toString());
            for (int i = 1; i < size; i++) {
                stringBuilder.setLength(0);
                c5929l = (C5929l) this.f29492f.get(i);
                stringBuilder.append("  §").append(i).append('@').append(c5929l.f).append(':');
                c5929l.m27519a(stringBuilder);
                Log.d("FlowLayoutManager", stringBuilder.toString());
            }
        }
    }

    private final int m27430c(int i) {
        int p = m3060p();
        if (p == 0 || ew.m2979a(m3051f(0)) > i) {
            return -1;
        }
        if (ew.m2979a(m3051f(p - 1)) < i) {
            return p ^ -1;
        }
        int i2 = 0;
        int i3 = p;
        while (i2 < i3) {
            p = (i2 + i3) / 2;
            int a = ew.m2979a(m3051f(p));
            if (a == i) {
                return p;
            }
            if (a < i) {
                i2 = p + 1;
            } else {
                i3 = p;
            }
        }
        return i2 ^ -1;
    }

    public final View mo736b(int i) {
        int c = m27430c(i);
        return c < 0 ? null : m3051f(c);
    }

    private final int m27418a(fh fhVar, int i, int i2, int i3) {
        int i4;
        int i5;
        int a;
        switch (i - i2) {
            case -1:
                i4 = i3 - 1;
                i5 = i3;
                break;
            case 0:
                i5 = i3;
                i4 = i3;
                break;
            case 1:
                i4 = i3 + 1;
                i5 = i3 + 1;
                break;
            default:
                i4 = -1;
                i5 = -1;
                break;
        }
        if (i4 >= 0 && i4 < m3060p()) {
            a = ew.m2979a(m3051f(i4));
            if (a != i) {
                if ((i4 == i5 ? 1 : null) != (a > i ? 1 : null)) {
                    throw new IllegalArgumentException("Wrong hint precondition.\n\t position=" + i + "\n\t positionHint=" + i2 + "\n\t indexHint=" + i3 + "\n\t potentialIndex=" + i4 + "\n\t insertIndex=" + i5 + "\n\t realChildPosition(potentialIndex)=" + a);
                }
            }
            return i4;
        }
        if (i5 < 0) {
            i4 = m27430c(i);
            if (i4 < 0) {
                int i6 = i4;
                i4 ^= -1;
                boolean z = true;
            }
            return i4;
        }
        i6 = i4;
        i4 = i5;
        z = false;
        View view = fhVar.m3683a(i, Long.MAX_VALUE).f3211a;
        try {
            int a2 = ew.m2979a(view);
            if (a2 != i) {
                throw new IllegalStateException("Recycler.getViewForPosition(" + i + ") returned a view @" + a2);
            }
            super.m3017a(view, i4, false);
            int max = Math.max(0, i4 - 1);
            View f = m3051f(max);
            int a3 = ew.m2979a(f);
            String c = ((C5927g) f.getLayoutParams()).m27503c();
            int min = Math.min(i4 + 1, m3060p() - 1);
            int i7 = a3;
            String str = c;
            a = max + 1;
            while (a <= min) {
                f = m3051f(a);
                int a4 = ew.m2979a(f);
                String c2 = ((C5927g) f.getLayoutParams()).m27503c();
                if (a4 <= i7) {
                    throw new IllegalStateException(new StringBuilder((String.valueOf(str).length() + 305) + String.valueOf(c2).length()).append("Index/position monotonicity broken!\n\t position=").append(i).append("\n\t positionHint=").append(i2).append("\n\t indexHint=").append(i3).append("\n\t potentialIndex=").append(i6).append("\n\t insertIndex=").append(i4).append("\n\t usedBinarySearch=").append(z).append("\n\t p(childAt(").append(a - 1).append("))=").append(i7).append("\n\t   viewHolderDump=").append(str).append("\n\t p(childAt(").append(a).append("))=").append(a4).append("\n\t   viewHolderDump=").append(c2).toString());
                }
                a++;
                str = c2;
                i7 = a4;
            }
            return i4;
        } catch (RuntimeException e) {
            String str2;
            RuntimeException runtimeException = e;
            C5927g c5927g = (C5927g) view.getLayoutParams();
            if (c5927g == null) {
                str2 = "failed: no LayoutParams";
            } else {
                str2 = c5927g.m27503c();
            }
            Log.d("FlowLayoutManager", new StringBuilder(String.valueOf(str2).length() + 224).append("getOrAddChildWithHint() states at exception:\n\t position=").append(i).append("\n\t positionHint=").append(i2).append("\n\t indexHint=").append(i3).append("\n\t potentialIndex=").append(i6).append("\n\t insertIndex=").append(i4).append("\n\t usedBinarySearch=").append(z).append("\n\t child's viewHolderDump=").append(str2).toString());
            throw runtimeException;
        }
    }

    private final void m27434h() {
        int p = m3060p();
        Log.d("FlowLayoutManager", "current child list: " + p + " child(ren)");
        if (p > 0) {
            RecyclerView recyclerView = (RecyclerView) m3051f(0).getParent();
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < p; i++) {
                stringBuilder.append("  #").append(i).append('@');
                View f = m3051f(i);
                stringBuilder.append(ew.m2979a(f)).append(',').append(recyclerView.m275a(f));
                Log.d("FlowLayoutManager", stringBuilder.toString());
                stringBuilder.setLength(0);
            }
        }
    }

    public final void mo5203a(fh fhVar, fo foVar, AccessibilityEvent accessibilityEvent) {
        super.mo5203a(fhVar, foVar, accessibilityEvent);
        C0340i a = C0332a.m1762a(accessibilityEvent);
        if (a != null && a.f1838a.getItemCount() != 0) {
            int i;
            int d;
            for (i = 0; i < m3060p(); i++) {
                View f = m3051f(i);
                if (f.getBottom() > 0) {
                    d = ((C5927g) f.getLayoutParams()).f3356c.m3267d();
                    break;
                }
            }
            d = -1;
            int i2 = this.f2958N;
            for (i = m3060p() - 1; i >= 0; i--) {
                View f2 = m3051f(i);
                if (f2.getTop() < i2) {
                    i = ((C5927g) f2.getLayoutParams()).f3356c.m3267d();
                    break;
                }
            }
            i = -1;
            if (d != -1 && i != -1) {
                a.f1838a.setFromIndex(d);
                a.f1838a.setToIndex(i);
            }
        }
    }

    private final void m27435j() {
        if (this.f29494i == null) {
            this.f29494i = new C5922d();
        }
        C5922d c5922d = this.f29494i;
        c5922d.f29509a = 0;
        c5922d.f29510b = -1;
        c5922d.f29512d = -1;
        c5922d.f29513e = -1;
        c5922d.f29514f = null;
        if (c5922d.f29511c != null) {
            c5922d.f29511c.m27493a();
            c5922d.f29511c = null;
        }
    }

    private final int m27427b(fh fhVar, int i, int i2, int i3) {
        C5923i c5923i = i == -1 ? null : (C5929l) this.f29492f.get(i);
        if (c5923i != null && c5923i.f > i2) {
            throw new IllegalArgumentException("Section at " + i + " impossible to cover position " + i2);
        } else if (i + 1 >= this.f29492f.size() || i2 < ((C5929l) this.f29492f.get(i + 1)).f) {
            int b = c5923i == null ? 0 : c5923i.mo5208b();
            if (b > i2) {
                c5923i.m27475c(i3);
            } else {
                C5929l a;
                C5929l c5929l;
                int i4;
                int i5 = -1;
                int i6 = -1;
                int i7 = i2;
                while (i7 >= b) {
                    try {
                        i6 = m27418a(fhVar, i7, i6, i5);
                        boolean b2 = ((C5927g) m3051f(i6).getLayoutParams()).m27501b();
                        if (b2 || i7 == 0) {
                            a = C5929l.m27515a(i7);
                            i++;
                            this.f29492f.add(i, a);
                            if (i7 == 0) {
                                this.f29493g = b2;
                                c5929l = a;
                                C0330d.m1728a("FLM: fillSection");
                                m27435j();
                                if (i + 1 == this.f29492f.size()) {
                                    i4 = i3;
                                } else {
                                    i4 = ((C5929l) this.f29492f.get(i + 1)).f;
                                }
                                m27425a(fhVar, c5929l, i2, 0, i4, i3);
                                C0330d.m1727a();
                            }
                            c5929l = a;
                            C0330d.m1728a("FLM: fillSection");
                            m27435j();
                            if (i + 1 == this.f29492f.size()) {
                                i4 = ((C5929l) this.f29492f.get(i + 1)).f;
                            } else {
                                i4 = i3;
                            }
                            m27425a(fhVar, c5929l, i2, 0, i4, i3);
                            C0330d.m1727a();
                        } else {
                            i5 = i6;
                            i6 = i7;
                            i7--;
                        }
                    } catch (RuntimeException e) {
                        Log.d("FlowLayoutManager", "fillUpForPosition() state at exception: finding anchor\n\r sectionIndex=" + i + "\n\r position=" + i2 + "\n\r totalItemCount=" + i3);
                        throw e;
                    }
                }
                a = c5923i;
                c5929l = a;
                try {
                    C0330d.m1728a("FLM: fillSection");
                    m27435j();
                    if (i + 1 == this.f29492f.size()) {
                        i4 = i3;
                    } else {
                        i4 = ((C5929l) this.f29492f.get(i + 1)).f;
                    }
                    m27425a(fhVar, c5929l, i2, 0, i4, i3);
                    C0330d.m1727a();
                } catch (RuntimeException e2) {
                    String valueOf = String.valueOf(this.f29494i);
                    Log.d("FlowLayoutManager", new StringBuilder(String.valueOf(valueOf).length() + 148).append("fillUpForPosition() state at exception: filling section\n\r sectionIndex=").append(i).append("\n\r position=").append(i2).append("\n\r totalItemCount=").append(i3).append("\n\r mFillState=").append(valueOf).toString());
                    throw e2;
                } catch (Throwable th) {
                    C0330d.m1727a();
                }
            }
            return i;
        } else {
            throw new IllegalArgumentException("Section at " + i + " impossible to cover position " + i2);
        }
    }

    private final int m27431c(fh fhVar, int i, int i2, int i3) {
        RuntimeException e;
        C5929l c5929l = (C5929l) this.f29492f.get(i);
        m27435j();
        int i4;
        C5929l c5929l2;
        int i5;
        try {
            C0330d.m1728a("FLM: fillSection");
            i4 = i2;
            c5929l2 = c5929l;
            int i6 = i;
            while (i4 > 0) {
                C5923i c5923i;
                int i7;
                if (i6 + 1 == this.f29492f.size()) {
                    c5923i = null;
                } else {
                    try {
                        c5923i = (C5929l) this.f29492f.get(i6 + 1);
                    } catch (RuntimeException e2) {
                        e = e2;
                        i5 = i6;
                    }
                }
                if (c5923i == null) {
                    i7 = i3;
                } else {
                    i7 = c5923i.f;
                }
                m27425a(fhVar, c5929l2, -1, i4, i7, i3);
                i4 -= this.f29494i.f29509a;
                int i8 = this.f29494i.f29510b;
                if (i8 == -1) {
                    if (c5929l2.mo5208b() == i3) {
                        break;
                    }
                    i6++;
                    c5929l2 = c5923i;
                } else {
                    c5929l2 = C5929l.m27515a(i8);
                    i5 = i6 + 1;
                    try {
                        this.f29492f.add(i5, c5929l2);
                        i6 = i5;
                    } catch (RuntimeException e3) {
                        e = e3;
                    }
                }
            }
            C0330d.m1727a();
            return i4;
        } catch (RuntimeException e4) {
            i4 = i2;
            c5929l2 = c5929l;
            e = e4;
            i5 = i;
            try {
                StringBuilder append = new StringBuilder("fillDownForHeight() states at exception:\n\t startSectionIndex=").append(i).append("\n\t height=").append(i2).append("\n\t totalItemCount=").append(i3).append("\n\t remainingHeight=").append(i4).append("\n\t lastSectionIndex=").append(i5).append("\n\t lastSection=");
                if (c5929l2 == null) {
                    append.append("null");
                } else {
                    c5929l2.m27519a(append);
                }
                append.append("\n\t mFillState=").append(this.f29494i);
                Log.d("FlowLayoutManager", append.toString());
                throw e;
            } catch (Throwable th) {
                C0330d.m1727a();
            }
        }
    }

    private final void m27425a(android.support.v7.widget.fh r13, com.google.android.libraries.flowlayoutmanager.C5929l r14, int r15, int r16, int r17, int r18) {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:37)
	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:61)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:33)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
        /*
        r12 = this;
        r2 = -1;
        if (r15 != r2) goto L_0x000d;
    L_0x0003:
        if (r16 > 0) goto L_0x000d;
    L_0x0005:
        r2 = new java.lang.IllegalArgumentException;
        r3 = "Both criteria met before any processing";
        r2.<init>(r3);
        throw r2;
    L_0x000d:
        r2 = r14.f;
        r0 = r17;
        if (r2 < r0) goto L_0x001b;
    L_0x0013:
        r2 = new java.lang.IllegalArgumentException;
        r3 = "Section started after limit";
        r2.<init>(r3);
        throw r2;
    L_0x001b:
        r0 = r17;
        if (r15 >= r0) goto L_0x0025;
    L_0x001f:
        r0 = r17;
        r1 = r18;
        if (r0 <= r1) goto L_0x002d;
    L_0x0025:
        r2 = new java.lang.IllegalArgumentException;
        r3 = "positionToCover < nextSectionStart <= totalItemCount does not hold";
        r2.<init>(r3);
        throw r2;
    L_0x002d:
        r2 = r12.f2957M;
        r3 = r12.getPaddingLeft();
        r2 = r2 - r3;
        r3 = r12.getPaddingRight();
        r7 = r2 - r3;
        r2 = r12.f29494i;
        r3 = -1;
        r2.f29510b = r3;
        r2 = r12.f29494i;
        r0 = r18;
        r3 = r14.m27475c(r0);
        r2.f29509a = r3;
        r2 = r14.f;
        r4 = r14.m27517a();
        if (r4 == 0) goto L_0x0086;
    L_0x0051:
        r2 = r12.f29494i;
        r3 = r2.f29509a;
        r5 = r4.h;
        r3 = r3 - r5;
        r2.f29509a = r3;
        r2 = r4.f;
        if (r2 <= r15) goto L_0x0067;
    L_0x005e:
        r2 = r12.f29494i;
        r2 = r2.f29509a;
        r0 = r16;
        if (r2 < r0) goto L_0x0067;
    L_0x0066:
        return;
    L_0x0067:
        r10 = r4.mo5208b();
        r8 = 0;
        r9 = -1;
        r2 = r12;
        r3 = r13;
        r5 = r17;
        r6 = r18;
        r2 = r2.m27421a(r3, r4, r5, r6, r7, r8, r9);
        if (r2 == r10) goto L_0x007c;
    L_0x0079:
        r3 = -1;
        r14.f29517h = r3;
    L_0x007c:
        r3 = r12.f29494i;
        r0 = r18;
        r4 = r14.m27475c(r0);
        r3.f29509a = r4;
    L_0x0086:
        if (r2 <= r15) goto L_0x0090;
    L_0x0088:
        r3 = r12.f29494i;
        r3 = r3.f29509a;
        r0 = r16;
        if (r3 >= r0) goto L_0x00ab;
    L_0x0090:
        r3 = r12.f29494i;
        r3 = r3.f29510b;
        r4 = -1;
        if (r3 != r4) goto L_0x00ab;
    L_0x0097:
        r0 = r17;
        if (r2 >= r0) goto L_0x00ab;
    L_0x009b:
        r9 = 0;
        r10 = 0;
        r11 = -1;
        r2 = r12;
        r3 = r13;
        r4 = r14;
        r5 = r17;
        r6 = r18;
        r8 = r7;
        r2 = r2.m27423a(r3, r4, r5, r6, r7, r8, r9, r10, r11);
        goto L_0x007c;
    L_0x00ab:
        r3 = r12.f29494i;
        r3 = r3.f29510b;
        r4 = -1;
        if (r3 == r4) goto L_0x0066;
    L_0x00b2:
        if (r2 <= r15) goto L_0x0066;
    L_0x00b4:
        r2 = r12.f29494i;
        r2 = r2.f29509a;
        r0 = r16;
        if (r2 < r0) goto L_0x0066;
    L_0x00bc:
        r2 = r12.f29494i;
        r3 = -1;
        r2.f29510b = r3;
        goto L_0x0066;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.flowlayoutmanager.FlowLayoutManager.a(android.support.v7.widget.fh, com.google.android.libraries.flowlayoutmanager.l, int, int, int, int):void");
    }

    private final int m27421a(fh fhVar, C5924h c5924h, int i, int i2, int i3, boolean z, int i4) {
        if (c5924h instanceof C5925e) {
            return m27420a(fhVar, (C5925e) c5924h, i, i3, z, i4);
        }
        return m27422a(fhVar, (C5928j) c5924h, i, i2, i3);
    }

    private final int m27420a(fh fhVar, C5925e c5925e, int i, int i2, boolean z, int i3) {
        if (c5925e.f29522d.isEmpty()) {
            throw new IllegalArgumentException("Line must not be empty");
        }
        int b = c5925e.mo5208b();
        while (b < i && c5925e.f29520b - c5925e.f29521c > 1) {
            if (!m27426a(fhVar, b, i2, c5925e.f29522d, c5925e.f29520b, c5925e.f29521c, c5925e.e, false, z, i3)) {
                break;
            }
            c5925e.m27486a(this.f29494i.m27471a());
            b++;
        }
        return b;
    }

    private final int m27422a(fh fhVar, C5928j c5928j, int i, int i2, int i3) {
        if (c5928j.f29563b == null) {
            throw new IllegalArgumentException("Line must not be empty");
        }
        int c;
        C5923i c5923i;
        int i4;
        int b = c5928j.mo5208b();
        C5923i c5923i2 = c5928j.f29570m;
        if (c5923i2 != null) {
            c = c5923i2.m27475c(i2);
            C5924h a = c5923i2.m27517a();
            if (a == null) {
                throw new IllegalStateException("Empty nested paragraph found!");
            }
            c = m27421a(fhVar, a, i, i2, i3, true, c5928j.f29566i - (c - a.h));
            if (c > b) {
                c5923i2.f29517h = -1;
            }
            c5923i = c5923i2;
            i4 = c;
        } else if (c5928j.f29565d == 0 || c5928j.f29566i == 0) {
            return b;
        } else {
            c5923i = C5929l.m27515a(b);
            c = m27423a(fhVar, c5923i, i, i2, i3, c5928j.f29565d, c5928j.e + c5928j.f29567j, true, c5928j.f29566i);
            if (c == c5923i.f) {
                c5923i.m27524e();
                return c;
            }
            c5928j.f29570m = c5923i;
            i4 = c;
        }
        while (true) {
            int c2 = c5928j.f29566i - c5923i.m27475c(i2);
            c = m27423a(fhVar, c5923i, i, i2, i3, c5928j.f29565d, c5928j.e + c5928j.f29567j, true, c2);
            if (c <= i4) {
                break;
            }
            i4 = c;
        }
        if (c <= b) {
            return c;
        }
        c5928j.f29517h = -1;
        return c;
    }

    private final int m27423a(fh fhVar, C5929l c5929l, int i, int i2, int i3, int i4, int i5, boolean z, int i6) {
        int b = c5929l.mo5208b();
        if (b < i) {
            boolean z2;
            if (c5929l.f == b) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!m27426a(fhVar, b, i3, null, i4, 0, i5, z2, z, i6)) {
                return b;
            }
            int a;
            C5924h c5924h;
            if (this.f29494i.f29514f.f29554s == 0) {
                C5924h c5925e;
                C5926f a2 = this.f29494i.m27471a();
                c5924h = (C5925e) C5925e.f29519a.mo381a();
                if (c5924h == null) {
                    c5925e = new C5925e();
                } else {
                    c5925e = c5924h;
                }
                c5925e.f = b;
                c5925e.e = i5;
                c5925e.f29520b = i4;
                c5925e.m27486a(a2);
                a = m27420a(fhVar, (C5925e) c5925e, i, i3, z, i6);
                c5929l.m27518a(c5925e);
            } else {
                C5924h c5928j;
                C5926f a3 = this.f29494i.m27471a();
                C5927g c5927g = this.f29494i.f29514f;
                c5924h = (C5928j) C5928j.f29562a.mo381a();
                if (c5924h == null) {
                    c5928j = new C5928j();
                } else {
                    c5928j = c5924h;
                }
                c5928j.f = b;
                c5928j.e = i5;
                if (a3.f29537o) {
                    Object obj = (c5927g.f29554s & 4) != 0 ? 1 : null;
                    Object obj2 = (c5927g.f29554s & 2) != 0 ? 1 : null;
                    Object obj3 = (c5927g.f29554s & 1) != 0 ? 1 : null;
                    if (obj == null && obj2 == null && obj3 == null) {
                        String str = "Unknown flow value: 0x";
                        String valueOf = String.valueOf(Integer.toHexString(c5927g.f29554s));
                        if (valueOf.length() != 0) {
                            valueOf = str.concat(valueOf);
                        } else {
                            valueOf = new String(str);
                        }
                        throw new IllegalArgumentException(valueOf);
                    }
                    c5928j.f29563b = a3;
                    c5928j.f29564c = c5927g.f29541b == -4;
                    if (obj != null) {
                        b = 0;
                    } else {
                        b = (c5928j.f29563b.f29529g + c5928j.f29563b.f29534l) + c5928j.f29563b.f29530h;
                    }
                    int a4 = C5927g.m27496a("layout_flmFlowInsetStart", c5927g.f29556u, c5928j.f29563b.f29526d, false);
                    int a5 = C5927g.m27496a("layout_flmFlowInsetEnd", c5927g.f29557v, c5928j.f29563b.f29526d, false);
                    if (!(obj2 == null && obj == null) && C5918a.m27466b(c5927g.f29556u) && c5928j.f29563b.f29524b != 0 && c5928j.e < c5928j.f29563b.f29524b) {
                        a = (c5928j.f29563b.f29524b - c5928j.e) + a4;
                    } else {
                        a = a4;
                    }
                    c5928j.f29565d = C5927g.m27496a("layout_flmFlowWidth", c5927g.f29559x, c5928j.f29563b.f29526d, true);
                    if (c5928j.f29565d < 0) {
                        c5928j.f29565d = Math.max(0, ((i4 - b) - a) - a5);
                    }
                    if (obj2 != null) {
                        c5928j.f29563b.f29529g = (i4 - c5928j.f29563b.f29530h) - c5928j.f29563b.f29534l;
                        c5928j.f29567j = ((i4 - b) - a5) - c5928j.f29565d;
                    } else {
                        c5928j.f29567j = a + b;
                    }
                    c5928j.f29568k = c5927g.m27504d(c5928j.f29563b.f29526d);
                    c5928j.f29569l = c5927g.m27505e(c5928j.f29563b.f29526d);
                    c5928j.f29566i = c5927g.m27502c(c5928j.f29563b.f29526d);
                    if (c5928j.f29566i < 0) {
                        c5928j.f29566i = Math.max(0, (c5928j.f29563b.f29535m - c5928j.f29568k) - c5928j.f29569l);
                    }
                    a = m27422a(fhVar, (C5928j) c5928j, i, i2, i3);
                    c5929l.m27518a(c5928j);
                } else {
                    throw new IllegalArgumentException("creator not measured");
                }
            }
            return a;
        } else if (b <= i) {
            return b;
        } else {
            throw new IllegalArgumentException("¶@[" + c5929l.f + "," + b + ") should not cover nextSectionStart@" + i);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m27426a(android.support.v7.widget.fh r19, int r20, int r21, java.util.List r22, int r23, int r24, int r25, boolean r26, boolean r27, int r28) {
        /*
        r18 = this;
        r0 = r18;
        r4 = r0.f29494i;
        r4 = r4.f29512d;
        r0 = r18;
        r5 = r0.f29494i;
        r5 = r5.f29513e;
        r0 = r18;
        r1 = r19;
        r2 = r20;
        r4 = r0.m27418a(r1, r2, r4, r5);
        r0 = r18;
        r10 = r0.m3051f(r4);
        r0 = r18;
        r5 = r0.f29494i;
        r5 = r5.f29512d;
        r0 = r20;
        if (r5 != r0) goto L_0x0046;
    L_0x0026:
        r0 = r18;
        r5 = r0.f29494i;
        r5 = r5.f29513e;
        if (r5 == r4) goto L_0x0036;
    L_0x002e:
        r4 = new java.lang.IllegalStateException;
        r5 = "Cached next child index incorrect";
        r4.<init>(r5);
        throw r4;
    L_0x0036:
        r0 = r18;
        r4 = r0.f29494i;
        r4 = r4.f29511c;
        if (r4 != 0) goto L_0x0116;
    L_0x003e:
        r4 = new java.lang.IllegalStateException;
        r5 = "Cached next child missing ItemInfo";
        r4.<init>(r5);
        throw r4;
    L_0x0046:
        r0 = r18;
        r5 = r0.f29494i;
        r0 = r20;
        r5.f29512d = r0;
        r0 = r18;
        r5 = r0.f29494i;
        r5.f29513e = r4;
        r0 = r18;
        r4 = r0.f29494i;
        r4 = r4.f29511c;
        if (r4 == 0) goto L_0x0064;
    L_0x005c:
        r4 = new java.lang.IllegalStateException;
        r5 = "Did not consume previous ItemInfo";
        r4.<init>(r5);
        throw r4;
    L_0x0064:
        r0 = r18;
        r5 = r0.f29494i;
        r4 = r10.getLayoutParams();
        r4 = (com.google.android.libraries.flowlayoutmanager.C5927g) r4;
        r5.f29514f = r4;
        r0 = r18;
        r5 = r0.f29494i;
        r4 = com.google.android.libraries.flowlayoutmanager.C5926f.f29523a;
        r4 = r4.mo381a();
        r4 = (com.google.android.libraries.flowlayoutmanager.C5926f) r4;
        if (r4 == 0) goto L_0x0144;
    L_0x007e:
        r5.f29511c = r4;
        r0 = r18;
        r4 = r0.f29494i;
        r8 = r4.f29511c;
        r0 = r18;
        r4 = r0.f29494i;
        r9 = r4.f29514f;
        r6 = r9.f29542g;
        r5 = r9.f29543h;
        r4 = r21 - r6;
        r4 = r4 - r5;
        r7 = r9.f29544i;
        if (r7 <= 0) goto L_0x00aa;
    L_0x0097:
        r7 = r9.f29544i;
        if (r4 <= r7) goto L_0x00aa;
    L_0x009b:
        r7 = r9.f29544i;
        r7 = r4 - r7;
        r4 = r9.f29544i;
        r11 = r7 >> 1;
        r6 = r6 + r11;
        r11 = r7 >> 1;
        r7 = r7 & 1;
        r7 = r7 + r11;
        r5 = r5 + r7;
    L_0x00aa:
        r7 = r9.f29546k;
        if (r7 > 0) goto L_0x014f;
    L_0x00ae:
        r7 = r9.f29545j;
        r11 = 0;
        r7 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1));
        if (r7 > 0) goto L_0x014b;
    L_0x00b5:
        r7 = 2143289344; // 0x7fc00000 float:NaN double:1.058925634E-314;
    L_0x00b7:
        if (r8 == 0) goto L_0x00c6;
    L_0x00b9:
        r11 = 0;
        r4 = java.lang.Math.max(r11, r4);
        r4 = (float) r4;
        r4 = r4 / r7;
        r8.f29526d = r4;
        r8.f29524b = r6;
        r8.f29525c = r5;
    L_0x00c6:
        r4 = r8.f29526d;
        r4 = r9.m27499a(r4);
        r8.f29527e = r4;
        r4 = r8.f29526d;
        r5 = r9.f29551p;
        r6 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        if (r5 != r6) goto L_0x0173;
    L_0x00d7:
        r4 = r9.m27499a(r4);
    L_0x00db:
        r8.f29528f = r4;
        r4 = r8.f29526d;
        r5 = r9.f29548m;
        r6 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        if (r5 != r6) goto L_0x017e;
    L_0x00e6:
        r4 = android.support.v4.view.C0361r.m2049a(r9);
    L_0x00ea:
        r8.f29529g = r4;
        r4 = r8.f29526d;
        r5 = r9.f29549n;
        r6 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        if (r5 != r6) goto L_0x0189;
    L_0x00f5:
        r4 = android.support.v4.view.C0361r.m2051b(r9);
    L_0x00f9:
        r8.f29530h = r4;
        r4 = r8.f29526d;
        r4 = r9.m27500b(r4);
        r8.f29531i = r4;
        r4 = r8.f29526d;
        r5 = r9.f29552q;
        r6 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        if (r5 != r6) goto L_0x0194;
    L_0x010c:
        r4 = r9.m27500b(r4);
    L_0x0110:
        r8.f29532j = r4;
        r4 = r9.f29553r;
        r8.f29533k = r4;
    L_0x0116:
        r0 = r18;
        r4 = r0.f29494i;
        r11 = r4.f29514f;
        r6 = 1;
        if (r22 == 0) goto L_0x0125;
    L_0x011f:
        r4 = r22.isEmpty();
        if (r4 == 0) goto L_0x019f;
    L_0x0125:
        r4 = 1;
        r5 = r4;
    L_0x0127:
        r4 = r11.m27501b();
        if (r4 == 0) goto L_0x03cb;
    L_0x012d:
        if (r27 != 0) goto L_0x01a2;
    L_0x012f:
        if (r26 == 0) goto L_0x01a2;
    L_0x0131:
        r4 = 0;
    L_0x0132:
        r6 = r11.f29561z;
        r6 = r6 & 12;
        if (r27 == 0) goto L_0x03c8;
    L_0x0138:
        switch(r6) {
            case 4: goto L_0x01ae;
            case 8: goto L_0x01ac;
            default: goto L_0x013b;
        };
    L_0x013b:
        if (r5 == 0) goto L_0x03c8;
    L_0x013d:
        r6 = 1;
        r0 = r28;
        if (r0 > r6) goto L_0x03c8;
    L_0x0142:
        r4 = 0;
    L_0x0143:
        return r4;
    L_0x0144:
        r4 = new com.google.android.libraries.flowlayoutmanager.f;
        r4.<init>();
        goto L_0x007e;
    L_0x014b:
        r7 = r9.f29545j;
        goto L_0x00b7;
    L_0x014f:
        r7 = (float) r4;
        r11 = r9.f29546k;
        r11 = (float) r11;
        r7 = r7 / r11;
        r11 = 0;
        r12 = r9.f29545j;
        r11 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1));
        if (r11 >= 0) goto L_0x0165;
    L_0x015b:
        r11 = r9.f29545j;
        r11 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1));
        if (r11 > 0) goto L_0x0165;
    L_0x0161:
        r7 = r9.f29545j;
        goto L_0x00b7;
    L_0x0165:
        r12 = 4607182418800017408; // 0x3ff0000000000000 float:0.0 double:1.0;
        r14 = (double) r7;
        r14 = java.lang.Math.floor(r14);
        r12 = java.lang.Math.max(r12, r14);
        r7 = (float) r12;
        goto L_0x00b7;
    L_0x0173:
        r5 = "layout_flmMarginTopForFirstLine";
        r6 = r9.f29551p;
        r7 = 0;
        r4 = com.google.android.libraries.flowlayoutmanager.C5927g.m27496a(r5, r6, r4, r7);
        goto L_0x00db;
    L_0x017e:
        r5 = "layout_flmMarginStart";
        r6 = r9.f29548m;
        r7 = 0;
        r4 = com.google.android.libraries.flowlayoutmanager.C5927g.m27496a(r5, r6, r4, r7);
        goto L_0x00ea;
    L_0x0189:
        r5 = "layout_flmMarginEnd";
        r6 = r9.f29549n;
        r7 = 0;
        r4 = com.google.android.libraries.flowlayoutmanager.C5927g.m27496a(r5, r6, r4, r7);
        goto L_0x00f9;
    L_0x0194:
        r5 = "layout_flmMarginBottomForLastLine";
        r6 = r9.f29552q;
        r7 = 0;
        r4 = com.google.android.libraries.flowlayoutmanager.C5927g.m27496a(r5, r6, r4, r7);
        goto L_0x0110;
    L_0x019f:
        r4 = 0;
        r5 = r4;
        goto L_0x0127;
    L_0x01a2:
        r0 = r18;
        r4 = r0.f29494i;
        r0 = r20;
        r4.f29510b = r0;
        r4 = 0;
        goto L_0x0143;
    L_0x01ac:
        r4 = 0;
        goto L_0x0143;
    L_0x01ae:
        if (r5 == 0) goto L_0x03c8;
    L_0x01b0:
        r4 = 0;
        r6 = r4;
    L_0x01b2:
        r0 = r18;
        r4 = r0.f29494i;
        r12 = r4.f29511c;
        r4 = r11.m27498a();
        if (r5 != 0) goto L_0x01ec;
    L_0x01be:
        switch(r4) {
            case 1: goto L_0x01ec;
            case 2: goto L_0x01fa;
            case 3: goto L_0x01eb;
            default: goto L_0x01c1;
        };
    L_0x01c1:
        r4 = r22.size();
        r4 = r4 + -1;
        r0 = r22;
        r4 = r0.get(r4);
        r4 = (com.google.android.libraries.flowlayoutmanager.C5926f) r4;
        r7 = r12.f29526d;
        r8 = r4.f29526d;
        r7 = java.lang.Float.compare(r7, r8);
        if (r7 != 0) goto L_0x01fd;
    L_0x01d9:
        r7 = r12.f29524b;
        r8 = r4.f29524b;
        if (r7 != r8) goto L_0x01fd;
    L_0x01df:
        r7 = r12.f29525c;
        r4 = r4.f29525c;
        if (r7 != r4) goto L_0x01fd;
    L_0x01e5:
        r4 = 1;
    L_0x01e6:
        if (r4 != 0) goto L_0x01ec;
    L_0x01e8:
        r4 = 0;
        goto L_0x0143;
    L_0x01eb:
        r6 = 0;
    L_0x01ec:
        r4 = r11.f29540a;
        r7 = -1;
        if (r4 != r7) goto L_0x01ff;
    L_0x01f1:
        r0 = r23;
        r1 = r21;
        if (r0 >= r1) goto L_0x01ff;
    L_0x01f7:
        r4 = 0;
        goto L_0x0143;
    L_0x01fa:
        r4 = 0;
        goto L_0x0143;
    L_0x01fd:
        r4 = 0;
        goto L_0x01e6;
    L_0x01ff:
        if (r6 == 0) goto L_0x020a;
    L_0x0201:
        if (r5 == 0) goto L_0x020a;
    L_0x0203:
        r0 = r23;
        r1 = r21;
        if (r0 < r1) goto L_0x020a;
    L_0x0209:
        r6 = 0;
    L_0x020a:
        r4 = 0;
        r7 = r23 - r24;
        r8 = r12.f29529g;
        r7 = r7 - r8;
        r8 = r12.f29530h;
        r7 = r7 - r8;
        r8 = java.lang.Math.max(r4, r7);
        r4 = 0;
        r7 = 0;
        r9 = r11.f29540a;
        r9 = com.google.android.libraries.flowlayoutmanager.C5918a.m27466b(r9);
        if (r9 == 0) goto L_0x03c5;
    L_0x0221:
        r9 = r12.f29524b;
        if (r9 != 0) goto L_0x0229;
    L_0x0225:
        r9 = r12.f29525c;
        if (r9 == 0) goto L_0x03c5;
    L_0x0229:
        r9 = r12.f29524b;
        if (r9 <= 0) goto L_0x02df;
    L_0x022d:
        r4 = 0;
        r5 = r12.f29524b;
        r5 = r5 - r25;
        r5 = r5 - r24;
        r9 = r12.f29529g;
        r5 = r5 - r9;
        r4 = java.lang.Math.max(r4, r5);
    L_0x023b:
        r5 = r21 - r25;
        r5 = r5 - r23;
        r9 = r12.f29525c;
        if (r9 <= 0) goto L_0x02eb;
    L_0x0243:
        r7 = 0;
        r9 = r12.f29525c;
        r5 = r9 - r5;
        r9 = r12.f29530h;
        r5 = r5 - r9;
        r5 = java.lang.Math.max(r7, r5);
    L_0x024f:
        r7 = 0;
        r8 = r8 - r4;
        r8 = r8 - r5;
        r7 = java.lang.Math.max(r7, r8);
        r17 = r5;
        r5 = r7;
        r7 = r17;
    L_0x025b:
        r8 = f29487h;
        r0 = r18;
        r0.m3034b(r10, r8);
        r8 = f29487h;
        r8 = r8.left;
        r9 = f29487h;
        r9 = r9.right;
        r8 = r8 + r9;
        r9 = f29487h;
        r9 = r9.top;
        r13 = f29487h;
        r13 = r13.bottom;
        r13 = r13 + r9;
        r9 = 0;
        r5 = r5 - r8;
        r9 = java.lang.Math.max(r9, r5);
        r5 = r12.f29526d;
        r14 = "layout_flmWidth";
        r15 = r11.f29540a;
        r16 = 1;
        r0 = r16;
        r5 = com.google.android.libraries.flowlayoutmanager.C5927g.m27496a(r14, r15, r5, r0);
        switch(r5) {
            case -3: goto L_0x02fc;
            case -2: goto L_0x0302;
            case -1: goto L_0x02f5;
            default: goto L_0x028b;
        };
    L_0x028b:
        r14 = r11.f29540a;
        r14 = com.google.android.libraries.flowlayoutmanager.C5918a.m27466b(r14);
        if (r14 == 0) goto L_0x0309;
    L_0x0293:
        r14 = 0;
        r5 = r5 - r8;
        r5 = java.lang.Math.max(r14, r5);
    L_0x0299:
        r8 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r11.width = r5;
        r17 = r8;
        r8 = r5;
        r5 = r17;
    L_0x02a2:
        r14 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r5);
        r8 = r12.f29526d;
        r5 = "layout_flmHeight";
        r15 = r11.f29541b;
        r16 = 1;
        r0 = r16;
        r5 = com.google.android.libraries.flowlayoutmanager.C5927g.m27496a(r5, r15, r8, r0);
        switch(r5) {
            case -4: goto L_0x0346;
            case -3: goto L_0x02b7;
            case -2: goto L_0x036b;
            case -1: goto L_0x0326;
            default: goto L_0x02b7;
        };
    L_0x02b7:
        r8 = r11.f29541b;
        r8 = com.google.android.libraries.flowlayoutmanager.C5918a.m27466b(r8);
        if (r8 == 0) goto L_0x0372;
    L_0x02bf:
        r8 = 0;
        r5 = r5 - r13;
        r5 = java.lang.Math.max(r8, r5);
    L_0x02c5:
        r8 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r11.height = r5;
        r17 = r8;
        r8 = r5;
        r5 = r17;
    L_0x02ce:
        r5 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r5);
        if (r6 == 0) goto L_0x038f;
    L_0x02d4:
        if (r9 == 0) goto L_0x02dc;
    L_0x02d6:
        r8 = android.view.View.MeasureSpec.getSize(r14);
        if (r8 <= r9) goto L_0x038f;
    L_0x02dc:
        r4 = 0;
        goto L_0x0143;
    L_0x02df:
        if (r5 == 0) goto L_0x023b;
    L_0x02e1:
        if (r25 != 0) goto L_0x023b;
    L_0x02e3:
        r5 = r12.f29529g;
        if (r5 != 0) goto L_0x023b;
    L_0x02e7:
        r4 = r12.f29524b;
        goto L_0x023b;
    L_0x02eb:
        if (r5 != 0) goto L_0x03c2;
    L_0x02ed:
        r5 = r12.f29530h;
        if (r5 != 0) goto L_0x03c2;
    L_0x02f1:
        r5 = r12.f29525c;
        goto L_0x024f;
    L_0x02f5:
        r5 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r8 = -1;
        r11.width = r8;
        r8 = r9;
        goto L_0x02a2;
    L_0x02fc:
        r5 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r11.width = r9;
        r8 = r9;
        goto L_0x02a2;
    L_0x0302:
        r5 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        r8 = -2;
        r11.width = r8;
        r8 = r9;
        goto L_0x02a2;
    L_0x0309:
        if (r5 >= 0) goto L_0x0299;
    L_0x030b:
        r4 = new java.lang.IllegalArgumentException;
        r6 = 51;
        r7 = new java.lang.StringBuilder;
        r7.<init>(r6);
        r6 = "Unknown enum value for layout_flmWidth: ";
        r6 = r7.append(r6);
        r5 = r6.append(r5);
        r5 = r5.toString();
        r4.<init>(r5);
        throw r4;
    L_0x0326:
        r0 = r18;
        r5 = r0.f2958N;
        r15 = r18.getPaddingTop();
        r5 = r5 - r15;
        r15 = r18.getPaddingBottom();
        r5 = r5 - r15;
        r5 = r5 - r13;
        r13 = r11.m27499a(r8);
        r5 = r5 - r13;
        r8 = r11.m27500b(r8);
        r8 = r5 - r8;
        r5 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r13 = -1;
        r11.height = r13;
        goto L_0x02ce;
    L_0x0346:
        r5 = r11.f29554s;
        if (r5 == 0) goto L_0x0368;
    L_0x034a:
        r5 = r11.f29560y;
        if (r5 < 0) goto L_0x0368;
    L_0x034e:
        r5 = 0;
        r13 = r11.m27502c(r8);
        r15 = r11.m27504d(r8);
        r13 = r13 + r15;
        r8 = r11.m27505e(r8);
        r8 = r8 + r13;
        r8 = java.lang.Math.max(r5, r8);
        r5 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
    L_0x0363:
        r13 = -1;
        r11.height = r13;
        goto L_0x02ce;
    L_0x0368:
        r8 = 0;
        r5 = 0;
        goto L_0x0363;
    L_0x036b:
        r8 = 0;
        r5 = 0;
        r13 = -2;
        r11.height = r13;
        goto L_0x02ce;
    L_0x0372:
        if (r5 >= 0) goto L_0x02c5;
    L_0x0374:
        r4 = new java.lang.IllegalArgumentException;
        r6 = 47;
        r7 = new java.lang.StringBuilder;
        r7.<init>(r6);
        r6 = "Unknown value for layout_flmHeight: ";
        r6 = r7.append(r6);
        r5 = r6.append(r5);
        r5 = r5.toString();
        r4.<init>(r5);
        throw r4;
    L_0x038f:
        r10.measure(r14, r5);
        if (r6 == 0) goto L_0x03a9;
    L_0x0394:
        r5 = r10.getMeasuredWidth();
        if (r5 <= r9) goto L_0x039d;
    L_0x039a:
        r4 = 0;
        goto L_0x0143;
    L_0x039d:
        r5 = android.support.v4.view.ai.m1839c(r10);
        r6 = 16777216; // 0x1000000 float:2.3509887E-38 double:8.289046E-317;
        r5 = r5 & r6;
        if (r5 == 0) goto L_0x03a9;
    L_0x03a6:
        r4 = 0;
        goto L_0x0143;
    L_0x03a9:
        r5 = 0;
        r12.m27494a(r10, r5);
        r5 = r11.f29554s;
        r5 = r5 & 2;
        r6 = 2;
        if (r5 != r6) goto L_0x03bc;
    L_0x03b4:
        r4 = r12.f29530h;
        r4 = r4 + r7;
        r12.f29530h = r4;
    L_0x03b9:
        r4 = 1;
        goto L_0x0143;
    L_0x03bc:
        r5 = r12.f29529g;
        r4 = r4 + r5;
        r12.f29529g = r4;
        goto L_0x03b9;
    L_0x03c2:
        r5 = r7;
        goto L_0x024f;
    L_0x03c5:
        r5 = r8;
        goto L_0x025b;
    L_0x03c8:
        r6 = r4;
        goto L_0x01b2;
    L_0x03cb:
        r4 = r6;
        goto L_0x0132;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.flowlayoutmanager.FlowLayoutManager.a(android.support.v7.widget.fh, int, int, java.util.List, int, int, int, boolean, boolean, int):boolean");
    }

    public final void mo739c(fh fhVar, fo foVar) {
        int i;
        int i2;
        if (this.f29503r != null) {
            this.f29497l = this.f29503r.f29484a;
            this.f29498m = (int) (((float) this.f2958N) * this.f29503r.f29485b);
            this.f29503r = null;
        }
        if (this.f29497l != -1) {
            if (this.f29497l < 0 || this.f29497l >= foVar.m3705a()) {
                this.f29497l = -1;
                this.f29498m = Integer.MIN_VALUE;
            } else if (this.f29498m == Integer.MIN_VALUE) {
                this.f29498m = getPaddingTop();
            }
        }
        if (this.f29497l != -1) {
            i = this.f29497l;
            i2 = this.f29498m;
            this.f29497l = -1;
            this.f29498m = Integer.MIN_VALUE;
        } else {
            View s = m27437s();
            if (s != null) {
                i = ew.m2979a(s);
                i2 = ew.m2988f(s);
            } else {
                i2 = 0;
                i = -1;
            }
        }
        try {
            C0330d.m1728a("FLM: layoutViewport");
            m27419a(fhVar, foVar, i, i2);
        } finally {
            C0330d.m1727a();
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m27419a(android.support.v7.widget.fh r25, android.support.v7.widget.fo r26, int r27, int r28) {
        /*
        r24 = this;
        r8 = r26.m3705a();	 Catch:{ RuntimeException -> 0x0316 }
        if (r8 != 0) goto L_0x000e;
    L_0x0006:
        r24.m3040c(r25);	 Catch:{ RuntimeException -> 0x0316 }
        r24.m27432c();	 Catch:{ RuntimeException -> 0x0316 }
        r2 = 0;
    L_0x000d:
        return r2;
    L_0x000e:
        if (r27 < 0) goto L_0x0072;
    L_0x0010:
        r0 = r27;
        if (r0 >= r8) goto L_0x0072;
    L_0x0014:
        r2 = 1;
        r7 = r2;
    L_0x0016:
        r16 = r24.getPaddingTop();	 Catch:{ RuntimeException -> 0x0316 }
        r0 = r24;
        r2 = r0.f2958N;	 Catch:{ RuntimeException -> 0x0316 }
        r3 = r24.getPaddingBottom();	 Catch:{ RuntimeException -> 0x0316 }
        r2 = r2 - r3;
        r0 = r16;
        r18 = java.lang.Math.max(r0, r2);	 Catch:{ RuntimeException -> 0x0316 }
        r3 = r18 - r16;
        if (r7 != 0) goto L_0x0075;
    L_0x002d:
        r17 = r16;
    L_0x002f:
        r0 = r24;
        r2 = r0.f29491e;	 Catch:{ RuntimeException -> 0x0316 }
        r2 = m27415a(r3, r2);	 Catch:{ RuntimeException -> 0x0316 }
        r10 = r18 + r2;
        r0 = r26;
        r2 = r0.f3470g;	 Catch:{ RuntimeException -> 0x0316 }
        if (r2 == 0) goto L_0x0042;
    L_0x003f:
        r24.m3010a(r25);	 Catch:{ RuntimeException -> 0x0316 }
    L_0x0042:
        r2 = r24.m3060p();	 Catch:{ RuntimeException -> 0x0316 }
        r2 = r2 + -1;
        r3 = r2;
    L_0x0049:
        if (r3 < 0) goto L_0x0082;
    L_0x004b:
        r0 = r24;
        r4 = r0.m3051f(r3);	 Catch:{ RuntimeException -> 0x0316 }
        r2 = r4.getLayoutParams();	 Catch:{ RuntimeException -> 0x0316 }
        r2 = (com.google.android.libraries.flowlayoutmanager.C5927g) r2;	 Catch:{ RuntimeException -> 0x0316 }
        r2 = r2.f3356c;	 Catch:{ RuntimeException -> 0x0316 }
        r2 = r2.m3274k();	 Catch:{ RuntimeException -> 0x0316 }
        if (r2 == 0) goto L_0x006e;
    L_0x005f:
        r0 = r24;
        r2 = r0.f2959x;	 Catch:{ RuntimeException -> 0x0316 }
        r2 = r2.m3334c(r4);	 Catch:{ RuntimeException -> 0x0316 }
        r0 = r24;
        r1 = r25;
        super.m3011a(r1, r2, r4);	 Catch:{ RuntimeException -> 0x0316 }
    L_0x006e:
        r2 = r3 + -1;
        r3 = r2;
        goto L_0x0049;
    L_0x0072:
        r2 = 0;
        r7 = r2;
        goto L_0x0016;
    L_0x0075:
        r0 = r24;
        r2 = r0.f29490d;	 Catch:{ RuntimeException -> 0x0316 }
        r2 = m27415a(r3, r2);	 Catch:{ RuntimeException -> 0x0316 }
        r2 = r16 - r2;
        r17 = r2;
        goto L_0x002f;
    L_0x0082:
        r0 = r24;
        r2 = r0.f2957M;	 Catch:{ RuntimeException -> 0x0316 }
        r2 = java.lang.Integer.valueOf(r2);	 Catch:{ RuntimeException -> 0x0316 }
        r3 = r24.getPaddingStart();	 Catch:{ RuntimeException -> 0x0316 }
        r3 = java.lang.Integer.valueOf(r3);	 Catch:{ RuntimeException -> 0x0316 }
        r4 = r24.getPaddingEnd();	 Catch:{ RuntimeException -> 0x0316 }
        r4 = java.lang.Integer.valueOf(r4);	 Catch:{ RuntimeException -> 0x0316 }
        r5 = com.google.android.libraries.flowlayoutmanager.C5931n.flm_width;	 Catch:{ RuntimeException -> 0x0316 }
        r0 = r26;
        r5 = r0.m3708b(r5);	 Catch:{ RuntimeException -> 0x0316 }
        r5 = r2.equals(r5);	 Catch:{ RuntimeException -> 0x0316 }
        if (r5 == 0) goto L_0x00c4;
    L_0x00a8:
        r5 = com.google.android.libraries.flowlayoutmanager.C5931n.flm_paddingStart;	 Catch:{ RuntimeException -> 0x0316 }
        r0 = r26;
        r5 = r0.m3708b(r5);	 Catch:{ RuntimeException -> 0x0316 }
        r5 = r3.equals(r5);	 Catch:{ RuntimeException -> 0x0316 }
        if (r5 == 0) goto L_0x00c4;
    L_0x00b6:
        r5 = com.google.android.libraries.flowlayoutmanager.C5931n.flm_paddingEnd;	 Catch:{ RuntimeException -> 0x0316 }
        r0 = r26;
        r5 = r0.m3708b(r5);	 Catch:{ RuntimeException -> 0x0316 }
        r5 = r4.equals(r5);	 Catch:{ RuntimeException -> 0x0316 }
        if (r5 != 0) goto L_0x00dc;
    L_0x00c4:
        r24.m27432c();	 Catch:{ RuntimeException -> 0x0316 }
        r5 = com.google.android.libraries.flowlayoutmanager.C5931n.flm_width;	 Catch:{ RuntimeException -> 0x0316 }
        r0 = r26;
        r0.m3707a(r5, r2);	 Catch:{ RuntimeException -> 0x0316 }
        r2 = com.google.android.libraries.flowlayoutmanager.C5931n.flm_paddingStart;	 Catch:{ RuntimeException -> 0x0316 }
        r0 = r26;
        r0.m3707a(r2, r3);	 Catch:{ RuntimeException -> 0x0316 }
        r2 = com.google.android.libraries.flowlayoutmanager.C5931n.flm_paddingEnd;	 Catch:{ RuntimeException -> 0x0316 }
        r0 = r26;
        r0.m3707a(r2, r4);	 Catch:{ RuntimeException -> 0x0316 }
    L_0x00dc:
        r0 = r24;
        r2 = r0.f29488b;	 Catch:{ RuntimeException -> 0x0316 }
        if (r2 == 0) goto L_0x0123;
    L_0x00e2:
        r0 = r24;
        r2 = r0.f29489c;	 Catch:{ RuntimeException -> 0x0316 }
        if (r2 == 0) goto L_0x0123;
    L_0x00e8:
        r2 = r24.m3060p();	 Catch:{ RuntimeException -> 0x0316 }
        r2 = r2 + -1;
        r3 = r2;
    L_0x00ef:
        if (r3 < 0) goto L_0x0123;
    L_0x00f1:
        r0 = r24;
        r2 = r0.m3051f(r3);	 Catch:{ RuntimeException -> 0x0316 }
        r4 = r2.isLayoutRequested();	 Catch:{ RuntimeException -> 0x0316 }
        if (r4 == 0) goto L_0x011f;
    L_0x00fd:
        r2 = r2.getLayoutParams();	 Catch:{ RuntimeException -> 0x0316 }
        r2 = (com.google.android.libraries.flowlayoutmanager.C5927g) r2;	 Catch:{ RuntimeException -> 0x0316 }
        r4 = r2.f29540a;	 Catch:{ RuntimeException -> 0x0316 }
        r5 = -2;
        if (r4 == r5) goto L_0x0117;
    L_0x0108:
        r4 = r2.f29540a;	 Catch:{ RuntimeException -> 0x0316 }
        r5 = -3;
        if (r4 == r5) goto L_0x0117;
    L_0x010d:
        r4 = r2.f29541b;	 Catch:{ RuntimeException -> 0x0316 }
        r5 = -2;
        if (r4 == r5) goto L_0x0117;
    L_0x0112:
        r2 = r2.f29541b;	 Catch:{ RuntimeException -> 0x0316 }
        r4 = -4;
        if (r2 != r4) goto L_0x011f;
    L_0x0117:
        r2 = 0;
        r4 = 0;
        r5 = 0;
        r0 = r24;
        r0.m27428b(r2, r4, r5);	 Catch:{ RuntimeException -> 0x0316 }
    L_0x011f:
        r2 = r3 + -1;
        r3 = r2;
        goto L_0x00ef;
    L_0x0123:
        r0 = r24;
        r2 = r0.f29492f;	 Catch:{ RuntimeException -> 0x0316 }
        r2 = r2.size();	 Catch:{ RuntimeException -> 0x0316 }
        r2 = r2 + -1;
        r3 = r2;
    L_0x012e:
        if (r3 < 0) goto L_0x0141;
    L_0x0130:
        r0 = r24;
        r2 = r0.f29492f;	 Catch:{ RuntimeException -> 0x0316 }
        r2 = r2.get(r3);	 Catch:{ RuntimeException -> 0x0316 }
        r2 = (com.google.android.libraries.flowlayoutmanager.C5929l) r2;	 Catch:{ RuntimeException -> 0x0316 }
        r2.m27522c();	 Catch:{ RuntimeException -> 0x0316 }
        r2 = r3 + -1;
        r3 = r2;
        goto L_0x012e;
    L_0x0141:
        if (r7 == 0) goto L_0x01c7;
    L_0x0143:
        r6 = r27;
    L_0x0145:
        r0 = r24;
        r2 = r0.f29492f;	 Catch:{ RuntimeException -> 0x0316 }
        r3 = r2.size();	 Catch:{ RuntimeException -> 0x0316 }
        if (r3 == 0) goto L_0x015e;
    L_0x014f:
        r0 = r24;
        r2 = r0.f29492f;	 Catch:{ RuntimeException -> 0x0316 }
        r4 = 0;
        r2 = r2.get(r4);	 Catch:{ RuntimeException -> 0x0316 }
        r2 = (com.google.android.libraries.flowlayoutmanager.C5929l) r2;	 Catch:{ RuntimeException -> 0x0316 }
        r2 = r2.f;	 Catch:{ RuntimeException -> 0x0316 }
        if (r2 <= r6) goto L_0x01cb;
    L_0x015e:
        r2 = -1;
    L_0x015f:
        if (r2 >= 0) goto L_0x0165;
    L_0x0161:
        r2 = r2 ^ -1;
        r2 = r2 + -1;
    L_0x0165:
        r0 = r24;
        r1 = r25;
        r11 = r0.m27427b(r1, r2, r6, r8);	 Catch:{ RuntimeException -> 0x0316 }
        r0 = r24;
        r2 = r0.f29492f;	 Catch:{ RuntimeException -> 0x0316 }
        r2 = r2.get(r11);	 Catch:{ RuntimeException -> 0x0316 }
        r2 = (com.google.android.libraries.flowlayoutmanager.C5929l) r2;	 Catch:{ RuntimeException -> 0x0316 }
        if (r7 == 0) goto L_0x020a;
    L_0x0179:
        r3 = r2.m27526f(r6);	 Catch:{ RuntimeException -> 0x0316 }
        r5 = r28 - r3;
    L_0x017f:
        r3 = r10 - r5;
        r0 = r24;
        r1 = r25;
        r3 = r0.m27431c(r1, r11, r3, r8);	 Catch:{ RuntimeException -> 0x0316 }
        r4 = r10 - r3;
        r3 = 0;
        if (r7 == 0) goto L_0x03f8;
    L_0x018e:
        r3 = 0;
        r6 = r18 - r4;
        r3 = java.lang.Math.max(r3, r6);	 Catch:{ RuntimeException -> 0x0316 }
        r5 = r5 + r3;
        r4 = r4 + r3;
        r9 = r3;
        r3 = r4;
        r4 = r5;
    L_0x019a:
        r15 = r2;
        r5 = r4;
        r6 = r11;
    L_0x019d:
        r0 = r17;
        if (r5 <= r0) goto L_0x0210;
    L_0x01a1:
        r2 = r15.f;	 Catch:{ RuntimeException -> 0x0316 }
        if (r2 <= 0) goto L_0x0210;
    L_0x01a5:
        r2 = r11 + -1;
        r12 = r15.f;	 Catch:{ RuntimeException -> 0x0316 }
        r12 = r12 + -1;
        r0 = r24;
        r1 = r25;
        r2 = r0.m27427b(r1, r2, r12, r8);	 Catch:{ RuntimeException -> 0x0316 }
        if (r2 != r11) goto L_0x020e;
    L_0x01b5:
        r2 = r6 + 1;
        r6 = r2;
    L_0x01b8:
        r0 = r24;
        r2 = r0.f29492f;	 Catch:{ RuntimeException -> 0x0316 }
        r2 = r2.get(r11);	 Catch:{ RuntimeException -> 0x0316 }
        r2 = (com.google.android.libraries.flowlayoutmanager.C5929l) r2;	 Catch:{ RuntimeException -> 0x0316 }
        r12 = r2.h;	 Catch:{ RuntimeException -> 0x0316 }
        r5 = r5 - r12;
        r15 = r2;
        goto L_0x019d;
    L_0x01c7:
        r2 = 0;
        r6 = r2;
        goto L_0x0145;
    L_0x01cb:
        r0 = r24;
        r2 = r0.f29492f;	 Catch:{ RuntimeException -> 0x0316 }
        r4 = r3 + -1;
        r2 = r2.get(r4);	 Catch:{ RuntimeException -> 0x0316 }
        r2 = (com.google.android.libraries.flowlayoutmanager.C5929l) r2;	 Catch:{ RuntimeException -> 0x0316 }
        r2 = r2.mo5208b();	 Catch:{ RuntimeException -> 0x0316 }
        if (r2 > r6) goto L_0x01e0;
    L_0x01dd:
        r2 = r3 ^ -1;
        goto L_0x015f;
    L_0x01e0:
        r2 = 0;
        r4 = r3;
        r5 = r2;
    L_0x01e3:
        if (r5 >= r4) goto L_0x0206;
    L_0x01e5:
        r2 = r5 + r4;
        r3 = r2 / 2;
        r0 = r24;
        r2 = r0.f29492f;	 Catch:{ RuntimeException -> 0x0316 }
        r2 = r2.get(r3);	 Catch:{ RuntimeException -> 0x0316 }
        r2 = (com.google.android.libraries.flowlayoutmanager.C5929l) r2;	 Catch:{ RuntimeException -> 0x0316 }
        r9 = r2.f;	 Catch:{ RuntimeException -> 0x0316 }
        if (r6 >= r9) goto L_0x01f9;
    L_0x01f7:
        r4 = r3;
        goto L_0x01e3;
    L_0x01f9:
        r2 = r2.mo5208b();	 Catch:{ RuntimeException -> 0x0316 }
        if (r6 < r2) goto L_0x0203;
    L_0x01ff:
        r2 = r3 + 1;
        r5 = r2;
        goto L_0x01e3;
    L_0x0203:
        r2 = r3;
        goto L_0x015f;
    L_0x0206:
        r2 = r5 ^ -1;
        goto L_0x015f;
    L_0x020a:
        r5 = r16;
        goto L_0x017f;
    L_0x020e:
        r11 = r2;
        goto L_0x01b8;
    L_0x0210:
        r2 = 0;
        if (r7 == 0) goto L_0x03f3;
    L_0x0213:
        r2 = 0;
        r7 = r5 - r16;
        r2 = java.lang.Math.max(r2, r7);	 Catch:{ RuntimeException -> 0x0316 }
        r5 = r5 - r2;
        r4 = r4 - r2;
        r3 = r3 - r2;
        if (r2 <= 0) goto L_0x03f3;
    L_0x021f:
        if (r9 != 0) goto L_0x03f3;
    L_0x0221:
        if (r3 >= r10) goto L_0x03f3;
    L_0x0223:
        r3 = r10 - r4;
        r0 = r24;
        r1 = r25;
        r3 = r0.m27431c(r1, r6, r3, r8);	 Catch:{ RuntimeException -> 0x0316 }
        r3 = r10 - r3;
        r14 = r2;
        r2 = r3;
        r3 = r5;
    L_0x0232:
        r4 = "FLM: renderAndRecycleViews";
        android.support.v4.os.C0330d.m1728a(r4);	 Catch:{ all -> 0x0311 }
        r19 = java.lang.Math.min(r2, r10);	 Catch:{ all -> 0x0311 }
        r2 = -1;
        r4 = r24.m3059o();	 Catch:{ all -> 0x0311 }
        r5 = 1;
        if (r4 != r5) goto L_0x02b0;
    L_0x0243:
        r7 = 1;
    L_0x0244:
        r4 = r8 << 8;
        r0 = r24;
        r0.f29499n = r4;	 Catch:{ all -> 0x0311 }
        r4 = 0;
        r0 = r24;
        r0.f29500o = r4;	 Catch:{ all -> 0x0311 }
        r4 = 0;
        r0 = r24;
        r0.f29501p = r4;	 Catch:{ all -> 0x0311 }
        r10 = r11;
        r4 = r3;
        r3 = r2;
    L_0x0257:
        r0 = r19;
        if (r4 >= r0) goto L_0x0378;
    L_0x025b:
        r0 = r24;
        r2 = r0.f29492f;	 Catch:{ all -> 0x0311 }
        r2 = r2.size();	 Catch:{ all -> 0x0311 }
        if (r10 >= r2) goto L_0x0378;
    L_0x0265:
        r0 = r24;
        r2 = r0.f29492f;	 Catch:{ all -> 0x0311 }
        r2 = r2.get(r10);	 Catch:{ all -> 0x0311 }
        r0 = r2;
        r0 = (com.google.android.libraries.flowlayoutmanager.C5929l) r0;	 Catch:{ all -> 0x0311 }
        r8 = r0;
        r2 = r8.f29573b;	 Catch:{ all -> 0x0311 }
        r20 = r2.size();	 Catch:{ all -> 0x0311 }
        r2 = 0;
        r12 = r2;
        r5 = r3;
        r3 = r4;
    L_0x027b:
        r0 = r19;
        if (r3 >= r0) goto L_0x0371;
    L_0x027f:
        r0 = r20;
        if (r12 >= r0) goto L_0x0371;
    L_0x0283:
        r2 = r8.f29573b;	 Catch:{ all -> 0x0311 }
        r4 = r2.get(r12);	 Catch:{ all -> 0x0311 }
        r4 = (com.google.android.libraries.flowlayoutmanager.C5924h) r4;	 Catch:{ all -> 0x0311 }
        r2 = r4.h;	 Catch:{ all -> 0x0311 }
        r13 = r3 + r2;
        r2 = -1;
        if (r5 != r2) goto L_0x02b3;
    L_0x0292:
        r0 = r17;
        if (r13 <= r0) goto L_0x02b3;
    L_0x0296:
        r2 = r4.f;	 Catch:{ all -> 0x0311 }
        r0 = r24;
        r2 = r0.m27430c(r2);	 Catch:{ all -> 0x0311 }
        if (r2 >= 0) goto L_0x02a2;
    L_0x02a0:
        r2 = r2 ^ -1;
    L_0x02a2:
        r2 = r2 + -1;
    L_0x02a4:
        if (r2 < 0) goto L_0x02b2;
    L_0x02a6:
        r0 = r24;
        r1 = r25;
        r0.m3001a(r2, r1);	 Catch:{ all -> 0x0311 }
        r2 = r2 + -1;
        goto L_0x02a4;
    L_0x02b0:
        r7 = 0;
        goto L_0x0244;
    L_0x02b2:
        r5 = 0;
    L_0x02b3:
        r2 = -1;
        if (r5 == r2) goto L_0x02c9;
    L_0x02b6:
        r2 = r24;
        r6 = r25;
        r5 = r2.m27417a(r3, r4, r5, r6, r7);	 Catch:{ all -> 0x0311 }
        r2 = r4.h;	 Catch:{ all -> 0x0311 }
        r2 = r2 + r3;
        r0 = r16;
        if (r2 <= r0) goto L_0x02c9;
    L_0x02c5:
        r0 = r18;
        if (r3 < r0) goto L_0x02ce;
    L_0x02c9:
        r2 = r12 + 1;
        r12 = r2;
        r3 = r13;
        goto L_0x027b;
    L_0x02ce:
        r6 = r4.mo5208b();	 Catch:{ all -> 0x0311 }
        r0 = r4.f;	 Catch:{ all -> 0x0311 }
        r21 = r0;
        r6 = r6 - r21;
        r6 = r6 << 8;
        r0 = r16;
        if (r3 > r0) goto L_0x02f6;
    L_0x02de:
        r0 = r4.f;	 Catch:{ all -> 0x0311 }
        r21 = r0;
        r21 = r21 << 8;
        r22 = r16 - r3;
        r22 = r22 * r6;
        r0 = r4.h;	 Catch:{ all -> 0x0311 }
        r23 = r0;
        r22 = r22 / r23;
        r21 = r21 + r22;
        r0 = r21;
        r1 = r24;
        r1.f29500o = r0;	 Catch:{ all -> 0x0311 }
    L_0x02f6:
        r0 = r18;
        r2 = java.lang.Math.min(r2, r0);	 Catch:{ all -> 0x0311 }
        r0 = r16;
        r3 = java.lang.Math.max(r3, r0);	 Catch:{ all -> 0x0311 }
        r2 = r2 - r3;
        r3 = r4.h;	 Catch:{ all -> 0x0311 }
        if (r3 != 0) goto L_0x0362;
    L_0x0307:
        r0 = r24;
        r2 = r0.f29501p;	 Catch:{ all -> 0x0311 }
        r2 = r2 + r6;
        r0 = r24;
        r0.f29501p = r2;	 Catch:{ all -> 0x0311 }
        goto L_0x02c9;
    L_0x0311:
        r2 = move-exception;
        android.support.v4.os.C0330d.m1727a();	 Catch:{ RuntimeException -> 0x0316 }
        throw r2;	 Catch:{ RuntimeException -> 0x0316 }
    L_0x0316:
        r2 = move-exception;
        r3 = "FlowLayoutManager";
        r4 = r26.m3705a();
        r0 = r26;
        r5 = r0.f3470g;
        r6 = 160; // 0xa0 float:2.24E-43 double:7.9E-322;
        r7 = new java.lang.StringBuilder;
        r7.<init>(r6);
        r6 = "layoutViewport() state at exception:\n\t referencePosition=";
        r6 = r7.append(r6);
        r0 = r27;
        r6 = r6.append(r0);
        r7 = "\n\t referenceOffset=";
        r6 = r6.append(r7);
        r0 = r28;
        r6 = r6.append(r0);
        r7 = "\n\t state.getItemCount()=";
        r6 = r6.append(r7);
        r4 = r6.append(r4);
        r6 = "\n\t didStructureChange=";
        r4 = r4.append(r6);
        r4 = r4.append(r5);
        r4 = r4.toString();
        android.util.Log.d(r3, r4);
        r24.m27433g();
        r24.m27434h();
        throw r2;
    L_0x0362:
        r0 = r24;
        r3 = r0.f29501p;	 Catch:{ all -> 0x0311 }
        r2 = r2 * r6;
        r4 = r4.h;	 Catch:{ all -> 0x0311 }
        r2 = r2 / r4;
        r2 = r2 + r3;
        r0 = r24;
        r0.f29501p = r2;	 Catch:{ all -> 0x0311 }
        goto L_0x02c9;
    L_0x0371:
        r2 = r10 + 1;
        r10 = r2;
        r4 = r3;
        r3 = r5;
        goto L_0x0257;
    L_0x0378:
        r2 = r24.m3060p();	 Catch:{ all -> 0x0311 }
        r2 = r2 + -1;
    L_0x037e:
        if (r2 < 0) goto L_0x038c;
    L_0x0380:
        if (r2 < r3) goto L_0x038c;
    L_0x0382:
        r0 = r24;
        r1 = r25;
        r0.m3001a(r2, r1);	 Catch:{ all -> 0x0311 }
        r2 = r2 + -1;
        goto L_0x037e;
    L_0x038c:
        r0 = r24;
        r2 = r0.f29492f;	 Catch:{ all -> 0x0311 }
        r2 = r2.size();	 Catch:{ all -> 0x0311 }
        if (r10 >= r2) goto L_0x03ca;
    L_0x0396:
        r0 = r24;
        r2 = r0.f29492f;	 Catch:{ all -> 0x0311 }
        r2 = r2.get(r10);	 Catch:{ all -> 0x0311 }
        r2 = (com.google.android.libraries.flowlayoutmanager.C5929l) r2;	 Catch:{ all -> 0x0311 }
        r2 = r2.f;	 Catch:{ all -> 0x0311 }
        r4 = r2 + 5;
        r0 = r24;
        r2 = r0.f29492f;	 Catch:{ all -> 0x0311 }
        r2 = r2.size();	 Catch:{ all -> 0x0311 }
        r2 = r2 + -1;
        r3 = r2;
    L_0x03af:
        r2 = r10 + 2;
        if (r3 < r2) goto L_0x03ca;
    L_0x03b3:
        r0 = r24;
        r2 = r0.f29492f;	 Catch:{ all -> 0x0311 }
        r2 = r2.get(r3);	 Catch:{ all -> 0x0311 }
        r2 = (com.google.android.libraries.flowlayoutmanager.C5929l) r2;	 Catch:{ all -> 0x0311 }
        r2 = r2.f;	 Catch:{ all -> 0x0311 }
        if (r2 < r4) goto L_0x03ca;
    L_0x03c1:
        r0 = r24;
        r0.m27424a(r3);	 Catch:{ all -> 0x0311 }
        r2 = r3 + -1;
        r3 = r2;
        goto L_0x03af;
    L_0x03ca:
        r2 = r15.f;	 Catch:{ all -> 0x0311 }
        r4 = r2 + -5;
        r2 = r11 + -2;
        r2 = r2 + -1;
        r3 = r2;
    L_0x03d3:
        if (r3 < 0) goto L_0x03ec;
    L_0x03d5:
        r0 = r24;
        r2 = r0.f29492f;	 Catch:{ all -> 0x0311 }
        r2 = r2.get(r3);	 Catch:{ all -> 0x0311 }
        r2 = (com.google.android.libraries.flowlayoutmanager.C5929l) r2;	 Catch:{ all -> 0x0311 }
        r2 = r2.f;	 Catch:{ all -> 0x0311 }
        if (r2 >= r4) goto L_0x03e8;
    L_0x03e3:
        r0 = r24;
        r0.m27424a(r3);	 Catch:{ all -> 0x0311 }
    L_0x03e8:
        r2 = r3 + -1;
        r3 = r2;
        goto L_0x03d3;
    L_0x03ec:
        android.support.v4.os.C0330d.m1727a();	 Catch:{ RuntimeException -> 0x0316 }
        r2 = r9 - r14;
        goto L_0x000d;
    L_0x03f3:
        r14 = r2;
        r2 = r3;
        r3 = r5;
        goto L_0x0232;
    L_0x03f8:
        r9 = r3;
        r3 = r4;
        r4 = r5;
        goto L_0x019a;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.flowlayoutmanager.FlowLayoutManager.a(android.support.v7.widget.fh, android.support.v7.widget.fo, int, int):int");
    }

    private static int m27415a(int i, int i2) {
        if (C5918a.m27465a(i2)) {
            return i2;
        }
        return (int) ((((float) i) * Float.intBitsToFloat(i2)) + 0.5f);
    }

    private final int m27417a(int i, C5924h c5924h, int i2, fh fhVar, boolean z) {
        if (c5924h instanceof C5925e) {
            C5925e c5925e = (C5925e) c5924h;
            int paddingStart = getPaddingStart() + c5925e.e;
            int i3 = i2;
            for (int i4 = 0; i4 < c5925e.f29522d.size(); i4++) {
                C5926f c5926f = (C5926f) c5925e.f29522d.get(i4);
                i3 = m27416a(i, paddingStart, c5926f, c5925e.f + i4, i3, fhVar, z, null) + 1;
                paddingStart += (c5926f.f29529g + c5926f.f29534l) + c5926f.f29530h;
            }
            return i3;
        }
        C5928j c5928j = (C5928j) c5924h;
        int a = m27416a(i, getPaddingStart() + c5928j.e, c5928j.f29563b, c5928j.f, i2, fhVar, z, c5928j) + 1;
        int size = c5928j.f29570m == null ? 0 : c5928j.f29570m.f29573b.size();
        int i5 = c5928j.f29568k + (c5928j.f29563b.f29538p + i);
        for (int i6 = 0; i6 < size; i6++) {
            C5924h c5924h2 = (C5924h) c5928j.f29570m.f29573b.get(i6);
            a = m27417a(i5, c5924h2, a, fhVar, z);
            i5 += c5924h2.h;
        }
        return a;
    }

    private final int m27416a(int i, int i2, C5926f c5926f, int i3, int i4, fh fhVar, boolean z, C5928j c5928j) {
        int i5;
        int a = m27418a(fhVar, i3, i3, i4);
        View f = m3051f(a);
        int i6 = c5926f.f29535m;
        if (c5928j != null && c5928j.f29564c && c5928j.f29571n > 0) {
            m27429b(f, c5926f.f29534l, c5926f.f29535m + c5928j.f29571n);
            i6 = ew.m2986d(f);
        } else if (!c5926f.f29537o) {
            m27429b(f, c5926f.f29534l, c5926f.f29535m);
            c5926f.m27494a(f, true);
            i6 = c5926f.f29535m;
        }
        int i7 = i + c5926f.f29538p;
        int i8 = i7 + i6;
        int i9 = i2 + c5926f.f29529g;
        i6 = c5926f.f29534l + i9;
        if (z) {
            i5 = this.f2957M - i6;
        } else {
            i5 = i9;
        }
        if (z) {
            i6 = this.f2957M - i9;
        }
        ew.m2981a(f, i5, i7, i6, i8);
        if (this.f29495j != null) {
            ((RecyclerView) f.getParent()).m275a(f);
            this.f29495j.m27470a();
        }
        return a;
    }

    private final void m27429b(View view, int i, int i2) {
        m3034b(view, f29487h);
        view.measure(MeasureSpec.makeMeasureSpec((i - f29487h.left) - f29487h.right, MemoryMappedFileBuffer.DEFAULT_SIZE), MeasureSpec.makeMeasureSpec((i2 - f29487h.top) - f29487h.bottom, MemoryMappedFileBuffer.DEFAULT_SIZE));
    }

    public final boolean mo747f() {
        return true;
    }

    public final int mo748g(fo foVar) {
        return this.f29499n;
    }

    public final int mo737c(fo foVar) {
        return this.f29500o;
    }

    public final int mo744e(fo foVar) {
        return this.f29501p;
    }

    public final void mo729a(RecyclerView recyclerView, int i) {
        fl c5919b = new C5919b(this, recyclerView.getContext());
        c5919b.f3396g = i;
        m3014a(c5919b);
    }

    public final void mo743d(int i) {
        this.f29497l = i;
        this.f29498m = Integer.MIN_VALUE;
        m3056l();
    }

    public final int mo734b(int i, fh fhVar, fo foVar) {
        if (this.f29492f.isEmpty()) {
            return 0;
        }
        if (this.f29502q) {
            int k = m27436k();
            View b;
            if (i > 0) {
                int a = k + m27415a(k, this.f29491e);
                int a2 = ew.m2979a(m3051f(m3060p() - 1));
                C5929l c5929l = null;
                for (int size = this.f29492f.size() - 1; size >= 0; size--) {
                    C5929l c5929l2 = (C5929l) this.f29492f.get(size);
                    if (c5929l2.f <= a2) {
                        c5929l = c5929l2;
                        break;
                    }
                }
                b = mo736b(c5929l.f);
                if (a + i < (ew.m2988f(b) - ((fa) b.getLayoutParams()).topMargin) + c5929l.h) {
                    k = 1;
                }
                k = 0;
            } else {
                int i2 = -m27415a(k, this.f29490d);
                b = m3051f(0);
                if (i2 + i > ew.m2988f(b) - ((fa) b.getLayoutParams()).topMargin) {
                    k = 1;
                }
                k = 0;
            }
            if (k != 0) {
                m3054g(-i);
                return i;
            }
        }
        View s = m27437s();
        if (s == null) {
            return 0;
        }
        return i - m27419a(fhVar, foVar, ew.m2979a(s), ew.m2988f(s) - i);
    }

    public final void mo726a(int i, int i2, fo foVar, ez ezVar) {
        if (i2 != 0 && !this.f29492f.isEmpty()) {
            View f;
            int a;
            if (i2 > 0) {
                f = m3051f(m3060p() - 1);
                a = ew.m2979a(f);
                if (a + 1 < foVar.m3705a()) {
                    ezVar.mo792a(a + 1, Math.max(0, ew.m2990h(f) - m27436k()));
                    return;
                }
                return;
            }
            f = m3051f(0);
            a = ew.m2979a(f);
            if (a - 1 >= 0) {
                ezVar.mo792a(a - 1, Math.max(0, -ew.m2988f(f)));
            }
        }
    }

    private final int m27436k() {
        return (this.f2958N - getPaddingBottom()) - getPaddingTop();
    }

    private final View m27437s() {
        int i = this.f2958N;
        int p = m3060p();
        View view = null;
        int i2 = Integer.MAX_VALUE;
        int i3 = 0;
        while (i3 < p) {
            int f;
            View view2;
            View f2 = m3051f(i3);
            if (!((C5927g) f2.getLayoutParams()).f3356c.m3276m()) {
                f = (ew.m2988f(f2) + ew.m2990h(f2)) / 2;
                if (f >= 0 && f <= i) {
                    return f2;
                }
                f = f < 0 ? -f : f - i;
                if (f < i2) {
                    view2 = f2;
                    i3++;
                    view = view2;
                    i2 = f;
                }
            }
            f = i2;
            view2 = view;
            i3++;
            view = view2;
            i2 = f;
        }
        return view;
    }

    public final Parcelable mo742d() {
        if (this.f29503r != null) {
            return new SavedState(this.f29503r);
        }
        Parcelable savedState = new SavedState();
        View s = m27437s();
        if (s == null) {
            savedState.f29484a = -1;
            savedState.f29485b = 0.0f;
            return savedState;
        }
        savedState.f29484a = ew.m2979a(s);
        savedState.f29485b = ((float) ew.m2988f(s)) / ((float) this.f2958N);
        return savedState;
    }

    public final void mo728a(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.f29503r = (SavedState) parcelable;
            m3056l();
        }
    }

    public final /* synthetic */ fa mo794a(Context context, AttributeSet attributeSet) {
        return new C5927g(context, attributeSet);
    }

    public final /* synthetic */ fa mo795a(LayoutParams layoutParams) {
        if (layoutParams instanceof C5927g) {
            return new C5927g((C5927g) layoutParams);
        }
        if (layoutParams instanceof MarginLayoutParams) {
            return new C5927g((MarginLayoutParams) layoutParams);
        }
        return new C5927g(layoutParams);
    }

    public final /* synthetic */ fa mo724a() {
        return new C5927g();
    }
}
