package com.ibook.app.util;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;

import com.ibook.app.R;


public class PromptDialog {
    public interface DialogClickListener {
        void onYesClick(String question);
        void onNoClick();
    }

    private Context context;
    private final DialogClickListener listener;

    public PromptDialog(final Context context,DialogClickListener listener) {
        this.context = context;
        this.listener = listener;
    }

    public void showDialog() {
        final Dialog view = new Dialog(context);
        view.requestWindowFeature(Window.FEATURE_NO_TITLE);
        view.setCancelable(true);
        view.setContentView(R.layout.ask_question);

        final EditText editTextQuestion = (EditText) view.findViewById(R.id.editTextQuestion);
        final Button button = (Button) view.findViewById(R.id.button);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String question = editTextQuestion.getText().toString();
                listener.onYesClick(question);
                view.dismiss();
            }
        });

        view.show();

    }


}


