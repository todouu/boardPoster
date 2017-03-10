package todou.boardposter;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //First act:
        TextView listViewItem_ver = (TextView) findViewById(R.id.get_board);
        listViewItem_ver.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick (View V){
                Intent papa = new Intent(MainActivity.this, APIActivity.class);
                startActivity(papa);
            }
        });


    }
}
