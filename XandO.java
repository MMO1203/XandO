import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

        public class XandO {
            ArrayList<Integer> playerOne = new ArrayList<>();
            ArrayList<Integer> playerTwo = new ArrayList<>();

            JFrame xAndO = new JFrame("Tic-Tac-Toe Game");
            JPanel myPanel = new JPanel(new GridLayout(3, 3));

            int flag = 0;

            String playerOneName = "Player 1";
            String playerTwoName = "Player 2";

            JButton btn1 = new JButton();
            JButton btn2 = new JButton();
            JButton btn3 = new JButton();
            JButton btn4 = new JButton();
            JButton btn5 = new JButton();
            JButton btn6 = new JButton();
            JButton btn7 = new JButton();
            JButton btn8 = new JButton();
            JButton btn9 = new JButton();

            void showWelcomeDialog() {
                JTextField player1Field = new JTextField();
                JTextField player2Field = new JTextField();

                JPanel inputPanel = new JPanel(new GridLayout(4, 1));
                inputPanel.add(new JLabel("Welcome to our group Tic-Tac-Toe game!"));
                inputPanel.add(new JLabel("Enter Player 1 name:"));
                inputPanel.add(player1Field);
                inputPanel.add(new JLabel("Enter Player 2 name:"));
                inputPanel.add(player2Field);

                int result = JOptionPane.showConfirmDialog(null, inputPanel, "Welcome", JOptionPane.OK_CANCEL_OPTION);

                if (result == JOptionPane.OK_OPTION) {
                    if (!player1Field.getText().trim().isEmpty()) {
                        playerOneName = player1Field.getText().trim();
                    }
                    if (!player2Field.getText().trim().isEmpty()) {
                        playerTwoName = player2Field.getText().trim();
                    }
                }
            }

                void drawGrid() {
                showWelcomeDialog();

                myPanel.removeAll();

                myPanel.add(btn1);
                myPanel.add(btn2);
                myPanel.add(btn3);
                myPanel.add(btn4);
                myPanel.add(btn5);
                myPanel.add(btn6);
                myPanel.add(btn7);
                myPanel.add(btn8);
                myPanel.add(btn9);

                addAction(btn1, 1);
                addAction(btn2, 2);
                addAction(btn3, 3);
                addAction(btn4, 4);
                addAction(btn5, 5);
                addAction(btn6, 6);
                addAction(btn7, 7);
                addAction(btn8, 8);
                addAction(btn9, 9);

                xAndO.setLayout(new BorderLayout());
                xAndO.add(myPanel, BorderLayout.CENTER);
                xAndO.setSize(400, 400);
                xAndO.setVisible(true);
                xAndO.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            }

            void addAction(JButton button, int position) {
                button.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (flag == 0) {
                            playerOne.add(position);
                            button.setText("X");
                            flag = 1;
                        } else {
                            playerTwo.add(position);
                            button.setText("O");
                            flag = 0;
                        }
                        button.setEnabled(false);
                        checkWin();
                    }
                });
            }
        }
