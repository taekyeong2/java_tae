package test4;

public class Test4 {
	public static void main(String[] args) {
		String[] arr = { "010102-4", "991012-1", "960304-1", "881012-2", "040403-3" };
		int man = 0;
		int woman = 0;

		for (String person : arr) {
			char sex = person.charAt(7);
			switch (sex) {
			case '1':
			case '3':
				man++;
				break;
			case '2':
			case '4':
				woman++;
				break;
			}
		}

		System.out.println("남 " + man + " 여 " + woman);
	}
}
