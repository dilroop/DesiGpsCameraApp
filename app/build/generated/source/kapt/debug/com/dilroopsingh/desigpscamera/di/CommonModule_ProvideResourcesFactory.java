package com.dilroopsingh.desigpscamera.di;

import android.content.Context;
import android.content.res.Resources;
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
public final class CommonModule_ProvideResourcesFactory implements Factory<Resources> {
  private final CommonModule module;

  private final Provider<Context> contextProvider;

  public CommonModule_ProvideResourcesFactory(CommonModule module,
      Provider<Context> contextProvider) {
    this.module = module;
    this.contextProvider = contextProvider;
  }

  @Override
  public Resources get() {
    return provideResources(module, contextProvider.get());
  }

  public static CommonModule_ProvideResourcesFactory create(CommonModule module,
      Provider<Context> contextProvider) {
    return new CommonModule_ProvideResourcesFactory(module, contextProvider);
  }

  public static Resources provideResources(CommonModule instance, Context context) {
    return Preconditions.checkNotNullFromProvides(instance.provideResources(context));
  }
}
