package kr.hs.emirim.good005003.simplmwebbrowser;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText editUrl;
    Button butMove, butPrev;
    WebView web;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editUrl = (EditText) findViewById(R.id.edit_url);
        butPrev = (Button) findViewById(R.id.but_prev);
        butMove = (Button) findViewById(R.id.but_move);
        web = (WebView) findViewById(R.id.web);
        butMove.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

    }
}
