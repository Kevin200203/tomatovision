package org.tensorflow.lite.tomatovision.detection;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SolusiAdapter extends RecyclerView.Adapter<SolusiAdapter.ViewHolder> {

    private ArrayList<SolusiModel> solusiModel;

    public SolusiAdapter(ArrayList<SolusiModel> solusiModel) {
        this.solusiModel = solusiModel;
    }

    @NonNull
    @Override
    public SolusiAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_itemsolusi, parent, false);
        ViewHolder vh = new ViewHolder(view);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull SolusiAdapter.ViewHolder holder, int position) {
        holder.namaPenyakit.setText(solusiModel.get(position).getNamaPenyakit());
        holder.logoPenyakit.setImageResource(solusiModel.get(position).getLogopenyakit());

    }

    @Override
    public int getItemCount() {

        return solusiModel.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView namaPenyakit;
        ImageView logoPenyakit;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            namaPenyakit = itemView.findViewById(R.id.nama_penyakit);
            logoPenyakit = itemView.findViewById(R.id.logo_penyakit);
        }
    }
}
