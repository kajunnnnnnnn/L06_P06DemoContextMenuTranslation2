package sg.edu.rp.c346.id20026955.democontextmenutranslation2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvHello;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvHello = findViewById(R.id.tvHello);

        registerForContextMenu(tvHello);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v,
                                    ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        getMenuInflater().inflate(R.menu.menu_item, menu);


    }
    @Override
    public boolean onContextItemSelected(MenuItem item) {

        if(item.getItemId() == R.id.EnglishSelection) { //check whether the selected menu item ID is 0
            //code for action
//            Toast.makeText(MainActivity.this, "English is chosen", Toast.LENGTH_SHORT).show();
            tvHello.setText("Hello");
            return true; //menu item successfully handled
        }
        else if(item.getItemId()== R.id.ItalianSelection) { //check if the selected menu item ID is 1
            //code for action
//            Toast.makeText(MainActivity.this, "Italian is chosen", Toast.LENGTH_SHORT).show();
            tvHello.setText("Ciao");
            return true;  //menu item successfully handled
        }

        return super.onContextItemSelected(item);
    }

}