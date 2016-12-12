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

public class QuestionViewHolder extends RecyclerView.ViewHolder {
    private TextView textViewName,textViewDatePublished,textViewQuestion,textViewVotes;
    private ImageView imageViewUser,imageViewUp,imageViewDown;
    private CardView cardView;



    public QuestionViewHolder(View v) {
        super(v);
        imageViewUser = (ImageView) v.findViewById(R.id.imageViewUser);
        imageViewDown = (ImageView) v.findViewById(R.id.imageViewDown);
        imageViewUp = (ImageView) v.findViewById(R.id.imageViewUp);
        textViewName = (TextView) v.findViewById(R.id.textViewName);
        textViewVotes = (TextView) v.findViewById(R.id.textViewVotes);
        textViewQuestion = (TextView) v.findViewById(R.id.textViewQuestion);
        textViewDatePublished = (TextView) v.findViewById(R.id.textViewDatePublished);
        cardView = (CardView) v.findViewById(R.id.cardView);
    }

    public TextView getTextViewName() {
        return textViewName;
    }

    public void setTextViewName(TextView textViewName) {
        this.textViewName = textViewName;
    }

    public TextView getTextViewDatePublished() {
        return textViewDatePublished;
    }

    public void setTextViewDatePublished(TextView textViewDatePublished) {
        this.textViewDatePublished = textViewDatePublished;
    }

    public TextView getTextViewQuestion() {
        return textViewQuestion;
    }

    public void setTextViewQuestion(TextView textViewQuestion) {
        this.textViewQuestion = textViewQuestion;
    }

    public TextView getTextViewVotes() {
        return textViewVotes;
    }

    public void setTextViewVotes(TextView textViewVotes) {
        this.textViewVotes = textViewVotes;
    }

    public ImageView getImageViewUser() {
        return imageViewUser;
    }

    public void setImageViewUser(ImageView imageViewUser) {
        this.imageViewUser = imageViewUser;
    }

    public ImageView getImageViewUp() {
        return imageViewUp;
    }

    public void setImageViewUp(ImageView imageViewUp) {
        this.imageViewUp = imageViewUp;
    }

    public ImageView getImageViewDown() {
        return imageViewDown;
    }

    public void setImageViewDown(ImageView imageViewDown) {
        this.imageViewDown = imageViewDown;
    }

    public CardView getCardView() {
        return cardView;
    }

    public void setCardView(CardView cardView) {
        this.cardView = cardView;
    }
}
