// Generated by view binder compiler. Do not edit!
package com.project.sparkwomen.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.project.sparkwomen.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivitySmsBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final LinearLayout li;

  @NonNull
  public final Button startService;

  @NonNull
  public final Button stopService;

  private ActivitySmsBinding(@NonNull RelativeLayout rootView, @NonNull LinearLayout li,
      @NonNull Button startService, @NonNull Button stopService) {
    this.rootView = rootView;
    this.li = li;
    this.startService = startService;
    this.stopService = stopService;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivitySmsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivitySmsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_sms, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivitySmsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.li;
      LinearLayout li = ViewBindings.findChildViewById(rootView, id);
      if (li == null) {
        break missingId;
      }

      id = R.id.startService;
      Button startService = ViewBindings.findChildViewById(rootView, id);
      if (startService == null) {
        break missingId;
      }

      id = R.id.stopService;
      Button stopService = ViewBindings.findChildViewById(rootView, id);
      if (stopService == null) {
        break missingId;
      }

      return new ActivitySmsBinding((RelativeLayout) rootView, li, startService, stopService);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
