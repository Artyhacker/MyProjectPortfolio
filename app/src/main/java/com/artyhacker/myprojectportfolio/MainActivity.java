package com.artyhacker.myprojectportfolio;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button movieBtn;
    private Button stockBtn;
    private Button readerBtn;
    private Button newsBtn;
    private Button graduationBtn;

    private Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mContext = this;

        movieBtn = (Button) findViewById(R.id.main_movie_btn);
        stockBtn = (Button) findViewById(R.id.main_stock_btn);
        readerBtn = (Button) findViewById(R.id.main_reader_btn);
        newsBtn = (Button) findViewById(R.id.main_news_btn);
        graduationBtn = (Button) findViewById(R.id.main_graduation_btn);

        movieBtn.setOnClickListener(this);
        stockBtn.setOnClickListener(this);
        readerBtn.setOnClickListener(this);
        newsBtn.setOnClickListener(this);
        graduationBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.main_movie_btn:
                Toast.makeText(mContext, "启动应用：热门电影", Toast.LENGTH_SHORT).show();
                break;
            case R.id.main_stock_btn:
                Toast.makeText(mContext, "启动应用：股票雄鹰", Toast.LENGTH_SHORT).show();
                break;
            case R.id.main_reader_btn:
                Toast.makeText(mContext, "启动应用：XYZ阅读器", Toast.LENGTH_SHORT).show();
                break;
            case R.id.main_news_btn:
                Toast.makeText(mContext, "启动应用：最新闻", Toast.LENGTH_SHORT).show();
                break;
            case R.id.main_graduation_btn:
                Toast.makeText(mContext, "启动应用：毕业设计", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
