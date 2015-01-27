package edu.washington.ttulga.lifecounter;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.app.Activity;
import android.widget.Button;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {
    private int p1 = 20;
    private int p2 = 20;
    private int p3 = 20;
    private int p4 = 20;
    private String losers = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView p1Life = (TextView) findViewById(R.id.player1);
        final Button p1plus1 = (Button) findViewById(R.id.p1plus1);
        final Button p1min1 = (Button) findViewById(R.id.p1minus1);
        final Button p1plus5 = (Button) findViewById(R.id.p1plus5);
        final Button p1min5 = (Button) findViewById(R.id.p1minus5);

        final TextView p2Life = (TextView) findViewById(R.id.player2);
        final Button p2plus1 = (Button) findViewById(R.id.p2plus1);
        final Button p2min1 = (Button) findViewById(R.id.p2minus1);
        final Button p2plus5 = (Button) findViewById(R.id.p2plus5);
        final Button p2min5 = (Button) findViewById(R.id.p2minus5);

        final TextView p3Life = (TextView) findViewById(R.id.player3);
        final Button p3plus1 = (Button) findViewById(R.id.p3plus1);
        final Button p3min1 = (Button) findViewById(R.id.p3minus1);
        final Button p3plus5 = (Button) findViewById(R.id.p3plus5);
        final Button p3min5 = (Button) findViewById(R.id.p3minus5);

        final TextView p4Life = (TextView) findViewById(R.id.player4);
        final Button p4plus1 = (Button) findViewById(R.id.p4plus1);
        final Button p4min1 = (Button) findViewById(R.id.p4minus1);
        final Button p4plus5 = (Button) findViewById(R.id.p4plus5);
        final Button p4min5 = (Button) findViewById(R.id.p4minus5);

        final TextView losersList = (TextView) findViewById(R.id.losers);

        // Player 1 plus 1
        p1plus1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
               if (p1 > 0) {
                    p1++;
                    p1Life.setText("Player 1: " + p1);
                }
            }
        });

        // Player 1 minus 1
        p1min1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
               if (p1 > 0) {
                    p1--;
                    p1Life.setText("Player 1: " + p1);
                } if (p1 <= 0) {
                    losersList.setText(losers + " Player 1 LOSES!");
                    losers = "" + losersList.getText();
                    p1plus1.setEnabled(false);
                    p1min1.setEnabled(false);
                    p1plus5.setEnabled(false);
                    p1min5.setEnabled(false);
                }
            }
        });

        // Player 1 plus 5
        p1plus5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (p1 > 0) {
                    p1+=5;
                    p1Life.setText("Player 1: " + p1);
                }
            }
        });

        // Player 1 minus 5
        p1min5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
               if (p1 > 0) {
                    p1-=5;
                    p1Life.setText("Player 1: " + p1);
                } if (p1 <= 0) {
                    losersList.setText(losers + " Player 1 LOSES!");
                    losers = "" + losersList.getText();
                    p1plus1.setEnabled(false);
                    p1min1.setEnabled(false);
                    p1plus5.setEnabled(false);
                    p1min5.setEnabled(false);
                }
            }
        });

        // Player 2 plus 1
        p2plus1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
               if (p2 > 0) {
                    p2++;
                    p2Life.setText("Player 2: " + p2);
                }
            }
        });

        // Player 2 minus 1
        p2min1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (p2 > 0) {
                    p2--;
                    p2Life.setText("Player 2: " + p2);
                } if (p2 <= 0) {
                    losersList.setText(losers + " Player 2 LOSES!");
                    losers = "" + losersList.getText();
                    p2plus1.setEnabled(false);
                    p2min1.setEnabled(false);
                    p2plus5.setEnabled(false);
                    p2min5.setEnabled(false);
                }
            }
        });

        // Player 2 plus 5
        p2plus5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
               if (p2 > 0) {
                    p2+=5;
                    p2Life.setText("Player 2: " + p2);
                }
            }
        });

        // Player 2 minus 5
        p2min5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (p2 > 0) {
                    p2-=5;
                    p2Life.setText("Player 2: " + p2);
                } if (p2 <= 0) {
                    losersList.setText(losers + " Player 2 LOSES!");
                    losers = "" + losersList.getText();
                    p2plus1.setEnabled(false);
                    p2min1.setEnabled(false);
                    p2plus5.setEnabled(false);
                    p2min5.setEnabled(false);
                }
            }
        });

        // Player 3 plus 1
        p3plus1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (p3 > 0) {
                    p3++;
                    p3Life.setText("Player 3: " + p3);
                }
            }
        });

        // Player 3 minus 1
        p3min1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (p3 > 0) {
                    p3--;
                    p3Life.setText("Player 3: " + p3);
                } if (p3 <= 0) {
                    losersList.setText(losers + " Player 3 LOSES!");
                    losers = "" + losersList.getText();
                    p3plus1.setEnabled(false);
                    p3min1.setEnabled(false);
                    p3plus5.setEnabled(false);
                    p3min5.setEnabled(false);
                }
            }
        });

        // Player 3 plus 5
        p3plus5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (p3 > 0) {
                    p3+=5;
                    p3Life.setText("Player 3: " + p3);
                }
            }
        });

        // Player 3 minus 5
        p3min5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (p3 > 0) {
                    p3-=5;
                    p3Life.setText("Player 3: " + p3);
                } if (p3 <= 0) {
                    losersList.setText(losers + " Player 3 LOSES!");
                    losers = "" + losersList.getText();
                    p3plus1.setEnabled(false);
                    p3min1.setEnabled(false);
                    p3plus5.setEnabled(false);
                    p3min5.setEnabled(false);
                }
            }
        });

        // Player 4 plus 1
        p4plus1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (p4 > 0) {
                    p4++;
                    p4Life.setText("Player 4: " + p4);
                }
            }
        });

        // Player 4 minus 1
        p4min1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (p4 > 0) {
                    p4--;
                    p4Life.setText("Player 4: " + p4);
                } if (p4 <= 0) {
                    losersList.setText(losers + " Player 4 LOSES!");
                    losers = "" + losersList.getText();
                    p4plus1.setEnabled(false);
                    p4min1.setEnabled(false);
                    p4plus5.setEnabled(false);
                    p4min5.setEnabled(false);
                }
            }
        });

        // Player 4 plus 5
        p4plus5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (p4 > 0) {
                    p4+=5;
                    p4Life.setText("Player 4: " + p4);
                }
            }
        });

        // Player 4 minus 5
        p4min5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (p4 > 0) {
                    p4-=5;
                    p4Life.setText("Player 4: " + p4);
                } if (p4 <= 0) {
                    losersList.setText(losers + " Player 4 LOSES!");
                    losers = "" + losersList.getText();
                    p4plus1.setEnabled(false);
                    p4min1.setEnabled(false);
                    p4plus5.setEnabled(false);
                    p4min5.setEnabled(false);
                }
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
