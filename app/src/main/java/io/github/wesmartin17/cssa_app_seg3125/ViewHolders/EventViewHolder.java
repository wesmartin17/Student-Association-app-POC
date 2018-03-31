package io.github.wesmartin17.cssa_app_seg3125.ViewHolders;

import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import io.github.wesmartin17.cssa_app_seg3125.R;

/**
 * Created by WM on 2018-03-30.
 */

public class EventViewHolder extends RecyclerView.ViewHolder {

    TextView mTitleText;
    TextView mDescriptionText;
    ImageView mImageView;

    public EventViewHolder(View itemView) {
        super(itemView);
        mTitleText = (TextView)itemView.findViewById(R.id.titleText);
        mDescriptionText = (TextView)itemView.findViewById(R.id.descriptionText);
    }

    public void setTitleText(String text){
        mTitleText.setText(text);
    }

    public void setDescriptionText(String text){
        mDescriptionText.setText(text);
    }

    public void setImgDrawable(Drawable d){

        this.mImageView.setImageDrawable(d);

    }

}
