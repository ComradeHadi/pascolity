package com.ibook.app.adapter.viewholder;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.ibook.app.R;


/**
 * Created by Monarchy on 03/12/2016.
 */

public class ExamsYearViewHolder extends RecyclerView.ViewHolder {
    private TextView textViewName, textViewType;
    private CardView cardView;
    private View view;


    public ExamsYearViewHolder(View v) {
        super(v);
        textViewName = (TextView) v.findViewById(R.id.textViewName);
        textViewType = (TextView) v.findViewById(R.id.textViewType);
        cardView = (CardView) v.findViewById(R.id.cardView);
        view = v.findViewById(R.id.view);
    }

    public TextView getTextViewName() {
        return textViewName;
    }

    public void setTextViewName(TextView textViewName) {
        this.textViewName = textViewName;
    }

    public TextView getTextViewType() {
        return textViewType;
    }

    public void setTextViewType(TextView textViewType) {
        this.textViewType = textViewType;
    }

    public CardView getCardView() {
        return cardView;
    }

    public void setCardView(CardView cardView) {
        this.cardView = cardView;
    }

    public View getView() {
        return view;
    }

    public void setView(View view) {
        this.view = view;
    }
}
