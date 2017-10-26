package criley.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * Main logic for the calculator app
 */
public class MainActivity extends AppCompatActivity {
  private double firstNum = 0;
  private double secondNum;
  //keeps track of whether the components have been calculated yet
  //private boolean evaluated = false;
  private boolean opSet = false;
  private boolean secondSet = false;
  //decimal output of the calculator
  private double output = 0;
  //string operator
  private char operation;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
  }


  //number buttons needs to check if there is a valid operation, and if there is execute it
  //and change output

  //operation symbols will not be displayed - only the numbers

  //if you want to perform multiple operations on the calculator, e.g. 1+5*10/20+4, this calculator
  //will compute the output of the first operation, e.g. 1+5=10, when another operation key is
  //pressed
  //example interaction:
  //user: 1, +, 4 calc: 1 -> 4
  //user 1, +, 4, = calc: 1 -> 4 -> 5
  //user 1, +, 4, +, 10 = calc: 1 -> 4 -> 5 -> 10 -> 15

  //every button press call computeCalc - won't do anything if second num

  /**
   * Sets the current value in the calculator to zero and resets any operations.
   *
   * @param view
   */
  public void clear(View view) {
    TextView display = (TextView) findViewById(R.id.answer);
    this.output = 0;
    this.secondSet = false;
    this.opSet = false;
    this.firstNum = 0;
    display.setText("0");
  }

  public void negative(View view) {
    TextView display = (TextView) findViewById(R.id.answer);
    //this.output = this.output * -1;
    display.setText(String.format("%d", this.output));
  }

  public void percent(View view) {
    TextView display = (TextView) findViewById(R.id.answer);
    //this.output = this.output / 100;
    display.setText(String.format("%d", this.output));
  }

  public void divide(View view) {
    TextView display = (TextView) findViewById(R.id.answer);
    this.operation = '/';
    display.setText(display.getText());
  }

  public void numSeven(View view) {
    TextView display = (TextView) findViewById(R.id.answer);
    //if first number = 0, set it to 7
    if (!this.opSet && this.firstNum == 0) {
      this.firstNum = 7;
      display.setText(String.valueOf(this.firstNum));
      //if the operator hasn't been set yet, keep adding to first num
    } else if (!this.opSet) {
      this.firstNum = (this.firstNum * 10) + 7;
      display.setText(String.valueOf(this.firstNum));
      //if the operator has been set, add to second num
    } else if (!this.secondSet) { // second num
      this.secondNum = 7;
      this.secondSet = true;
      display.setText(String.valueOf(this.secondNum));
      //add to second number
    } else {
      this.secondNum = (this.secondNum * 10) + 7;
      display.setText(String.valueOf(this.secondNum));
    }
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

    display.setText(display + "4");
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
    this.operation = '+';
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
