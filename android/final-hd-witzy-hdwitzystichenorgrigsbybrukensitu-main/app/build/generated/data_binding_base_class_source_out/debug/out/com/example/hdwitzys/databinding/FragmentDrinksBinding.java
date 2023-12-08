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

public final class FragmentDrinksBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ListView drinksListView;

  @NonNull
  public final Button itemDrinkButton1;

  @NonNull
  public final Button itemDrinkButton2;

  @NonNull
  public final Button itemDrinkButton3;

  @NonNull
  public final TextView itemDrinkDesc1;

  @NonNull
  public final TextView itemDrinkDesc2;

  @NonNull
  public final TextView itemDrinkDesc3;

  @NonNull
  public final ImageView itemDrinkIMG1;

  @NonNull
  public final ImageView itemDrinkIMG2;

  @NonNull
  public final ImageView itemDrinkIMG3;

  @NonNull
  public final LinearLayout linearLayout1;

  @NonNull
  public final LinearLayout linearLayout2;

  @NonNull
  public final LinearLayout linearLayout3;

  private FragmentDrinksBinding(@NonNull ConstraintLayout rootView,
      @NonNull ListView drinksListView, @NonNull Button itemDrinkButton1,
      @NonNull Button itemDrinkButton2, @NonNull Button itemDrinkButton3,
      @NonNull TextView itemDrinkDesc1, @NonNull TextView itemDrinkDesc2,
      @NonNull TextView itemDrinkDesc3, @NonNull ImageView itemDrinkIMG1,
      @NonNull ImageView itemDrinkIMG2, @NonNull ImageView itemDrinkIMG3,
      @NonNull LinearLayout linearLayout1, @NonNull LinearLayout linearLayout2,
      @NonNull LinearLayout linearLayout3) {
    this.rootView = rootView;
    this.drinksListView = drinksListView;
    this.itemDrinkButton1 = itemDrinkButton1;
    this.itemDrinkButton2 = itemDrinkButton2;
    this.itemDrinkButton3 = itemDrinkButton3;
    this.itemDrinkDesc1 = itemDrinkDesc1;
    this.itemDrinkDesc2 = itemDrinkDesc2;
    this.itemDrinkDesc3 = itemDrinkDesc3;
    this.itemDrinkIMG1 = itemDrinkIMG1;
    this.itemDrinkIMG2 = itemDrinkIMG2;
    this.itemDrinkIMG3 = itemDrinkIMG3;
    this.linearLayout1 = linearLayout1;
    this.linearLayout2 = linearLayout2;
    this.linearLayout3 = linearLayout3;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentDrinksBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentDrinksBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_drinks, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentDrinksBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.drinksListView;
      ListView drinksListView = ViewBindings.findChildViewById(rootView, id);
      if (drinksListView == null) {
        break missingId;
      }

      id = R.id.itemDrinkButton1;
      Button itemDrinkButton1 = ViewBindings.findChildViewById(rootView, id);
      if (itemDrinkButton1 == null) {
        break missingId;
      }

      id = R.id.itemDrinkButton2;
      Button itemDrinkButton2 = ViewBindings.findChildViewById(rootView, id);
      if (itemDrinkButton2 == null) {
        break missingId;
      }

      id = R.id.itemDrinkButton3;
      Button itemDrinkButton3 = ViewBindings.findChildViewById(rootView, id);
      if (itemDrinkButton3 == null) {
        break missingId;
      }

      id = R.id.itemDrinkDesc1;
      TextView itemDrinkDesc1 = ViewBindings.findChildViewById(rootView, id);
      if (itemDrinkDesc1 == null) {
        break missingId;
      }

      id = R.id.itemDrinkDesc2;
      TextView itemDrinkDesc2 = ViewBindings.findChildViewById(rootView, id);
      if (itemDrinkDesc2 == null) {
        break missingId;
      }

      id = R.id.itemDrinkDesc3;
      TextView itemDrinkDesc3 = ViewBindings.findChildViewById(rootView, id);
      if (itemDrinkDesc3 == null) {
        break missingId;
      }

      id = R.id.itemDrinkIMG1;
      ImageView itemDrinkIMG1 = ViewBindings.findChildViewById(rootView, id);
      if (itemDrinkIMG1 == null) {
        break missingId;
      }

      id = R.id.itemDrinkIMG2;
      ImageView itemDrinkIMG2 = ViewBindings.findChildViewById(rootView, id);
      if (itemDrinkIMG2 == null) {
        break missingId;
      }

      id = R.id.itemDrinkIMG3;
      ImageView itemDrinkIMG3 = ViewBindings.findChildViewById(rootView, id);
      if (itemDrinkIMG3 == null) {
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

      return new FragmentDrinksBinding((ConstraintLayout) rootView, drinksListView,
          itemDrinkButton1, itemDrinkButton2, itemDrinkButton3, itemDrinkDesc1, itemDrinkDesc2,
          itemDrinkDesc3, itemDrinkIMG1, itemDrinkIMG2, itemDrinkIMG3, linearLayout1, linearLayout2,
          linearLayout3);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
