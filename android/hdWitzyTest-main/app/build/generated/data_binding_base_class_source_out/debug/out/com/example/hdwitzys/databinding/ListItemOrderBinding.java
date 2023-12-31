// Generated by view binder compiler. Do not edit!
package com.example.hdwitzys.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.hdwitzys.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ListItemOrderBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button deleteButton;

  @NonNull
  public final Button editButton;

  @NonNull
  public final TextView itemNameTextView;

  @NonNull
  public final TextView itemPriceTextView;

  private ListItemOrderBinding(@NonNull LinearLayout rootView, @NonNull Button deleteButton,
      @NonNull Button editButton, @NonNull TextView itemNameTextView,
      @NonNull TextView itemPriceTextView) {
    this.rootView = rootView;
    this.deleteButton = deleteButton;
    this.editButton = editButton;
    this.itemNameTextView = itemNameTextView;
    this.itemPriceTextView = itemPriceTextView;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ListItemOrderBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ListItemOrderBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.list_item_order, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ListItemOrderBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.deleteButton;
      Button deleteButton = ViewBindings.findChildViewById(rootView, id);
      if (deleteButton == null) {
        break missingId;
      }

      id = R.id.editButton;
      Button editButton = ViewBindings.findChildViewById(rootView, id);
      if (editButton == null) {
        break missingId;
      }

      id = R.id.itemNameTextView;
      TextView itemNameTextView = ViewBindings.findChildViewById(rootView, id);
      if (itemNameTextView == null) {
        break missingId;
      }

      id = R.id.itemPriceTextView;
      TextView itemPriceTextView = ViewBindings.findChildViewById(rootView, id);
      if (itemPriceTextView == null) {
        break missingId;
      }

      return new ListItemOrderBinding((LinearLayout) rootView, deleteButton, editButton,
          itemNameTextView, itemPriceTextView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
