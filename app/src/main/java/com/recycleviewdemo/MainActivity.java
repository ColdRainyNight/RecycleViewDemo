package com.recycleviewdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;

    private List<News> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerview);

        //实现布局和控制器解耦
        //线性布局可以实现ListView功能，第二个参数可以设置RecyclerView的方向是横向还是纵向
        //给RecyclerView设置布局控制器默认是VERTICAL
//        LinearLayoutManager manager1 = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
//        mRecyclerView.setLayoutManager(manager1);

        //网格布局，可以实现GridView的功能，第二个参数是列数，第三个参数是设置方向
//        GridLayoutManager manager2 = new GridLayoutManager(this, 3, GridLayoutManager.HORIZONTAL, false);
//        mRecyclerView.setLayoutManager(manager2);

        //瀑布流
        StaggeredGridLayoutManager manager3 = new StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.VERTICAL);
        mRecyclerView.setLayoutManager(manager3);

        list = News.initData();
        mRecyclerView.setAdapter(new NewsAdapter(this, list));

    }
}
