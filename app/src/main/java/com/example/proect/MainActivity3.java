package com.example.proect;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;


import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        BottomNavigationView bnv = findViewById(R.id.bottomNavigation);
        bnv.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.button5:
                        launchFragmentOne();
                        break;
                    case R.id.button6:
                        launchFragmentTwo();
                        break;
                    case R.id.button7:
                        launchFragmentThree();
                        break;
                    case R.id.button8:
                        launchFragmentFour();
                        break;
                }
                return true;
            }
        });
    }

// public void Change(View view) {
// Fragment fragment = null;
//
// switch (view.getId()) {
// case R.id.button:
// fragment = new FragmentOne();
// break;
// case R.id.button2:
// fragment = new FragmentTwo();
// break;
// case R.id.button3:
// fragment = new FragmentThree();
// break;
// }
//
// FragmentManager fm = getSupportFragmentManager();
// FragmentTransaction ft = fm.beginTransaction();
// ft.replace(R.id.fr_place, fragment);
// ft.commit();
//
// }

    private void launchFragmentOne() {
        Fragment fragment = new Fragment1();
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.fr_sale, fragment);
        ft.commit();
    }
    private void launchFragmentTwo() {
        Fragment fragment = new Fragment2();
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.fr_sale, fragment);
        ft.commit();
    }
    private void launchFragmentThree() {
        Fragment fragment = new Fragment3();
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.fr_sale, fragment);
        ft.commit();
    }
    private void launchFragmentFour() {
        Fragment fragment = new Fragment4();
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.fr_sale, fragment);
        ft.commit();
    }
}







//
//package com.example.proect;
//
//import androidx.annotation.NonNull;
//import androidx.appcompat.app.AppCompatActivity;
//import androidx.fragment.app.Fragment;
//import androidx.fragment.app.FragmentManager;
//import androidx.fragment.app.FragmentTransaction;
//
//import android.os.Bundle;
//import android.view.MenuItem;
//import android.view.View;
//
//import com.google.android.material.bottomnavigation.BottomNavigationView;
//import com.google.android.material.navigation.NavigationBarView;
//
//public class MainActivity3 extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main3);
//        BottomNavigationView bnv = findViewById(R.id.bottomNavigation);
//        bnv.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
//            @Override
//            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
//                switch (item.getItemId()) {
//                    case R.id.button5:
//                        launchFragmentOne();
//                        break;
//                    case R.id.button6:
//                        launchFragmentTwo();
//                        break;
//                    case R.id.button7:
//                        launchFragmentThree();
//                        break;
//                    case R.id.button8:
//                        launchFragmentFour();
//                        break;
//                }
//                return true;
//            }
//        });
//
//    }
//
//    private void launchFragmentOne() {
//        Fragment fragment = new Fragment1();
//        FragmentManager fm = getSupportFragmentManager();
//        FragmentTransaction ft = fm.beginTransaction();
//        ft.replace(R.id.fr_sale, fragment);
//        ft.commit();
//    }
//
//    private void launchFragmentTwo() {
//        Fragment fragment = new Fragment2();
//        FragmentManager fm = getSupportFragmentManager();
//        FragmentTransaction ft = fm.beginTransaction();
//        ft.replace(R.id.fr_sale, fragment);
//        ft.commit();
//    }
//
//    private void launchFragmentThree() {
//        Fragment fragment = new Fragment3();
//        FragmentManager fm = getSupportFragmentManager();
//        FragmentTransaction ft = fm.beginTransaction();
//        ft.replace(R.id.fr_sale, fragment);
//        ft.commit();
//    }
//
//    private void launchFragmentFour() {
//        Fragment fragment = new Fragment4();
//        FragmentManager fm = getSupportFragmentManager();
//        FragmentTransaction ft = fm.beginTransaction();
//        ft.replace(R.id.fr_sale, fragment);
//        ft.commit();
//    }
//}
////    public void onClick2(View view) {
////        Fragment fragment = null;
////
////        switch (view.getId()) {
////            case R.id.button5:
////                fragment = new Fragment1();
////                break;
////            case R.id.button6:
////                fragment = new Fragment2();
////                break;
////            case R.id.button7:
////                fragment = new Fragment3();
////                break;
////            case R.id.button8:
////                fragment = new Fragment4();
////                break;
////
////        }
////        FragmentManager fm = getSupportFragmentManager();
////        FragmentTransaction ft = fm.beginTransaction();
////        ft.replace(R.id.fr_sale, fragment);
////        ft.commit();
////    }
////}