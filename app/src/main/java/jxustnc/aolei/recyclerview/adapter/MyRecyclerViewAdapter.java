package jxustnc.aolei.recyclerview.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import jxustnc.aolei.recyclerview.activity.R;

/**
 * 作者：aolei on 2016/4/28 20:52
 * 邮箱：807648567@qq.com
 * 解释权：敖磊
 */
public class MyRecyclerViewAdapter extends RecyclerView.Adapter<MyRecyclerViewAdapter.MyViewHolder>{
    private Context mContext;
    private List<String> mList;
    public MyRecyclerViewAdapter(Context mContext,List<String> list){
        this.mContext = mContext;
        this.mList = list;
    }

    @Override
    public MyRecyclerViewAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        MyViewHolder viewHolder = new MyViewHolder(LayoutInflater.from(mContext).inflate(R.layout.item_layout,parent,false));
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(MyRecyclerViewAdapter.MyViewHolder holder, int position) {
        holder.mTextView.setText(mList.get(position));
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }


    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView mTextView;
         public MyViewHolder(View view){
             super(view);
            mTextView = (TextView)view.findViewById(R.id.id_item);
        }
    }
}
