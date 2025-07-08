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
        }
