package com.google.android.finsky.setup;

final class av implements Runnable {
    public final /* synthetic */ RestoreService f20803a;

    av(RestoreService restoreService) {
        this.f20803a = restoreService;
    }

    public final void run() {
        if (this.f20803a.f20572e.m19266g(null)) {
            if (this.f20803a.f20572e.f20859h != null) {
                String str = this.f20803a.f20572e.f20859h;
                ay ayVar = (ay) this.f20803a.f20572e.f20855d.get(str);
                if (ayVar != null && ayVar.f20814g) {
                    this.f20803a.m19095a(3, str);
                    return;
                }
            }
            this.f20803a.m19095a(2, null);
            return;
        }
        this.f20803a.m19095a(1, null);
    }
}
