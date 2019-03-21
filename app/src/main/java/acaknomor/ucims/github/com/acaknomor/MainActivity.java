package acaknomor.ucims.github.com.acaknomor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView textView = findViewById(R.id.textView);
        Button btnAcak = findViewById(R.id.btnAcak);

        btnAcak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ArrayList data = new ArrayList();
                int getAngka = (int)(Math.random() * data.size());

                for (int i = 1; i <= 12; i++){
                    data.add(i);
                }

                MainActivity myData = new MainActivity();
                getData(data);
            }

            public void getData(ArrayList data){
                int getAngka = (int)(Math.random() * data.size());
                textView.setText("Angka " + data.get(getAngka));
            }
        });
    }




}
