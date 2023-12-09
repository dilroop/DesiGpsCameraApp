package com.dilroopsingh.desigpscamera.ui.screens.viewmodels;

import com.dilroopsingh.desigpscamera.preferences.Preferences;
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
public final class HomeScreenViewModel_Factory implements Factory<HomeScreenViewModel> {
  private final Provider<Preferences> preferencesProvider;

  public HomeScreenViewModel_Factory(Provider<Preferences> preferencesProvider) {
    this.preferencesProvider = preferencesProvider;
  }

  @Override
  public HomeScreenViewModel get() {
    return newInstance(preferencesProvider.get());
  }

  public static HomeScreenViewModel_Factory create(Provider<Preferences> preferencesProvider) {
    return new HomeScreenViewModel_Factory(preferencesProvider);
  }

  public static HomeScreenViewModel newInstance(Preferences preferences) {
    return new HomeScreenViewModel(preferences);
  }
}
