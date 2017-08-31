package com.i053113.bottonnavigation;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//establecer cualquier componente //
        BottomNavigationView bnv =(BottomNavigationView) findViewById(R.id.bnv_1);

        //evento//
        //ami componente establezca(set) un /

        bnv.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                // progamacion de lo que va  hacer el botot/

                //  obtener (get)al metodo le pase el id del cual fue presionado /
                switch (item.getItemId()){
                    // para el primer caso a donde van a saltar cuando de clic en el icono //
                    case R.id.item_1:
                        //crear un objeto nuevo//
                        UnoFragment pantalla1 = new UnoFragment();
                        //vincular panatllas dentro de un layout//
                        getSupportFragmentManager()
                                //para habrir el proceso//
                                .beginTransaction()
                                // que al frame layout le coloque la pantalla creada//
                                .replace(R.id.fl_1, pantalla1)
                                // para que apareca el efecto //
                                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                                // es para que quite lo que tenia antes//
                                .addToBackStack(null)
                                //actualizar los datos//
                                .commit();

                        //el resive tres parametros  1 en donde lo va a poner  - 2 el mensaje que va a mostrar - 3 animacion o efecto que aplica andorid
                        Toast.makeText(MainActivity.this, "Item 1", Toast.LENGTH_SHORT).show();
                        //salto/
                        break;

                    case R.id.item_2:
                        Toast.makeText(MainActivity.this, "Item 2", Toast.LENGTH_SHORT).show();
                        break;

                    case R.id.item_3:
                        Toast.makeText(MainActivity.this, "Item 3", Toast.LENGTH_SHORT).show();
                        break;


                }
                return false;
            }
        });


    }
}
