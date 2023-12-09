package com.dilroopsingh.desigpscamera.di;

import android.content.Context;
import com.dilroopsingh.desigpscamera.preferences.Preferences;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
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
public final class CommonModule_ProvidePreferencesFactory implements Factory<Preferences> {
  private final CommonModule module;

  private final Provider<Context> contextProvider;

  public CommonModule_ProvidePreferencesFactory(CommonModule module,
      Provider<Context> contextProvider) {
    this.module = module;
    this.contextProvider = contextProvider;
  }

  @Override
  public Preferences get() {
    return providePreferences(module, contextProvider.get());
  }

  public static CommonModule_ProvidePreferencesFactory create(CommonModule module,
      Provider<Context> contextProvider) {
    return new CommonModule_ProvidePreferencesFactory(module, contextProvider);
  }

  public static Preferences providePreferences(CommonModule instance, Context context) {
    return Preconditions.checkNotNullFromProvides(instance.providePreferences(context));
  }
}
