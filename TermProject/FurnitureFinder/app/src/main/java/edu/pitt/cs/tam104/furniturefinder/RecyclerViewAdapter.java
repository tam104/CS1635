package edu.pitt.cs.tam104.furniturefinder;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by BobXu on 3/21/16.
 */
public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    private final LayoutInflater inflater;
    //private final Context myContext;
    private String[] titles;

    public RecyclerViewAdapter(Context context) {
        //titles = context.getResources().getStringArray(R.array.titles);
        inflater = LayoutInflater.from(context);
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.listed_item, parent, false);
        MyViewHolder holder = new MyViewHolder(view);
        return null;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class MyViewHolder extends RecyclerView.ViewHolder{
        TextView title;
        ImageView image;
        TextView text;
        public MyViewHolder(View itemView) {
            super(itemView);
            title = (TextView) itemView.findViewById(R.id.itemTitle);
            image = (ImageView) itemView.findViewById(R.id.itemPic);
            text = (TextView) itemView.findViewById(R.id.itemText);
        }
    }
}
