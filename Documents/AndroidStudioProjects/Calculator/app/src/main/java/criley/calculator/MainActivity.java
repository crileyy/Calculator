package criley.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

  private int output = 0;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
  }

  public void clear(View view) {
    TextView display = (TextView) findViewById(R.id.answer);
    this.output = 0;
    display.setText("");
  }

  public void negative(View view) {
    TextView display = (TextView) findViewById(R.id.answer);

    display.setText("");
  }

  public void percent(View view) {
    TextView display = (TextView) findViewById(R.id.answer);

    display.setText("");
  }

  public void divide(View view) {
    TextView display = (TextView) findViewById(R.id.answer);

    display.setText("");
  }

  public void numSeven(View view) {
    TextView display = (TextView) findViewById(R.id.answer);

    display.setText("");
  }

  public void numEight(View view) {
    TextView display = (TextView) findViewById(R.id.answer);

    display.setText("");
  }

  public void numNine(View view) {
    TextView display = (TextView) findViewById(R.id.answer);

    display.setText("");
  }

  public void multiply(View view) {
    TextView display = (TextView) findViewById(R.id.answer);

    display.setText("");
  }

  public void numFour(View view) {
    TextView display = (TextView) findViewById(R.id.answer);

    display.setText("");
  }

  public void numFive(View view) {
    TextView display = (TextView) findViewById(R.id.answer);

    display.setText("");
  }

  public void numSix(View view) {
    TextView display = (TextView) findViewById(R.id.answer);

    display.setText("");
  }

  public void subtract(View view) {
    TextView display = (TextView) findViewById(R.id.answer);

    display.setText("");
  }

  public void numOne(View view) {
    TextView display = (TextView) findViewById(R.id.answer);

    display.setText("");
  }

  public void numTwo(View view) {
    TextView display = (TextView) findViewById(R.id.answer);

    display.setText("");
  }

  public void numThree(View view) {
    TextView display = (TextView) findViewById(R.id.answer);

    display.setText("");
  }

  public void addition(View view) {
    TextView display = (TextView) findViewById(R.id.answer);

    display.setText("");
  }

  public void numZero(View view) {
    TextView display = (TextView) findViewById(R.id.answer);

    display.setText("");
  }

  public void addDecimal(View view) {
    TextView display = (TextView) findViewById(R.id.answer);

    display.setText("");
  }

  public void equals(View view) {
    TextView display = (TextView) findViewById(R.id.answer);

    display.setText("");
  }
}
