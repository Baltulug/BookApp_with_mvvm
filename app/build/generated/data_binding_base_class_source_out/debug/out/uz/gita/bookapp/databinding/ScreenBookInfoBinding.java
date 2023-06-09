// Generated by view binder compiler. Do not edit!
package uz.gita.bookapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import uz.gita.bookapp.R;

public final class ScreenBookInfoBinding implements ViewBinding {
  @NonNull
  private final CoordinatorLayout rootView;

  @NonNull
  public final TextView bookAuthor;

  @NonNull
  public final ImageView bookImage;

  @NonNull
  public final TextView bookReview;

  @NonNull
  public final TextView bookTitle;

  @NonNull
  public final CollapsingToolbarLayout collapsingToolbar;

  @NonNull
  public final ImageButton downloadBtn;

  @NonNull
  public final LinearLayout linearLayout;

  @NonNull
  public final TextView startReadingText;

  @NonNull
  public final Toolbar toolbar;

  private ScreenBookInfoBinding(@NonNull CoordinatorLayout rootView, @NonNull TextView bookAuthor,
      @NonNull ImageView bookImage, @NonNull TextView bookReview, @NonNull TextView bookTitle,
      @NonNull CollapsingToolbarLayout collapsingToolbar, @NonNull ImageButton downloadBtn,
      @NonNull LinearLayout linearLayout, @NonNull TextView startReadingText,
      @NonNull Toolbar toolbar) {
    this.rootView = rootView;
    this.bookAuthor = bookAuthor;
    this.bookImage = bookImage;
    this.bookReview = bookReview;
    this.bookTitle = bookTitle;
    this.collapsingToolbar = collapsingToolbar;
    this.downloadBtn = downloadBtn;
    this.linearLayout = linearLayout;
    this.startReadingText = startReadingText;
    this.toolbar = toolbar;
  }

  @Override
  @NonNull
  public CoordinatorLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ScreenBookInfoBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ScreenBookInfoBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.screen_book_info, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ScreenBookInfoBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.book_author;
      TextView bookAuthor = ViewBindings.findChildViewById(rootView, id);
      if (bookAuthor == null) {
        break missingId;
      }

      id = R.id.book_image;
      ImageView bookImage = ViewBindings.findChildViewById(rootView, id);
      if (bookImage == null) {
        break missingId;
      }

      id = R.id.book_review;
      TextView bookReview = ViewBindings.findChildViewById(rootView, id);
      if (bookReview == null) {
        break missingId;
      }

      id = R.id.book_title;
      TextView bookTitle = ViewBindings.findChildViewById(rootView, id);
      if (bookTitle == null) {
        break missingId;
      }

      id = R.id.collapsing_toolbar;
      CollapsingToolbarLayout collapsingToolbar = ViewBindings.findChildViewById(rootView, id);
      if (collapsingToolbar == null) {
        break missingId;
      }

      id = R.id.download_btn;
      ImageButton downloadBtn = ViewBindings.findChildViewById(rootView, id);
      if (downloadBtn == null) {
        break missingId;
      }

      id = R.id.linearLayout;
      LinearLayout linearLayout = ViewBindings.findChildViewById(rootView, id);
      if (linearLayout == null) {
        break missingId;
      }

      id = R.id.start_reading_text;
      TextView startReadingText = ViewBindings.findChildViewById(rootView, id);
      if (startReadingText == null) {
        break missingId;
      }

      id = R.id.toolbar;
      Toolbar toolbar = ViewBindings.findChildViewById(rootView, id);
      if (toolbar == null) {
        break missingId;
      }

      return new ScreenBookInfoBinding((CoordinatorLayout) rootView, bookAuthor, bookImage,
          bookReview, bookTitle, collapsingToolbar, downloadBtn, linearLayout, startReadingText,
          toolbar);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
