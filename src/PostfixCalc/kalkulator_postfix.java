package PostfixCalc;

import java.awt.EventQueue;
import java.util.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class kalkulator_postfix extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textInput;
	private JTable table;
	String input;
	int hasil;
	JLabel lblHasil;
	JButton btnSimpan;

	List<bubbleSort.InputOutputPair> pairs = new ArrayList<>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					kalkulator_postfix frame = new kalkulator_postfix();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public kalkulator_postfix() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 698, 325);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblJudul = new JLabel("Kalkulator Postfix");
		lblJudul.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblJudul.setBounds(257, 11, 162, 43);
		contentPane.add(lblJudul);
		
		JLabel lblJudul2 = new JLabel("Input");
		lblJudul2.setBounds(10, 89, 49, 14);
		contentPane.add(lblJudul2);
		
		textInput = new JTextField();
		textInput.setBounds(69, 86, 113, 20);
		contentPane.add(textInput);
		textInput.setColumns(10);
		
		JButton btnProses = new JButton("PROSES");
		btnProses.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input = textInput.getText();
				hasil = postfix.postfixEvaluate(input);
				lblHasil.setText("Hasil : " + hasil);
				
				btnSimpan.setEnabled(true);
			}
		});
		btnProses.setBounds(55, 118, 89, 23);
		contentPane.add(btnProses);
		
		lblHasil = new JLabel("");
		lblHasil.setBounds(10, 152, 172, 20);
		contentPane.add(lblHasil);
		
		btnSimpan = new JButton("SIMPAN");
		btnSimpan.setEnabled(false);
		btnSimpan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Queue<String> qInput = new LinkedList<String>();
				Queue<Integer> qOutput = new LinkedList<Integer>();
				qInput.add(input);
				qOutput.add(hasil);
				
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				
				while(!qInput.isEmpty() && !qOutput.isEmpty()) {
					pairs.add(new bubbleSort.InputOutputPair(qInput.peek(), qOutput.peek()));
					model.addRow(new Object[] {qInput.remove(),qOutput.remove()});
				}
				
				textInput.setText(null);
				lblHasil.setText(null);
				btnSimpan.setEnabled(false);
			}
		});
		btnSimpan.setBounds(55, 195, 89, 23);
		contentPane.add(btnSimpan);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Input", "Output"},
			},
			new String[] {
				"New column", "New column"
			}
		));
		table.setBounds(228, 89, 312, 188);
		contentPane.add(table);
		
		JButton btnSort = new JButton("URUTKAN");
		btnSort.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bubbleSort.sort(pairs);
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.setRowCount(1);
				for(bubbleSort.InputOutputPair pair : pairs)
					model.addRow(new Object[] {pair.input,pair.output});
			}
		});
		btnSort.setBounds(550, 206, 123, 23);
		contentPane.add(btnSort);
		
		JButton btnReset = new JButton("RESET");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.setRowCount(1);
				
				while(!pairs.isEmpty())
					pairs.clear();
			}
		});
		btnReset.setBounds(550, 254, 123, 23);
		contentPane.add(btnReset);
	}

}
