package com.google.android.instantapps.common.p217e;

import p000c.p001a.C0000a;
import p002a.p003a.C0004c;

public final class at implements C0000a {
    public final C0000a f29053a;

    public at(C0000a c0000a) {
        this.f29053a = c0000a;
    }

    public final /* synthetic */ Object mo1a() {
        bg bgVar = (bg) this.f29053a.mo1a();
        boolean booleanValue = ((Boolean) bgVar.m27118a("LoadingUi__").m27117a("enable_skeleton", false).mo5158a()).booleanValue();
        bgVar.m27118a("LoadingUi__").m27116a("skeleton_disabled_packages", "").mo5158a();
        int intValue = ((Integer) bgVar.m27118a("LoadingUi__").m27114a("skeleton_shown_progress", 25).mo5158a()).intValue();
        int intValue2 = ((Integer) bgVar.m27118a("LoadingUi__").m27114a("skeleton_shown_delay_millis", 1000).mo5158a()).intValue();
        ((Boolean) bgVar.m27118a("LoadingUi__").m27117a("skeleton_wait_for_speed_bump", true).mo5158a()).booleanValue();
        return (bj) C0004c.m7a(new bj(booleanValue, intValue, intValue2, ((Integer) bgVar.m27118a("LoadingUi__").m27114a("skeleton_resolution_start_progress", 65).mo5158a()).intValue(), ((Integer) bgVar.m27118a("LoadingUi__").m27114a("skeleton_resolution_millis", 1000).mo5158a()).intValue(), ((Integer) bgVar.m27118a("LoadingUi__").m27114a("skeleton_loading_body_removal_millis", 500).mo5158a()).intValue(), ((Integer) bgVar.m27118a("LoadingUi__").m27114a("skeleton_blur_radius", 25).mo5158a()).intValue(), ((Integer) bgVar.m27118a("LoadingUi__").m27114a("skeleton_scroll_duration", 1000).mo5158a()).intValue(), ((Integer) bgVar.m27118a("LoadingUi__").m27114a("skeleton_initial_offset", 50).mo5158a()).intValue(), ((Integer) bgVar.m27118a("LoadingUi__").m27114a("skeleton_resolution_delay_millis", 1500).mo5158a()).intValue()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
