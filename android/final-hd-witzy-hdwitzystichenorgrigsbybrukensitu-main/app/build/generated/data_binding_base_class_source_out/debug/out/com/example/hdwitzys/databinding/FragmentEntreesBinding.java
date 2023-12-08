// Generated by view binder compiler. Do not edit!
package com.example.hdwitzys.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
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

public final class FragmentEntreesBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ListView entreesListView;

  @NonNull
  public final Button itemEntreeButton1;

  @NonNull
  public final Button itemEntreeButton2;

  @NonNull
  public final Button itemEntreeButton3;

  @NonNull
  public final Button itemEntreeButton4;

  @NonNull
  public final Button itemEntreeButton5;

  @NonNull
  public final Button itemEntreeButton6;

  @NonNull
  public final Button itemEntreeButton7;

  @NonNull
  public final Button itemEntreeButton8;

  @NonNull
  public final TextView itemEntreeDesc1;

  @NonNull
  public final TextView itemEntreeDesc2;

  @NonNull
  public final TextView itemEntreeDesc3;

  @NonNull
  public final TextView itemEntreeDesc4;

  @NonNull
  public final TextView itemEntreeDesc5;

  @NonNull
  public final TextView itemEntreeDesc6;

  @NonNull
  public final TextView itemEntreeDesc7;

  @NonNull
  public final TextView itemEntreeDesc8;

  @NonNull
  public final ImageView itemEntreeIMG1;

  @NonNull
  public final ImageView itemEntreeIMG2;

  @NonNull
  public final ImageView itemEntreeIMG3;

  @NonNull
  public final ImageView itemEntreeIMG4;

  @NonNull
  public final ImageView itemEntreeIMG5;

  @NonNull
  public final ImageView itemEntreeIMG6;

  @NonNull
  public final ImageView itemEntreeIMG7;

  @NonNull
  public final ImageView itemEntreeIMG8;

  @NonNull
  public final LinearLayout linearLayout1;

  @NonNull
  public final LinearLayout linearLayout2;

  @NonNull
  public final LinearLayout linearLayout3;

  @NonNull
  public final LinearLayout linearLayout4;

  @NonNull
  public final LinearLayout linearLayout5;

  @NonNull
  public final LinearLayout linearLayout6;

  @NonNull
  public final LinearLayout linearLayout7;

  @NonNull
  public final LinearLayout linearLayout8;

  private FragmentEntreesBinding(@NonNull ConstraintLayout rootView,
      @NonNull ListView entreesListView, @NonNull Button itemEntreeButton1,
      @NonNull Button itemEntreeButton2, @NonNull Button itemEntreeButton3,
      @NonNull Button itemEntreeButton4, @NonNull Button itemEntreeButton5,
      @NonNull Button itemEntreeButton6, @NonNull Button itemEntreeButton7,
      @NonNull Button itemEntreeButton8, @NonNull TextView itemEntreeDesc1,
      @NonNull TextView itemEntreeDesc2, @NonNull TextView itemEntreeDesc3,
      @NonNull TextView itemEntreeDesc4, @NonNull TextView itemEntreeDesc5,
      @NonNull TextView itemEntreeDesc6, @NonNull TextView itemEntreeDesc7,
      @NonNull TextView itemEntreeDesc8, @NonNull ImageView itemEntreeIMG1,
      @NonNull ImageView itemEntreeIMG2, @NonNull ImageView itemEntreeIMG3,
      @NonNull ImageView itemEntreeIMG4, @NonNull ImageView itemEntreeIMG5,
      @NonNull ImageView itemEntreeIMG6, @NonNull ImageView itemEntreeIMG7,
      @NonNull ImageView itemEntreeIMG8, @NonNull LinearLayout linearLayout1,
      @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3,
      @NonNull LinearLayout linearLayout4, @NonNull LinearLayout linearLayout5,
      @NonNull LinearLayout linearLayout6, @NonNull LinearLayout linearLayout7,
      @NonNull LinearLayout linearLayout8) {
    this.rootView = rootView;
    this.entreesListView = entreesListView;
    this.itemEntreeButton1 = itemEntreeButton1;
    this.itemEntreeButton2 = itemEntreeButton2;
    this.itemEntreeButton3 = itemEntreeButton3;
    this.itemEntreeButton4 = itemEntreeButton4;
    this.itemEntreeButton5 = itemEntreeButton5;
    this.itemEntreeButton6 = itemEntreeButton6;
    this.itemEntreeButton7 = itemEntreeButton7;
    this.itemEntreeButton8 = itemEntreeButton8;
    this.itemEntreeDesc1 = itemEntreeDesc1;
    this.itemEntreeDesc2 = itemEntreeDesc2;
    this.itemEntreeDesc3 = itemEntreeDesc3;
    this.itemEntreeDesc4 = itemEntreeDesc4;
    this.itemEntreeDesc5 = itemEntreeDesc5;
    this.itemEntreeDesc6 = itemEntreeDesc6;
    this.itemEntreeDesc7 = itemEntreeDesc7;
    this.itemEntreeDesc8 = itemEntreeDesc8;
    this.itemEntreeIMG1 = itemEntreeIMG1;
    this.itemEntreeIMG2 = itemEntreeIMG2;
    this.itemEntreeIMG3 = itemEntreeIMG3;
    this.itemEntreeIMG4 = itemEntreeIMG4;
    this.itemEntreeIMG5 = itemEntreeIMG5;
    this.itemEntreeIMG6 = itemEntreeIMG6;
    this.itemEntreeIMG7 = itemEntreeIMG7;
    this.itemEntreeIMG8 = itemEntreeIMG8;
    this.linearLayout1 = linearLayout1;
    this.linearLayout2 = linearLayout2;
    this.linearLayout3 = linearLayout3;
    this.linearLayout4 = linearLayout4;
    this.linearLayout5 = linearLayout5;
    this.linearLayout6 = linearLayout6;
    this.linearLayout7 = linearLayout7;
    this.linearLayout8 = linearLayout8;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentEntreesBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentEntreesBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_entrees, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentEntreesBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.entreesListView;
      ListView entreesListView = ViewBindings.findChildViewById(rootView, id);
      if (entreesListView == null) {
        break missingId;
      }

      id = R.id.itemEntreeButton1;
      Button itemEntreeButton1 = ViewBindings.findChildViewById(rootView, id);
      if (itemEntreeButton1 == null) {
        break missingId;
      }

      id = R.id.itemEntreeButton2;
      Button itemEntreeButton2 = ViewBindings.findChildViewById(rootView, id);
      if (itemEntreeButton2 == null) {
        break missingId;
      }

      id = R.id.itemEntreeButton3;
      Button itemEntreeButton3 = ViewBindings.findChildViewById(rootView, id);
      if (itemEntreeButton3 == null) {
        break missingId;
      }

      id = R.id.itemEntreeButton4;
      Button itemEntreeButton4 = ViewBindings.findChildViewById(rootView, id);
      if (itemEntreeButton4 == null) {
        break missingId;
      }

      id = R.id.itemEntreeButton5;
      Button itemEntreeButton5 = ViewBindings.findChildViewById(rootView, id);
      if (itemEntreeButton5 == null) {
        break missingId;
      }

      id = R.id.itemEntreeButton6;
      Button itemEntreeButton6 = ViewBindings.findChildViewById(rootView, id);
      if (itemEntreeButton6 == null) {
        break missingId;
      }

      id = R.id.itemEntreeButton7;
      Button itemEntreeButton7 = ViewBindings.findChildViewById(rootView, id);
      if (itemEntreeButton7 == null) {
        break missingId;
      }

      id = R.id.itemEntreeButton8;
      Button itemEntreeButton8 = ViewBindings.findChildViewById(rootView, id);
      if (itemEntreeButton8 == null) {
        break missingId;
      }

      id = R.id.itemEntreeDesc1;
      TextView itemEntreeDesc1 = ViewBindings.findChildViewById(rootView, id);
      if (itemEntreeDesc1 == null) {
        break missingId;
      }

      id = R.id.itemEntreeDesc2;
      TextView itemEntreeDesc2 = ViewBindings.findChildViewById(rootView, id);
      if (itemEntreeDesc2 == null) {
        break missingId;
      }

      id = R.id.itemEntreeDesc3;
      TextView itemEntreeDesc3 = ViewBindings.findChildViewById(rootView, id);
      if (itemEntreeDesc3 == null) {
        break missingId;
      }

      id = R.id.itemEntreeDesc4;
      TextView itemEntreeDesc4 = ViewBindings.findChildViewById(rootView, id);
      if (itemEntreeDesc4 == null) {
        break missingId;
      }

      id = R.id.itemEntreeDesc5;
      TextView itemEntreeDesc5 = ViewBindings.findChildViewById(rootView, id);
      if (itemEntreeDesc5 == null) {
        break missingId;
      }

      id = R.id.itemEntreeDesc6;
      TextView itemEntreeDesc6 = ViewBindings.findChildViewById(rootView, id);
      if (itemEntreeDesc6 == null) {
        break missingId;
      }

      id = R.id.itemEntreeDesc7;
      TextView itemEntreeDesc7 = ViewBindings.findChildViewById(rootView, id);
      if (itemEntreeDesc7 == null) {
        break missingId;
      }

      id = R.id.itemEntreeDesc8;
      TextView itemEntreeDesc8 = ViewBindings.findChildViewById(rootView, id);
      if (itemEntreeDesc8 == null) {
        break missingId;
      }

      id = R.id.itemEntreeIMG1;
      ImageView itemEntreeIMG1 = ViewBindings.findChildViewById(rootView, id);
      if (itemEntreeIMG1 == null) {
        break missingId;
      }

      id = R.id.itemEntreeIMG2;
      ImageView itemEntreeIMG2 = ViewBindings.findChildViewById(rootView, id);
      if (itemEntreeIMG2 == null) {
        break missingId;
      }

      id = R.id.itemEntreeIMG3;
      ImageView itemEntreeIMG3 = ViewBindings.findChildViewById(rootView, id);
      if (itemEntreeIMG3 == null) {
        break missingId;
      }

      id = R.id.itemEntreeIMG4;
      ImageView itemEntreeIMG4 = ViewBindings.findChildViewById(rootView, id);
      if (itemEntreeIMG4 == null) {
        break missingId;
      }

      id = R.id.itemEntreeIMG5;
      ImageView itemEntreeIMG5 = ViewBindings.findChildViewById(rootView, id);
      if (itemEntreeIMG5 == null) {
        break missingId;
      }

      id = R.id.itemEntreeIMG6;
      ImageView itemEntreeIMG6 = ViewBindings.findChildViewById(rootView, id);
      if (itemEntreeIMG6 == null) {
        break missingId;
      }

      id = R.id.itemEntreeIMG7;
      ImageView itemEntreeIMG7 = ViewBindings.findChildViewById(rootView, id);
      if (itemEntreeIMG7 == null) {
        break missingId;
      }

      id = R.id.itemEntreeIMG8;
      ImageView itemEntreeIMG8 = ViewBindings.findChildViewById(rootView, id);
      if (itemEntreeIMG8 == null) {
        break missingId;
      }

      id = R.id.linearLayout1;
      LinearLayout linearLayout1 = ViewBindings.findChildViewById(rootView, id);
      if (linearLayout1 == null) {
        break missingId;
      }

      id = R.id.linearLayout2;
      LinearLayout linearLayout2 = ViewBindings.findChildViewById(rootView, id);
      if (linearLayout2 == null) {
        break missingId;
      }

      id = R.id.linearLayout3;
      LinearLayout linearLayout3 = ViewBindings.findChildViewById(rootView, id);
      if (linearLayout3 == null) {
        break missingId;
      }

      id = R.id.linearLayout4;
      LinearLayout linearLayout4 = ViewBindings.findChildViewById(rootView, id);
      if (linearLayout4 == null) {
        break missingId;
      }

      id = R.id.linearLayout5;
      LinearLayout linearLayout5 = ViewBindings.findChildViewById(rootView, id);
      if (linearLayout5 == null) {
        break missingId;
      }

      id = R.id.linearLayout6;
      LinearLayout linearLayout6 = ViewBindings.findChildViewById(rootView, id);
      if (linearLayout6 == null) {
        break missingId;
      }

      id = R.id.linearLayout7;
      LinearLayout linearLayout7 = ViewBindings.findChildViewById(rootView, id);
      if (linearLayout7 == null) {
        break missingId;
      }

      id = R.id.linearLayout8;
      LinearLayout linearLayout8 = ViewBindings.findChildViewById(rootView, id);
      if (linearLayout8 == null) {
        break missingId;
      }

      return new FragmentEntreesBinding((ConstraintLayout) rootView, entreesListView,
          itemEntreeButton1, itemEntreeButton2, itemEntreeButton3, itemEntreeButton4,
          itemEntreeButton5, itemEntreeButton6, itemEntreeButton7, itemEntreeButton8,
          itemEntreeDesc1, itemEntreeDesc2, itemEntreeDesc3, itemEntreeDesc4, itemEntreeDesc5,
          itemEntreeDesc6, itemEntreeDesc7, itemEntreeDesc8, itemEntreeIMG1, itemEntreeIMG2,
          itemEntreeIMG3, itemEntreeIMG4, itemEntreeIMG5, itemEntreeIMG6, itemEntreeIMG7,
          itemEntreeIMG8, linearLayout1, linearLayout2, linearLayout3, linearLayout4, linearLayout5,
          linearLayout6, linearLayout7, linearLayout8);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
