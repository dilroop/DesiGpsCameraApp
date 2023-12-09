package com.dilroopsingh.desigpscamera.ui;

import android.Manifest;
import android.os.Build;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.runtime.Composable;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.tooling.preview.Preview;
import com.dilroopsingh.desigpscamera.Navigator;
import com.google.accompanist.permissions.ExperimentalPermissionsApi;
import com.google.accompanist.permissions.MultiplePermissionsState;
import com.google.accompanist.permissions.PermissionState;
import com.ramcosta.composedestinations.BuildConfig;
import in.dilroopsingh.desigpscamera.R;

@kotlin.Metadata(mv = {1, 8, 0}, k = 2, d1 = {"\u0000:\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\u001a#\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0011\u0010\b\u001a\r\u0012\u0004\u0012\u00020\u00050\t\u00a2\u0006\u0002\b\nH\u0007\u001aF\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u000f2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\tH\u0007\u001a\b\u0010\u0016\u001a\u00020\u0005H\u0007\u001a<\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u0019\u001a\u00020\u00012\b\b\u0002\u0010\u001a\u001a\u00020\u00012\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00050\t2\b\b\u0002\u0010\u001c\u001a\u00020\u000fH\u0007\u001a\u000e\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082D\u00a2\u0006\u0002\n\u0000\"\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"cameraPermission", "", "locationPermissions", "", "CheckPermissions", "", "navigator", "Lcom/dilroopsingh/desigpscamera/Navigator;", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "PermissionContent", "cameraState", "Lcom/google/accompanist/permissions/PermissionState;", "cameraPermissionGranted", "", "storageState", "Lcom/google/accompanist/permissions/MultiplePermissionsState;", "storagePermissionGranted", "locationState", "locationPermissionGranted", "goToSettings", "PreviewTitleSubtitle", "TitleSubtitle", "title", "subtitle", "buttonText", "onClick", "isSucceeded", "storagePermissions", "app_debug"})
public final class CheckPermissionKt {
    private static final java.lang.String cameraPermission = "android.permission.CAMERA";
    private static final java.util.List<java.lang.String> locationPermissions = null;
    
    private static final java.util.List<java.lang.String> storagePermissions() {
        return null;
    }
    
    @androidx.compose.runtime.Composable
    @kotlin.OptIn(markerClass = {com.google.accompanist.permissions.ExperimentalPermissionsApi.class})
    public static final void CheckPermissions(@org.jetbrains.annotations.NotNull
    com.dilroopsingh.desigpscamera.Navigator navigator, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> content) {
    }
    
    @androidx.compose.runtime.Composable
    @kotlin.OptIn(markerClass = {com.google.accompanist.permissions.ExperimentalPermissionsApi.class})
    public static final void PermissionContent(@org.jetbrains.annotations.NotNull
    com.google.accompanist.permissions.PermissionState cameraState, boolean cameraPermissionGranted, @org.jetbrains.annotations.NotNull
    com.google.accompanist.permissions.MultiplePermissionsState storageState, boolean storagePermissionGranted, @org.jetbrains.annotations.NotNull
    com.google.accompanist.permissions.MultiplePermissionsState locationState, boolean locationPermissionGranted, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> goToSettings) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void TitleSubtitle(@org.jetbrains.annotations.NotNull
    java.lang.String title, @org.jetbrains.annotations.NotNull
    java.lang.String subtitle, @org.jetbrains.annotations.NotNull
    java.lang.String buttonText, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onClick, boolean isSucceeded) {
    }
    
    @androidx.compose.runtime.Composable
    @androidx.compose.ui.tooling.preview.Preview
    public static final void PreviewTitleSubtitle() {
    }
}