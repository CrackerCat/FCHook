package littleWhiteBear.HookHelper;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.Toast;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XC_MethodReplacement;
import de.robv.android.xposed.XposedHelpers;
import de.robv.android.xposed.callbacks.XC_LoadPackage;
import org.json.JSONObject;

public class 酷我音乐 {

    public static void HookVIP(XC_LoadPackage.LoadPackageParam lpparam) {

        XposedHelpers.findAndHookMethod(
            "cn.kuwo.ui.fragment.MainController",
            lpparam.classLoader,
            "onCreate",
            new XC_MethodHook() {
                @Override
                protected void afterHookedMethod(MethodHookParam param) throws Throwable {
                    ViewGroup viewGroup =
                        (ViewGroup) XposedHelpers.getObjectField(param.thisObject, "mBottomTab");
                    viewGroup.removeViewAt(2);
                    viewGroup.removeViewAt(1);
                }
            });

        XposedHelpers.findAndHookMethod(
            "cn.kuwo.player.activities.EntryActivity",
            lpparam.classLoader,
            "l",
            XC_MethodReplacement.returnConstant(true));

        XposedHelpers.findAndHookMethod(
            "cn.kuwo.peculiar.specialinfo.c",
            lpparam.classLoader,
            "c",
            new XC_MethodHook() {
                @Override
                protected void afterHookedMethod(MethodHookParam param) throws Throwable {
                    param.setResult(1);
                }
            });
        XposedHelpers.findAndHookMethod(
            "cn.kuwo.base.bean.Music",
            lpparam.classLoader,
            "isSpPrivilege",
            new XC_MethodHook() {
                @Override
                protected void afterHookedMethod(MethodHookParam param) throws Throwable {
                    param.setResult(true);
                }
            });

        // 自定义Hook
        XposedHelpers.findAndHookMethod(
            "cn.kuwo.base.bean.Music",
            lpparam.classLoader,
            "isListenVip",
            new XC_MethodHook() {
                @Override
                protected void afterHookedMethod(MethodHookParam param) throws Throwable {
                    param.setResult(true);
                }
            });
        // 自定义Hook2
        XposedHelpers.findAndHookMethod(
            "cn.kuwo.base.bean.Music",
            lpparam.classLoader,
            "isDownloadVip",
            new XC_MethodHook() {
                @Override
                protected void afterHookedMethod(MethodHookParam param) throws Throwable {
                    param.setResult(true);
                }
            });
        // 自定义Hook3
        XposedHelpers.findAndHookMethod(
            "cn.kuwo.mod.mobilead.VipTypeUtil",
            lpparam.classLoader,
            "getVipType",
            new XC_MethodHook() {
                @Override
                protected void afterHookedMethod(MethodHookParam param) throws Throwable {
                    param.setResult(2);
                }
            });
        // 自定义Hook4
        XposedHelpers.findAndHookMethod(
            "cn.kuwo.peculiar.specialinfo.SpecialInfoUtil",
            lpparam.classLoader,
            "b",
            new XC_MethodHook() {
                @Override
                protected void afterHookedMethod(MethodHookParam param) throws Throwable {
                    param.setResult(true);
                }
            });
        // 自定义Hook5
        XposedHelpers.findAndHookMethod(
            "cn.kuwo.peculiar.specialinfo.SpecialInfoUtil",
            lpparam.classLoader,
            "d",
            new XC_MethodHook() {
                @Override
                protected void afterHookedMethod(MethodHookParam param) throws Throwable {
                    param.setResult(true);
                }
            });
        // 自定义Hook6
        XposedHelpers.findAndHookMethod(
            "com.kugou.fanxing.core.common.d.a",
            lpparam.classLoader,
            "n",
            new XC_MethodHook() {
                @Override
                protected void afterHookedMethod(MethodHookParam param) throws Throwable {
                    param.setResult(4787107805000L);
                }
            });
        XposedHelpers.findAndHookMethod(
            "cn.kuwo.base.bean.Music",
            lpparam.classLoader,
            "getSpPrivilege",
            new XC_MethodHook() {
                @Override
                protected void afterHookedMethod(MethodHookParam param) throws Throwable {
                    param.setResult(1);
                }
            });
        XposedHelpers.findAndHookMethod(
            "cn.kuwo.mod.theme.detail.star.StarThemeDetailPresenter",
            lpparam.classLoader,
            "checkStarThemeFree",
            XposedHelpers.findClass("cn.kuwo.mod.theme.bean.star.StarTheme", lpparam.classLoader),
            new XC_MethodHook() {
                @Override
                protected void afterHookedMethod(MethodHookParam param) throws Throwable {
                    param.setResult(true);
                }
            });
        XposedHelpers.findAndHookMethod(
            "cn.kuwo.mod.detail.DetailPageHelper",
            lpparam.classLoader,
            "checkStateSingleMusic",
            "cn.kuwo.base.bean.Music",
            String.class,
            XC_MethodReplacement.returnConstant(true));

        // 破解酷我听书
        XposedHelpers.findAndHookMethod(
            JSONObject.class,
            "optString",
            String.class,
            new XC_MethodHook() {
                @Override
                protected void afterHookedMethod(MethodHookParam param) throws Throwable {
                    String s = param.args[0].toString();
                    if (s.equals("playright") || s.equals("downright")) {
                        param.setResult("1");
                    }
                }
            });

        // 精简布局
        XposedHelpers.findAndHookMethod(
            "cn.kuwo.ui.online.library.LibraryRecommendFragment",
            lpparam.classLoader,
            "setLoadMore",
            XC_MethodReplacement.returnConstant(null));
        XposedHelpers.findAndHookMethod(
            "cn.kuwo.show.mod.Adv.LiveAdvController",
            lpparam.classLoader,
            "initData",
            boolean.class,
            XC_MethodReplacement.returnConstant(null));

        // 精简 听点别的
        XposedHelpers.findAndHookMethod(
            "cn.kuwo.ui.mine.motor.manager.MineNovelViewManager",
            lpparam.classLoader,
            "showView",
            new XC_MethodHook() {
                @Override
                protected void afterHookedMethod(MethodHookParam param) throws Throwable {
                    View view = (View) XposedHelpers.getObjectField(param.thisObject, "sectionView");
                    view.setVisibility(View.GONE);
                }
            });
        // 精简 直播
        XposedHelpers.findAndHookConstructor(
            "cn.kuwo.ui.mine.motor.manager.MineAdViewManager",
            lpparam.classLoader,
            Context.class,
            ListView.class,
            new XC_MethodHook() {
                @Override
                protected void afterHookedMethod(MethodHookParam param) throws Throwable {
                    LinearLayout view =
                        (LinearLayout) XposedHelpers.getObjectField(param.thisObject, "mAdView");
                    view.setVisibility(View.GONE);
                }
            });

        // 去除更新弹窗
        XposedHelpers.setStaticObjectField(
            XposedHelpers.findClass("cn.kuwo.base.utils.b", lpparam.classLoader), "b", "99.9.9.9");

        //
        //            XposedHelpers.findAndHookMethod("cn.kuwo.base.uilib.a", lpparam.classLoader,
        // "show", XC_MethodReplacement.returnConstant(null));

        // 精简侧边菜单栏
        XposedHelpers.findAndHookMethod(
            "cn.kuwo.ui.fragment.menu.MenuController",
            lpparam.classLoader,
            "refreshFlowItem",
            new XC_MethodHook() {
                @Override
                protected void afterHookedMethod(MethodHookParam param) throws Throwable {
                    XposedHelpers.callMethod(param.thisObject, "hideMenuItem", 33);
                    XposedHelpers.callMethod(param.thisObject, "hideMenuItem", 35);
                    XposedHelpers.callMethod(param.thisObject, "hideMenuItem", 12);
                    XposedHelpers.callMethod(param.thisObject, "hideMenuItem", 13);
                    XposedHelpers.callMethod(param.thisObject, "hideMenuItem", 7);
                }
            });
        // 精简签到按钮
        XposedHelpers.findAndHookMethod(
            "cn.kuwo.ui.mine.MineUserInfo",
            lpparam.classLoader,
            "initOnCreateView",
            View.class,
            View.class,
            new XC_MethodHook() {
                @Override
                protected void afterHookedMethod(MethodHookParam param) throws Throwable {
                    LinearLayout signAll =
                        (LinearLayout) XposedHelpers.getObjectField(param.thisObject, "signAll");
                    signAll.setVisibility(View.GONE);
                    LinearLayout unSignAll =
                        (LinearLayout) XposedHelpers.getObjectField(param.thisObject, "unSignAll");
                    unSignAll.setVisibility(View.GONE);
                }
            });

        // 精简活动中心
        XposedHelpers.findAndHookMethod(
            "cn.kuwo.ui.mine.fragment.MineFragment",
            lpparam.classLoader,
            "onCreateView",
            LayoutInflater.class,
            ViewGroup.class,
            Bundle.class,
            new XC_MethodHook() {
                @Override
                protected void afterHookedMethod(MethodHookParam param) throws Throwable {
                    RelativeLayout mTaskCenterView =
                        (RelativeLayout) XposedHelpers.getObjectField(param.thisObject, "mTaskCenterView");
                    mTaskCenterView.setVisibility(View.GONE);
                }
            });

        // 精简会员中心
        XposedHelpers.findAndHookMethod(
            "cn.kuwo.ui.mine.MineUserInfo",
            lpparam.classLoader,
            "initOnCreateView",
            View.class,
            View.class,
            new XC_MethodHook() {
                @Override
                protected void afterHookedMethod(MethodHookParam param) throws Throwable {
                    View view2 = (View) param.args[1];
                    view2.findViewById(0x7f0937aa).setVisibility(View.GONE);
                }
            });

        // 去广告
        XposedHelpers.findAndHookMethod(
            "cn.kuwo.mod.mobilead.KuwoAdUrl",
            lpparam.classLoader,
            "getHost",
            new XC_MethodHook() {
                @Override
                protected void afterHookedMethod(MethodHookParam param) throws Throwable {
                    param.setResult(null);
                }
            });

        XposedHelpers.findAndHookMethod(
            "com.bytedance.sdk.openadsdk.core.h.g",
            lpparam.classLoader,
            "a",
            boolean.class,
            new XC_MethodHook() {
                @Override
                protected void afterHookedMethod(MethodHookParam param) throws Throwable {
                    param.setResult(false);
                }
            });

        XposedHelpers.findAndHookMethod(
            "com.qq.e.comm.adevent.ADEvent",
            lpparam.classLoader,
            "getType",
            new XC_MethodHook() {
                @Override
                protected void afterHookedMethod(MethodHookParam param) throws Throwable {
                    param.setResult(0);
                }
            });

        XposedHelpers.findAndHookMethod(
            "cn.kuwo.peculiar.specialinfo.SpecialInfoUtil",
            lpparam.classLoader,
            "c",
            new XC_MethodHook() {
                @Override
                protected void afterHookedMethod(MethodHookParam param) throws Throwable {
                    param.setResult(true);
                }
            });


        // 去除歌词界面广告
        XposedHelpers.findAndHookMethod(
            "cn.kuwo.mod.nowplay.common.BasePlayFragment",
            lpparam.classLoader,
            "showMiniAd",
            "cn.kuwo.mod.mobilead.lyricsearchad.LyricAdInfoWrapper",
            boolean.class,
            XC_MethodReplacement.returnConstant(null));

        XposedHelpers.findAndHookMethod(
            "com.bytedance.sdk.openadsdk.l.a.c",
            lpparam.classLoader,
            "d",
            new XC_MethodHook() {
                @Override
                protected void afterHookedMethod(MethodHookParam param) throws Throwable {
                    param.setResult(351L);
                }
            });

        Class<?> aClass =
            XposedHelpers.findClass("cn.kuwo.player.activities.MainActivity", lpparam.classLoader);
        XposedHelpers.findAndHookMethod(
            aClass,
            "c",
            aClass,
            new XC_MethodHook() {
                @Override
                protected void afterHookedMethod(MethodHookParam param) throws Throwable {
                    param.setResult(false);
                }
            });

        XposedHelpers.findAndHookMethod(
            "cn.kuwo.mod.mobilead.audioad.AudioAdInfo",
            lpparam.classLoader,
            "isShowAdMark",
            XC_MethodReplacement.returnConstant(false));
        XposedHelpers.findAndHookMethod(
            "cn.kuwo.mod.mobilead.messad.MessAdModel",
            lpparam.classLoader,
            "isAdAvailable",
            XC_MethodReplacement.returnConstant(false));
        XposedHelpers.findAndHookMethod(
            "cn.kuwo.mod.mobilead.KuwoAdUrl$AdUrlDef",
            lpparam.classLoader,
            "getUrl",
            String.class,
            XC_MethodReplacement.returnConstant(""));
    }
}
