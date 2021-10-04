package com.example.moayo;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TabHost;

public class MainActivity extends AppCompatActivity {
    Button btnBaemin;
    Button btnBaedaltong;
    Button btnYogiyo;
    Button btnShuttleDelivery;
    Button btnMarketKurly;
    Button btnLotteEats;
    Button btnMacdelivery;
    Button btnCoupang;
    Button btnEmartTraders;
    Button btnLottemart;
    Button btnElevenStreet;
    Button btnGmarket;
    Button btnEnd;
    Button btnEnd2;
    ImageView up_button;
    ScrollView scrollView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnBaemin = (Button) findViewById(R.id.btnBaemin);
        btnBaedaltong = (Button) findViewById(R.id.btnBaedaltong);
        btnYogiyo = (Button) findViewById(R.id.btnYogiyo);
        btnShuttleDelivery = findViewById(R.id.btnShuttleDelivery);
        btnMarketKurly = (Button) findViewById(R.id.btnMarketKurly);
        btnLotteEats = (Button) findViewById(R.id.btnLotteEats);
        btnMacdelivery=(Button) findViewById(R.id.btnMacdelivery);
        btnGmarket = (Button) findViewById(R.id.btnGmarket);
        btnElevenStreet = (Button) findViewById(R.id.btnElevenStreet);
        btnCoupang = (Button) findViewById(R.id.btnCoupang);
        btnEmartTraders= (Button) findViewById(R.id.btnEmartTraders);
        btnLottemart= (Button) findViewById(R.id.btnLotteMart);
        btnEnd = (Button) findViewById(R.id.btnEnd);
        btnEnd2 = (Button) findViewById(R.id.btnEnd2);
        up_button = (ImageView) findViewById(R.id.up_button);
        scrollView = (ScrollView)findViewById(R.id.scrollView);

        up_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scrollView.fullScroll(scrollView.FOCUS_UP);
            }
        });

        TabHost tabHost1 = (TabHost) findViewById(R.id.tabHost1) ;
        tabHost1.setup() ;

        // 첫 번째 Tab. (탭 표시 텍스트:"배달"), (페이지 뷰:"Derlivery")
        TabHost.TabSpec ts1 = tabHost1.newTabSpec("Tab Spec 1") ;
        ts1.setContent(R.id.Derlivery) ;
        ts1.setIndicator("배달") ;
        tabHost1.addTab(ts1)  ;

        btnBaemin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.baemin.com/"));
                startActivity(mIntent);

            }
        });

        btnYogiyo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.yogiyo.co.kr/mobile/#/"));
                startActivity(mIntent);

            }
        });

        btnBaedaltong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.bdtong.co.kr/index.php"));
                startActivity(mIntent);

            }
        });

        btnShuttleDelivery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.shuttledelivery.co.kr/ko"));
                startActivity(mIntent);

            }
        });

        btnLotteEats.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent mIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.lotteeatz.com/main/main"));
                startActivity(mIntent);


            }
        });

        btnMacdelivery.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent mIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.mcdelivery.co.kr/kr/home.html"));
                startActivity(mIntent);


            }
        });


        btnEnd.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                finish();


            }
        });

        // 두 번째 Tab. (탭 표시 텍스트:"쇼핑"), (페이지 뷰:"Shopping")
        TabHost.TabSpec ts2 = tabHost1.newTabSpec("Tab Spec 2") ;
        ts2.setContent(R.id.Shopping) ;
        ts2.setIndicator("쇼핑") ;
        tabHost1.addTab(ts2) ;

        btnLottemart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.lotteon.com/"));
                startActivity(mIntent);

            }
        });

        btnCoupang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://m.coupang.com/nm/"));
                startActivity(mIntent);

            }
        });


        btnEmartTraders.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://traders.ssg.com/"));
                startActivity(mIntent);

            }
        });

        btnMarketKurly.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent mIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.kurly.com/shop/main/index.php"));
                startActivity(mIntent);


            }
        });

        btnElevenStreet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.11st.co.kr/"));
                startActivity(mIntent);

            }
        });

        btnGmarket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.gmarket.co.kr/"));
                startActivity(mIntent);

            }
        });

        btnEnd2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                finish();


            }
        });

        }

    }
