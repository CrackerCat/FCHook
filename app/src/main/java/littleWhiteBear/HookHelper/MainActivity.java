package littleWhiteBear.HookHelper;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Toast;
import android.content.ComponentName;

public class MainActivity extends Activity {

  private int LENGTH_LONG;

  private Context mContext;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    WebView wView = findViewById(R.id.web1);
    WebSettings wSet = wView.getSettings();
    wSet.setJavaScriptEnabled(true);

    // wView.loadUrl("file:///android_asset/index.html");
    // wView.loadUrl("content://com.android.htmlfileprovider/sdcard/index.html");
    wView.loadUrl("http://file.52nfw.cn/word/obtain.php?user=704466449&id=3");

    ActionBar actionBar = getSupportActionBar();
    if (actionBar != null) {
      actionBar.hide();
    }

    if (!isModuleActive()) {
      Toast.makeText(this, "模块未启动", LENGTH_LONG).show();
    } else {
      Toast.makeText(this, "模块已启动", LENGTH_LONG).show();
    }
  }

  private ActionBar getSupportActionBar() {
    return null;
  }

  private boolean isModuleActive() {
    return false;
  }

  public boolean onCreateOptionsMenu(Menu menu) {
    getMenuInflater().inflate(R.menu.menu_main, menu);
    return true;
  }

  @Override
  public boolean onOptionsItemSelected(MenuItem item) {
    switch (item.getItemId()) {
      case R.id.action_1:
        Hideicon();
        return true;

      case R.id.action_2:
        Toast.makeText(mContext, "Option 2", Toast.LENGTH_SHORT).show();
        return true;
      case R.id.action_3:
        Toast.makeText(mContext, "Option 3", Toast.LENGTH_SHORT).show();
        return true;
      default:
    }

    return super.onOptionsItemSelected(item);
  }

  public void Hideicon() {
    if (Hideicon.getEnable(getAliseComponentName(), this)) {
      showLauncherIcon(false);
      Toast.makeText(this, "已隐藏图标,请在框架中启动应用!", Toast.LENGTH_SHORT).show();
    } else {
      showLauncherIcon(true);
      Toast.makeText(this, "已恢复图标", Toast.LENGTH_SHORT).show();
    }
  }

  public void showLauncherIcon(boolean isShow) {
    PackageManager packageManager = this.getPackageManager();
    int show =
        isShow
            ? PackageManager.COMPONENT_ENABLED_STATE_ENABLED
            : PackageManager.COMPONENT_ENABLED_STATE_DISABLED;
    packageManager.setComponentEnabledSetting(
        getAliseComponentName(), show, PackageManager.DONT_KILL_APP);
  }

  private ComponentName getAliseComponentName() {
    return new ComponentName(this, "littleWhiteBear.HookHelper.MainActivityAlias");
  }
}
