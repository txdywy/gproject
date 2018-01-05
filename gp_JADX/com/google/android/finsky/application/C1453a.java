package com.google.android.finsky.application;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageManager;
import android.provider.SearchRecentSuggestions;
import com.google.android.finsky.C0953a;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.DfeNotificationManagerImpl;
import com.google.android.finsky.ac.C0972a;
import com.google.android.finsky.ac.C0975c;
import com.google.android.finsky.ac.C0977e;
import com.google.android.finsky.accounts.C0986a;
import com.google.android.finsky.accounts.C0988c;
import com.google.android.finsky.accounts.impl.AccountsChangedReceiver;
import com.google.android.finsky.actionbuttons.C1011h;
import com.google.android.finsky.actionbuttons.layout.WishlistPlayActionButton;
import com.google.android.finsky.activities.C1036b;
import com.google.android.finsky.activities.bc;
import com.google.android.finsky.activities.fa;
import com.google.android.finsky.activities.gn;
import com.google.android.finsky.ae.C1182a;
import com.google.android.finsky.af.C1184a;
import com.google.android.finsky.aj.C1190a;
import com.google.android.finsky.ak.C1203f;
import com.google.android.finsky.al.C1224h;
import com.google.android.finsky.am.C1226a;
import com.google.android.finsky.am.C1227b;
import com.google.android.finsky.am.C1229c;
import com.google.android.finsky.am.C1232f;
import com.google.android.finsky.an.C1236b;
import com.google.android.finsky.api.C0947i;
import com.google.android.finsky.api.C1287h;
import com.google.android.finsky.api.C1288k;
import com.google.android.finsky.api.C1289l;
import com.google.android.finsky.api.p125a.C1251b;
import com.google.android.finsky.api.p125a.C1256d;
import com.google.android.finsky.api.p125a.cr;
import com.google.android.finsky.api.p125a.ct;
import com.google.android.finsky.appdiscoveryservice.AppDiscoveryLaunchActivity;
import com.google.android.finsky.appdiscoveryservice.AppDiscoveryService;
import com.google.android.finsky.appdiscoveryservice.C1322d;
import com.google.android.finsky.appdiscoveryservice.C1323e;
import com.google.android.finsky.appdiscoveryservice.C1324f;
import com.google.android.finsky.appdiscoveryservice.C1325g;
import com.google.android.finsky.appdiscoveryservice.C1326h;
import com.google.android.finsky.appdiscoveryservice.C1329k;
import com.google.android.finsky.appdiscoveryservice.C1333o;
import com.google.android.finsky.appdiscoveryservice.C1334p;
import com.google.android.finsky.appdiscoveryservice.C1336r;
import com.google.android.finsky.appdiscoveryservice.C1339u;
import com.google.android.finsky.appdiscoveryservice.C1341w;
import com.google.android.finsky.appdiscoveryservice.p127a.C1304b;
import com.google.android.finsky.appdiscoveryservice.p127a.C1306d;
import com.google.android.finsky.appdiscoveryservice.p128b.C1317i;
import com.google.android.finsky.appdiscoveryservice.p128b.C1318j;
import com.google.android.finsky.aq.C1500a;
import com.google.android.finsky.as.C1503a;
import com.google.android.finsky.as.C1504b;
import com.google.android.finsky.as.C1506e;
import com.google.android.finsky.at.C1128e;
import com.google.android.finsky.ay.C1534b;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.ba.C1556d;
import com.google.android.finsky.ba.p129a.C1551a;
import com.google.android.finsky.bb.C1557b;
import com.google.android.finsky.bc.C1571c;
import com.google.android.finsky.bc.C1575e;
import com.google.android.finsky.bc.C1576f;
import com.google.android.finsky.bc.C1577g;
import com.google.android.finsky.bc.C1583n;
import com.google.android.finsky.bc.C1589w;
import com.google.android.finsky.be.C1593a;
import com.google.android.finsky.be.C1597e;
import com.google.android.finsky.bf.C1600a;
import com.google.android.finsky.bg.C1606f;
import com.google.android.finsky.bg.C1611k;
import com.google.android.finsky.bg.C1612l;
import com.google.android.finsky.bg.C1615o;
import com.google.android.finsky.bh.C1627b;
import com.google.android.finsky.billing.acquire.C1664i;
import com.google.android.finsky.billing.acquire.C1683a;
import com.google.android.finsky.billing.acquire.C1692h;
import com.google.android.finsky.billing.acquire.p152a.C1667b;
import com.google.android.finsky.billing.acquire.p152a.C1668c;
import com.google.android.finsky.billing.acquire.p152a.C1676i;
import com.google.android.finsky.billing.acquire.p152a.C1678k;
import com.google.android.finsky.billing.changesubscriptionprice.C1787b;
import com.google.android.finsky.billing.changesubscriptionprice.ChangeSubscriptionPriceActivity;
import com.google.android.finsky.billing.common.C1647h;
import com.google.android.finsky.billing.common.C1790e;
import com.google.android.finsky.billing.common.C1792g;
import com.google.android.finsky.billing.common.C1793i;
import com.google.android.finsky.billing.common.C1797m;
import com.google.android.finsky.billing.common.C1801q;
import com.google.android.finsky.billing.common.C1803u;
import com.google.android.finsky.billing.gifting.C1836b;
import com.google.android.finsky.billing.gifting.C1841f;
import com.google.android.finsky.billing.gifting.PlayCreditGiftingHeader;
import com.google.android.finsky.billing.gifting.PlayCreditGiftingRow;
import com.google.android.finsky.billing.iab.C1849e;
import com.google.android.finsky.billing.iab.C1865u;
import com.google.android.finsky.billing.iab.C1867w;
import com.google.android.finsky.billing.iab.C1869y;
import com.google.android.finsky.billing.iab.FirstPartyInAppBillingService;
import com.google.android.finsky.billing.iab.InAppBillingService;
import com.google.android.finsky.billing.legacyauth.AuthState;
import com.google.android.finsky.billing.legacyauth.C1874a;
import com.google.android.finsky.billing.legacyauth.C1880f;
import com.google.android.finsky.billing.myaccount.C1996a;
import com.google.android.finsky.billing.myaccount.C2007h;
import com.google.android.finsky.billing.myaccount.C2010k;
import com.google.android.finsky.billing.myaccount.C2028q;
import com.google.android.finsky.billing.myaccount.C2032v;
import com.google.android.finsky.billing.myaccount.CancelSubscriptionActivity;
import com.google.android.finsky.billing.myaccount.ManageSubscriptionActivity;
import com.google.android.finsky.billing.myaccount.ReactivateSubscriptionActivity;
import com.google.android.finsky.billing.myaccount.ad;
import com.google.android.finsky.billing.myaccount.af;
import com.google.android.finsky.billing.myaccount.an;
import com.google.android.finsky.billing.myaccount.bm;
import com.google.android.finsky.billing.myaccount.bo;
import com.google.android.finsky.billing.myaccount.br;
import com.google.android.finsky.billing.myaccount.bu;
import com.google.android.finsky.billing.myaccount.layout.AccountPaymentMethodsActionRowView;
import com.google.android.finsky.billing.myaccount.layout.AccountPaymentMethodsCreatableInstrumentRowView;
import com.google.android.finsky.billing.myaccount.layout.AccountPaymentMethodsExistingInstrumentRowView;
import com.google.android.finsky.billing.myaccount.layout.OrderHistoryRowView;
import com.google.android.finsky.billing.myaccount.layout.SubscriptionRowView;
import com.google.android.finsky.billing.p120d.C1805b;
import com.google.android.finsky.billing.p130b.C1764f;
import com.google.android.finsky.billing.p130b.C1767g;
import com.google.android.finsky.billing.p130b.C1774n;
import com.google.android.finsky.billing.p131e.C1821j;
import com.google.android.finsky.billing.p131e.C1822k;
import com.google.android.finsky.billing.p151a.C1655h;
import com.google.android.finsky.billing.payments.C1462a;
import com.google.android.finsky.billing.payments.C2040c;
import com.google.android.finsky.billing.payments.C2041d;
import com.google.android.finsky.billing.payments.SetupWizardInstrumentManagerActivity;
import com.google.android.finsky.billing.payments.p164a.C2042a;
import com.google.android.finsky.billing.profile.BillingProfileActivity;
import com.google.android.finsky.billing.profile.C2046a;
import com.google.android.finsky.billing.profile.C2048c;
import com.google.android.finsky.billing.profile.C2056m;
import com.google.android.finsky.billing.profile.CatchAbandonmentActivity;
import com.google.android.finsky.billing.updatesubscriptioninstrument.C2099b;
import com.google.android.finsky.billing.updatesubscriptioninstrument.C2100c;
import com.google.android.finsky.billing.updatesubscriptioninstrument.UpdateSubscriptionInstrumentActivity;
import com.google.android.finsky.bj.C2104b;
import com.google.android.finsky.bl.C2116a;
import com.google.android.finsky.bn.C2127b;
import com.google.android.finsky.boothandler.BootCompletedReceiver;
import com.google.android.finsky.br.C2162a;
import com.google.android.finsky.br.C2171b;
import com.google.android.finsky.by.C2199l;
import com.google.android.finsky.by.C2206c;
import com.google.android.finsky.by.C2233o;
import com.google.android.finsky.by.p132a.C2219r;
import com.google.android.finsky.bz.C2236c;
import com.google.android.finsky.ce.C2266a;
import com.google.android.finsky.cf.C2273c;
import com.google.android.finsky.cg.C2274a;
import com.google.android.finsky.cg.C2277d;
import com.google.android.finsky.cg.C2278e;
import com.google.android.finsky.ci.C2282a;
import com.google.android.finsky.cm.C2296c;
import com.google.android.finsky.cn.C2320a;
import com.google.android.finsky.contentfilterui.C2339e;
import com.google.android.finsky.contentfilterui.C2346j;
import com.google.android.finsky.contentfilterui.C2353q;
import com.google.android.finsky.contentfilterui.ContentFilterChoiceItemView;
import com.google.android.finsky.contentfilterui.ContentFilterLineView;
import com.google.android.finsky.contentfilterui.ContentFiltersService;
import com.google.android.finsky.contentfilterui.PinEntryDialog;
import com.google.android.finsky.cs.C2407c;
import com.google.android.finsky.cs.C2408d;
import com.google.android.finsky.cs.C2410g;
import com.google.android.finsky.cs.C2411h;
import com.google.android.finsky.cs.p135a.C2377c;
import com.google.android.finsky.cs.p135a.C2397b;
import com.google.android.finsky.cs.p135a.C2398f;
import com.google.android.finsky.cs.p135a.C2399g;
import com.google.android.finsky.cs.p135a.C2402j;
import com.google.android.finsky.cs.p135a.C2405p;
import com.google.android.finsky.cs.p135a.p136a.C2379d;
import com.google.android.finsky.cs.p135a.p136a.C2380e;
import com.google.android.finsky.cs.p135a.p136a.C2381f;
import com.google.android.finsky.cs.p135a.p136a.C2383h;
import com.google.android.finsky.cs.p135a.p136a.C2395s;
import com.google.android.finsky.ct.C2412a;
import com.google.android.finsky.cx.C2460b;
import com.google.android.finsky.da.C2498a;
import com.google.android.finsky.datasync.BrowseDataSyncService;
import com.google.android.finsky.datasync.BrowseDataSyncTaskService;
import com.google.android.finsky.datasync.C2504r;
import com.google.android.finsky.datasync.C2514a;
import com.google.android.finsky.datasync.C2531s;
import com.google.android.finsky.datasync.C2532u;
import com.google.android.finsky.datasync.C2534x;
import com.google.android.finsky.datasync.C2535y;
import com.google.android.finsky.datasync.C2536z;
import com.google.android.finsky.datasync.CacheAndSyncJitterSchedulingService;
import com.google.android.finsky.datasync.CacheAndSyncTaskService;
import com.google.android.finsky.datasync.p180a.C2505b;
import com.google.android.finsky.datasync.p180a.C2506c;
import com.google.android.finsky.dc.C1465m;
import com.google.android.finsky.de.C2568a;
import com.google.android.finsky.detailscomponents.C2577b;
import com.google.android.finsky.detailscomponents.C2578c;
import com.google.android.finsky.detailscomponents.C2581g;
import com.google.android.finsky.detailscomponents.DocImageView;
import com.google.android.finsky.detailscomponents.HeroGraphicView;
import com.google.android.finsky.detailscomponents.ScreenshotsRecyclerView;
import com.google.android.finsky.detailsmodules.modules.secondaryactions.C2605b;
import com.google.android.finsky.detailsmodules.modules.subscriptions.C2612c;
import com.google.android.finsky.detailspage.CardClusterModuleLayoutV2;
import com.google.android.finsky.detailspage.CreatorAvatarCardClusterModuleLayout;
import com.google.android.finsky.detailspage.ScreenshotsModuleLayout;
import com.google.android.finsky.detailspage.ScreenshotsModuleLayoutV2;
import com.google.android.finsky.detailspage.aq;
import com.google.android.finsky.detailspage.be;
import com.google.android.finsky.detailspage.bf;
import com.google.android.finsky.deviceconfig.C2691a;
import com.google.android.finsky.deviceconfig.C2693e;
import com.google.android.finsky.deviceconfig.C2700m;
import com.google.android.finsky.deviceconfig.C2701n;
import com.google.android.finsky.deviceconfig.C2703p;
import com.google.android.finsky.deviceconfig.C2704q;
import com.google.android.finsky.deviceconfig.C2705r;
import com.google.android.finsky.deviceconfig.RemoveAssetReceiver;
import com.google.android.finsky.deviceconfig.ServerNotificationReceiver;
import com.google.android.finsky.df.C2710a;
import com.google.android.finsky.dfemodel.C2721l;
import com.google.android.finsky.dg.C2734a;
import com.google.android.finsky.di.C2748d;
import com.google.android.finsky.di.C2753i;
import com.google.android.finsky.di.C2755k;
import com.google.android.finsky.di.C2757m;
import com.google.android.finsky.dialogbuilder.C2798j;
import com.google.android.finsky.dialogbuilder.C2819r;
import com.google.android.finsky.dialogbuilder.C2822u;
import com.google.android.finsky.dialogbuilder.p137a.C2759a;
import com.google.android.finsky.dialogbuilder.p137a.C2762c;
import com.google.android.finsky.dialogbuilder.p137a.C2763d;
import com.google.android.finsky.dialogbuilder.p137a.C2767g;
import com.google.android.finsky.dialogbuilder.p137a.C2770i;
import com.google.android.finsky.dialogbuilder.p137a.C2771j;
import com.google.android.finsky.dialogbuilder.p137a.C2773o;
import com.google.android.finsky.dialogbuilder.p137a.C2775q;
import com.google.android.finsky.dialogbuilder.p137a.C2776r;
import com.google.android.finsky.dialogbuilder.p137a.C2777s;
import com.google.android.finsky.dialogbuilder.p137a.C2779u;
import com.google.android.finsky.dialogbuilder.p137a.C2783x;
import com.google.android.finsky.dialogbuilder.p137a.C2785z;
import com.google.android.finsky.dialogbuilder.p137a.aa;
import com.google.android.finsky.dk.C2824a;
import com.google.android.finsky.dk.C2830g;
import com.google.android.finsky.download.C2838a;
import com.google.android.finsky.dp.C2866c;
import com.google.android.finsky.dw.C2909c;
import com.google.android.finsky.dx.C2910a;
import com.google.android.finsky.dy.ag;
import com.google.android.finsky.ea.C2965g;
import com.google.android.finsky.ea.C2966h;
import com.google.android.finsky.eb.C2967b;
import com.google.android.finsky.ee.C2974a;
import com.google.android.finsky.entertainment.PEFinskyStoryActivity;
import com.google.android.finsky.externalreferrer.C3009a;
import com.google.android.finsky.externalreferrer.C3011c;
import com.google.android.finsky.externalreferrer.ExternalReferrerService;
import com.google.android.finsky.externalreferrer.GetInstallReferrerService;
import com.google.android.finsky.fastscroll.C3115l;
import com.google.android.finsky.fastscroll.C3116m;
import com.google.android.finsky.fastscroll.ScrubberView;
import com.google.android.finsky.flushlogs.C3129a;
import com.google.android.finsky.flushlogs.C3131d;
import com.google.android.finsky.flushlogs.FlushLogsReceiver.FlushLogsService;
import com.google.android.finsky.foregroundcoordinator.ForegroundCoordinator;
import com.google.android.finsky.foregroundcoordinator.ForegroundCoordinator.ForegroundCoordinatorService;
import com.google.android.finsky.frameworkviews.ClusterHeaderView;
import com.google.android.finsky.frameworkviews.PlayActionButtonV2;
import com.google.android.finsky.frameworkviews.ThumbnailImageView;
import com.google.android.finsky.headerlistlayout.FinskyHeaderListLayout;
import com.google.android.finsky.headerlistlayout.FinskyTabStrip;
import com.google.android.finsky.headerlistlayout.FinskyTabTextView;
import com.google.android.finsky.heterodyne.C3170c;
import com.google.android.finsky.heterodyne.C3171d;
import com.google.android.finsky.heterodyne.C3172f;
import com.google.android.finsky.heterodyne.HeterodyneSyncService;
import com.google.android.finsky.hygiene.C0971t;
import com.google.android.finsky.hygiene.C3178v;
import com.google.android.finsky.hygiene.p139a.C3179d;
import com.google.android.finsky.hygiene.p139a.C3185j;
import com.google.android.finsky.hygiene.p139a.C3186k;
import com.google.android.finsky.hygiene.p139a.C3189n;
import com.google.android.finsky.installapi.C3270d;
import com.google.android.finsky.installapi.C3271e;
import com.google.android.finsky.installapi.PlayInstallService;
import com.google.android.finsky.installer.C3300k;
import com.google.android.finsky.installqueue.C3340g;
import com.google.android.finsky.installqueue.p141a.C3339i;
import com.google.android.finsky.instantapps.metrics.C3533f;
import com.google.android.finsky.instantapps.metrics.C3534g;
import com.google.android.finsky.instantapps.p220f.C3491p;
import com.google.android.finsky.instantapps.p220f.C3492q;
import com.google.android.finsky.instantappsquickinstall.C3609g;
import com.google.android.finsky.instantappsquickinstall.C3615o;
import com.google.android.finsky.instantappsquickinstall.InstantAppsInstallDialogActivity;
import com.google.android.finsky.instantappsquickinstall.InstantAppsInstallEntryActivity;
import com.google.android.finsky.instantappstossupport.C3619a;
import com.google.android.finsky.instantappstossupport.OptInStateChangedReceiver;
import com.google.android.finsky.layout.EditorialHeroSpacerView;
import com.google.android.finsky.layout.actionbar.FinskySearchToolbar;
import com.google.android.finsky.layout.play.FinskyDrawerLayout;
import com.google.android.finsky.layoutswitcher.C3166e;
import com.google.android.finsky.layoutswitcher.C3736d;
import com.google.android.finsky.layoutswitcher.ErrorIndicatorWithNotifyLayout;
import com.google.android.finsky.nestedrecyclerviews.NestedChildRecyclerView;
import com.google.android.finsky.nestedrecyclerviews.NestedParentRecyclerView;
import com.google.android.finsky.nestedrecyclerviews.p115a.C3766c;
import com.google.android.finsky.nestedrecyclerviews.p115a.C3768e;
import com.google.android.finsky.notification.C3779c;
import com.google.android.finsky.notification.C3780d;
import com.google.android.finsky.notification.C3784h;
import com.google.android.finsky.notification.C3800x;
import com.google.android.finsky.notification.C3813k;
import com.google.android.finsky.notification.C3815n;
import com.google.android.finsky.notification.C3817p;
import com.google.android.finsky.notification.C3819s;
import com.google.android.finsky.notification.impl.C3788c;
import com.google.android.finsky.notification.impl.C3790e;
import com.google.android.finsky.notification.impl.C3791f;
import com.google.android.finsky.notification.impl.C3794i;
import com.google.android.finsky.notification.impl.C3796k;
import com.google.android.finsky.notification.impl.C3797l;
import com.google.android.finsky.notification.impl.C3799n;
import com.google.android.finsky.notification.impl.C3802q;
import com.google.android.finsky.notification.impl.C3803r;
import com.google.android.finsky.notification.impl.ae;
import com.google.android.finsky.notification.impl.at;
import com.google.android.finsky.notification.impl.av;
import com.google.android.finsky.notification.impl.aw;
import com.google.android.finsky.notification.impl.ay;
import com.google.android.finsky.notification.impl.ba;
import com.google.android.finsky.notificationsettings.NotificationsSettingsActivity;
import com.google.android.finsky.p107l.C3646a;
import com.google.android.finsky.p107l.C3648c;
import com.google.android.finsky.p108z.C4817d;
import com.google.android.finsky.p110p.C3837c;
import com.google.android.finsky.p111d.C1463g;
import com.google.android.finsky.p111d.C1464x;
import com.google.android.finsky.p111d.C2471a;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.C2487n;
import com.google.android.finsky.p111d.C2489q;
import com.google.android.finsky.p111d.C2491s;
import com.google.android.finsky.p111d.C2492t;
import com.google.android.finsky.p111d.C2493u;
import com.google.android.finsky.p111d.C2494v;
import com.google.android.finsky.p111d.ab;
import com.google.android.finsky.p111d.ac;
import com.google.android.finsky.p113v.C4695b;
import com.google.android.finsky.p133c.p134a.C2244a;
import com.google.android.finsky.p138h.C3156a;
import com.google.android.finsky.p140i.C3216c;
import com.google.android.finsky.p140i.C3219f;
import com.google.android.finsky.p142j.C3624j;
import com.google.android.finsky.p167r.C3960a;
import com.google.android.finsky.p198f.C3027b;
import com.google.android.finsky.p225k.C3640a;
import com.google.android.finsky.p226m.C3741b;
import com.google.android.finsky.p230q.C3949b;
import com.google.android.finsky.packagemanager.C3849a;
import com.google.android.finsky.packagemanager.C3851f;
import com.google.android.finsky.packagemanager.impl.PackageMonitorReceiverImpl.RegisteredReceiver;
import com.google.android.finsky.pagesystem.C1045b;
import com.google.android.finsky.pagesystem.C2334a;
import com.google.android.finsky.playcard.AutoTransitionImageView;
import com.google.android.finsky.playcard.C3893r;
import com.google.android.finsky.playcard.C3895x;
import com.google.android.finsky.playcard.C3903c;
import com.google.android.finsky.playcard.FlatCardViewDoubleWideAd;
import com.google.android.finsky.playcard.FlatCardViewMini;
import com.google.android.finsky.playcard.FlatCardViewReEngagement;
import com.google.android.finsky.playcard.FlatCardViewScreenshot;
import com.google.android.finsky.playcard.FlatFeaturedCardView;
import com.google.android.finsky.playcard.FlatFeaturedWideCardView;
import com.google.android.finsky.playcard.PlayCardJpkrEditorialView;
import com.google.android.finsky.playcard.PlayCardMoviesMdpView;
import com.google.android.finsky.playcard.PlayCardViewAvatar;
import com.google.android.finsky.playcard.PlayCardViewListingSmall;
import com.google.android.finsky.playcard.PlayCardViewMyAppsV2;
import com.google.android.finsky.playcard.PlayCardViewRate;
import com.google.android.finsky.playcard.ao;
import com.google.android.finsky.playpass.C3923a;
import com.google.android.finsky.playpass.PlayPassHeaderView;
import com.google.android.finsky.preregistration.C3928a;
import com.google.android.finsky.preregistration.C3930c;
import com.google.android.finsky.preregistration.C3934g;
import com.google.android.finsky.preregistration.PreregistrationDialogView;
import com.google.android.finsky.providers.C1467c;
import com.google.android.finsky.ratereview.C3964c;
import com.google.android.finsky.ratereview.PublicReviewsActivity;
import com.google.android.finsky.recoverymode.C3982a;
import com.google.android.finsky.safemode.SafeModeService;
import com.google.android.finsky.scheduler.AlarmEngineService;
import com.google.android.finsky.scheduler.C4042t;
import com.google.android.finsky.scheduler.C4048z;
import com.google.android.finsky.scheduler.FirebaseJobDispatcherEngine.FirebaseJobDispatcherService;
import com.google.android.finsky.scheduler.JobSchedulerEngine.PhoneskyJobSchedulerJobService;
import com.google.android.finsky.scheduler.ak;
import com.google.android.finsky.scheduler.bb;
import com.google.android.finsky.scheduler.bj;
import com.google.android.finsky.scheduler.bk;
import com.google.android.finsky.screenshotsactivity.ScreenshotView;
import com.google.android.finsky.screenshotsactivity.ScreenshotsActivityV2;
import com.google.android.finsky.settings.C4092a;
import com.google.android.finsky.settings.C4102l;
import com.google.android.finsky.settings.ExternalSettingsActivity;
import com.google.android.finsky.settings.GaiaAuthActivity;
import com.google.android.finsky.settings.SettingsActivity;
import com.google.android.finsky.setup.C4141c;
import com.google.android.finsky.setup.C4175h;
import com.google.android.finsky.setup.RestoreServiceV2;
import com.google.android.finsky.setup.VpaService;
import com.google.android.finsky.setup.al;
import com.google.android.finsky.setup.bn;
import com.google.android.finsky.setup.bs;
import com.google.android.finsky.setup.p242d.C4168h;
import com.google.android.finsky.simhandler.SimStateReceiver;
import com.google.android.finsky.splitinstallservice.C4202e;
import com.google.android.finsky.splitinstallservice.C4210n;
import com.google.android.finsky.splitinstallservice.C4212p;
import com.google.android.finsky.splitinstallservice.SplitInstallService;
import com.google.android.finsky.splitinstallservice.ap;
import com.google.android.finsky.splitinstallservice.az;
import com.google.android.finsky.stream.base.C4254d;
import com.google.android.finsky.stream.base.C4279n;
import com.google.android.finsky.stream.base.horizontalclusters.view.HorizontalClusterRecyclerView;
import com.google.android.finsky.stream.base.p143a.p144a.C4245a;
import com.google.android.finsky.stream.base.p143a.p144a.C4248d;
import com.google.android.finsky.stream.base.playcluster.C2628h;
import com.google.android.finsky.stream.base.playcluster.PlayCardClusterViewContent;
import com.google.android.finsky.stream.base.playcluster.PlayCardClusterViewHeader;
import com.google.android.finsky.stream.base.playcluster.PlayClusterViewContentV2;
import com.google.android.finsky.stream.base.view.FlatCardClusterView;
import com.google.android.finsky.stream.base.view.FlatCardClusterViewHeader;
import com.google.android.finsky.stream.controllers.collectionassistcard.view.CollectionAssistCardView;
import com.google.android.finsky.stream.controllers.comboassistcard.view.ComboAssistCardView;
import com.google.android.finsky.stream.controllers.compactassistcard.view.CompactAssistCardView;
import com.google.android.finsky.stream.controllers.contentassistcard.view.ContentAssistCardView;
import com.google.android.finsky.stream.controllers.ctaassistcard.view.CtaAssistCardView;
import com.google.android.finsky.stream.controllers.dataassistcard.view.DataAssistCardView;
import com.google.android.finsky.stream.controllers.editorschoice.view.EditorsChoiceV2CardView;
import com.google.android.finsky.stream.controllers.emptycluster.view.EmptyClusterView;
import com.google.android.finsky.stream.controllers.floatinghighlights.view.C4396h;
import com.google.android.finsky.stream.controllers.floatinghighlights.view.FloatingHighlightsBannerClusterView;
import com.google.android.finsky.stream.controllers.genericcluster.view.FlatGenericClusterView;
import com.google.android.finsky.stream.controllers.illustrationassistcard.view.IllustrationAssistCardView;
import com.google.android.finsky.stream.controllers.inlinetopcharts.view.InlineTopChartsClusterContentView;
import com.google.android.finsky.stream.controllers.jpkrquicklinks.view.JpkrQuickLinksBannerItem;
import com.google.android.finsky.stream.controllers.jpkrquicklinks.view.JpkrQuickLinksRecyclerView;
import com.google.android.finsky.stream.controllers.merchbanner.view.FlatMerchBannerView;
import com.google.android.finsky.stream.controllers.minicategories.view.MiniCategoriesCard;
import com.google.android.finsky.stream.controllers.minicategories.view.MiniCategoriesClusterView;
import com.google.android.finsky.stream.controllers.musicmerchbanner.view.MusicMerchBannerView;
import com.google.android.finsky.stream.controllers.notification.C4462b;
import com.google.android.finsky.stream.controllers.notification.view.NotificationCardRowView;
import com.google.android.finsky.stream.controllers.p145d.C4367a;
import com.google.android.finsky.stream.controllers.paddedcollection.view.PaddedCollectionRowLayout;
import com.google.android.finsky.stream.controllers.quicklinks.view.QuickLinksBannerItemPillView;
import com.google.android.finsky.stream.controllers.searchlistresults.view.SearchListResultsOutlinedRowLayout;
import com.google.android.finsky.stream.controllers.taglinks.view.TagLinksBannerRecyclerView;
import com.google.android.finsky.stream.controllers.view.FlatCardCreatorAvatarClusterView;
import com.google.android.finsky.stream.controllers.view.FlatCardMerchClusterView;
import com.google.android.finsky.stream.controllers.view.FlatCardScreenshotClusterViewV2;
import com.google.android.finsky.stream.controllers.view.JpkrFlatDealsAndPromosBannerItemView;
import com.google.android.finsky.stream.controllers.view.JpkrFlatMiniTopChartsClusterView;
import com.google.android.finsky.stream.controllers.view.JpkrHighlightsBannerClusterView;
import com.google.android.finsky.stream.controllers.view.JpkrHighlightsBannerItemView;
import com.google.android.finsky.stream.controllers.view.JpkrRecommendedCategoriesItem;
import com.google.android.finsky.stream.controllers.view.PlayCardMerchClusterViewV2;
import com.google.android.finsky.stream.controllers.view.PlayCardRateAndSuggestClusterView;
import com.google.android.finsky.stream.controllers.warmwelcome.view.WarmWelcomeCard;
import com.google.android.finsky.stream.controllers.warmwelcome.view.WarmWelcomeCardButton;
import com.google.android.finsky.stream.controllers.warmwelcomev3.view.WarmWelcomeV3ClusterView;
import com.google.android.finsky.stream.myapps.view.C4556b;
import com.google.android.finsky.stream.myapps.view.C4557c;
import com.google.android.finsky.stream.p248a.C4238h;
import com.google.android.finsky.tos.C4569e;
import com.google.android.finsky.tos.TosAckedReceiver;
import com.google.android.finsky.tos.TosActivity;
import com.google.android.finsky.unauthenticated.C4574a;
import com.google.android.finsky.unauthenticated.C4579g;
import com.google.android.finsky.unauthenticated.UnauthenticatedMainActivity;
import com.google.android.finsky.updatechecker.C4640d;
import com.google.android.finsky.updatechecker.impl.C4654m;
import com.google.android.finsky.updatechecker.impl.C4659r;
import com.google.android.finsky.updatechecker.impl.C4661t;
import com.google.android.finsky.updatechecker.impl.C4663v;
import com.google.android.finsky.updatechecker.impl.ReschedulerUsingAlarmManager.CheckWifiAndAutoUpdate;
import com.google.android.finsky.updatechecker.impl.ReschedulerUsingJobScheduler.CheckPreconditionsAndAutoUpdateJobService;
import com.google.android.finsky.utils.C4674e;
import com.google.android.finsky.utils.C4676g;
import com.google.android.finsky.utils.C4683n;
import com.google.android.finsky.utils.ai;
import com.google.android.finsky.verifier.C4726d;
import com.google.android.finsky.verifier.impl.C4752d;
import com.google.android.finsky.verifier.impl.C4756h;
import com.google.android.finsky.verifier.impl.C4767t;
import com.google.android.finsky.verifier.impl.C4769v;
import com.google.android.finsky.verifier.impl.ConsentDialog;
import com.google.android.finsky.verifier.impl.PackageVerificationApiService;
import com.google.android.finsky.verifier.impl.PackageVerificationReceiver;
import com.google.android.finsky.verifier.impl.PackageVerificationService;
import com.google.android.finsky.verifier.impl.PackageWarningDialog;
import com.google.android.finsky.verifier.impl.PlayProtectHomeActivity;
import com.google.android.finsky.verifier.impl.VerifyInstalledPackagesReceiver;
import com.google.android.finsky.verifier.impl.ar;
import com.google.android.finsky.verifier.impl.bg;
import com.google.android.finsky.verifier.impl.bw;
import com.google.android.finsky.verifier.impl.bx;
import com.google.android.finsky.verifier.impl.de;
import com.google.android.finsky.verifier.impl.di;
import com.google.android.finsky.verifier.impl.dk;
import com.google.android.finsky.verifier.impl.eb;
import com.google.android.finsky.verifier.impl.p262a.C4731c;
import com.google.android.finsky.volley.C4774e;
import com.google.android.finsky.volley.ClearCacheReceiver;
import com.google.android.finsky.zapp.PlayModuleService;
import com.google.android.gms.instantapps.C5260a;
import com.google.android.gms.instantapps.C5263b;
import com.google.android.play.dfe.api.C1460g;
import com.google.android.play.image.C1294w;
import java.util.Map;
import java.util.concurrent.Executor;
import p000c.p001a.C0000a;
import p002a.p003a.C0003b;
import p002a.p003a.C0004c;
import p002a.p003a.C0005d;

public final class C1453a implements C1452c {
    public C0000a f7846A;
    public C0000a f7847B;
    public C0000a f7848C;
    public C0000a f7849D;
    public C0000a f7850E;
    public C0000a f7851F;
    public C0000a f7852G;
    public C0000a f7853H;
    public C0000a f7854I;
    public C0000a f7855J;
    public C0000a f7856K;
    public C0000a f7857L;
    public C0000a f7858M;
    public C0000a f7859N;
    public C0000a f7860O;
    public C0000a f7861P;
    public C0000a f7862Q;
    public C0000a f7863R;
    public C0000a f7864S;
    public C0000a f7865T;
    public C0000a f7866U;
    public C0000a f7867V;
    public C0000a f7868W;
    public C0000a f7869X;
    public C0000a f7870Y;
    public C0000a f7871Z;
    public dn f7872a;
    public C0000a aA;
    public C0000a aB;
    public C0000a aC;
    public C0000a aD;
    public C0000a aE;
    public C0000a aF;
    public C0000a aG;
    public C0000a aH;
    public C0000a aI;
    public C0000a aJ;
    public C0000a aK;
    public C0000a aL;
    public C0000a aM;
    public C0000a aN;
    public C0000a aO;
    public C0000a aP;
    public C0000a aQ;
    public C0000a aR;
    public C0000a aS;
    public C0000a aT;
    public C0000a aU;
    public C0000a aV;
    public C0000a aW;
    public C0000a aX;
    public C0000a aY;
    public C0000a aZ;
    public C0000a aa;
    public C0000a ab;
    public C0000a ac;
    public C0000a ad;
    public C0000a ae;
    public C0000a af;
    public C0000a ag;
    public C0000a ah;
    public C0000a ai;
    public C0000a aj;
    public C0000a ak;
    public C0000a al;
    public C0000a am;
    public C0000a an;
    public C0000a ao;
    public C0000a ap;
    public C0000a aq;
    public C0000a ar;
    public C0000a as;
    public C0000a at;
    public C0000a au;
    public C0000a av;
    public C0000a aw;
    public C0000a ax;
    public C0000a ay;
    public C0000a az;
    public C0000a f7873b;
    public C0000a bA;
    public C0000a bB;
    public C0000a bC;
    public C0000a bD;
    public C0000a bE;
    public C0000a bF;
    public C0000a bG;
    public C0000a bH;
    public C0000a bI;
    public C0000a bJ;
    public C0000a bK;
    public C0000a bL;
    public C0000a bM;
    public C0000a bN;
    public C0000a bO;
    public C0000a bP;
    public C0000a bQ;
    public C0000a bR;
    public C0000a bS;
    public C0000a bT;
    public C0000a bU;
    public C0000a bV;
    public C0000a bW;
    public C0000a bX;
    public C0000a bY;
    public C0000a bZ;
    public C0000a ba;
    public C0000a bb;
    public C0000a bc;
    public C0000a bd;
    public C0000a be;
    public C0000a bf;
    public C0000a bg;
    public C0000a bh;
    public C0000a bi;
    public C0000a bj;
    public C0000a bk;
    public C0000a bl;
    public C0000a bm;
    public C0000a bn;
    public C0000a bo;
    public C0000a bp;
    public C0000a bq;
    public C0000a br;
    public C0000a bs;
    public C0000a bt;
    public C0000a bu;
    public C0000a bv;
    public C0000a bw;
    public C0000a bx;
    public C0000a by;
    public C0000a bz;
    public C0000a f7874c;
    public C0000a ca;
    public C0000a cb;
    public C0000a cc;
    public C0000a cd;
    public C0000a f7875d;
    public C0000a f7876e;
    public C0000a f7877f;
    public C0000a f7878g;
    public C0000a f7879h;
    public C0000a f7880i = C0003b.m3a(new ac(this.f7874c, this.f7875d, this.f7876e, this.f7877f, this.f7878g, this.f7879h));
    public C0000a f7881j;
    public C0000a f7882k;
    public C0000a f7883l;
    public C0000a f7884m;
    public C0000a f7885n;
    public C0000a f7886o;
    public C0000a f7887p;
    public C0000a f7888q;
    public C0000a f7889r;
    public C0000a f7890s;
    public C0000a f7891t;
    public C0000a f7892u;
    public C0000a f7893v;
    public C0000a f7894w;
    public C0000a f7895x;
    public C0000a f7896y;
    public C0000a f7897z;

    C1453a(C1456b c1456b) {
        this.f7872a = c1456b.f7926a;
        this.f7873b = new fy(c1456b.f7926a);
        this.f7874c = new ew(c1456b.f7926a);
        this.f7875d = new dy(c1456b.f7926a);
        this.f7876e = new el(c1456b.f7926a);
        this.f7877f = new en(c1456b.f7926a);
        this.f7878g = new gv(c1456b.f7926a);
        this.f7879h = new du(c1456b.f7926a);
        this.f7881j = new ev(c1456b.f7926a, this.f7874c);
        this.f7882k = C0003b.m3a(new C2494v(this.f7881j, this.f7874c));
        this.f7883l = C0003b.m3a(C2491s.f13416a);
        this.f7884m = new ep(c1456b.f7926a);
        this.f7885n = new gr(c1456b.f7926a);
        this.f7886o = new gu(c1456b.f7926a);
        this.f7887p = new eu(c1456b.f7926a);
        this.f7888q = new eq(c1456b.f7926a);
        this.f7889r = C0003b.m3a(new ct(this.f7885n, this.f7886o, this.f7887p, this.f7888q));
        this.f7890s = new fn(c1456b.f7926a);
        this.f7891t = C0003b.m3a(new C1322d());
        this.f7892u = new dx(c1456b.f7926a);
        this.f7893v = new fx(c1456b.f7926a);
        this.f7894w = C0003b.m3a(C1329k.f7823a);
        this.f7895x = C0003b.m3a(new C1336r(this.f7893v, this.f7894w));
        this.f7896y = C0003b.m3a(new C1325g(this.f7892u));
        this.f7897z = C0003b.m3a(new C1339u(this.f7894w, this.f7896y));
        this.f7846A = C0003b.m3a(new C1324f());
        this.f7847B = new gb(c1456b.f7926a);
        this.f7848C = new ea(c1456b.f7926a);
        this.f7849D = C0003b.m3a(new C1326h(this.f7892u));
        this.f7850E = C0003b.m3a(new C1323e(this.f7892u));
        this.f7851F = C0003b.m3a(C1306d.f7753a);
        this.f7852G = C0003b.m3a(new C1304b(this.f7849D, this.f7850E, this.f7851F));
        this.f7853H = C0003b.m3a(new C1318j(this.f7892u, this.f7895x, this.f7897z, this.f7893v, this.f7846A, this.f7847B, this.f7848C, this.f7852G));
        this.f7854I = C0003b.m3a(new C1334p(this.f7896y));
        this.f7855J = C0003b.m3a(C1341w.f7844a);
        this.f7856K = C0003b.m3a(C1692h.f8745a);
        this.f7857L = new ez(c1456b.f7926a);
        this.f7858M = new C2822u(this.f7848C);
        this.f7859N = C0003b.m3a(new C2819r(this.f7848C, this.f7857L, this.f7858M));
        this.f7860O = new eb(c1456b.f7926a);
        this.f7861P = new fp(c1456b.f7926a);
        this.f7862Q = new fj(c1456b.f7926a);
        this.f7863R = new dw(c1456b.f7926a);
        this.f7864S = new fb(c1456b.f7926a);
        this.f7865T = new gt(c1456b.f7926a);
        this.f7866U = new em(c1456b.f7926a);
        this.f7867V = new dz(c1456b.f7926a);
        this.f7868W = C0003b.m3a(new C4663v(this.f7892u, this.f7861P, this.f7862Q, this.f7863R, this.f7864S, this.f7865T, this.f7866U, this.f7867V));
        this.f7869X = C0003b.m3a(C4557c.f23300a);
        this.f7870Y = new ec(c1456b.f7926a);
        this.f7871Z = new ey(c1456b.f7926a);
        this.aa = new gd(c1456b.f7926a);
        this.ab = new gs();
        this.ac = C0003b.m3a(new C2506c(this.f7860O, this.f7870Y, this.f7847B, this.f7874c, this.f7871Z, this.aa, this.ab, this.f7886o));
        this.ad = C0003b.m3a(C4676g.f24058a);
        C1236b c1236b = new C1236b(this.f7892u);
        this.ae = new dq(c1456b.f7926a);
        this.af = new ds(c1456b.f7926a);
        this.ag = new ed(c1456b.f7926a);
        this.ah = new ef(c1456b.f7926a);
        this.ai = new fh(c1456b.f7926a);
        this.aj = new es(c1456b.f7926a);
        this.ak = new fd(c1456b.f7926a);
        this.al = C0003b.m3a(new C2578c(this.ae, this.af, this.ag, this.ah, this.f7887p, this.ai, this.aj, this.ak));
        this.am = new gp(c1456b.f7926a);
        this.an = C0003b.m3a(new C2704q(this.am));
        this.ao = new dv(c1456b.f7926a);
        this.ap = new ex(c1456b.f7926a);
        this.aq = C0003b.m3a(new C3116m(this.f7874c));
        this.ar = C0003b.m3a(C2966h.f15615a);
        this.as = new ga(this.f7892u);
        this.at = new dp(c1456b.f7926a);
        this.au = C0003b.m3a(new C3949b(this.at, this.f7892u));
        this.av = new ek(c1456b.f7926a);
        this.aw = C0003b.m3a(new C3171d(this.as, this.au, this.ae, this.av));
        this.ax = C0003b.m3a(C2408d.f11706a);
        this.ay = C0003b.m3a(C2411h.f11712a);
        this.az = new C2402j(this.f7892u);
        this.aA = C0003b.m3a(new C2399g(this.az));
        this.aB = C0003b.m3a(C2383h.f11662a);
        this.aC = new eg(c1456b.f7926a);
        this.aD = C0003b.m3a(new et(this.f7892u));
        this.aE = C0003b.m3a(new C1224h(this.aC, this.aD));
        this.aF = new ej();
        this.aG = C0003b.m3a(new C2397b(this.aE, this.aF, this.ae));
        this.aH = C0003b.m3a(new C2395s(this.aw, this.af));
        this.aI = new gn(this.ay);
        this.aJ = C0003b.m3a(new C2405p(this.aI));
        this.aK = C0003b.m3a(new C2381f(this.aA, this.aB, this.aG, this.f7892u, this.f7878g, this.as, this.aH, this.ao, this.aJ));
        this.aL = C0003b.m3a(C1615o.f8532a);
        this.aM = C0003b.m3a(new fe(c1456b.f7926a));
        this.aN = new fg();
        this.aO = C0005d.m8a(new C1477do(this.f7892u, this.aN));
        this.aP = new fq(c1456b.f7926a);
        C0003b.m3a(new fo(c1456b.f7926a));
        this.aQ = C0003b.m3a(C3768e.f18959a);
        this.aR = new fv(c1456b.f7926a);
        this.aS = new fi(c1456b.f7926a);
        this.aT = C0003b.m3a(at.f19029a);
        this.aU = new fl(c1456b.f7926a);
        this.aV = C0003b.m3a(new aw(this.aS, this.aT, this.aU, this.at, this.ae));
        this.aW = C0003b.m3a(new av(this.aV));
        this.aX = C0003b.m3a(new ft(this.aW));
        this.aY = C0003b.m3a(new C3815n(this.ae, this.aX));
        this.aZ = C0003b.m3a(new C3802q(this.f7892u, this.ai));
        this.ba = C0003b.m3a(new fs(this.aZ));
        this.bb = C0003b.m3a(new ay(this.f7874c));
        this.bc = C0003b.m3a(new gf(this.bb));
        this.bd = C0003b.m3a(new ae(this.aS));
        this.be = new gc(c1456b.f7926a);
        this.bf = C0003b.m3a(new C3797l(this.be));
        this.bg = C0003b.m3a(new gq(this.f7892u));
        this.bh = new C3799n(this.aa, this.bg);
        this.bi = C0003b.m3a(new C3790e(this.f7892u, this.bd, this.bf, this.bh, this.af));
        this.bj = C0003b.m3a(new C3819s(this.f7892u, this.f7848C));
        this.bk = C0003b.m3a(new ee(this.aW));
        this.bl = C0003b.m3a(new ba(this.f7874c, this.ae, this.at));
        this.bm = C0003b.m3a(new gh(this.bl));
        this.bn = C0003b.m3a(new dr(this.bk, this.bm));
        this.bo = new gy(c1456b.f7926a);
        this.bp = C0003b.m3a(new bk(this.f7874c, C4048z.f20345a, this.bo));
        this.bq = C0003b.m3a(new C1227b(this.f7874c));
        this.br = new fm(c1456b.f7926a);
        this.bs = C0003b.m3a(new C1232f(this.ae, this.af, this.f7892u, this.f7847B, this.br));
        this.bt = C0003b.m3a(new C3609g(C3534g.f17796a));
        this.bu = C0003b.m3a(new er(c1456b.f7926a));
        this.bv = C0003b.m3a(new go(c1456b.f7926a));
        this.bw = C0003b.m3a(new gj(c1456b.f7926a));
        this.bx = C0003b.m3a(new ge(c1456b.f7926a));
        this.by = C0003b.m3a(new fa(c1456b.f7926a));
        this.bz = C0003b.m3a(new fz(c1456b.f7926a));
        this.bA = C0003b.m3a(new gi(c1456b.f7926a));
        this.bB = new dt(c1456b.f7926a);
        this.bC = new C4212p(this.f7874c, this.f7892u);
        this.bD = C0003b.m3a(new az(this.f7892u));
        this.bE = new C4202e(this.f7892u);
        this.bF = new gm(c1456b.f7926a);
        this.bG = new C4210n(this.f7892u, this.f7873b);
        this.bH = new gk(c1456b.f7926a);
        this.bI = new gl(c1456b.f7926a);
        this.bJ = new ap(this.af, this.aM, this.f7873b, this.bB, this.ae, this.f7874c, this.bC, this.bD, this.bE, this.bF, this.bG, this.bH, this.bI, this.f7892u);
        this.bK = C0003b.m3a(C2605b.f13829a);
        this.bL = new fk(c1456b.f7926a);
        this.bM = new ei(c1456b.f7926a);
        this.bN = C0003b.m3a(new C2612c(this.f7892u, this.bM));
        this.bO = new gx(c1456b.f7926a);
        this.bP = C0003b.m3a(new bf(this.ae, this.ah, this.f7847B, this.f7874c, this.bK, this.f7862Q, this.bL, this.bN, this.bO));
        this.bQ = C0003b.m3a(new eh(c1456b.f7926a));
        this.bR = C0003b.m3a(new fr(this.bl));
        this.bS = new ff(c1456b.f7926a);
        this.bT = new eo(c1456b.f7926a);
        this.bU = new fc();
        this.bV = C0003b.m3a(new C3271e(this.f7892u, this.f7847B, this.bS, this.ae, this.f7874c, this.aF, this.af, this.bT, this.bU, this.f7873b));
        this.bW = new fw(c1456b.f7926a);
        this.bX = C0003b.m3a(C2757m.f14999a);
        this.bY = C0003b.m3a(new C2755k(this.f7892u, this.bW, this.bX, this.f7874c, this.aU));
        this.bZ = C0003b.m3a(C2753i.f14993a);
        this.ca = C0003b.m3a(new gg(c1456b.f7926a));
        this.cb = new gw(c1456b.f7926a);
        this.cc = C0003b.m3a(new C2536z(this.f7862Q, this.cb));
        this.cd = C0003b.m3a(new fu(this.bi));
    }

    private final Map m8134k() {
        return (Map) C0004c.m7a(((C2407c) this.ax.mo1a()).f11705a, "Cannot return null from a non-@Nullable @Provides method");
    }

    private final Map m8135l() {
        return (Map) C0004c.m7a(((C2410g) this.ay.mo1a()).f11705a, "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1699a(WishlistPlayActionButton wishlistPlayActionButton) {
        wishlistPlayActionButton.f6234q = (C1503a) C0004c.m7a(this.f7872a.f8046a.mo2036P(), "Cannot return null from a non-@Nullable @Provides method");
        wishlistPlayActionButton.f6235r = (C1461c) C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method");
        wishlistPlayActionButton.f6237a = (C1287h) C0004c.m7a(this.f7872a.f8046a.aK(), "Cannot return null from a non-@Nullable @Provides method");
        wishlistPlayActionButton.f6238b = (C1463g) C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method");
        wishlistPlayActionButton.f6239c = (C0988c) C0004c.m7a(this.f7872a.f8046a.mo2040T(), "Cannot return null from a non-@Nullable @Provides method");
        wishlistPlayActionButton.f6240d = (C2974a) C0004c.m7a(this.f7872a.f8046a.bd(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1698a(AccountsChangedReceiver accountsChangedReceiver) {
        accountsChangedReceiver.f5967a = (C0986a) C0004c.m7a(this.f7872a.f8046a.mo2041U(), "Cannot return null from a non-@Nullable @Provides method");
        accountsChangedReceiver.f5968b = (C0988c) C0004c.m7a(this.f7872a.f8046a.mo2040T(), "Cannot return null from a non-@Nullable @Provides method");
        accountsChangedReceiver.f5969c = (C2471a) C0004c.m7a(this.f7872a.f8046a.aR(), "Cannot return null from a non-@Nullable @Provides method");
        accountsChangedReceiver.f5970d = (C3027b) C0004c.m7a(this.f7872a.f8046a.bt(), "Cannot return null from a non-@Nullable @Provides method");
        accountsChangedReceiver.f5971e = (C3646a) C0004c.m7a(this.f7872a.f8046a.mo2029I(), "Cannot return null from a non-@Nullable @Provides method");
        accountsChangedReceiver.f5972f = (C0977e) C0004c.m7a(this.f7872a.f8046a.cA(), "Cannot return null from a non-@Nullable @Provides method");
        accountsChangedReceiver.f5973g = (C1461c) C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method");
        accountsChangedReceiver.f5974h = (C1467c) C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method");
        accountsChangedReceiver.f5975i = (C3178v) C0004c.m7a(this.f7872a.f8046a.aW(), "Cannot return null from a non-@Nullable @Provides method");
        accountsChangedReceiver.f5976j = (C2206c) C0004c.m7a(this.f7872a.f8046a.ah(), "Cannot return null from a non-@Nullable @Provides method");
        accountsChangedReceiver.f5977k = (C2910a) C0004c.m7a(this.f7872a.f8046a.au(), "Cannot return null from a non-@Nullable @Provides method");
        accountsChangedReceiver.f5978l = (C4774e) C0004c.m7a(this.f7872a.f8046a.bk(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1812a(C2691a c2691a) {
        c2691a.f5953e = (C2471a) C0004c.m7a(this.f7872a.f8046a.aR(), "Cannot return null from a non-@Nullable @Provides method");
        c2691a.f5954f = (C1287h) C0004c.m7a(this.f7872a.f8046a.aK(), "Cannot return null from a non-@Nullable @Provides method");
        c2691a.f14828c = (C1461c) C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1779a(C2244a c2244a) {
        c2244a.f11154a = C0003b.m4b(this.f7873b);
        c2244a.f11155b = (C1463g) C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method");
        c2244a.f11156c = (C1461c) C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1793a(C2482j c2482j) {
        c2482j.f13388n = (ab) this.f7880i.mo1a();
        c2482j.f13389o = this.f7872a.f8046a.mo2023C();
        c2482j.f13390p = (C1500a) C0004c.m7a(this.f7872a.f8046a.mo2033M(), "Cannot return null from a non-@Nullable @Provides method");
        c2482j.f13391q = (C1461c) C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method");
        c2482j.f13392r = (C2493u) this.f7882k.mo1a();
        c2482j.f13393s = (C2489q) this.f7883l.mo1a();
    }

    public final void mo1794a(C2487n c2487n) {
        c2487n.f13406a = (Context) C0004c.m7a(this.f7872a.f8046a.f7981b, "Cannot return null from a non-@Nullable @Provides method");
        c2487n.f13407b = (C1463g) C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1705a(C1251b c1251b) {
        dn dnVar = this.f7872a;
        C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method");
        c1251b.f7423b = dnVar.f8046a.ag();
        c1251b.f7424c = C0003b.m4b(this.f7884m);
        c1251b.f7425d = (C2471a) C0004c.m7a(this.f7872a.f8046a.aR(), "Cannot return null from a non-@Nullable @Provides method");
        c1251b.f7426e = (C2412a) C0004c.m7a(this.f7872a.f8046a.mo2028H(), "Cannot return null from a non-@Nullable @Provides method");
        C0004c.m7a(this.f7872a.f8046a.mo2024D(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1706a(C1256d c1256d) {
        c1256d.f7551B = (cr) this.f7889r.mo1a();
        c1256d.f7552C = (C2320a) C0004c.m7a(this.f7872a.f8046a.mo2032L(), "Cannot return null from a non-@Nullable @Provides method");
        c1256d.f7553D = (C2910a) C0004c.m7a(this.f7872a.f8046a.au(), "Cannot return null from a non-@Nullable @Provides method");
        c1256d.f7554E = (C1461c) C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method");
        c1256d.f7555F = C0003b.m4b(this.f7890s);
        c1256d.f7556G = (Context) C0004c.m7a(this.f7872a.f8046a.f7981b, "Cannot return null from a non-@Nullable @Provides method");
        c1256d.f7557H = (C1289l) C0004c.m7a(this.f7872a.f8046a.aM(), "Cannot return null from a non-@Nullable @Provides method");
        c1256d.f7558I = (C2412a) C0004c.m7a(this.f7872a.f8046a.mo2028H(), "Cannot return null from a non-@Nullable @Provides method");
        c1256d.f7559J = (C2734a) C0004c.m7a(this.f7872a.f8046a.bP(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1707a(AppDiscoveryLaunchActivity appDiscoveryLaunchActivity) {
        appDiscoveryLaunchActivity.f7737a = (C2471a) C0004c.m7a(this.f7872a.f8046a.aR(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1708a(AppDiscoveryService appDiscoveryService) {
        appDiscoveryService.f7739a = (C1461c) C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method");
        appDiscoveryService.f7740b = (Executor) this.f7891t.mo1a();
        appDiscoveryService.f7741c = (C1317i) this.f7853H.mo1a();
        appDiscoveryService.f7742d = (C1333o) this.f7854I.mo1a();
        this.f7855J.mo1a();
        appDiscoveryService.f7743e = (C2471a) C0004c.m7a(this.f7872a.f8046a.aR(), "Cannot return null from a non-@Nullable @Provides method");
        appDiscoveryService.f7744f = (PackageManager) this.f7896y.mo1a();
    }

    public final void mo1846a(C3156a c3156a) {
        c3156a.f5953e = (C2471a) C0004c.m7a(this.f7872a.f8046a.aR(), "Cannot return null from a non-@Nullable @Provides method");
        c3156a.f5954f = (C1287h) C0004c.m7a(this.f7872a.f8046a.aK(), "Cannot return null from a non-@Nullable @Provides method");
        c3156a.f16319a = (C3646a) C0004c.m7a(this.f7872a.f8046a.mo2029I(), "Cannot return null from a non-@Nullable @Provides method");
        c3156a.f16320b = (C1461c) C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1854a(C3216c c3216c) {
        c3216c.f16543b = (C3219f) C0004c.m7a(this.f7872a.f8046a.cc(), "Cannot return null from a non-@Nullable @Provides method");
        C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method");
        c3216c.f16544c = (C1182a) C0004c.m7a(this.f7872a.f8046a.aU(), "Cannot return null from a non-@Nullable @Provides method");
        c3216c.f16545d = (ai) C0004c.m7a(this.f7872a.f8046a.bB(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1861a(C3624j c3624j) {
        c3624j.f17986a = (C3640a) C0004c.m7a(this.f7872a.f8046a.ba(), "Cannot return null from a non-@Nullable @Provides method");
        c3624j.f17987b = (C3741b) C0004c.m7a(this.f7872a.f8046a.bS(), "Cannot return null from a non-@Nullable @Provides method");
        c3624j.f17988c = (C3646a) C0004c.m7a(this.f7872a.f8046a.mo2029I(), "Cannot return null from a non-@Nullable @Provides method");
        c3624j.f17989d = (C1190a) C0004c.m7a(this.f7872a.f8046a.at(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1726a(C1683a c1683a) {
        c1683a.f8710a = (C1801q) C0004c.m7a(this.f7872a.f8046a.aB(), "Cannot return null from a non-@Nullable @Provides method");
        c1683a.f8711b = (C1803u) C0004c.m7a(this.f7872a.f8046a.aC(), "Cannot return null from a non-@Nullable @Provides method");
        c1683a.f8712c = (C2171b) C0004c.m7a(this.f7872a.f8046a.bo(), "Cannot return null from a non-@Nullable @Provides method");
        c1683a.f8713d = (C1655h) C0004c.m7a(this.f7872a.f8046a.cw(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1693a() {
        this.f7856K.mo1a();
    }

    public final void mo1999b() {
        this.f7859N.mo1a();
    }

    public final void mo1727a(C1664i c1664i) {
        c1664i.f8661u = (C2471a) C0004c.m7a(this.f7872a.f8046a.aR(), "Cannot return null from a non-@Nullable @Provides method");
        c1664i.f8662v = (C1790e) C0004c.m7a(this.f7872a.f8046a.aZ(), "Cannot return null from a non-@Nullable @Provides method");
        c1664i.f8663w = (C1287h) C0004c.m7a(this.f7872a.f8046a.aK(), "Cannot return null from a non-@Nullable @Provides method");
        c1664i.f8664x = (C1288k) C0004c.m7a(this.f7872a.f8046a.aL(), "Cannot return null from a non-@Nullable @Provides method");
        c1664i.f8665y = (C1461c) C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method");
        c1664i.f8666z = (C1506e) C0004c.m7a(this.f7872a.f8046a.mo2035O(), "Cannot return null from a non-@Nullable @Provides method");
        c1664i.f8635A = (C1504b) C0004c.m7a(this.f7872a.f8046a.mo2037Q(), "Cannot return null from a non-@Nullable @Provides method");
        c1664i.f8636B = (C3300k) C0004c.m7a(this.f7872a.f8046a.mo2256o(), "Cannot return null from a non-@Nullable @Provides method");
        c1664i.f8637C = (C2199l) C0004c.m7a(this.f7872a.f8046a.ai(), "Cannot return null from a non-@Nullable @Provides method");
        c1664i.f8638D = (C2206c) C0004c.m7a(this.f7872a.f8046a.ah(), "Cannot return null from a non-@Nullable @Provides method");
        c1664i.f8639E = (C1793i) C0004c.m7a(this.f7872a.f8046a.aG(), "Cannot return null from a non-@Nullable @Provides method");
        c1664i.f8640F = (C2171b) C0004c.m7a(this.f7872a.f8046a.bo(), "Cannot return null from a non-@Nullable @Provides method");
        c1664i.f8641G = (C3982a) C0004c.m7a(this.f7872a.f8046a.bK(), "Cannot return null from a non-@Nullable @Provides method");
        c1664i.f8642H = (C2320a) C0004c.m7a(this.f7872a.f8046a.mo2032L(), "Cannot return null from a non-@Nullable @Provides method");
        c1664i.f8643I = (C1867w) C0004c.m7a(this.f7872a.f8046a.aE(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1722a(C1667b c1667b) {
        c1667b.f8680a = (C2798j) this.f7859N.mo1a();
        c1667b.f8681b = (C1612l) C0004c.m7a(this.f7872a.f8046a.ar(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1723a(C1668c c1668c) {
        c1668c.f8684a = (C2798j) this.f7859N.mo1a();
    }

    public final void mo1725a(C1678k c1678k) {
        c1678k.f8703a = (C2798j) this.f7859N.mo1a();
    }

    public final void mo1724a(C1676i c1676i) {
        c1676i.f8697a = (C2798j) this.f7859N.mo1a();
    }

    public final void mo1728a(C1764f c1764f) {
        c1764f.f9094a = C0003b.m4b(this.f7890s);
        c1764f.f9095b = C0003b.m4b(this.f7860O);
    }

    public final void mo1730a(C1774n c1774n) {
        c1774n.f9187a = (C2171b) C0004c.m7a(this.f7872a.f8046a.bo(), "Cannot return null from a non-@Nullable @Provides method");
        c1774n.f9188b = (C2162a) C0004c.m7a(this.f7872a.f8046a.bn(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1729a(C1767g c1767g) {
        c1767g.f9113a = (C2206c) C0004c.m7a(this.f7872a.f8046a.ah(), "Cannot return null from a non-@Nullable @Provides method");
        c1767g.f9114b = (C2233o) C0004c.m7a(this.f7872a.f8046a.mo2045Y(), "Cannot return null from a non-@Nullable @Provides method");
        c1767g.f9115c = (C1655h) C0004c.m7a(this.f7872a.f8046a.cw(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo2000c() {
        C0004c.m7a(this.f7872a.f8046a.aG(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1967a(CheckWifiAndAutoUpdate checkWifiAndAutoUpdate) {
        checkWifiAndAutoUpdate.f23852a = (C2471a) C0004c.m7a(this.f7872a.f8046a.aR(), "Cannot return null from a non-@Nullable @Provides method");
        checkWifiAndAutoUpdate.f23853b = (C4661t) this.f7868W.mo1a();
    }

    public final void mo1968a(CheckPreconditionsAndAutoUpdateJobService checkPreconditionsAndAutoUpdateJobService) {
        checkPreconditionsAndAutoUpdateJobService.f23856a = (C2471a) C0004c.m7a(this.f7872a.f8046a.aR(), "Cannot return null from a non-@Nullable @Provides method");
        checkPreconditionsAndAutoUpdateJobService.f23857b = (C4661t) this.f7868W.mo1a();
        checkPreconditionsAndAutoUpdateJobService.f23858c = (ai) C0004c.m7a(this.f7872a.f8046a.bB(), "Cannot return null from a non-@Nullable @Provides method");
        checkPreconditionsAndAutoUpdateJobService.f23859d = (C1461c) C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1970a(C4659r c4659r) {
        c4659r.f23985a = (C2471a) C0004c.m7a(this.f7872a.f8046a.aR(), "Cannot return null from a non-@Nullable @Provides method");
        c4659r.f23986c = (C4661t) this.f7868W.mo1a();
    }

    public final void mo1969a(C4654m c4654m) {
        c4654m.f23967a = (C2471a) C0004c.m7a(this.f7872a.f8046a.aR(), "Cannot return null from a non-@Nullable @Provides method");
        c4654m.f23968c = (C4661t) this.f7868W.mo1a();
    }

    public final void mo1749a(C1996a c1996a) {
        c1996a.f10169c = (C0988c) C0004c.m7a(this.f7872a.f8046a.mo2040T(), "Cannot return null from a non-@Nullable @Provides method");
        c1996a.f10170d = (C1461c) C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method");
        c1996a.f10171e = (C1557b) C0004c.m7a(this.f7872a.f8046a.aY(), "Cannot return null from a non-@Nullable @Provides method");
        c1996a.f10172f = (C1500a) C0004c.m7a(this.f7872a.f8046a.mo2033M(), "Cannot return null from a non-@Nullable @Provides method");
        c1996a.f10173g = (C2910a) C0004c.m7a(this.f7872a.f8046a.au(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1757a(C2007h c2007h) {
        c2007h.r_ = (C1287h) C0004c.m7a(this.f7872a.f8046a.aK(), "Cannot return null from a non-@Nullable @Provides method");
        c2007h.n_ = (C1461c) C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method");
        c2007h.f_ = (com.google.android.finsky.dfemodel.ab) C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method");
        c2007h.bD = (C1294w) C0004c.m7a(this.f7872a.f8046a.be(), "Cannot return null from a non-@Nullable @Provides method");
        c2007h.bE = (C2492t) C0004c.m7a(this.f7872a.f8046a.aP(), "Cannot return null from a non-@Nullable @Provides method");
        c2007h.y_ = (C2471a) C0004c.m7a(this.f7872a.f8046a.aR(), "Cannot return null from a non-@Nullable @Provides method");
        c2007h.f10300b = (C0988c) C0004c.m7a(this.f7872a.f8046a.mo2040T(), "Cannot return null from a non-@Nullable @Provides method");
        c2007h.f10301c = (C3027b) C0004c.m7a(this.f7872a.f8046a.bt(), "Cannot return null from a non-@Nullable @Provides method");
        c2007h.f10302e = (C2721l) C0004c.m7a(this.f7872a.f8046a.aO(), "Cannot return null from a non-@Nullable @Provides method");
        c2007h.f10303f = (C2460b) C0004c.m7a(this.f7872a.f8046a.bH(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1758a(C2010k c2010k) {
        c2010k.r_ = (C1287h) C0004c.m7a(this.f7872a.f8046a.aK(), "Cannot return null from a non-@Nullable @Provides method");
        c2010k.n_ = (C1461c) C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method");
        c2010k.f_ = (com.google.android.finsky.dfemodel.ab) C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method");
        c2010k.bD = (C1294w) C0004c.m7a(this.f7872a.f8046a.be(), "Cannot return null from a non-@Nullable @Provides method");
        c2010k.bE = (C2492t) C0004c.m7a(this.f7872a.f8046a.aP(), "Cannot return null from a non-@Nullable @Provides method");
        c2010k.y_ = (C2471a) C0004c.m7a(this.f7872a.f8046a.aR(), "Cannot return null from a non-@Nullable @Provides method");
        c2010k.f_ = (com.google.android.finsky.dfemodel.ab) C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1759a(AccountPaymentMethodsActionRowView accountPaymentMethodsActionRowView) {
        accountPaymentMethodsActionRowView.f10331a = (C1461c) C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1760a(AccountPaymentMethodsCreatableInstrumentRowView accountPaymentMethodsCreatableInstrumentRowView) {
        accountPaymentMethodsCreatableInstrumentRowView.f10337a = (C1461c) C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method");
        accountPaymentMethodsCreatableInstrumentRowView.f10338b = (C1612l) C0004c.m7a(this.f7872a.f8046a.ar(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1761a(AccountPaymentMethodsExistingInstrumentRowView accountPaymentMethodsExistingInstrumentRowView) {
        accountPaymentMethodsExistingInstrumentRowView.f10344a = (C1461c) C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method");
        accountPaymentMethodsExistingInstrumentRowView.f10345b = (C1612l) C0004c.m7a(this.f7872a.f8046a.ar(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1764a(C2028q c2028q) {
        c2028q.r_ = (C1287h) C0004c.m7a(this.f7872a.f8046a.aK(), "Cannot return null from a non-@Nullable @Provides method");
        c2028q.n_ = (C1461c) C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method");
        c2028q.f_ = (com.google.android.finsky.dfemodel.ab) C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method");
        c2028q.bD = (C1294w) C0004c.m7a(this.f7872a.f8046a.be(), "Cannot return null from a non-@Nullable @Provides method");
        c2028q.bE = (C2492t) C0004c.m7a(this.f7872a.f8046a.aP(), "Cannot return null from a non-@Nullable @Provides method");
        c2028q.y_ = (C2471a) C0004c.m7a(this.f7872a.f8046a.aR(), "Cannot return null from a non-@Nullable @Provides method");
        c2028q.f10473b = (C0988c) C0004c.m7a(this.f7872a.f8046a.mo2040T(), "Cannot return null from a non-@Nullable @Provides method");
        c2028q.n_ = (C1461c) C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method");
        c2028q.f10474c = (C1557b) C0004c.m7a(this.f7872a.f8046a.aY(), "Cannot return null from a non-@Nullable @Provides method");
        c2028q.f10475e = (C1612l) C0004c.m7a(this.f7872a.f8046a.ar(), "Cannot return null from a non-@Nullable @Provides method");
        c2028q.f10476f = (C1801q) C0004c.m7a(this.f7872a.f8046a.aB(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1746a(CancelSubscriptionActivity cancelSubscriptionActivity) {
        cancelSubscriptionActivity.f8581y = (C2471a) C0004c.m7a(this.f7872a.f8046a.aR(), "Cannot return null from a non-@Nullable @Provides method");
        cancelSubscriptionActivity.f8582z = (C3982a) C0004c.m7a(this.f7872a.f8046a.bK(), "Cannot return null from a non-@Nullable @Provides method");
        cancelSubscriptionActivity.f8575A = (C3129a) C0004c.m7a(this.f7872a.f8046a.aX(), "Cannot return null from a non-@Nullable @Provides method");
        cancelSubscriptionActivity.f10120n = (C2199l) C0004c.m7a(this.f7872a.f8046a.ai(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1765a(C2032v c2032v) {
        c2032v.f10479a = (C1287h) C0004c.m7a(this.f7872a.f8046a.aK(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1750a(ad adVar) {
        adVar.r_ = (C1287h) C0004c.m7a(this.f7872a.f8046a.aK(), "Cannot return null from a non-@Nullable @Provides method");
        adVar.n_ = (C1461c) C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method");
        adVar.f_ = (com.google.android.finsky.dfemodel.ab) C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method");
        adVar.bD = (C1294w) C0004c.m7a(this.f7872a.f8046a.be(), "Cannot return null from a non-@Nullable @Provides method");
        adVar.bE = (C2492t) C0004c.m7a(this.f7872a.f8046a.aP(), "Cannot return null from a non-@Nullable @Provides method");
        adVar.y_ = (C2471a) C0004c.m7a(this.f7872a.f8046a.aR(), "Cannot return null from a non-@Nullable @Provides method");
        adVar.f10178b = (C1612l) C0004c.m7a(this.f7872a.f8046a.ar(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1751a(af afVar) {
        afVar.f10183a = (C2471a) C0004c.m7a(this.f7872a.f8046a.aR(), "Cannot return null from a non-@Nullable @Provides method");
        afVar.f10184b = (C1287h) C0004c.m7a(this.f7872a.f8046a.aK(), "Cannot return null from a non-@Nullable @Provides method");
        afVar.f10185c = (C1793i) C0004c.m7a(this.f7872a.f8046a.aG(), "Cannot return null from a non-@Nullable @Provides method");
        afVar.f10186d = (C2910a) C0004c.m7a(this.f7872a.f8046a.au(), "Cannot return null from a non-@Nullable @Provides method");
        afVar.f10187e = (C4774e) C0004c.m7a(this.f7872a.f8046a.bk(), "Cannot return null from a non-@Nullable @Provides method");
        afVar.f10188f = (C1655h) C0004c.m7a(this.f7872a.f8046a.cw(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1752a(an anVar) {
        anVar.f10204g = (C2910a) C0004c.m7a(this.f7872a.f8046a.au(), "Cannot return null from a non-@Nullable @Provides method");
        anVar.f10205h = (C0988c) C0004c.m7a(this.f7872a.f8046a.mo2040T(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1747a(ManageSubscriptionActivity manageSubscriptionActivity) {
        manageSubscriptionActivity.f8581y = (C2471a) C0004c.m7a(this.f7872a.f8046a.aR(), "Cannot return null from a non-@Nullable @Provides method");
        manageSubscriptionActivity.f8582z = (C3982a) C0004c.m7a(this.f7872a.f8046a.bK(), "Cannot return null from a non-@Nullable @Provides method");
        manageSubscriptionActivity.f8575A = (C3129a) C0004c.m7a(this.f7872a.f8046a.aX(), "Cannot return null from a non-@Nullable @Provides method");
        manageSubscriptionActivity.f10141n = (C1612l) C0004c.m7a(this.f7872a.f8046a.ar(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1762a(OrderHistoryRowView orderHistoryRowView) {
        orderHistoryRowView.f10377p = (C4683n) C0004c.m7a(this.f7872a.f8046a.bb(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1748a(ReactivateSubscriptionActivity reactivateSubscriptionActivity) {
        reactivateSubscriptionActivity.f8581y = (C2471a) C0004c.m7a(this.f7872a.f8046a.aR(), "Cannot return null from a non-@Nullable @Provides method");
        reactivateSubscriptionActivity.f8582z = (C3982a) C0004c.m7a(this.f7872a.f8046a.bK(), "Cannot return null from a non-@Nullable @Provides method");
        reactivateSubscriptionActivity.f8575A = (C3129a) C0004c.m7a(this.f7872a.f8046a.aX(), "Cannot return null from a non-@Nullable @Provides method");
        reactivateSubscriptionActivity.f10146n = (C2199l) C0004c.m7a(this.f7872a.f8046a.ai(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1753a(bm bmVar) {
        bmVar.f10256a = (C1287h) C0004c.m7a(this.f7872a.f8046a.aK(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1754a(bo boVar) {
        boVar.f8581y = (C2471a) C0004c.m7a(this.f7872a.f8046a.aR(), "Cannot return null from a non-@Nullable @Provides method");
        boVar.f8582z = (C3982a) C0004c.m7a(this.f7872a.f8046a.bK(), "Cannot return null from a non-@Nullable @Provides method");
        boVar.f8575A = (C3129a) C0004c.m7a(this.f7872a.f8046a.aX(), "Cannot return null from a non-@Nullable @Provides method");
        boVar.f10131o = (C2199l) C0004c.m7a(this.f7872a.f8046a.ai(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1755a(br brVar) {
        brVar.f10266a = (C1287h) C0004c.m7a(this.f7872a.f8046a.aK(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1763a(SubscriptionRowView subscriptionRowView) {
        subscriptionRowView.f10394p = (C1612l) C0004c.m7a(this.f7872a.f8046a.ar(), "Cannot return null from a non-@Nullable @Provides method");
        subscriptionRowView.f10395q = (C0988c) C0004c.m7a(this.f7872a.f8046a.mo2040T(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1756a(bu buVar) {
        buVar.f10275a = (C1287h) C0004c.m7a(this.f7872a.f8046a.aK(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1735a(C1822k c1822k) {
        c1822k.f9396d = (C1461c) C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method");
        C0004c.m7a(this.f7872a.f8046a.mo2046Z(), "Cannot return null from a non-@Nullable @Provides method");
        c1822k.f9397e = C0003b.m4b(this.f7890s);
    }

    public final void mo1733a(C1792g c1792g) {
        c1792g.f9320a = (C2471a) C0004c.m7a(this.f7872a.f8046a.aR(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1734a(C1647h c1647h) {
        c1647h.f8581y = (C2471a) C0004c.m7a(this.f7872a.f8046a.aR(), "Cannot return null from a non-@Nullable @Provides method");
        c1647h.f8582z = (C3982a) C0004c.m7a(this.f7872a.f8046a.bK(), "Cannot return null from a non-@Nullable @Provides method");
        c1647h.f8575A = (C3129a) C0004c.m7a(this.f7872a.f8046a.aX(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1738a(C1836b c1836b) {
        c1836b.f9444a = (C1287h) C0004c.m7a(this.f7872a.f8046a.aK(), "Cannot return null from a non-@Nullable @Provides method");
        c1836b.f9445b = (C2471a) C0004c.m7a(this.f7872a.f8046a.aR(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1739a(C1841f c1841f) {
        c1841f.r_ = (C1287h) C0004c.m7a(this.f7872a.f8046a.aK(), "Cannot return null from a non-@Nullable @Provides method");
        c1841f.n_ = (C1461c) C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method");
        c1841f.f_ = (com.google.android.finsky.dfemodel.ab) C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method");
        c1841f.bD = (C1294w) C0004c.m7a(this.f7872a.f8046a.be(), "Cannot return null from a non-@Nullable @Provides method");
        c1841f.bE = (C2492t) C0004c.m7a(this.f7872a.f8046a.aP(), "Cannot return null from a non-@Nullable @Provides method");
        c1841f.y_ = (C2471a) C0004c.m7a(this.f7872a.f8046a.aR(), "Cannot return null from a non-@Nullable @Provides method");
        c1841f.w_ = (C1611k) C0004c.m7a(this.f7872a.f8046a.av(), "Cannot return null from a non-@Nullable @Provides method");
        c1841f.f9465c = (com.google.android.finsky.playcard.ac) C0004c.m7a(this.f7872a.f8046a.mo2245h(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1736a(PlayCreditGiftingHeader playCreditGiftingHeader) {
        playCreditGiftingHeader.f9428a = (C1612l) C0004c.m7a(this.f7872a.f8046a.ar(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1737a(PlayCreditGiftingRow playCreditGiftingRow) {
        playCreditGiftingRow.f9434a = (C1612l) C0004c.m7a(this.f7872a.f8046a.ar(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1740a(FirstPartyInAppBillingService firstPartyInAppBillingService) {
        C0004c.m7a(this.f7872a.f8046a.aE(), "Cannot return null from a non-@Nullable @Provides method");
        C0004c.m7a(this.f7872a.f8046a.aJ(), "Cannot return null from a non-@Nullable @Provides method");
        firstPartyInAppBillingService.f9478b = (C2471a) C0004c.m7a(this.f7872a.f8046a.aR(), "Cannot return null from a non-@Nullable @Provides method");
        firstPartyInAppBillingService.f9479c = (C1461c) C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method");
        firstPartyInAppBillingService.f9480d = (C0986a) C0004c.m7a(this.f7872a.f8046a.mo2041U(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1742a(C1849e c1849e) {
        c1849e.f9504i = (C1287h) C0004c.m7a(this.f7872a.f8046a.aK(), "Cannot return null from a non-@Nullable @Provides method");
        c1849e.f9505j = (C1461c) C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method");
        c1849e.f9506k = (C1865u) C0004c.m7a(this.f7872a.f8046a.aF(), "Cannot return null from a non-@Nullable @Provides method");
        c1849e.f9507l = (C1867w) C0004c.m7a(this.f7872a.f8046a.aE(), "Cannot return null from a non-@Nullable @Provides method");
        c1849e.f9508m = (C2206c) C0004c.m7a(this.f7872a.f8046a.ah(), "Cannot return null from a non-@Nullable @Provides method");
        c1849e.f9509n = (C2199l) C0004c.m7a(this.f7872a.f8046a.ai(), "Cannot return null from a non-@Nullable @Provides method");
        c1849e.f9510o = (C2266a) C0004c.m7a(this.f7872a.f8046a.mo2258q(), "Cannot return null from a non-@Nullable @Provides method");
        c1849e.f9511p = (C1793i) C0004c.m7a(this.f7872a.f8046a.aG(), "Cannot return null from a non-@Nullable @Provides method");
        c1849e.f9512q = (C1869y) C0004c.m7a(this.f7872a.f8046a.aA(), "Cannot return null from a non-@Nullable @Provides method");
        c1849e.f9513r = (C1655h) C0004c.m7a(this.f7872a.f8046a.cw(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1741a(InAppBillingService inAppBillingService) {
        inAppBillingService.f9485c = (C1461c) C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method");
        inAppBillingService.f9486d = (C1867w) C0004c.m7a(this.f7872a.f8046a.aE(), "Cannot return null from a non-@Nullable @Provides method");
        inAppBillingService.f9487e = (C2471a) C0004c.m7a(this.f7872a.f8046a.aR(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1767a(C2040c c2040c) {
        c2040c.f8581y = (C2471a) C0004c.m7a(this.f7872a.f8046a.aR(), "Cannot return null from a non-@Nullable @Provides method");
        c2040c.f8582z = (C3982a) C0004c.m7a(this.f7872a.f8046a.bK(), "Cannot return null from a non-@Nullable @Provides method");
        c2040c.f8575A = (C3129a) C0004c.m7a(this.f7872a.f8046a.aX(), "Cannot return null from a non-@Nullable @Provides method");
        c2040c.f10505n = C0003b.m4b(this.f7890s);
        c2040c.f10506o = C0003b.m4b(this.f7860O);
        c2040c.f10507p = (C0986a) C0004c.m7a(this.f7872a.f8046a.mo2041U(), "Cannot return null from a non-@Nullable @Provides method");
        C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1766a(SetupWizardInstrumentManagerActivity setupWizardInstrumentManagerActivity) {
        setupWizardInstrumentManagerActivity.f8581y = (C2471a) C0004c.m7a(this.f7872a.f8046a.aR(), "Cannot return null from a non-@Nullable @Provides method");
        setupWizardInstrumentManagerActivity.f8582z = (C3982a) C0004c.m7a(this.f7872a.f8046a.bK(), "Cannot return null from a non-@Nullable @Provides method");
        setupWizardInstrumentManagerActivity.f8575A = (C3129a) C0004c.m7a(this.f7872a.f8046a.aX(), "Cannot return null from a non-@Nullable @Provides method");
        setupWizardInstrumentManagerActivity.f10505n = C0003b.m4b(this.f7890s);
        setupWizardInstrumentManagerActivity.f10506o = C0003b.m4b(this.f7860O);
        setupWizardInstrumentManagerActivity.f10507p = (C0986a) C0004c.m7a(this.f7872a.f8046a.mo2041U(), "Cannot return null from a non-@Nullable @Provides method");
        C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method");
        setupWizardInstrumentManagerActivity.f10509r = (C1462a) C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method");
        setupWizardInstrumentManagerActivity.f10510s = (C1467c) C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1768a(BillingProfileActivity billingProfileActivity) {
        billingProfileActivity.f10515q = (C2471a) C0004c.m7a(this.f7872a.f8046a.aR(), "Cannot return null from a non-@Nullable @Provides method");
        C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method");
        billingProfileActivity.f10516r = (C3129a) C0004c.m7a(this.f7872a.f8046a.aX(), "Cannot return null from a non-@Nullable @Provides method");
        billingProfileActivity.f10517s = (C1797m) C0004c.m7a(this.f7872a.f8046a.aH(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1770a(C2046a c2046a) {
        c2046a.f10531a = (C2471a) C0004c.m7a(this.f7872a.f8046a.aR(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1771a(C2048c c2048c) {
        c2048c.f10531a = (C2471a) C0004c.m7a(this.f7872a.f8046a.aR(), "Cannot return null from a non-@Nullable @Provides method");
        c2048c.aj = (C1461c) C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method");
        c2048c.ak = (C1612l) C0004c.m7a(this.f7872a.f8046a.ar(), "Cannot return null from a non-@Nullable @Provides method");
        c2048c.al = (C1797m) C0004c.m7a(this.f7872a.f8046a.aH(), "Cannot return null from a non-@Nullable @Provides method");
        c2048c.am = (C1801q) C0004c.m7a(this.f7872a.f8046a.aB(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1772a(C2056m c2056m) {
        c2056m.f10560b = (C2471a) C0004c.m7a(this.f7872a.f8046a.aR(), "Cannot return null from a non-@Nullable @Provides method");
        c2056m.f10561c = (C1287h) C0004c.m7a(this.f7872a.f8046a.aK(), "Cannot return null from a non-@Nullable @Provides method");
        c2056m.f10562d = (C1461c) C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method");
        c2056m.f10563e = (C2041d) C0004c.m7a(new C2042a((C1467c) C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method")), "Cannot return null from a non-@Nullable @Provides method");
        c2056m.f10564f = (C1793i) C0004c.m7a(this.f7872a.f8046a.aG(), "Cannot return null from a non-@Nullable @Provides method");
        c2056m.f10565g = (C1803u) C0004c.m7a(this.f7872a.f8046a.aC(), "Cannot return null from a non-@Nullable @Provides method");
        c2056m.ah = (C1655h) C0004c.m7a(this.f7872a.f8046a.cw(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1769a(CatchAbandonmentActivity catchAbandonmentActivity) {
        catchAbandonmentActivity.f8581y = (C2471a) C0004c.m7a(this.f7872a.f8046a.aR(), "Cannot return null from a non-@Nullable @Provides method");
        catchAbandonmentActivity.f8582z = (C3982a) C0004c.m7a(this.f7872a.f8046a.bK(), "Cannot return null from a non-@Nullable @Provides method");
        catchAbandonmentActivity.f8575A = (C3129a) C0004c.m7a(this.f7872a.f8046a.aX(), "Cannot return null from a non-@Nullable @Provides method");
        catchAbandonmentActivity.f10524n = (C1797m) C0004c.m7a(this.f7872a.f8046a.aH(), "Cannot return null from a non-@Nullable @Provides method");
        catchAbandonmentActivity.f10525o = (C1801q) C0004c.m7a(this.f7872a.f8046a.aB(), "Cannot return null from a non-@Nullable @Provides method");
        catchAbandonmentActivity.f10526p = (C1612l) C0004c.m7a(this.f7872a.f8046a.ar(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1773a(UpdateSubscriptionInstrumentActivity updateSubscriptionInstrumentActivity) {
        updateSubscriptionInstrumentActivity.f8581y = (C2471a) C0004c.m7a(this.f7872a.f8046a.aR(), "Cannot return null from a non-@Nullable @Provides method");
        updateSubscriptionInstrumentActivity.f8582z = (C3982a) C0004c.m7a(this.f7872a.f8046a.bK(), "Cannot return null from a non-@Nullable @Provides method");
        updateSubscriptionInstrumentActivity.f8575A = (C3129a) C0004c.m7a(this.f7872a.f8046a.aX(), "Cannot return null from a non-@Nullable @Provides method");
        updateSubscriptionInstrumentActivity.f10691n = (C0986a) C0004c.m7a(this.f7872a.f8046a.mo2041U(), "Cannot return null from a non-@Nullable @Provides method");
        updateSubscriptionInstrumentActivity.f10692o = (C1461c) C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method");
        updateSubscriptionInstrumentActivity.f10679A = (C3129a) C0004c.m7a(this.f7872a.f8046a.aX(), "Cannot return null from a non-@Nullable @Provides method");
        C0004c.m7a(this.f7872a.f8046a.aJ(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1775a(C2100c c2100c) {
        c2100c.f10701a = (C1287h) C0004c.m7a(this.f7872a.f8046a.aK(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1774a(C2099b c2099b) {
        c2099b.f10531a = (C2471a) C0004c.m7a(this.f7872a.f8046a.aR(), "Cannot return null from a non-@Nullable @Provides method");
        c2099b.aj = (C1461c) C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method");
        c2099b.ak = (C1612l) C0004c.m7a(this.f7872a.f8046a.ar(), "Cannot return null from a non-@Nullable @Provides method");
        c2099b.al = (C1797m) C0004c.m7a(this.f7872a.f8046a.aH(), "Cannot return null from a non-@Nullable @Provides method");
        c2099b.am = (C1801q) C0004c.m7a(this.f7872a.f8046a.aB(), "Cannot return null from a non-@Nullable @Provides method");
        c2099b.aj = (C1461c) C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1776a(BootCompletedReceiver bootCompletedReceiver) {
        bootCompletedReceiver.f10901a = (C0988c) C0004c.m7a(this.f7872a.f8046a.mo2040T(), "Cannot return null from a non-@Nullable @Provides method");
        bootCompletedReceiver.f10902b = (C1461c) C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method");
        bootCompletedReceiver.f10903c = (C3178v) C0004c.m7a(this.f7872a.f8046a.aW(), "Cannot return null from a non-@Nullable @Provides method");
        bootCompletedReceiver.f10904d = (ak) C0004c.m7a(this.f7872a.f8046a.ca(), "Cannot return null from a non-@Nullable @Provides method");
        bootCompletedReceiver.f10905e = (C4774e) C0004c.m7a(this.f7872a.f8046a.bk(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1971a(C4695b c4695b) {
        c4695b.f24086e = (C1611k) C0004c.m7a(this.f7872a.f8046a.av(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1731a(ChangeSubscriptionPriceActivity changeSubscriptionPriceActivity) {
        changeSubscriptionPriceActivity.f8581y = (C2471a) C0004c.m7a(this.f7872a.f8046a.aR(), "Cannot return null from a non-@Nullable @Provides method");
        changeSubscriptionPriceActivity.f8582z = (C3982a) C0004c.m7a(this.f7872a.f8046a.bK(), "Cannot return null from a non-@Nullable @Provides method");
        changeSubscriptionPriceActivity.f8575A = (C3129a) C0004c.m7a(this.f7872a.f8046a.aX(), "Cannot return null from a non-@Nullable @Provides method");
        changeSubscriptionPriceActivity.f9243n = (C1294w) C0004c.m7a(this.f7872a.f8046a.be(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1732a(C1787b c1787b) {
        c1787b.f9253a = (C1287h) C0004c.m7a(this.f7872a.f8046a.aK(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1922a(CollectionAssistCardView collectionAssistCardView) {
        collectionAssistCardView.f22030a = (C1294w) C0004c.m7a(this.f7872a.f8046a.be(), "Cannot return null from a non-@Nullable @Provides method");
        collectionAssistCardView.f22031b = (C4556b) this.f7869X.mo1a();
    }

    public final void mo1923a(ComboAssistCardView comboAssistCardView) {
        comboAssistCardView.f22058a = (C1294w) C0004c.m7a(this.f7872a.f8046a.be(), "Cannot return null from a non-@Nullable @Provides method");
        comboAssistCardView.f22059b = (C4556b) this.f7869X.mo1a();
    }

    public final void mo1924a(CompactAssistCardView compactAssistCardView) {
        compactAssistCardView.f22087a = (C1294w) C0004c.m7a(this.f7872a.f8046a.be(), "Cannot return null from a non-@Nullable @Provides method");
        compactAssistCardView.f22088b = (C4556b) this.f7869X.mo1a();
    }

    public final void mo1925a(ContentAssistCardView contentAssistCardView) {
        contentAssistCardView.f22114a = (C1294w) C0004c.m7a(this.f7872a.f8046a.be(), "Cannot return null from a non-@Nullable @Provides method");
        contentAssistCardView.f22115b = (C4556b) this.f7869X.mo1a();
    }

    public final void mo1784a(ContentFilterChoiceItemView contentFilterChoiceItemView) {
        contentFilterChoiceItemView.f11474a = (C1612l) C0004c.m7a(this.f7872a.f8046a.ar(), "Cannot return null from a non-@Nullable @Provides method");
        contentFilterChoiceItemView.f11475b = (com.google.android.finsky.bg.af) C0004c.m7a(this.f7872a.f8046a.bR(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1785a(ContentFilterLineView contentFilterLineView) {
        contentFilterLineView.f11485a = (C1612l) C0004c.m7a(this.f7872a.f8046a.ar(), "Cannot return null from a non-@Nullable @Provides method");
        contentFilterLineView.f11486b = (com.google.android.finsky.bg.af) C0004c.m7a(this.f7872a.f8046a.bR(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1788a(C2339e c2339e) {
        c2339e.r_ = (C1287h) C0004c.m7a(this.f7872a.f8046a.aK(), "Cannot return null from a non-@Nullable @Provides method");
        c2339e.n_ = (C1461c) C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method");
        c2339e.f_ = (com.google.android.finsky.dfemodel.ab) C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method");
        c2339e.bD = (C1294w) C0004c.m7a(this.f7872a.f8046a.be(), "Cannot return null from a non-@Nullable @Provides method");
        c2339e.bE = (C2492t) C0004c.m7a(this.f7872a.f8046a.aP(), "Cannot return null from a non-@Nullable @Provides method");
        c2339e.y_ = (C2471a) C0004c.m7a(this.f7872a.f8046a.aR(), "Cannot return null from a non-@Nullable @Provides method");
        c2339e.y_ = (C2471a) C0004c.m7a(this.f7872a.f8046a.aR(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1789a(C2346j c2346j) {
        c2346j.r_ = (C1287h) C0004c.m7a(this.f7872a.f8046a.aK(), "Cannot return null from a non-@Nullable @Provides method");
        c2346j.n_ = (C1461c) C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method");
        c2346j.f_ = (com.google.android.finsky.dfemodel.ab) C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method");
        c2346j.bD = (C1294w) C0004c.m7a(this.f7872a.f8046a.be(), "Cannot return null from a non-@Nullable @Provides method");
        c2346j.bE = (C2492t) C0004c.m7a(this.f7872a.f8046a.aP(), "Cannot return null from a non-@Nullable @Provides method");
        c2346j.y_ = (C2471a) C0004c.m7a(this.f7872a.f8046a.aR(), "Cannot return null from a non-@Nullable @Provides method");
        c2346j.f11527c = (C0988c) C0004c.m7a(this.f7872a.f8046a.mo2040T(), "Cannot return null from a non-@Nullable @Provides method");
        c2346j.y_ = (C2471a) C0004c.m7a(this.f7872a.f8046a.aR(), "Cannot return null from a non-@Nullable @Provides method");
        c2346j.r_ = (C1287h) C0004c.m7a(this.f7872a.f8046a.aK(), "Cannot return null from a non-@Nullable @Provides method");
        c2346j.f11528f = (C2320a) C0004c.m7a(this.f7872a.f8046a.mo2032L(), "Cannot return null from a non-@Nullable @Provides method");
        c2346j.f11529h = (C4774e) C0004c.m7a(this.f7872a.f8046a.bk(), "Cannot return null from a non-@Nullable @Provides method");
        c2346j.ag = (C2162a) C0004c.m7a(this.f7872a.f8046a.bn(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1786a(ContentFiltersService contentFiltersService) {
        contentFiltersService.f11491a = (C0988c) C0004c.m7a(this.f7872a.f8046a.mo2040T(), "Cannot return null from a non-@Nullable @Provides method");
        contentFiltersService.f11492b = (C1287h) C0004c.m7a(this.f7872a.f8046a.aK(), "Cannot return null from a non-@Nullable @Provides method");
        contentFiltersService.f11493c = (C1463g) C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method");
        C0004c.m7a(this.f7872a.f8046a.aJ(), "Cannot return null from a non-@Nullable @Provides method");
        contentFiltersService.f11494d = (C4774e) C0004c.m7a(this.f7872a.f8046a.bk(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1790a(C2353q c2353q) {
        c2353q.r_ = (C1287h) C0004c.m7a(this.f7872a.f8046a.aK(), "Cannot return null from a non-@Nullable @Provides method");
        c2353q.n_ = (C1461c) C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method");
        c2353q.f_ = (com.google.android.finsky.dfemodel.ab) C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method");
        c2353q.bD = (C1294w) C0004c.m7a(this.f7872a.f8046a.be(), "Cannot return null from a non-@Nullable @Provides method");
        c2353q.bE = (C2492t) C0004c.m7a(this.f7872a.f8046a.aP(), "Cannot return null from a non-@Nullable @Provides method");
        c2353q.y_ = (C2471a) C0004c.m7a(this.f7872a.f8046a.aR(), "Cannot return null from a non-@Nullable @Provides method");
        c2353q.f11554c = (C0988c) C0004c.m7a(this.f7872a.f8046a.mo2040T(), "Cannot return null from a non-@Nullable @Provides method");
        c2353q.y_ = (C2471a) C0004c.m7a(this.f7872a.f8046a.aR(), "Cannot return null from a non-@Nullable @Provides method");
        c2353q.f11555f = (C2104b) C0004c.m7a(this.f7872a.f8046a.as(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1787a(PinEntryDialog pinEntryDialog) {
        pinEntryDialog.f11497q = (C2471a) C0004c.m7a(this.f7872a.f8046a.aR(), "Cannot return null from a non-@Nullable @Provides method");
        pinEntryDialog.f11498r = (C1463g) C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1697a(C0975c c0975c) {
        c0975c.f5956a = (C3648c) C0004c.m7a(this.f7872a.f8046a.mo2031K(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1696a(C0972a c0972a) {
        c0972a.f5953e = (C2471a) C0004c.m7a(this.f7872a.f8046a.aR(), "Cannot return null from a non-@Nullable @Provides method");
        c0972a.f5954f = (C1287h) C0004c.m7a(this.f7872a.f8046a.aK(), "Cannot return null from a non-@Nullable @Provides method");
        c0972a.f5955a = (C0977e) C0004c.m7a(this.f7872a.f8046a.cA(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1834a(C2967b c2967b) {
        c2967b.f5953e = (C2471a) C0004c.m7a(this.f7872a.f8046a.aR(), "Cannot return null from a non-@Nullable @Provides method");
        c2967b.f5954f = (C1287h) C0004c.m7a(this.f7872a.f8046a.aK(), "Cannot return null from a non-@Nullable @Provides method");
        c2967b.f15616a = (C3300k) C0004c.m7a(this.f7872a.f8046a.mo2256o(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1926a(CtaAssistCardView ctaAssistCardView) {
        ctaAssistCardView.f22141a = (C1294w) C0004c.m7a(this.f7872a.f8046a.be(), "Cannot return null from a non-@Nullable @Provides method");
        ctaAssistCardView.f22142b = (C4556b) this.f7869X.mo1a();
    }

    public final void mo1928a(DataAssistCardView dataAssistCardView) {
        dataAssistCardView.f22196a = (C4556b) this.f7869X.mo1a();
    }

    public final void mo1796a(BrowseDataSyncService browseDataSyncService) {
        browseDataSyncService.f13458c = (C0986a) C0004c.m7a(this.f7872a.f8046a.mo2041U(), "Cannot return null from a non-@Nullable @Provides method");
        browseDataSyncService.f13459d = (C1287h) C0004c.m7a(this.f7872a.f8046a.aK(), "Cannot return null from a non-@Nullable @Provides method");
        browseDataSyncService.f13460e = (C1463g) C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method");
        browseDataSyncService.f13461f = (C1460g) C0004c.m7a(this.f7872a.f8046a.bf(), "Cannot return null from a non-@Nullable @Provides method");
        browseDataSyncService.f13462g = (C2866c) C0004c.m7a(C1473m.f7980a.mo2038R(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1797a(BrowseDataSyncTaskService browseDataSyncTaskService) {
        browseDataSyncTaskService.f13463a = (Context) C0004c.m7a(this.f7872a.f8046a.f7981b, "Cannot return null from a non-@Nullable @Provides method");
        C0004c.m7a(this.f7872a.f8046a.aT(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1798a(CacheAndSyncJitterSchedulingService cacheAndSyncJitterSchedulingService) {
        cacheAndSyncJitterSchedulingService.f13464a = (C2531s) C0004c.m7a(this.f7872a.f8046a.aT(), "Cannot return null from a non-@Nullable @Provides method");
        cacheAndSyncJitterSchedulingService.f13465b = (C1461c) C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1799a(CacheAndSyncTaskService cacheAndSyncTaskService) {
        cacheAndSyncTaskService.f13471e = (C0986a) C0004c.m7a(this.f7872a.f8046a.mo2041U(), "Cannot return null from a non-@Nullable @Provides method");
        cacheAndSyncTaskService.f13472f = (C2531s) C0004c.m7a(this.f7872a.f8046a.aT(), "Cannot return null from a non-@Nullable @Provides method");
        cacheAndSyncTaskService.f13473g = (C2504r) C0004c.m7a((C2505b) this.ac.mo1a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1801a(C2532u c2532u) {
        c2532u.f13575b = (C2534x) C0004c.m7a(this.f7872a.f8046a.aj(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1800a(C2514a c2514a) {
        c2514a.f13509d = (C0986a) C0004c.m7a(this.f7872a.f8046a.mo2041U(), "Cannot return null from a non-@Nullable @Provides method");
        c2514a.f13510e = (C1287h) C0004c.m7a(this.f7872a.f8046a.aK(), "Cannot return null from a non-@Nullable @Provides method");
        c2514a.f13511f = (C1463g) C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method");
        c2514a.f13512g = (C1460g) C0004c.m7a(this.f7872a.f8046a.bf(), "Cannot return null from a non-@Nullable @Provides method");
        c2514a.z_ = (C2866c) C0004c.m7a(C1473m.f7980a.mo2038R(), "Cannot return null from a non-@Nullable @Provides method");
        c2514a.f13513i = (C4674e) this.ad.mo1a();
    }

    public final void mo1803a(HeroGraphicView heroGraphicView) {
        heroGraphicView.f13745y = (C1612l) C0004c.m7a(this.f7872a.f8046a.ar(), "Cannot return null from a non-@Nullable @Provides method");
        heroGraphicView.f13746z = (com.google.android.finsky.bg.af) C0004c.m7a(this.f7872a.f8046a.bR(), "Cannot return null from a non-@Nullable @Provides method");
        heroGraphicView.f13718A = (C2577b) this.al.mo1a();
        heroGraphicView.f13719B = (C2581g) C0004c.m7a(this.f7872a.f8046a.cm(), "Cannot return null from a non-@Nullable @Provides method");
        heroGraphicView.f13720C = (C1611k) C0004c.m7a(this.f7872a.f8046a.av(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1804a(ScreenshotsRecyclerView screenshotsRecyclerView) {
        screenshotsRecyclerView.aG = (C1612l) C0004c.m7a(this.f7872a.f8046a.ar(), "Cannot return null from a non-@Nullable @Provides method");
        screenshotsRecyclerView.aH = (C2577b) this.al.mo1a();
    }

    public final void mo1802a(DocImageView docImageView) {
        docImageView.f13712b = (C1461c) C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method");
        docImageView.f13713c = (com.google.android.finsky.bg.af) C0004c.m7a(this.f7872a.f8046a.bR(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1813a(C2693e c2693e) {
        c2693e.f14831b = (C1463g) C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method");
        c2693e.f14832c = (C1461c) C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method");
        c2693e.f14833d = (C2701n) C0004c.m7a(this.f7872a.f8046a.bs(), "Cannot return null from a non-@Nullable @Provides method");
        c2693e.f14834e = (C1289l) C0004c.m7a(this.f7872a.f8046a.aM(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1814a(C2700m c2700m) {
        c2700m.f14855a = (C2701n) C0004c.m7a(this.f7872a.f8046a.bs(), "Cannot return null from a non-@Nullable @Provides method");
        c2700m.f14856b = (C1289l) C0004c.m7a(this.f7872a.f8046a.aM(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1815a(C2705r c2705r) {
        c2705r.f14831b = (C1463g) C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method");
        c2705r.f14832c = (C1461c) C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method");
        c2705r.f14833d = (C2701n) C0004c.m7a(this.f7872a.f8046a.bs(), "Cannot return null from a non-@Nullable @Provides method");
        c2705r.f14834e = (C1289l) C0004c.m7a(this.f7872a.f8046a.aM(), "Cannot return null from a non-@Nullable @Provides method");
        c2705r.f14861i = (Context) C0004c.m7a(this.f7872a.f8046a.f7981b, "Cannot return null from a non-@Nullable @Provides method");
        c2705r.f14862j = (C2703p) this.an.mo1a();
    }

    public final void mo1810a(RemoveAssetReceiver removeAssetReceiver) {
        removeAssetReceiver.f14821a = (C2471a) C0004c.m7a(this.f7872a.f8046a.aR(), "Cannot return null from a non-@Nullable @Provides method");
        removeAssetReceiver.f14822b = (C3646a) C0004c.m7a(this.f7872a.f8046a.mo2029I(), "Cannot return null from a non-@Nullable @Provides method");
        removeAssetReceiver.f14823c = (com.google.android.finsky.notification.ab) C0004c.m7a(this.f7872a.f8046a.mo2259r(), "Cannot return null from a non-@Nullable @Provides method");
        removeAssetReceiver.f14824d = (C2296c) C0004c.m7a(this.f7872a.f8046a.mo2255n(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1811a(ServerNotificationReceiver serverNotificationReceiver) {
        serverNotificationReceiver.f14826b = (C0947i) C0004c.m7a(this.f7872a.f8046a.mo2113b(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1709a(C1128e c1128e) {
        c1128e.ah = (C2471a) C0004c.m7a(this.f7872a.f8046a.aR(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1817a(C2759a c2759a) {
        c2759a.f15002a = (C2798j) this.f7859N.mo1a();
    }

    public final void mo1821a(C2762c c2762c) {
        c2762c.f15026a = (C2798j) this.f7859N.mo1a();
    }

    public final void mo1822a(C2763d c2763d) {
        c2763d.f15028a = (C2798j) this.f7859N.mo1a();
    }

    public final void mo1824a(C2770i c2770i) {
        c2770i.f15044a = (C2798j) this.f7859N.mo1a();
    }

    public final void mo1825a(C2771j c2771j) {
        c2771j.f15047a = (C2798j) this.f7859N.mo1a();
    }

    public final void mo1830a(C2779u c2779u) {
        c2779u.f15064a = (C2798j) this.f7859N.mo1a();
    }

    public final void mo1826a(C2773o c2773o) {
        c2773o.f15053a = (C2798j) this.f7859N.mo1a();
    }

    public final void mo1829a(C2777s c2777s) {
        c2777s.f15060a = (C2798j) this.f7859N.mo1a();
    }

    public final void mo1831a(C2783x c2783x) {
        c2783x.f15072a = (C2798j) this.f7859N.mo1a();
    }

    public final void mo1832a(C2785z c2785z) {
        c2785z.f15076a = (C2798j) this.f7859N.mo1a();
    }

    public final void mo1819a(com.google.android.finsky.dialogbuilder.p137a.ac acVar) {
        acVar.f15014a = (C2798j) this.f7859N.mo1a();
    }

    public final void mo1820a(com.google.android.finsky.dialogbuilder.p137a.ae aeVar) {
        aeVar.f15021a = (C2798j) this.f7859N.mo1a();
    }

    public final void mo1818a(aa aaVar) {
        aaVar.f15005a = (C2798j) this.f7859N.mo1a();
    }

    public final void mo1827a(C2775q c2775q) {
        c2775q.f15055a = (C2798j) this.f7859N.mo1a();
    }

    public final void mo1823a(C2767g c2767g) {
        c2767g.f15036a = (C2798j) this.f7859N.mo1a();
    }

    public final void mo1828a(C2776r c2776r) {
        c2776r.f15057a = (C2798j) this.f7859N.mo1a();
        c2776r.f15058b = (C1612l) C0004c.m7a(this.f7872a.f8046a.ar(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1929a(EditorsChoiceV2CardView editorsChoiceV2CardView) {
        editorsChoiceV2CardView.f22238a = (C1294w) C0004c.m7a(this.f7872a.f8046a.be(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1710a(C1534b c1534b) {
        c1534b.f8269a = (C3982a) C0004c.m7a(this.f7872a.f8046a.bK(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1930a(EmptyClusterView emptyClusterView) {
        emptyClusterView.f22260a = (C1612l) C0004c.m7a(this.f7872a.f8046a.ar(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1835a(PEFinskyStoryActivity pEFinskyStoryActivity) {
        pEFinskyStoryActivity.f15664q = (C2171b) C0004c.m7a(this.f7872a.f8046a.bo(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1711a(C1551a c1551a) {
        c1551a.f8317a = C0003b.m4b(this.ao);
        c1551a.f8318b = (C1461c) C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1712a(C1556d c1556d) {
        c1556d.f8336a = (C1461c) C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1836a(ExternalReferrerService externalReferrerService) {
        externalReferrerService.f15745a = C0003b.m4b(this.ap);
        externalReferrerService.f15746b = C0003b.m4b(this.f7863R);
        externalReferrerService.f15747c = C0003b.m4b(this.f7862Q);
    }

    public final void mo1838a(C3009a c3009a) {
        c3009a.f15764a = C0003b.m4b(this.ap);
        c3009a.f15765b = C0003b.m4b(this.f7863R);
        c3009a.f15766c = C0003b.m4b(this.f7862Q);
    }

    public final void mo1714a(C1571c c1571c) {
        c1571c.f8383a = (C2910a) C0004c.m7a(this.f7872a.f8046a.au(), "Cannot return null from a non-@Nullable @Provides method");
        c1571c.f8384b = (C1557b) C0004c.m7a(this.f7872a.f8046a.aY(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1715a(C1575e c1575e) {
        c1575e.r_ = (C1287h) C0004c.m7a(this.f7872a.f8046a.aK(), "Cannot return null from a non-@Nullable @Provides method");
        c1575e.n_ = (C1461c) C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method");
        c1575e.f_ = (com.google.android.finsky.dfemodel.ab) C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method");
        c1575e.bD = (C1294w) C0004c.m7a(this.f7872a.f8046a.be(), "Cannot return null from a non-@Nullable @Provides method");
        c1575e.bE = (C2492t) C0004c.m7a(this.f7872a.f8046a.aP(), "Cannot return null from a non-@Nullable @Provides method");
        c1575e.y_ = (C2471a) C0004c.m7a(this.f7872a.f8046a.aR(), "Cannot return null from a non-@Nullable @Provides method");
        c1575e.f8388a = (C1612l) C0004c.m7a(this.f7872a.f8046a.ar(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1716a(C1576f c1576f) {
        c1576f.r_ = (C1287h) C0004c.m7a(this.f7872a.f8046a.aK(), "Cannot return null from a non-@Nullable @Provides method");
        c1576f.n_ = (C1461c) C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method");
        c1576f.f_ = (com.google.android.finsky.dfemodel.ab) C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method");
        c1576f.bD = (C1294w) C0004c.m7a(this.f7872a.f8046a.be(), "Cannot return null from a non-@Nullable @Provides method");
        c1576f.bE = (C2492t) C0004c.m7a(this.f7872a.f8046a.aP(), "Cannot return null from a non-@Nullable @Provides method");
        c1576f.y_ = (C2471a) C0004c.m7a(this.f7872a.f8046a.aR(), "Cannot return null from a non-@Nullable @Provides method");
        c1576f.f8389a = (C1612l) C0004c.m7a(this.f7872a.f8046a.ar(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1717a(C1577g c1577g) {
        c1577g.r_ = (C1287h) C0004c.m7a(this.f7872a.f8046a.aK(), "Cannot return null from a non-@Nullable @Provides method");
        c1577g.n_ = (C1461c) C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method");
        c1577g.f_ = (com.google.android.finsky.dfemodel.ab) C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method");
        c1577g.bD = (C1294w) C0004c.m7a(this.f7872a.f8046a.be(), "Cannot return null from a non-@Nullable @Provides method");
        c1577g.bE = (C2492t) C0004c.m7a(this.f7872a.f8046a.aP(), "Cannot return null from a non-@Nullable @Provides method");
        c1577g.y_ = (C2471a) C0004c.m7a(this.f7872a.f8046a.aR(), "Cannot return null from a non-@Nullable @Provides method");
        c1577g.f8390a = (C1557b) C0004c.m7a(this.f7872a.f8046a.aY(), "Cannot return null from a non-@Nullable @Provides method");
        c1577g.f8391c = (C1463g) C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1718a(C1583n c1583n) {
        c1583n.r_ = (C1287h) C0004c.m7a(this.f7872a.f8046a.aK(), "Cannot return null from a non-@Nullable @Provides method");
        c1583n.n_ = (C1461c) C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method");
        c1583n.f_ = (com.google.android.finsky.dfemodel.ab) C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method");
        c1583n.bD = (C1294w) C0004c.m7a(this.f7872a.f8046a.be(), "Cannot return null from a non-@Nullable @Provides method");
        c1583n.bE = (C2492t) C0004c.m7a(this.f7872a.f8046a.aP(), "Cannot return null from a non-@Nullable @Provides method");
        c1583n.y_ = (C2471a) C0004c.m7a(this.f7872a.f8046a.aR(), "Cannot return null from a non-@Nullable @Provides method");
        c1583n.f8401a = (C1612l) C0004c.m7a(this.f7872a.f8046a.ar(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1719a(C1589w c1589w) {
        c1589w.f8412a = (C2910a) C0004c.m7a(this.f7872a.f8046a.au(), "Cannot return null from a non-@Nullable @Provides method");
        c1589w.f8413b = (C1287h) C0004c.m7a(this.f7872a.f8046a.aK(), "Cannot return null from a non-@Nullable @Provides method");
        c1589w.f8414c = (C0988c) C0004c.m7a(this.f7872a.f8046a.mo2040T(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1713a(com.google.android.finsky.bc.aa aaVar) {
        aaVar.f8380a = (C2910a) C0004c.m7a(this.f7872a.f8046a.au(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1839a(ScrubberView scrubberView) {
        scrubberView.f16048a = (C3115l) this.aq.mo1a();
    }

    public final void mo1935a(InlineTopChartsClusterContentView inlineTopChartsClusterContentView) {
        inlineTopChartsClusterContentView.f22458a = (C2116a) C0004c.m7a(this.f7872a.f8046a.bT(), "Cannot return null from a non-@Nullable @Provides method");
        inlineTopChartsClusterContentView.f22459b = (C1294w) C0004c.m7a(this.f7872a.f8046a.be(), "Cannot return null from a non-@Nullable @Provides method");
        inlineTopChartsClusterContentView.f22460c = (ao) C0004c.m7a(this.f7872a.f8046a.cr(), "Cannot return null from a non-@Nullable @Provides method");
        this.ar.mo1a();
    }

    public final void mo1703a(fa faVar) {
        faVar.af = (C1461c) C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method");
        faVar.ag = (C0988c) C0004c.m7a(this.f7872a.f8046a.mo2040T(), "Cannot return null from a non-@Nullable @Provides method");
        faVar.ah = (C2471a) C0004c.m7a(this.f7872a.f8046a.aR(), "Cannot return null from a non-@Nullable @Provides method");
        faVar.ai = (C1612l) C0004c.m7a(this.f7872a.f8046a.ar(), "Cannot return null from a non-@Nullable @Provides method");
        faVar.aj = (C1611k) C0004c.m7a(this.f7872a.f8046a.av(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1850a(HeterodyneSyncService heterodyneSyncService) {
        heterodyneSyncService.f16397a = (Context) C0004c.m7a(this.f7872a.f8046a.f7981b, "Cannot return null from a non-@Nullable @Provides method");
        heterodyneSyncService.f16398b = (C3170c) this.aw.mo1a();
        heterodyneSyncService.f16399c = (C0986a) C0004c.m7a(this.f7872a.f8046a.mo2041U(), "Cannot return null from a non-@Nullable @Provides method");
        heterodyneSyncService.f16400d = (C2471a) C0004c.m7a(this.f7872a.f8046a.aR(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1851a(C3172f c3172f) {
        c3172f.f5953e = (C2471a) C0004c.m7a(this.f7872a.f8046a.aR(), "Cannot return null from a non-@Nullable @Provides method");
        c3172f.f5954f = (C1287h) C0004c.m7a(this.f7872a.f8046a.aK(), "Cannot return null from a non-@Nullable @Provides method");
        c3172f.f16426a = (Context) C0004c.m7a(this.f7872a.f8046a.f7981b, "Cannot return null from a non-@Nullable @Provides method");
        c3172f.f16427c = (C3170c) this.aw.mo1a();
        c3172f.f16428d = (C0986a) C0004c.m7a(this.f7872a.f8046a.mo2041U(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1792a(C2377c c2377c) {
        c2377c.f11641b = m8134k();
        c2377c.f11642c = m8135l();
        c2377c.f11643d = (C2398f) this.aA.mo1a();
    }

    public final void mo1791a(C2379d c2379d) {
        c2379d.f11641b = m8134k();
        c2379d.f11642c = m8135l();
        c2379d.f11643d = (C2398f) this.aA.mo1a();
        c2379d.f11644e = (C2380e) this.aK.mo1a();
    }

    public final void mo1931a(FloatingHighlightsBannerClusterView floatingHighlightsBannerClusterView) {
        floatingHighlightsBannerClusterView.f22315a = (C1611k) C0004c.m7a(this.f7872a.f8046a.av(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1932a(C4396h c4396h) {
        c4396h.f22297l = (C1612l) C0004c.m7a(this.f7872a.f8046a.ar(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1840a(FlushLogsService flushLogsService) {
        flushLogsService.f16125a = (C1463g) C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method");
        flushLogsService.f16126b = (C0986a) C0004c.m7a(this.f7872a.f8046a.mo2041U(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1841a(C3131d c3131d) {
        c3131d.f16134a = (C1463g) C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method");
        c3131d.f16135c = (C0986a) C0004c.m7a(this.f7872a.f8046a.mo2041U(), "Cannot return null from a non-@Nullable @Provides method");
        c3131d.f16136d = (C4674e) this.ad.mo1a();
    }

    public final void mo1842a(ForegroundCoordinatorService foregroundCoordinatorService) {
        foregroundCoordinatorService.f16143a = (C2471a) C0004c.m7a(this.f7872a.f8046a.aR(), "Cannot return null from a non-@Nullable @Provides method");
        foregroundCoordinatorService.f16144b = (com.google.android.finsky.notification.ab) C0004c.m7a(this.f7872a.f8046a.mo2259r(), "Cannot return null from a non-@Nullable @Provides method");
        foregroundCoordinatorService.f16145c = (C2171b) C0004c.m7a(this.f7872a.f8046a.bo(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1844a(PlayActionButtonV2 playActionButtonV2) {
        playActionButtonV2.f6234q = (C1503a) C0004c.m7a(this.f7872a.f8046a.mo2036P(), "Cannot return null from a non-@Nullable @Provides method");
        playActionButtonV2.f6235r = (C1461c) C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1843a(ClusterHeaderView clusterHeaderView) {
        clusterHeaderView.f16164a = (C1461c) C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method");
        clusterHeaderView.f16165b = (C1612l) C0004c.m7a(this.f7872a.f8046a.ar(), "Cannot return null from a non-@Nullable @Provides method");
        clusterHeaderView.f16166c = (C1606f) C0004c.m7a(this.f7872a.f8046a.cu(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo2001d() {
        this.aL.mo1a();
    }

    public final void mo1845a(ThumbnailImageView thumbnailImageView) {
        thumbnailImageView.A_ = (C1294w) C0004c.m7a(this.f7872a.f8046a.be(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1933a(FlatGenericClusterView flatGenericClusterView) {
        flatGenericClusterView.f22383j = (C1611k) C0004c.m7a(this.f7872a.f8046a.av(), "Cannot return null from a non-@Nullable @Provides method");
        flatGenericClusterView.f22384k = (C1461c) C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1837a(GetInstallReferrerService getInstallReferrerService) {
        getInstallReferrerService.f15752b = (C1461c) C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method");
        getInstallReferrerService.f15753c = (C3011c) C0004c.m7a(this.f7872a.f8046a.mo2026F(), "Cannot return null from a non-@Nullable @Provides method");
        getInstallReferrerService.f15754d = (C2127b) C0004c.m7a(this.f7872a.f8046a.mo2169c(), "Cannot return null from a non-@Nullable @Provides method");
        getInstallReferrerService.f15755e = (C1500a) C0004c.m7a(this.f7872a.f8046a.mo2033M(), "Cannot return null from a non-@Nullable @Provides method");
        getInstallReferrerService.f15756f = (C0988c) C0004c.m7a(this.f7872a.f8046a.mo2040T(), "Cannot return null from a non-@Nullable @Provides method");
        getInstallReferrerService.f15757g = (C1463g) C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1852a(C3189n c3189n) {
        c3189n.f16483a = (C3179d) C0004c.m7a(this.f7872a.m8701a(), "Cannot return null from a non-@Nullable @Provides method");
        C0004c.m7a(this.f7872a.f8046a.f7981b, "Cannot return null from a non-@Nullable @Provides method");
        c3189n.f16484c = new C3186k((C3179d) C0004c.m7a(this.f7872a.m8701a(), "Cannot return null from a non-@Nullable @Provides method"), (C1461c) C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method"), (bb) C0004c.m7a(this.f7872a.f8046a.bZ(), "Cannot return null from a non-@Nullable @Provides method"), new C3185j((C1503a) C0004c.m7a(this.f7872a.f8046a.mo2036P(), "Cannot return null from a non-@Nullable @Provides method"), (C1506e) C0004c.m7a(this.f7872a.f8046a.mo2035O(), "Cannot return null from a non-@Nullable @Provides method"), (C1461c) C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method")), (C2471a) C0004c.m7a(this.f7872a.f8046a.aR(), "Cannot return null from a non-@Nullable @Provides method"));
    }

    public final void mo1853a(C0971t c0971t) {
        c0971t.f5953e = (C2471a) C0004c.m7a(this.f7872a.f8046a.aR(), "Cannot return null from a non-@Nullable @Provides method");
        c0971t.f5954f = (C1287h) C0004c.m7a(this.f7872a.f8046a.aK(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1934a(IllustrationAssistCardView illustrationAssistCardView) {
        illustrationAssistCardView.f22410a = (C1294w) C0004c.m7a(this.f7872a.f8046a.be(), "Cannot return null from a non-@Nullable @Provides method");
        illustrationAssistCardView.f22411b = (C4556b) this.f7869X.mo1a();
    }

    public final void mo1856a(C3339i c3339i) {
        c3339i.f17202c = (C3340g) this.aM.mo1a();
        c3339i.f17204e = (C1627b) C0004c.m7a(this.f7872a.f8046a.cg(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1859a(OptInStateChangedReceiver optInStateChangedReceiver) {
        optInStateChangedReceiver.f17972a = (bb) C0004c.m7a(this.f7872a.f8046a.bZ(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1860a(C3619a c3619a) {
        C0004c.m7a(this.f7872a.f8046a.f7981b, "Cannot return null from a non-@Nullable @Provides method");
        c3619a.f17973a = C0003b.m4b(this.aO);
    }

    public final void mo1937a(JpkrQuickLinksRecyclerView jpkrQuickLinksRecyclerView) {
        jpkrQuickLinksRecyclerView.aG = (C1611k) C0004c.m7a(this.f7872a.f8046a.av(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1936a(JpkrQuickLinksBannerItem jpkrQuickLinksBannerItem) {
        jpkrQuickLinksBannerItem.f22527a = (C1612l) C0004c.m7a(this.f7872a.f8046a.ar(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1865a(ErrorIndicatorWithNotifyLayout errorIndicatorWithNotifyLayout) {
        errorIndicatorWithNotifyLayout.f18862b = C0003b.m4b(this.aP);
    }

    public final void mo1866a(C3166e c3166e) {
        c3166e.f16395n = (C3736d) C0004c.m7a(this.f7872a.f8046a.mo2262u(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1744a(C1874a c1874a) {
        c1874a.f9589d = (Context) C0004c.m7a(this.f7872a.f8046a.f7981b, "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1743a(AuthState authState) {
        authState.f9581i = (Context) C0004c.m7a(this.f7872a.f8046a.f7981b, "Cannot return null from a non-@Nullable @Provides method");
        authState.f9582j = (C1461c) C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1745a(C1880f c1880f) {
        c1880f.f9605c = (Context) C0004c.m7a(this.f7872a.f8046a.f7981b, "Cannot return null from a non-@Nullable @Provides method");
        c1880f.f9606d = (C0988c) C0004c.m7a(this.f7872a.f8046a.mo2040T(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1777a(C2219r c2219r) {
        c2219r.f11072b = (C1461c) C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1847a(FinskyHeaderListLayout finskyHeaderListLayout) {
        finskyHeaderListLayout.f16329a = (C1611k) C0004c.m7a(this.f7872a.f8046a.av(), "Cannot return null from a non-@Nullable @Provides method");
        finskyHeaderListLayout.f16330b = (C1461c) C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1848a(FinskyTabStrip finskyTabStrip) {
        finskyTabStrip.f16347a = (C1611k) C0004c.m7a(this.f7872a.f8046a.av(), "Cannot return null from a non-@Nullable @Provides method");
        finskyTabStrip.f16348b = (C1461c) C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1849a(FinskyTabTextView finskyTabTextView) {
        finskyTabTextView.f16358b = (C1461c) C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1778a(C2236c c2236c) {
        c2236c.f11141a = (C2471a) C0004c.m7a(this.f7872a.f8046a.aR(), "Cannot return null from a non-@Nullable @Provides method");
        c2236c.f11142c = (C4640d) C0004c.m7a(this.f7872a.f8046a.bE(), "Cannot return null from a non-@Nullable @Provides method");
        c2236c.f11143d = (C2206c) C0004c.m7a(this.f7872a.f8046a.ah(), "Cannot return null from a non-@Nullable @Provides method");
        c2236c.f11144e = (C1627b) C0004c.m7a(this.f7872a.f8046a.cg(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1938a(FlatMerchBannerView flatMerchBannerView) {
        flatMerchBannerView.f22551a = (C1612l) C0004c.m7a(this.f7872a.f8046a.ar(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1940a(MiniCategoriesClusterView miniCategoriesClusterView) {
        miniCategoriesClusterView.f22597g = (C1611k) C0004c.m7a(this.f7872a.f8046a.av(), "Cannot return null from a non-@Nullable @Provides method");
        miniCategoriesClusterView.f22598h = (C1461c) C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1939a(MiniCategoriesCard miniCategoriesCard) {
        miniCategoriesCard.f22590f = (C1612l) C0004c.m7a(this.f7872a.f8046a.ar(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1941a(MusicMerchBannerView musicMerchBannerView) {
        musicMerchBannerView.f22659a = (C1612l) C0004c.m7a(this.f7872a.f8046a.ar(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1927a(C4367a c4367a) {
        c4367a.ah = (C2471a) C0004c.m7a(this.f7872a.f8046a.aR(), "Cannot return null from a non-@Nullable @Provides method");
        c4367a.af = (C1287h) C0004c.m7a(this.f7872a.f8046a.aK(), "Cannot return null from a non-@Nullable @Provides method");
        c4367a.ag = (C1463g) C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method");
        c4367a.am = (C2199l) C0004c.m7a(this.f7872a.f8046a.ai(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1867a(NestedChildRecyclerView nestedChildRecyclerView) {
        nestedChildRecyclerView.aH = (C3766c) this.aQ.mo1a();
    }

    public final void mo1868a(NestedParentRecyclerView nestedParentRecyclerView) {
        nestedParentRecyclerView.aG = (C3766c) this.aQ.mo1a();
    }

    public final void mo2002e() {
        this.aL.mo1a();
    }

    public final void mo1780a(C2273c c2273c) {
        c2273c.f11269a = C0003b.m4b(this.aR);
        c2273c.f11270c = (C2471a) C0004c.m7a(this.f7872a.f8046a.aR(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1782a(C2278e c2278e) {
        c2278e.f11286d = this.f7872a.f8046a.aa();
    }

    public final void mo1781a(C2277d c2277d) {
        c2277d.f11282e = (C2274a) C0004c.m7a(this.f7872a.f8046a.ae(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1783a(C2282a c2282a) {
        c2282a.r_ = (C1287h) C0004c.m7a(this.f7872a.f8046a.aK(), "Cannot return null from a non-@Nullable @Provides method");
        c2282a.n_ = (C1461c) C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method");
        c2282a.f_ = (com.google.android.finsky.dfemodel.ab) C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method");
        c2282a.bD = (C1294w) C0004c.m7a(this.f7872a.f8046a.be(), "Cannot return null from a non-@Nullable @Provides method");
        c2282a.bE = (C2492t) C0004c.m7a(this.f7872a.f8046a.aP(), "Cannot return null from a non-@Nullable @Provides method");
        c2282a.y_ = (C2471a) C0004c.m7a(this.f7872a.f8046a.aR(), "Cannot return null from a non-@Nullable @Provides method");
        c2282a.ah = (C3813k) this.aY.mo1a();
    }

    public final void mo1942a(C4462b c4462b) {
        c4462b.f22698p = (C3800x) this.ba.mo1a();
        c4462b.f22699q = (com.google.android.finsky.notification.ac) this.bc.mo1a();
        c4462b.f22700r = (C3813k) this.aY.mo1a();
        c4462b.f22701s = (com.google.android.finsky.notification.ab) C0004c.m7a(this.f7872a.f8046a.mo2259r(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1871a(C3803r c3803r) {
        c3803r.f19100f = C0003b.m4b(this.bi);
        c3803r.f19101g = C0003b.m4b(this.aW);
        c3803r.f19102h = (C3817p) this.bj.mo1a();
        c3803r.f19103i = (C3800x) this.ba.mo1a();
        c3803r.f19104j = (com.google.android.finsky.notification.ac) this.bc.mo1a();
    }

    public final void mo1869a(C3791f c3791f) {
        c3791f.f19066c = (C3784h) this.bn.mo1a();
        c3791f.f19067d = (C1463g) C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1870a(C3794i c3794i) {
        c3794i.f19070a = (com.google.android.finsky.notification.impl.aa) this.bd.mo1a();
        this.bf.mo1a();
        c3794i.f19071c = (com.google.android.finsky.notification.ab) C0004c.m7a(this.f7872a.f8046a.mo2259r(), "Cannot return null from a non-@Nullable @Provides method");
        c3794i.f19072d = (C3788c) this.bi.mo1a();
        c3794i.f19073e = new C3796k((C2471a) C0004c.m7a(this.f7872a.f8046a.aR(), "Cannot return null from a non-@Nullable @Provides method"), (C3027b) C0004c.m7a(this.f7872a.f8046a.bt(), "Cannot return null from a non-@Nullable @Provides method"));
    }

    public final void mo2003f() {
    }

    public final void mo1872a(NotificationsSettingsActivity notificationsSettingsActivity) {
        notificationsSettingsActivity.f19158a = (C2471a) C0004c.m7a(this.f7872a.f8046a.aR(), "Cannot return null from a non-@Nullable @Provides method");
        notificationsSettingsActivity.f19159b = (C0988c) C0004c.m7a(this.f7872a.f8046a.mo2040T(), "Cannot return null from a non-@Nullable @Provides method");
        notificationsSettingsActivity.f19160c = (C2910a) C0004c.m7a(this.f7872a.f8046a.au(), "Cannot return null from a non-@Nullable @Provides method");
        notificationsSettingsActivity.f19161d = (C3982a) C0004c.m7a(this.f7872a.f8046a.bK(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1943a(NotificationCardRowView notificationCardRowView) {
        notificationCardRowView.f22719z = (C3817p) this.bj.mo1a();
    }

    public final void mo1873a(RegisteredReceiver registeredReceiver) {
        registeredReceiver.f19224a = (C3851f) C0004c.m7a(this.f7872a.f8046a.mo2254m(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1972a(ConsentDialog consentDialog) {
        consentDialog.f24302u = (C3982a) C0004c.m7a(this.f7872a.f8046a.bK(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1989a(C4752d c4752d) {
        c4752d.f24571a = (Context) C0004c.m7a(this.f7872a.f8046a.f7981b, "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1983a(com.google.android.finsky.verifier.impl.aw awVar) {
        awVar.f24412c = (Context) C0004c.m7a(this.f7872a.f8046a.f7981b, "Cannot return null from a non-@Nullable @Provides method");
        awVar.f24413d = (C1461c) C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method");
        awVar.f24414e = (C4817d) C0004c.m7a(this.f7872a.f8046a.bY(), "Cannot return null from a non-@Nullable @Provides method");
        awVar.f24415f = (C3851f) C0004c.m7a(this.f7872a.f8046a.mo2254m(), "Cannot return null from a non-@Nullable @Provides method");
        awVar.f24416g = (C3849a) C0004c.m7a(this.f7872a.f8046a.mo2266y(), "Cannot return null from a non-@Nullable @Provides method");
        awVar.f24420a = C0003b.m4b(this.f7890s);
        awVar.f24421b = C0003b.m4b(this.aR);
    }

    public final void mo1992a(dk dkVar) {
        dkVar.f24598b = C0003b.m4b(this.f7890s);
        dkVar.f24599c = (Context) C0004c.m7a(this.f7872a.f8046a.f7981b, "Cannot return null from a non-@Nullable @Provides method");
        dkVar.f24600d = (C1461c) C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method");
        dkVar.f24601e = (C2206c) C0004c.m7a(this.f7872a.f8046a.ah(), "Cannot return null from a non-@Nullable @Provides method");
        dkVar.f24602f = (com.google.android.finsky.notification.ab) C0004c.m7a(this.f7872a.f8046a.mo2259r(), "Cannot return null from a non-@Nullable @Provides method");
        dkVar.f24603g = (ForegroundCoordinator) C0004c.m7a(this.f7872a.f8046a.bz(), "Cannot return null from a non-@Nullable @Provides method");
        dkVar.f24604h = (C4817d) C0004c.m7a(this.f7872a.f8046a.bY(), "Cannot return null from a non-@Nullable @Provides method");
        dkVar.f24605i = (C2471a) C0004c.m7a(this.f7872a.f8046a.aR(), "Cannot return null from a non-@Nullable @Provides method");
        dkVar.f24606j = (C1500a) C0004c.m7a(this.f7872a.f8046a.mo2033M(), "Cannot return null from a non-@Nullable @Provides method");
        dkVar.f24607k = (com.google.android.finsky.dy.ad) C0004c.m7a(this.f7872a.f8046a.bq(), "Cannot return null from a non-@Nullable @Provides method");
        dkVar.f24608l = (ag) C0004c.m7a(this.f7872a.f8046a.br(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1988a(bx bxVar) {
        bxVar.f24492a = C0003b.m4b(this.f7890s);
        bxVar.f24493b = (C1500a) C0004c.m7a(this.f7872a.f8046a.mo2033M(), "Cannot return null from a non-@Nullable @Provides method");
        bxVar.f24494c = (C1461c) C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method");
        bxVar.f24495d = (ForegroundCoordinator) C0004c.m7a(this.f7872a.f8046a.bz(), "Cannot return null from a non-@Nullable @Provides method");
        bxVar.f24496e = (C4817d) C0004c.m7a(this.f7872a.f8046a.bY(), "Cannot return null from a non-@Nullable @Provides method");
        bxVar.f24497f = (C2266a) C0004c.m7a(this.f7872a.f8046a.mo2258q(), "Cannot return null from a non-@Nullable @Provides method");
        bxVar.f24498g = (com.google.android.finsky.notification.ab) C0004c.m7a(this.f7872a.f8046a.mo2259r(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1979a(C4731c c4731c) {
        c4731c.f24361b = (Context) C0004c.m7a(this.f7872a.f8046a.f7981b, "Cannot return null from a non-@Nullable @Provides method");
        c4731c.f24362c = (C2471a) C0004c.m7a(this.f7872a.f8046a.aR(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1985a(bg bgVar) {
        bgVar.f24448b = (Context) C0004c.m7a(this.f7872a.f8046a.f7981b, "Cannot return null from a non-@Nullable @Provides method");
        bgVar.f24449c = (C1500a) C0004c.m7a(this.f7872a.f8046a.mo2033M(), "Cannot return null from a non-@Nullable @Provides method");
        bgVar.f24450d = (C3851f) C0004c.m7a(this.f7872a.f8046a.mo2254m(), "Cannot return null from a non-@Nullable @Provides method");
        bgVar.f24451e = (C4569e) C0004c.m7a(this.f7872a.f8046a.mo2039S(), "Cannot return null from a non-@Nullable @Provides method");
        bgVar.f24452f = (C2909c) C0004c.m7a(this.f7872a.f8046a.mo2241e(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1974a(PackageVerificationReceiver packageVerificationReceiver) {
        packageVerificationReceiver.f24305a = (C2471a) C0004c.m7a(this.f7872a.f8046a.aR(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1976a(PackageWarningDialog packageWarningDialog) {
        packageWarningDialog.f24315q = (com.google.android.finsky.notification.ab) C0004c.m7a(this.f7872a.f8046a.mo2259r(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1984a(com.google.android.finsky.verifier.impl.az azVar) {
        azVar.f24412c = (Context) C0004c.m7a(this.f7872a.f8046a.f7981b, "Cannot return null from a non-@Nullable @Provides method");
        azVar.f24413d = (C1461c) C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method");
        azVar.f24414e = (C4817d) C0004c.m7a(this.f7872a.f8046a.bY(), "Cannot return null from a non-@Nullable @Provides method");
        azVar.f24415f = (C3851f) C0004c.m7a(this.f7872a.f8046a.mo2254m(), "Cannot return null from a non-@Nullable @Provides method");
        azVar.f24416g = (C3849a) C0004c.m7a(this.f7872a.f8046a.mo2266y(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1978a(VerifyInstalledPackagesReceiver verifyInstalledPackagesReceiver) {
        verifyInstalledPackagesReceiver.f24343a = (C2266a) C0004c.m7a(this.f7872a.f8046a.mo2258q(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1996a(C4769v c4769v) {
        c4769v.f24709a = (Context) C0004c.m7a(this.f7872a.f8046a.f7981b, "Cannot return null from a non-@Nullable @Provides method");
        c4769v.f24710b = (C1461c) C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method");
        c4769v.f24711c = (C1500a) C0004c.m7a(this.f7872a.f8046a.mo2033M(), "Cannot return null from a non-@Nullable @Provides method");
        c4769v.f24712d = (C4726d) C0004c.m7a(this.f7872a.f8046a.bp(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1973a(PackageVerificationApiService packageVerificationApiService) {
        packageVerificationApiService.f24303a = (C1461c) C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1993a(eb ebVar) {
        ebVar.f24653a = (C2127b) C0004c.m7a(this.f7872a.f8046a.mo2169c(), "Cannot return null from a non-@Nullable @Provides method");
        ebVar.f24654b = (C2471a) C0004c.m7a(this.f7872a.f8046a.aR(), "Cannot return null from a non-@Nullable @Provides method");
        ebVar.f24655c = (C1461c) C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1987a(bw bwVar) {
        bwVar.f24484a = (Context) C0004c.m7a(this.f7872a.f8046a.f7981b, "Cannot return null from a non-@Nullable @Provides method");
        bwVar.f24485b = (C1461c) C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method");
        bwVar.f24486c = (ForegroundCoordinator) C0004c.m7a(this.f7872a.f8046a.bz(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1982a(com.google.android.finsky.verifier.impl.av avVar) {
        avVar.f24407a = (C2909c) C0004c.m7a(this.f7872a.f8046a.mo2241e(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1990a(de deVar) {
        deVar.f24581a = (C1461c) C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method");
        deVar.f24590j = (C2471a) C0004c.m7a(this.f7872a.f8046a.aR(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1975a(PackageVerificationService packageVerificationService) {
        packageVerificationService.f24308a = (com.google.android.finsky.dy.ad) C0004c.m7a(this.f7872a.f8046a.bq(), "Cannot return null from a non-@Nullable @Provides method");
        packageVerificationService.f24309b = (ag) C0004c.m7a(this.f7872a.f8046a.br(), "Cannot return null from a non-@Nullable @Provides method");
        packageVerificationService.f24310c = (C1461c) C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1986a(com.google.android.finsky.verifier.impl.br brVar) {
        brVar.f24474j = (Context) C0004c.m7a(this.f7872a.f8046a.f7981b, "Cannot return null from a non-@Nullable @Provides method");
        brVar.f24475k = (C1461c) C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method");
        brVar.f24476l = (C4726d) C0004c.m7a(this.f7872a.f8046a.bp(), "Cannot return null from a non-@Nullable @Provides method");
        brVar.f24477m = (C1500a) C0004c.m7a(this.f7872a.f8046a.mo2033M(), "Cannot return null from a non-@Nullable @Provides method");
        brVar.f24478n = (ag) C0004c.m7a(this.f7872a.f8046a.br(), "Cannot return null from a non-@Nullable @Provides method");
        brVar.f24479o = (com.google.android.finsky.dy.ad) C0004c.m7a(this.f7872a.f8046a.bq(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1995a(C4767t c4767t) {
        c4767t.f24705c = (C1461c) C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method");
        c4767t.f24706d = (C4817d) C0004c.m7a(this.f7872a.f8046a.bY(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1980a(com.google.android.finsky.verifier.impl.an anVar) {
        anVar.f24388a = (Context) C0004c.m7a(this.f7872a.f8046a.f7981b, "Cannot return null from a non-@Nullable @Provides method");
        anVar.f24389b = (com.google.android.finsky.notification.ab) C0004c.m7a(this.f7872a.f8046a.mo2259r(), "Cannot return null from a non-@Nullable @Provides method");
        anVar.f24390c = (C1461c) C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1977a(PlayProtectHomeActivity playProtectHomeActivity) {
        playProtectHomeActivity.f24334a = (C2471a) C0004c.m7a(this.f7872a.f8046a.aR(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1981a(ar arVar) {
        arVar.f24397a = (Context) C0004c.m7a(this.f7872a.f8046a.f7981b, "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1994a(C4756h c4756h) {
        c4756h.f24678a = (Context) C0004c.m7a(this.f7872a.f8046a.f7981b, "Cannot return null from a non-@Nullable @Provides method");
        c4756h.f24679b = (C1461c) C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method");
        c4756h.f24680c = (C4817d) C0004c.m7a(this.f7872a.f8046a.bY(), "Cannot return null from a non-@Nullable @Provides method");
        c4756h.f24681d = (com.google.android.finsky.dy.ad) C0004c.m7a(this.f7872a.f8046a.bq(), "Cannot return null from a non-@Nullable @Provides method");
        c4756h.f24682e = (ag) C0004c.m7a(this.f7872a.f8046a.br(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1991a(di diVar) {
        diVar.f5953e = (C2471a) C0004c.m7a(this.f7872a.f8046a.aR(), "Cannot return null from a non-@Nullable @Provides method");
        diVar.f5954f = (C1287h) C0004c.m7a(this.f7872a.f8046a.aK(), "Cannot return null from a non-@Nullable @Provides method");
        diVar.f24593a = (Context) C0004c.m7a(this.f7872a.f8046a.f7981b, "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1944a(PaddedCollectionRowLayout paddedCollectionRowLayout) {
        paddedCollectionRowLayout.f22729i = (C1611k) C0004c.m7a(this.f7872a.f8046a.av(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1875a(C1045b c1045b) {
        c1045b.r_ = (C1287h) C0004c.m7a(this.f7872a.f8046a.aK(), "Cannot return null from a non-@Nullable @Provides method");
        c1045b.n_ = (C1461c) C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method");
        c1045b.f_ = (com.google.android.finsky.dfemodel.ab) C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method");
        c1045b.bD = (C1294w) C0004c.m7a(this.f7872a.f8046a.be(), "Cannot return null from a non-@Nullable @Provides method");
        c1045b.bE = (C2492t) C0004c.m7a(this.f7872a.f8046a.aP(), "Cannot return null from a non-@Nullable @Provides method");
        c1045b.y_ = (C2471a) C0004c.m7a(this.f7872a.f8046a.aR(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1874a(C2334a c2334a) {
        C0004c.m7a(this.f7872a.f8046a.aK(), "Cannot return null from a non-@Nullable @Provides method");
        c2334a.f11490q = (C3982a) C0004c.m7a(this.f7872a.f8046a.bK(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1898a(AlarmEngineService alarmEngineService) {
        alarmEngineService.f20131a = (ak) C0004c.m7a(this.f7872a.f8046a.ca(), "Cannot return null from a non-@Nullable @Provides method");
        alarmEngineService.f20132b = new C4042t((Context) C0004c.m7a(this.f7872a.f8046a.f7981b, "Cannot return null from a non-@Nullable @Provides method"), (ai) C0004c.m7a(this.f7872a.f8046a.bB(), "Cannot return null from a non-@Nullable @Provides method"), (C1461c) C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method"), (bj) this.bp.mo1a());
        alarmEngineService.f20133c = (C2471a) C0004c.m7a(this.f7872a.f8046a.aR(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1900a(PhoneskyJobSchedulerJobService phoneskyJobSchedulerJobService) {
        phoneskyJobSchedulerJobService.f20144a = (ak) C0004c.m7a(this.f7872a.f8046a.ca(), "Cannot return null from a non-@Nullable @Provides method");
        phoneskyJobSchedulerJobService.f20145b = (C2471a) C0004c.m7a(this.f7872a.f8046a.aR(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1899a(FirebaseJobDispatcherService firebaseJobDispatcherService) {
        firebaseJobDispatcherService.f20135d = (ak) C0004c.m7a(this.f7872a.f8046a.ca(), "Cannot return null from a non-@Nullable @Provides method");
        firebaseJobDispatcherService.f20136e = (C2471a) C0004c.m7a(this.f7872a.f8046a.aR(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1876a(AutoTransitionImageView autoTransitionImageView) {
        autoTransitionImageView.f19323a = (C1612l) C0004c.m7a(this.f7872a.f8046a.ar(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1889a(C3893r c3893r) {
        c3893r.f19348p = (C1503a) C0004c.m7a(this.f7872a.f8046a.mo2036P(), "Cannot return null from a non-@Nullable @Provides method");
        c3893r.f19349q = (C1461c) C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1877a(FlatCardViewDoubleWideAd flatCardViewDoubleWideAd) {
        flatCardViewDoubleWideAd.f19348p = (C1503a) C0004c.m7a(this.f7872a.f8046a.mo2036P(), "Cannot return null from a non-@Nullable @Provides method");
        flatCardViewDoubleWideAd.f19349q = (C1461c) C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method");
        flatCardViewDoubleWideAd.E_ = (C2581g) C0004c.m7a(this.f7872a.f8046a.cm(), "Cannot return null from a non-@Nullable @Provides method");
        flatCardViewDoubleWideAd.f19371d = (C1612l) C0004c.m7a(this.f7872a.f8046a.ar(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1878a(FlatCardViewMini flatCardViewMini) {
        flatCardViewMini.f19348p = (C1503a) C0004c.m7a(this.f7872a.f8046a.mo2036P(), "Cannot return null from a non-@Nullable @Provides method");
        flatCardViewMini.f19349q = (C1461c) C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method");
        flatCardViewMini.f19387a = (C1611k) C0004c.m7a(this.f7872a.f8046a.av(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1881a(FlatFeaturedCardView flatFeaturedCardView) {
        flatFeaturedCardView.f19348p = (C1503a) C0004c.m7a(this.f7872a.f8046a.mo2036P(), "Cannot return null from a non-@Nullable @Provides method");
        flatFeaturedCardView.f19349q = (C1461c) C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method");
        flatFeaturedCardView.f19420a = (C1611k) C0004c.m7a(this.f7872a.f8046a.av(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1882a(FlatFeaturedWideCardView flatFeaturedWideCardView) {
        flatFeaturedWideCardView.f19348p = (C1503a) C0004c.m7a(this.f7872a.f8046a.mo2036P(), "Cannot return null from a non-@Nullable @Provides method");
        flatFeaturedWideCardView.f19349q = (C1461c) C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method");
        flatFeaturedWideCardView.f19420a = (C1611k) C0004c.m7a(this.f7872a.f8046a.av(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1879a(FlatCardViewReEngagement flatCardViewReEngagement) {
        flatCardViewReEngagement.f19348p = (C1503a) C0004c.m7a(this.f7872a.f8046a.mo2036P(), "Cannot return null from a non-@Nullable @Provides method");
        flatCardViewReEngagement.f19349q = (C1461c) C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method");
        flatCardViewReEngagement.f19407e = (C1612l) C0004c.m7a(this.f7872a.f8046a.ar(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1883a(PlayCardJpkrEditorialView playCardJpkrEditorialView) {
        playCardJpkrEditorialView.f19443r = (C1461c) C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1884a(PlayCardMoviesMdpView playCardMoviesMdpView) {
        playCardMoviesMdpView.f19444A = (C2577b) this.al.mo1a();
        playCardMoviesMdpView.f19445B = (C1011h) C0004c.m7a(this.f7872a.f8046a.ci(), "Cannot return null from a non-@Nullable @Provides method");
        playCardMoviesMdpView.f19446C = (C1612l) C0004c.m7a(this.f7872a.f8046a.ar(), "Cannot return null from a non-@Nullable @Provides method");
        playCardMoviesMdpView.f19447D = (ao) C0004c.m7a(this.f7872a.f8046a.cr(), "Cannot return null from a non-@Nullable @Provides method");
        playCardMoviesMdpView.f19448E = (com.google.android.finsky.playcard.ac) C0004c.m7a(this.f7872a.f8046a.mo2245h(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1885a(PlayCardViewAvatar playCardViewAvatar) {
        playCardViewAvatar.f19475a = (C1503a) C0004c.m7a(this.f7872a.f8046a.mo2036P(), "Cannot return null from a non-@Nullable @Provides method");
        playCardViewAvatar.f19476b = (C1461c) C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1886a(PlayCardViewListingSmall playCardViewListingSmall) {
        playCardViewListingSmall.f19486m = (C1461c) C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1887a(PlayCardViewMyAppsV2 playCardViewMyAppsV2) {
        playCardViewMyAppsV2.f19492a = (C1461c) C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1888a(PlayCardViewRate playCardViewRate) {
        playCardViewRate.f19517b = (C0988c) C0004c.m7a(this.f7872a.f8046a.mo2040T(), "Cannot return null from a non-@Nullable @Provides method");
        playCardViewRate.f19518d = (C3964c) C0004c.m7a(this.f7872a.f8046a.ac(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1890a(C3895x c3895x) {
        c3895x.f19348p = (C1503a) C0004c.m7a(this.f7872a.f8046a.mo2036P(), "Cannot return null from a non-@Nullable @Provides method");
        c3895x.f19349q = (C1461c) C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method");
        c3895x.f19420a = (C1611k) C0004c.m7a(this.f7872a.f8046a.av(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1880a(FlatCardViewScreenshot flatCardViewScreenshot) {
        flatCardViewScreenshot.f19348p = (C1503a) C0004c.m7a(this.f7872a.f8046a.mo2036P(), "Cannot return null from a non-@Nullable @Provides method");
        flatCardViewScreenshot.f19349q = (C1461c) C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method");
        flatCardViewScreenshot.f19408a = (C3903c) C0004c.m7a(this.f7872a.f8046a.cF(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo2004g() {
        C0004c.m7a(this.f7872a.f8046a.bR(), "Cannot return null from a non-@Nullable @Provides method");
        C0004c.m7a(this.f7872a.f8046a.ar(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1913a(C4248d c4248d) {
        c4248d.aG = (C1611k) C0004c.m7a(this.f7872a.f8046a.av(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1912a(C4245a c4245a) {
        c4245a.f21469a = (C1612l) C0004c.m7a(this.f7872a.f8046a.ar(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1998a(PlayModuleService playModuleService) {
        playModuleService.f25114c = (C2320a) C0004c.m7a(this.f7872a.f8046a.mo2032L(), "Cannot return null from a non-@Nullable @Provides method");
        playModuleService.f25115d = (C1461c) C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method");
        playModuleService.f25116e = (C1463g) C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method");
        playModuleService.f25117f = (C1287h) C0004c.m7a(this.f7872a.f8046a.aK(), "Cannot return null from a non-@Nullable @Provides method");
        playModuleService.f25118g = (C3027b) C0004c.m7a(this.f7872a.f8046a.bt(), "Cannot return null from a non-@Nullable @Provides method");
        playModuleService.f25119h = (C0988c) C0004c.m7a(this.f7872a.f8046a.mo2040T(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1891a(PlayPassHeaderView playPassHeaderView) {
        C0004c.m7a(this.f7872a.f8046a.av(), "Cannot return null from a non-@Nullable @Provides method");
        playPassHeaderView.f19866a = (C1612l) C0004c.m7a(this.f7872a.f8046a.ar(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1892a(C3923a c3923a) {
        c3923a.r_ = (C1287h) C0004c.m7a(this.f7872a.f8046a.aK(), "Cannot return null from a non-@Nullable @Provides method");
        c3923a.n_ = (C1461c) C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method");
        c3923a.f_ = (com.google.android.finsky.dfemodel.ab) C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method");
        c3923a.bD = (C1294w) C0004c.m7a(this.f7872a.f8046a.be(), "Cannot return null from a non-@Nullable @Provides method");
        c3923a.bE = (C2492t) C0004c.m7a(this.f7872a.f8046a.aP(), "Cannot return null from a non-@Nullable @Provides method");
        c3923a.y_ = (C2471a) C0004c.m7a(this.f7872a.f8046a.aR(), "Cannot return null from a non-@Nullable @Provides method");
        c3923a.f19873a = (C1867w) C0004c.m7a(this.f7872a.f8046a.aE(), "Cannot return null from a non-@Nullable @Provides method");
        c3923a.f19874c = (C1869y) C0004c.m7a(this.f7872a.f8046a.aA(), "Cannot return null from a non-@Nullable @Provides method");
        c3923a.f19875f = (C4774e) C0004c.m7a(this.f7872a.f8046a.bk(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1894a(C3928a c3928a) {
        c3928a.f19889e = (C1287h) C0004c.m7a(this.f7872a.f8046a.aK(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1895a(C3930c c3930c) {
        c3930c.ah = (C2471a) C0004c.m7a(this.f7872a.f8046a.aR(), "Cannot return null from a non-@Nullable @Provides method");
        c3930c.af = (C3934g) C0004c.m7a(this.f7872a.f8046a.mo2243f(), "Cannot return null from a non-@Nullable @Provides method");
        c3930c.ag = (C2162a) C0004c.m7a(this.f7872a.f8046a.bn(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1893a(PreregistrationDialogView preregistrationDialogView) {
        preregistrationDialogView.f19882a = (C1294w) C0004c.m7a(this.f7872a.f8046a.be(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1945a(QuickLinksBannerItemPillView quickLinksBannerItemPillView) {
        quickLinksBannerItemPillView.f21469a = (C1612l) C0004c.m7a(this.f7872a.f8046a.ar(), "Cannot return null from a non-@Nullable @Provides method");
        quickLinksBannerItemPillView.f22777k = (C1461c) C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1858a(InstantAppsInstallEntryActivity instantAppsInstallEntryActivity) {
        instantAppsInstallEntryActivity.f6320q = (C1226a) this.bq.mo1a();
        instantAppsInstallEntryActivity.f6321r = (C1229c) this.bs.mo1a();
        C3615o c3615o = new C3615o();
        this.bt.mo1a();
    }

    public final void mo1857a(InstantAppsInstallDialogActivity instantAppsInstallDialogActivity) {
        instantAppsInstallDialogActivity.f6320q = (C1226a) this.bq.mo1a();
        instantAppsInstallDialogActivity.f6321r = (C1229c) this.bs.mo1a();
        this.bt.mo1a();
    }

    public final void mo2005h() {
        this.bt.mo1a();
        C3615o c3615o = new C3615o();
    }

    public final void mo1896a(PublicReviewsActivity publicReviewsActivity) {
        publicReviewsActivity.f19995q = (C1612l) C0004c.m7a(this.f7872a.f8046a.ar(), "Cannot return null from a non-@Nullable @Provides method");
        publicReviewsActivity.f19996r = (C0988c) C0004c.m7a(this.f7872a.f8046a.mo2040T(), "Cannot return null from a non-@Nullable @Provides method");
        publicReviewsActivity.f19997s = (C1461c) C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1795a(C2498a c2498a) {
        c2498a.f5953e = (C2471a) C0004c.m7a(this.f7872a.f8046a.aR(), "Cannot return null from a non-@Nullable @Provides method");
        c2498a.f5954f = (C1287h) C0004c.m7a(this.f7872a.f8046a.aK(), "Cannot return null from a non-@Nullable @Provides method");
        c2498a.f13441a = (Context) C0004c.m7a(this.f7872a.f8046a.f7981b, "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1897a(SafeModeService safeModeService) {
        safeModeService.f20122a = (C2568a) C0004c.m7a(this.f7872a.f8046a.bI(), "Cannot return null from a non-@Nullable @Provides method");
        safeModeService.f20123b = (C1287h) C0004c.m7a(this.f7872a.f8046a.aK(), "Cannot return null from a non-@Nullable @Provides method");
        safeModeService.f20124c = (C3982a) C0004c.m7a(this.f7872a.f8046a.bK(), "Cannot return null from a non-@Nullable @Provides method");
        safeModeService.f20125d = (C1465m) C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method");
        safeModeService.f20126e = (C1461c) C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method");
        safeModeService.f20127f = (C2471a) C0004c.m7a(this.f7872a.f8046a.aR(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1901a(ScreenshotView screenshotView) {
        screenshotView.f20346a = (C1612l) C0004c.m7a(this.f7872a.f8046a.ar(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1902a(ScreenshotsActivityV2 screenshotsActivityV2) {
        screenshotsActivityV2.f20351s = (C1294w) C0004c.m7a(this.f7872a.f8046a.be(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1946a(SearchListResultsOutlinedRowLayout searchListResultsOutlinedRowLayout) {
        searchListResultsOutlinedRowLayout.f22798i = (C1611k) C0004c.m7a(this.f7872a.f8046a.av(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1816a(C2710a c2710a) {
        c2710a.f5953e = (C2471a) C0004c.m7a(this.f7872a.f8046a.aR(), "Cannot return null from a non-@Nullable @Provides method");
        c2710a.f5954f = (C1287h) C0004c.m7a(this.f7872a.f8046a.aK(), "Cannot return null from a non-@Nullable @Provides method");
        c2710a.f14873a = (C0986a) C0004c.m7a(this.f7872a.f8046a.mo2041U(), "Cannot return null from a non-@Nullable @Provides method");
        c2710a.f14874c = (C3646a) C0004c.m7a(this.f7872a.f8046a.mo2029I(), "Cannot return null from a non-@Nullable @Provides method");
        c2710a.f14875d = (C3960a) C0004c.m7a(this.f7872a.f8046a.mo2265x(), "Cannot return null from a non-@Nullable @Provides method");
        c2710a.f14876g = (Context) C0004c.m7a(this.f7872a.f8046a.f7981b, "Cannot return null from a non-@Nullable @Provides method");
        c2710a.f14877i = (C2824a) this.bu.mo1a();
        c2710a.f14878j = (C1461c) C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method");
        c2710a.f14879k = (C2206c) C0004c.m7a(this.f7872a.f8046a.ah(), "Cannot return null from a non-@Nullable @Provides method");
        c2710a.f14880l = (C2830g) this.bv.mo1a();
    }

    public final void mo1907a(C4102l c4102l) {
        c4102l.f20518a = (C2471a) C0004c.m7a(this.f7872a.f8046a.aR(), "Cannot return null from a non-@Nullable @Provides method");
        c4102l.f20519b = (C0986a) C0004c.m7a(this.f7872a.f8046a.mo2041U(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1904a(GaiaAuthActivity gaiaAuthActivity) {
        gaiaAuthActivity.f20492q = (C2471a) C0004c.m7a(this.f7872a.f8046a.aR(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1906a(C4092a c4092a) {
        c4092a.f20498a = (C2471a) C0004c.m7a(this.f7872a.f8046a.aR(), "Cannot return null from a non-@Nullable @Provides method");
        c4092a.f20499b = (C2838a) C0004c.m7a(this.f7872a.f8046a.bW(), "Cannot return null from a non-@Nullable @Provides method");
        c4092a.f20500c = (C1461c) C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1905a(SettingsActivity settingsActivity) {
        settingsActivity.f20468c = (Context) C0004c.m7a(this.f7872a.f8046a.f7981b, "Cannot return null from a non-@Nullable @Provides method");
        settingsActivity.f20469d = (C0988c) C0004c.m7a(this.f7872a.f8046a.mo2040T(), "Cannot return null from a non-@Nullable @Provides method");
        settingsActivity.f20470e = (C2910a) C0004c.m7a(this.f7872a.f8046a.au(), "Cannot return null from a non-@Nullable @Provides method");
        settingsActivity.f20471f = (C2471a) C0004c.m7a(this.f7872a.f8046a.aR(), "Cannot return null from a non-@Nullable @Provides method");
        settingsActivity.f20472g = (C2127b) C0004c.m7a(this.f7872a.f8046a.mo2169c(), "Cannot return null from a non-@Nullable @Provides method");
        settingsActivity.f20473i = (C3982a) C0004c.m7a(this.f7872a.f8046a.bK(), "Cannot return null from a non-@Nullable @Provides method");
        settingsActivity.f20474j = (C2838a) C0004c.m7a(this.f7872a.f8046a.bW(), "Cannot return null from a non-@Nullable @Provides method");
        settingsActivity.f20475k = (C1461c) C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method");
        C0004c.m7a(this.f7872a.f8046a.bx(), "Cannot return null from a non-@Nullable @Provides method");
        settingsActivity.f20476l = (C1500a) C0004c.m7a(this.f7872a.f8046a.mo2033M(), "Cannot return null from a non-@Nullable @Provides method");
        settingsActivity.f20477m = (C1556d) C0004c.m7a(this.f7872a.f8046a.ay(), "Cannot return null from a non-@Nullable @Provides method");
        settingsActivity.f20478n = this.f7872a.f8046a.mo2263v();
        C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method");
        settingsActivity.f20479o = (C1287h) C0004c.m7a(this.f7872a.f8046a.aK(), "Cannot return null from a non-@Nullable @Provides method");
        settingsActivity.f20480p = (C2568a) C0004c.m7a(this.f7872a.f8046a.bI(), "Cannot return null from a non-@Nullable @Provides method");
        settingsActivity.f20481q = (C1506e) C0004c.m7a(this.f7872a.f8046a.mo2035O(), "Cannot return null from a non-@Nullable @Provides method");
        settingsActivity.f20482r = (C1465m) C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method");
        settingsActivity.f20483s = (SearchRecentSuggestions) C0004c.m7a(this.f7872a.f8046a.bg(), "Cannot return null from a non-@Nullable @Provides method");
        settingsActivity.f20484t = (C2162a) C0004c.m7a(this.f7872a.f8046a.bn(), "Cannot return null from a non-@Nullable @Provides method");
        C3492q c3492q = new C3492q();
        C3533f c3533f = new C3533f();
        settingsActivity.f20485u = (C1821j) C0004c.m7a(this.f7872a.f8046a.aQ(), "Cannot return null from a non-@Nullable @Provides method");
        settingsActivity.f20486v = (C2320a) C0004c.m7a(this.f7872a.f8046a.mo2032L(), "Cannot return null from a non-@Nullable @Provides method");
        settingsActivity.f20487w = (C2266a) C0004c.m7a(this.f7872a.f8046a.mo2258q(), "Cannot return null from a non-@Nullable @Provides method");
        settingsActivity.f20488x = (C3960a) C0004c.m7a(this.f7872a.f8046a.mo2265x(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1903a(ExternalSettingsActivity externalSettingsActivity) {
        externalSettingsActivity.f20468c = (Context) C0004c.m7a(this.f7872a.f8046a.f7981b, "Cannot return null from a non-@Nullable @Provides method");
        externalSettingsActivity.f20469d = (C0988c) C0004c.m7a(this.f7872a.f8046a.mo2040T(), "Cannot return null from a non-@Nullable @Provides method");
        externalSettingsActivity.f20470e = (C2910a) C0004c.m7a(this.f7872a.f8046a.au(), "Cannot return null from a non-@Nullable @Provides method");
        externalSettingsActivity.f20471f = (C2471a) C0004c.m7a(this.f7872a.f8046a.aR(), "Cannot return null from a non-@Nullable @Provides method");
        externalSettingsActivity.f20472g = (C2127b) C0004c.m7a(this.f7872a.f8046a.mo2169c(), "Cannot return null from a non-@Nullable @Provides method");
        externalSettingsActivity.f20473i = (C3982a) C0004c.m7a(this.f7872a.f8046a.bK(), "Cannot return null from a non-@Nullable @Provides method");
        externalSettingsActivity.f20474j = (C2838a) C0004c.m7a(this.f7872a.f8046a.bW(), "Cannot return null from a non-@Nullable @Provides method");
        externalSettingsActivity.f20475k = (C1461c) C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method");
        C0004c.m7a(this.f7872a.f8046a.bx(), "Cannot return null from a non-@Nullable @Provides method");
        externalSettingsActivity.f20476l = (C1500a) C0004c.m7a(this.f7872a.f8046a.mo2033M(), "Cannot return null from a non-@Nullable @Provides method");
        externalSettingsActivity.f20477m = (C1556d) C0004c.m7a(this.f7872a.f8046a.ay(), "Cannot return null from a non-@Nullable @Provides method");
        externalSettingsActivity.f20478n = this.f7872a.f8046a.mo2263v();
        C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method");
        externalSettingsActivity.f20479o = (C1287h) C0004c.m7a(this.f7872a.f8046a.aK(), "Cannot return null from a non-@Nullable @Provides method");
        externalSettingsActivity.f20480p = (C2568a) C0004c.m7a(this.f7872a.f8046a.bI(), "Cannot return null from a non-@Nullable @Provides method");
        externalSettingsActivity.f20481q = (C1506e) C0004c.m7a(this.f7872a.f8046a.mo2035O(), "Cannot return null from a non-@Nullable @Provides method");
        externalSettingsActivity.f20482r = (C1465m) C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method");
        externalSettingsActivity.f20483s = (SearchRecentSuggestions) C0004c.m7a(this.f7872a.f8046a.bg(), "Cannot return null from a non-@Nullable @Provides method");
        externalSettingsActivity.f20484t = (C2162a) C0004c.m7a(this.f7872a.f8046a.bn(), "Cannot return null from a non-@Nullable @Provides method");
        C3492q c3492q = new C3492q();
        C3533f c3533f = new C3533f();
        externalSettingsActivity.f20485u = (C1821j) C0004c.m7a(this.f7872a.f8046a.aQ(), "Cannot return null from a non-@Nullable @Provides method");
        externalSettingsActivity.f20486v = (C2320a) C0004c.m7a(this.f7872a.f8046a.mo2032L(), "Cannot return null from a non-@Nullable @Provides method");
        externalSettingsActivity.f20487w = (C2266a) C0004c.m7a(this.f7872a.f8046a.mo2258q(), "Cannot return null from a non-@Nullable @Provides method");
        externalSettingsActivity.f20488x = (C3960a) C0004c.m7a(this.f7872a.f8046a.mo2265x(), "Cannot return null from a non-@Nullable @Provides method");
        C0004c.m7a(this.f7872a.f8046a.aJ(), "Cannot return null from a non-@Nullable @Provides method");
        externalSettingsActivity.f20491a = (C0986a) C0004c.m7a(this.f7872a.f8046a.mo2041U(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1908a(RestoreServiceV2 restoreServiceV2) {
        restoreServiceV2.f20608t = (Context) C0004c.m7a(this.f7872a.f8046a.f7981b, "Cannot return null from a non-@Nullable @Provides method");
        restoreServiceV2.f20609u = (C0988c) C0004c.m7a(this.f7872a.f8046a.mo2040T(), "Cannot return null from a non-@Nullable @Provides method");
        restoreServiceV2.f20610v = (C4168h) this.bw.mo1a();
        restoreServiceV2.f20611w = (C2206c) C0004c.m7a(this.f7872a.f8046a.ah(), "Cannot return null from a non-@Nullable @Provides method");
        restoreServiceV2.f20612x = (C3646a) C0004c.m7a(this.f7872a.f8046a.mo2029I(), "Cannot return null from a non-@Nullable @Provides method");
        restoreServiceV2.f20613y = (C3340g) this.aM.mo1a();
        restoreServiceV2.f20614z = (bs) C0004c.m7a(this.f7872a.f8046a.aS(), "Cannot return null from a non-@Nullable @Provides method");
        restoreServiceV2.f20589A = (C3300k) C0004c.m7a(this.f7872a.f8046a.mo2256o(), "Cannot return null from a non-@Nullable @Provides method");
        restoreServiceV2.f20590B = (C2171b) C0004c.m7a(this.f7872a.f8046a.bo(), "Cannot return null from a non-@Nullable @Provides method");
        restoreServiceV2.f20591C = (al) this.bx.mo1a();
    }

    public final void mo1909a(VpaService vpaService) {
        vpaService.f20703d = (C4175h) this.by.mo1a();
        vpaService.f20704e = (C1805b) C0004c.m7a(this.f7872a.f8046a.bF(), "Cannot return null from a non-@Nullable @Provides method");
        vpaService.f20705f = (C2320a) C0004c.m7a(this.f7872a.f8046a.mo2032L(), "Cannot return null from a non-@Nullable @Provides method");
        vpaService.f20706g = (C0988c) C0004c.m7a(this.f7872a.f8046a.mo2040T(), "Cannot return null from a non-@Nullable @Provides method");
        this.bz.mo1a();
        vpaService.f20707h = (C1287h) C0004c.m7a(this.f7872a.f8046a.aK(), "Cannot return null from a non-@Nullable @Provides method");
        vpaService.f20708i = (C3646a) C0004c.m7a(this.f7872a.f8046a.mo2029I(), "Cannot return null from a non-@Nullable @Provides method");
        vpaService.f20709j = (Context) C0004c.m7a(this.f7872a.f8046a.f7981b, "Cannot return null from a non-@Nullable @Provides method");
        vpaService.f20710k = (C2162a) C0004c.m7a(this.f7872a.f8046a.bn(), "Cannot return null from a non-@Nullable @Provides method");
        vpaService.f20711l = (C4817d) C0004c.m7a(this.f7872a.f8046a.bY(), "Cannot return null from a non-@Nullable @Provides method");
        vpaService.f20712m = (bs) C0004c.m7a(this.f7872a.f8046a.aS(), "Cannot return null from a non-@Nullable @Provides method");
        vpaService.f20713n = (C2909c) C0004c.m7a(this.f7872a.f8046a.mo2241e(), "Cannot return null from a non-@Nullable @Provides method");
        vpaService.f20714o = (C1463g) C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method");
        vpaService.f20715p = (al) this.bx.mo1a();
        vpaService.f20716q = (bn) this.bA.mo1a();
    }

    public final void mo1910a(SimStateReceiver simStateReceiver) {
        simStateReceiver.f21128b = (C4141c) C0004c.m7a(this.f7872a.f8046a.cz(), "Cannot return null from a non-@Nullable @Provides method");
        simStateReceiver.f21129c = (C1461c) C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method");
        simStateReceiver.f21130d = (C3178v) C0004c.m7a(this.f7872a.f8046a.aW(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1911a(SplitInstallService splitInstallService) {
        splitInstallService.f21134a = this.bJ;
    }

    public final void mo1920a(FlatCardClusterView flatCardClusterView) {
        flatCardClusterView.f18611a = (C1461c) C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method");
        flatCardClusterView.f18612b = (com.google.android.finsky.playcard.ac) C0004c.m7a(this.f7872a.f8046a.mo2245h(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1918a(PlayClusterViewContentV2 playClusterViewContentV2) {
        playClusterViewContentV2.aI = (C1461c) C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1917a(PlayCardClusterViewHeader playCardClusterViewHeader) {
        playCardClusterViewHeader.f21609a = (C1461c) C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method");
        playCardClusterViewHeader.f21610b = (C1612l) C0004c.m7a(this.f7872a.f8046a.ar(), "Cannot return null from a non-@Nullable @Provides method");
        playCardClusterViewHeader.f21611c = (C1606f) C0004c.m7a(this.f7872a.f8046a.cu(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1916a(PlayCardClusterViewContent playCardClusterViewContent) {
        playCardClusterViewContent.f21593a = (ao) C0004c.m7a(this.f7872a.f8046a.cr(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1919a(C2628h c2628h) {
        C0004c.m7a(this.f7872a.f8046a.mo2027G(), "Cannot return null from a non-@Nullable @Provides method");
        c2628h.f13947e = (C4254d) C0004c.m7a(this.f7872a.f8046a.ct(), "Cannot return null from a non-@Nullable @Provides method");
        c2628h.f13948f = (C1606f) C0004c.m7a(this.f7872a.f8046a.cu(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1915a(C4279n c4279n) {
        c4279n.f21582f = (C1461c) C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1921a(FlatCardClusterViewHeader flatCardClusterViewHeader) {
        flatCardClusterViewHeader.f18675a = (C1503a) C0004c.m7a(this.f7872a.f8046a.mo2036P(), "Cannot return null from a non-@Nullable @Provides method");
        flatCardClusterViewHeader.f18676b = (C1461c) C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method");
        flatCardClusterViewHeader.f18677c = (C1612l) C0004c.m7a(this.f7872a.f8046a.ar(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1951a(JpkrFlatDealsAndPromosBannerItemView jpkrFlatDealsAndPromosBannerItemView) {
        jpkrFlatDealsAndPromosBannerItemView.f22896b = (C1612l) C0004c.m7a(this.f7872a.f8046a.ar(), "Cannot return null from a non-@Nullable @Provides method");
        jpkrFlatDealsAndPromosBannerItemView.f22897c = (com.google.android.finsky.bg.af) C0004c.m7a(this.f7872a.f8046a.bR(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1952a(JpkrFlatMiniTopChartsClusterView jpkrFlatMiniTopChartsClusterView) {
        C0004c.m7a(this.f7872a.f8046a.ay(), "Cannot return null from a non-@Nullable @Provides method");
        C0004c.m7a(this.f7872a.f8046a.cu(), "Cannot return null from a non-@Nullable @Provides method");
        jpkrFlatMiniTopChartsClusterView.f22908a = (ao) C0004c.m7a(this.f7872a.f8046a.cr(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo2006i() {
        C0004c.m7a(this.f7872a.f8046a.cQ(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1953a(JpkrHighlightsBannerClusterView jpkrHighlightsBannerClusterView) {
        C0004c.m7a(this.f7872a.f8046a.mo2027G(), "Cannot return null from a non-@Nullable @Provides method");
        jpkrHighlightsBannerClusterView.f13947e = (C4254d) C0004c.m7a(this.f7872a.f8046a.ct(), "Cannot return null from a non-@Nullable @Provides method");
        jpkrHighlightsBannerClusterView.f13948f = (C1606f) C0004c.m7a(this.f7872a.f8046a.cu(), "Cannot return null from a non-@Nullable @Provides method");
        jpkrHighlightsBannerClusterView.f22934a = (C1461c) C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method");
        jpkrHighlightsBannerClusterView.f22935b = (Application) C0004c.m7a(this.f7872a.f8046a.f7981b, "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1954a(JpkrHighlightsBannerItemView jpkrHighlightsBannerItemView) {
        jpkrHighlightsBannerItemView.f22949b = (C1294w) C0004c.m7a(this.f7872a.f8046a.be(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1955a(JpkrRecommendedCategoriesItem jpkrRecommendedCategoriesItem) {
        jpkrRecommendedCategoriesItem.f22963a = (C1612l) C0004c.m7a(this.f7872a.f8046a.ar(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1957a(PlayCardRateAndSuggestClusterView playCardRateAndSuggestClusterView) {
        C0004c.m7a(this.f7872a.f8046a.mo2027G(), "Cannot return null from a non-@Nullable @Provides method");
        playCardRateAndSuggestClusterView.f13947e = (C4254d) C0004c.m7a(this.f7872a.f8046a.ct(), "Cannot return null from a non-@Nullable @Provides method");
        playCardRateAndSuggestClusterView.f13948f = (C1606f) C0004c.m7a(this.f7872a.f8046a.cu(), "Cannot return null from a non-@Nullable @Provides method");
        playCardRateAndSuggestClusterView.f23015m = (C2721l) C0004c.m7a(this.f7872a.f8046a.aO(), "Cannot return null from a non-@Nullable @Provides method");
        playCardRateAndSuggestClusterView.f23016n = (C1287h) C0004c.m7a(this.f7872a.f8046a.aK(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo2007j() {
        C0004c.m7a(this.f7872a.f8046a.ay(), "Cannot return null from a non-@Nullable @Provides method");
        C0004c.m7a(this.f7872a.f8046a.cu(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1948a(FlatCardCreatorAvatarClusterView flatCardCreatorAvatarClusterView) {
        flatCardCreatorAvatarClusterView.f18611a = (C1461c) C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method");
        flatCardCreatorAvatarClusterView.f18612b = (com.google.android.finsky.playcard.ac) C0004c.m7a(this.f7872a.f8046a.mo2245h(), "Cannot return null from a non-@Nullable @Provides method");
        flatCardCreatorAvatarClusterView.f22865j = (C1612l) C0004c.m7a(this.f7872a.f8046a.ar(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1949a(FlatCardMerchClusterView flatCardMerchClusterView) {
        flatCardMerchClusterView.f18611a = (C1461c) C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method");
        flatCardMerchClusterView.f18612b = (com.google.android.finsky.playcard.ac) C0004c.m7a(this.f7872a.f8046a.mo2245h(), "Cannot return null from a non-@Nullable @Provides method");
        flatCardMerchClusterView.f22876j = (C1612l) C0004c.m7a(this.f7872a.f8046a.ar(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1956a(PlayCardMerchClusterViewV2 playCardMerchClusterViewV2) {
        C0004c.m7a(this.f7872a.f8046a.mo2027G(), "Cannot return null from a non-@Nullable @Provides method");
        playCardMerchClusterViewV2.f13947e = (C4254d) C0004c.m7a(this.f7872a.f8046a.ct(), "Cannot return null from a non-@Nullable @Provides method");
        playCardMerchClusterViewV2.f13948f = (C1606f) C0004c.m7a(this.f7872a.f8046a.cu(), "Cannot return null from a non-@Nullable @Provides method");
        playCardMerchClusterViewV2.f23006a = (C1612l) C0004c.m7a(this.f7872a.f8046a.ar(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1950a(FlatCardScreenshotClusterViewV2 flatCardScreenshotClusterViewV2) {
        flatCardScreenshotClusterViewV2.f22894j = (C1461c) C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1958a(com.google.android.finsky.stream.controllers.view.al alVar) {
        alVar.f23044a = (C1612l) C0004c.m7a(this.f7872a.f8046a.ar(), "Cannot return null from a non-@Nullable @Provides method");
        alVar.f23045b = (C1600a) C0004c.m7a(this.f7872a.f8046a.cQ(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1914a(HorizontalClusterRecyclerView horizontalClusterRecyclerView) {
        horizontalClusterRecyclerView.bm = (C1611k) C0004c.m7a(this.f7872a.f8046a.av(), "Cannot return null from a non-@Nullable @Provides method");
        horizontalClusterRecyclerView.bn = (C1461c) C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1947a(TagLinksBannerRecyclerView tagLinksBannerRecyclerView) {
        tagLinksBannerRecyclerView.aG = (C1611k) C0004c.m7a(this.f7872a.f8046a.av(), "Cannot return null from a non-@Nullable @Provides method");
        tagLinksBannerRecyclerView.aN = (C1461c) C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1962a(TosAckedReceiver tosAckedReceiver) {
        tosAckedReceiver.f23327b = (C2866c) C0004c.m7a(C1473m.f7980a.mo2038R(), "Cannot return null from a non-@Nullable @Provides method");
        tosAckedReceiver.f23328c = (com.google.android.finsky.dfemodel.ab) C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method");
        tosAckedReceiver.f23329d = (C4569e) C0004c.m7a(this.f7872a.f8046a.mo2039S(), "Cannot return null from a non-@Nullable @Provides method");
        tosAckedReceiver.f23330e = (C1287h) C0004c.m7a(this.f7872a.f8046a.aK(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1964a(UnauthenticatedMainActivity unauthenticatedMainActivity) {
        unauthenticatedMainActivity.f23376q = (C2171b) C0004c.m7a(this.f7872a.f8046a.bo(), "Cannot return null from a non-@Nullable @Provides method");
        unauthenticatedMainActivity.f23377r = (C0986a) C0004c.m7a(this.f7872a.f8046a.mo2041U(), "Cannot return null from a non-@Nullable @Provides method");
        unauthenticatedMainActivity.f23378s = (C2471a) C0004c.m7a(this.f7872a.f8046a.aR(), "Cannot return null from a non-@Nullable @Provides method");
        unauthenticatedMainActivity.f23379t = (C3340g) this.aM.mo1a();
    }

    public final void mo1965a(C4574a c4574a) {
        c4574a.f23383a = (C1463g) C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method");
        c4574a.f23384b = (C2471a) C0004c.m7a(this.f7872a.f8046a.aR(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1966a(C4579g c4579g) {
        c4579g.f23398d = (C3340g) this.aM.mo1a();
        c4579g.f23399e = (C2471a) C0004c.m7a(this.f7872a.f8046a.aR(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1805a(CardClusterModuleLayoutV2 cardClusterModuleLayoutV2) {
        C0004c.m7a(this.f7872a.f8046a.mo2027G(), "Cannot return null from a non-@Nullable @Provides method");
        cardClusterModuleLayoutV2.f13947e = (C4254d) C0004c.m7a(this.f7872a.f8046a.ct(), "Cannot return null from a non-@Nullable @Provides method");
        cardClusterModuleLayoutV2.f13948f = (C1606f) C0004c.m7a(this.f7872a.f8046a.cu(), "Cannot return null from a non-@Nullable @Provides method");
        cardClusterModuleLayoutV2.f13956b = (C2577b) this.al.mo1a();
    }

    public final void mo1695a(C0953a c0953a) {
        c0953a.f5802m = (C2489q) this.f7883l.mo1a();
    }

    public final void mo1806a(CreatorAvatarCardClusterModuleLayout creatorAvatarCardClusterModuleLayout) {
        creatorAvatarCardClusterModuleLayout.f13979t = (C2581g) C0004c.m7a(this.f7872a.f8046a.cm(), "Cannot return null from a non-@Nullable @Provides method");
        creatorAvatarCardClusterModuleLayout.f13980u = (C2577b) this.al.mo1a();
        creatorAvatarCardClusterModuleLayout.f13981v = (C1611k) C0004c.m7a(this.f7872a.f8046a.av(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1809a(aq aqVar) {
        aqVar.r_ = (C1287h) C0004c.m7a(this.f7872a.f8046a.aK(), "Cannot return null from a non-@Nullable @Provides method");
        aqVar.n_ = (C1461c) C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method");
        aqVar.f_ = (com.google.android.finsky.dfemodel.ab) C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method");
        aqVar.bD = (C1294w) C0004c.m7a(this.f7872a.f8046a.be(), "Cannot return null from a non-@Nullable @Provides method");
        aqVar.bE = (C2492t) C0004c.m7a(this.f7872a.f8046a.aP(), "Cannot return null from a non-@Nullable @Provides method");
        aqVar.y_ = (C2471a) C0004c.m7a(this.f7872a.f8046a.aR(), "Cannot return null from a non-@Nullable @Provides method");
        aqVar.ag = (C2581g) C0004c.m7a(this.f7872a.f8046a.cm(), "Cannot return null from a non-@Nullable @Provides method");
        aqVar.ah = (C4238h) C0004c.m7a(this.f7872a.f8046a.cf(), "Cannot return null from a non-@Nullable @Provides method");
        aqVar.ai = (C1611k) C0004c.m7a(this.f7872a.f8046a.av(), "Cannot return null from a non-@Nullable @Provides method");
        aqVar.aj = (C3837c) C0004c.m7a(this.f7872a.f8046a.cC(), "Cannot return null from a non-@Nullable @Provides method");
        aqVar.ak = (C1612l) C0004c.m7a(this.f7872a.f8046a.ar(), "Cannot return null from a non-@Nullable @Provides method");
        aqVar.al = (be) this.bP.mo1a();
        aqVar.ba = (C2577b) this.al.mo1a();
        aqVar.bb = (C1184a) this.bQ.mo1a();
    }

    public final void mo1694a(DfeNotificationManagerImpl dfeNotificationManagerImpl) {
        dfeNotificationManagerImpl.f5777o = (C3780d) this.bR.mo1a();
    }

    public final void mo1862a(EditorialHeroSpacerView editorialHeroSpacerView) {
        C0004c.m7a(this.f7872a.f8046a.cm(), "Cannot return null from a non-@Nullable @Provides method");
        C0004c.m7a(this.f7872a.f8046a.av(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1864a(FinskyDrawerLayout finskyDrawerLayout) {
        finskyDrawerLayout.ag = (C2116a) C0004c.m7a(this.f7872a.f8046a.bT(), "Cannot return null from a non-@Nullable @Provides method");
        finskyDrawerLayout.ah = (C3784h) this.bn.mo1a();
        finskyDrawerLayout.ai = (C1461c) C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method");
        finskyDrawerLayout.aj = (C1463g) C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1863a(FinskySearchToolbar finskySearchToolbar) {
        finskySearchToolbar.aa = (C3784h) this.bn.mo1a();
        finskySearchToolbar.ab = (C1461c) C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1855a(PlayInstallService playInstallService) {
        playInstallService.f16774b = (C3270d) this.bV.mo1a();
        playInstallService.f16775c = (C2748d) this.bY.mo1a();
        C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method");
        this.bZ.mo1a();
    }

    public final void mo1807a(ScreenshotsModuleLayout screenshotsModuleLayout) {
        screenshotsModuleLayout.f14048a = (C2577b) this.al.mo1a();
        screenshotsModuleLayout.f14049b = (C1611k) C0004c.m7a(this.f7872a.f8046a.av(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1808a(ScreenshotsModuleLayoutV2 screenshotsModuleLayoutV2) {
        screenshotsModuleLayoutV2.f14056b = (C2577b) this.al.mo1a();
        screenshotsModuleLayoutV2.f14057c = (C1611k) C0004c.m7a(this.f7872a.f8046a.av(), "Cannot return null from a non-@Nullable @Provides method");
        this.ca.mo1a();
    }

    public final void mo1704a(gn gnVar) {
        gnVar.r_ = (C1287h) C0004c.m7a(this.f7872a.f8046a.aK(), "Cannot return null from a non-@Nullable @Provides method");
        gnVar.n_ = (C1461c) C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method");
        gnVar.f_ = (com.google.android.finsky.dfemodel.ab) C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method");
        gnVar.bD = (C1294w) C0004c.m7a(this.f7872a.f8046a.be(), "Cannot return null from a non-@Nullable @Provides method");
        gnVar.bE = (C2492t) C0004c.m7a(this.f7872a.f8046a.aP(), "Cannot return null from a non-@Nullable @Provides method");
        gnVar.y_ = (C2471a) C0004c.m7a(this.f7872a.f8046a.aR(), "Cannot return null from a non-@Nullable @Provides method");
        gnVar.n_ = (C1461c) C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method");
        gnVar.aG = (C0988c) C0004c.m7a(this.f7872a.f8046a.mo2040T(), "Cannot return null from a non-@Nullable @Provides method");
        gnVar.aH = (C2206c) C0004c.m7a(this.f7872a.f8046a.ah(), "Cannot return null from a non-@Nullable @Provides method");
        gnVar.aI = (C2581g) C0004c.m7a(this.f7872a.f8046a.cm(), "Cannot return null from a non-@Nullable @Provides method");
        gnVar.aJ = (C1611k) C0004c.m7a(this.f7872a.f8046a.av(), "Cannot return null from a non-@Nullable @Provides method");
        gnVar.aK = (C2965g) this.ar.mo1a();
        gnVar.aL = (C2116a) C0004c.m7a(this.f7872a.f8046a.bT(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1720a(C1593a c1593a) {
        c1593a.r_ = (C1287h) C0004c.m7a(this.f7872a.f8046a.aK(), "Cannot return null from a non-@Nullable @Provides method");
        c1593a.n_ = (C1461c) C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method");
        c1593a.f_ = (com.google.android.finsky.dfemodel.ab) C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method");
        c1593a.bD = (C1294w) C0004c.m7a(this.f7872a.f8046a.be(), "Cannot return null from a non-@Nullable @Provides method");
        c1593a.bE = (C2492t) C0004c.m7a(this.f7872a.f8046a.aP(), "Cannot return null from a non-@Nullable @Provides method");
        c1593a.y_ = (C2471a) C0004c.m7a(this.f7872a.f8046a.aR(), "Cannot return null from a non-@Nullable @Provides method");
        c1593a.f8478a = (C2535y) this.cc.mo1a();
        c1593a.f8479c = (C1226a) this.bq.mo1a();
        c1593a.f8480f = (C1229c) this.bs.mo1a();
    }

    public final void mo1721a(C1597e c1597e) {
        c1597e.r_ = (C1287h) C0004c.m7a(this.f7872a.f8046a.aK(), "Cannot return null from a non-@Nullable @Provides method");
        c1597e.n_ = (C1461c) C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method");
        c1597e.f_ = (com.google.android.finsky.dfemodel.ab) C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method");
        c1597e.bD = (C1294w) C0004c.m7a(this.f7872a.f8046a.be(), "Cannot return null from a non-@Nullable @Provides method");
        c1597e.bE = (C2492t) C0004c.m7a(this.f7872a.f8046a.aP(), "Cannot return null from a non-@Nullable @Provides method");
        c1597e.y_ = (C2471a) C0004c.m7a(this.f7872a.f8046a.aR(), "Cannot return null from a non-@Nullable @Provides method");
        c1597e.f8486a = (C1226a) this.bq.mo1a();
        c1597e.f8487c = (C1229c) this.bs.mo1a();
    }

    public final void mo1701a(C1036b c1036b) {
        c1036b.f6320q = (C1226a) this.bq.mo1a();
        c1036b.f6321r = (C1229c) this.bs.mo1a();
    }

    public final void mo1963a(TosActivity tosActivity) {
        tosActivity.f23342x = (Context) C0004c.m7a(this.f7872a.f8046a.f7981b, "Cannot return null from a non-@Nullable @Provides method");
        C3492q c3492q = new C3492q();
        tosActivity.f23343y = (C5263b) C0004c.m7a(C5260a.f26392d, "Cannot return null from a non-@Nullable @Provides method");
        C3533f c3533f = new C3533f();
        tosActivity.f23344z = (C4569e) C0004c.m7a(this.f7872a.f8046a.mo2039S(), "Cannot return null from a non-@Nullable @Provides method");
        tosActivity.f23331A = (C2910a) C0004c.m7a(this.f7872a.f8046a.au(), "Cannot return null from a non-@Nullable @Provides method");
        tosActivity.f23332B = (C1461c) C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method");
        tosActivity.f23333C = (C0986a) C0004c.m7a(this.f7872a.f8046a.mo2041U(), "Cannot return null from a non-@Nullable @Provides method");
        C3491p c3491p = new C3491p();
        tosActivity.f23334D = (C1464x) C0004c.m7a(this.f7872a.f8046a, "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1702a(bc bcVar) {
        bcVar.f6477a = (C3779c) this.cd.mo1a();
    }

    public final void mo1700a(com.google.android.finsky.activities.ay ayVar) {
        ayVar.f6471a = (Context) C0004c.m7a(this.f7872a.f8046a.f7981b, "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1833a(ag agVar) {
        agVar.f15525b = (C4817d) C0004c.m7a(this.f7872a.f8046a.bY(), "Cannot return null from a non-@Nullable @Provides method");
        agVar.f15526c = (C1203f) C0004c.m7a(this.f7872a.f8046a.bX(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1997a(ClearCacheReceiver clearCacheReceiver) {
        clearCacheReceiver.f24725a = (C4774e) C0004c.m7a(this.f7872a.f8046a.bk(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1959a(WarmWelcomeCard warmWelcomeCard) {
        warmWelcomeCard.f23147a = (C1612l) C0004c.m7a(this.f7872a.f8046a.ar(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1960a(WarmWelcomeCardButton warmWelcomeCardButton) {
        warmWelcomeCardButton.f23159a = (C1612l) C0004c.m7a(this.f7872a.f8046a.ar(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void mo1961a(WarmWelcomeV3ClusterView warmWelcomeV3ClusterView) {
        warmWelcomeV3ClusterView.f23179a = (C1294w) C0004c.m7a(this.f7872a.f8046a.be(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
