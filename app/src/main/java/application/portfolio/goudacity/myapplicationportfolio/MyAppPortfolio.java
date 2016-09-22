package application.portfolio.goudacity.myapplicationportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MyAppPortfolio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_app_portfolio);
    }

    /**
     * Launching application based on view clicked.
     *
     * @param view view clicked.
     */
    public void launchApplication(View view) {
        TextView textView = (TextView) view;
        String text = (String) textView.getText();
        // TODO : Launch application based on view clicked.
        switch (textView.getId()) {
            case R.id.project_p1:
                showToast(text);
                break;
            case R.id.project_p2:
                showToast(text);
                break;
            case R.id.project_p3:
                showToast(text);
                break;
            case R.id.project_p4:
                showToast(text);
                break;
            case R.id.project_p5:
                showToast(text);
                break;
            case R.id.project_p6:
                showToast(text);
                break;
        }
    }

    private void showToast(CharSequence text) {
        Toast.makeText(getApplicationContext(), text, Toast.LENGTH_SHORT).show();
    }
}
