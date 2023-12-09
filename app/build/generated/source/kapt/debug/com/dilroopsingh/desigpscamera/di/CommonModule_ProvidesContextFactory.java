package com.dilroopsingh.desigpscamera.di;

import android.app.Application;
import android.content.Context;
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
public final class CommonModule_ProvidesContextFactory implements Factory<Context> {
  private final CommonModule module;

  private final Provider<Application> applicationProvider;

  public CommonModule_ProvidesContextFactory(CommonModule module,
      Provider<Application> applicationProvider) {
    this.module = module;
    this.applicationProvider = applicationProvider;
  }

  @Override
  public Context get() {
    return providesContext(module, applicationProvider.get());
  }

  public static CommonModule_ProvidesContextFactory create(CommonModule module,
      Provider<Application> applicationProvider) {
    return new CommonModule_ProvidesContextFactory(module, applicationProvider);
  }

  public static Context providesContext(CommonModule instance, Application application) {
    return Preconditions.checkNotNullFromProvides(instance.providesContext(application));
  }
}
