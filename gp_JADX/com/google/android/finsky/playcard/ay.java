package com.google.android.finsky.playcard;

import android.view.View;
import android.widget.ImageView.ScaleType;
import android.widget.RelativeLayout.LayoutParams;
import com.google.android.finsky.cv.p177a.bd;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.play.layout.d;

final class ay extends C3901z {
    ay() {
    }

    public final /* synthetic */ void mo3861a(d dVar, Document document, C3748a c3748a, C2495w c2495w) {
        bd[] bdVarArr;
        boolean z;
        FlatCardViewScreenshot flatCardViewScreenshot = (FlatCardViewScreenshot) dVar;
        super.mo3861a(flatCardViewScreenshot, document, c3748a, c2495w);
        if (document.ce() != null) {
            bdVarArr = document.ce().f12749a;
        } else {
            bdVarArr = null;
        }
        flatCardViewScreenshot.f19409b.m18406a(0.5625f);
        if (bdVarArr != null) {
            int i;
            AutoTransitionImageView autoTransitionImageView = flatCardViewScreenshot.f19410c;
            autoTransitionImageView.f19324b = (long) flatCardViewScreenshot.f19408a.f19706c;
            autoTransitionImageView.f19326d = bdVarArr == null ? 0 : bdVarArr.length;
            if (autoTransitionImageView.f19326d > 0) {
                i = 0;
                while (i < autoTransitionImageView.getChildCount() && i < autoTransitionImageView.f19326d) {
                    autoTransitionImageView.m18392a(autoTransitionImageView.getChildAt(i), bdVarArr[i]);
                    i++;
                }
                while (i < autoTransitionImageView.f19326d) {
                    View cmVar = new cm(autoTransitionImageView.getContext());
                    cmVar.setScaleType(ScaleType.CENTER_CROP);
                    cmVar.setLayoutParams(new LayoutParams(-1, -1));
                    autoTransitionImageView.m18392a(cmVar, bdVarArr[i]);
                    autoTransitionImageView.addView(cmVar);
                    i++;
                }
            } else {
                i = 0;
            }
            if (autoTransitionImageView.getChildCount() >= autoTransitionImageView.f19326d) {
                for (i = 
/*
Method generation error in method: com.google.android.finsky.playcard.ay.a(com.google.android.play.layout.d, com.google.android.finsky.dfemodel.Document, com.google.android.finsky.navigationmanager.a, com.google.android.finsky.d.w):void
jadx.core.utils.exceptions.CodegenException: Error generate insn: PHI: (r1_12 'i' int) = (r1_9 'i' int), (r1_11 'i' int) binds: {(r1_9 'i' int)=B:49:0x0070, (r1_11 'i' int)=B:21:0x006f} in method: com.google.android.finsky.playcard.ay.a(com.google.android.play.layout.d, com.google.android.finsky.dfemodel.Document, com.google.android.finsky.navigationmanager.a, com.google.android.finsky.d.w):void
	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:226)
	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:184)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:61)
	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:87)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:53)
	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:93)
	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:118)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:57)
	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:87)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:53)
	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:93)
	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:118)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:57)
	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:87)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:53)
	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:183)
	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:328)
	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:265)
	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:228)
	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:118)
	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:83)
	at jadx.core.codegen.CodeGen.visit(CodeGen.java:19)
	at jadx.core.ProcessClass.process(ProcessClass.java:43)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
Caused by: jadx.core.utils.exceptions.CodegenException: PHI can be used only in fallback mode
	at jadx.core.codegen.InsnGen.fallbackOnlyInsn(InsnGen.java:530)
	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:514)
	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:220)
	... 25 more

*/
            }
