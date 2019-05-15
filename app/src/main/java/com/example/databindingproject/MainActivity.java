package com.example.databindingproject;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.databindingproject.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /**
         * 默认情况下，databinding会根据layout文件的名字生成一个binding class。
         * 比如如果布局文件是main_activity.xml，就会生成一个MainActivityBinding的class。
         *
         * MainActivityBinding知道布局文件中所有的View属性以及他们的绑定关系（比如上文中的User），
         * 还有如何通过binding表达式对他们进行赋值
         *
         * */
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        User user = new User("Test", "User");//数据绑定
        binding.setUser(user);
    }
}
