package criley.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
  }

  public void clear(View view) {
    TextView output = (TextView) findViewById(R.id.answer);

    output.setText("");
  }

  public void negative(View view) {

  }

  public void percent(View view) {
  }

  public void divide(View view) {
  }

  public void numSeven(View view) {
  }

  public void numEight(View view) {
  }

  public void numNine(View view) {
  }

  public void multiply(View view) {
  }

  public void numFour(View view) {
  }

  public void numFive(View view) {
  }

  public void numSix(View view) {
  }

  public void subtract(View view) {
  }

  public void numOne(View view) {
  }

  public void numTwo(View view) {
  }

  public void numThree(View view) {
  }

  public void addition(View view) {
  }

  public void numZero(View view) {
  }

  public void addDecimal(View view) {
  }

  public void equals(View view) {
  }
}
