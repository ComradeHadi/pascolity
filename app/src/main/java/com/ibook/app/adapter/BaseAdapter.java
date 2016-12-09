package com.ibook.app.adapter;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.ibook.app.R;
import com.ibook.app.adapter.item.Book;
import com.ibook.app.adapter.item.ExamsSubject;
import com.ibook.app.adapter.item.ExamsYear;
import com.ibook.app.adapter.viewholder.BookViewHolder;
import com.ibook.app.adapter.viewholder.ExamsYearViewHolder;
import com.ibook.app.adapter.viewholder.SubjectViewHolder;

import java.util.List;

/**
 * Created by monarchy on 12/03/15.
 */
public class BaseAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private List<Object> items;
    private Activity activity;
    private final int BOOK = 0, EXAMS_YEAR = 1, SUBJECT = 2;
    private int lastPosition = -1;


    public BaseAdapter(Activity activity, List<Object> items) {
        this.items = items;
        this.activity = activity;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        RecyclerView.ViewHolder viewHolder = null;
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        switch (viewType) {
            case BOOK:
                View header = inflater.inflate(R.layout.book_item, viewGroup, false);
                viewHolder = new BookViewHolder(header);
                break;
            case EXAMS_YEAR:
                View examsYear = inflater.inflate(R.layout.exam_year_item, viewGroup, false);
                viewHolder = new ExamsYearViewHolder(examsYear);
                break;
            case SUBJECT:
                View subject = inflater.inflate(R.layout.subject_item, viewGroup, false);
                viewHolder = new SubjectViewHolder(subject);
                break;
        }
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        switch (holder.getItemViewType()) {
            case BOOK:
                BookViewHolder bookViewHolder = (BookViewHolder) holder;
                SetUp.book(bookViewHolder, (Book) items.get(position), position, activity);
                break;
            case EXAMS_YEAR:
                ExamsYearViewHolder examsYearViewHolder = (ExamsYearViewHolder) holder;
                SetUp.examsYear(examsYearViewHolder, (ExamsYear) items.get(position), position, activity);
                break;
            case SUBJECT:
                SubjectViewHolder subjectViewHolder = (SubjectViewHolder) holder;
                SetUp.subject(subjectViewHolder, (ExamsSubject) items.get(position), position, activity);
                break;
        }

        setAnimation(holder.itemView, position);

    }

    private void setAnimation(View viewToAnimate, int position) {
        if (position > lastPosition) {
            Animation animation = AnimationUtils.loadAnimation(viewToAnimate.getContext(), R.anim.slide_up);
            viewToAnimate.startAnimation(animation);
            lastPosition = position;
        }
    }


    @Override
    public int getItemCount() {
        return this.items.size();
    }


    @Override
    public int getItemViewType(int position) {
        if (items.get(position) instanceof Book) {
            return BOOK;
        } else if (items.get(position) instanceof ExamsYear) {
            return EXAMS_YEAR;
        } else if (items.get(position) instanceof ExamsSubject) {
            return SUBJECT;
        }
        return -1;
    }

}
