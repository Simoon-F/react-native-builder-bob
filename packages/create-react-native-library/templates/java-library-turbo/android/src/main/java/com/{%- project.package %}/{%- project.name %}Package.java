package com.<%- project.package -%>;

import androidx.annotation.Nullable;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.module.model.ReactModuleInfoProvider;
import com.facebook.react.TurboReactPackage;

import java.util.HashMap;
import java.util.Map;

public class <%- project.name -%>Package extends TurboReactPackage {

  @Nullable
  @Override
  public NativeModule getModule(String name, ReactApplicationContext reactContext) {
    if (name.equals(<%- project.name -%>Module.NAME)) {
        return new <%- project.name -%>Module(reactContext);
    } else {
        return null;
    }
  }

  @Override
  public ReactModuleInfoProvider getReactModuleInfoProvider() {
    return () -> {
      final Map<String, ReactModuleInfo> moduleInfos = new HashMap<>();
      moduleInfos.put(
              <%- project.name -%>Module.NAME,
              new ReactModuleInfo(
                      <%- project.name -%>Module.NAME,
                      <%- project.name -%>Module.NAME,
                      false, // canOverrideExistingModule
                      false, // needsEagerInit
                      true, // hasConstants
                      false, // isCxxModule
                      true // isTurboModule
      ));
      return moduleInfos;
    };
  }
}
