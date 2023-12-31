// Generated by view binder compiler. Do not edit!
package com.example.hdwitzys.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.hdwitzys.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentCheckoutBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ListView checkoutListView;

  @NonNull
  public final TextView checkoutTitleTextView;

  @NonNull
  public final TextView totalCostTextView;

  private FragmentCheckoutBinding(@NonNull ConstraintLayout rootView,
      @NonNull ListView checkoutListView, @NonNull TextView checkoutTitleTextView,
      @NonNull TextView totalCostTextView) {
    this.rootView = rootView;
    this.checkoutListView = checkoutListView;
    this.checkoutTitleTextView = checkoutTitleTextView;
    this.totalCostTextView = totalCostTextView;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentCheckoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentCheckoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_checkout, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentCheckoutBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.checkoutListView;
      ListView checkoutListView = ViewBindings.findChildViewById(rootView, id);
      if (checkoutListView == null) {
        break missingId;
      }

      id = R.id.checkoutTitleTextView;
      TextView checkoutTitleTextView = ViewBindings.findChildViewById(rootView, id);
      if (checkoutTitleTextView == null) {
        break missingId;
      }

      id = R.id.totalCostTextView;
      TextView totalCostTextView = ViewBindings.findChildViewById(rootView, id);
      if (totalCostTextView == null) {
        break missingId;
      }

      return new FragmentCheckoutBinding((ConstraintLayout) rootView, checkoutListView,
          checkoutTitleTextView, totalCostTextView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
