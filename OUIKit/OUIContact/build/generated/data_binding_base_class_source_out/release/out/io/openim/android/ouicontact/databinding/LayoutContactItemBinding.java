// Generated by view binder compiler. Do not edit!
package io.openim.android.ouicontact.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import io.openim.android.ouicontact.R;
import io.openim.android.ouicore.widget.AvatarImage;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class LayoutContactItemBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final AvatarImage avatar;

  @NonNull
  public final TextView badge;

  @NonNull
  public final TextView lastMsg;

  @NonNull
  public final TextView nickName;

  @NonNull
  public final TextView time;

  private LayoutContactItemBinding(@NonNull LinearLayout rootView, @NonNull AvatarImage avatar,
      @NonNull TextView badge, @NonNull TextView lastMsg, @NonNull TextView nickName,
      @NonNull TextView time) {
    this.rootView = rootView;
    this.avatar = avatar;
    this.badge = badge;
    this.lastMsg = lastMsg;
    this.nickName = nickName;
    this.time = time;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static LayoutContactItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static LayoutContactItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.layout_contact_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static LayoutContactItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.avatar;
      AvatarImage avatar = ViewBindings.findChildViewById(rootView, id);
      if (avatar == null) {
        break missingId;
      }

      id = R.id.badge;
      TextView badge = ViewBindings.findChildViewById(rootView, id);
      if (badge == null) {
        break missingId;
      }

      id = R.id.lastMsg;
      TextView lastMsg = ViewBindings.findChildViewById(rootView, id);
      if (lastMsg == null) {
        break missingId;
      }

      id = R.id.nickName;
      TextView nickName = ViewBindings.findChildViewById(rootView, id);
      if (nickName == null) {
        break missingId;
      }

      id = R.id.time;
      TextView time = ViewBindings.findChildViewById(rootView, id);
      if (time == null) {
        break missingId;
      }

      return new LayoutContactItemBinding((LinearLayout) rootView, avatar, badge, lastMsg, nickName,
          time);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}