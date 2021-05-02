package com.neoapp;

import android.app.Application;
import com.facebook.react.PackageList;
import com.facebook.react.ReactApplication;
import com.facebook.react.ReactNativeHost;
import com.facebook.react.ReactPackage;
import com.facebook.soloader.SoLoader;

import com.moe.pushlibrary.MoEHelper;
import com.moengage.core.LogLevel;
import com.moengage.core.MoEngage;
import com.moengage.core.config.FcmConfig;
import com.moengage.core.config.LogConfig;
import com.moengage.core.config.NotificationConfig;
import com.moengage.react.MoEInitializer;

import java.util.List;

public class MainApplication extends Application implements ReactApplication {

  private final ReactNativeHost mReactNativeHost =
      new ReactNativeHost(this) {
        @Override
        public boolean getUseDeveloperSupport() {
          return BuildConfig.DEBUG;
        }

        @Override
        protected List<ReactPackage> getPackages() {
          @SuppressWarnings("UnnecessaryLocalVariable")
          List<ReactPackage> packages = new PackageList(this).getPackages();
          // Packages that cannot be autolinked yet can be added manually here, for example:
          // packages.add(new MyReactNativePackage());
          return packages;
        }

        @Override
        protected String getJSMainModuleName() {
          return "index";
        }
      };

  @Override
  public ReactNativeHost getReactNativeHost() {
    return mReactNativeHost;
  }

  @Override
  public void onCreate() {
    super.onCreate();

      MoEngage.Builder moEngage =
              new MoEngage.Builder(this, "ZBYG8LW0NPE050VOU6UN4332")
                      .configureNotificationMetaData(new NotificationConfig(R.mipmap.ic_launcher, R.mipmap.ic_launcher_round,R.color.catalyst_redbox_background, "sound", true, true, true))
                      .configureFcm(new FcmConfig(true))
                      .configureLogs(new LogConfig(LogLevel.VERBOSE, false));

      MoEInitializer.INSTANCE.initialize(getApplicationContext(), moEngage);

      MoEHelper.getInstance(getApplicationContext()).setUserAttribute("moe_unsubscribe",true);

      SoLoader.init(this, /* native exopackage */ false);
  }
}
