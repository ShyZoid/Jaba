package Calorie_Calculator;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class CalorieCalculator_main extends JFrame{
	private static String massage = "";
	String[] first_dishes = {"Солянка", "Уха", "Борщ", "Щи", "Луковый суп"};
	String[] second_dishes = {"Вареники", "Рис с курицей", "Хинкали", "Паста с помидорами"};
	String[] salat_dishes = {"Цезарь", "Греческий", "Винегрет"};
	String[][] all_dishes = {{"Солянка", "216"}, {"Уха", "104"}, {"Борщ", "90"}, {"Щи", "84"}, {"Луковый суп", "164"},
			{"Вареники", "164"}, {"Рис с курицей", "211"}, {"Хинкали", "234"}, {"Паста с помидорами", "183"},
			{"Цезарь", "303"}, {"Греческий", "188"}, {"Винегрет", "130"}};
	private JButton button = new JButton("Выбрать");
	private JLabel name = new JLabel("Введите свое имя:");
	private JTextField user_name = new JTextField();
	private JLabel first_choose = new JLabel("Выберите первое блюдо:");
	private JComboBox first = new JComboBox(first_dishes);
	private JLabel second_choose = new JLabel("Выберите второе блюдо:");
	private JComboBox second = new JComboBox(second_dishes);
	private JLabel salad_choose = new JLabel("Выберите салат:");
	private JComboBox salad = new JComboBox(salat_dishes);
	
	public CalorieCalculator_main() {
		super ("Расчет калорий");
		this.setBounds(100, 100, 400, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container container = this.getContentPane();
		container.setLayout(new GridLayout(5, 2, 5, 5));
		
		container.add(name);
		container.add(user_name);
		container.add(first_choose);
		container.add(first);
		container.add(second_choose);
		container.add(second);
		container.add(salad_choose);
		container.add(salad);
		
		button.addActionListener(new ButtonEventListener());
		container.add(button);
	}
	

	class ButtonEventListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			
			massage = getName(user_name.getText());
			if (user_name.getText().isEmpty() == false) {
				int sum = 0;
				for(int i = 0; i < all_dishes.length; i++) {
					if ((String) first.getSelectedItem() == all_dishes[i][0]) {
						massage += all_dishes[i][0] + ": " + all_dishes[i][1] + "ккал\n";
						sum += Integer.parseInt(all_dishes[i][1]);
					}
					if ((String) second.getSelectedItem() == all_dishes[i][0]) {
						massage += all_dishes[i][0] + ": " + all_dishes[i][1] + "ккал\n";
						sum += Integer.parseInt(all_dishes[i][1]);
					}
					if ((String) salad.getSelectedItem() == all_dishes[i][0]) {
						massage += all_dishes[i][0] + ": " + all_dishes[i][1] + "ккал\n";
						sum += Integer.parseInt(all_dishes[i][1]);
					}
				}
				massage += "Всего калорий: " + sum + "ккал";
				}
		
			JOptionPane.showMessageDialog(null, massage, "Вывод", JOptionPane.PLAIN_MESSAGE);
			
			
		}


	}
	public static String getName(String name) {
		massage = "";
		if (name.isEmpty() == true) {
			massage += "Вы не ввели имя";
		}
		else {
			massage += "Здраствуйте " + name + "\n";
		}
		return massage;
		}
	

	public static void main(String[] args) {
		CalorieCalculator_main ap = new CalorieCalculator_main();
		ap.setVisible(true);
		}
}


 