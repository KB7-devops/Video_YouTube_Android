package com.example.karim_utilisateur.tdyoutube.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.karim_utilisateur.tdyoutube.R;
import com.example.karim_utilisateur.tdyoutube.models.Default;
import com.example.karim_utilisateur.tdyoutube.models.Example;
import com.example.karim_utilisateur.tdyoutube.models.Examples;
import com.example.karim_utilisateur.tdyoutube.models.Item;
import com.example.karim_utilisateur.tdyoutube.models.Items;
import com.example.karim_utilisateur.tdyoutube.viewholders.ItemsViewHolder;

import java.util.List;

/**
 * Created by Karim_Utilisateur on 20/03/2017.
 */

public class ListAdapter extends RecyclerView.Adapter<ItemsViewHolder> {
    private final List<Item> items;
   // private final List<Default> defaults;

    public ListAdapter(List<Item> items) {
        this.items = items;
    }
/*
    public ListAdapter(List<Item> items, List<Default> defaults) {
        this.items = items;
        this.defaults = defaults;
    }
*/

    @Override
    public ItemsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.viewholder_list, parent, false);
        return new ItemsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ItemsViewHolder holder, int position) {
        holder.bind(items.get(position));
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
