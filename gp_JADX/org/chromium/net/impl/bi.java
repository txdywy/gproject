package org.chromium.net.impl;

final class bi implements bd {
    public final /* synthetic */ boolean f40854a;
    public final /* synthetic */ bg f40855b;

    bi(bg bgVar, boolean z) {
        this.f40855b = bgVar;
        this.f40854a = z;
    }

    public final void mo6615a() {
        this.f40855b.f40848i.flip();
        if (this.f40855b.f40849j == -1 || this.f40855b.f40849j - this.f40855b.f40850k >= ((long) this.f40855b.f40848i.remaining())) {
            while (this.f40855b.f40848i.hasRemaining()) {
                bg bgVar = this.f40855b;
                bgVar.f40850k += (long) this.f40855b.f40845f.write(this.f40855b.f40848i);
            }
            this.f40855b.f40846g.flush();
            if (this.f40855b.f40850k < this.f40855b.f40849j || (this.f40855b.f40849j == -1 && !this.f40854a)) {
                this.f40855b.f40848i.clear();
                this.f40855b.f40840a.set(bp.AWAITING_READ_RESULT);
                this.f40855b.m38092a(new bj(this));
                return;
            } else if (this.f40855b.f40849j == -1) {
                this.f40855b.m38096d();
                return;
            } else if (this.f40855b.f40849j == this.f40855b.f40850k) {
                this.f40855b.m38096d();
                return;
            } else {
                this.f40855b.f40851l.m38070a(new IllegalArgumentException(String.format("Read upload data length %d exceeds expected length %d", new Object[]{Long.valueOf(this.f40855b.f40850k), Long.valueOf(this.f40855b.f40849j)})));
                return;
            }
        }
        this.f40855b.f40851l.m38070a(new IllegalArgumentException(String.format("Read upload data length %d exceeds expected length %d", new Object[]{Long.valueOf(this.f40855b.f40850k + ((long) this.f40855b.f40848i.remaining())), Long.valueOf(this.f40855b.f40849j)})));
    }
}
