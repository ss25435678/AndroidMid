package com.edu.ntut.csie.app01_105590037;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText editText;
    private Button button;
    private TextView grade,gradetras;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText= (EditText) findViewById(R.id.input);
        button = (Button) findViewById(R.id.trans);
        gradetras = (TextView) findViewById(R.id.gradetrans);

        button.setOnClickListener(buttonClick);
    }
    private View.OnClickListener buttonClick = new View.OnClickListener()
    {
        @Override
        public void onClick(View v) {
            String inputGrade = editText.getText().toString();
            int getGrade = Integer.parseInt(editText.getText().toString());

            String gradetrans = getString(R.string.gradetrans);

                if (getGrade <= 59 && getGrade >=0) {
                    gradetrans += getString(R.string.grade059);
                } else if (getGrade <= 60 && getGrade < 70) {
                    gradetrans += getString(R.string.grade6070);
                } else if (getGrade <= 70 && getGrade <80) {
                    gradetrans += getString(R.string.grade7080);
                } else if (getGrade <= 80 && getGrade < 90) {
                    gradetrans += getString(R.string.grade8090);
                } else if (getGrade <= 90 && getGrade < 100) {
                    gradetrans += getString(R.string.grade90100);
                } else if (getGrade >100) {
                    gradetrans += getString(R.string.grade100);
                } else if (getGrade < 0)
                {
                    gradetrans += getString(R.string.grade0);
                }
            gradetras.setText(gradetrans);
        }

    };
}
