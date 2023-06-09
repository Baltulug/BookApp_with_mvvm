// Generated by view binder compiler. Do not edit!
package uz.gita.bookapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import uz.gita.bookapp.R;

public final class ItemBookBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView bookAuthor;

  @NonNull
  public final ImageView bookCoverImage;

  @NonNull
  public final TextView bookTitle;

  @NonNull
  public final Guideline guideline;

  @NonNull
  public final LinearLayout linearLayout;

  @NonNull
  public final TextView percentage;

  @NonNull
  public final TextView startReadingText;

  private ItemBookBinding(@NonNull ConstraintLayout rootView, @NonNull TextView bookAuthor,
      @NonNull ImageView bookCoverImage, @NonNull TextView bookTitle, @NonNull Guideline guideline,
      @NonNull LinearLayout linearLayout, @NonNull TextView percentage,
      @NonNull TextView startReadingText) {
    this.rootView = rootView;
    this.bookAuthor = bookAuthor;
    this.bookCoverImage = bookCoverImage;
    this.bookTitle = bookTitle;
    this.guideline = guideline;
    this.linearLayout = linearLayout;
    this.percentage = percentage;
    this.startReadingText = startReadingText;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemBookBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemBookBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_book, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemBookBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.book_author;
      TextView bookAuthor = ViewBindings.findChildViewById(rootView, id);
      if (bookAuthor == null) {
        break missingId;
      }

      id = R.id.book_cover_image;
      ImageView bookCoverImage = ViewBindings.findChildViewById(rootView, id);
      if (bookCoverImage == null) {
        break missingId;
      }

      id = R.id.book_title;
      TextView bookTitle = ViewBindings.findChildViewById(rootView, id);
      if (bookTitle == null) {
        break missingId;
      }

      id = R.id.guideline;
      Guideline guideline = ViewBindings.findChildViewById(rootView, id);
      if (guideline == null) {
        break missingId;
      }

      id = R.id.linearLayout;
      LinearLayout linearLayout = ViewBindings.findChildViewById(rootView, id);
      if (linearLayout == null) {
        break missingId;
      }

      id = R.id.percentage;
      TextView percentage = ViewBindings.findChildViewById(rootView, id);
      if (percentage == null) {
        break missingId;
      }

      id = R.id.start_reading_text;
      TextView startReadingText = ViewBindings.findChildViewById(rootView, id);
      if (startReadingText == null) {
        break missingId;
      }

      return new ItemBookBinding((ConstraintLayout) rootView, bookAuthor, bookCoverImage, bookTitle,
          guideline, linearLayout, percentage, startReadingText);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
