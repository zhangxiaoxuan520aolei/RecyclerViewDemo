package jxustnc.aolei.recyclerview.activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import jxustnc.aolei.recyclerview.adapter.MyRecyclerViewAdapter;
import jxustnc.aolei.recyclerview.utils.DividerItemDecoration;


public class MainActivity extends Activity {
    private RecyclerView mRecyclerView;
    private List<String> mList;
    private MyRecyclerViewAdapter mAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initDate();
        mAdapter = new MyRecyclerViewAdapter(this,mList);
        mRecyclerView = (RecyclerView)findViewById(R.id.id_recyclerView);
        //LinearLayoutManager mLinearLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        GridLayoutManager mGridLayoutManager = new GridLayoutManager(this,4);
        //mRecyclerView.setLayoutManager(mLinearLayoutManager);
        mRecyclerView.setLayoutManager(mGridLayoutManager);
        //设置分割线
        mRecyclerView.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL_LIST));
        mRecyclerView.setAdapter(mAdapter);
    }
    protected void initDate(){
        mList = new ArrayList();
        for (int i = 'A'; i < 'z'; i++) {
            mList.add(""+(char)i);
        }
    }
}
