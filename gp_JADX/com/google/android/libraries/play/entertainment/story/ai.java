package com.google.android.libraries.play.entertainment.story;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.libraries.play.entertainment.C6089g;
import com.google.android.libraries.play.entertainment.C6091h;
import com.google.android.libraries.play.entertainment.p190b.C2979a;
import com.google.android.libraries.play.entertainment.p346h.C6090b;
import com.google.android.libraries.play.entertainment.p351m.C6115a;
import com.google.android.libraries.play.entertainment.p351m.C6116b;

public class ai extends C2979a {
    public static final C6090b f15659t = C6090b.m28050a();
    public al f15660u;
    public String f15661v;
    public int f15662w;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C6091h.pe_activity_story);
        if (C6115a.m28097a(21)) {
            getWindow().getDecorView().setSystemUiVisibility(1280);
        }
        this.f15661v = "";
        Intent intent = getIntent();
        if (intent != null) {
            this.f15661v = intent.getStringExtra("storyId");
        }
        if (bundle != null) {
            this.f15660u = al.m28218a(H_());
            this.f15660u.m28222a(this.f15661v);
        } else {
            m15407k();
        }
        m15406a(intent);
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        String stringExtra = intent.getStringExtra("storyId");
        if (!(TextUtils.isEmpty(stringExtra) || stringExtra.equals(this.f15661v))) {
            m15408a(stringExtra);
        }
        m15406a(intent);
    }

    private final void m15406a(Intent intent) {
        int i = -14273992;
        if (intent != null) {
            i = intent.getIntExtra("bgColor", -14273992);
        }
        getWindow().setBackgroundDrawable(new ColorDrawable(i));
    }

    public final void m15408a(String str) {
        C6090b c6090b = f15659t;
        String str2 = "Replacing story fragment: old [%s], new [%s]";
        Object[] objArr = new Object[]{this.f15661v, str};
        if (c6090b.m28056a(4)) {
            c6090b.f30243d.mo5282a(4, c6090b.f30244e, C6090b.m28053c(null, str2, objArr));
        }
        ((al) C6116b.m28100a(this.f15660u)).m28220Y();
        H_().mo284a().mo327a(this.f15660u).mo334c();
        this.f15661v = str;
        m15407k();
    }

    private final void m15407k() {
        this.f15660u = new al();
        this.f15660u.m28222a(this.f15661v);
        H_().mo284a().mo332b(C6089g.story_activity_root, this.f15660u, "com.google.android.libraries.play.entertainment.story:StoryFragment").mo334c();
    }

    protected void onStart() {
        super.onStart();
        this.f15662w = getRequestedOrientation();
        setRequestedOrientation(7);
    }

    public void onBackPressed() {
        if (this.f15660u == null || !this.f15660u.m28219X()) {
            super.onBackPressed();
        }
    }

    public final boolean E_() {
        if ((this.f15660u == null || !this.f15660u.m28219X()) && !H_().mo293d()) {
            return super.E_();
        }
        return true;
    }

    protected void onStop() {
        setRequestedOrientation(this.f15662w);
        if (isFinishing() && this.f15660u != null) {
            this.f15660u.m28220Y();
        }
        super.onStop();
    }
}
