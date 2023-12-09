package com.dilroopsingh.desigpscamera.preferences;

import android.content.SharedPreferences;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\nB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/dilroopsingh/desigpscamera/preferences/SettingSaver;", "Lcom/dilroopsingh/desigpscamera/preferences/Storeable;", "Lcom/dilroopsingh/desigpscamera/preferences/DesiCameraSettings;", "preferences", "Landroid/content/SharedPreferences;", "(Landroid/content/SharedPreferences;)V", "get", "store", "", "value", "Companion", "app_debug"})
public final class SettingSaver implements com.dilroopsingh.desigpscamera.preferences.Storeable<com.dilroopsingh.desigpscamera.preferences.DesiCameraSettings> {
    private final android.content.SharedPreferences preferences = null;
    @org.jetbrains.annotations.NotNull
    public static final com.dilroopsingh.desigpscamera.preferences.SettingSaver.Companion Companion = null;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String FILE_NAME = "desi_camera_settings";
    
    public SettingSaver(@org.jetbrains.annotations.NotNull
    android.content.SharedPreferences preferences) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.dilroopsingh.desigpscamera.preferences.DesiCameraSettings get() {
        return null;
    }
    
    @java.lang.Override
    public void store(@org.jetbrains.annotations.NotNull
    com.dilroopsingh.desigpscamera.preferences.DesiCameraSettings value) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/dilroopsingh/desigpscamera/preferences/SettingSaver$Companion;", "", "()V", "FILE_NAME", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}