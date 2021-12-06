package simple.example.hewanpedia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton btnSinga,btnMacan,btnHarimau;
    Button btnTentangKami;
    public static final String JENIS_GALERI_KEY = "JENIS_GALERI";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inisialisasiView();
    }

    private void inisialisasiView() {
        btnSinga = findViewById(R.id.btn_buka_ras_anjing);
        btnMacan = findViewById(R.id.btn_buka_ras_kucing);
        btnHarimau = findViewById(R.id.btn_buka_ras_burung);
        btnTentangKami = findViewById(R.id.btn_profil);
        btnSinga.setOnClickListener(view -> bukaGaleri("Anjing"));
        btnMacan.setOnClickListener(view -> bukaGaleri("Kucing"));
        btnHarimau.setOnClickListener(view -> bukaGaleri("Burung"));
        btnTentangKami.setOnClickListener(view -> onClick(btnTentangKami));
    }

    private void bukaGaleri(String jenisHewan) {
        Log.d("MAIN","Buka activity singa");
        Intent intent = new Intent(this, DaftarHewanActivity.class);
        intent.putExtra(JENIS_GALERI_KEY, jenisHewan);
        startActivity(intent);
    }

    public void onClick(View v) {
        Intent intent = new Intent(MainActivity.this, TentangActivity.class);
        startActivity(intent);
    }

    public void tentang_profil_kami(View view) {
    }
}