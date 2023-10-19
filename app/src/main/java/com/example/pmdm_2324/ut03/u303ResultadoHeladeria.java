    package com.example.pmdm_2324.ut03;
    import static com.example.pmdm_2324.ut03.u303Heladeria.CHOCOLATE;
    import static com.example.pmdm_2324.ut03.u303Heladeria.FRESA;
    import static com.example.pmdm_2324.ut03.u303Heladeria.TIPOTARRINA;
    import static com.example.pmdm_2324.ut03.u303Heladeria.VAINILLA;

    import androidx.appcompat.app.AppCompatActivity;

    import android.graphics.Color;
    import android.os.Bundle;
    import android.text.SpannableString;
    import android.text.SpannableStringBuilder;
    import android.text.style.ForegroundColorSpan;
    import android.util.Log;
    import android.widget.TextView;

    import com.example.pmdm_2324.R;

    public class u303ResultadoHeladeria extends AppCompatActivity {

        TextView resumen;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_u303_resultado_heladeria);
            resumen = findViewById(R.id.u303ResultadoHelado);
            String vainilla = getIntent().getStringExtra(VAINILLA);
            String chocolate = getIntent().getStringExtra(CHOCOLATE);
            String fresa = getIntent().getStringExtra(FRESA);
            String tipo = getIntent().getStringExtra(TIPOTARRINA);

            // Procesar y mostrar los sabores
            procesarSabor(vainilla, tipo, Color.YELLOW);
            procesarSabor(chocolate, tipo, Color.rgb(128, 64, 0));
            procesarSabor(fresa, tipo, Color.rgb(252, 90, 141));
        }

        public void procesarSabor(String sabor, String tipo, int color) {
            if (sabor != null) {
                int cantidad = Integer.parseInt(sabor);
                if (cantidad > 0) {
                    SpannableStringBuilder builder = new SpannableStringBuilder();
                    String saborString = queTipoSoy(tipo);
                    for (int i = 1; i <= cantidad; i++) {
                        builder.append(saborDelColor(saborString, color, tipo));
                    }
                    resumen.append(builder);
                }
            }
        }

        public String queTipoSoy(String tipo) {
            String cadena = "";
            if (tipo.equals("Cucurucho")) {
                return cadena = "\nV\n";
            } else if (tipo.equals("Cucurucho_de_chocolate")) {
                return cadena = "\nV\n";
            } else if (tipo.equals("Tarrina")) {
                return cadena = "\nU\n";
            }
            return "";
        }

        public SpannableString saborDelColor(String sabor, int color, String tipo) {
            SpannableString spannableString = new SpannableString("() " + sabor);
            ForegroundColorSpan colorSpan = new ForegroundColorSpan(color);
            spannableString.setSpan(colorSpan, 0, 3, SpannableString.SPAN_EXCLUSIVE_EXCLUSIVE);
            return spannableString;
        }

    }
