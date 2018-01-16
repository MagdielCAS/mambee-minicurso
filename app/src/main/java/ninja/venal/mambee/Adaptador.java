package ninja.venal.mambee;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by magdiel on 16/01/18.
 */

public class Adaptador extends RecyclerView.Adapter<Adaptador.ViewHolder> {

    private List<ModeloItem> dados;
    private Context context;

    public Adaptador(List<ModeloItem> dados, Context context){
        this.dados = dados;
        this.context = context;
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(
                R.layout.cardview_item_lista, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        ModeloItem item = dados.get(position);
        holder.phone.setText(item.getPhone());
        holder.botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "Clicou "+ position, Toast.LENGTH_SHORT).show();
            }
        });
    }


    @Override
    public int getItemCount() {
        return dados.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView phone;
        Button botao;

        public ViewHolder(View itemView) {
            super(itemView);

            phone = itemView.findViewById(R.id.phone);
            botao = itemView.findViewById(R.id.btn);
        }
    }
}
