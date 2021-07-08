package keyone.keytwo.sendtext;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    // отправщик
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ((Button) findViewById(R.id.button)).setOnContextClickListener(v ->  {
            Intent intent = new Intent(Intent.ACTION_SEND); // действие
            String messageBody = "Приветствую всех";
            String messageSub = "Приветствие";
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_SUBJECT.messageSub);
            intent.putExtra(Intent.EXTRA_TEXT.messageBody);

            startActivity(Intent.createChooser(intent, "Отправка сообщения, выбери инструмент"));

        });
    }
}