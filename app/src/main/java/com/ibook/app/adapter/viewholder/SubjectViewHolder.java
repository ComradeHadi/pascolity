package com.ibook.app.adapter.viewholder;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.ibook.app.R;


/**
 * Created by Monarchy on 03/12/2016.
 */

public class SubjectViewHolder extends RecyclerView.ViewHolder {
    private TextView textViewName;
    private CardView cardView;
    private ImageView imageViewIcon;


    public SubjectViewHolder(View v) {
        super(v);
        textViewName = (TextView) v.findViewById(R.id.textViewName);
        cardView = (CardView) v.findViewById(R.id.cardView);
        imageViewIcon = (ImageView) v.findViewById(R.id.imageViewIcon);
    }

    public TextView getTextViewName() {
        return textViewName;
    }

    public void setTextViewName(TextView textViewName) {
        this.textViewName = textViewName;
    }

    public ImageView getImageViewIcon() {
        return imageViewIcon;
    }

    public CardView getCardView() {
        return cardView;
    }

    public void setCardView(CardView cardView) {
        this.cardView = cardView;
    }


}
