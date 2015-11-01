import javax.swing.JOptionPane;

public class MethodTests {
	float a = (float) 67.52;
	float b = (float) 42.63;
	int hh = 6;
	String gh = "red";
	int qq = 442;
	float q = (float) 78.3;
	int yu = 7;
	int re = 5;
	int lup = 7;
	String hulpa = "Adrian";
	String hj = "Hello";
	String hios = "blah";
	int bov = 3;

	public static void main(String[] args) {
		MethodTests m = new MethodTests();
	}

	MethodTests() {
		//System.out.println(floadive(a, b));
		//System.out.println(addByTen(hh));
		//System.out.println(color(gh));
		System.out.println(intafloat(qq, q));
		//System.out.println(threeInts(yu, re, lup));
		//useless();
		//System.out.println(exclomationalizeristic(hj));
		//decider(hios, bov);
	}

	float floadive(float a, float b) {
		return a / b;
	}

	int addByTen(int hh) {
		return hh + 10;
	}

	String color(String gh) {
		return "I like " + gh + " too!";
	}

	float intafloat(int qq, float q) {
		return qq - q;
	}

	int threeInts(int yu, int re, int lup) {
		return yu + re + lup;
	}

	void useless() {
		for (int uiop = 1; uiop <= 25; uiop++) {
			System.out.println(hulpa);
		}
	}

	String exclomationalizeristic(String hj) {
		return hj + "!";
	}

	void decider(String hios, int bov) {
		if (bov > hios.length()) {
			System.out.println(bov);
		} else {
			System.out.println("Too Low!!!!!!!!!!");
		}
	}
}
