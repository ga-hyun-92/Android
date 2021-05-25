package com.koreait.examplefragment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    MainFragment mainFragment;
    MenuFragment menuFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //메인화면에서 인플레이트될때 메모리에 객체로 올라가있음
        mainFragment=(MainFragment)getSupportFragmentManager().findFragmentById(R.id.mainFragment);

        //인플레이트 하기 전이므로 직접 객체를 생성해줌
        menuFragment=new MenuFragment();

    }
    public  void onFragmentChanged(int index){
        if(index==0){
            getSupportFragmentManager().beginTransaction().replace(R.id.container,menuFragment).commit();
        }else{
            getSupportFragmentManager().beginTransaction().replace(R.id.container,mainFragment).commit();
        }
    }
}