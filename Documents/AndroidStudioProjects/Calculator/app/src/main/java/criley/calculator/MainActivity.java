package criley.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * Main logic for the calculator app
 */
public class MainActivity extends AppCompatActivity {
  //decimal output of the calculator
  private double output = 0;
  //string operator
  private String operation = "";

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
  }


  //number buttons needs to check if there is a valid operation, and if there is execute it
  //and change output

  /**
   * Sets the current value in the calculator to zero and resets any operations.
   *
   * @param view
   */
  public void clear(View view) {
    TextView display = (TextView) findViewById(R.id.answer);
    this.output = 0;
    this.operation = "";
    display.setText("");
  }

  public void negative(View view) {
    TextView display = (TextView) findViewById(R.id.answer);
    this.output = this.output * -1;
    display.setText(String.format("%d", this.output));
  }

  public void percent(View view) {
    TextView display = (TextView) findViewById(R.id.answer);
    this.output = this.output / 100;
    display.setText(String.format("%d", this.output));
  }

  public void divide(View view) {
    TextView display = (TextView) findViewById(R.id.answer);
    this.operation = "/";
    display.setText(display.getText() + " / ");
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
    this.operation = "+";
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
