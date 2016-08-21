package com.example.israeelbr.recetasc;

    import android.app.Activity;
    import android.content.Intent;
    import android.os.Bundle;
    import android.os.Handler;

    /**
     * Created by Israel on 23/06/2016.
     */
    public class SplashActivity extends Activity {

        // Temporizador para la pantalla de bienvenida
        private static int SPLASH_TIEMPO = 3000;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.layout_splash_screen);

            new Handler().postDelayed(new Runnable() {

			/*
			* Mostramos la pantalla de bienvenida con un temporizador.
			* De esta forma se puede mostrar el logo de la app o
			* compañia durante unos segundos.
			*/

                @Override
                public void run() {
                    // Este método se ejecuta cuando se consume el tiempo del temporizador.
                    // Se pasa a la activity principal
                    Intent i = new Intent(SplashActivity.this, MainActivity.class);
                    startActivity(i);

                    // Cerramos esta activity
                    finish();
                }
            }, SPLASH_TIEMPO);
        }
    }

