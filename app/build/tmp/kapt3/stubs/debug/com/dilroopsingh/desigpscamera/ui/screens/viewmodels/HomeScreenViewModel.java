package com.dilroopsingh.desigpscamera.ui.screens.viewmodels;

import com.dilroopsingh.desigpscamera.preferences.Preferences;
import com.dsb.notepad.ui.architecture.BaseViewModel;
import com.dsb.notepad.ui.architecture.UiActionBase;
import com.dsb.notepad.ui.architecture.ViewStateBase;
import dagger.hilt.android.lifecycle.HiltViewModel;
import javax.inject.Inject;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\r\u000eB\u000f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\t\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0003H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u000f"}, d2 = {"Lcom/dilroopsingh/desigpscamera/ui/screens/viewmodels/HomeScreenViewModel;", "Lcom/dsb/notepad/ui/architecture/BaseViewModel;", "Lcom/dilroopsingh/desigpscamera/ui/screens/viewmodels/HomeScreenViewModel$ViewState;", "Lcom/dilroopsingh/desigpscamera/ui/screens/viewmodels/HomeScreenViewModel$UIActions;", "preferences", "Lcom/dilroopsingh/desigpscamera/preferences/Preferences;", "(Lcom/dilroopsingh/desigpscamera/preferences/Preferences;)V", "getPreferences", "()Lcom/dilroopsingh/desigpscamera/preferences/Preferences;", "defaultViewState", "onAction", "", "action", "UIActions", "ViewState", "app_debug"})
public final class HomeScreenViewModel extends com.dsb.notepad.ui.architecture.BaseViewModel<com.dilroopsingh.desigpscamera.ui.screens.viewmodels.HomeScreenViewModel.ViewState, com.dilroopsingh.desigpscamera.ui.screens.viewmodels.HomeScreenViewModel.UIActions> {
    @org.jetbrains.annotations.NotNull
    private final com.dilroopsingh.desigpscamera.preferences.Preferences preferences = null;
    
    @javax.inject.Inject
    public HomeScreenViewModel(@org.jetbrains.annotations.NotNull
    com.dilroopsingh.desigpscamera.preferences.Preferences preferences) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.dilroopsingh.desigpscamera.preferences.Preferences getPreferences() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.dilroopsingh.desigpscamera.ui.screens.viewmodels.HomeScreenViewModel.ViewState defaultViewState() {
        return null;
    }
    
    @java.lang.Override
    public void onAction(@org.jetbrains.annotations.NotNull
    com.dilroopsingh.desigpscamera.ui.screens.viewmodels.HomeScreenViewModel.UIActions action) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0006\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\nH\u00d6\u0003J\t\u0010\u000b\u001a\u00020\fH\u00d6\u0001J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0005\u00a8\u0006\u000f"}, d2 = {"Lcom/dilroopsingh/desigpscamera/ui/screens/viewmodels/HomeScreenViewModel$ViewState;", "Lcom/dsb/notepad/ui/architecture/ViewStateBase;", "isManualMode", "", "(Z)V", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "app_debug"})
    public static final class ViewState implements com.dsb.notepad.ui.architecture.ViewStateBase {
        private final boolean isManualMode = false;
        
        @org.jetbrains.annotations.NotNull
        public final com.dilroopsingh.desigpscamera.ui.screens.viewmodels.HomeScreenViewModel.ViewState copy(boolean isManualMode) {
            return null;
        }
        
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public java.lang.String toString() {
            return null;
        }
        
        public ViewState() {
            super();
        }
        
        public ViewState(boolean isManualMode) {
            super();
        }
        
        public final boolean component1() {
            return false;
        }
        
        public final boolean isManualMode() {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0001\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/dilroopsingh/desigpscamera/ui/screens/viewmodels/HomeScreenViewModel$UIActions;", "Lcom/dsb/notepad/ui/architecture/UiActionBase;", "()V", "MAPClicked", "Lcom/dilroopsingh/desigpscamera/ui/screens/viewmodels/HomeScreenViewModel$UIActions$MAPClicked;", "app_debug"})
    public static abstract class UIActions implements com.dsb.notepad.ui.architecture.UiActionBase {
        
        private UIActions() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/dilroopsingh/desigpscamera/ui/screens/viewmodels/HomeScreenViewModel$UIActions$MAPClicked;", "Lcom/dilroopsingh/desigpscamera/ui/screens/viewmodels/HomeScreenViewModel$UIActions;", "()V", "app_debug"})
        public static final class MAPClicked extends com.dilroopsingh.desigpscamera.ui.screens.viewmodels.HomeScreenViewModel.UIActions {
            @org.jetbrains.annotations.NotNull
            public static final com.dilroopsingh.desigpscamera.ui.screens.viewmodels.HomeScreenViewModel.UIActions.MAPClicked INSTANCE = null;
            
            private MAPClicked() {
                super();
            }
        }
    }
}