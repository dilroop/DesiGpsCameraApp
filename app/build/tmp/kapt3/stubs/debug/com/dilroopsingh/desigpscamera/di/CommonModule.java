package com.dilroopsingh.desigpscamera.di;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import com.dilroopsingh.desigpscamera.preferences.Preferences;
import com.dilroopsingh.desigpscamera.preferences.Prefs;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0007\u00a8\u0006\f"}, d2 = {"Lcom/dilroopsingh/desigpscamera/di/CommonModule;", "", "()V", "providePreferences", "Lcom/dilroopsingh/desigpscamera/preferences/Preferences;", "context", "Landroid/content/Context;", "provideResources", "Landroid/content/res/Resources;", "providesContext", "application", "Landroid/app/Application;", "app_debug"})
@dagger.Module
public final class CommonModule {
    
    public CommonModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    public final android.content.Context providesContext(@org.jetbrains.annotations.NotNull
    android.app.Application application) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    public final android.content.res.Resources provideResources(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    public final com.dilroopsingh.desigpscamera.preferences.Preferences providePreferences(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        return null;
    }
}