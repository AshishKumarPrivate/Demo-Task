package com.example.demotask;

import static java.security.AccessController.getContext;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.recyclerview.widget.RecyclerView;

import com.example.demotask.databinding.CellTradingItemBinding;

import java.util.List;

public class DataListAdapter extends RecyclerView.Adapter<DataListAdapter.holder> {

    Context context;
    List<String> nameList;
    List<String> priceList;
    List<String> type;

    public DataListAdapter(Context context, List<String> nameList, List<String> priceList, List<String> type) {
        this.context = context;
        this.nameList = nameList;
        this.priceList = priceList;
        this.type = type;
    }

    @NonNull
    @Override
    public DataListAdapter.holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cell_trading_item, parent, false);
        return new DataListAdapter.holder(view);
    }

    @RequiresApi(api = Build.VERSION_CODES.P)
    @Override
    public void onBindViewHolder(@NonNull DataListAdapter.holder holder, int position) {

        holder.binding.txtName.setText(nameList.get(position));
        holder.binding.txtPrice.setText("$"+priceList.get(position));
        holder.binding.txtType.setText(type.get(position));

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                context.startActivity(new Intent(context , DetailActivity.class)
                        .putExtra("name",nameList.get(position))
                        .putExtra("price",priceList.get(position))
                        .putExtra("type",type.get(position))
                );
            }
        });



    }

    @Override
    public int getItemCount() {
        return nameList.size();
    }

    public class holder extends RecyclerView.ViewHolder {

        CellTradingItemBinding binding;
        public holder(@NonNull View itemView) {
            super(itemView);
            binding = CellTradingItemBinding.bind(itemView);
        }
    }
}
