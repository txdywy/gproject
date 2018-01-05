package android.support.v7.widget;

import android.support.v4.view.ai;
import android.util.Log;
import android.view.View;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class fr {
    public static final List f3210k = Collections.EMPTY_LIST;
    public final View f3211a;
    public WeakReference f3212b;
    public int f3213c = -1;
    public int f3214d = -1;
    public long f3215e = -1;
    public int f3216f = -1;
    public int f3217g = -1;
    public fr f3218h = null;
    public fr f3219i = null;
    public int f3220j;
    public List f3221l = null;
    public List f3222m = null;
    public int f3223n = 0;
    public fh f3224o = null;
    public boolean f3225p = false;
    public int f3226q = 0;
    public int f3227r = -1;
    public RecyclerView f3228s;

    public fr(View view) {
        if (view == null) {
            throw new IllegalArgumentException("itemView may not be null");
        }
        this.f3211a = view;
    }

    final void m3259a(int i, boolean z) {
        if (this.f3214d == -1) {
            this.f3214d = this.f3213c;
        }
        if (this.f3217g == -1) {
            this.f3217g = this.f3213c;
        }
        if (z) {
            this.f3217g += i;
        }
        this.f3213c += i;
        if (this.f3211a.getLayoutParams() != null) {
            ((fa) this.f3211a.getLayoutParams()).f3358e = true;
        }
    }

    final void m3257a() {
        this.f3214d = -1;
        this.f3217g = -1;
    }

    final boolean m3265b() {
        return (this.f3220j & 128) != 0;
    }

    public final int m3266c() {
        return this.f3217g == -1 ? this.f3213c : this.f3217g;
    }

    public final int m3267d() {
        if (this.f3228s == null) {
            return -1;
        }
        return this.f3228s.m291c(this);
    }

    final boolean m3268e() {
        return this.f3224o != null;
    }

    final void m3269f() {
        this.f3224o.m3690b(this);
    }

    final boolean m3270g() {
        return (this.f3220j & 32) != 0;
    }

    final void m3271h() {
        this.f3220j &= -33;
    }

    final void m3272i() {
        this.f3220j &= -257;
    }

    final void m3260a(fh fhVar, boolean z) {
        this.f3224o = fhVar;
        this.f3225p = z;
    }

    final boolean m3273j() {
        return (this.f3220j & 4) != 0;
    }

    public final boolean m3274k() {
        return (this.f3220j & 2) != 0;
    }

    final boolean m3275l() {
        return (this.f3220j & 1) != 0;
    }

    public final boolean m3276m() {
        return (this.f3220j & 8) != 0;
    }

    final boolean m3263a(int i) {
        return (this.f3220j & i) != 0;
    }

    final boolean m3277n() {
        return (this.f3220j & 256) != 0;
    }

    final void m3258a(int i, int i2) {
        this.f3220j = (this.f3220j & (i2 ^ -1)) | (i & i2);
    }

    final void m3264b(int i) {
        this.f3220j |= i;
    }

    final void m3261a(Object obj) {
        if (obj == null) {
            m3264b(MemoryMappedFileBuffer.DEFAULT_PADDING);
        } else if ((this.f3220j & MemoryMappedFileBuffer.DEFAULT_PADDING) == 0) {
            if (this.f3221l == null) {
                this.f3221l = new ArrayList();
                this.f3222m = Collections.unmodifiableList(this.f3221l);
            }
            this.f3221l.add(obj);
        }
    }

    final void m3278o() {
        if (this.f3221l != null) {
            this.f3221l.clear();
        }
        this.f3220j &= -1025;
    }

    final List m3279p() {
        if ((this.f3220j & MemoryMappedFileBuffer.DEFAULT_PADDING) != 0) {
            return f3210k;
        }
        if (this.f3221l == null || this.f3221l.size() == 0) {
            return f3210k;
        }
        return this.f3222m;
    }

    final void m3280q() {
        this.f3220j = 0;
        this.f3213c = -1;
        this.f3214d = -1;
        this.f3215e = -1;
        this.f3217g = -1;
        this.f3223n = 0;
        this.f3218h = null;
        this.f3219i = null;
        m3278o();
        this.f3226q = 0;
        this.f3227r = -1;
        RecyclerView.m259b(this);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("ViewHolder{" + Integer.toHexString(hashCode()) + " position=" + this.f3213c + " id=" + this.f3215e + ", oldPos=" + this.f3214d + ", pLpos:" + this.f3217g);
        if (m3268e()) {
            stringBuilder.append(" scrap ").append(this.f3225p ? "[changeScrap]" : "[attachedScrap]");
        }
        if (m3273j()) {
            stringBuilder.append(" invalid");
        }
        if (!m3275l()) {
            stringBuilder.append(" unbound");
        }
        if (m3274k()) {
            stringBuilder.append(" update");
        }
        if (m3276m()) {
            stringBuilder.append(" removed");
        }
        if (m3265b()) {
            stringBuilder.append(" ignored");
        }
        if (m3277n()) {
            stringBuilder.append(" tmpDetached");
        }
        if (!m3281r()) {
            stringBuilder.append(" not recyclable(" + this.f3223n + ")");
        }
        Object obj = ((this.f3220j & 512) != 0 || m3273j()) ? 1 : null;
        if (obj != null) {
            stringBuilder.append(" undefined adapter position");
        }
        if (this.f3211a.getParent() == null) {
            stringBuilder.append(" no parent");
        }
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final void m3262a(boolean z) {
        this.f3223n = z ? this.f3223n - 1 : this.f3223n + 1;
        if (this.f3223n < 0) {
            this.f3223n = 0;
            Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
        } else if (!z && this.f3223n == 1) {
            this.f3220j |= 16;
        } else if (z && this.f3223n == 0) {
            this.f3220j &= -17;
        }
    }

    public final boolean m3281r() {
        if ((this.f3220j & 16) == 0) {
            if (!ai.f1848a.mo390b(this.f3211a)) {
                return true;
            }
        }
        return false;
    }

    final boolean m3282s() {
        return (this.f3220j & 2) != 0;
    }
}
