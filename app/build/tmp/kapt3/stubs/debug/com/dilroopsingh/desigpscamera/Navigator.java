package com.dilroopsingh.desigpscamera;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.Settings;
import androidx.navigation.NavHostController;
import java.net.URL;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\t"}, d2 = {"Lcom/dilroopsingh/desigpscamera/Navigator;", "", "closeApp", "", "goToFileManagerPermission", "goToNotepadAppDetails", "openLink", "url", "Ljava/net/URL;", "app_debug"})
public abstract interface Navigator {
    
    public abstract void goToNotepadAppDetails();
    
    public abstract void goToFileManagerPermission();
    
    public abstract void openLink(@org.jetbrains.annotations.NotNull
    java.net.URL url);
    
    public abstract void closeApp();
}