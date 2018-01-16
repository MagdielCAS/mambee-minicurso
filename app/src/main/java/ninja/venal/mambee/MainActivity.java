package ninja.venal.mambee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView container;
    private Adaptador adaptador;
    private List<ModeloItem> dados;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dados = new ArrayList<>();

        dados.add(new ModeloItem("(99) 9999 9999"));
        dados.add(new ModeloItem("(99) 9991 9999"));
        dados.add(new ModeloItem("(99) 9992 9999"));
        dados.add(new ModeloItem("(99) 9993 9999"));
        dados.add(new ModeloItem("(99) 9994 9999"));
        dados.add(new ModeloItem("(99) 9994 9999"));

        adaptador = new Adaptador(dados,this);

        container = findViewById(R.id.container);
        container.setHasFixedSize(true);
        container.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        container.setAdapter(adaptador);

    }

}
