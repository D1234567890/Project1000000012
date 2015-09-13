import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class StringChange implements ActionListener {
	JFrame frame = new JFrame("Translator");
	JPanel panel = new JPanel();
	JTextField textField = new JTextField(30);
	JTextField textField1 = new JTextField(30);
	JButton button = new JButton("Translate");

	public static void main(String[] args) {
		StringChange b = new StringChange();
	}

	StringChange() {
		frame.setVisible(true);
		frame.setSize(1900, 1000);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		panel.add(textField);
		panel.add(textField1);
		panel.add(button);
		button.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == button) {
			String va = textField.getText();
			if (va.equalsIgnoreCase("hello")) {
				textField1.setText("rintau");
			}
			if (va.equalsIgnoreCase("how")) {
				textField1.setText("natkun");
			}
			if (va.equalsIgnoreCase("cookie")) {
				textField1.setText("halka");
			}
			if (va.equalsIgnoreCase("taste")) {
				textField1.setText("finelit");
			}
			if (va.equalsIgnoreCase("stuff")) {
				textField1.setText("rantunk");
			}
			if (va.equalsIgnoreCase("good")) {
				textField1.setText("lor");
			}
			if (va.equalsIgnoreCase("bad")) {
				textField1.setText("orat");
			}
			if (va.equalsIgnoreCase("house")) {
				textField1.setText("nintle");
			}
			if (va.equalsIgnoreCase("here")) {
				textField1.setText("jort");
			}
			if (va.equalsIgnoreCase("list")) {
				textField1.setText("hantan");
			}
			if (va.equalsIgnoreCase("there")) {
				textField1.setText("borhorhor");
			}
			if (va.equalsIgnoreCase("my")) {
				textField1.setText("ornton");
			}
			if (va.equalsIgnoreCase("lick")) {
				textField1.setText("forra");
			}
			if (va.equalsIgnoreCase("thick")) {
				textField1.setText("limk");
			}
			if (va.equalsIgnoreCase("computer")) {
				textField1.setText("romp");
			}
			if (va.equalsIgnoreCase("hut")) {
				textField1.setText("ninnn");
			}
			if (va.equalsIgnoreCase("close")) {
				textField1.setText("gorse");
			}
			if (va.equalsIgnoreCase("open")) {
				textField1.setText("lorse");
			}
			if (va.equalsIgnoreCase("horse")) {
				textField1.setText("farkki");
			}
			if (va.equalsIgnoreCase("eye")) {
				textField1.setText("li");
			}
			if (va.equalsIgnoreCase("eyes")) {
				textField1.setText("ginton");
			}
			if (va.equalsIgnoreCase("houses")) {
				textField1.setText("rintago");
			}
			if (va.equalsIgnoreCase("what")) {
				textField1.setText("jimk");
			}
			if (va.equalsIgnoreCase("time")) {
				textField1.setText("heme");
			}
			if (va.equalsIgnoreCase("city")) {
				textField1.setText("nimpklist");
			}
			if (va.equalsIgnoreCase("variable")) {
				textField1.setText("horts");
			}
			if (va.equalsIgnoreCase("cities")) {
				textField1.setText("niiy");
			}
			if (va.equalsIgnoreCase("variables")) {
				textField1.setText("harri");
			}
			if (va.equalsIgnoreCase("ate")) {
				textField1.setText("orka");
			}
			if (va.equalsIgnoreCase("eat")) {
				textField1.setText("leet");
			}
			if (va.equalsIgnoreCase("feet")) {
				textField1.setText("porton");
			}
			if (va.equalsIgnoreCase("foot")) {
				textField1.setText("keepalo");
			}
			if (va.equalsIgnoreCase("loot")) {
				textField1.setText("norae");
			}
			if (va.equalsIgnoreCase("hoop")) {
				textField1.setText("zinkle");
			}
			if (va.equalsIgnoreCase("leg")) {
				textField1.setText("boreskon");
			}
			if (va.equalsIgnoreCase("legs")) {
				textField1.setText("mik");
			}
			if (va.equalsIgnoreCase("mine")) {
				textField1.setText("fes");
			}
			if (va.equalsIgnoreCase("name")) {
				textField1.setText("horrast");
			}
			if (va.equalsIgnoreCase("ever")) {
				textField1.setText("limports");
			}
			if (va.equalsIgnoreCase("never")) {
				textField1.setText("homp");
			}
			if (va.equalsIgnoreCase("drive")) {
				textField1.setText("jinkle");
			}
			if (va.equalsIgnoreCase("bee")) {
				textField1.setText("gortson");
			}
			if (va.equalsIgnoreCase("hive")) {
				textField1.setText("fomp");
			}
			if (va.equalsIgnoreCase("kite")) {
				textField1.setText("horlapo");
			}
			if (va.equalsIgnoreCase("kites")) {
				textField1.setText("mempo");
			}
			if (va.equalsIgnoreCase("hives")) {
				textField1.setText("korrintoga");
			}
			if (va.equalsIgnoreCase("bees")) {
				textField1.setText("beee");
			}
			if (va.equalsIgnoreCase("live")) {
				textField1.setText("nimpogal");
			}
			if (va.equalsIgnoreCase("lives")) {
				textField1.setText("norton");
			}
			if (va.equalsIgnoreCase("sound")) {
				textField1.setText("korton");
			}
			if (va.equalsIgnoreCase("sounds")) {
				textField1.setText("kortonnnngatsgola");
			}
			if (va.equalsIgnoreCase("mouse")) {
				textField1.setText("horpson");
			}
			if (va.equalsIgnoreCase("mice")) {
				textField1.setText("lintago");
			}
			if (va.equalsIgnoreCase("pillar")) {
				textField1.setText("nillar");
			}
			if (va.equalsIgnoreCase("door")) {
				textField1.setText("fokson");
			}
			if (va.equalsIgnoreCase("soil")) {
				textField1.setText("morpson");
			}
			if (va.equalsIgnoreCase("block")) {
				textField1.setText("halpse");
			}
			if (va.equalsIgnoreCase("mice")) {
				textField1.setText("kerrae");
			}
			if (va.equalsIgnoreCase("chair")) {
				textField1.setText("forrado");
			}
			if (va.equalsIgnoreCase("bench")) {
				textField1.setText("limpstones");
			}
			if (va.equalsIgnoreCase("string")) {
				textField1.setText("fibako");
			}
			if (va.equalsIgnoreCase("label")) {
				textField1.setText("horpal");
			}
			if (va.equalsIgnoreCase("entire")) {
				textField1.setText("nortsonkal");
			}
			if (va.equalsIgnoreCase("for")) {
				textField1.setText("vorra");
			}
			if (va.equalsIgnoreCase("liquids")) {
				textField1.setText("himp");
			}
			if (va.equalsIgnoreCase("lava")) {
				textField1.setText("bosongal");
			}
			if (va.equalsIgnoreCase("water")) {
				textField1.setText("foy");
			}
			if (va.equalsIgnoreCase("milk")) {
				textField1.setText("noy");
			}
			if (va.equalsIgnoreCase("ethane")) {
				textField1.setText("alakal");
			}
			if (va.equalsIgnoreCase("nitrogen")) {
				textField1.setText("alakel");
			}
			if (va.equalsIgnoreCase("oxegen")) {
				textField1.setText("alakul");
			}
			if (va.equalsIgnoreCase("argon")) {
				textField1.setText("alakol");
			}
			if (va.equalsIgnoreCase("far")) {
				textField1.setText("nimpaloid");
			}
			if (va.equalsIgnoreCase("bottle")) {
				textField1.setText("nalk");
			}
			if (va.equalsIgnoreCase("bottles")) {
				textField1.setText("berri");
			}
			if (va.equalsIgnoreCase("keyboards")) {
				textField1.setText("leepods");
			}
			if (va.equalsIgnoreCase("waters")) {
				textField1.setText("hornta");
			}
			if (va.equalsIgnoreCase("keyboard")) {
				textField1.setText("helksa");
			}
			if (va.equalsIgnoreCase("sticky")) {
				textField1.setText("milkado");
			}
			if (va.equalsIgnoreCase("note")) {
				textField1.setText("forkosam");
			}
			if (va.equalsIgnoreCase("go")) {
				textField1.setText("lom");
			}
			if (va.equalsIgnoreCase("piece")) {
				textField1.setText("fir");
			}
			if (va.equalsIgnoreCase("peace")) {
				textField1.setText("fer");
			}
			if (va.equalsIgnoreCase("check")) {
				textField1.setText("gemtalo");
			}
			if (va.equalsIgnoreCase("present")) {
				textField1.setText("holkanovants");
			}
		}
	}
}
