package thread;

import javax.swing.JOptionPane;

public class aThread {

	public static void main(String[] args) throws InterruptedException {

		
		Thread threadEmail = new Thread(thread1);
		threadEmail.start();

		
		Thread threadNotaFiscal = new Thread(thread2);
		threadNotaFiscal.start();

		JOptionPane.showMessageDialog(null, "Sistema continua executando para o usuario");

	}

	private static Runnable thread1 = new Runnable() {

		@Override
		public void run() {

			

			for (int pos = 0; pos < 10; pos++) {

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
				System.out.println("Executando algo rotina, exemplo envio de email");

			}
			System.out.println("Chegou ao fim da thread e ja saiu do laço for");

		}
	};

	private static Runnable thread2 = new Runnable() {

		@Override
		public void run() {
			

			for (int pos = 0; pos < 10; pos++) {

				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Executando algo rotina, exemplo envio de nota fiscal");

			}
			System.out.println("Chegou ao fim da thread e ja saiu do laço for");
		};

	};

}
