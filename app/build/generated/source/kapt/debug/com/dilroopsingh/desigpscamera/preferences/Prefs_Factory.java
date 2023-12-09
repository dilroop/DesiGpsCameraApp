package com.dilroopsingh.desigpscamera.preferences;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class Prefs_Factory implements Factory<Prefs> {
  private final Provider<Context> contextProvider;

  public Prefs_Factory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public Prefs get() {
    return newInstance(contextProvider.get());
  }

  public static Prefs_Factory create(Provider<Context> contextProvider) {
    return new Prefs_Factory(contextProvider);
  }

  public static Prefs newInstance(Context context) {
    return new Prefs(context);
  }
}
