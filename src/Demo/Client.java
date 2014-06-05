package Demo;

public class Client {
	public static void main(String[] args) {
		int status = 0;
		Ice.Communicator ic = null;
		try {
			ic = Ice.Util.initialize(args);
			Ice.ObjectPrx base = ic
					.stringToProxy("TestAdapter:default -h 127.0.0.1 -p 10000");
//			Ice.ObjectPrx base = ic
//			.stringToProxy("TestAdapter:default -p 10000");

			testPrx test = testPrxHelper.checkedCast(base);
			if (test == null)
				throw new Error("Invalid proxy");
			System.out.println(test.execute("My first Ice ", "demo"));
			//System.out.println("ok");
		} catch (Ice.LocalException e) {
			e.printStackTrace();
			status = 1;
		} catch (Exception e) {
			System.err.println(e.getMessage());
			status = 1;
		}
		if (ic != null) {
			// Clean up
			//
			try {
				ic.destroy();
			} catch (Exception e) {
				System.err.println(e.getMessage());
				status = 1;
			}
		}
		System.exit(status);
	}
}