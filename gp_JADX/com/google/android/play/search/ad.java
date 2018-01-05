package com.google.android.play.search;

final class ad implements C6407o {
    public final /* synthetic */ PlaySearchToolbar f32335a;

    ad(PlaySearchToolbar playSearchToolbar) {
        this.f32335a = playSearchToolbar;
    }

    public final void mo5425a(int i) {
        if (this.f32335a.aj != null) {
            this.f32335a.aj.mo5425a(i);
        }
    }

    public final void mo5428a(String str, boolean z) {
        if (this.f32335a.ae != null) {
            this.f32335a.ae.setQuery(str);
        }
        if (this.f32335a.aj != null) {
            this.f32335a.aj.mo5428a(str, z);
        }
    }

    public final void mo5426a(C6429w c6429w) {
        if (this.f32335a.aj != null) {
            this.f32335a.aj.mo5426a(c6429w);
        }
    }

    public final boolean mo5429b(C6429w c6429w) {
        if (this.f32335a.aj != null) {
            return this.f32335a.aj.mo5429b(c6429w);
        }
        return false;
    }

    public final void mo5427a(String str) {
        if (this.f32335a.aj != null) {
            this.f32335a.aj.mo5427a(str);
        }
    }
}
