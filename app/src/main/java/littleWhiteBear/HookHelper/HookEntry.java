package littleWhiteBear.HookHelper;

import de.robv.android.xposed.IXposedHookLoadPackage;
import de.robv.android.xposed.callbacks.XC_LoadPackage;
import de.robv.android.xposed.XposedBridge;
import de.robv.android.xposed.XposedHelpers;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XC_MethodReplacement;
import de.robv.android.xposed.*;
import android.app.Dialog;
import android.os.StrictMode;
import android.content.Context;
import java.security.spec.EllipticCurve;

public class HookEntry implements IXposedHookLoadPackage {
    public static final String TAG = "HookEntry";
    private static final String YJ = "com.jideos.jnotes"; //云记
    private static final String JY = "com.lemon.lv"; //剪映
    private static final String MB = "com.mubu.app"; //幕布
    private static final String QY ="com.mxm.douying"; //趣映
    private static final String TL = "com.chan.cwallpaper"; //图凌
    private static final String FQ = "com.dragon.read"; //番茄小说
    private static final String DH = "com.bigsea.bsfilms"; //大海影视
    private static final String XT = "com.xt.retouch"; //醒图
    private static final String BX = "com.catchingnow.icebox"; //冰箱
    private static final String VM = "com.vmos.pro"; //VMOSPro
    private static final String AI = "com.shineyie.aijianji"; //爱剪辑
    private static final String ADB = "com.didjdk.adbhelper"; //甲壳虫ADB
    private static final String JH = "littleWhiteBear.HookHelper"; //模块激活状态
    private static final String NB = "imoblife.brainwavestus"; //神奇脑波
    private static final String LP = "com.duapps.recorder"; //小熊录屏
    private static final String QM = "com.kmxs.reader"; //七猫免费小说
    private static final String CT = "com.xs.fm"; //番茄畅听
    private static final String QD = "cn.ticktick.task"; //嘀嗒清单
    private static final String BZ = "me.alzz.awsl"; //次元壁纸
    private static final String XF = "com.iflytek.vflynote"; //讯飞语记
    private static final String WY = "com.qq.qcloud"; //腾讯微云
    private static final String KW = "cn.kuwo.player"; //酷我音乐
    private static final String QAD = "com.auto.greenskipad"; //绿去广告
    private static final String QY1 = "com.gorgeous.lite"; //轻颜相机
    private static final String YT = "com.kwai.m2u"; //一甜相机
    private static final String SY = "com.xinliwangluo.doimage"; //简单水印
    private static final String XZ = "com.newskyer.draw"; //享做笔记
    private static final String YD = "com.youdao.note"; //有道云笔记
    private static final String XZJ = "com.growing.topwidgets"; //万能小组件
    private static final String YZ = "com.cosmos.tools"; //宇宙工具箱
    private static final String HZ = "io.iftech.android.box"; //小组件盒子
    private static final String XY = "cn.wsds.gamemaster"; //迅游加速器
    private static final String YM = "com.zhpphls.banma"; //野马视频
    private static final String HY = "com.huoyan.hyspdy"; //火焰视频
    private static final String XX = "com.xingxing.xxspdy"; //星星视频
    private static final String XK = "com.starrysky.ssfilms"; //星空视频
    private static final String XC = "com.starmoon.smfilms"; //星辰视频
    private static final String ZF = "com.zhuifeng.zfspdy"; //追风视频
    private static final String HM = "com.sdyzhinet.zyesp"; //河马视频
    private static final String YS = "com.snda.wifilocating"; //Wifi万能钥匙
    private static final String ES = "com.estrongs.android.pop"; //ES文件浏览器
    private static final String EX = "com.yipeinet.excel"; //表格Excel手机版
    private static final String DT = "net.xmind.doughnut"; //Xmind思维导图
    private static final String GF = "com.gifediting.gifmake"; //GIF动图
    private static final String DV = "com.su.assistant.pro"; //Android开发工具箱
    private static final String XR = "videoeditor.videorecorder.screenrecorder"; //XRecorder录屏
    private static final String FK = "com.lerist.fakelocation";  //FakeLocation虚拟定位

    public static Context context; 

    public static Context TAG() {
        return null;
    }

    @Override
    public void handleLoadPackage(XC_LoadPackage.LoadPackageParam lpparam) throws Throwable {
        if (lpparam == null) {
            return;
        }

        if (lpparam.packageName.equals(FQ)) {
            番茄免费小说.HookVIP((lpparam));
        } else if (lpparam.packageName.equals(VM)) {
            VMOSPro.HookVIP(lpparam);
        } else if (lpparam.packageName.equals(JY)) {
            剪映.HookVIP(lpparam);
        } else if (lpparam.packageName.equals(XF)) {
            讯飞语记.HookVIP(lpparam);
        } else if (lpparam.packageName.equals(CT)) {
            番茄畅听.HookVIP(lpparam);
        } else if (lpparam.packageName.equals(BX)) {
            冰箱.HookVIP(lpparam);
        } else if (lpparam.packageName.equals(MB)) {
            幕布.HookVIP(lpparam);
        } else if (lpparam.packageName.equals(DV)) {
            开发工具箱.HookVIP(lpparam);
        } else if (lpparam.packageName.equals(FK)) {
            虚拟定位.HookVIP(lpparam);
        } else if (lpparam.packageName.equals(WY)) {
            腾讯微云.HookVIP(lpparam);
        } else if (lpparam.packageName.equals(EX)) {
            表格Excel.HookVIP(lpparam);
        } else if (lpparam.packageName.equals(YD)) {
            有道云笔记.HookVIP(lpparam);
        } else if (lpparam.packageName.equals(KW)) {
            酷我音乐.HookVIP(lpparam);
        } else if (lpparam.packageName.equals(XZJ)) {
            万能小组件.HookVIP(lpparam);
        } else if (lpparam.packageName.equals(JH)) {
            模块激活.HookVIP(lpparam);
        } else if (lpparam.packageName.equals(YZ)) {
            宇宙工具箱.HookVIP(lpparam);
        } else if (lpparam.packageName.equals(QY1)) {
            轻颜相机.HookVIP(lpparam);
        } else if (lpparam.packageName.equals(HZ)) {
            小组件盒子.HookVIP(lpparam);
        } else if (lpparam.packageName.equals(QD)) {
            嘀嗒清单.HookVIP(lpparam);
        } else if (lpparam.packageName.equals(NB)) {
            神奇脑波.HookVIP(lpparam);
        } else if (lpparam.packageName.equals(YJ)) {
            云记.HookVIP(lpparam);
        } else if (lpparam.packageName.equals(LP)) {
            小熊录屏.HookVIP(lpparam);
        } else if (lpparam.packageName.equals(ES)) {
            ES文件浏览器.HookVIP(lpparam);
        } else if (lpparam.packageName.equals(XT)) {
            醒图.HookVIP(lpparam);
        } else if (lpparam.packageName.equals(QAD)) {
            绿去广告.HookVIP(lpparam);
        } else if (lpparam.packageName.equals(YT)) {
            一甜相机.HookVIP(lpparam);
        } else if (lpparam.packageName.equals(DH)) {
            大海影视.HookVIP(lpparam);
        } else if (lpparam.packageName.equals(YM)) {
            野马视频.HookVIP(lpparam);
        } else if (lpparam.packageName.equals(HY)) {
            火焰视频.HookVIP(lpparam);
        } else if (lpparam.packageName.equals(XX)) {
            星星视频.HookVIP(lpparam);
        } else if (lpparam.packageName.equals(XK)) {
            星空视频.HookVIP(lpparam);
        } else if (lpparam.packageName.equals(XC)) {
            星辰视频.HookVIP(lpparam);
        } else if (lpparam.packageName.equals(ZF)) {
            追风视频.HookVIP(lpparam);
        } else if (lpparam.packageName.equals(ADB)) {
            甲壳虫ADB.HookVIP(lpparam); 
        } else if (lpparam.packageName.equals(YS)) {
            WiFi万能钥匙.HookVIP(lpparam);     
        } else if (lpparam.packageName.equals(XY)) {
            迅游加速器.HookVIP(lpparam);
        } else if (lpparam.packageName.equals(AI)) {
            爱剪辑.HookVIP(lpparam);
        } else if (lpparam.packageName.equals(QY)) {
            趣映.HookVIP(lpparam);
        } else if (lpparam.packageName.equals(BZ)) {
            次元壁纸.HookVIP(lpparam);
        } else if (lpparam.packageName.equals(HM)) {
            河马视频.HookVIP(lpparam); 
        } else if (lpparam.packageName.equals(XZ)) {
            享做笔记.HookVIP(lpparam); 
        } else if (lpparam.packageName.equals(SY)) {
            简单水印.HookVIP(lpparam);
        } else if (lpparam.packageName.equals(TL)) {
            图凌.HookVIP(lpparam);
        } else if (lpparam.packageName.equals(DT)) {
            Xmind思维导图.HookVIP(lpparam);
        } else if (lpparam.packageName.equals(QM)) {
            七猫免费小说.HookVIP(lpparam);
        } else if (lpparam.packageName.equals(XR)) {
            XRecorder录屏.HookVIP(lpparam); 
        } else if (lpparam.packageName.equals(GF)) {
            GIF动图.HookVIP(lpparam);
        } else 云注入Fuck.HookVIP(lpparam);{

        }
        {
        }
    }
}
