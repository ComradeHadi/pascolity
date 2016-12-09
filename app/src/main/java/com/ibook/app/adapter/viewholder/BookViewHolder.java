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

public class BookViewHolder extends RecyclerView.ViewHolder {
    private TextView textViewTitle,textViewDetail,textViewCompanyName,textViewDatePublished;
    private ImageView imageViewBookCover,imageViewDownload,imageViewBookCompany;
    private CardView cardView;



    public BookViewHolder(View v) {
        super(v);
        imageViewBookCover = (ImageView) v.findViewById(R.id.imageViewBookCover);
        imageViewBookCompany = (ImageView) v.findViewById(R.id.imageViewBookCompany);
        imageViewDownload = (ImageView) v.findViewById(R.id.imageViewDownload);
        textViewTitle = (TextView) v.findViewById(R.id.textViewTitle);
        textViewDetail = (TextView) v.findViewById(R.id.textViewDetail);
        textViewDatePublished = (TextView) v.findViewById(R.id.textViewDatePublished);
        textViewCompanyName = (TextView) v.findViewById(R.id.textViewCompanyName);
        cardView = (CardView) v.findViewById(R.id.cardView);
    }

    public TextView getTextViewTitle() {
        return textViewTitle;
    }

    public void setTextViewTitle(TextView textViewTitle) {
        this.textViewTitle = textViewTitle;
    }

    public TextView getTextViewDetail() {
        return textViewDetail;
    }

    public void setTextViewDetail(TextView textViewDetail) {
        this.textViewDetail = textViewDetail;
    }

    public TextView getTextViewCompanyName() {
        return textViewCompanyName;
    }

    public void setTextViewCompanyName(TextView textViewCompanyName) {
        this.textViewCompanyName = textViewCompanyName;
    }

    public TextView getTextViewDatePublished() {
        return textViewDatePublished;
    }

    public void setTextViewDatePublished(TextView textViewDatePublished) {
        this.textViewDatePublished = textViewDatePublished;
    }

    public ImageView getImageViewBookCover() {
        return imageViewBookCover;
    }

    public void setImageViewBookCover(ImageView imageViewBookCover) {
        this.imageViewBookCover = imageViewBookCover;
    }

    public ImageView getImageViewDownload() {
        return imageViewDownload;
    }

    public void setImageViewDownload(ImageView imageViewDownload) {
        this.imageViewDownload = imageViewDownload;
    }

    public ImageView getImageViewBookCompany() {
        return imageViewBookCompany;
    }

    public void setImageViewBookCompany(ImageView imageViewBookCompany) {
        this.imageViewBookCompany = imageViewBookCompany;
    }

    public CardView getCardView() {
        return cardView;
    }

    public void setCardView(CardView cardView) {
        this.cardView = cardView;
    }
}
