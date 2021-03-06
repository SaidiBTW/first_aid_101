// Generated by data binding compiler. Do not edit!
package com.groupproject.firstaid101.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.textfield.TextInputLayout;
import com.groupproject.firstaid101.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentTipsBinding extends ViewDataBinding {
  @NonNull
  public final TextInputLayout searchTipsEdittextLayout;

  @NonNull
  public final RecyclerView tipsRecyclerView;

  protected FragmentTipsBinding(Object _bindingComponent, View _root, int _localFieldCount,
      TextInputLayout searchTipsEdittextLayout, RecyclerView tipsRecyclerView) {
    super(_bindingComponent, _root, _localFieldCount);
    this.searchTipsEdittextLayout = searchTipsEdittextLayout;
    this.tipsRecyclerView = tipsRecyclerView;
  }

  @NonNull
  public static FragmentTipsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_tips, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentTipsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentTipsBinding>inflateInternal(inflater, R.layout.fragment_tips, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentTipsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_tips, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentTipsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentTipsBinding>inflateInternal(inflater, R.layout.fragment_tips, null, false, component);
  }

  public static FragmentTipsBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static FragmentTipsBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentTipsBinding)bind(component, view, R.layout.fragment_tips);
  }
}
