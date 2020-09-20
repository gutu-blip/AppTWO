package com.speca.app2.drawerfrags;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.speca.app2.R;

public class FeedbackFragment extends Fragment {


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_feedback,container,false);

        final EditText feedback_java_name=(EditText) view.findViewById(R.id.feedback_name);
        final EditText feedback_java_message=(EditText) view.findViewById(R.id.feedback_feedback);
        Button feedback_java_button=(Button) view.findViewById(R.id.feedback_button);

        feedback_java_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(Intent.ACTION_SEND);

                i.setType("message/html");
                i.putExtra(Intent.EXTRA_EMAIL, new String("josephgutu00@gmail.com"));
                i.putExtra(Intent.EXTRA_SUBJECT, "Banji feedback");
                i.putExtra(Intent.EXTRA_TEXT, "Name:" + feedback_java_name.getText() + "\n Message:" + feedback_java_message.getText());

                try{
                    startActivity(Intent.createChooser(i, "Please select email"));
                } catch (
                        ActivityNotFoundException ex) {
                    Toast.makeText(getActivity(), "There are no email clients", Toast.LENGTH_SHORT).show();
                }

            }
        });

        return view;
    }
}
