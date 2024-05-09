// Generated by view binder compiler. Do not edit!
package com.project.sparkwomen.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.project.sparkwomen.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class DialogBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button dialogCancel;

  @NonNull
  public final EditText dialogEditText;

  @NonNull
  public final Button dialogSave;

  private DialogBinding(@NonNull LinearLayout rootView, @NonNull Button dialogCancel,
      @NonNull EditText dialogEditText, @NonNull Button dialogSave) {
    this.rootView = rootView;
    this.dialogCancel = dialogCancel;
    this.dialogEditText = dialogEditText;
    this.dialogSave = dialogSave;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static DialogBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static DialogBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent,
      boolean attachToParent) {
    View root = inflater.inflate(R.layout.dialog, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static DialogBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.dialogCancel;
      Button dialogCancel = ViewBindings.findChildViewById(rootView, id);
      if (dialogCancel == null) {
        break missingId;
      }

      id = R.id.dialogEditText;
      EditText dialogEditText = ViewBindings.findChildViewById(rootView, id);
      if (dialogEditText == null) {
        break missingId;
      }

      id = R.id.dialogSave;
      Button dialogSave = ViewBindings.findChildViewById(rootView, id);
      if (dialogSave == null) {
        break missingId;
      }

      return new DialogBinding((LinearLayout) rootView, dialogCancel, dialogEditText, dialogSave);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
