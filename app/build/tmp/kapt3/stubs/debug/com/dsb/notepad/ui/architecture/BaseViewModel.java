package com.dsb.notepad.ui.architecture;

import androidx.lifecycle.ViewModel;
import kotlinx.coroutines.flow.Flow;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u00020\u00052\u00020\u0006B\u0005\u00a2\u0006\u0002\u0010\u0007J\r\u0010\u0013\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\u0010J\u0015\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00028\u0001H&\u00a2\u0006\u0002\u0010\u0017J\b\u0010\u0018\u001a\u00020\u0015H\u0016J\b\u0010\u0019\u001a\u00020\u0015H\u0016J\u001c\u0010\u001a\u001a\u00020\u00152\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u001cH\u0004J\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001eR\u001a\u0010\b\u001a\u00020\tX\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00028\u00008DX\u0084\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lcom/dsb/notepad/ui/architecture/BaseViewModel;", "T", "Lcom/dsb/notepad/ui/architecture/ViewStateBase;", "A", "Lcom/dsb/notepad/ui/architecture/UiActionBase;", "Landroidx/lifecycle/ViewModel;", "Lcom/dsb/notepad/ui/architecture/LifecycleReceiver;", "()V", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "getCoroutineScope", "()Lkotlinx/coroutines/CoroutineScope;", "setCoroutineScope", "(Lkotlinx/coroutines/CoroutineScope;)V", "lastViewState", "getLastViewState", "()Lcom/dsb/notepad/ui/architecture/ViewStateBase;", "viewStateFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "defaultViewState", "onAction", "", "action", "(Lcom/dsb/notepad/ui/architecture/UiActionBase;)V", "onDisappear", "onShow", "update", "block", "Lkotlin/Function1;", "viewStateStream", "Lkotlinx/coroutines/flow/Flow;", "app_debug"})
public abstract class BaseViewModel<T extends com.dsb.notepad.ui.architecture.ViewStateBase, A extends com.dsb.notepad.ui.architecture.UiActionBase> extends androidx.lifecycle.ViewModel implements com.dsb.notepad.ui.architecture.LifecycleReceiver {
    private final kotlinx.coroutines.flow.MutableStateFlow<T> viewStateFlow = null;
    @org.jetbrains.annotations.NotNull
    private kotlinx.coroutines.CoroutineScope coroutineScope;
    
    public BaseViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    protected final kotlinx.coroutines.CoroutineScope getCoroutineScope() {
        return null;
    }
    
    protected final void setCoroutineScope(@org.jetbrains.annotations.NotNull
    kotlinx.coroutines.CoroutineScope p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    protected final T getLastViewState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public abstract T defaultViewState();
    
    public abstract void onAction(@org.jetbrains.annotations.NotNull
    A action);
    
    protected final void update(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super T, ? extends T> block) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<T> viewStateStream() {
        return null;
    }
    
    /**
     * Optionally track screen view
     */
    @java.lang.Override
    public void onShow() {
    }
    
    /**
     * Optionally track when screen disappears
     */
    @java.lang.Override
    public void onDisappear() {
    }
}