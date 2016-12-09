package com.ibook.app.adapter;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.ibook.app.R;
import com.ibook.app.adapter.item.Book;
import com.ibook.app.adapter.item.ExamsSubject;
import com.ibook.app.adapter.item.ExamsYear;
import com.ibook.app.adapter.viewholder.BookViewHolder;
import com.ibook.app.adapter.viewholder.ExamsYearViewHolder;
import com.ibook.app.adapter.viewholder.SubjectViewHolder;
import com.ibook.app.help.AppUtils;
import com.ibook.app.main.ExamsPrep;
import com.ibook.app.main.Subject;
import com.ibook.app.util.Mics;
import com.squareup.picasso.Picasso;

/**
 * Created by Monarchy on 08/12/2016.
 */

public class SetUp {

    public static void book(BookViewHolder bookViewHolder, Book book, int position, Activity activity) {

        View view = bookViewHolder.itemView;
        Context context = view.getContext();
        ImageView imageViewCompany = bookViewHolder.getImageViewBookCompany();
        ImageView imageViewBookCover = bookViewHolder.getImageViewBookCover();
        TextView textViewTitle = bookViewHolder.getTextViewTitle();
        TextView textViewCaption = bookViewHolder.getTextViewDetail();
        TextView textViewCompanyName = bookViewHolder.getTextViewCompanyName();
        TextView textViewPublishedDate = bookViewHolder.getTextViewDatePublished();

        String imageCover = book.getCover();
        String imageCompany = book.getOwner().getProfile();


        textViewCaption.setText(book.getCaption());
        textViewTitle.setText(book.getTitle());
        textViewCompanyName.setText(book.getOwner().getCompany());
        textViewPublishedDate.setText(book.getDatePublished());

        if (!imageCover.isEmpty()) {
            Picasso.with(imageViewBookCover.getContext()).load(book.getCover()).placeholder(R.color.colorGrey).into(imageViewBookCover);
        } else {
            Picasso.with(imageViewBookCover.getContext()).load(R.color.colorGrey).placeholder(R.color.colorGrey).into(imageViewBookCover);
        }
        if (!imageCompany.isEmpty()) {
            Picasso.with(imageViewCompany.getContext()).load(book.getCover()).placeholder(R.color.colorGrey).into(imageViewCompany);
        } else {
            Picasso.with(imageViewBookCover.getContext()).load(R.color.colorGrey).placeholder(R.color.colorGrey).into(imageViewCompany);
        }

    }

    public static void examsYear(ExamsYearViewHolder examsYearViewHolder, ExamsYear examsYear, int position, final Activity activity) {

        View view = examsYearViewHolder.itemView;
        Context context = view.getContext();
        TextView textViewName = examsYearViewHolder.getTextViewName();
        TextView textViewType = examsYearViewHolder.getTextViewType();
        View viewSplit = examsYearViewHolder.getView();


        textViewName.setText(examsYear.getYear());
        textViewType.setText(examsYear.getTypeOfExams());
        viewSplit.setBackgroundColor(Color.parseColor(Mics.randColorHex(context)));


        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AppUtils.navigateUpKeep(activity, Subject.class, null);
            }
        });


    }

    public static void subject(SubjectViewHolder subjectViewHolder, ExamsSubject subject, int position, final Activity activity) {

        View view = subjectViewHolder.itemView;
        Context context = view.getContext();
        TextView textViewName = subjectViewHolder.getTextViewName();
        ImageView imageViewIcon = subjectViewHolder.getImageViewIcon();


        textViewName.setText(subject.getName());
        imageViewIcon.setImageResource(subject.getIcon());


        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AppUtils.navigateUpKeep(activity, ExamsPrep.class, null);
            }
        });


    }
}
